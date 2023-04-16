package ax.a;
import java.lang.Object;
import android.content.Context;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import yx.j0;
import java.io.IOException;

public class a	// class@00021b
{

    public void a(){
       super();
    }
    public static File a(Context p0){
       File cacheDir;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       File obj2 = PatchProxy.apply(obj, obj, uoa, "2");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else {
          cacheDir = null;
          try{
             obj2 = a.b().getFilesDir();
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[cacheDir];
             j0.c("AdStorageUtils", "getPrivateFilesDir getFilesDir error:"+e1.toString(), objArray);
             obj2 = obj;
          }
          if (obj2 != null) {
             File uFile = new File(obj2, "kssplash");
             if (!uFile.exists()) {
                if (uFile.mkdirs()) {
                   try{
                      new File(uFile, ".nomedia").createNewFile();
                   }catch(java.io.IOException e1){
                      Object[] objArray1 = new Object[cacheDir];
                      j0.c("AdStorageUtils", "getPrivateFilesDir new file error:"+e1.toString(), objArray1);
                   }
                }
             }
          }
       }
       if (obj == null) {
          cacheDir = p0.getCacheDir();
          if (cacheDir == null) {
             cacheDir = new File("/data/data/"+p0.getPackageName()+"/"+"cache_v1"+"/");
          }
          obj = new File(cacheDir, "kssplash");
       }
       return obj;
    }
}
