package com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.lang.Integer;

public class LiveCommentsDisplayParams implements Serializable	// class@001071
{
    public int mAutoScrollToBottomDelayTimeMs;
    public int mCachedCommonMaxNum;
    public int mChangeScrollSpeedLimitNum;
    public int mFastScrollSpeedDelayMs;
    public int mFastScrollSpeedDp;
    public int mFastScrollSpeedNum;
    public int mFoldContinueMaxNum;
    public String mScene;
    public int mShowFoldBatchNum;
    public int mSlowScrollSpeedDelayMs;
    public int mSlowScrollSpeedDp;
    public int mSlowScrollSpeedNum;
    public int mUpdateFoldIntervalMs;
    public static final long serialVersionUID = 0x2427836ef69c8f62;

    public void LiveCommentsDisplayParams(){
       super();
       this.mAutoScrollToBottomDelayTimeMs = 3000;
       this.mCachedCommonMaxNum = 30;
       this.mChangeScrollSpeedLimitNum = 8;
       this.mFoldContinueMaxNum = 3;
       this.mShowFoldBatchNum = 3;
       this.mUpdateFoldIntervalMs = 3;
       this.mFastScrollSpeedDp = 250;
       this.mFastScrollSpeedNum = 5;
       this.mFastScrollSpeedDelayMs = 1700;
       this.mSlowScrollSpeedDp = 200;
       this.mSlowScrollSpeedNum = 3;
       this.mSlowScrollSpeedDelayMs = 1500;
    }
    public static LiveCommentsDisplayParams createDefaultParams(){
       LiveCommentsDisplayParams obj = PatchProxy.apply(null, null, LiveCommentsDisplayParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveCommentsDisplayParams();
       obj.mScene = "default";
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommentsDisplayParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImmutableMap.builder().c("scene", this.mScene).c("mAutoScrollToBottomDelayTimeMs", Integer.valueOf(this.mAutoScrollToBottomDelayTimeMs)).c("mChangeScrollSpeedLimitNum", Integer.valueOf(this.mChangeScrollSpeedLimitNum)).c("mFastScrollSpeedNum", Integer.valueOf(this.mFastScrollSpeedNum)).c("mFastScrollSpeedDelayMs", Integer.valueOf(this.mFastScrollSpeedDelayMs)).c("mSlowScrollSpeedNum", Integer.valueOf(this.mSlowScrollSpeedNum)).c("mSlowScrollSpeedDelayMs", Integer.valueOf(this.mSlowScrollSpeedDelayMs)).c("mUpdateFoldIntervalMs", Integer.valueOf(this.mUpdateFoldIntervalMs)).c("mFoldContinueMaxNum", Integer.valueOf(this.mFoldContinueMaxNum)).c("mShowFoldBatchNum", Integer.valueOf(this.mShowFoldBatchNum)).a().toString();
    }
}
