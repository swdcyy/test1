package ac8.p;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.s;
import ja8.e;
import ja8.c;
import java.lang.Object;
import na8.a;
import ma8.g;
import ma8.i;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.reflect.Type;
import gc8.a;
import com.mini.js.helper.a;
import com.mini.js.jscomponent.navigationbar.NavigationView;

public final class p implements Runnable	// class@00006e
{
    public final s b;
    public final e c;
    public final c d;

    public void p(s p0,e p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       NavigationView navigationVi;
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       g og = tb.b.h();
       String str = tc.g();
       Object obj = PatchProxy.applyOneRefs(str, tb, s.class, "7");
       if (obj != PatchProxyResult.class) {
       }else {
          try{
             obj = new JSONObject(str).opt("title");
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
             obj = null;
          }
       }
    }
}
