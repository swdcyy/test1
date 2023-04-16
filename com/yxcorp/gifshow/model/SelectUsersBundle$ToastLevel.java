package com.yxcorp.gifshow.model.SelectUsersBundle$ToastLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SelectUsersBundle$ToastLevel extends Enum	// class@001e8a
{
    public static final SelectUsersBundle$ToastLevel[] $VALUES;
    public static final SelectUsersBundle$ToastLevel ALERT;
    public static final SelectUsersBundle$ToastLevel INFO;

    static {
       SelectUsersBundle$ToastLevel toastLevel = new SelectUsersBundle$ToastLevel("ALERT", 0);
       SelectUsersBundle$ToastLevel.ALERT = toastLevel;
       SelectUsersBundle$ToastLevel toastLevel1 = new SelectUsersBundle$ToastLevel("INFO", 1);
       SelectUsersBundle$ToastLevel.INFO = toastLevel1;
       SelectUsersBundle$ToastLevel[] toastLevelAr = new SelectUsersBundle$ToastLevel[]{toastLevel,toastLevel1};
       SelectUsersBundle$ToastLevel.$VALUES = toastLevelAr;
    }
    public void SelectUsersBundle$ToastLevel(String p0,int p1){
       super(p0, p1);
    }
    public static SelectUsersBundle$ToastLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SelectUsersBundle$ToastLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SelectUsersBundle$ToastLevel.class, p0);
    }
    public static SelectUsersBundle$ToastLevel[] values(){
       Object obj = PatchProxy.apply(null, null, SelectUsersBundle$ToastLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SelectUsersBundle$ToastLevel.$VALUES.clone();
    }
}
