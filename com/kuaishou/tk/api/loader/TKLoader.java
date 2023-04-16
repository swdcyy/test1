package com.kuaishou.tk.api.loader.TKLoader;
import com.kuaishou.tk.api.loader.TKLoader$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.tk.api.loader.TKLoader$Companion$preferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import ux4.a;
import java.lang.Throwable;
import java.util.Set;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.util.Objects;
import android.content.SharedPreferences;
import java.io.File;
import java.lang.Boolean;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.pm.ApplicationInfo;
import android.app.Application;
import java.lang.System;
import java.lang.Number;
import ux4.b;
import com.yxcorp.utility.Log;
import com.kuaishou.tk.api.loader.TKLoader$b;
import com.tkruntime.v8.NativeLibraryLoader;
import com.tkruntime.v8.V8;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.kuaishou.tk.api.loader.TKLoader$c;
import java.lang.Runnable;
import t45.c;
import qrd.l1;
import java.lang.Integer;
import java.util.Iterator;

public final class TKLoader	// class@000f93
{
    public final a a;
    public String b;
    public boolean c;
    public static final p d;
    public static final TKLoader$a e;

    static {
       TKLoader.e = new TKLoader$a(null);
       TKLoader.d = s.b(LazyThreadSafetyMode.SYNCHRONIZED, TKLoader$Companion$preferences$2.INSTANCE);
    }
    public void TKLoader(){
       super();
       a uoa = new a(0, false, 0, 0, null, null, false, false, 255, null);
       this.a = v11;
       this.b = "";
    }
    public final String a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TKLoader$a obj = PatchProxy.apply(null, this, TKLoader.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = (!this.b.length())? 1: null;
       if (obj) {
          obj = TKLoader.e;
          Objects.requireNonNull(obj);
          String str = PatchProxy.apply(null, obj, TKLoader$a.class, "2");
          if (str != patchProxyRe) {
          }else {
             SharedPreferences sharedPrefer = obj.a();
             _monitor_enter(sharedPrefer);
             String str1 = obj.a().getString("library_path", null);
             if (str1 == null) {
                str1 = "";
             }
             str = str1;
             _monitor_exit(sharedPrefer);
          }
          if (new File(str, "libtk_runtime_v0_0_136.so").exists()) {
             this.b = str;
          }
       }
       return this.b;
    }
    public final a b(){
       return this.a;
    }
    public final boolean c(){
       TKLoader obj = PatchProxy.apply(null, this, TKLoader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.a.e();
    }
    public final boolean d(){
       return this.c;
    }
    public final boolean e(){
       Application obj = PatchProxy.apply(null, this, TKLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.B;
       a.o(obj, "AppEnv.APP");
       ApplicationInfo nativeLibrar = obj.getApplicationInfo().nativeLibraryDir;
       if (nativeLibrar == null) {
          nativeLibrar = "";
       }
       String str = "libtk_runtime_v0_0_136.so";
       boolean b = true;
       if (!new File(this.a(), str).exists() && (!new File(nativeLibrar, str).exists() && !new File(nativeLibrar, "libtk_runtime_lite_v0_0_136.so").exists())) {
          b = false;
       }
    label_0054 :
       return b;
    }
    public final void f(String p0,boolean p1){
       String str;
       TKLoader tKLoader = TKLoader.class;
       if (PatchProxy.isSupport(tKLoader) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKLoader, "5")) {
          return;
       }
       if (p1) {
          str = this.a();
       }else {
          Application b = a.B;
          a.o(b, "AppEnv.APP");
          str = b.getApplicationInfo().nativeLibraryDir;
       }
       System.load(new File(str, p0).getAbsolutePath());
       return;
    }
    public final int g(){
       TKLoader obj = PatchProxy.apply(null, this, TKLoader.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.a.c();
    }
    public final void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLoader.class, "4")) {
          return;
       }
       TKLoader ta = this.a;
       _monitor_enter(ta);
       Log.g("Tachikoma", "loadTKRuntime");
       if (p0 != null) {
          this.a.a().add(p0);
       }
       if (!this.a.a().size()) {
          Log.g("Tachikoma", "No invoker, ignore load job tk_runtime");
          _monitor_exit(ta);
          return;
       }else if(this.a.c()){
          this.a.i(9);
          this.l();
       }else if(this.a.b() != null){
          this.a.i(8);
          this.k();
       }else if(this.e()){
          V8.loadNativeLibraries(new TKLoader$b(this, p0));
          if (this.a.c()) {
             this.a.i(9);
             this.l();
          }else if(this.a.b() != null){
             throw new Exception("Failed to load tkRuntime");
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final void i(boolean p0){
       File uFile;
       String absolutePath;
       TKLoader tKLoader = TKLoader.class;
       if (PatchProxy.isSupport(tKLoader) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKLoader, "6")) {
          return;
       }
       tKLoader = this.a;
       _monitor_enter(tKLoader);
       boolean b = false;
       this.c = b;
       if (this.a.c()) {
          _monitor_exit(tKLoader);
          return;
       }else if(p0){
          uFile = (this.a().length() > 0)? 1: null;
          if (uFile) {
             uFile = new File(this.a(), "libkwai-v8.so");
             if (uFile.exists()) {
                absolutePath = uFile.getAbsolutePath();
                a.o(absolutePath, "library.absolutePath");
                this.j(absolutePath, 2, true);
                _monitor_exit(tKLoader);
                return;
             }
          }
       }
    label_0057 :
       this.c = true;
       Application b1 = a.B;
       a.o(b1, "AppEnv.APP");
       uFile = new File(b1.getApplicationInfo().nativeLibraryDir, "libkwai-v8-lite.so");
       if (uFile.exists()) {
          absolutePath = uFile.getAbsolutePath();
          a.o(absolutePath, "library.absolutePath");
          this.j(absolutePath, true, b);
       }
       _monitor_exit(tKLoader);
       return;
    }
    public final void j(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TKLoader.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, TKLoader.class, "7")) {
          return;
       }
       System.load(p0);
       this.a.j(p1);
       p0.b = p2;
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, TKLoader.class, "12")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          TKLoader ta = this.a;
          a c = ta.c;
          a d = ta.d;
          Throwable throwable = ta.b();
          if (throwable == null) {
             throwable = new Exception("Unknown Error");
          }
          uob.b(c, d, throwable);
       }
       this.a.a().clear();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, TKLoader.class, "11")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.a.c());
       }
       this.a.a().clear();
       return;
    }
}
