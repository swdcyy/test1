package com.yxcorp.gifshow.encode.c1;
import java.util.concurrent.Callable;
import pca.h2;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.encode.RxExportApi;
import pca.g2;
import java.io.FilenameFilter;

public final class c1 implements Callable	// class@000d12
{
    public final h2 b;

    public void c1(h2 p0){
       this.b = p0;
    }
    public final Object call(){
       Object[] objArray1;
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       File obj = PatchProxy.apply(null, tb, h2.class, "6");
       String str = "";
       if (obj != PatchProxyResult.class) {
          str = obj;
       }else {
          obj = tb.c();
          if (obj.isFile()) {
             Object[] objArray = new Object[0];
             a.D().w("RxExportTask", "findUsableCache: hit cache directly "+obj, objArray);
             str = obj.getAbsolutePath();
          }else if(tb.p == null){
             obj = RxExportApi.d();
             long l = tb.b();
             String[] stringArray = obj.list(new g2(tb.a(), l));
             if (stringArray == null || !stringArray.length) {
                objArray1 = new Object[0];
                a.D().w("RxExportTask", "findUsableCache: cant find cache "+tb, objArray1);
             }else {
                str = obj.getAbsolutePath()+File.separator+stringArray[0];
                objArray1 = new Object[0];
                a.D().w("RxExportTask", "findUsableCache: find a cache exportDuration="+l+" cache="+str, objArray1);
             }
          }
       }
       return str;
    }
}
