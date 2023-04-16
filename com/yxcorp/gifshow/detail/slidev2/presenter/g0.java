package com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import jta.c;
import r7a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import b8a.q2;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import wh5.c;
import tw6.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slidev2.presenter.f0;
import erd.r;
import b8a.p2;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0$c;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import hn5.i0;
import w85.a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import android.view.MotionEvent;
import java.lang.Number;
import java.lang.Math;
import android.graphics.Bitmap;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.content.Context;
import android.content.res.Resources;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import im8.f;
import xx9.a;
import brd.y;
import de5.a;
import mrd.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public abstract class g0 extends PresenterV2	// class@0019b2
{
    public a A;
    public a B;
    public NasaBizParam C;
    public boolean D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public boolean I;
    public boolean J;
    public t K;
    public SlidePlayViewModel L;
    public BaseFragment M;
    public final c N;
    public e O;
    public ScaleHelpView p;
    public KwaiImageView q;
    public TextView r;
    public QPhoto s;
    public a t;
    public PhotoDetailParam u;
    public a v;
    public f w;
    public f x;
    public a y;
    public y z;

    public void g0(){
       super();
       this.N = new g0$a(this);
       this.O = new g0$b(this);
    }
    public void E8(){
       boolean b1;
       g0 og0 = g0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og0, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.M.getParentFragment());
       this.L = slidePlayVie;
       this.D = slidePlayVie.r();
       g0 tx = this.x;
       if (tx != null) {
          tx.a(this.N);
       }
       tx = this.p;
       int i = 1;
       boolean b = (this.D == null && !this.s.isHdr())? true: false;
       tx.setScaleEnabled(b);
       g e = Functions.e;
       this.X7(this.K.subscribe(new q2(this), e));
       tx = this.p;
       Object obj = PatchProxy.apply(objArray, this, og0, "5");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(!NasaExperimentUtils.n() && !c.b()){
          i = 0;
       }
       b1 = i;
       tx.c(b1);
       this.L.c0(this.O);
       this.X7(this.M.Vg().f().filter(f0.b).subscribe(new p2(this), e));
       this.p.setAssistListener(new g0$c(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g0.class, "13")) {
          return;
       }
       this.a9();
       this.p.setAssistListener(objArray);
       Drawable background = this.p.getBackground();
       if (background instanceof ColorDrawable && background.getColor() == 0xff000000) {
          this.p.setBackgroundColor(0);
          i0.b("SlidePlayScaleHelpPrese", "reset scale help view background in unbind");
       }
       g0 tx = this.x;
       if (tx != null) {
          tx.c(this.N);
       }
       this.L.d0(this.O);
       return;
    }
    public final boolean P8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0 og0 = g0.class;
       Object obj = PatchProxy.apply(null, this, og0, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!NasaExperimentUtils.n()) {
          Object obj1 = PatchProxy.apply(null, this, og0, "15");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.v.g() && this.L.b1()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1 || (!c.b() && !VisitorModeManager.f())) {
          label_0050 :
             return b;
          }
       }
    label_004f :
       b = true;
       goto label_0050 ;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, g0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s.isImageType() && !this.s.isSinglePhoto())? true: false;
       return b;
    }
    public float S8(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)(((p0.getX(1) - p0.getX(0)) * (p0.getX(1) - p0.getX(0))) + ((p0.getY(1) - p0.getY(0)) * (p0.getY(1) - p0.getY(0)))));
    }
    public abstract void V8(int[] p0);
    public abstract Bitmap W8();
    public void X8(){
    }
    public void Y8(boolean p0){
    }
    public abstract void Z8();
    public abstract void a9();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2a96);
       this.q = m1.f(p0, 0x7f0a319f);
       if (!NasaExperimentUtils.n()) {
          TextView textView = new TextView(this.getContext());
          this.r = textView;
          textView.setTextColor(this.l8().getColor(R.color.arg_RES_7f0620c7));
          this.r.setTextSize(14.00f);
          g0 tr = this.r;
          Resources resources = this.getContext().getResources();
          int i = (NasaSlidePlayExperimentUtil.e())? 0x7f0802b3: 0x7f0802b2;
          tr.setBackground(resources.getDrawable(i));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.w = this.x8("DETAIL_LOGGER");
       this.x = this.t8("NASA_SIDEBAR_STATUS");
       this.M = this.r8("DETAIL_FRAGMENT");
       this.y = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.z = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVER");
       this.t = this.q8(a.class);
       this.A = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       this.B = this.r8("NASA_PLAY_FAILED_RETRY_SHOW");
       this.u = this.q8(PhotoDetailParam.class);
       this.C = this.q8(NasaBizParam.class);
       this.v = this.q8(a.class);
       this.K = this.r8("PhOTOSTATUS_OBSERVABLE");
       return;
    }
}
