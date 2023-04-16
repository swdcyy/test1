package com.kwai.dva.dex2oat.Dex2OatManager;
import com.kwai.dva.dex2oat.Dex2OatManager$mDexOptimizer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.dva.dex2oat.Dex2OatManager$mDex2OatSwitcher$2;
import com.kwai.dva.dex2oat.Dex2OatManager$mClassVerifyHandler$2;
import java.lang.Object;
import cj5.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cj5.a;
import kotlin.jvm.internal.a;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import bj5.a$b;
import java.lang.System;
import bj5.a;
import java.lang.StringBuilder;
import qj7.d;
import java.lang.Boolean;
import java.io.File;
import dalvik.system.DexFile;
import com.kwai.dva.dex2oat.util.Dex2OatFilesUtil;
import java.lang.Throwable;
import java.lang.ClassLoader;
import asd.c;
import aj5.b;

public final class Dex2OatManager	// class@000ad8
{
    public static final Dex2OatManager a;
    public static Context b;
    public static final p c;
    public static final p d;
    public static final p e;

    static {
       Dex2OatManager.a = new Dex2OatManager();
       Dex2OatManager.c = s.c(Dex2OatManager$mDexOptimizer$2.INSTANCE);
       Dex2OatManager.d = s.c(Dex2OatManager$mDex2OatSwitcher$2.INSTANCE);
       Dex2OatManager.e = s.c(Dex2OatManager$mClassVerifyHandler$2.INSTANCE);
    }
    public void Dex2OatManager(){
       super();
    }
    public final a$a a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dex2OatManager uDex2OatMana = Dex2OatManager.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uDex2OatMana, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uDex2OatMana, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = Dex2OatManager.e.getValue();
       }
       Context b = Dex2OatManager.b;
       if (b == null) {
          a.S("mContext");
       }else {
          objArray = b;
       }
       return obj1.a(objArray.getApplicationInfo().targetSdkVersion);
    }
    public final a$b b(){
       Object obj = PatchProxy.apply(null, this, Dex2OatManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.c("disableDex2Oat spent "+(System.currentTimeMillis() - System.currentTimeMillis())+" ms");
       return Dex2OatManager.a.c().a();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, Dex2OatManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Dex2OatManager.d.getValue();
    }
    public final boolean d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Dex2OatManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "dexPath");
       boolean b = false;
       if (!new File(p0).exists()) {
          return b;
       }
       if (p1 == null) {
          return DexFile.isDexOptNeeded(p0);
       }
       obj = 1;
       try{
          p1 = Dex2OatFilesUtil.a.d(new File(p0), new File(p1));
          if (DexFile.isDexOptNeeded(p0) && (!new File(p1).exists() || new File(p1).length() - new File(p0).length() < 0)) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e6){
          d.b("isDexOptNeeded\(\)", e6);
          return obj;
       }
    }
    public final a$b e(){
       Object obj = PatchProxy.apply(null, this, Dex2OatManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.c("restoreDex2Oat spent "+(System.currentTimeMillis() - System.currentTimeMillis())+" ms");
       return Dex2OatManager.a.c().b();
    }
    public final Object f(String p0,File p1,String p2,ClassLoader p3,c p4){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dex2OatManager uDex2OatMana = Dex2OatManager.class;
       if (PatchProxy.isSupport(uDex2OatMana)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uDex2OatMana, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       Object obj1 = PatchProxy.apply(null, this, uDex2OatMana, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = Dex2OatManager.c.getValue();
       }
       return obj1.b(p0, p1, p2, p3, p4);
    }
}
