package k29.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import us7.z;
import java.lang.Boolean;
import whc.k0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qp7.x0;
import qp7.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import us7.y;
import k29.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qp7.d;
import us7.a;
import qp7.c;

public class b extends DispatchBaseElement	// class@002aa0
{
    public QPhoto t;
    public GifshowActivity u;
    public PhotoDetailParam v;
    public v3 w;
    public ThanosDetailBizParam x;
    public QPreInfo y;
    public k0 z;

    public void b(){
       super(d.i, null);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.u = p0.a;
          this.t = p0.j;
          d c = p0.c;
          this.v = c;
          this.y = c.getDetailCommonParam().mPreInfo;
          this.w = p0.d;
          this.x = p0.e;
       }
       return;
    }
    public a f0(a p0){
       z oz = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (oz != PatchProxyResult.class) {
       }else {
          oz = new z(p0);
       }
       return oz;
    }
    public void j0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.z = new k0(this.t, this.y, this.u);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          this.E().g();
          Object obj = PatchProxy.apply(objArray, this, uob, "4");
          g og = 1;
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else if(this.t.isMine() || w.g0(this.t.mEntity, 8)){
             obj = true;
          }else {
             obj = false;
          }
          if (obj) {
             this.E().j(3);
          }else {
             this.E().j(og);
          }
       }
       this.j(this.i.a(new a(this), Functions.e));
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, b.class, "8");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public c r(){
       y oy = PatchProxy.apply(null, this, b.class, "7");
       if (oy != PatchProxyResult.class) {
       }else {
          oy = new y();
       }
       return oy;
    }
}
