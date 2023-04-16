package com.yxcorp.gifshow.tti.module.b;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.tti.module.FiltersInitModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import lxc.c;
import u3b.a;
import q87.c;
import qkd.b;
import java.lang.Throwable;

public final class b implements Runnable	// class@001dd4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       Object[] objArray1;
       Object[] objArray2;
       if (PatchProxy.applyVoid(null, null, FiltersInitModule.class, "2")) {
       }else {
          File uFile = new File(b.a(-1504323719).k()+"/filter_resource/");
          File uFile1 = new File(c.a());
          if (uFile.exists()) {
             a uoa = a.C();
             String str = "migrateFilter "+uFile.getAbsolutePath()+" "+uFile1.getAbsolutePath();
             Object[] objArray = new Object[0];
             try{
                uoa.w("FiltersInitModule", str, objArray);
                if (!uFile1.exists() || (uFile1.list().length <= 0 && uFile.renameTo(uFile1))) {
                   objArray2 = new Object[0];
                   a.C().w("FiltersInitModule", "migrateFilter rename done", objArray2);
                }else {
                   b.c(uFile, uFile1);
                   objArray2 = new Object[0];
                   a.C().w("FiltersInitModule", "migrateFilter copyDirectory done", objArray2);
                }
             }catch(java.lang.Exception e1){
                a.C().e("FiltersInitModule", "migrateFilter copyDirectory", e1);
             }
             try{
                b.p(uFile);
                objArray1 = new Object[0];
                a.C().w("FiltersInitModule", "migrateFilter deleteDirectory done", objArray1);
             }catch(java.lang.Exception e0){
                a.C().v("FiltersInitModule", "migrateFilter deleteDirectory", e0);
             }
          }else {
             objArray1 = new Object[0];
             a.C().w("FiltersInitModule", "migrateFilter old resource not exist "+uFile.getAbsolutePath(), objArray1);
          }
       }
    }
}
