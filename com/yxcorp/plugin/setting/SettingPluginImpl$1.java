package com.yxcorp.plugin.setting.SettingPluginImpl$1;
import java.util.HashSet;
import com.yxcorp.plugin.setting.SettingPluginImpl;
import java.lang.Object;
import com.yxcorp.plugin.setting.activity.AboutUsActivity;

public class SettingPluginImpl$1 extends HashSet	// class@0007f5
{
    public final SettingPluginImpl this$0;

    public void SettingPluginImpl$1(SettingPluginImpl p0){
       this.this$0 = p0;
       super();
       this.add("SettingsActivity");
       this.add("PrivateSettingsActivity");
       this.add("PushSettingsActivity");
       this.add("UserSettingsUpdateActivity");
       this.add("AboutUsActivity");
    }
}
