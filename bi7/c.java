package bi7.c;
import bi7.b;
import java.lang.String;
import bi7.d;
import java.io.File;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONException;

public class c extends b	// class@000416
{

    public void c(){
       super();
    }
    public String a(){
       return "lut3d_render";
    }
    public boolean b(d p0,File p1,JSONObject p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p2.optString("lut_url");
       if (TextUtils.isEmpty(obj)) {
          return false;
       }
       String str = p2.optString("lut_file_md5");
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       int i = p2.optInt("lut_file_w", false);
       int i1 = p2.optInt("lut_file_h", false);
       if (!i || !i1) {
          return false;
       }
       p0.b(p1, "lut3d_render", obj, str);
       obj = p0.d(p1, "lut3d_render", obj, str);
       if (TextUtils.isEmpty(obj)) {
          return false;
       }
       File uFile = new File(obj);
       if (!uFile.exists()) {
          return false;
       }
       if (uFile.length() - (long)((i * i1) * 4)) {
          p0.a(p1, "lut3d_render", str);
          return false;
       }else {
          int i2 = 1;
          try{
             p2.put("lut_file", obj);
             p2.put("lut_from", i2);
          }catch(org.json.JSONException e11){
             e11.printStackTrace();
          }
          return i2;
       }
    }
}
