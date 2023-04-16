package fc2.f;
import fc2.b;
import im8.g;
import vl8.c;
import android.content.Context;
import android.view.View$OnClickListener;
import fc2.f$a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import fc2.a;
import com.kwai.robust.PatchProxyResult;
import fc2.g;
import java.util.Map;
import java.util.HashMap;
import rq5.a;
import pq5.c;
import ks5.i;
import java.lang.Boolean;

public class f extends c implements b, g	// class@002931
{
    public final Context c;
    public final View$OnClickListener d;
    public c e;
    public LiveBaseLuckyStarPendantView f;
    public a g;

    public void f(Context p0,View$OnClickListener p1){
       super();
       this.g = new f$a(this);
       this.c = p0;
       this.d = p1;
    }
    public void f(long p0,CDNUrl[] p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, f.class, "5")) {
          return;
       }
       f tf = this.f;
       if (tf != null) {
          tf.e(p0);
       }
       return;
    }
    public void g(CDNUrl[] p0){
       a.a(this, p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(f.class, new g());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tf = this.f;
       if (tf != null) {
          tf.c();
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.f != null) {
          f te = this.e;
          if (te != null) {
             te.Jg(this.g);
             this.f.b();
             this.f = null;
          }
       }
       return;
    }
    public void w(i p0,boolean p1,boolean p2,CDNUrl[] p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, f.class, "2")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       this.s();
       this.e.gj(this.g);
       return;
    }
}
