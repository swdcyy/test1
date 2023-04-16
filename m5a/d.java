package m5a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m5a.d$a;
import m5a.d$b;
import m5a.d$c;
import m5a.d$d;
import m5a.d$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ml8.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uw9.j;
import ge5.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import xf6.d;
import joc.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import vy6.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.database.DataSetObserver;
import java.util.List;
import jta.c;
import r7a.f;
import m5a.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import rf5.u;
import joc.q;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import brd.y;
import joc.b0;
import w85.a;

public class d extends PresenterV2	// class@002f40
{
    public List A;
    public f B;
    public NasaBizParam C;
    public SlidePlayViewModel D;
    public GifshowActivity E;
    public d F;
    public g G;
    public boolean H;
    public t I;
    public boolean J;
    public final a K;
    public boolean L;
    public final DataSetObserver M;
    public final m$d N;
    public final d O;
    public final c P;
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public a s;
    public List t;
    public f u;
    public y v;
    public b0 w;
    public f x;
    public NormalDetailBizParam y;
    public u z;

    public void d(){
       super();
       this.K = new d$a(this);
       this.M = new d$b(this);
       this.N = new d$c(this);
       this.O = new d$d(this);
       this.P = new d$e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.E = j.a(this);
       d tF = this.F;
       if (tF != null) {
          this.G = tF.c;
          tF = this.y;
          if (tF != null && (tF.mFromSlidePlayPhotoClick != null && (this.p.isAtlasPhotos() || this.p.isLongPhotos()))) {
             this.F.b.x(d.u());
          }
       }
       tF = this.r;
       if (tF != null) {
          this.D = SlidePlayViewModel.S0(tF.getParentFragment());
       }
       this.P8();
       this.H = this.q.enableSlidePlay();
       tF = this.D;
       if (tF != null) {
          tF.P(this.r, this.K);
          tF = this.C;
          if (tF != null && (tF.getNasaSlideParam() != null && (this.C.getNasaSlideParam().isSerialStyle() || (this.C.getNasaSlideParam().isFromHistory() && this.L == null)))) {
             this.L = true;
             this.D.registerDataSetObserver(this.M);
          }
       }else {
          tF = this.t;
          if (tF != null && !tF.contains(this.K)) {
             this.t.add(this.K);
          }
       }
       tF = this.A;
       if (tF != null) {
          tF.add(this.O);
       }
       tF = this.B;
       if (tF != null) {
          tF.a(this.P);
       }
       tF = this.I;
       if (tF != null) {
          this.X7(tF.subscribe(new c(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tA = this.A;
       if (tA != null) {
          tA.remove(this.O);
       }
       tA = this.B;
       if (tA != null) {
          tA.c(this.P);
       }
       tA = this.D;
       if (tA != null) {
          tA.D(this.r, this.K);
       }else {
          tA = this.t;
          if (tA != null) {
             tA.remove(this.K);
          }
       }
       return;
    }
    public void P8(){
       int i;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       if (this.H != null) {
          d obj = PatchProxy.apply(objArray, this, uod, "12");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = this.D;
             i = (obj != null)? obj.a0(): 0;
          }
          if (!i) {
             obj = this.z;
             if (obj != null && (!obj.w() && this.J == null)) {
                if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
                   uod = this.G;
                   if (uod != null) {
                      uod.f(false);
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
             uod = this.G;
             if (uod != null) {
                uod.f(true);
             }
          }
       }
    label_005f :
       return;
    }
    public final boolean R8(){
       Activity obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g().e();
       boolean b = (obj instanceof PhotoDetailActivity || m.a().U3(obj))? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       this.u = this.x8("DETAIL_LOGGER");
       this.v = this.r8("PAGE_SMOOTH_SWIPE_OBSERVER");
       this.w = this.t8("DETAIL_VERTICAL_SWIPE");
       this.x = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       this.y = this.s8(NormalDetailBizParam.class);
       this.z = this.s8(u.class);
       this.A = this.t8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.B = this.t8("NASA_SIDEBAR_STATUS");
       this.F = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.C = this.s8(NasaBizParam.class);
       this.I = this.t8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       this.s = this.s8(a.class);
       return;
    }
}
