package bi7.f;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Exception;

public class f	// class@00041b
{

    public void f(){
       super();
    }
    public static String a(File p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       String obj = null;
       byte[] obj1 = PatchProxy.applyOneRefs(p0, obj, uof, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (!p0.isFile()) {
          return obj;
       }
       int i = 1024;
       byte[] uobyteArray = new byte[i];
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          FileInputStream uFileInputSt = new FileInputStream(p0);
          int i1 = uFileInputSt.read(uobyteArray, 0, i);
          while (i1 != -1) {
             instance.update(uobyteArray, 0, i1);
          }
          uFileInputSt.close();
          obj1 = instance.digest();
          Object obj2 = PatchProxy.applyOneRefs(obj1, obj, uof, "2");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             String str = "";
             if (obj1 != null && obj1.length > 0) {
                for (int i2 = 0; i2 < obj1.length; i2 = i2 + 1) {
                   int i3 = obj1[i2] & 0x00ff;
                   obj = Integer.toHexString(i3);
                   if (obj.length() < 2) {
                      str = str+0;
                   }
                   str = str+obj;
                }
                obj = str;
             }
          }
          return obj;
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          return obj;
       }
    }
}
