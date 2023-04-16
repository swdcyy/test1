package com.gifshow.kanim.network.e;
import eh.a;
import java.lang.Object;
import java.lang.String;
import com.gifshow.kanim.network.FileExtension;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class e	// class@0015c2
{
    public final a a;

    public void e(a p0){
       super();
       this.a = p0;
    }
    public static String a(String p0,FileExtension p1,boolean p2){
       StringBuilder obj;
       FileExtension extension;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, e.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "animation_cache_"+p0.replaceAll("\\W+", "");
       p0 = (p2)? p1.tempExtension(): p1.extension;
       return obj+p0;
    }
    public final File b(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(this.c(), e.a(p0, FileExtension.JSON, false));
       if (obj.exists()) {
          return obj;
       }
       obj = new File(this.c(), e.a(p0, FileExtension.ZIP, false));
       if (obj.exists()) {
          return obj;
       }
       return null;
    }
    public final File c(){
       File obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getCacheDir();
       if (obj.isFile()) {
          obj.delete();
       }
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public File d(String p0,InputStream p1,FileExtension p2){
       byte[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = new File(this.c(), e.a(p0, p2, true));
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       obj = new byte[1024];
       int i = p1.read(obj);
       while (i != -1) {
          uFileOutputS.write(obj, 0, i);
       }
       uFileOutputS.flush();
       uFileOutputS.close();
       p1.close();
       return uFile;
    }
}
