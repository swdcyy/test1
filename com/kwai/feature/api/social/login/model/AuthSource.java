package com.kwai.feature.api.social.login.model.AuthSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AuthSource extends Enum	// class@00110e
{
    public static final AuthSource[] $VALUES;
    public static final AuthSource JS_BRIDGE;
    public static final AuthSource KWAI_SDK;
    public static final AuthSource QR_CODE;
    public static final AuthSource WE_GAME;

    static {
       AuthSource uAuthSource = new AuthSource("JS_BRIDGE", 0);
       AuthSource.JS_BRIDGE = uAuthSource;
       AuthSource uAuthSource1 = new AuthSource("WE_GAME", 1);
       AuthSource.WE_GAME = uAuthSource1;
       AuthSource uAuthSource2 = new AuthSource("KWAI_SDK", 2);
       AuthSource.KWAI_SDK = uAuthSource2;
       AuthSource uAuthSource3 = new AuthSource("QR_CODE", 3);
       AuthSource.QR_CODE = uAuthSource3;
       AuthSource[] uAuthSourceA = new AuthSource[]{uAuthSource,uAuthSource1,uAuthSource2,uAuthSource3};
       AuthSource.$VALUES = uAuthSourceA;
    }
    public void AuthSource(String p0,int p1){
       super(p0, p1);
    }
    public static AuthSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AuthSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AuthSource.class, p0);
    }
    public static AuthSource[] values(){
       Object obj = PatchProxy.apply(null, null, AuthSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AuthSource.$VALUES.clone();
    }
    public int getValue(){
       if (this == AuthSource.KWAI_SDK) {
          return 0;
       }
       if (this == AuthSource.JS_BRIDGE) {
          return 1;
       }
       if (this == AuthSource.WE_GAME) {
          return 2;
       }
       if (this == AuthSource.QR_CODE) {
          return 3;
       }
       return -1;
    }
}
