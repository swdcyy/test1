package jz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import w85.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vt5.c;
import com.yxcorp.gifshow.ad.detail.presenter.log.a;
import y09.a;
import pf5.n;
import com.kuaishou.eve.kit.api.NasaSwitch;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter;
import ej5.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jj5.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.c;
import z09.a;
import i19.i;
import h19.a;
import w09.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter;
import g59.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import yxb.b;
import gp5.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.a;
import i19.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import lz8.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter;
import k19.k;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import q09.d;
import c19.e;
import i19.q;
import uz8.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h;
import u09.b;
import iz8.a;
import iz8.b;
import az6.a;
import q49.l;
import m19.a;
import l09.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import h09.e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import wz8.a;
import wz8.n;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.PhotoAdAutoConvertPresenter;
import ie5.d;
import vt5.e;
import au5.b;
import yt5.f;
import ayb.i;
import q19.a;
import androidx.fragment.app.Fragment;
import g59.m;
import d19.a;
import l19.d;
import r19.a;
import n19.a;
import g19.a;
import p19.a;
import q7a.m;
import com.kuaishou.commercial.search.c;
import b19.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter;
import a19.a;
import sy8.k;
import sy8.j$a;
import com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter;
import ty8.e;
import com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter;
import i19.c;
import i19.b;
import zz8.a;
import wy8.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter;
import le5.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import i19.e;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;

public class a extends PresenterV2	// class@0029e1
{

    public void a(PhotoDetailParam p0,NasaBizParam p1,ThanosDetailBizParam p2,a p3,BaseFragment p4){
       c d;
       k a;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.U7(d.a(0x2e5315fc).eK());
       this.U7(new a());
       this.U7(new a());
       this.U7(new n());
       EveRankExtraTriggerPresenter uEveRankExtr = (NasaSwitch.c.a())? new EveRankExtraTriggerPresenter(): new RankExtraTriggerPresenter();
       this.U7(uEveRankExtr);
       d = c.d;
       Objects.requireNonNull(d);
       c uoc = c.class;
       String str = "12";
       if (!PatchProxy.applyVoidOneRefsWithListener(this, d, uoc, str)) {
          a.p(this, "presenter");
          this.U7(new a());
          PatchProxy.onMethodExit(uoc, str);
       }
       this.U7(new c());
       this.U7(new a());
       this.U7(new i());
       this.U7(new a(p0, p1, p2));
       this.U7(new a());
       this.U7(new HalfLandingPagePresenter());
       boolean b = true;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          p2 = PatchProxy.applyOneRefs(p1, null, j.class, "2");
          if (p2 != patchProxyRe) {
             b1 = p2.booleanValue();
          }else if(p1.getNasaSlideParam().isDetailPage() && (!p1.getNasaSlideParam().isSerialStyle() && (p1.getNasaSlideParam().mIsNewsSlideNasaDetail != null || (p1.getNasaSlideParam().mIsFriendsNasaDetail != null && (p1.getNasaSlideParam().isRankGatherPage() || p1.getNasaSlideParam().isChannelPage()))))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             this.U7(d.a(-430326918).NI().b());
          }
       }
       this.U7(new a());
       this.U7(new a());
       this.U7(new ThanosAdBottomBannerTKPresenter());
       this.U7(new d());
       this.U7(new ThanosAdTopTagTKPresenter());
       this.U7(new k());
       this.U7(new ThanosAdWebCardTachikomaPresenter());
       this.U7(new d());
       this.U7(new e());
       this.U7(new q());
       this.U7(new a());
       this.U7(new h(p0));
       this.U7(new b());
       this.U7(new a(b));
       this.U7(new b());
       a mSource = p0.mSource;
       if (mSource == 82 || mSource == 90) {
          this.U7(new l());
       }
       this.U7(new a(p4));
       this.U7(new c());
       this.U7(new PhotoAdShakePresenter());
       this.U7(new PhotoAdRotatePresenter());
       this.U7(new e());
       this.U7(new BrokenFramePresenter());
       this.U7(new a());
       this.U7(new n());
       this.U7(new PhotoAdAutoConvertPresenter());
       this.U7(new d(b.c().j()));
       this.U7(d.a(0x4f878389).Xz());
       this.U7(new a());
       if (!PatchProxy.applyVoidTwoRefs(p0, p4, this, a.class, "2")) {
          mSource = PatchProxy.applyOneRefs(p4, this, a.class, "3");
          b1 = (mSource != patchProxyRe)? mSource.booleanValue(): m.b(p4);
          if (b1) {
             this.U7(new a(p0));
             this.U7(new d());
          }
       }
       this.U7(new a());
       this.U7(new a());
       this.U7(new a(p1, p3));
       this.U7(new a());
       this.U7(new m());
       this.U7(new c());
       this.U7(new a());
       this.U7(new ThanosDraggingTranslucentPresenter());
       this.U7(new a());
       a = k.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefsWithListener(this, a, k.class, "4")) {
          a.p(this, "presenterV2");
          if (!PatchProxy.applyVoidTwoRefsWithListener(a, this, null, j$a.class, "2")) {
             a.p(this, "presenterV2");
             PatchProxy.onMethodExit(j$a.class, "2");
          }
          PatchProxy.onMethodExit(k.class, "4");
       }
       this.U7(new DownloadToastPresenter());
       this.U7(new e());
       this.U7(new VideoPlayerPlayStatePresenter());
       this.U7(new c());
       this.U7(new b());
       this.U7(new a());
       this.U7(new f());
       this.U7(new AdNeoLiveVideoPendantPresenter());
       if (f.g() || f.m(p0)) {
          this.U7(new AdAutoPlayPresenter());
       }
       this.U7(new e());
       this.U7(new ThanosAdAutoJumpMonitorPresenter());
       return;
    }
}
