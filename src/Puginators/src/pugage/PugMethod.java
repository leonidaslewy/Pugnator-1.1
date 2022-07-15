package pugage;

public class PugMethod{

	public boolean pugChoice() {
		PugWindow pugButtons = new PugWindow();
		while (pugButtons.repeat) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		pugButtons.repeat = true;
		return pugButtons.answer;
	}

}
