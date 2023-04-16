package com.kwai.video.waynelive.LivePlayerInitModule$1;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import java.lang.Object;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider$-CC;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import ai7.d;

public final class LivePlayerInitModule$1 implements LivePlayerConfigProvider	// class@000dd1
{

    public void LivePlayerInitModule$1(){
       super();
    }
    public boolean enableAlignedPts(){
       return LivePlayerConfigProvider$-CC.a(this);
    }
    public boolean enableAudioConvert(){
       return LivePlayerConfigProvider$-CC.b(this);
    }
    public boolean enableStartPlayForLive(){
       return LivePlayerConfigProvider$-CC.c(this);
    }
    public boolean enableWebRTCManifestForLive(){
       return LivePlayerConfigProvider$-CC.d(this);
    }
    public String getAemonConfig(){
       return LivePlayerConfigProvider$-CC.e(this);
    }
    public Boolean getBoolean(String p0,boolean p1){
       return LivePlayerConfigProvider$-CC.f(this, p0, p1);
    }
    public int getBufferTimeMaxSecForHlsLive(){
       return LivePlayerConfigProvider$-CC.g(this);
    }
    public float getBufferTimeSizeMs(){
       return LivePlayerConfigProvider$-CC.h(this);
    }
    public double getDeviceGeneralScore(){
       return LivePlayerConfigProvider$-CC.i(this);
    }
    public boolean getEnableLiveAdaptiveAdditionalQos(){
       return LivePlayerConfigProvider$-CC.j(this);
    }
    public boolean getEnableLiveAdaptiveQos(){
       return LivePlayerConfigProvider$-CC.k(this);
    }
    public boolean getEnableLiveGuestRtQosLog(){
       return LivePlayerConfigProvider$-CC.l(this);
    }
    public int getFFmpegConnectionTimeoutSec(){
       return LivePlayerConfigProvider$-CC.m(this);
    }
    public int getHeightLimit264Hw(){
       return LivePlayerConfigProvider$-CC.n(this);
    }
    public int getHeightLimit265Hw(){
       return LivePlayerConfigProvider$-CC.o(this);
    }
    public int getHodorTaskRetryType(){
       return LivePlayerConfigProvider$-CC.p(this);
    }
    public int getInt(String p0,int p1){
       return LivePlayerConfigProvider$-CC.q(this, p0, p1);
    }
    public String getKs265DecExtraParams(){
       return LivePlayerConfigProvider$-CC.r(this);
    }
    public String getKwaiVPPKSwitch(){
       return LivePlayerConfigProvider$-CC.s(this);
    }
    public int getKwaiplayerFunctionOption(){
       return LivePlayerConfigProvider$-CC.t(this);
    }
    public String getLiveAdaptiveConfig(){
       return LivePlayerConfigProvider$-CC.u(this);
    }
    public long getLiveAdaptiveQosDuration(){
       return LivePlayerConfigProvider$-CC.v(this);
    }
    public int getLiveCacheConnectTimeoutMs(){
       return LivePlayerConfigProvider$-CC.w(this);
    }
    public int getLiveCacheReadTimeoutMs(){
       return LivePlayerConfigProvider$-CC.x(this);
    }
    public int getLiveCacheUpstreamType(){
       return LivePlayerConfigProvider$-CC.y(this);
    }
    public boolean getLiveEnableBatteryInfo(){
       return LivePlayerConfigProvider$-CC.z(this);
    }
    public long getLiveGuestRtQosInterval(){
       return LivePlayerConfigProvider$-CC.A(this);
    }
    public String getLiveHevcCodecName(){
       return LivePlayerConfigProvider$-CC.B(this);
    }
    public boolean getLiveHwSupportAudioOnlyMode(){
       return LivePlayerConfigProvider$-CC.C(this);
    }
    public int getLiveMaxBufferTime(){
       return LivePlayerConfigProvider$-CC.D(this);
    }
    public int getLiveMaxCnt(){
       return LivePlayerConfigProvider$-CC.E(this);
    }
    public String getLiveNetDownConfig(){
       return LivePlayerConfigProvider$-CC.F(this);
    }
    public int getLivePlayerBufferIncrementStep(){
       return LivePlayerConfigProvider$-CC.G(this);
    }
    public int getLivePlayerBufferSmoothTime(){
       return LivePlayerConfigProvider$-CC.H(this);
    }
    public KwaiPlayerConfig$EnumBufferStrategy getLivePlayerBufferStrategy(){
       return LivePlayerConfigProvider$-CC.I(this);
    }
    public int getLivePlayerFirstBufferTime(){
       return LivePlayerConfigProvider$-CC.J(this);
    }
    public int getLivePlayerMinBufferTime(){
       return LivePlayerConfigProvider$-CC.K(this);
    }
    public String getLowDelayConfig(){
       return LivePlayerConfigProvider$-CC.L(this);
    }
    public int getMediaCodecInvalidateVersion(){
       return LivePlayerConfigProvider$-CC.M(this);
    }
    public String getMediaPlayerConfig(){
       return LivePlayerConfigProvider$-CC.N(this);
    }
    public int getOverlayOutputPixelFormat(){
       return LivePlayerConfigProvider$-CC.O(this);
    }
    public QosMonitorConfig getQosMonitorConfig(){
       return LivePlayerConfigProvider$-CC.P(this);
    }
    public int getStartPlayMaxCostMsForLive(){
       return LivePlayerConfigProvider$-CC.Q(this);
    }
    public int getStartPlayThForLive(){
       return LivePlayerConfigProvider$-CC.R(this);
    }
    public String getString(String p0,String p1){
       return LivePlayerConfigProvider$-CC.S(this, p0, p1);
    }
    public d getSwitchProvider(){
       return LivePlayerConfigProvider$-CC.T(this);
    }
    public boolean getUseLive264HwForPcPush(){
       return LivePlayerConfigProvider$-CC.U(this);
    }
    public boolean getUseLive265HwForPcPush(){
       return LivePlayerConfigProvider$-CC.V(this);
    }
    public boolean getUseMediaCodecDummySurface(){
       return LivePlayerConfigProvider$-CC.W(this);
    }
    public String getWebRTCConfigForGame(){
       return LivePlayerConfigProvider$-CC.X(this);
    }
    public String getWebRTCConfigForLive(){
       return LivePlayerConfigProvider$-CC.Y(this);
    }
    public int getWidthLimit264Hw(){
       return LivePlayerConfigProvider$-CC.Z(this);
    }
    public int getWidthLimit265Hw(){
       return LivePlayerConfigProvider$-CC.a0(this);
    }
    public boolean isEnableAsyncStreamOpen(){
       return LivePlayerConfigProvider$-CC.b0(this);
    }
    public int isEnableHttpConnectTimeout(){
       return LivePlayerConfigProvider$-CC.c0(this);
    }
    public boolean isLiveAdaptiveEnableCache(){
       return LivePlayerConfigProvider$-CC.d0(this);
    }
    public boolean isLiveEnableAvSyncOpt(){
       return LivePlayerConfigProvider$-CC.e0(this);
    }
    public boolean isLiveEnableAvSyncOpt4(){
       return LivePlayerConfigProvider$-CC.f0(this);
    }
    public boolean isLiveEnableMultiAudioDetector(){
       return LivePlayerConfigProvider$-CC.g0(this);
    }
    public boolean isLiveH264SupportMediacodec(){
       return LivePlayerConfigProvider$-CC.h0(this);
    }
    public boolean isLiveH265SupportMediacodec(){
       return LivePlayerConfigProvider$-CC.i0(this);
    }
    public boolean isLiveNormalUseNativeCache(){
       return LivePlayerConfigProvider$-CC.j0(this);
    }
    public boolean shouldUseKLP(){
       return LivePlayerConfigProvider$-CC.k0(this);
    }
}
