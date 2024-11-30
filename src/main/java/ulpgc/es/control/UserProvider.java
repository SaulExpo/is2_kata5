package ulpgc.es.control;

import ulpgc.es.model.User;

import java.io.IOException;

public interface UserProvider {

    User provideNew() throws IOException;
}
