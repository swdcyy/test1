package com.kwai.sdk.etools_api.IToolsFeature;
import com.kwai.sdk.etools_api.IDayNightSetting;

public interface abstract IToolsFeature	// class@001430
{

    IDayNightSetting getDayNightSettingProxy();
    boolean isBackgroundHideTools();
    boolean isHostDebugMode();
    boolean isOpenLightDarkSwitch();
    boolean isOpenTeamIssueShortcut();
    boolean isRequireFrescoInit();
}
