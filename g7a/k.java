package g7a.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g7a.k$c;
import g7a.k$b;
import g7a.k$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f6a.c;
import androidx.fragment.app.Fragment;
import vy6.a;
import g7a.k$d;
import erd.g;
import crd.b;
import brd.t;
import g7a.k$e;
import g7a.k$f;
import g7a.k$g;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import java.util.Collection;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import io.reactivex.subjects.PublishSubject;

public final class k extends PresenterV2	// class@0023e8
{
    public final k$a A;
    public MilanoContainerEventBus p;
    public QPhoto q;
    public PhotoDetailParam r;
    public NasaBizParam s;
    public BaseFragment t;
    public PublishSubject u;
    public SlidePlayViewModel v;
    public i w;
    public int x;
    public final k$c y;
    public final k$b z;

    public void k(){
       super();
       this.y = new k$c(this);
       this.z = new k$b(this);
       this.A = new k$a(this);
    }
    public static final BaseFragment P8(k p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final MilanoContainerEventBus R8(k p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mMilanoContainerEventBus");
       }
       return p0;
    }
    public static final NasaBizParam S8(k p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mNasaBizParam");
       }
       return p0;
    }
    public static final QPhoto V8(k p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final SlidePlayViewModel W8(k p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (!c.j(tq, true)) {
          return;
       }else {
          tq = this.t;
          String str = "mFragment";
          if (tq == null) {
             a.S(str);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
          this.v = slidePlayVie;
          if (slidePlayVie == null) {
             a.S("mSlidePlayViewModel");
          }
          k tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          slidePlayVie.P(tt, this.A);
          tq = this.p;
          str = "mMilanoContainerEventBus";
          if (tq == null) {
             a.S(str);
          }
          this.X7(tq.G.subscribe(new k$d(this)));
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          this.X7(tq.H.subscribe(new k$e(this)));
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          this.X7(tq.I.subscribe(new k$f(this)));
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          this.X7(tq.J.subscribe(new k$g(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tv = this.v;
       if (tv != null) {
          if (tv == null) {
             a.S("mSlidePlayViewModel");
          }
          k tt = this.t;
          if (tt == null) {
             a.S("mFragment");
          }
          tv.D(tt, this.A);
       }
       return;
    }
    public final List X8(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(d.i(iterator.next(), HeadImageSize.MIDDLE));
       }
       return obj;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BOTTOM_BAR";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       k tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tq.mEntity);
       k tt = this.t;
       if (tt == null) {
          a.S("mFragment");
       }
       u1.M("", tt, 0, uElementPack, uContentPack, null);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       Object obj = this.q8(MilanoContainerEventBus.class);
       a.o(obj, "inject\(MilanoContainerEventBus::class.java\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.s = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("SLIDE_PLAY_SHOW_COMMENT_DIALOG");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_SHOW_COMMENT_DIALOG\)");
       this.u = obj;
       return;
    }
}
