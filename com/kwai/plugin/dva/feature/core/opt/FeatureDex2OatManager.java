package com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import com.kwai.dva.dex2oat.Dex2OatManager;
import qj7.d;
import bj5.a$b;
import wi7.a;
import java.lang.StringBuilder;
import msd.a;
import dalvik.system.PathClassLoader;
import java.lang.Throwable;
import java.lang.RuntimeException;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$triggerDex2Oat$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$triggerDex2OatPendingTask$1;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$a;

public final class FeatureDex2OatManager	// class@001320
{
    public static final FeatureDex2OatManager a;
    public static boolean b;
    public static boolean c;
    public static a d;
    public static int e;
    public static LinkedList f;
    public static boolean g;
    public static boolean h;
    public static final CopyOnWriteArraySet i;

    static {
       FeatureDex2OatManager.a = new FeatureDex2OatManager();
       FeatureDex2OatManager.f = new LinkedList();
       FeatureDex2OatManager.i = new CopyOnWriteArraySet();
    }
    public void FeatureDex2OatManager(){
       super();
    }
    public static void j(FeatureDex2OatManager p0,String p1,String p2,File p3,String p4,ClassLoader p5,boolean p6,int p7,Object p8){
       boolean b = (p7 & 0x20)? true: p6;
       p0.i(p1, p2, p3, p4, p5, b);
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeatureDex2OatManager.class, "1")) {
          return;
       }
       a.p(p0, "feature");
       FeatureDex2OatManager.i.add(p0);
       return;
    }
    public final boolean b(String p0,String p1,File p2){
       a d;
       Dex2OatManager obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeatureDex2OatManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureName");
       a.p(p1, "apkPath");
       a.p(p2, "optDir");
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = true;
       if (sDK_INT > 28) {
          return b;
       }
       if (FeatureDex2OatManager.b) {
          obj = (sDK_INT <= 28)? 1: null;
          if (obj) {
             obj = Dex2OatManager.a;
             if (!obj.d(p1, p2.getAbsolutePath())) {
                d.c(a.C("disable dex2oat, isDexOptNeeded=false for ", p0));
                return false;
             }else {
                a$b uob = obj.b();
                d = FeatureDex2OatManager.d;
                if (d != null) {
                   d.b(p0, uob);
                }
                if (uob.b() != 10) {
                   b = false;
                }
                if (!b) {
                   d.c("disable dex2oat failed. "+uob.b()+" : "+uob.a());
                }
                return b;
             }
          }
       }
       d.c("disable dex2oat, disabling dex2oat is not allowed.");
       return false;
    }
    public synchronized final Object c(String p0,String p1,File p2,String p3,a p4){
       ClassLoader classLoader;
       if (PatchProxy.isSupport(FeatureDex2OatManager.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, FeatureDex2OatManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "featureName");
       a.p(p1, "apkPath");
       a.p(p2, "optDir");
       a.p(p4, "block");
       boolean b = this.b(p0, p1, p2);
       p4 = p4.invoke();
       if (b) {
          this.e(p0);
       }
       if (b) {
          if (p4 instanceof PathClassLoader) {
             p2 = null;
          }
          File uFile = p2;
          if (FeatureDex2OatManager.h) {
             classLoader = FeatureDex2OatManager.class.getClassLoader();
             a.m(classLoader);
             this.l(p0, p1, uFile, p3, classLoader);
          }else {
             classLoader = FeatureDex2OatManager.class.getClassLoader();
             a.m(classLoader);
             FeatureDex2OatManager.j(this, p0, p1, uFile, p3, classLoader, false, 32, null);
          }
       }
       return p4;
    }
    public final a d(){
       return FeatureDex2OatManager.d;
    }
    public final void e(String p0){
       a d;
       if (PatchProxy.applyVoidOneRefs(p0, this, FeatureDex2OatManager.class, "4")) {
          return;
       }
       a.p(p0, "featureName");
       Dex2OatManager uDex2OatMana = (Build$VERSION.SDK_INT <= 28)? 1: null;
       if (!uDex2OatMana) {
          d.c("restore dex2oat, restore dex2oat is not allowed.");
          return;
       }else {
          a$b uob = Dex2OatManager.a.e();
          if (uob.b() != 10) {
             d.b("restore dex2oat failed !!! "+uob.b()+" : "+uob.a(), new RuntimeException());
          }
          d = FeatureDex2OatManager.d;
          if (d != null) {
             d.c(p0, uob);
          }
          return;
       }
    }
    public final void f(boolean p0){
       FeatureDex2OatManager.b = p0;
    }
    public final void g(boolean p0){
       FeatureDex2OatManager.c = p0;
    }
    public final void h(a p0){
       FeatureDex2OatManager.d = p0;
    }
    public final void i(String p0,String p1,File p2,String p3,ClassLoader p4,boolean p5){
       Dex2OatManager a;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       FeatureDex2OatManager uFeatureDex2 = FeatureDex2OatManager.class;
       if (PatchProxy.isSupport(uFeatureDex2)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,p3,oobject2,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uFeatureDex2, "5")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p0, "featureName");
       a.p(p1, "apkPath");
       a.p(oobject2, "parent");
       if (!FeatureDex2OatManager.c || FeatureDex2OatManager.i.contains(p0)) {
          d.c("trigger dex2oat, trigger "+p0+" dex2oat is not allowed.");
          return;
       }else {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT > 30) {
             d.c("trigger dex2oat, sdk version \("+sDK_INT+"\) > 30.");
             return;
          }else {
             a = Dex2OatManager.a;
             String str = (p2 == null)? null: p2.getAbsolutePath();
             if (!a.d(p1, str)) {
                d.c("trigger dex2oat, isDexOptNeeded=false for "+p0+" .");
                return;
             }else {
                FeatureDex2OatManager$triggerDex2Oat$1 otriggerDex2 = new FeatureDex2OatManager$triggerDex2Oat$1(p1, p2, p3, p4, p5, p0, null);
                a.f(r1.b, WorkExecutors.d(), 0, v12, 2, 0);
                return;
             }
          }
       }
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, FeatureDex2OatManager.class, "7")) {
          return;
       }
       if (!FeatureDex2OatManager.g) {
          d.c("can\'t trigger dex2oat pending task.");
       }
       a.f(r1.b, WorkExecutors.d(), null, new FeatureDex2OatManager$triggerDex2OatPendingTask$1(null), 2, null);
       return;
    }
    public final void l(String p0,String p1,File p2,String p3,ClassLoader p4){
       Dex2OatManager a;
       FeatureDex2OatManager uFeatureDex2 = FeatureDex2OatManager.class;
       if (PatchProxy.isSupport(uFeatureDex2)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uFeatureDex2, "6")) {
             return;
          }
       }
       a.p(p0, "featureName");
       a.p(p1, "apkPath");
       a.p(p4, "parent");
       if (!FeatureDex2OatManager.c || FeatureDex2OatManager.i.contains(p0)) {
          d.c("trigger dex2oat, trigger "+p0+" dex2oat is not allowed.");
          return;
       }else {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT > 30) {
             d.c("trigger dex2oat, sdk version \("+sDK_INT+"\) > 30.");
             return;
          }else {
             a = Dex2OatManager.a;
             String str = (p2 == null)? null: p2.getAbsolutePath();
             if (!a.d(p1, str)) {
                d.c("trigger dex2oat, isDexOptNeeded=false for "+p0+" .");
                return;
             }else {
                LinkedList f = FeatureDex2OatManager.f;
                _monitor_enter(f);
                FeatureDex2OatManager$a uoa = new FeatureDex2OatManager$a(p0, p1, p2, p3, p4, true);
                FeatureDex2OatManager.f.add(v9);
                _monitor_exit(f);
                this.k();
                return;
             }
          }
       }
    }
}
