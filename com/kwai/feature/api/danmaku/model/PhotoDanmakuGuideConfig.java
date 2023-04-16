package com.kwai.feature.api.danmaku.model.PhotoDanmakuGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class PhotoDanmakuGuideConfig implements Serializable	// class@000e88
{
    public boolean mCheckNeverOn;
    public boolean mDanmakuDensityPass;
    public boolean mDanmakuOpenGuide;
    public String mDanmakuOpenGuideActivityKey;
    public String mDanmakuOpenGuideActivitySource;
    public int mDanmakuOpenGuideMaxDisplayCnt;
    public int mDanmakuOpenGuideStyle;
    public String mDanmakuOpenGuideTextOfEn;
    public String mDanmakuOpenGuideTextOfZh_hans;
    public String mDanmakuOpenGuideTextOfZh_hant;
    public final int startShowTime;

    public void PhotoDanmakuGuideConfig(){
       super();
       this.mDanmakuOpenGuideMaxDisplayCnt = 1;
       this.mDanmakuOpenGuideStyle = 1;
       this.startShowTime = 5;
    }
    public final boolean getMCheckNeverOn(){
       return this.mCheckNeverOn;
    }
    public final boolean getMDanmakuDensityPass(){
       return this.mDanmakuDensityPass;
    }
    public final boolean getMDanmakuOpenGuide(){
       return this.mDanmakuOpenGuide;
    }
    public final String getMDanmakuOpenGuideActivityKey(){
       return this.mDanmakuOpenGuideActivityKey;
    }
    public final String getMDanmakuOpenGuideActivitySource(){
       return this.mDanmakuOpenGuideActivitySource;
    }
    public final int getMDanmakuOpenGuideMaxDisplayCnt(){
       return this.mDanmakuOpenGuideMaxDisplayCnt;
    }
    public final int getMDanmakuOpenGuideStyle(){
       return this.mDanmakuOpenGuideStyle;
    }
    public final String getMDanmakuOpenGuideTextOfEn(){
       return this.mDanmakuOpenGuideTextOfEn;
    }
    public final String getMDanmakuOpenGuideTextOfZh_hans(){
       return this.mDanmakuOpenGuideTextOfZh_hans;
    }
    public final String getMDanmakuOpenGuideTextOfZh_hant(){
       return this.mDanmakuOpenGuideTextOfZh_hant;
    }
    public final int getStartShowTime(){
       return this.startShowTime;
    }
    public final void setMCheckNeverOn(boolean p0){
       this.mCheckNeverOn = p0;
    }
    public final void setMDanmakuDensityPass(boolean p0){
       this.mDanmakuDensityPass = p0;
    }
    public final void setMDanmakuOpenGuide(boolean p0){
       this.mDanmakuOpenGuide = p0;
    }
    public final void setMDanmakuOpenGuideActivityKey(String p0){
       this.mDanmakuOpenGuideActivityKey = p0;
    }
    public final void setMDanmakuOpenGuideActivitySource(String p0){
       this.mDanmakuOpenGuideActivitySource = p0;
    }
    public final void setMDanmakuOpenGuideMaxDisplayCnt(int p0){
       this.mDanmakuOpenGuideMaxDisplayCnt = p0;
    }
    public final void setMDanmakuOpenGuideStyle(int p0){
       this.mDanmakuOpenGuideStyle = p0;
    }
    public final void setMDanmakuOpenGuideTextOfEn(String p0){
       this.mDanmakuOpenGuideTextOfEn = p0;
    }
    public final void setMDanmakuOpenGuideTextOfZh_hans(String p0){
       this.mDanmakuOpenGuideTextOfZh_hans = p0;
    }
    public final void setMDanmakuOpenGuideTextOfZh_hant(String p0){
       this.mDanmakuOpenGuideTextOfZh_hant = p0;
    }
}
