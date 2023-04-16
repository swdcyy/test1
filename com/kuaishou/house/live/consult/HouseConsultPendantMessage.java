package com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage$a;
import nsd.u;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage$b;
import java.lang.Object;
import com.kuaishou.protobuf.nearby.locallife.live.nano.LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantInfoResponse;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class HouseConsultPendantMessage implements Serializable, Parcelable	// class@000769
{
    public String mAuthorRole;
    public String mAvatar;
    public String mBizType;
    public String mButtonText;
    public String mOpenH5Url;
    public String mReservedButtonText;
    public String mReservedServiceText;
    public String mReservedSpecialText;
    public int mReservedStatus;
    public long mServiceCount;
    public String mServiceCountText;
    public long mServiceThreshold;
    public int mShowType;
    public int mSubtitleDisplayType;
    public String mTextType;
    public String mUnderThresholdText;
    public String mUnreservedSpecialText;
    public static final Parcelable$Creator CREATOR;
    public static final HouseConsultPendantMessage$a Companion;
    public static final long serialVersionUID;

    static {
       HouseConsultPendantMessage.Companion = new HouseConsultPendantMessage$a(null);
       HouseConsultPendantMessage.CREATOR = new HouseConsultPendantMessage$b();
    }
    public void HouseConsultPendantMessage(){
       super();
       this.mShowType = -1;
       this.mAvatar = "";
       this.mButtonText = "";
       this.mServiceCount = -1;
       this.mAuthorRole = "";
       this.mServiceCountText = "";
       this.mServiceThreshold = -1;
       this.mUnderThresholdText = "";
       this.mReservedButtonText = "";
       this.mReservedServiceText = "";
       this.mOpenH5Url = "";
       this.mBizType = "";
       this.mUnreservedSpecialText = "";
       this.mReservedSpecialText = "";
       this.mTextType = "";
    }
    public static void getMShowType$annotations(){
    }
    public static final HouseConsultPendantMessage pbConvertToObject(LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HouseConsultPendantMessage.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HouseConsultPendantMessage.Companion.a(p0);
    }
    public static final HouseConsultPendantMessage responseConvertToObject(LiveHouseConsultPendantInfoResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HouseConsultPendantMessage.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HouseConsultPendantMessage.Companion.b(p0);
    }
    public int describeContents(){
       return 0;
    }
    public final String getMAuthorRole(){
       return this.mAuthorRole;
    }
    public final String getMAvatar(){
       return this.mAvatar;
    }
    public final String getMBizType(){
       return this.mBizType;
    }
    public final String getMButtonText(){
       return this.mButtonText;
    }
    public final String getMOpenH5Url(){
       return this.mOpenH5Url;
    }
    public final String getMReservedButtonText(){
       return this.mReservedButtonText;
    }
    public final String getMReservedServiceText(){
       return this.mReservedServiceText;
    }
    public final String getMReservedSpecialText(){
       return this.mReservedSpecialText;
    }
    public final int getMReservedStatus(){
       return this.mReservedStatus;
    }
    public final long getMServiceCount(){
       return this.mServiceCount;
    }
    public final String getMServiceCountText(){
       return this.mServiceCountText;
    }
    public final long getMServiceThreshold(){
       return this.mServiceThreshold;
    }
    public final int getMShowType(){
       return this.mShowType;
    }
    public final int getMSubtitleDisplayType(){
       return this.mSubtitleDisplayType;
    }
    public final String getMTextType(){
       return this.mTextType;
    }
    public final String getMUnderThresholdText(){
       return this.mUnderThresholdText;
    }
    public final String getMUnreservedSpecialText(){
       return this.mUnreservedSpecialText;
    }
    public final void setMAuthorRole(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAuthorRole = p0;
       return;
    }
    public final void setMAvatar(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mAvatar = p0;
       return;
    }
    public final void setMBizType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizType = p0;
       return;
    }
    public final void setMButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mButtonText = p0;
       return;
    }
    public final void setMOpenH5Url(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mOpenH5Url = p0;
       return;
    }
    public final void setMReservedButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mReservedButtonText = p0;
       return;
    }
    public final void setMReservedServiceText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mReservedServiceText = p0;
       return;
    }
    public final void setMReservedSpecialText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mReservedSpecialText = p0;
       return;
    }
    public final void setMReservedStatus(int p0){
       this.mReservedStatus = p0;
    }
    public final void setMServiceCount(long p0){
       this.mServiceCount = p0;
    }
    public final void setMServiceCountText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mServiceCountText = p0;
       return;
    }
    public final void setMServiceThreshold(long p0){
       this.mServiceThreshold = p0;
    }
    public final void setMShowType(int p0){
       this.mShowType = p0;
    }
    public final void setMSubtitleDisplayType(int p0){
       this.mSubtitleDisplayType = p0;
    }
    public final void setMTextType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTextType = p0;
       return;
    }
    public final void setMUnderThresholdText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mUnderThresholdText = p0;
       return;
    }
    public final void setMUnreservedSpecialText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseConsultPendantMessage.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mUnreservedSpecialText = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HouseConsultPendantMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HouseConsultPendantMessage.class, "13")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
