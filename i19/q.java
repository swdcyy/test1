package i19.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import lnc.h5;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qrd.l1;
import i19.n;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosScreenCleanPresenter$registerPlayEndEvent$1;
import i19.l;
import i19.m;
import i19.p;
import i19.o;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import oo5.a;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import ekd.m1;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class q extends PresenterV2	// class@002618
{
    public ScreenCleanSession A;
    public ScreenCleanSession B;
    public ScreenCleanSession C;
    public ScreenCleanSession D;
    public View E;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public View M;
    public View N;
    public View O;
    public View P;
    public View Q;
    public View R;
    public View S;
    public View T;
    public View U;
    public BaseFragment p;
    public PhotoDetailParam q;
    public f r;
    public f s;
    public f t;
    public f u;
    public f v;
    public f w;
    public f x;
    public ScreenCleanSession y;
    public ScreenCleanSession z;

    public void q(){
       super();
    }
    public void E8(){
       q tv;
       ScreenCleanSession screenCleanS;
       q tE;
       q tL;
       h5 a;
       q tq;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "4")) {
          this.R = this.m8().findViewById(0x7f0a0135);
       }
       String str = "mDetailParam";
       if (!PatchProxy.applyVoid(objArray, this, oq, "5")) {
          screenCleanS = new ScreenCleanSession();
          tL = this.F;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.I;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          a = h5.a;
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (!a.a(tq.getBizType())) {
             tL = this.J;
             if (tL != null) {
                screenCleanS.a(tL);
             }
          }
          this.y = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "6")) {
          screenCleanS = new ScreenCleanSession();
          tL = this.E;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.L;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.J;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.M;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.H;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.G;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.I;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          a = h5.a;
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (a.a(tq.getBizType())) {
             tL = this.N;
             if (tL != null) {
                screenCleanS.a(tL);
             }
          }
          tL = this.O;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.P;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.Q;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.R;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.S;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.T;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          this.z = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "7")) {
          screenCleanS = new ScreenCleanSession();
          tL = this.L;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.J;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.M;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.H;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.G;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          tL = this.I;
          if (tL != null) {
             screenCleanS.a(tL);
          }
          a = h5.a;
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (a.a(tq.getBizType())) {
             tE = this.N;
             if (tE != null) {
                screenCleanS.a(tE);
             }
          }
          this.A = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "8")) {
          screenCleanS = new ScreenCleanSession();
          tE = this.J;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.K;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.U;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          this.B = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "9")) {
          screenCleanS = new ScreenCleanSession();
          tE = this.G;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.M;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.R;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.O;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          this.C = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "10")) {
          screenCleanS = new ScreenCleanSession();
          tE = this.E;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.O;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.H;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.M;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.G;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.P;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          tE = this.T;
          if (tE != null) {
             screenCleanS.a(tE);
          }
          this.D = screenCleanS;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "14")) {
          tv = this.r;
          if (tv == null) {
             a.S("mDislikeScreenCleanController");
          }
          tv.set(new n(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "15")) {
          tv = this.s;
          if (tv == null) {
             a.S("mScreenCleanController");
          }
          tv.set(new ThanosScreenCleanPresenter$registerPlayEndEvent$1(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "16")) {
          tv = this.t;
          if (tv == null) {
             a.S("mClueCollectionScreenCleanController");
          }
          tv.set(new l(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "17")) {
          tv = this.u;
          if (tv == null) {
             a.S("mCommentScreenCleanController");
          }
          tv.set(new m(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "18")) {
          tv = this.v;
          if (tv == null) {
             a.S("mSimilarPanelCleanController");
          }
          tv.set(new p(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "19")) {
          oq = this.w;
          if (oq == null) {
             a.S("mSideWindowCleanController");
          }
          oq.set(new o(this));
       }
       return;
    }
    public final void P8(boolean p0,ScreenCleanSession p1){
       q tp;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oq, "13")) {
          return;
       }
       if (p0) {
          if (p1 != null && p1.c() == true) {
             tp = this.p;
             if (tp == null) {
                a.S("mPhotoFragment");
             }
             a.j(tp, false);
          }
       }else if(p1 != null && p1.b() == true){
          tp = this.p;
          if (tp == null) {
             a.S("mPhotoFragment");
          }
          a.e(tp, false);
       }
       return;
    }
    public final void R8(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "11")) {
          return;
       }
       h5 a = h5.a;
       q tq = this.q;
       if (tq == null) {
          a.S("mDetailParam");
       }
       if (a.a(tq.getBizType())) {
          this.P8(p0, this.A);
       }
       return;
    }
    public final void S8(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "12")) {
          return;
       }
       h5 a = h5.a;
       q tq = this.q;
       if (tq == null) {
          a.S("mDetailParam");
       }
       if (!a.a(tq.getBizType())) {
          ThanosPlugin thanosPlugin = d.a(0xded02ea);
          tq = this.q;
          if (tq == null) {
             a.S("mDetailParam");
          }
          if (!thanosPlugin.ns(tq)) {
          label_0045 :
             return;
          }
       }
       this.P8(p0, this.z);
       goto label_0045 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a111f);
       this.F = m1.f(p0, 0x7f0a0107);
       this.G = m1.f(p0, 0x7f0a3ea3);
       this.H = m1.f(p0, 0x7f0a0175);
       this.I = m1.f(p0, 0x7f0a0110);
       this.L = m1.f(p0, 0x7f0a39f2);
       this.M = m1.f(p0, 0x7f0a3a09);
       this.O = m1.f(p0, 0x7f0a016a);
       this.P = m1.f(p0, 0x7f0a39c5);
       this.Q = m1.f(p0, 0x7f0a3a04);
       this.S = m1.f(p0, 0x7f0a0165);
       this.T = m1.f(p0, 0x7f0a3ea7);
       Activity activity = this.getActivity();
       if (activity != null) {
          this.J = activity.findViewById(0x7f0a007f);
          this.K = activity.findViewById(0x7f0a3023);
          this.N = activity.findViewById(0x7f0a3f6a);
          this.U = activity.findViewById(0x7f0a3eb2);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       f obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.q = obj;
       obj = this.x8("thanos_dislike_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­DISLIKE_CLEAN_CONTROLLER\)");
       this.r = obj;
       obj = this.x8("thanos_playend_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­PLAYEND_CLEAN_CONTROLLER\)");
       this.s = obj;
       obj = this.x8("thanos_clue_collection_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­LECTION_CLEAN_CONTROLLER\)");
       this.t = obj;
       obj = this.x8("thanos_comment_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­COMMENT_CLEAN_CONTROLLER\)");
       this.u = obj;
       obj = this.x8("thanos_similar_panel_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­R_PANEL_CLEAN_CONTROLLER\)");
       this.v = obj;
       obj = this.x8("thanos_side_window_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­_WINDOW_CLEAN_CONTROLLER\)");
       this.w = obj;
       obj = this.x8("DETAIL_FULL_WEBVIEW_STATE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_FULL_WEBVIEW_STATE\)");
       this.x = obj;
       return;
    }
}
