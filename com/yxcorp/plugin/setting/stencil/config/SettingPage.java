package com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SettingPage extends Enum	// class@0008f9
{
    public final String page2;
    public final String pageKey;
    public final String pageUrl;
    public final int titleResource;
    public static final SettingPage[] $VALUES;
    public static final SettingPage CALENDAR_SETTING;
    public static final SettingPage SETTING;

    static {
       SettingPage settingPage;
       SettingPage[] settingPageA = new SettingPage[]{v8,settingPage};
       settingPage = new SettingPage("SETTING", 0, "setting_page", 0x7f10471b, "SETTINGS", "ks://settings");
       SettingPage.SETTING = v8;
       SettingPage settingPage1 = new SettingPage("CALENDAR_SETTING", 1, "calendar_notification_page", 0x7f100479, "CALENDAR_REMIND", "kwai://setting/calendar");
       SettingPage.CALENDAR_SETTING = settingPage;
       SettingPage.$VALUES = settingPageA;
    }
    public void SettingPage(String p0,int p1,String p2,int p3,String p4,String p5){
       super(p0, p1);
       this.pageKey = p2;
       this.titleResource = p3;
       this.page2 = p4;
       this.pageUrl = p5;
    }
    public static SettingPage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SettingPage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SettingPage.class, p0);
    }
    public static SettingPage[] values(){
       Object obj = PatchProxy.apply(null, null, SettingPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SettingPage.$VALUES.clone();
    }
    public final String getPage2(){
       return this.page2;
    }
    public final String getPageKey(){
       return this.pageKey;
    }
    public final String getPageUrl(){
       return this.pageUrl;
    }
    public final int getTitleResource(){
       return this.titleResource;
    }
}
