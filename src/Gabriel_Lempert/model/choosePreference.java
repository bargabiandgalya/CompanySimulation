package Gabriel_Lempert.model;

public interface choosePreference {
	void choosePreference(PreferenceType p, int change) throws Exception;
	boolean canChoosePreference();
}