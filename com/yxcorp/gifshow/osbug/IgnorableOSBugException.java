package com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import java.lang.Enum;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException$1;
import java.lang.String;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException$2;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException$3;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException$4;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import java.lang.RuntimeException;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;

public abstract class IgnorableOSBugException extends Enum	// class@0021d6
{
    public static final IgnorableOSBugException[] $VALUES;
    public static final IgnorableOSBugException FrameLayoutOnMeasureNPE;
    public static final IgnorableOSBugException PointerIndexNeg1IAE;
    public static final IgnorableOSBugException PointerIndexOutOfRangeIAE;
    public static final IgnorableOSBugException ReadPrivateFlagsNPE;

    static {
       IgnorableOSBugException$1 u1 = new IgnorableOSBugException$1("PointerIndexOutOfRangeIAE", 0);
       IgnorableOSBugException.PointerIndexOutOfRangeIAE = u1;
       IgnorableOSBugException$2 u2 = new IgnorableOSBugException$2("PointerIndexNeg1IAE", 1);
       IgnorableOSBugException.PointerIndexNeg1IAE = u2;
       IgnorableOSBugException$3 u3 = new IgnorableOSBugException$3("ReadPrivateFlagsNPE", 2);
       IgnorableOSBugException.ReadPrivateFlagsNPE = u3;
       IgnorableOSBugException$4 u4 = new IgnorableOSBugException$4("FrameLayoutOnMeasureNPE", 3);
       IgnorableOSBugException.FrameLayoutOnMeasureNPE = u4;
       IgnorableOSBugException[] ignorableOSB = new IgnorableOSBugException[]{u1,u2,u3,u4};
       IgnorableOSBugException.$VALUES = ignorableOSB;
    }
    public void IgnorableOSBugException(String p0,int p1){
       super(p0, p1);
    }
    public void IgnorableOSBugException(String p0,int p1,IgnorableOSBugException$1 p2){
       super(p0, p1);
    }
    public static void exposeException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, IgnorableOSBugException.class, "5")) {
          return;
       }
       u1.R("XfCommonLowFreqCustomEvent", "[`IgnorableOSBugException`]"+Log.f(p0), 14);
       if (p0 instanceof RuntimeException) {
          throw p0;
       }
       throw new RuntimeException(p0);
    }
    public static IgnorableOSBugException findMatched(Exception p0){
       object oobject;
       IgnorableOSBugException[] obj = PatchProxy.applyOneRefs(p0, null, IgnorableOSBugException.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IgnorableOSBugException.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (oobject.matches(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static void ignoreOrThrowIt(String p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, IgnorableOSBugException.class, "3")) {
          return;
       }
       p1.printStackTrace();
       Log.d("ignoreOrThrowIt-"+p0, Log.f(p1));
       IgnorableOSBugException ignorableOSB = IgnorableOSBugException.findMatched(p1);
       if (ignorableOSB != null && !a.a().c()) {
          u1.R("XfCommonLowFreqCustomEvent", "[`IgnorableOSBugExcepHappen`]"+ignorableOSB.name()+"-"+p0+";"+Log.f(p1), 14);
       }else {
          IgnorableOSBugException.exposeException(p1);
       }
       return;
    }
    public static IgnorableOSBugException valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IgnorableOSBugException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IgnorableOSBugException.class, p0);
    }
    public static IgnorableOSBugException[] values(){
       Object obj = PatchProxy.apply(null, null, IgnorableOSBugException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IgnorableOSBugException.$VALUES.clone();
    }
    public abstract boolean matches(Exception p0);
}
