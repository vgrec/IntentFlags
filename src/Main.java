
public class Main {

	public static void main(String[] args) {
		int flags = Intents.FLAG_ACTIVITY_FORWARD_RESULT.getIntentValue() | Intents.FLAG_ACTIVITY_CLEAR_TASK.getIntentValue();
		IntentFlags.print(flags);
	}
}
