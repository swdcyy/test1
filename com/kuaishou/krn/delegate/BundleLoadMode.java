package com.kuaishou.krn.delegate.BundleLoadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BundleLoadMode extends Enum	// class@000855
{
    public static final BundleLoadMode[] $VALUES;
    public static final BundleLoadMode LOCAL_FIRST;
    public static final BundleLoadMode LOCAL_ONLY;
    public static final BundleLoadMode REMOTE_FIRST;

    static {
       BundleLoadMode uBundleLoadM = new BundleLoadMode("LOCAL_ONLY", 0);
       BundleLoadMode.LOCAL_ONLY = uBundleLoadM;
       BundleLoadMode uBundleLoadM1 = new BundleLoadMode("LOCAL_FIRST", 1);
       BundleLoadMode.LOCAL_FIRST = uBundleLoadM1;
       BundleLoadMode uBundleLoadM2 = new BundleLoadMode("REMOTE_FIRST", 2);
       BundleLoadMode.REMOTE_FIRST = uBundleLoadM2;
       BundleLoadMode[] uBundleLoadM3 = new BundleLoadMode[]{uBundleLoadM,uBundleLoadM1,uBundleLoadM2};
       BundleLoadMode.$VALUES = uBundleLoadM3;
    }
    public void BundleLoadMode(String p0,int p1){
       super(p0, p1);
    }
    public static BundleLoadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BundleLoadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BundleLoadMode.class, p0);
    }
    public static BundleLoadMode[] values(){
       Object obj = PatchProxy.apply(null, null, BundleLoadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BundleLoadMode.$VALUES.clone();
    }
}
