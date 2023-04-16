package com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage$a;
import nsd.u;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage$b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.locallife.model.ExplainBundleInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import com.kuaishou.livestream.message.nano.ItemBizTag;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class LocalLifeLiveExplainMessage implements Serializable, Parcelable	// class@000c33
{
    public String mAnchorUrl;
    public String mAudienceUrl;
    public String mBizId;
    public String mBizType;
    public ExplainBundleInfo mBundleInfo;
    public String mButtonText;
    public boolean mCloseAudienceExplainForever;
    public String mExtParams;
    public CDNUrl[] mIconUrls;
    public String mPriceText;
    public String mProductId;
    public long mPromotionId;
    public long mPromotionStageIdx;
    public LiveLocalLifeExplainCardPromotionStageInfo[] mPromotionStages;
    public long mPromotionTemplateId;
    public int mQueryApiType;
    public boolean mShowClose;
    public int mSignalType;
    public String mSource;
    public String mStateText;
    public String mSubTitle;
    public String mSymbol;
    public ItemBizTag[] mTagList;
    public String mTitle;
    public CDNUrl[] mTopLeftIconUrls;
    public CDNUrl[] mTopLeftIconUrlsSecond;
    public int mTopLeftStyle;
    public String mTopLeftTips;
    public String mTopLeftTipsSecond;
    public String mTraceTag;
    public static final Parcelable$Creator CREATOR;
    public static final LocalLifeLiveExplainMessage$a Companion;
    public static final long serialVersionUID;

    static {
       LocalLifeLiveExplainMessage.Companion = new LocalLifeLiveExplainMessage$a(null);
       LocalLifeLiveExplainMessage.CREATOR = new LocalLifeLiveExplainMessage$b();
    }
    public void LocalLifeLiveExplainMessage(){
       super();
       this.mSignalType = -1;
       this.mBizType = "";
       this.mTitle = "";
       this.mButtonText = "";
       this.mTopLeftTips = "";
       this.mSubTitle = "";
       this.mSymbol = "";
       this.mProductId = "";
       this.mBizId = "";
       this.mPriceText = "";
       this.mStateText = "";
       this.mSource = "";
       this.mAnchorUrl = "";
       this.mAudienceUrl = "";
       this.mTopLeftTipsSecond = "";
       this.mExtParams = "";
    }
    public static void getMSignalType$annotations(){
    }
    public static final LocalLifeLiveExplainMessage pbConvertToObject(SCLiveLocalLifeExplainCardSignal p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalLifeLiveExplainMessage.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalLifeLiveExplainMessage.Companion.a(p0);
    }
    public int describeContents(){
       return 0;
    }
    public final String getMAnchorUrl(){
       return this.mAnchorUrl;
    }
    public final String getMAudienceUrl(){
       return this.mAudienceUrl;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final String getMBizType(){
       return this.mBizType;
    }
    public final ExplainBundleInfo getMBundleInfo(){
       return this.mBundleInfo;
    }
    public final String getMButtonText(){
       return this.mButtonText;
    }
    public final boolean getMCloseAudienceExplainForever(){
       return this.mCloseAudienceExplainForever;
    }
    public final String getMExtParams(){
       return this.mExtParams;
    }
    public final CDNUrl[] getMIconUrls(){
       return this.mIconUrls;
    }
    public final String getMPriceText(){
       return this.mPriceText;
    }
    public final String getMProductId(){
       return this.mProductId;
    }
    public final long getMPromotionId(){
       return this.mPromotionId;
    }
    public final long getMPromotionStageIdx(){
       return this.mPromotionStageIdx;
    }
    public final LiveLocalLifeExplainCardPromotionStageInfo[] getMPromotionStages(){
       return this.mPromotionStages;
    }
    public final long getMPromotionTemplateId(){
       return this.mPromotionTemplateId;
    }
    public final int getMQueryApiType(){
       return this.mQueryApiType;
    }
    public final boolean getMShowClose(){
       return this.mShowClose;
    }
    public final int getMSignalType(){
       return this.mSignalType;
    }
    public final String getMSource(){
       return this.mSource;
    }
    public final String getMStateText(){
       return this.mStateText;
    }
    public final String getMSubTitle(){
       return this.mSubTitle;
    }
    public final String getMSymbol(){
       return this.mSymbol;
    }
    public final ItemBizTag[] getMTagList(){
       return this.mTagList;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final CDNUrl[] getMTopLeftIconUrls(){
       return this.mTopLeftIconUrls;
    }
    public final CDNUrl[] getMTopLeftIconUrlsSecond(){
       return this.mTopLeftIconUrlsSecond;
    }
    public final int getMTopLeftStyle(){
       return this.mTopLeftStyle;
    }
    public final String getMTopLeftTips(){
       return this.mTopLeftTips;
    }
    public final String getMTopLeftTipsSecond(){
       return this.mTopLeftTipsSecond;
    }
    public final String getMTraceTag(){
       return this.mTraceTag;
    }
    public final void setMAnchorUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAnchorUrl = p0;
       return;
    }
    public final void setMAudienceUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "13")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAudienceUrl = p0;
       return;
    }
    public final void setMBizId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizId = p0;
       return;
    }
    public final void setMBizType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizType = p0;
       return;
    }
    public final void setMBundleInfo(ExplainBundleInfo p0){
       this.mBundleInfo = p0;
    }
    public final void setMButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mButtonText = p0;
       return;
    }
    public final void setMCloseAudienceExplainForever(boolean p0){
       this.mCloseAudienceExplainForever = p0;
    }
    public final void setMExtParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "15")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mExtParams = p0;
       return;
    }
    public final void setMIconUrls(CDNUrl[] p0){
       this.mIconUrls = p0;
    }
    public final void setMPriceText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPriceText = p0;
       return;
    }
    public final void setMProductId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mProductId = p0;
       return;
    }
    public final void setMPromotionId(long p0){
       this.mPromotionId = p0;
    }
    public final void setMPromotionStageIdx(long p0){
       this.mPromotionStageIdx = p0;
    }
    public final void setMPromotionStages(LiveLocalLifeExplainCardPromotionStageInfo[] p0){
       this.mPromotionStages = p0;
    }
    public final void setMPromotionTemplateId(long p0){
       this.mPromotionTemplateId = p0;
    }
    public final void setMQueryApiType(int p0){
       this.mQueryApiType = p0;
    }
    public final void setMShowClose(boolean p0){
       this.mShowClose = p0;
    }
    public final void setMSignalType(int p0){
       this.mSignalType = p0;
    }
    public final void setMSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSource = p0;
       return;
    }
    public final void setMStateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mStateText = p0;
       return;
    }
    public final void setMSubTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSubTitle = p0;
       return;
    }
    public final void setMSymbol(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSymbol = p0;
       return;
    }
    public final void setMTagList(ItemBizTag[] p0){
       this.mTagList = p0;
    }
    public final void setMTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTitle = p0;
       return;
    }
    public final void setMTopLeftIconUrls(CDNUrl[] p0){
       this.mTopLeftIconUrls = p0;
    }
    public final void setMTopLeftIconUrlsSecond(CDNUrl[] p0){
       this.mTopLeftIconUrlsSecond = p0;
    }
    public final void setMTopLeftStyle(int p0){
       this.mTopLeftStyle = p0;
    }
    public final void setMTopLeftTips(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopLeftTips = p0;
       return;
    }
    public final void setMTopLeftTipsSecond(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveExplainMessage.class, "14")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopLeftTipsSecond = p0;
       return;
    }
    public final void setMTraceTag(String p0){
       this.mTraceTag = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(LocalLifeLiveExplainMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LocalLifeLiveExplainMessage.class, "16")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
