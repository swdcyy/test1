package com.kwai.kwaishare.qq.QQBaseShare;
import com.kwai.kwaishare.qq.QQBaseShare$a;
import nsd.u;
import com.kwai.kwaishare.qq.QQBaseShare$Companion$mTencent$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import bu6.b;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import com.kwai.kwaishare.qq.QQBaseShare$c;
import android.app.Activity;
import com.kwai.kwaishare.kit.ShareKitConfig;
import com.kwai.kwaishare.qq.QQBaseShare$sendShare$1;
import msd.q;
import com.kwai.kwaishare.qq.QQBaseShare$b;
import java.lang.Runnable;
import ekd.k1;

public abstract class QQBaseShare	// class@001d9f
{
    public static long a;
    public static String b;
    public static final p c;
    public static final QQBaseShare$a d;

    static {
       QQBaseShare.d = new QQBaseShare$a(null);
       QQBaseShare.c = s.c(QQBaseShare$Companion$mTencent$2.INSTANCE);
    }
    public void QQBaseShare(){
       super();
    }
    public static void f(QQBaseShare p0,b p1,Bundle p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0.d();
       }
       p0.e(p1, p2, p3);
       return;
    }
    public final boolean b(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQBaseShare.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qqRequest");
       String str = p0.f();
       boolean b = (str != null)? new File(str).exists(): false;
       return b;
    }
    public final boolean c(b p0){
       String obj = PatchProxy.applyOneRefs(p0, this, QQBaseShare.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qqRequest");
       obj = p0.n();
       boolean b = false;
       obj = (obj != null && obj.length() > 0)? 1: 0;
       if (obj) {
          String str = p0.l();
          str = (str != null && str.length() > 0)? 1: 0;
          if (str) {
             b = true;
          }
       }
       return b;
    }
    public abstract boolean d();
    public final void e(b p0,Bundle p1,boolean p2){
       if (PatchProxy.isSupport(QQBaseShare.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, QQBaseShare.class, "1")) {
          return;
       }
       a.p(p0, "qqRequest");
       a.p(p1, "params");
       QQBaseShare$c uoc = new QQBaseShare$c(p0);
       ShareKitConfig.k.f(new QQBaseShare$sendShare$1(uoc));
       k1.o(new QQBaseShare$b(p2, p0.a(), p1, uoc));
       return;
    }
}
