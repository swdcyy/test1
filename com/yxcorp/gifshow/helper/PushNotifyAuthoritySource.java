package com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PushNotifyAuthoritySource extends Enum	// class@001628
{
    public final String mPageName;
    public static final PushNotifyAuthoritySource[] $VALUES;
    public static final PushNotifyAuthoritySource FriendsTab;
    public static final PushNotifyAuthoritySource Settings;

    static {
       PushNotifyAuthoritySource pushNotifyAu = new PushNotifyAuthoritySource("Settings", 0, "NOTIFICATION_SETTING");
       PushNotifyAuthoritySource.Settings = pushNotifyAu;
       PushNotifyAuthoritySource pushNotifyAu1 = new PushNotifyAuthoritySource("FriendsTab", 1, "FRIENDS");
       PushNotifyAuthoritySource.FriendsTab = pushNotifyAu1;
       PushNotifyAuthoritySource[] pushNotifyAu2 = new PushNotifyAuthoritySource[]{pushNotifyAu,pushNotifyAu1};
       PushNotifyAuthoritySource.$VALUES = pushNotifyAu2;
    }
    public void PushNotifyAuthoritySource(String p0,int p1,String p2){
       super(p0, p1);
       this.mPageName = p2;
    }
    public static PushNotifyAuthoritySource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PushNotifyAuthoritySource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PushNotifyAuthoritySource.class, p0);
    }
    public static PushNotifyAuthoritySource[] values(){
       Object obj = PatchProxy.apply(null, null, PushNotifyAuthoritySource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PushNotifyAuthoritySource.$VALUES.clone();
    }
}
