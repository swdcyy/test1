package com.kuaishou.house.live.consult.HouseConsultPendantMessage$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.protobuf.nearby.locallife.live.nano.LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantInfoResponse;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantInfoResponse$Data;

public final class HouseConsultPendantMessage$a	// class@000767
{

    public void HouseConsultPendantMessage$a(){
       super();
    }
    public void HouseConsultPendantMessage$a(u p0){
       super();
    }
    public final HouseConsultPendantMessage a(LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo p0){
       HouseConsultPendantMessage obj = PatchProxy.applyOneRefs(p0, this, HouseConsultPendantMessage$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new HouseConsultPendantMessage();
       obj.setMShowType(p0.show);
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo avatar = p0.avatar;
       a.o(avatar, "pb.avatar");
       obj.setMAvatar(avatar);
       obj.setMServiceCount(p0.serviceCount);
       avatar = p0.text;
       a.o(avatar, "pb.text");
       obj.setMServiceCountText(avatar);
       avatar = p0.buttonText;
       a.o(avatar, "pb.buttonText");
       obj.setMButtonText(avatar);
       obj.setMServiceThreshold(p0.threshold);
       avatar = p0.bottomText;
       a.o(avatar, "pb.bottomText");
       obj.setMUnderThresholdText(avatar);
       avatar = p0.reservedButton;
       a.o(avatar, "pb.reservedButton");
       obj.setMReservedButtonText(avatar);
       avatar = p0.reservedText;
       a.o(avatar, "pb.reservedText");
       obj.setMReservedServiceText(avatar);
       avatar = p0.reservationUrl;
       a.o(avatar, "pb.reservationUrl");
       obj.setMOpenH5Url(avatar);
       avatar = p0.bizType;
       a.o(avatar, "pb.bizType");
       obj.setMBizType(avatar);
       p0 = p0.authorRole;
       a.o(p0, "pb.authorRole");
       obj.setMAuthorRole(p0);
       return obj;
    }
    public final HouseConsultPendantMessage b(LiveHouseConsultPendantInfoResponse p0){
       HouseConsultPendantMessage obj = PatchProxy.applyOneRefs(p0, this, HouseConsultPendantMessage$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new HouseConsultPendantMessage();
       p0 = p0.mDataResponse;
       obj.setMShowType(p0.mShowType);
       obj.setMReservedStatus(p0.mReservedStatus);
       LiveHouseConsultPendantInfoResponse$Data mAvatar = p0.mAvatar;
       a.o(mAvatar, "dataResponse.mAvatar");
       obj.setMAvatar(mAvatar);
       obj.setMServiceCount(p0.mServiceCount);
       mAvatar = p0.mServiceCountText;
       a.o(mAvatar, "dataResponse.mServiceCountText");
       obj.setMServiceCountText(mAvatar);
       mAvatar = p0.mButtonText;
       a.o(mAvatar, "dataResponse.mButtonText");
       obj.setMButtonText(mAvatar);
       obj.setMServiceThreshold(p0.mServiceThreshold);
       mAvatar = p0.mUnderThresholdText;
       a.o(mAvatar, "dataResponse.mUnderThresholdText");
       obj.setMUnderThresholdText(mAvatar);
       mAvatar = p0.mReservedButtonText;
       a.o(mAvatar, "dataResponse.mReservedButtonText");
       obj.setMReservedButtonText(mAvatar);
       mAvatar = p0.mReservedServiceText;
       a.o(mAvatar, "dataResponse.mReservedServiceText");
       obj.setMReservedServiceText(mAvatar);
       mAvatar = p0.mOpenH5Url;
       a.o(mAvatar, "dataResponse.mOpenH5Url");
       obj.setMOpenH5Url(mAvatar);
       mAvatar = p0.mBizType;
       a.o(mAvatar, "dataResponse.mBizType");
       obj.setMBizType(mAvatar);
       mAvatar = p0.mAuthorRole;
       String str = "";
       if (mAvatar == null) {
          String str1 = str;
       }
       obj.setMAuthorRole(mAvatar);
       obj.setMSubtitleDisplayType(p0.mSubtitleDisplayType);
       mAvatar = p0.mReservedSpecialText;
       a.o(mAvatar, "dataResponse.mReservedSpecialText");
       obj.setMReservedSpecialText(mAvatar);
       mAvatar = p0.mUnreservedSpecialText;
       a.o(mAvatar, "dataResponse.mUnreservedSpecialText");
       obj.setMUnreservedSpecialText(mAvatar);
       LiveHouseConsultPendantInfoResponse$Data mTextType = p0.mTextType;
       if (mTextType != null) {
          str = mTextType;
       }
       obj.setMTextType(str);
       return obj;
    }
}
