package nj7.c;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public class c	// class@001f4e
{
    public static Context a;

    public void c(){
       super();
    }
    public static File a(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       return new File(c.b(p0, p1), String.format("%s_%d.apk", objArray));
    }
    public static File b(String p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       File uFile = PatchProxy.applyOneRefs(p0, null, uoc, "3");
       if (uFile != patchProxyRe) {
       }else {
          uFile = new File(c.f(), p0);
       }
       return new File(uFile, String.valueOf(p1));
    }
    public static File c(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       return new File(c.b(p0, p1), String.format("mark", objArray));
    }
    public static File d(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new File(c.b(p0, p1), "odex");
    }
    public static File e(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new File(c.b(p0, p1), "so");
    }
    public static File f(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a.getDir("DvaPlugin", 0);
    }
}
