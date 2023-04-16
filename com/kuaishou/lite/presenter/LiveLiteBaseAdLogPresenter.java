package com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import b93.d;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$a;
import nsd.u;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$c;
import java.lang.Object;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.LiveLiteParam;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e93.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import z1.k;
import e93.d;
import brd.t;
import il0.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.trello.rxlifecycle3.components.support.RxFragment;
import il0.c;
import io.reactivex.internal.functions.Functions;
import e93.b;
import il0.d;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import c93.b;
import d93.a;
import ekd.y0;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$b;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;

public abstract class LiveLiteBaseAdLogPresenter extends d	// class@00093f
{
    public k A;
    public boolean B;
    public long C;
    public int D;
    public y0 E;
    public SlidePlayViewModel F;
    public final LivePlayerStateChangeListener G;
    public QPhoto v;
    public a w;
    public e x;
    public b y;
    public c z;
    public static final LiveLiteBaseAdLogPresenter$a H;

    static {
       LiveLiteBaseAdLogPresenter.H = new LiveLiteBaseAdLogPresenter$a(null);
    }
    public void LiveLiteBaseAdLogPresenter(){
       super();
       this.G = new LiveLiteBaseAdLogPresenter$c(this);
    }
    public static void B9(LiveLiteBaseAdLogPresenter p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = false;
       }
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.y9(p1, p2);
       return;
    }
    public static void s9(LiveLiteBaseAdLogPresenter p0,int p1,a p2,a p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.q9(p1, p2, p3);
       return;
    }
    public void E8(){
       LiveLiteBaseAdLogPresenter liveLiteBase = LiveLiteBaseAdLogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteBase, "3")) {
          return;
       }
       super.E8();
       this.v = objArray;
       this.B = false;
       LiveLiteBaseAdLogPresenter tw = this.w;
       if (tw == null) {
          a.S("mAudienceInfoManager");
       }
       LiveLiteParam liveLitePara = tw.ok();
       a.o(liveLitePara, "mAudienceInfoManager.liveLiteParam");
       LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
       if (liveStreamFe != null) {
          this.v = new QPhoto(liveStreamFe);
       }
       if (!this.n9()) {
          return;
       }else {
          tw = this.z;
          String str = "mLiveLiteFragmentService";
          if (tw == null) {
             a.S(str);
          }
          Fragment parentFragme = tw.a().getParentFragment();
          if (parentFragme != null) {
             parentFragme = parentFragme.getParentFragment();
             if (parentFragme != null) {
                this.F = SlidePlayViewModel.B0(parentFragme);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, liveLiteBase, "4")) {
             tw = this.A;
             if (tw != null) {
                d uod = tw.get();
                if (uod != null) {
                   t ot = uod.X1();
                   if (ot != null) {
                      this.X7(ot.subscribe(new e(this)));
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, liveLiteBase, "6")) {
             tw = this.z;
             if (tw == null) {
                a.S(str);
             }
             this.X7(tw.a().m().subscribe(new c(this), Functions.e));
          }
          if (!PatchProxy.applyVoid(objArray, this, liveLiteBase, "5")) {
             liveLiteBase = this.y;
             if (liveLiteBase == null) {
                a.S("mLiveLiteEnterService");
             }
             this.X7(liveLiteBase.D9().subscribe(new d(this)));
          }
          liveLiteBase = this.x;
          if (liveLiteBase == null) {
             a.S("mPlayerService");
          }
          liveLiteBase.Vc().addStateChangeListener(this.G);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseAdLogPresenter.class, "9")) {
          return;
       }
       super.J8();
       this.y9(true, true);
       this.reset();
       LiveLiteBaseAdLogPresenter tx = this.x;
       if (tx == null) {
          a.S("mPlayerService");
       }
       tx.Vc().removeStateChangeListener(this.G);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseAdLogPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(a.class);
       this.A = p0.d(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseAdLogPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.x = p0.a(e.class);
       this.y = p0.a(b.class);
       this.z = p0.a(c.class);
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseAdLogPresenter.class, "10")) {
          return;
       }
       this.E = new y0(500, new LiveLiteBaseAdLogPresenter$b(this));
       return;
    }
    public void d9(){
    }
    public final k e9(){
       return this.A;
    }
    public final QPhoto h9(){
       return this.v;
    }
    public final long j9(){
       return this.C;
    }
    public final y0 k9(){
       return this.E;
    }
    public final int l9(){
       return this.D;
    }
    public final SlidePlayViewModel m9(){
       return this.F;
    }
    public final boolean n9(){
       LiveLiteBaseAdLogPresenter obj = PatchProxy.apply(null, this, LiveLiteBaseAdLogPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = true;
       if (obj == null || obj.isAd() != b) {
          b = false;
       }
       return b;
    }
    public abstract void o9();
    public final void q9(int p0,a p1,a p2){
       if (PatchProxy.isSupport(LiveLiteBaseAdLogPresenter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveLiteBaseAdLogPresenter.class, "11")) {
          return;
       }
       LiveLiteBaseAdLogPresenter tv = this.v;
       if (tv != null && this.n9()) {
          j0 oj0 = i0.a().e(p0, tv.mEntity).f(new LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1(p1));
          if (p2 != null) {
             p2.accept(oj0);
          }
          oj0.a();
       }
       return;
    }
    public void reset(){
       this.C = 0;
       this.D = 0;
    }
    public void t9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseAdLogPresenter.class, "8")) {
          return;
       }
       LiveLiteBaseAdLogPresenter tx = this.x;
       if (tx == null) {
          a.S("mPlayerService");
       }
       LivePlayerController livePlayerCo = tx.Vc();
       a.o(livePlayerCo, "mPlayerService.livePlayerController");
       if (livePlayerCo.isPlaying()) {
          this.x9();
       }
       return;
    }
    public final void u9(int p0){
       this.D = p0;
    }
    public abstract void x9();
    public abstract void y9(boolean p0,boolean p1);
}
