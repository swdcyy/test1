package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$b;
import nsd.u;
import hy.e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$a;
import jy.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.BrokenFrameInfo;
import mxb.c;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$h;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$onBind$2;
import xz8.a;
import msd.l;
import erd.g;
import crd.b;
import yx.j0;
import java.lang.Boolean;
import android.view.TextureView;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;

public final class BrokenFramePresenter extends PresenterV2	// class@0015d9
{
    public f A;
    public f B;
    public o C;
    public boolean D;
    public final b$b E;
    public final b$b F;
    public final a G;
    public final BrokenFramePresenter$g H;
    public final BrokenFramePresenter$f I;
    public a p;
    public QPhoto q;
    public BaseFragment r;
    public List s;
    public f t;
    public SlidePlayViewModel u;
    public boolean v;
    public boolean w;
    public boolean x;
    public f y;
    public f z;
    public static final BrokenFramePresenter$b J;

    static {
       BrokenFramePresenter.J = new BrokenFramePresenter$b(null);
    }
    public void BrokenFramePresenter(){
       super();
       e.G().E(new BrokenFramePresenter$a());
       this.E = new BrokenFramePresenter$e(this);
       this.F = new BrokenFramePresenter$d(this);
       this.G = new BrokenFramePresenter$c(this);
       this.H = new BrokenFramePresenter$g(this);
       this.I = new BrokenFramePresenter$f(this);
    }
    public static void S8(BrokenFramePresenter p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.R8(p1);
       return;
    }
    public void E8(){
       BrokenFramePresenter uBrokenFrame = BrokenFramePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBrokenFrame, "2")) {
          return;
       }
       BrokenFramePresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       BrokenFrameInfo uBrokenFrame1 = c.j(tq.mEntity);
       if (uBrokenFrame1 != null) {
          uBrokenFrame1 = uBrokenFrame1.mMagicVideoInfo;
          if (uBrokenFrame1 != null) {
             BrokenFramePresenter tA = this.A;
             if (tA != null) {
                tA.set(uBrokenFrame1);
             }
             tq = this.B;
             if (tq != null) {
                tq.set(new BrokenFramePresenter$h(this));
             }
             tq = this.z;
             if (tq != null) {
                tq.set("brokenFrameVideo");
             }
             if (!PatchProxy.applyVoid(objArray, this, uBrokenFrame, "3")) {
                uBrokenFrame = this.r;
                String str = "mFragment";
                if (uBrokenFrame == null) {
                   a.S(str);
                }
                SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(uBrokenFrame.getParentFragment());
                this.u = slidePlayVie;
                if (slidePlayVie != null) {
                   a.m(slidePlayVie);
                   tq = this.r;
                   if (tq == null) {
                      a.S(str);
                   }
                   slidePlayVie.P(tq, this.G);
                }else {
                   uBrokenFrame = this.s;
                   if (uBrokenFrame == null) {
                      a.S("mAttachListeners");
                   }
                   uBrokenFrame.add(this.G);
                }
                uBrokenFrame = this.p;
                str = "mPlayModule";
                if (uBrokenFrame == null) {
                   a.S(str);
                }
                e player = uBrokenFrame.getPlayer();
                if (player != null) {
                   player.w(this.E);
                }
                uBrokenFrame = this.p;
                if (uBrokenFrame == null) {
                   a.S(str);
                }
                player = uBrokenFrame.getPlayer();
                if (player != null) {
                   player.addOnInfoListener(this.H);
                }
             }
             this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new a(new BrokenFramePresenter$onBind$2(this))));
          }
       }
       return;
    }
    public void J8(){
       BrokenFramePresenter uBrokenFrame = BrokenFramePresenter.class;
       if (PatchProxy.applyVoid(null, this, uBrokenFrame, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uBrokenFrame, "4")) {
          uBrokenFrame = this.u;
          if (uBrokenFrame != null) {
             a.m(uBrokenFrame);
             BrokenFramePresenter tr = this.r;
             if (tr == null) {
                a.S("mFragment");
             }
             uBrokenFrame.D(tr, this.G);
          }else {
             uBrokenFrame = this.s;
             if (uBrokenFrame == null) {
                a.S("mAttachListeners");
             }
             uBrokenFrame.remove(this.G);
          }
          uBrokenFrame = this.p;
          String str = "mPlayModule";
          if (uBrokenFrame == null) {
             a.S(str);
          }
          e player = uBrokenFrame.getPlayer();
          if (player != null) {
             player.O(this.E);
          }
          uBrokenFrame = this.p;
          if (uBrokenFrame == null) {
             a.S(str);
          }
          player = uBrokenFrame.getPlayer();
          if (player != null) {
             player.removeOnInfoListener(this.H);
          }
       }
       uBrokenFrame = this.B;
       if (uBrokenFrame != null) {
          uBrokenFrame.set(null);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("BrokenFramePresenter", "pauseBrokenFrameVideo", objArray);
       BrokenFramePresenter ty = this.y;
       if (ty != null) {
          b uob = ty.get();
          if (uob != null) {
             uob.pause();
          }
       }
       return;
    }
    public final void R8(boolean p0){
       BrokenFramePresenter tt;
       b uob;
       BrokenFramePresenter uBrokenFrame = BrokenFramePresenter.class;
       if (PatchProxy.isSupport(uBrokenFrame) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBrokenFrame, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("BrokenFramePresenter", "playBrokenFrameVideo", objArray);
       if (!PatchProxy.isSupport(uBrokenFrame) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBrokenFrame, "8")) {
          uBrokenFrame = this.q;
          if (uBrokenFrame == null) {
             a.S("mPhoto");
          }
          if (uBrokenFrame.isEyeMax() && this.x == null) {
             this.x = true;
             uBrokenFrame = this.y;
             if (uBrokenFrame != null) {
                b uob1 = uBrokenFrame.get();
                if (uob1 != null) {
                   BrokenFramePresenter tp = this.p;
                   if (tp == null) {
                      a.S("mPlayModule");
                   }
                   e player = tp.getPlayer();
                   long currentPosit = (player != null)? player.getCurrentPosition(): 0;
                   uob1.seekTo(currentPosit);
                }
             }
          }
          if (p0) {
             tt = this.y;
             if (tt != null) {
                uob = tt.get();
                if (uob != null) {
                   uob.seekTo(0);
                }
             }
          }
       }
    label_007f :
       tt = this.t;
       if (tt != null) {
          TextureView textureView = tt.get();
          if (textureView != null) {
             textureView.setVisibility(0);
          }
       }
       tt = this.y;
       if (tt != null) {
          uob = tt.get();
          if (uob != null) {
             uob.start();
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter.class, "10")) {
          return;
       }
       if (this.D != null) {
          return;
       }
       this.D = true;
       j0 oj0 = i0.a();
       int i = 140;
       BrokenFramePresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       oj0.e(i, tq.mEntity).d(BrokenFramePresenter$i.b).a();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.p = obj;
       this.y = this.w8("MAGIC_VIDEO_PLAYER");
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­ccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.s = obj;
       this.z = this.w8("MAGIC_VIDEO_BIZ_TYPE");
       this.B = this.w8("MAGIC_VIDEO_ELEMENT_CLICK_LISTENER");
       this.C = this.s8(o.class);
       this.A = this.w8("MAGIC_VIDEO_INFO");
       this.t = this.w8("MAGIC_TEXTURE_VIEW");
       return;
    }
}
