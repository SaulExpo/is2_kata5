package ulpgc.es.control;

import org.jsoup.Jsoup;
import ulpgc.es.model.User;

import java.io.IOException;

public class RandomUserProvider implements UserProvider {

    private static final String RANDOM_USER_URL = "https://randomuser.me/api";
    @Override
    public User provideNew() throws IOException {
        String text = Jsoup.connect(RANDOM_USER_URL).ignoreContentType(true).get().text();
    }
}
