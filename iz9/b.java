package iz9.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import iz9.b$a;
import nsd.u;
import jh5.a;
import tr7.b;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import vr7.c;
import java.lang.Boolean;
import p5a.e;
import de5.a;
import p5a.c;
import qp7.g;
import qp7.b;
import tr7.c;
import iz9.b$b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import iz9.b$c;
import uw9.o;
import java.lang.StringBuilder;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import brd.y;
import com.kwai.framework.player.core.b;
import qp7.d;
import vr7.a;
import rf5.u;
import qp7.c;
import vr7.b;

public final class b extends DispatchBaseElement	// class@0028da
{
    public BaseFragment t;
    public a u;
    public PhotoDetailParam v;
    public QPhoto w;
    public u x;
    public c y;
    public boolean z;
    public static final b$a A;

    static {
       b.A = new b$a(null);
    }
    public void b(a p0){
       super(b.b, p0);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          this.t = p0.b;
          this.u = p0.j;
          a c = p0.c;
          this.v = c;
          a uoa = null;
          PhotoDetailParam mPhoto = (c != null)? c.mPhoto: uoa;
          this.w = mPhoto;
          m0 v = p0.v;
          if (v != null) {
             uoa = v.R;
          }
          this.x = uoa;
          this.y = p0.E;
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
    public a f0(a p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(p0);
       }
       return uoc;
    }
    public void j0(boolean p0){
       g e;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.o0("bind");
       if (this.w != null) {
          b tu = this.u;
          if (tu != null) {
             e player = tu.getPlayer();
             if (player == null || player.j() != true) {
             }
          }else {
          }
       }
    label_005e :
       return;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "4")) {
          return;
       }
       this.o0("destroy");
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "3")) {
          return;
       }
       this.o0("unbind");
       return;
    }
    public final void n0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = p0+"  [loading:"+this.z+",isUse8:"+this.H().X()+';'+' ';
       b tw = this.w;
       String str1 = null;
       tw = (tw != null)? tw.getUserName(): str1;
       str = str+tw+", ";
       tw = this.w;
       if (tw != null) {
          str1 = tw.getPhotoId();
       }
       Object[] objArray = new Object[0];
       oo.s("PlayLoadingElement", str+str1+']', objArray);
       return;
    }
    public final void o0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (this.z != null) {
          this.z = false;
          Object[] objArray = new Object[false];
          o.C().s("PlayLoadingElement", "stopLoading "+p0, objArray);
       }
       this.q0("stopLoading");
       b ty = this.y;
       if (ty != null) {
          ty.onNext(Boolean.FALSE);
       }
       return;
    }
    public final void p0(boolean p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "11")) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, uob, "12")) {
             b tu = this.u;
             if (tu != null) {
                e player = tu.getPlayer();
                if (player == null || player.isPaused() != true) {
                }
             }else {
             }
          }
       }else if(PatchProxy.applyVoidOneRefs(p1, this, uob, "13")){
          this.b0();
          this.n0("hide loading because "+p1);
       }
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, b.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (this.H().X()) {
          this.p0(this.z, p0);
       }else {
          b = true;
          if (this.z != null) {
             b tx = this.x;
             if (tx != null && tx.w() == b) {
             label_002e :
                this.p0(b, p0);
             }
          }
          b = false;
          goto label_002e ;
       }
       return;
    }
    public c r(){
       b uob = PatchProxy.apply(null, this, b.class, "6");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
}
