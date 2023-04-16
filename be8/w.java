package be8.w;
import ma8.i;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.lang.StringBuilder;
import zi8.g1;
import com.mini.utils.g;

public class w	// class@000344
{
    public final i a;

    public void w(i p0){
       super();
       this.a = p0;
    }
    public File a(){
       Object obj = PatchProxy.apply(null, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return File.createTempFile("JPEG_"+new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date())+"_", ".jpg", this.g());
    }
    public File b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, ow, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "VIDEO_"+new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date())+"_";
       File uFile = PatchProxy.apply(objArray, this, ow, "3");
       if (uFile != patchProxyRe) {
       }else {
          uFile = new File(this.c(), "video");
          uFile.mkdirs();
       }
       return File.createTempFile(obj, ".mp4", uFile);
    }
    public final File c(){
       File obj = PatchProxy.apply(null, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(this.a.n());
       obj.mkdirs();
       return obj;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, w.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g1.a()+"";
    }
    public File e(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.n(), this.d()+g.z(p0.getAbsolutePath()));
    }
    public File f(){
       Object obj = PatchProxy.apply(null, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.c(), this.d()+".tmp");
    }
    public File g(){
       File obj = PatchProxy.apply(null, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(this.c(), "image");
       obj.mkdirs();
       return obj;
    }
}
