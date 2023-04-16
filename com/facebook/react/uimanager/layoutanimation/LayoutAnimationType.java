package com.facebook.react.uimanager.layoutanimation.LayoutAnimationType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationType$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LayoutAnimationType extends Enum	// class@001378
{
    public static final LayoutAnimationType[] $VALUES;
    public static final LayoutAnimationType CREATE;
    public static final LayoutAnimationType DELETE;
    public static final LayoutAnimationType UPDATE;

    static {
       LayoutAnimationType layoutAnimat = new LayoutAnimationType("CREATE", 0);
       LayoutAnimationType.CREATE = layoutAnimat;
       LayoutAnimationType layoutAnimat1 = new LayoutAnimationType("UPDATE", 1);
       LayoutAnimationType.UPDATE = layoutAnimat1;
       LayoutAnimationType layoutAnimat2 = new LayoutAnimationType("DELETE", 2);
       LayoutAnimationType.DELETE = layoutAnimat2;
       LayoutAnimationType[] layoutAnimat3 = new LayoutAnimationType[]{layoutAnimat,layoutAnimat1,layoutAnimat2};
       LayoutAnimationType.$VALUES = layoutAnimat3;
    }
    public void LayoutAnimationType(String p0,int p1){
       super(p0, p1);
    }
    public static String toString(LayoutAnimationType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LayoutAnimationType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = LayoutAnimationType$a.a[p0.ordinal()];
       if (i == 1) {
          return "create";
       }
       if (i == 2) {
          return "update";
       }
       if (i == 3) {
          return "delete";
       }
       throw new IllegalArgumentException("Unsupported LayoutAnimationType: "+p0);
    }
    public static LayoutAnimationType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LayoutAnimationType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LayoutAnimationType.class, p0);
    }
    public static LayoutAnimationType[] values(){
       Object obj = PatchProxy.apply(null, null, LayoutAnimationType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LayoutAnimationType.$VALUES.clone();
    }
}
