package f4a.k0;
import agc.e;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.util.Map;
import agc.d;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.q;
import f4a.r;
import com.yxcorp.utility.TextUtils;
import agc.a;

public class k0 implements e	// class@0022ae
{

    public void k0(){
       super();
    }
    public String a(){
       return "webview";
    }
    public boolean b(Uri p0,Map p1){
       return d.b(this, p0, p1);
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k0.class, "2")) {
          return;
       }
       if (q.h(p1)) {
          return;
       }
       String str = "merchantResumePlay";
       if (p1.containsKey(str) && ("1").equals(p1.get(str))) {
          r.a().c(true);
       }
       a.c(p0, TextUtils.e("kwai://webview", p1), p2);
       return;
    }
    public String getPath(){
       return "";
    }
}
