package com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import ekd.y0;
import g7a.d;
import java.lang.Runnable;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import g7a.c;
import erd.g;
import crd.b;
import brd.t;
import g7a.b;
import g7a.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import de5.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import brd.y;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@001855
{
    public a A;
    public boolean B;
    public PublishSubject C;
    public SlidePlayViewModel D;
    public final a E;
    public boolean p;
    public long q;
    public MilanoContainerEventBus r;
    public BaseFragment s;
    public QPhoto t;
    public t u;
    public int v;
    public NasaBizParam w;
    public y x;
    public t y;
    public y0 z;

    public void a(){
       super();
       this.p = false;
       this.E = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.s.getParentFragment());
       this.D = slidePlayVie;
       slidePlayVie.P(this.s, this.E);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          this.z = new y0(this.R8(), new d(this));
       }
       this.X7(this.r.q.subscribe(new c(this)));
       uoa = this.y;
       if (uoa != null) {
          this.X7(uoa.subscribe(new b(this)));
       }
       uoa = this.C;
       if (uoa != null) {
          this.X7(uoa.subscribe(new a(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tz = this.z;
       if (tz != null) {
          tz.e();
          this.z = null;
       }
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.D.q(this.v);
    }
    public final long R8(){
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (Build$VERSION.SDK_INT >= 24) {
          obj = this.t;
          if (obj != null && obj.getVideoDuration() > 0) {
             if (this.t.getVideoDuration() - 0xea60 > 0) {
                return 200;
             }else {
                return 60;
             }
          }
       }
       return 200;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(MilanoContainerEventBus.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.q8(QPhoto.class);
       this.u = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       this.v = this.r8("DETAIL_PHOTO_INDEX").intValue();
       this.A = this.q8(a.class);
       this.w = this.q8(NasaBizParam.class);
       this.x = this.r8("NASA_BOTTOM_EDITOR_OPERATION_OBSERVER");
       this.y = this.t8("NASA_BOTTOM_EDITOR_UPDATE_AT_BUTTON_ALPHA_OBSERVABLE");
       this.C = this.t8("SERIAL_PAY_PANEL_SHOW");
       return;
    }
}
