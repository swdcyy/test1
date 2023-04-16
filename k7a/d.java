package k7a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k7a.d$a;
import k7a.d$b;
import k7a.a;
import k7a.b;
import k7a.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import p5a.e;
import de5.a;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import k7a.c;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kwai.component.tti.monitor.TTIData;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.slideplay.PreloadInfo;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.util.rx.RxBus;
import e6a.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@002c0c
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final AwesomeCacheCallback F;
    public final a G;
    public final b$b H;
    public final IMediaPlayer$OnInfoListener I;
    public final Runnable J;
    public QPhoto p;
    public a q;
    public List r;
    public f s;
    public List t;
    public PublishSubject u;
    public MilanoContainerEventBus v;
    public BaseFragment w;
    public SlidePlayViewModel x;
    public long y;
    public boolean z;

    public void d(){
       super();
       this.F = new d$a(this);
       this.G = new d$b(this);
       this.H = new a(this);
       this.I = new b(this);
       this.J = new d$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       if (!this.R8()) {
          return;
       }
       d tw = this.w;
       if (tw != null) {
          this.x = SlidePlayViewModel.S0(tw.getParentFragment());
       }
       this.reset();
       tw = this.x;
       if (tw != null) {
          tw.P(this.w, this.G);
       }else {
          tw = this.r;
          if (tw != null) {
             tw.add(this.G);
          }
       }
       this.q.getPlayer().addAwesomeCallBack(this.F);
       this.q.getPlayer().w(this.H);
       this.q.getPlayer().addOnInfoListener(this.I);
       this.X7(this.v.x.subscribe(new c(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.y = SlidePerformanceExp.f();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.p != null && this.R8()) {
          this.reset();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.W8();
       this.q.getPlayer().O(this.H);
       if (this.I != null) {
          this.q.getPlayer().removeOnInfoListener(this.I);
       }
       d tx = this.x;
       if (tx != null) {
          tx.D(this.w, this.G);
       }else {
          tx = this.r;
          if (tx != null) {
             tx.remove(this.G);
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       if (TTIData.getInstance().isOverTTITime()) {
          this.S8();
       }else {
          Object[] objArray = new Object[0];
          o.C().t("SlidePreloadEmitter", "schedule preload  "+this.p.getUserName(), objArray);
          this.C = true;
          e.f(this.J, "schedulePreloadEmitter", 0, true);
       }
       return;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.p.isVideoType() || f.h())? true: false;
       return b;
    }
    public void S8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "10")) {
          return;
       }
       if (this.B == null) {
          boolean b = true;
          this.B = b;
          this.t.add(Integer.valueOf((this.s.get().intValue() + b)));
          String str = "preload";
          if (!PatchProxy.applyVoidOneRefs(str, this, uod, "12")) {
             o oo = o.C();
             StringBuilder str1 = "Emitter "+str+", photoId = ";
             d tp = this.p;
             String str2 = "null";
             str = (tp == null)? str2: tp.getPhotoId();
             str1 = str1+str+" userName = ";
             tp = this.p;
             if (tp != null) {
                str2 = tp.getUserName();
             }
             Object[] objArray = new Object[false];
             oo.w("SlidePreloadEmitter", str1+str2+", index = "+this.s.get(), objArray);
          }
          this.u.onNext(new PreloadInfo((this.s.get().intValue() + b), false));
          RxBus.f.b(new d(this.p));
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (this.C == null && this.B == null) {
          this.P8();
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       this.C = false;
       e.c(this.J);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       this.s = this.x8("DETAIL_PHOTO_INDEX");
       this.t = this.r8("DETAIL_PENGING_PRELOAD_LIST");
       this.u = this.r8("DETAIL_PRELOAD_EVENT");
       this.w = this.t8("DETAIL_FRAGMENT");
       this.v = this.q8(MilanoContainerEventBus.class);
       return;
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       this.W8();
       this.C = false;
       this.B = false;
       this.z = false;
       this.D = false;
       this.E = false;
       d tq = this.q;
       if (tq != null) {
          tq.getPlayer().removeAwesomeCallBack(this.F);
       }
       return;
    }
}
