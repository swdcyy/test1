package com.kwai.feature.component.entry.SearchVerticalParams;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.component.entry.SearchSceneSource;

public class SearchVerticalParams	// class@00120d
{
    public int mColorMode;
    public boolean mDisableSugPage;
    public boolean mEnableGuessModule;
    public boolean mHasSelectedInterest;
    public boolean mIsShowHistory;
    public boolean mNeedRequestPreset;
    public String mProfileHomeTips;
    public int mProfileMasterTab;
    public String mReportExtParams;
    public SearchSceneSource mSearchSceneSource;
    public boolean mUseSimpleHomeStyle;
    public String mUserName;

    public void SearchVerticalParams(){
       super();
       this.mEnableGuessModule = true;
       this.mColorMode = 0;
       this.mProfileMasterTab = 0;
       this.mIsShowHistory = true;
    }
    public SearchVerticalParams colorMode(int p0){
       this.mColorMode = p0;
       return this;
    }
    public SearchVerticalParams disableSugPage(boolean p0){
       this.mDisableSugPage = p0;
       return this;
    }
    public SearchVerticalParams enableGuessModule(boolean p0){
       this.mEnableGuessModule = p0;
       return this;
    }
    public int getColorMode(){
       return this.mColorMode;
    }
    public String getReportExtParams(){
       return this.mReportExtParams;
    }
    public SearchSceneSource getSearchSceneSource(){
       return this.mSearchSceneSource;
    }
    public boolean isDisableSugPage(){
       return this.mDisableSugPage;
    }
    public SearchVerticalParams isNeedRequestPreset(boolean p0){
       this.mNeedRequestPreset = p0;
       return this;
    }
    public boolean isNeedRequestPreset(){
       return this.mNeedRequestPreset;
    }
    public boolean isUseSimpleHomeStyle(){
       return this.mUseSimpleHomeStyle;
    }
    public SearchVerticalParams profileHomeTips(String p0){
       this.mProfileHomeTips = p0;
       return this;
    }
    public SearchVerticalParams profileMasterTab(int p0){
       this.mProfileMasterTab = p0;
       return this;
    }
    public SearchVerticalParams reportExtParams(String p0){
       this.mReportExtParams = p0;
       return this;
    }
    public SearchVerticalParams sceneSource(SearchSceneSource p0){
       this.mSearchSceneSource = p0;
       return this;
    }
    public SearchVerticalParams setIsShowHistory(boolean p0){
       this.mIsShowHistory = p0;
       return this;
    }
    public SearchVerticalParams useSimpleHomeStyle(boolean p0){
       this.mUseSimpleHomeStyle = p0;
       return this;
    }
    public SearchVerticalParams userName(String p0){
       this.mUserName = p0;
       return this;
    }
}
