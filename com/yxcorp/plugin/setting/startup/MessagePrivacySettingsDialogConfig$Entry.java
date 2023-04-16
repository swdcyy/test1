package com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig$Entry;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;

public class MessagePrivacySettingsDialogConfig$Entry	// class@0008eb
{
    public String mEnglish;
    public String mSimplifiedChinese;
    public String mTraditionalChinese;

    public void MessagePrivacySettingsDialogConfig$Entry(){
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, MessagePrivacySettingsDialogConfig$Entry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 2) {
          return this.mTraditionalChinese;
       }
       if (i != 3) {
          return this.mSimplifiedChinese;
       }
       return this.mEnglish;
    }
}
