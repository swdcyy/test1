package com.kuaishou.merchant.live.marketing.taskcenter.model.AnchorTaskInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityInfo;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public class AnchorTaskInfo implements Serializable	// class@001a9e
{
    public AnchorTaskInfo$AutoPopConfig mAutoPopConfig;
    public List mBackgroundUrl;
    public List mBubbleContentList;
    public long mDisplayDuration;
    public long mEndMillis;
    public long mGapDuration;
    public int mLeftNum;
    public int mMagicFaceId;
    public int mTaskType;
    public String mUrl;
    public Object mUrlParams;
    public static final long serialVersionUID = 0xc36194a9488df55a;

    public void AnchorTaskInfo(){
       super();
    }
    public static AnchorTaskInfo from(LiveRoomSignalMessage$SCKwaishopLiveActivityPendant p0){
       Object obj = null;
       LiveRoomSignalMessage$SCKwaishopLiveActivityPendant obj1 = PatchProxy.applyOneRefs(p0, obj, AnchorTaskInfo.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.activityInfo;
       if (obj1 != null) {
          LiveRoomSignalMessage$SCKwaishopLiveActivityInfo extraMap = obj1.extraMap;
          if (extraMap != null) {
             try{
                String str = "generalPendantInfo";
                if (extraMap.containsKey(str)) {
                   AnchorTaskInfo uAnchorTaskI = a.a.h(p0.activityInfo.extraMap.get(str), AnchorTaskInfo.class);
                   uAnchorTaskI.mEndMillis = p0.destroyTimestamp;
                   return uAnchorTaskI;
                }
             }catch(java.lang.Exception e4){
                a.l(MerchantLiveLogBiz.CHALLENGE, "LiveChallengePrepareInfo", "fail to parse json", e4);
             }
          }
       }
    }
}
