package com.kuaishou.live.house.model.HouseLiveExplainMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.house.model.HouseLiveExplainMessage$a;
import nsd.u;
import com.kuaishou.live.house.model.HouseLiveExplainMessage$b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.house.model.ExplainBundleInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class HouseLiveExplainMessage implements Serializable, Parcelable	// class@001d0e
{
    public String mAnchorUrl;
    public String mAudienceUrl;
    public String mAuthorRole;
    public String mBizId;
    public String mBizType;
    public ExplainBundleInfo mBundleInfo;
    public String mButtonText;
    public String mButtonType;
    public boolean mCloseAudienceExplainForever;
    public String mExtParams;
    public CDNUrl[] mIconUrls;
    public String mPriceText;
    public String mProductId;
    public boolean mShowClose;
    public int mSignalType;
    public String mSource;
    public String mStateText;
    public String mSubTitle;
    public String mSymbol;
    public String mTitle;
    public CDNUrl[] mTopLeftIconUrls;
    public CDNUrl[] mTopLeftIconUrlsSecond;
    public String mTopLeftTips;
    public String mTopLeftTipsSecond;
    public static final Parcelable$Creator CREATOR;
    public static final HouseLiveExplainMessage$a Companion;
    public static final long serialVersionUID;

    static {
       HouseLiveExplainMessage.Companion = new HouseLiveExplainMessage$a(null);
       HouseLiveExplainMessage.CREATOR = new HouseLiveExplainMessage$b();
    }
    public void HouseLiveExplainMessage(){
       super();
       this.mSignalType = -1;
       this.mBizType = "";
       this.mTitle = "";
       this.mButtonText = "";
       this.mButtonType = "";
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
       this.mAuthorRole = "";
       this.mExtParams = "";
    }
    public static void getMSignalType$annotations(){
    }
    public static final HouseLiveExplainMessage pbConvertToObject(SCLiveLocalLifeExplainCardSignal p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HouseLiveExplainMessage.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HouseLiveExplainMessage.Companion.a(p0);
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
    public final String getMAuthorRole(){
       return this.mAuthorRole;
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
    public final String getMButtonType(){
       return this.mButtonType;
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
    public final String getMTitle(){
       return this.mTitle;
    }
    public final CDNUrl[] getMTopLeftIconUrls(){
       return this.mTopLeftIconUrls;
    }
    public final CDNUrl[] getMTopLeftIconUrlsSecond(){
       return this.mTopLeftIconUrlsSecond;
    }
    public final String getMTopLeftTips(){
       return this.mTopLeftTips;
    }
    public final String getMTopLeftTipsSecond(){
       return this.mTopLeftTipsSecond;
    }
    public final void setMAnchorUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "13")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAnchorUrl = p0;
       return;
    }
    public final void setMAudienceUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "14")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAudienceUrl = p0;
       return;
    }
    public final void setMAuthorRole(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "16")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAuthorRole = p0;
       return;
    }
    public final void setMBizId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizId = p0;
       return;
    }
    public final void setMBizType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "1")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mButtonText = p0;
       return;
    }
    public final void setMButtonType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mButtonType = p0;
       return;
    }
    public final void setMCloseAudienceExplainForever(boolean p0){
       this.mCloseAudienceExplainForever = p0;
    }
    public final void setMExtParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "17")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPriceText = p0;
       return;
    }
    public final void setMProductId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mProductId = p0;
       return;
    }
    public final void setMShowClose(boolean p0){
       this.mShowClose = p0;
    }
    public final void setMSignalType(int p0){
       this.mSignalType = p0;
    }
    public final void setMSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSource = p0;
       return;
    }
    public final void setMStateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mStateText = p0;
       return;
    }
    public final void setMSubTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSubTitle = p0;
       return;
    }
    public final void setMSymbol(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSymbol = p0;
       return;
    }
    public final void setMTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "2")) {
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
    public final void setMTopLeftTips(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopLeftTips = p0;
       return;
    }
    public final void setMTopLeftTipsSecond(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveExplainMessage.class, "15")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopLeftTipsSecond = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HouseLiveExplainMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HouseLiveExplainMessage.class, "18")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
