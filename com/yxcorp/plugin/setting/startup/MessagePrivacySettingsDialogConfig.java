package com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig$Entry;

public class MessagePrivacySettingsDialogConfig implements Serializable	// class@0008ec
{
    public MessagePrivacySettingsDialogConfig$Entry mAllType;
    public MessagePrivacySettingsDialogConfig$Entry mSubTitle;
    public MessagePrivacySettingsDialogConfig$Entry myFollowType;
    public MessagePrivacySettingsDialogConfig$Entry myFriendsType;
    public static final long serialVersionUID = 0xe525f57647c93ba7;

    public void MessagePrivacySettingsDialogConfig(){
       super();
    }
    public String getAllTypeCopy(){
       MessagePrivacySettingsDialogConfig obj = PatchProxy.apply(null, this, MessagePrivacySettingsDialogConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAllType;
       if (obj == null) {
          return a1.p(0x7f1001a7);
       }
       return obj.a();
    }
    public String getFollowTypeCopy(){
       MessagePrivacySettingsDialogConfig obj = PatchProxy.apply(null, this, MessagePrivacySettingsDialogConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.myFollowType;
       if (obj == null) {
          return a1.p(0x7f1017e2);
       }
       return obj.a();
    }
    public String getFriendsTypeCopy(){
       MessagePrivacySettingsDialogConfig obj = PatchProxy.apply(null, this, MessagePrivacySettingsDialogConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.myFriendsType;
       if (obj == null) {
          return a1.p(0x7f100fa7);
       }
       return obj.a();
    }
    public String getSubTitleCopy(){
       MessagePrivacySettingsDialogConfig obj = PatchProxy.apply(null, this, MessagePrivacySettingsDialogConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSubTitle;
       if (obj == null) {
          return "";
       }
       return obj.a();
    }
}
