package com.kwai.video.ksuploaderkit.KSUploaderKitNetManager$ServerEnvType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitNetManager$ServerEnvType extends Enum	// class@00097f
{
    public static final KSUploaderKitNetManager$ServerEnvType[] $VALUES;
    public static final KSUploaderKitNetManager$ServerEnvType DEBUG;
    public static final KSUploaderKitNetManager$ServerEnvType RELEASE;
    public static final KSUploaderKitNetManager$ServerEnvType STAGING;

    static {
       KSUploaderKitNetManager$ServerEnvType serverEnvTyp = new KSUploaderKitNetManager$ServerEnvType("DEBUG", 0);
       KSUploaderKitNetManager$ServerEnvType.DEBUG = serverEnvTyp;
       KSUploaderKitNetManager$ServerEnvType serverEnvTyp1 = new KSUploaderKitNetManager$ServerEnvType("STAGING", 1);
       KSUploaderKitNetManager$ServerEnvType.STAGING = serverEnvTyp1;
       KSUploaderKitNetManager$ServerEnvType serverEnvTyp2 = new KSUploaderKitNetManager$ServerEnvType("RELEASE", 2);
       KSUploaderKitNetManager$ServerEnvType.RELEASE = serverEnvTyp2;
       KSUploaderKitNetManager$ServerEnvType[] serverEnvTyp3 = new KSUploaderKitNetManager$ServerEnvType[]{serverEnvTyp,serverEnvTyp1,serverEnvTyp2};
       KSUploaderKitNetManager$ServerEnvType.$VALUES = serverEnvTyp3;
    }
    public void KSUploaderKitNetManager$ServerEnvType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitNetManager$ServerEnvType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitNetManager$ServerEnvType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitNetManager$ServerEnvType.class, p0);
    }
    public static KSUploaderKitNetManager$ServerEnvType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitNetManager$ServerEnvType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitNetManager$ServerEnvType.$VALUES.clone();
    }
}
