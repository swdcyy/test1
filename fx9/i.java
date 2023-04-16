package fx9.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2b.i3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import lnc.u1;
import fx9.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fx9.g;
import fx9.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import f9a.a;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import java.lang.Integer;
import sf5.f;
import fs4.h;
import qrd.l1;

public class i extends PresenterV2	// class@002374
{
    public RecyclerFragment p;
    public QPhoto q;
    public t r;
    public PhotoDetailParam s;
    public NasaBizParam t;
    public t u;
    public i3 v;
    public boolean w;
    public int x;
    public boolean y;

    public void i(){
       super();
       this.v = new i3();
       this.w = false;
       this.x = -1;
       this.y = false;
    }
    public void E8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, oi, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          oi = this.s;
          i = (oi == null)? -1: oi.getDetailLogParam().getRecoTabId();
       }
       this.x = i;
       if (i < 0) {
          return;
       }else {
          u1.a(this);
          g e = Functions.e;
          this.X7(this.r.subscribe(new h(this), e));
          this.X7(this.p.Vg().i().subscribe(new g(this), e));
          this.X7(this.u.subscribe(new f(this), e));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       if (this.x < null) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       if (this.w != null && this.y != null) {
          this.v.p();
       }else {
          this.v.g();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(RecyclerFragment.class);
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("COMMENT_HIDE_PANEL_OBSERVABLE");
       this.s = this.s8(PhotoDetailParam.class);
       this.t = this.s8(NasaBizParam.class);
       this.u = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       return;
    }
    public void onEventMainThread(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "7")) {
          return;
       }
       CommentsEvent b = p0.b;
       if (b != null && (b.equals(this.q) && p0.c == CommentsEvent$Operation.SEND)) {
          a a = a.a;
          i tq = this.q;
          p0 = p0.d;
          String str = (p0 == null)? "": p0.mComment;
          i tx = this.x;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(tq, str, Integer.valueOf(tx), a, a.class, "4")) {
             h oh = new h();
             f.a(oh, tq);
             oh.a = 14;
             oh.i = str;
             oh.b = 2;
             f.c("ks-reco-zt", tx, f.b(tq), oh);
          }
       }
    label_0064 :
       return;
    }
}
