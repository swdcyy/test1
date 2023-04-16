package com.yxcorp.login.authorization.mode.AuthEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AuthEvent extends Enum	// class@001a38
{
    public static final AuthEvent[] $VALUES;
    public static final AuthEvent DATA_LOAD_SUCCESS;
    public static final AuthEvent LOGIN_START;
    public static final AuthEvent LOGIN_SUCCESS;
    public static final AuthEvent REFRESH_LIST;
    public static final AuthEvent REFRESH_MANAGER_VIEW;

    static {
       AuthEvent uAuthEvent = new AuthEvent("LOGIN_START", 0);
       AuthEvent.LOGIN_START = uAuthEvent;
       AuthEvent uAuthEvent1 = new AuthEvent("LOGIN_SUCCESS", 1);
       AuthEvent.LOGIN_SUCCESS = uAuthEvent1;
       AuthEvent uAuthEvent2 = new AuthEvent("DATA_LOAD_SUCCESS", 2);
       AuthEvent.DATA_LOAD_SUCCESS = uAuthEvent2;
       AuthEvent uAuthEvent3 = new AuthEvent("REFRESH_LIST", 3);
       AuthEvent.REFRESH_LIST = uAuthEvent3;
       AuthEvent uAuthEvent4 = new AuthEvent("REFRESH_MANAGER_VIEW", 4);
       AuthEvent.REFRESH_MANAGER_VIEW = uAuthEvent4;
       AuthEvent[] uAuthEventAr = new AuthEvent[]{uAuthEvent,uAuthEvent1,uAuthEvent2,uAuthEvent3,uAuthEvent4};
       AuthEvent.$VALUES = uAuthEventAr;
    }
    public void AuthEvent(String p0,int p1){
       super(p0, p1);
    }
    public static AuthEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AuthEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AuthEvent.class, p0);
    }
    public static AuthEvent[] values(){
       Object obj = PatchProxy.apply(null, null, AuthEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AuthEvent.$VALUES.clone();
    }
}
