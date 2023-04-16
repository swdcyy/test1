package com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo$a;
import nsd.u;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class LiveLocalLifeExplainCardPromotionStageInfo implements Serializable, Parcelable	// class@000c2f
{
    public long mPromotionStageTime;
    public int mPromotionStatus;
    public String mRightText;
    public String mText;
    public int mTopLeftTextType;
    public static final Parcelable$Creator CREATOR;
    public static final LiveLocalLifeExplainCardPromotionStageInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveLocalLifeExplainCardPromotionStageInfo.Companion = new LiveLocalLifeExplainCardPromotionStageInfo$a(null);
       LiveLocalLifeExplainCardPromotionStageInfo.CREATOR = new LiveLocalLifeExplainCardPromotionStageInfo$b();
    }
    public void LiveLocalLifeExplainCardPromotionStageInfo(){
       super();
       this.mTopLeftTextType = -1;
       this.mPromotionStageTime = -1;
       this.mText = "";
       this.mRightText = "";
    }
    public void LiveLocalLifeExplainCardPromotionStageInfo(int p0,long p1,String p2,String p3,int p4){
       a.p(p2, "text");
       a.p(p3, "rightText");
       super();
       this.mTopLeftTextType = p0;
       this.mPromotionStageTime = p1;
       this.mText = p2;
       this.mRightText = p3;
       this.mPromotionStatus = p4;
    }
    public static void getMTopLeftTextType$annotations(){
    }
    public int describeContents(){
       return 0;
    }
    public final long getMPromotionStageTime(){
       return this.mPromotionStageTime;
    }
    public final int getMPromotionStatus(){
       return this.mPromotionStatus;
    }
    public final String getMRightText(){
       return this.mRightText;
    }
    public final String getMText(){
       return this.mText;
    }
    public final int getMTopLeftTextType(){
       return this.mTopLeftTextType;
    }
    public final void setMPromotionStageTime(long p0){
       this.mPromotionStageTime = p0;
    }
    public final void setMPromotionStatus(int p0){
       this.mPromotionStatus = p0;
    }
    public final void setMRightText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeExplainCardPromotionStageInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mRightText = p0;
       return;
    }
    public final void setMText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLocalLifeExplainCardPromotionStageInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mText = p0;
       return;
    }
    public final void setMTopLeftTextType(int p0){
       this.mTopLeftTextType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLocalLifeExplainCardPromotionStageInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mTopLeftTextType = "+this.mTopLeftTextType+" mPromotionStageTime = "+this.mPromotionStageTime+" mText = "+this.mText+" mRightText = "+this.mRightText+" mPromotionStatus = "+this.mPromotionStatus;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(LiveLocalLifeExplainCardPromotionStageInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveLocalLifeExplainCardPromotionStageInfo.class, "4")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
