package cz1.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.w0;

public class a	// class@001ecf
{

    public void a(){
       super();
    }
    public static String a(Intent p0,int p1){
       String str;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.hasExtra("courseChannel")) {
          return p0.getStringExtra("courseChannel");
       }else if(p1){
          if (p1 != 4) {
             if (p1 != 6) {
                str = (p1 != 16)? "fromPhoto": "fromProfilePhoto";
             }else {
                str = "fromNearby";
             }
          }else {
             str = "fromFollow";
          }
          return str;
       }else if(p0.getData() != null){
          return w0.a(p0.getData(), "courseChannel");
       }else {
          return null;
       }
    }
}
