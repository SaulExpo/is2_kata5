package ulpgc.es.model;

public interface Image {
    byte[] name();
    Image next();
    Image prev();
}
