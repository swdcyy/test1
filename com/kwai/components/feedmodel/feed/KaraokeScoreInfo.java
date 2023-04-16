package com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.Integer;
import android.content.Context;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
import java.lang.Boolean;

public class KaraokeScoreInfo implements Serializable	// class@000c56
{
    public String mLevel;
    public KaraokeScoreInfo$KtvScoreRankInfo mRankInfo;
    public boolean mShouldDisPlay;
    public int mTotalScore;
    public int mTotalSegment;
    public int mValidSegment;
    public static final long serialVersionUID = 0xa59f84343773958e;

    public void KaraokeScoreInfo(){
       super();
    }
    public static String getRankText(KaraokeScoreInfo p0){
       Object[] objArray;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, KaraokeScoreInfo.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       int minRank = p0.getMinRank();
       if (minRank <= 0) {
          return obj;
       }
       int i = 2;
       if (p0.showDuetRank()) {
          objArray = new Object[i];
          objArray[0] = a1.p(0x7f101b02);
          objArray[1] = Integer.valueOf(minRank);
          return String.format("%s NO.%s", objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = a1.p(0x7f101aff);
          objArray[1] = Integer.valueOf(minRank);
          return String.format("%s NO.%s", objArray);
       }
    }
    public static String getScoreText(KaraokeScoreInfo p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, KaraokeScoreInfo.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null && (p0.mShouldDisPlay != null && (p0.mTotalScore <= null || p0.mLevel == null))) {
          return obj;
       }
       Object[] objArray = new Object[]{p0.mLevel,String.valueOf(p0.mTotalScore)};
       return a1.c().getString(0x7f1017e6, objArray);
    }
    public String getLevel(){
       KaraokeScoreInfo tmLevel = this.mLevel;
       if (tmLevel == null) {
          tmLevel = "";
       }
       return tmLevel;
    }
    public int getMinRank(){
       KaraokeScoreInfo tmRankInfo = this.mRankInfo;
       int i = 0;
       if (tmRankInfo != null) {
          KaraokeScoreInfo$KtvScoreRankInfo mDaily = tmRankInfo.mDaily;
          if (mDaily > null) {
             i = mDaily;
          }
          mDaily = tmRankInfo.mWeekly;
          if (mDaily > null && (i > mDaily || i == null)) {
             i = mDaily;
          }
          KaraokeScoreInfo$KtvScoreRankInfo mDuet = tmRankInfo.mDuet;
          if (mDuet > null && (i > mDuet || i == null)) {
             i = mDuet;
          }
       }
    label_001c :
       return i;
    }
    public boolean isHighLevel(){
       KaraokeScoreInfo obj = PatchProxy.apply(null, this, KaraokeScoreInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLevel;
       if (obj != null && (!obj.equals("SSS") && (!(this.mLevel).equals("SS") && ((this.mLevel).equals("S") || (this.mLevel).equals("A"))))) {
          return true;
       }
       return false;
    }
    public boolean isInRank(){
       KaraokeScoreInfo tmRankInfo = this.mRankInfo;
       if (tmRankInfo != null && (tmRankInfo.mDaily <= null && (tmRankInfo.mDuet > null || tmRankInfo.mWeekly > null))) {
          return true;
       }
       return false;
    }
    public boolean showDuetRank(){
       KaraokeScoreInfo tmRankInfo = this.mRankInfo;
       if (tmRankInfo != null) {
          KaraokeScoreInfo$KtvScoreRankInfo mDuet = tmRankInfo.mDuet;
          if (mDuet > null) {
             KaraokeScoreInfo$KtvScoreRankInfo mWeekly = tmRankInfo.mWeekly;
             if (mDuet < mWeekly || mWeekly == null) {
                KaraokeScoreInfo$KtvScoreRankInfo mDaily = tmRankInfo.mDaily;
                if (mDuet < mDaily || mDaily == null) {
                   return true;
                }
             }
          }
       }
       return false;
    }
}
