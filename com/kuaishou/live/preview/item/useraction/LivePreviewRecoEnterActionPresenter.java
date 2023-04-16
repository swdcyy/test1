package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import dk3.b;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$bizToken$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$f;
import y12.b;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$b;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$c;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$d;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$e;
import z1.k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import com.yxcorp.gifshow.autoplay.live.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wk3.b;
import wk3.a;

public final class LivePreviewRecoEnterActionPresenter extends b	// class@000e51
{
    public g A;
    public final p B;
    public final LiveAutoPlay$a C;
    public final b D;
    public BaseFragment y;
    public QPhoto z;

    public void LivePreviewRecoEnterActionPresenter(){
       super();
       this.B = s.c(new LivePreviewRecoEnterActionPresenter$bizToken$2(this));
       this.C = new LivePreviewRecoEnterActionPresenter$f(this);
       this.D = new b(new LivePreviewRecoEnterActionPresenter$b(this), new LivePreviewRecoEnterActionPresenter$c(this), new LivePreviewRecoEnterActionPresenter$d(this), new LivePreviewRecoEnterActionPresenter$e(this));
    }
    public static final QPhoto W8(LivePreviewRecoEnterActionPresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("photo");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRecoEnterActionPresenter.class, "3")) {
          return;
       }
       super.E8();
       LivePreviewRecoEnterActionPresenter tA = this.A;
       if (tA == null) {
          a.S("livePlayModule");
       }
       tA.N(this.C);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRecoEnterActionPresenter.class, "4")) {
          return;
       }
       super.J8();
       LivePreviewRecoEnterActionPresenter tA = this.A;
       if (tA == null) {
          a.S("livePlayModule");
       }
       tA.W(this.C);
       this.D.a("onUnbind");
       return;
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.D.c();
       boolean b1 = this.D.b();
       LivePreviewRecoEnterActionPresenter tA = this.A;
       if (tA == null) {
          a.S("livePlayModule");
       }
       boolean b2 = tA.t();
       b.Z(LivePreviewRecoEnterActionPresenter$a.b, "canStartCountDown, bizToken="+this.Y8()+", "+"isCountDowning="+b+", "+"hasUploadedForCurrentWatchPeriod="+b1+", "+"isPreparingOrPlaying="+b2);
       b = (!b && (!b1 && b2))? true: false;
       return b;
    }
    public final String Y8(){
       Object obj = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRecoEnterActionPresenter.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.y = obj;
       obj = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       a.o(obj, "inject\(LivePreviewAccessIds.LIVE_PLAY_MODULE\)");
       this.A = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.z = obj;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRecoEnterActionPresenter.class, "6")) {
          return;
       }
       a.b(this);
       this.D.a("onPause");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRecoEnterActionPresenter.class, "5")) {
          return;
       }
       a.c(this);
       if (this.X8()) {
          this.D.d("onResume");
       }
       return;
    }
}
