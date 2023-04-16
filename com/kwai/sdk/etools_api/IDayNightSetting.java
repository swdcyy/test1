package com.kwai.sdk.etools_api.IDayNightSetting;
import zf6.k$b;
import java.lang.String;
import android.content.SharedPreferences;

public interface abstract IDayNightSetting	// class@00142d
{

    void forceOpenDayNightEntrance();
    k$b getUiProvider();
    String getUserId();
    boolean hasDarkModeSettingEntrance();
    boolean isDarkWhiteCommentEnable();
    boolean isHitDarkMode();
    boolean isHitDarkModeDefaultDisableAndPopupGroup();
    boolean isHitDarkModeDefaultEnableGroup();
    SharedPreferences onGotSharePreference();
    void onWriteExperimentCache(int p0);
}
