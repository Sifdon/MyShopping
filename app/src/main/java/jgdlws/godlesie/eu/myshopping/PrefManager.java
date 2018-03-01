package jgdlws.godlesie.eu.myshopping;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jgdlws on 01.03.18.
 */

public class PrefManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "shopping";
    private static final String IS_FIRST_TIME_LAUNCH = "isFirstLaunch";

    PrefManager(Context context) {
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = pref.edit();
        editor.apply();
    }

    void setIsFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime).apply();
    }
    boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
    public SharedPreferences getPref() {
        return pref;
    }
    public SharedPreferences.Editor getEditor() {
        return editor;
    }
}
