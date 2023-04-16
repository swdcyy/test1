package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import brd.t;
import t45.d;
import brd.z;
import b7a.d;
import erd.g;
import crd.b;
import eda.b0;
import b7a.c;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import b7a.b;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import moc.b;
import java.lang.Float;
import android.os.SystemClock;
import java.util.List;
import ze5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewConfiguration;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import xx9.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import de5.a;
import w85.a;
import android.util.SparseIntArray;

public class a extends PresenterV2	// class@00180f
{
    public PublishSubject A;
    public SlidePlayViewModel B;
    public BaseFragment C;
    public int D;
    public long E;
    public boolean F;
    public f G;
    public PublishSubject H;
    public SparseIntArray I;
    public int J;
    public a K;
    public int L;
    public int M;
    public int N;
    public final a O;
    public final PhotosScaleHelpView$c P;
    public a p;
    public f q;
    public PhotosScaleHelpView r;
    public f s;
    public View t;
    public View u;
    public TextView v;
    public SlideVerticalAtlasPlayer w;
    public QPhoto x;
    public a y;
    public List z;

    public void a(){
       super();
       this.J = -1;
       this.O = new a$a(this);
       this.P = new a$b(this);
    }
    public void E8(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a.class, "6")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.C.getParentFragment());
       this.B = slidePlayVie;
       slidePlayVie.P(this.C, this.O);
       String str = "11";
       if (!PatchProxy.applyVoidWithListener(objArray, this, a.class, str)) {
          ImageMeta$AtlasCoverSize[] atlasSizes = this.x.getAtlasSizes();
          a tD = this.D;
          int i = n.y(a.B);
          int i1 = n.u(a.B);
          if (atlasSizes != null) {
             int len = atlasSizes.length;
             int i2 = 0;
             while (i2 < len) {
                object oobject = atlasSizes[i2];
                ImageMeta$AtlasCoverSize mWidth = oobject.mWidth;
                if (mWidth) {
                   float f1 = (float)i * oobject.mHeight;
                   f1 = f1 / mWidth;
                   float f2 = (float)tD + f1;
                   tD = (int)f2;
                }
                i2 = i2 + 1;
             }
          }
          if (tD) {
             if (tD <= i1) {
                i1 = tD;
             }
             a tr = this.r;
             tr.setVerticalPhotosScaleHelper(this.P);
             ViewGroup$LayoutParams layoutParams = tr.getLayoutParams();
             layoutParams.width = n.y(a.B);
             layoutParams.height = i1;
             tr.setLayoutParams(layoutParams);
          }
          PatchProxy.onMethodExit(a.class, str);
       }
       RxBus f = RxBus.f;
       a = d.a;
       this.X7(f.f(p.class).observeOn(a).subscribe(new d(this)));
       this.X7(f.f(b0.class).observeOn(a).subscribe(new c(this)));
       this.X7(f.f(SyncDetailAnimParamEvent.class).observeOn(a).subscribe(new b(this)));
       PatchProxy.onMethodExit(a.class, "6");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "5")) {
          return;
       }
       this.D = c.b(a.B.getResources(), 0x7f070fdf);
       PatchProxy.onMethodExit(a.class, "5");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "7")) {
          return;
       }
       this.B.D(this.C, this.O);
       a tJ = this.J;
       if (tJ != -1) {
          b.f(tJ);
          this.J = -1;
       }
       PatchProxy.onMethodExit(a.class, "7");
       return;
    }
    public void P8(float p0,float p1){
       if (PatchProxy.isSupport2(a.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), this, a.class, "2")) {
          return;
       }
       this.E = SystemClock.elapsedRealtime();
       this.F = true;
       for (int i = 0; i < this.z.size(); i = i + 1) {
          this.z.get(i).K(p0, p1);
       }
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public boolean R8(){
       a uoa = a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((SystemClock.elapsedRealtime() - this.E) - (long)ViewConfiguration.getJumpTapTimeout() < 0) {
          PatchProxy.onMethodExit(uoa, "12");
          return true;
       }else {
          PatchProxy.onMethodExit(uoa, "12");
          return false;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "4")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2f51);
       this.v = m1.f(p0, 0x7f0a2ec7);
       this.t = m1.f(p0, 0x7f0a43e1);
       this.u = m1.f(p0, 0x7f0a3a43);
       if (NasaExperimentUtils.b()) {
          this.w = m1.f(p0, 0x7f0a09e1);
       }
       PatchProxy.onMethodExit(a.class, "4");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "1")) {
          return;
       }
       this.x = this.q8(QPhoto.class);
       this.y = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.z = this.r8("DETAIL_CLICK_LIKE_LISTENERS");
       this.A = this.r8("DETAIL_IMAGE_SINGLE_TAP_UP");
       this.C = this.r8("DETAIL_FRAGMENT");
       this.G = this.x8("SLIDE_PLAY_BIG_MARQUEE_LONG_CLICK");
       this.H = this.r8("show_more_operation_panel_action");
       this.p = this.q8(a.class);
       this.q = this.x8("DETAIL_LOGGER");
       this.K = this.q8(a.class);
       this.I = this.r8("ATLAS_VIEWED_COUNTS");
       this.s = this.x8("NASA_PRESS_CONTROL_SPEED_EVENT");
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
