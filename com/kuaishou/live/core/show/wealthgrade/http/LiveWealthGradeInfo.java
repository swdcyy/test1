package com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveWealthGradeInfo implements Serializable	// class@00125f
{
    public int mCurrentGrade;
    public String mCurrentGradeIconBase64;
    public long mCurrentGradeStartScore;
    public long mCurrentScore;
    public boolean mEnableMockEnterDisplay;
    public int mEnterDisplayType;
    public LiveCommentRichText$CommentIconSegment mGradeIconSegment;
    public boolean mIsEnableHideWealthGradeWhenLightOff;
    public boolean mIsGradeHidden;
    public boolean mIsGradeLightOff;
    public int mLightOffGradeDays;
    public int mLightOnGradeScore;
    public int mLightOnTotalScore;
    public int mNextGrade;
    public long mNextGradeScore;
    public static final long serialVersionUID = 0x91ba49609401b0cb;

    public void LiveWealthGradeInfo(){
       super();
    }
}
