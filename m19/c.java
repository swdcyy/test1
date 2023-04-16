package m19.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m19.c$a;
import m19.c$b;
import m19.b;
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
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import le5.f;
import im8.f;
import java.lang.Integer;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.detail.slideplay.PreloadInfo;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class c extends PresenterV2	// class@002ddf
{
    public boolean A;
    public boolean B;
    public final AwesomeCacheCallback C;
    public final a D;
    public final b$b E;
    public QPhoto p;
    public a q;
    public f r;
    public List s;
    public f t;
    public List u;
    public PublishSubject v;
    public BaseFragment w;
    public PhotoDetailLogger x;
    public long y;
    public boolean z;

    public void c(){
       super();
       this.C = new c$a(this);
       this.D = new c$b(this);
       this.E = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       this.reset();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.w.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.P(this.w, this.D);
       }else {
          c ts = this.s;
          if (ts != null) {
             ts.add(this.D);
          }
       }
       this.q.getPlayer().addAwesomeCallBack(this.C);
       this.q.getPlayer().w(this.E);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.y = SlidePerformanceExp.f();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.P8()) {
          this.reset();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.q.getPlayer().O(this.E);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.p.isVideoType() || f.h())? true: false;
       return b;
    }
    public void R8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "7")) {
          return;
       }
       if (this.B == null && this.r.get().booleanValue()) {
          this.B = true;
          this.u.add(Integer.valueOf((this.t.get().intValue() + true)));
          String str = "preload";
          if (!PatchProxy.applyVoidOneRefs(str, this, uoc, "9")) {
             StringBuilder str1 = "Emitter "+str+", photoId = ";
             c tp = this.p;
             String str2 = "null";
             str = (tp == null)? str2: tp.getPhotoId();
             str1 = str1+str+" userName = ";
             tp = this.p;
             if (tp != null) {
                str2 = tp.getUserName();
             }
             Object[] objArray = new Object[false];
             j0.f("ADSlidePreload", str1+str2+" is ad", objArray);
          }
          this.v.onNext(new PreloadInfo((this.t.get().intValue() + true), false));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.x8("DETAIL_ENABLE_SLIDE_PLAY");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.x8("DETAIL_PHOTO_INDEX");
       this.u = this.r8("DETAIL_PENGING_PRELOAD_LIST");
       this.v = this.r8("DETAIL_PRELOAD_EVENT");
       this.w = this.r8("DETAIL_FRAGMENT");
       this.x = this.r8("DETAIL_LOGGER");
       return;
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.B = false;
       this.z = false;
       c tq = this.q;
       if (tq != null) {
          tq.getPlayer().removeAwesomeCallBack(this.C);
       }
       return;
    }
}
