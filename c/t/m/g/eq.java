package c.t.m.g.eq;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import dalvik.system.DexClassLoader;
import c.t.m.g.ex;
import java.lang.String;
import c.t.m.g.fj;
import java.lang.StringBuilder;
import c.t.m.g.ff;
import java.io.File;
import c.t.m.g.fd;
import java.util.ArrayList;
import java.util.Iterator;
import c.t.m.g.ev;
import java.lang.System;
import java.lang.Class;
import java.lang.ClassLoader;
import c.t.m.g.en;
import java.lang.Throwable;
import java.lang.CharSequence;

public class eq	// class@000c76
{
    public String a;
    public Context b;

    public void eq(Context p0){
       super();
       this.a = "ModuleLoadImpl";
       this.b = p0;
    }
    public DexClassLoader a(List p0){
       String str = null;
       if (ex.a) {
          ex.a(this.a, "start to load private dir comps");
       }
       fj.c = fj.a(p0);
       if (ex.a) {
          ex.a(this.a, "complist loading : "+fj.c);
       }
       String str1 = fj.b(this.b, "TMLSDK_hp");
       File uFile = fj.a(this.b, ff.c);
       String absolutePath = uFile.getAbsolutePath();
       if (ex.a) {
          ex.a(this.a, "odex path is existed ,"+uFile.exists()+","+uFile.isDirectory()+","+absolutePath);
          ex.a(this.a, "dex path,"+str1);
       }
       StringBuilder str2 = "";
       int i = fd.a(this.b).a();
       fj.d.clear();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ev uoev = iterator.next();
          if (uoev != null && !fj.a(uoev.a)) {
             str2 = str2+str1+File.separator+uoev.e+".dex"+File.pathSeparator;
          }else if(uoev != null && fj.a(uoev.a)){
             int i1 = uoev.a % ff.j;
             if (i1 == i) {
                String str3 = str1+File.separator+uoev.e+".so";
                fj.d.add(str3);
                if (ex.a) {
                   ex.a(this.a, "save so path,"+str3);
                }
             }
          }
       }
       if (ex.a) {
          ex.a(this.a, "prepare load dex file path -> "+str2);
          for (int i2 = 0; i2 < fj.d.size(); i2++) {
             ex.a(this.a, "dest_so£º"+fj.d.get(i2));
          }
       }
       long l = System.currentTimeMillis();
       DexClassLoader uDexClassLoa = new DexClassLoader(str2, absolutePath, str, this.getClass().getClassLoader());
       if (ex.a) {
          ex.a(this.a, "class loader is success!!");
       }
       if (ex.a) {
          ex.a(this.a, "new DexClassLoader consume time :"+(System.currentTimeMillis() - l));
       }
       en.a(this.b).a("MLS", "classLoader suc:"+(System.currentTimeMillis() - l)+","+fj.c);
       DexClassLoader uDexClassLoa1 = uDexClassLoa;
       return uDexClassLoa1;
    }
}
