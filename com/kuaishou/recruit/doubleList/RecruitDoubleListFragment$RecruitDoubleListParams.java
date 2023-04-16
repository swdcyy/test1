package com.kuaishou.recruit.doubleList.RecruitDoubleListFragment$RecruitDoubleListParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class RecruitDoubleListFragment$RecruitDoubleListParams implements Serializable	// class@000e9d
{
    public final boolean mIsFromTab;
    public int mLogCategory;
    public String mLogPage2;
    public String mPageSource;
    public String mServerExtraInfo;
    public String mTitle;
    public static final long serialVersionUID = 0xecfe17fd287da0aa;

    public void RecruitDoubleListFragment$RecruitDoubleListParams(boolean p0){
       super();
       this.mLogCategory = 5;
       this.mLogPage2 = "FIND_JOB";
       this.mIsFromTab = p0;
    }
    public String getTitle(){
       return this.mTitle;
    }
    public RecruitDoubleListFragment$RecruitDoubleListParams setLogCategory(int p0){
       this.mLogCategory = p0;
       return this;
    }
    public RecruitDoubleListFragment$RecruitDoubleListParams setLogPage2(String p0){
       this.mLogPage2 = p0;
       return this;
    }
    public RecruitDoubleListFragment$RecruitDoubleListParams setPageSource(String p0){
       this.mPageSource = p0;
       return this;
    }
    public RecruitDoubleListFragment$RecruitDoubleListParams setServerExtraInfo(String p0){
       this.mServerExtraInfo = p0;
       return this;
    }
    public RecruitDoubleListFragment$RecruitDoubleListParams setTitle(String p0){
       this.mTitle = p0;
       return this;
    }
}
