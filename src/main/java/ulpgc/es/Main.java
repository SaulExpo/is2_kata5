package ulpgc.es;

import ulpgc.es.control.LoadRandomUserCommand;
import ulpgc.es.control.NextCommand;
import ulpgc.es.control.PreviousCommand;
import ulpgc.es.control.UserImageLoader;
import ulpgc.es.model.Image;
import ulpgc.es.model.User;
import ulpgc.es.view.MainFrame;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LoadRandomUserCommand command = new LoadRandomUserCommand(100);
		command.execute();
		List<byte[]> photos = new ArrayList<byte[]>();
		for (User user : command.getUsers()) {
			photos.add(user.getPhoto());
		}
		MainFrame mainFrame = new MainFrame();
		Image image = new UserImageLoader(photos).load();
		mainFrame.imageDisplay().show(image);
		mainFrame.add("<", new PreviousCommand(mainFrame.imageDisplay()))
				.add(">", new NextCommand(mainFrame.imageDisplay()));
		mainFrame.setVisible(true);

	}
}
