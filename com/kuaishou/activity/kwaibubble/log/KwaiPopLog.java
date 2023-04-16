package com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import f66.i;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog$phoneCommonLevel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog$phoneRenderLevel$2;
import java.lang.String;
import xn.a;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import qn.m;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Number;
import android.os.SystemClock;
import k2b.u1;
import java.lang.Throwable;
import q87.c;
import java.util.Arrays;

public final class KwaiPopLog extends i	// class@000783
{
    public static final p c;
    public static final p d;
    public static final KwaiPopLog e;

    static {
       KwaiPopLog.e = new KwaiPopLog();
       KwaiPopLog.c = s.c(KwaiPopLog$phoneCommonLevel$2.INSTANCE);
       KwaiPopLog.d = s.c(KwaiPopLog$phoneRenderLevel$2.INSTANCE);
    }
    public void KwaiPopLog(){
       super("Kwai_Bubble", false);
    }
    public static void G(KwaiPopLog p0,String p1,a p2,Boolean p3,Boolean p4,Long p5,Long p6,Integer p7,String p8,m p9,String p10,int p11,Object p12){
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p9;
       int i = p11;
       object oobject3 = (i & 0x04)? null: p3;
       object oobject4 = (i & 0x08)? null: p4;
       object oobject5 = (i & 0x10)? null: p5;
       object oobject6 = (i & 0x20)? null: p6;
       object oobject7 = (i & 0x40)? null: p7;
       object oobject8 = (i & 0x0080)? null: p8;
       object oobject9 = (i & 0x0200)? null: p10;
       Objects.requireNonNull(p0);
       int i1 = 0;
       int i2 = 1;
       int i3 = 9;
       if (PatchProxy.isSupport(KwaiPopLog.class)) {
          Object[] objArray = new Object[10];
          objArray[i1] = oobject;
          objArray[i2] = oobject1;
          objArray[2] = oobject3;
          objArray[3] = oobject4;
          objArray[4] = oobject5;
          objArray[5] = oobject6;
          objArray[6] = oobject7;
          objArray[7] = oobject8;
          objArray[8] = oobject2;
          objArray[i3] = oobject9;
          if (PatchProxy.applyVoid(objArray, p0, KwaiPopLog.class, "8")) {
          label_015f :
             return;
          }
       }
       a.p(oobject, "bundleId");
       String str = "action";
       a.p(oobject1, str);
       a.p(oobject2, "type");
       i3 oi3 = i3.f();
       oi3.d("type", p9.a());
       oi3.d(str, oobject1.a);
       oi3.d("bundleId", oobject);
       KwaiPopLog e = KwaiPopLog.e;
       Objects.requireNonNull(e);
       Number number = PatchProxy.apply(null, e, KwaiPopLog.class, "1");
       if (number == PatchProxyResult.class) {
          number = KwaiPopLog.c.getValue();
       }
       oi3.c("phoneCommonLevel", Integer.valueOf(number.intValue()));
       Number number1 = PatchProxy.apply(null, e, KwaiPopLog.class, "2");
       if (number1 == PatchProxyResult.class) {
          number1 = KwaiPopLog.d.getValue();
       }
       oi3.c("phoneRenderLevel", Integer.valueOf(number1.intValue()));
       str = (oobject8 == null || !oobject8.length())? 1: 0;
       if (!str) {
          oi3.d("componentName", oobject8);
       }
       String str1 = "TRUE";
       String str2 = "FALSE";
       if (oobject3 != null) {
          String str3 = (oobject3.booleanValue())? str1: str2;
          oi3.d("isSync", str3);
       }
       if (oobject4 != null) {
          if (!oobject4.booleanValue()) {
             str1 = str2;
          }
          oi3.d("isRetry", str1);
       }
       if (oobject5 != null) {
          oi3.c("totalTime", Long.valueOf((SystemClock.uptimeMillis() - oobject5.longValue())));
       }
       if (oobject6 != null) {
          oi3.c("costTime", Long.valueOf((SystemClock.uptimeMillis() - oobject6.longValue())));
       }
       if (oobject7 != null) {
          oi3.c("errorCode", oobject7);
       }
       if (oobject9 != null) {
          oi3.d("extra", oobject9);
       }
       u1.R("Kwai_Bubble", oi3.e(), 9);
       goto label_015f ;
    }
    public final void C(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopLog.class, "6")) {
          return;
       }
       this.e(this.a, p0, p1);
       return;
    }
    public final void D(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopLog.class, "5")) {
          return;
       }
       a.p(p1, "args");
       this.t(this.a, p0, Arrays.copyOf(p1, p1.length));
       return;
    }
    public final void E(Throwable p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopLog.class, "7")) {
          return;
       }
       a.p(p1, "arguments");
       this.u(this.a, p0, Arrays.copyOf(p1, p1.length));
       return;
    }
    public final void F(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopLog.class, "4")) {
          return;
       }
       a.p(p1, "args");
       this.w(this.a, p0, Arrays.copyOf(p1, p1.length));
       return;
    }
}
