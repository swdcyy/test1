package hb2.n;
import hb2.a;
import im8.g;
import vl8.c;
import android.view.View;
import android.content.Context;
import k51.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import k51.b;
import ks5.b;
import ks5.c;
import hb2.o;
import java.util.Map;
import java.util.HashMap;
import hb2.m;

public class n extends c implements a, g	// class@002d4f
{
    public View c;
    public boolean d;
    public b e;
    public c f;

    public void n(View p0){
       super();
       boolean b = false;
       this.d = b;
       Context context = p0.getContext();
       Object obj = PatchProxy.apply(null, null, a.class, "13");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveSideBarPendantJankOpt", b);
       this.c = b.g(context, 0x7f0d0d1c, b);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       if (this.d != null) {
          n te = this.e;
          if (te != null) {
             this.f.c(te);
             this.d = false;
          }
       }
       return;
    }
    public boolean H(){
       return this.d;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(n.class, new o());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public View i(){
       return this.c;
    }
    public boolean o(){
       return true;
    }
    public void y(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "1")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       if (this.e == null) {
          n tc = this.c;
          m om = PatchProxy.applyOneRefs(tc, this, on, "3");
          if (om != PatchProxyResult.class) {
          }else {
             om = new m(this, tc);
          }
          this.e = om;
       }
       this.f.b(this.e);
       this.d = true;
       return;
    }
}
