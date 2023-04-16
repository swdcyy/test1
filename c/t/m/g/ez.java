package c.t.m.g.ez;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.fk;
import c.t.m.g.be;
import java.lang.String;
import c.t.m.g.cb;
import c.t.m.g.en;
import c.t.m.g.et;
import c.t.m.g.fd;
import c.t.m.g.es;
import java.lang.NullPointerException;
import java.lang.ClassLoader;
import c.t.m.g.ex;
import dalvik.system.PathClassLoader;
import c.t.m.g.ey;
import dalvik.system.DexClassLoader;
import java.lang.StringBuilder;
import java.lang.System;
import c.t.m.g.fe;
import java.lang.Throwable;
import c.t.m.g.fj;
import java.util.ArrayList;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ez	// class@000c83
{
    public es d;
    public boolean e;
    public static String a = "SDKPluginsManager";
    public static ez b;
    public static Context c;

    public void ez(Context p0){
       super();
       this.e = false;
       ez.c = p0;
       try{
          fk.a = p0;
          be.a(p0);
          fk.d = cb.d();
          en.a(p0).b();
          et.a(p0).a();
          fd.a(p0);
          this.d = new es(ez.c);
          this.b(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static synchronized ez a(Context p0){
       _monitor_enter(ez.class);
       if (ez.b == null) {
          if (p0 != null) {
             if (p0.getApplicationContext() != null) {
                ez.b = new ez(p0.getApplicationContext());
             }else {
                throw new NullPointerException("application context is null");
             }
          }else {
             throw new NullPointerException("context is null");
          }
       }
       _monitor_exit(ez.class);
       return ez.b;
    }
    public synchronized ClassLoader a(){
       ClassLoader uClassLoader = this.d.a();
       this.a(uClassLoader);
       return uClassLoader;
    }
    public final void a(ClassLoader p0){
       if (this.e != null) {
          if (ex.a) {
             ex.a(ez.a, "so has already load,return directly");
          }
          return;
       }else if(p0 instanceof PathClassLoader){
          if (this.a(ez.c, ey.a)) {
             this.e = true;
          }
       }else if(p0 instanceof DexClassLoader && !this.b()){
          this.e = true;
       }
       return;
    }
    public final boolean a(Context p0,String[] p1){
       StringBuilder str = "MLSS";
       boolean i = 0;
       int i1 = 0;
       while (i < p1.length) {
          object oobject = p1[i];
          if (ex.a) {
             ex.a(ez.a, "loadAPKSo,"+oobject);
          }
          System.loadLibrary(oobject);
          i1 = i1 + 1;
          en.a().a(str, oobject+",apk,0");
          i = i + 1;
       }
       if (ex.a) {
          String a = ez.a;
          str = "loadAPKSo result : ";
          i = (i1 == p1.length)? true: false;
          ex.a(a, str+i+"sucNum:"+i1);
       }
       if (i1 == p1.length) {
          return true;
       }else {
          return false;
       }
    }
    public final int b(){
       String str3;
       String str = "load so error: ";
       String str1 = "MLSS";
       if (ex.a) {
          ex.b(ez.a, "start load so");
       }
       if (!fj.d.size()) {
          if (ex.a) {
             ex.b(ez.a, "dexclassloader is null !!!");
          }
          en.a().a(str1, "hot,2");
          return 2;
       }else {
          boolean b = false;
          int i = 0;
          String str2 = null;
          while (true) {
             if (i < fj.d.size()) {
                str3 = fj.d.get(i);
                if (ex.a) {
                   ex.b(ez.a, "SO path :"+str3);
                }
                File uFile = new File(str3);
                if (uFile.exists() && uFile.isFile()) {
                   if (str3.length() >= 128) {
                      if (ex.a) {
                         ex.b(ez.a, "SO path length >= 128 "+str3);
                         break ;
                      }
                      break ;
                   }else {
                      System.load(str3);
                      if (ex.a) {
                         ex.b(ez.a, "so load ok "+str3);
                      }
                      en.a().a(str1, str3+",ok");
                      str2 = str2 + 1;
                   }
                }
                i = i + 1;
             }else if(str2 == fj.d.size()){
                if (ex.a) {
                   ex.b(ez.a, "so load all is ok ");
                }
                return b;
             }else {
                en.a().a(str1, "hot,5");
                if (ex.a) {
                   ex.b(ez.a, str);
                }
                return 5;
             }
          }
          en.a().a(str1, str3+",4");
          return 4;
       }
    }
    public final void b(Context p0){
       if (ex.a) {
          new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
          ex.a(p0, new File(ex.a(p0, "module_log")));
       }
       return;
    }
}
