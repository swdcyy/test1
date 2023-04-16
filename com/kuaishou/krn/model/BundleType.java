package com.kuaishou.krn.model.BundleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BundleType extends Enum	// class@0008fd
{
    public static final BundleType[] $VALUES;
    public static final BundleType DOWNLOADED;
    public static final BundleType DOWNLOADING;
    public static final BundleType INTERNAL;

    static {
       BundleType uBundleType = new BundleType("INTERNAL", 0);
       BundleType.INTERNAL = uBundleType;
       BundleType uBundleType1 = new BundleType("DOWNLOADED", 1);
       BundleType.DOWNLOADED = uBundleType1;
       BundleType uBundleType2 = new BundleType("DOWNLOADING", 2);
       BundleType.DOWNLOADING = uBundleType2;
       BundleType[] uBundleTypeA = new BundleType[]{uBundleType,uBundleType1,uBundleType2};
       BundleType.$VALUES = uBundleTypeA;
    }
    public void BundleType(String p0,int p1){
       super(p0, p1);
    }
    public static BundleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BundleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BundleType.class, p0);
    }
    public static BundleType[] values(){
       Object obj = PatchProxy.apply(null, null, BundleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BundleType.$VALUES.clone();
    }
}
