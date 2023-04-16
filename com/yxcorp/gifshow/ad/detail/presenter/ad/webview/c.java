package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import rf5.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import u09.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ge5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.u;
import yx.j0;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import mxb.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import joc.q;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;

public class c extends PresenterV2	// class@001643
{
    public View A;
    public ViewGroup B;
    public ViewGroup C;
    public j D;
    public i E;
    public b F;
    public Float G;
    public b H;
    public b I;
    public boolean J;
    public m K;
    public g L;
    public boolean M;
    public final boolean N;
    public final a O;
    public final Runnable P;
    public final a Q;
    public final u p;
    public PhotoDetailParam q;
    public QPhoto r;
    public BaseFragment s;
    public boolean t;
    public a u;
    public List v;
    public PhotoAdvertisement$H5ControlInfo w;
    public d x;
    public SlidePlayViewModel y;
    public SwipeLayout z;
    public static final int R;

    static {
       c.R = a1.h();
    }
    public void c(){
       super();
       this.p = new u();
       this.J = false;
       this.M = false;
       this.N = a.t().d("uniAdPlcWebPreloadPresenter", false);
       this.O = new d(this);
       this.P = new b(this);
       this.Q = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tx = this.x;
       if (tx != null) {
          this.K = tx.d;
          this.L = tx.c;
       }
       if (!u.d(this.r)) {
          Object[] objArray = new Object[0];
          j0.a("AdPLCWebViewPreloadPresenter", "is download ad or half H5, skip", objArray);
          return;
       }else if(this.getActivity() == null){
          return;
       }else if(this.B == null){
          return;
       }else {
          this.w = c.q(this.r.mEntity);
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
          this.y = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.P(this.s, this.Q);
          }else {
             tx = this.v;
             if (tx != null) {
                tx.add(this.Q);
             }
          }
          return;
       }
    }
    public void F8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "14") && this.getActivity() != null) {
          this.z = w9.c(this.getActivity());
          this.B = this.getActivity().findViewById(0x1020002);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c ty = this.y;
       if (ty != null) {
          ty.D(this.s, this.Q);
       }else {
          ty = this.v;
          if (ty != null) {
             ty.remove(this.Q);
          }
       }
       return;
    }
    public final void P8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "13")) {
          return;
       }
       if (this.A != null && this.q.enableSlidePlay()) {
          uoc = this.A;
          int i = (p0)? 8: 0;
          uoc.setVisibility(i);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.O);
       }
       this.p.l();
       boolean b = false;
       this.t = b;
       this.P8(b);
       c tD = this.D;
       if (tD != null) {
          tD.c();
       }
       tD = this.E;
       if (tD != null) {
          tD.c();
       }
       if (this.M != null) {
          this.M = b;
          a.d().k(new PlayEvent(this.r, PlayEvent$Status.RESUME));
       }
       return;
    }
    public void S8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       uoc = this.K;
       if (uoc != null) {
          uoc.f(p0);
       }
       uoc = this.L;
       if (uoc != null) {
          uoc.f(p0);
       }
       this.q.getSlidePlayConfig().setDisableSwipeToProfile(p0);
       return;
    }
    public void V8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "10")) {
          return;
       }
       this.p.E(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a3023);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.u = this.q8(a.class);
       this.x = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.q = this.q8(PhotoDetailParam.class);
       this.v = this.t8("DETAIL_ATTACH_LISTENERS");
       return;
    }
}
