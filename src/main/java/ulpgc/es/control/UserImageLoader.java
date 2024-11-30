package ulpgc.es.control;

import ulpgc.es.model.Image;

import java.io.FilenameFilter;
import java.util.List;
import java.util.Set;

public class UserImageLoader implements ImageLoader{
    private final List<byte[]> images;

    public UserImageLoader(List<byte[]> images) {
        this.images = images;
    }

    private static final Set<String> imageExtensions = Set.of(".jpg", ".png");
    private static FilenameFilter isImage() {
        return (dir, name) -> imageExtensions.stream().anyMatch(name::endsWith);
    }

    @Override
    public Image load() {
        return imageAt(0);
    }

    private Image imageAt(int i) {
        return new Image() {
            @Override
            public byte[] name() {
                return images.get(i);
            }

            @Override
            public Image next() {
                return imageAt((i+1) % images.size());
            }

            @Override
            public Image prev() {
                return imageAt((i-1+ images.size()) % images.size());
            }
        };
    }
}
