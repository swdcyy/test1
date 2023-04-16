package com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo$Data;
import com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerInfo;
import java.util.ArrayList;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo$LiveSubscribePendantDetail;
import com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerUpdate;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import d61.j;

public class LiveSubscribePendantInfo implements Serializable	// class@001139
{
    public LiveSubscribePendantInfo$Data mData;
    public static final long serialVersionUID = 0x14a3772a2f9a8891;

    public void LiveSubscribePendantInfo(){
       super();
    }
    public static List getDataList(LiveSubscribePendantInfo p0){
       LiveSubscribePendantInfo$Data uData = null;
       LiveSubscribePendantInfo obj = PatchProxy.applyOneRefs(p0, uData, LiveSubscribePendantInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mData;
          if (obj != null) {
             LiveSubscribePendantInfo$Data mReservation = obj.mReservationInfos;
             if (mReservation != null && mReservation.size() > 0) {
                uData = p0.mData.mReservationInfos;
             }
          }
       }
       return uData;
    }
    public static List getDataList(LiveReservationStickerMessage$SCLiveReservationStickerInfo p0){
       ArrayList uArrayList = null;
       LiveReservationStickerMessage$SCLiveReservationStickerInfo obj = PatchProxy.applyOneRefs(p0, uArrayList, LiveSubscribePendantInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.reservationSticker;
       if (obj != null && obj.length > 0) {
          ArrayList uArrayList1 = new ArrayList();
          p0 = p0.reservationSticker;
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = p0[i];
             LiveSubscribePendantInfo$LiveSubscribePendantDetail liveSubscrib = PatchProxy.applyOneRefs(oobject, uArrayList, LiveSubscribePendantInfo.class, "3");
             if (liveSubscrib != PatchProxyResult.class) {
             }else {
                liveSubscrib = new LiveSubscribePendantInfo$LiveSubscribePendantDetail();
                liveSubscrib.mDisplayReservedUserCount = oobject.displayReservedUserCount;
                liveSubscrib.mReservedUserCount = oobject.reservedUserCount;
                liveSubscrib.mReservationId = oobject.reservationId;
                liveSubscrib.mDisplayDay = oobject.displayDay;
                liveSubscrib.mDisplayReservedUserCountSuffix = oobject.displayReservedUserCountSuffix;
                liveSubscrib.mDisplayTime = oobject.displayTime;
                liveSubscrib.mDisplayDate = oobject.displayDay+oobject.displayTime;
                liveSubscrib.mReservationActivityType = oobject.reservationActivityType;
                liveSubscrib.mButtonIcon = j.c(oobject.buttonIcon);
                liveSubscrib.mBackgroundUrl = j.c(oobject.displayBackgroundUrl);
                liveSubscrib.mDisableCancel = oobject.disableCancelReservation;
                liveSubscrib.mAuthorId = String.valueOf(oobject.authorId);
             }
             uArrayList1.add(liveSubscrib);
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
}
