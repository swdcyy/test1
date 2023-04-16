package bv4.c;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.app.Activity;

public class c	// class@0003d5
{

    public void c(){
       super();
    }
    public static String a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return p0.getClass().getName()+"@"+Integer.toHexString(p0.hashCode());
    }
    public static String b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return p0.getClass().getName()+"@"+Integer.toHexString(p0.hashCode());
    }
}
