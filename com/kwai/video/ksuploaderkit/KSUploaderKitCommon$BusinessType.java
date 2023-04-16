package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$BusinessType extends Enum	// class@00096b
{
    public static final KSUploaderKitCommon$BusinessType[] $VALUES;
    public static final KSUploaderKitCommon$BusinessType External;
    public static final KSUploaderKitCommon$BusinessType KSUploaderKit;
    public static final KSUploaderKitCommon$BusinessType Unknown;

    static {
       KSUploaderKitCommon$BusinessType uBusinessTyp = new KSUploaderKitCommon$BusinessType("KSUploaderKit", 0);
       KSUploaderKitCommon$BusinessType.KSUploaderKit = uBusinessTyp;
       KSUploaderKitCommon$BusinessType uBusinessTyp1 = new KSUploaderKitCommon$BusinessType("External", 1);
       KSUploaderKitCommon$BusinessType.External = uBusinessTyp1;
       KSUploaderKitCommon$BusinessType uBusinessTyp2 = new KSUploaderKitCommon$BusinessType("Unknown", 2);
       KSUploaderKitCommon$BusinessType.Unknown = uBusinessTyp2;
       KSUploaderKitCommon$BusinessType[] uBusinessTyp3 = new KSUploaderKitCommon$BusinessType[]{uBusinessTyp,uBusinessTyp1,uBusinessTyp2};
       KSUploaderKitCommon$BusinessType.$VALUES = uBusinessTyp3;
    }
    public void KSUploaderKitCommon$BusinessType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$BusinessType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$BusinessType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$BusinessType.class, p0);
    }
    public static KSUploaderKitCommon$BusinessType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$BusinessType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$BusinessType.$VALUES.clone();
    }
}
