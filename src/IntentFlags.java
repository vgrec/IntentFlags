public class IntentFlags {

	public static void print(int flags) {
		for (Intents intent : Intents.values()) {
			if ((flags & intent.getIntentValue()) == intent.getIntentValue()) {
				System.out.println(intent.name());
			}
		}
	}

}
