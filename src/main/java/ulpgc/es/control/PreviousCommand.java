package ulpgc.es.control;

import ulpgc.es.view.ImageDisplay;

public class PreviousCommand implements Command {
    private final ImageDisplay imageDisplay;

    public PreviousCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute() {
        imageDisplay.show(imageDisplay.image().prev());
    }
}
