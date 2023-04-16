package ac8.b;
import com.mini.widget.actionsheet.a$d;
import com.mini.js.jsapi.ui.c;
import ja8.c;
import ja8.e;
import ma8.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import zi8.d0;
import com.mini.js.helper.a;
import na8.a;
import ma8.g;
import ma8.i;
import java.lang.Boolean;

public class b implements a$d	// class@000060
{
    public final c a;
    public final e b;
    public final n c;
    public final c d;

    public void b(c p0,c p1,e p2,n p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(int p0){
       JSONObject jSONObject;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       b tb = this.b;
       b td = this.d;
       Objects.requireNonNull(td);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          jSONObject = PatchProxy.applyOneRefs(Integer.valueOf(p0), td, uoc, "3");
          if (jSONObject != PatchProxyResult.class) {
          label_0046 :
             uob.a(a.f(tb, true, jSONObject, null, false));
             this.d.b.h().N1(this.c);
             return;
          }
       }
       jSONObject = new JSONObject();
       d0.m(jSONObject, "tapIndex", Integer.valueOf(p0));
       goto label_0046 ;
    }
    public void onCancel(){
       String str;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       b tb = this.b;
       if (PatchProxy.isSupport(a.class)) {
          Boolean fALSE = Boolean.FALSE;
          str = PatchProxy.applyThreeRefs(tb, fALSE, fALSE, null, a.class, "3");
          if (str != PatchProxyResult.class) {
          label_003a :
             ta.a(str);
             this.d.b.h().N1(this.c);
             return;
          }
       }
       str = a.l(tb, false, null, "", 0, -1, 0);
       goto label_003a ;
    }
}
