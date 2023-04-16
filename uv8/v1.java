package uv8.v1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;
import qkd.b;
import java.io.IOException;

public class v1	// class@002641
{

    public void v1(){
       super();
    }
    public static String a(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, v1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SystemUtil.P()) {
          try{
             obj = new File(a.b().getExternalFilesDir(null), "performance/startup/"+p0);
             if (obj.exists()) {
                return (b.f0(obj)).trim();
             }
          }catch(java.io.IOException e5){
             e5.printStackTrace();
          }
       }
    }
}
