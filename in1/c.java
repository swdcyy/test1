package in1.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashSet;
import in1.g;
import in1.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import wkd.b;
import rj3.c;
import rj3.a;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.android.live.model.QLivePlayConfig;
import tl8.d;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import com.kuaishou.android.model.response.LiveRetryConfig;
import java.lang.reflect.Type;
import qfc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import java.util.List;
import hj3.d;
import tkd.b;
import tkd.d;
import os5.l;
import lj3.b;
import pj3.b;
import sj3.j;
import in1.e;
import in1.d;
import in1.b;
import sj3.m;
import sj3.b;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;

public final class c	// class@002960
{
    public final Set a;
    public final g b;
    public final h c;
    public LivePlayerController d;
    public final b e;
    public final b f;
    public final j g;
    public boolean h;
    public final LivePlayerErrorListener i;
    public final d j;
    public final LiveStreamFeed k;
    public final LivePlayTextureView l;
    public final int m;
    public final String n;

    public void c(LiveStreamFeed p0,LivePlayTextureView p1,int p2,String p3,u p4){
       LivePlayerController livePlayerCo;
       boolean b;
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.a = new LinkedHashSet();
       this.b = new g();
       this.c = new h();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, this, uoc, "7");
       if (obj != patchProxyRe) {
       }else {
          int i = 1;
          if (p3 != null) {
             livePlayerCo = PatchProxy.applyOneRefs(p3, this, uoc, "8");
             if (livePlayerCo != patchProxyRe) {
             }else {
                a uoa = b.a(0x59ca4ae1).e(p3);
                livePlayerCo = (uoa != null)? uoa.a(): null;
                if (livePlayerCo != null) {
                   livePlayerCo.setTextureView(p1, false, i);
                   livePlayerCo.clearAllListener();
                   livePlayerCo.resetRetryCount();
                }
             }
             if (livePlayerCo != null) {
             label_0142 :
                obj = livePlayerCo;
             }
          }
          livePlayerCo = PatchProxy.applyOneRefs(p1, this, uoc, "9");
          if (livePlayerCo != patchProxyRe) {
          }else {
             QLivePlayConfig qLivePlayCon = p0.a(QLivePlayConfig.class);
             if (qLivePlayCon != null) {
                QLivePlayConfig mStat = qLivePlayCon.mStat;
                QLivePlayConfig$Stat mClientId = (mStat != null)? mStat.mClientId: null;
                if (a.g(mClientId, "PC") || qLivePlayCon.mShouldUseHardwareDecoding != null) {
                   b = true;
                label_0091 :
                   a.o(qLivePlayCon, "livePlayConfig");
                   LivePlayerParam$Builder uBuilder = new LivePlayerParam$Builder().liveStreamId(qLivePlayCon.getLiveStreamId()).isCdnOverload(qLivePlayCon.mIsCdnOverload).shouldUseHardwareDecoding(b);
                   QosMonitorConfig qosMonitorCo = PatchProxy.apply(null, this, uoc, "10");
                   if (qosMonitorCo != patchProxyRe) {
                   }else {
                      qosMonitorCo = new QosMonitorConfig();
                      LiveRetryConfig liveRetryCon = b.a(LiveRetryConfig.class);
                      if (liveRetryCon != null) {
                         qosMonitorCo.mEmptyReadSizeDurationSec = liveRetryCon.emptyReadSizeDuration;
                         qosMonitorCo.mEnableAutoSwitchCDN = liveRetryCon.autoSwitchCDNEnabled;
                         qosMonitorCo.mStalledDurationSecInOneMinute = liveRetryCon.stalledDurationInOneMinute;
                      }
                   }
                   i = 7;
                   LivePlayerParam livePlayerPa = uBuilder.qosMonitorConfig(qosMonitorCo).enableReusePlayerOptimize((TextUtils.x(p3) ^ i)).forceUseLowestQuality(false).enableMultiSurface(false).setAnchorId(r1.U1(p0)).setBizFt(":ks-features:ft-live:live-features:live-common").setBizType(String.valueOf(i)).build();
                   LiveDataSource liveDataSour = PatchProxy.applyOneRefs(qLivePlayCon, this, uoc, "11");
                   if (liveDataSour != patchProxyRe) {
                   }else {
                      liveDataSour = new LiveDataSource(qLivePlayCon.mPlayUrls, qLivePlayCon.mLiveAdaptiveManifests, qLivePlayCon.mMultiResolutionPlayUrls, qLivePlayCon.mWebRTCAdaptiveManifests);
                   }
                   livePlayerCo = d.b(p1, liveDataSour, livePlayerPa, i);
                   a.o(livePlayerCo, "LivePlayerFactory.create¡­E_HOT_DISPATCH_CARD\n    \)");
                }
             }
             b = false;
             goto label_0091 ;
          }
          b uob = d.a(-1492894991);
          a.o(uob, "PluginManager.get\(LivePlugin::class.java\)");
          int i1 = uob.l2();
          if (i1 > 0) {
             livePlayerCo.setPriorLowQuality(i1);
          }
          livePlayerCo.setEnableAutoUpdateViewSize(false);
          livePlayerCo.setNetworkRetryScene(null);
          livePlayerCo.resetRetryCount();
          goto label_0142 ;
       }
       this.d = obj;
       this.e = new b(obj, false);
       this.f = new b(p0, this.d);
       j oj = new j(p0, "");
       this.g = oj;
       this.i = new e(this);
       d uod = new d(this);
       this.j = uod;
       oj.d(new b(this));
       oj.b(uod);
       this.d.setLiveDataSourceFetcher(oj.a());
       return;
    }
    public final void a(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          this.d.removeOnVideoSizeChangedListener(this.b);
          this.d.removeStateChangeListener(this.c);
          this.d.removeLivePlayerErrorListener(this.i);
       }
       this.d.stopPlay();
       this.d.destroy();
       this.e.a();
       this.f.a();
       this.g.destroy();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       if (!this.d.isStop()) {
          this.d.stopPlay();
       }
       return;
    }
}
