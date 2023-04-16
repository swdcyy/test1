package com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$triggerDex2Oat$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.String;
import java.io.File;
import java.lang.ClassLoader;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$a;
import java.util.LinkedList;
import java.lang.System;
import com.kwai.dva.dex2oat.Dex2OatManager;
import aj5.b$a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.jvm.internal.a;
import qj7.d;
import kotlinx.coroutines.c;
import wi7.a;
import java.lang.Integer;
import dsd.a;

public final class FeatureDex2OatManager$triggerDex2Oat$1 extends SuspendLambda implements p	// class@00131e
{
    public final String $apkPath;
    public final boolean $canRetry;
    public final String $featureName;
    public final String $libSearchPath;
    public final File $optDir;
    public final ClassLoader $parent;
    public long J$0;
    public int label;

    public void FeatureDex2OatManager$triggerDex2Oat$1(String p0,File p1,String p2,ClassLoader p3,boolean p4,String p5,c p6){
       this.$apkPath = p0;
       this.$optDir = p1;
       this.$libSearchPath = p2;
       this.$parent = p3;
       this.$canRetry = p4;
       this.$featureName = p5;
       super(2, p6);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FeatureDex2OatManager$triggerDex2Oat$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       FeatureDex2OatManager$triggerDex2Oat$1 otriggerDex2 = new FeatureDex2OatManager$triggerDex2Oat$1(this.$apkPath, this.$optDir, this.$libSearchPath, this.$parent, this.$canRetry, this.$featureName, p1);
       return p0;
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FeatureDex2OatManager$triggerDex2Oat$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       long l1;
       FeatureDex2OatManager obj = PatchProxy.applyOneRefs(p0, this, FeatureDex2OatManager$triggerDex2Oat$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       FeatureDex2OatManager$triggerDex2Oat$1 tlabel = this.label;
       FeatureDex2OatManager$triggerDex2Oat$1 otriggerDex2 = null;
       FeatureDex2OatManager$triggerDex2Oat$1 otriggerDex21 = 2;
       FeatureDex2OatManager$triggerDex2Oat$1 otriggerDex22 = 1;
       if (tlabel != null) {
          if (tlabel != otriggerDex22) {
             if (tlabel == otriggerDex21) {
                j0.n(p0);
             label_00b2 :
                FeatureDex2OatManager.a.i(this.$featureName, this.$apkPath, this.$optDir, this.$libSearchPath, this.$parent, false);
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             otriggerDex22 = this.J$0;
             j0.n(p0);
          label_007e :
             long l = System.currentTimeMillis() - otriggerDex22;
             if (!p0.b() && (this.$canRetry != null && StringsKt__StringsKt.O2(p0.a(), "timeout", otriggerDex2, otriggerDex21, null))) {
                d.c(a.C("retry triggerDex2Oat, apk=", this.$apkPath));
                this.label = otriggerDex21;
                if (c.a(0x2710, this) == obj) {
                   return obj;
                }else {
                   goto label_00b2 ;
                }
             }else {
                a uoa1 = FeatureDex2OatManager.a.d();
                if (uoa1 != null) {
                   uoa1.a(this.$featureName, p0, l);
                }
             }
          }
       }else {
          j0.n(p0);
          p0 = FeatureDex2OatManager.f;
          FeatureDex2OatManager$triggerDex2Oat$1 t$featureNam = this.$featureName;
          FeatureDex2OatManager$triggerDex2Oat$1 t$apkPath = this.$apkPath;
          FeatureDex2OatManager$triggerDex2Oat$1 t$optDir = this.$optDir;
          FeatureDex2OatManager$triggerDex2Oat$1 t$libSearchP = this.$libSearchPath;
          FeatureDex2OatManager$triggerDex2Oat$1 t$parent = this.$parent;
          tlabel = this.$canRetry;
          _monitor_enter(p0);
          if ((FeatureDex2OatManager.e + otriggerDex22) > 3) {
             LinkedList f = FeatureDex2OatManager.f;
             b = (tlabel != null)? true: false;
             FeatureDex2OatManager$a uoa2 = new FeatureDex2OatManager$a(t$featureNam, t$apkPath, t$optDir, t$libSearchP, t$parent, b);
             f.add(otriggerDex21);
             _monitor_exit(p0);
             return l1.a;
          }else {
             FeatureDex2OatManager.e = FeatureDex2OatManager.e + otriggerDex22;
             _monitor_exit(p0);
             l1 = System.currentTimeMillis();
             this.J$0 = l1;
             this.label = otriggerDex22;
             p0 = Dex2OatManager.a.f(this.$apkPath, this.$optDir, this.$libSearchPath, this.$parent, this);
             if (p0 == obj) {
                return obj;
             }else {
                long l2 = l1;
                goto label_007e ;
             }
          }
       }
       p0 = FeatureDex2OatManager.f;
       tlabel = this.$featureName;
       _monitor_enter(p0);
       obj = FeatureDex2OatManager.a;
       FeatureDex2OatManager.e = FeatureDex2OatManager.e - 1;
       if (FeatureDex2OatManager.f.size() > 0) {
          d.c(a.C("number of waiting for optimization=", a.f(FeatureDex2OatManager.f.size())));
          FeatureDex2OatManager$a uoa = FeatureDex2OatManager.f.pop();
          File uFile = uoa.d();
          String str = uoa.c();
          ClassLoader uClassLoader = uoa.e();
          File uFile1 = uFile;
          String str1 = str;
          ClassLoader uClassLoader1 = uClassLoader;
          FeatureDex2OatManager.j(obj, tlabel, uoa.a(), uFile1, str1, uClassLoader1, 0, 32, 0);
       }
       _monitor_exit(p0);
       return l1.a;
    }
}
