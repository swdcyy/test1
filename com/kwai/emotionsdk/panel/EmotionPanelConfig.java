package com.kwai.emotionsdk.panel.EmotionPanelConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.emotionsdk.panel.EmotionPanelConfig$a;
import java.lang.String;

public final class EmotionPanelConfig implements Serializable	// class@000db2
{
    public int mEmotionsShowMask;
    public boolean mEnableForceDarkStyle;
    public boolean mEnableForceLightStyle;
    public boolean mEnableGIFSearch;
    public boolean mEnableGIFSearchTAB;
    public String mForceTopEmotionPackageId;
    public int mGIFSearchBizType;
    public int mGIFSearchKeywordLimit;
    public String mInitEmotionPackageId;
    public int mInitTabIndex;
    public int mMaxEditorSize;
    public boolean mShowAdd;
    public boolean mShowDice;
    public boolean mShowEmojiPageDel;
    public boolean mShowPackageBarClose;
    public boolean mShowRecentlyUsedEmoji;
    public int mShowRecentlyUsedEmojiLine;
    public boolean mShowRecordIndex;

    public void EmotionPanelConfig(){
       super();
       this.mGIFSearchKeywordLimit = 8;
    }
    public void EmotionPanelConfig(EmotionPanelConfig$a p0){
       super();
    }
    public int getEmotionsShowMask(){
       return this.mEmotionsShowMask;
    }
    public String getForceTopEmotionPackageId(){
       return this.mForceTopEmotionPackageId;
    }
    public int getGIFSearchBizType(){
       return this.mGIFSearchBizType;
    }
    public int getGIFSearchKeywordLimit(){
       return this.mGIFSearchKeywordLimit;
    }
    public String getInitEmotionPackageId(){
       return this.mInitEmotionPackageId;
    }
    public int getInitTabIndex(){
       return this.mInitTabIndex;
    }
    public int getMaxEditorSize(){
       return this.mMaxEditorSize;
    }
    public int getShowRecentlyUsedEmojiLine(){
       return this.mShowRecentlyUsedEmojiLine;
    }
    public boolean isEnableForceDarkStyle(){
       return this.mEnableForceDarkStyle;
    }
    public boolean isEnableForceLightStyle(){
       return this.mEnableForceLightStyle;
    }
    public boolean isEnableGIFSearch(){
       return this.mEnableGIFSearch;
    }
    public boolean isEnableGIFSearchTAB(){
       return this.mEnableGIFSearchTAB;
    }
    public boolean isShowAdd(){
       return this.mShowAdd;
    }
    public boolean isShowDice(){
       return this.mShowDice;
    }
    public boolean isShowEmojiPageDel(){
       return this.mShowEmojiPageDel;
    }
    public boolean isShowPackageBarClose(){
       return this.mShowPackageBarClose;
    }
    public boolean isShowRecentlyUsedEmoji(){
       return this.mShowRecentlyUsedEmoji;
    }
    public boolean isShowRecordIndex(){
       return this.mShowRecordIndex;
    }
}
