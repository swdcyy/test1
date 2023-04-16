package com.facebook.react.uimanager.NativeKind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NativeKind extends Enum	// class@00131a
{
    public static final NativeKind[] $VALUES;
    public static final NativeKind LEAF;
    public static final NativeKind NONE;
    public static final NativeKind PARENT;

    static {
       NativeKind nativeKind = new NativeKind("PARENT", 0);
       NativeKind.PARENT = nativeKind;
       NativeKind nativeKind1 = new NativeKind("LEAF", 1);
       NativeKind.LEAF = nativeKind1;
       NativeKind nativeKind2 = new NativeKind("NONE", 2);
       NativeKind.NONE = nativeKind2;
       NativeKind[] nativeKindAr = new NativeKind[]{nativeKind,nativeKind1,nativeKind2};
       NativeKind.$VALUES = nativeKindAr;
    }
    public void NativeKind(String p0,int p1){
       super(p0, p1);
    }
    public static NativeKind valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NativeKind.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NativeKind.class, p0);
    }
    public static NativeKind[] values(){
       Object obj = PatchProxy.apply(null, null, NativeKind.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NativeKind.$VALUES.clone();
    }
}
