package etb.c;
import java.lang.Runnable;
import etb.d;
import java.util.List;
import java.lang.Object;
import htb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import org.json.JSONArray;
import htb.a;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import k2b.f3;
import k2b.e0;

public final class c implements Runnable	// class@0027ec
{
    public final d b;
    public final List c;

    public void c(d p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       try{
          c tc = this.c;
          d q = this.b.q;
          if (PatchProxy.applyVoidTwoRefs(q, tc, null, c.class, "7")) {
          }else {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("tab_id_list", new JSONArray(q.g(tc, a.a)));
             f3 uof3 = f3.l(null, "NOTIFICATION_BOX_LIST_TAB");
             uof3.m(jSONObject.toString());
             uof3.h(e0);
          }
       }catch(org.json.JSONException e0){
       }
       return;
    }
}
