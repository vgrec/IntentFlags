import java.util.EnumSet;

public class IntentFlags {

	public static void print(int flags) {
		EnumSet<Intents> allIntents = EnumSet.allOf(Intents.class);
		for (Intents intent : Intents.values()) {
			if ((flags & intent.getIntentValue()) == intent.getIntentValue()) {
				System.out.println(intent.name());
			}
		}
	}

}
