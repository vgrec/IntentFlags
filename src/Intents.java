public enum Intents {
	FLAG_ACTIVITY_BROUGHT_TO_FRONT(0x00400000),
	FLAG_ACTIVITY_CLEAR_TASK(0x00008000),
	FLAG_ACTIVITY_CLEAR_TOP(0x04000000),
	FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET(0x00080000),
	FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS(0x00800000),
	FLAG_ACTIVITY_FORWARD_RESULT(0x02000000);
	
	private int intentValue;
	
	private Intents(int intentValue){
		this.intentValue = intentValue;
	}
	
	public int getIntentValue(){
		return intentValue;
	}
}
