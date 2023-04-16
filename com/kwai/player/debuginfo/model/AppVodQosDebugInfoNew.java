package com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import java.lang.Object;
import java.lang.String;

public class AppVodQosDebugInfoNew	// class@0012e5
{
    public int activeRetryCnt;
    public int alivePlayerCnt;
    public String autoTestTags;
    public String avQueueStatus;
    public long bitrate;
    public int blockCount;
    public String blockStatus;
    public int blockTimeMs;
    public String cacheCurrentReadingUri;
    public String cacheDataSourceType;
    public long cacheDownloadedBytes;
    public boolean cacheEnabled;
    public int cacheErrorCode;
    public boolean cacheIsReadingCachedFile;
    public int cacheReopenCntBySeek;
    public int cacheStopReason;
    public long cacheTotalBytes;
    public String cacheV2Info;
    public String cdnRetryInfo;
    public String cpuInfo;
    public long currentPositionMs;
    public String currentState;
    public String customString;
    public String customStringV2;
    public String dataExtraInfo;
    public boolean dccAlgConfigEnabled;
    public String dccAlgStatus;
    public boolean dccAlgUsed;
    public String dccStatus;
    public int deviceHeight;
    public int deviceWidth;
    public String domain;
    public int downloadCurrentSpeedKbps;
    public String downloadSpeedInfo;
    public String dropFrame;
    public int ffpLoopCnt;
    public String fileSizeMatchInfo;
    public String firstScreenStepCostInfo;
    public long firstScreenWithoutAppCost;
    public String fullErrorMsg;
    public String host;
    public String httpVersion;
    public boolean isPreloadPlayer;
    public int lastError;
    public int mediaType;
    public String memoryInfo;
    public String metaAudioDecoderInfo;
    public String metaComment;
    public long metaDurationMs;
    public float metaFps;
    public int metaHeight;
    public String metaVideoDecoderInfo;
    public int metaWidth;
    public int passiveRetryCnt;
    public int playableDurationMs;
    public String playerConfigInfo;
    public boolean preLoadFinish;
    public int preLoadMs;
    public int preLoadedMsWhenAbort;
    public boolean quickStart;
    public String resolverType;
    public String retryDetail;
    public String serverIp;
    public String startPlayBlockStatus;
    public boolean startPlayBlockUsed;
    public int startStrategy;
    public long totalCostFirstScreen;
    public String transcodeType;
    public boolean usePreLoad;
    public int viewHeight;
    public int viewWidth;
    public String vodAdaptiveInfo;
    public boolean vodP2spEnabled;
    public String vodP2spStatus;
    public static final int VodQosDebugInfoMediaType_KFLV = 2;
    public static final int VodQosDebugInfoMediaType_LIVE = 1;
    public static final int VodQosDebugInfoMediaType_VOD;

    public void AppVodQosDebugInfoNew(){
       super();
       this.dataExtraInfo = "";
    }
    public String getPrettyDownloadSpeedInfo(){
       return this.downloadSpeedInfo;
    }
}
