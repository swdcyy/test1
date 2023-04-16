package com.kwai.framework.network.keyconfig.ApiFeature;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ApiFeature extends Enum	// class@000c11
{
    public final String mName;
    public static final ApiFeature[] $VALUES;
    public static final ApiFeature CLIENT_LOG;
    public static final ApiFeature HEARTBEAT;
    public static final ApiFeature PUSH;
    public static final ApiFeature REAL_LOG;
    public static final ApiFeature RED_DOT;

    static {
       ApiFeature uApiFeature = new ApiFeature("REAL_LOG", 0, "realLog");
       ApiFeature.REAL_LOG = uApiFeature;
       ApiFeature uApiFeature1 = new ApiFeature("PUSH", 1, "push");
       ApiFeature.PUSH = uApiFeature1;
       ApiFeature uApiFeature2 = new ApiFeature("RED_DOT", 2, "redDot");
       ApiFeature.RED_DOT = uApiFeature2;
       ApiFeature uApiFeature3 = new ApiFeature("HEARTBEAT", 3, "heartbeat");
       ApiFeature.HEARTBEAT = uApiFeature3;
       ApiFeature uApiFeature4 = new ApiFeature("CLIENT_LOG", 4, "clientLog");
       ApiFeature.CLIENT_LOG = uApiFeature4;
       ApiFeature[] uApiFeatureA = new ApiFeature[]{uApiFeature,uApiFeature1,uApiFeature2,uApiFeature3,uApiFeature4};
       ApiFeature.$VALUES = uApiFeatureA;
    }
    public void ApiFeature(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static ApiFeature valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ApiFeature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ApiFeature.class, p0);
    }
    public static ApiFeature[] values(){
       Object obj = PatchProxy.apply(null, null, ApiFeature.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ApiFeature.$VALUES.clone();
    }
}
