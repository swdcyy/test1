package com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;

public class PlcEntryStyleInfo implements Serializable	// class@000db3
{
    public PlcEntryStyleInfo$AdData mAdData;
    public PlcEntryStyleInfo$BizData mBizData;
    public int mBizType;
    public long mCachedTime;
    public int mCategoryType;
    public PlcEntryStyleInfo$EventTrackData mEventTrackData;
    public boolean mForceShowOldKuaixiang;
    public int mPageType;
    public boolean mShowReported;
    public PlcEntryStyleInfo$StyleInfo mStyleInfo;
    public String photoPage;
    public int showPageType;
    public static final long serialVersionUID = 0x54cb4c7b09a62f60;

    public void PlcEntryStyleInfo(){
       super();
    }
    public boolean isCommentValid(){
       PlcEntryStyleInfo tmStyleInfo = this.mStyleInfo;
       boolean b = false;
       if (tmStyleInfo != null) {
          PlcEntryStyleInfo$StyleInfo mCommentStyl = tmStyleInfo.mCommentStyleInfo;
          if (mCommentStyl != null && mCommentStyl.mStyleType == 1) {
             b = true;
          }
       }
       return b;
    }
    public boolean isCoverValid(){
       PlcEntryStyleInfo tmStyleInfo = this.mStyleInfo;
       boolean b = false;
       if (tmStyleInfo != null) {
          PlcEntryStyleInfo$StyleInfo mCoverStyleT = tmStyleInfo.mCoverStyleTemplateInfo;
          if (mCoverStyleT != null) {
             PlcEntryStyleInfo$CoverStyleInfo mStyleType = mCoverStyleT.mStyleType;
             if (mStyleType == 1 || mStyleType == 2) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean isLongVideoValid(){
       PlcEntryStyleInfo tmStyleInfo = this.mStyleInfo;
       boolean b = false;
       if (tmStyleInfo != null) {
          PlcEntryStyleInfo$StyleInfo mLongVideoSt = tmStyleInfo.mLongVideoStyleTemplateInfo;
          if (mLongVideoSt != null) {
             PlcEntryStyleInfo$LongVideoStyleInfo mStyleType = mLongVideoSt.mStyleType;
             if (mStyleType != 1 && (mStyleType == 2 || mStyleType == 3)) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean isStrongValid(){
       PlcEntryStyleInfo tmStyleInfo = this.mStyleInfo;
       boolean b = false;
       if (tmStyleInfo != null) {
          PlcEntryStyleInfo$StyleInfo mStrongStyle = tmStyleInfo.mStrongStyleTemplateInfo;
          if (mStrongStyle != null) {
             PlcEntryStyleInfo$StrongStyleInfo mStyleType = mStrongStyle.mStyleType;
             if (mStyleType != 1 && (mStyleType != 2 && (mStyleType != 3 && (mStyleType != 4 && (mStyleType != 5 && (mStyleType != 6 && (mStyleType != 9 && (mStyleType != 10 && (mStyleType != 12 && (mStyleType != 14 && (mStyleType != 16 && (mStyleType != 17 && (mStyleType != 18 && (mStyleType != 21 && (mStyleType == 22 || mStyleType == 23))))))))))))))) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean isWeakValid(){
       PlcEntryStyleInfo tmStyleInfo = this.mStyleInfo;
       boolean b = false;
       if (tmStyleInfo != null) {
          PlcEntryStyleInfo$StyleInfo mWeakStyleTe = tmStyleInfo.mWeakStyleTemplateInfo;
          if (mWeakStyleTe != null) {
             PlcEntryStyleInfo$WeakStyleInfo mStyleType = mWeakStyleTe.mStyleType;
             if (mStyleType != 1 && (mStyleType != 2 && (mStyleType != 3 && (mStyleType != 4 && (mStyleType != 5 && (mStyleType == 6 || mStyleType == 7)))))) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean needReportAdLogByPlcData(){
       PlcEntryStyleInfo tmBizType = this.mBizType;
       boolean b = (tmBizType == 23 || tmBizType == 39)? true: false;
       return b;
    }
    public void setPageType(int p0){
       this.mPageType = p0;
    }
}
