package com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class LiveVipGradeInfo	// class@00115a
{
    public UserStateRichTextSegment a;
    public String[] b;
    public boolean isAboutToUpgrade;
    public int mLevel;
    public String mVipGradeBadgeBase64Segment;
    public String mVipGradeContentText;
    public long mVipGradeScores;
    public long mVipGradeTotalScores;

    public void LiveVipGradeInfo(){
       super();
       this.mLevel = 0;
       this.isAboutToUpgrade = false;
       this.mVipGradeContentText = null;
       this.mVipGradeBadgeBase64Segment = null;
       this.a = null;
       this.b = null;
       this.mVipGradeScores = 0;
       this.mVipGradeTotalScores = 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVipGradeInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveVipGradeInfo && (this.mLevel == p0.mLevel && (this.isAboutToUpgrade == p0.isAboutToUpgrade && (a.g(this.mVipGradeContentText, p0.mVipGradeContentText) && (a.g(this.mVipGradeBadgeBase64Segment, p0.mVipGradeBadgeBase64Segment) && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (!this.mVipGradeScores - p0.mVipGradeScores && !this.mVipGradeTotalScores - p0.mVipGradeTotalScores))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.mLevel * 31;
       LiveVipGradeInfo tisAboutToUp = this.isAboutToUpgrade;
       if (tisAboutToUp != null) {
          tisAboutToUp = 1;
       }
       i = (i + tisAboutToUp) * 31;
       tisAboutToUp = this.mVipGradeContentText;
       int i1 = 0;
       int i2 = (tisAboutToUp != null)? tisAboutToUp.hashCode(): 0;
       i = (i + i2) * 31;
       tisAboutToUp = this.mVipGradeBadgeBase64Segment;
       i2 = (tisAboutToUp != null)? tisAboutToUp.hashCode(): 0;
       i = (i + i2) * 31;
       tisAboutToUp = this.a;
       i2 = (tisAboutToUp != null)? tisAboutToUp.hashCode(): 0;
       i = (i + i2) * 31;
       tisAboutToUp = this.b;
       if (tisAboutToUp != null) {
          i1 = Arrays.hashCode(tisAboutToUp);
       }
       tisAboutToUp = this.mVipGradeScores;
       tisAboutToUp = this.mVipGradeTotalScores;
       return (((((i + i1) * 31) + (int)(tisAboutToUp ^ (tisAboutToUp >> 32))) * 31) + (int)(tisAboutToUp ^ (tisAboutToUp >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveVipGradeInfo\(mLevel="+this.mLevel+", isAboutToUpgrade="+this.isAboutToUpgrade+", mVipGradeContentText="+this.mVipGradeContentText+", mVipGradeBadgeBase64Segment="+this.mVipGradeBadgeBase64Segment+", mVipGradeBadgeSegment="+this.a+", mVipGradeScoreBarColors="+Arrays.toString(this.b)+", mVipGradeScores="+this.mVipGradeScores+", mVipGradeTotalScores="+this.mVipGradeTotalScores+"\)";
    }
}
