package d61.a0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import tj3.e;
import java.lang.Number;
import tj3.k;
import java.lang.System;
import java.lang.Boolean;
import com.yxcorp.gifshow.action.RealActionBizType;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;

public final class a0	// class@001f0e
{

    public void a0(){
       super();
    }
    public static String a(int p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a0.e(p0, true);
    }
    public static int b(int p0){
       if (p0 == 77 || p0 == 154) {
          return 1;
       }
       if (p0 == 227 || p0 == 228) {
          return 4;
       }
       if (p0 == 93) {
          return 2;
       }
       return 0;
    }
    public static int c(int p0){
       if (p0 == 104) {
          return 6;
       }
       if (p0 == 130) {
          return 5;
       }
       return 0;
    }
    public static long d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (p0 != null && p0.x() != null) {
          long l1 = p0.x().M();
          if (!l1 - l) {
             return l;
          }else {
             l = (System.currentTimeMillis() - l1) - p0.x().K();
          }
       }
       return l;
    }
    public static String e(int p0,boolean p1){
       RealActionBizType realActionBi;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, uoa0, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 4) {
                if (p0 != 5) {
                   realActionBi = (p0 != 6)? null: RealActionBizType.LIVE_HOT_RERANK;
                }else {
                   realActionBi = RealActionBizType.LIVE_FEATURED_RERANK;
                }
             }else {
                realActionBi = RealActionBizType.LIVE_VOICE_PARTY_SQUARE;
             }
          }else {
             realActionBi = RealActionBizType.LIVE_MORE_SQUARE;
          }
       }else {
          realActionBi = RealActionBizType.LIVE_SQUARE;
       }
       String str = (realActionBi == null)? "": b.a(-129117978).g(realActionBi, null, p1);
       return str;
    }
}
