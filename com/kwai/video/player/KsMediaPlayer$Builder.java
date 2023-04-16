package com.kwai.video.player.KsMediaPlayer$Builder;
import android.content.Context;
import java.lang.Object;
import ai7.d;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.player.KsMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import com.kwai.video.player.KsPlayerCore;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import com.kwai.video.player.KsMediaPlayerImpl;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.cache.CacheSessionListener;
import com.kwai.video.cache.HttpResponseErrorCallback;

public class KsMediaPlayer$Builder	// class@000ad5
{
    public int abLoopCount;
    public long abLoopEndMs;
    public long abLoopStartMs;
    public String accessKey;
    public String appId;
    public AwesomeCacheCallback awesomeCacheCallback;
    public CacheSessionListener cacheSessionListener;
    public boolean enablePipenodeV2;
    public boolean enablePlayerCache;
    public boolean enableStatModule;
    public int fadeinEndTimeMs;
    public HttpResponseErrorCallback httpResponseErrorCallback;
    public Context mContext;
    public boolean mDisableSeekAtStart;
    public int mEnableAegonNetSpeed;
    public int mManifestType;
    public d mProvider;
    public int mSf21WarmupPercent;
    public int mVodManifestMaxResolution;
    public long preLoadDurationMs;
    public int preLoadVer;
    public String secretKeySign;
    public long seekAtStart;
    public String timeSec;
    public int vodManifestClarityScore;
    public boolean vodManifestEnable;
    public long vodManifestHeight;
    public int vodManifestLowDevice;
    public int vodManifestNetType;
    public String vodManifestRateConfig;
    public int vodManifestSignalStrength;
    public int vodManifestSwitchCode;
    public long vodManifestWidth;

    public void KsMediaPlayer$Builder(Context p0){
       super();
       this.appId = null;
       this.accessKey = null;
       this.secretKeySign = null;
       this.timeSec = null;
       this.enableStatModule = true;
       this.enablePlayerCache = false;
       this.preLoadVer = 1;
       this.preLoadDurationMs = 0;
       this.abLoopStartMs = 0;
       this.abLoopEndMs = 0;
       this.abLoopCount = 0;
       this.seekAtStart = 0;
       this.fadeinEndTimeMs = 0;
       this.vodManifestEnable = false;
       this.vodManifestWidth = 0;
       this.vodManifestHeight = 0;
       this.vodManifestNetType = 0;
       this.vodManifestRateConfig = "";
       this.vodManifestLowDevice = 0;
       this.vodManifestSignalStrength = 0;
       this.vodManifestSwitchCode = 0;
       this.vodManifestClarityScore = 0;
       this.mVodManifestMaxResolution = 0;
       this.mManifestType = 0;
       this.mEnableAegonNetSpeed = 0;
       this.mSf21WarmupPercent = -1;
       this.enablePipenodeV2 = false;
       this.mDisableSeekAtStart = false;
       this.mContext = p0.getApplicationContext();
       this.mProvider = KsMediaPlayerInitConfig.getPlayerSwitchProvider();
    }
    public KsMediaPlayer build(){
       PlayerLibraryLoader$FindBestParam obj = PatchProxy.apply(null, this, KsMediaPlayer$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PlayerLibraryLoader$FindBestParam();
       obj.mIsKsMediaplayer = true;
       obj.mProvider = this.mProvider;
       KsPlayerCore ksPlayerCore = PlayerLibraryLoader.findCore(obj);
       KsMediaPlayer.gLastPlayerCore = ksPlayerCore;
       if (KsPlayerCore.isKindOfAemon(ksPlayerCore)) {
          return new KsMediaPlayerAemonImpl(this, ksPlayerCore, obj);
       }
       return new KsMediaPlayerImpl(this);
    }
    public KsMediaPlayer$Builder enableCache(boolean p0){
       this.enablePlayerCache = p0;
       return this;
    }
    public KsMediaPlayer$Builder enableKSYStatModule(boolean p0){
       this.enableStatModule = p0;
       return this;
    }
    public KsMediaPlayer$Builder enablePipenodeV2(boolean p0){
       this.enablePipenodeV2 = p0;
       return this;
    }
    public KsMediaPlayer$Builder seekAtStart(long p0){
       this.seekAtStart = p0;
       return this;
    }
    public KsMediaPlayer$Builder setAbLoop(long p0,long p1){
       this.abLoopStartMs = p0;
       this.abLoopEndMs = p1;
       this.abLoopCount = -1;
       return this;
    }
    public KsMediaPlayer$Builder setAbLoop(long p0,long p1,int p2,boolean p3){
       this.abLoopStartMs = p0;
       this.abLoopEndMs = p1;
       this.abLoopCount = p2;
       this.mDisableSeekAtStart = p3;
       return this;
    }
    public KsMediaPlayer$Builder setAccessKey(String p0){
       this.accessKey = p0;
       return this;
    }
    public KsMediaPlayer$Builder setAppId(String p0){
       this.appId = p0;
       return this;
    }
    public KsMediaPlayer$Builder setAwesomeCacheCallback(AwesomeCacheCallback p0){
       this.awesomeCacheCallback = p0;
       return this;
    }
    public KsMediaPlayer$Builder setCacheSessionListener(CacheSessionListener p0){
       this.cacheSessionListener = p0;
       return this;
    }
    public KsMediaPlayer$Builder setEnableAegonNetSpeed(int p0){
       this.mEnableAegonNetSpeed = p0;
       return this;
    }
    public KsMediaPlayer$Builder setFadeinEndTimeMs(int p0){
       return this;
    }
    public KsMediaPlayer$Builder setHttpResponseErrorCallback(HttpResponseErrorCallback p0){
       this.httpResponseErrorCallback = p0;
       return this;
    }
    public KsMediaPlayer$Builder setManifestType(int p0){
       this.mManifestType = p0;
       return this;
    }
    public KsMediaPlayer$Builder setPreLoadDurationMs(int p0,long p1){
       this.preLoadVer = p0;
       this.preLoadDurationMs = p1;
       return this;
    }
    public KsMediaPlayer$Builder setSecretKeySign(String p0){
       this.secretKeySign = p0;
       return this;
    }
    public KsMediaPlayer$Builder setSwitchProvider(d p0){
       this.mProvider = p0;
       return this;
    }
    public KsMediaPlayer$Builder setTimeSec(String p0){
       this.timeSec = p0;
       return this;
    }
    public KsMediaPlayer$Builder setVodManifest(int p0,long p1,long p2,String p3,int p4,int p5,int p6){
       this.vodManifestEnable = true;
       this.vodManifestHeight = p2;
       this.vodManifestWidth = p1;
       this.vodManifestNetType = p0;
       this.vodManifestRateConfig = p3;
       this.vodManifestLowDevice = p4;
       this.vodManifestSignalStrength = p5;
       this.vodManifestClarityScore = p6;
       return this;
    }
    public KsMediaPlayer$Builder setVodManifestMaxResolution(int p0){
       this.mVodManifestMaxResolution = p0;
       return this;
    }
    public KsMediaPlayer$Builder setVodManifestSwitchCode(int p0){
       this.vodManifestSwitchCode = p0;
       return this;
    }
    public KsMediaPlayer$Builder setVodManifestWarmupPercentThreshold(int p0){
       this.mSf21WarmupPercent = p0;
       return this;
    }
}
