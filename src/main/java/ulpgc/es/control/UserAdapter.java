package ulpgc.es.control;

import ulpgc.es.model.User;

public interface UserAdapter<T> {
    User adapt(T t);
}
