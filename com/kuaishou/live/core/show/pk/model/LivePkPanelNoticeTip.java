package com.kuaishou.live.core.show.pk.model.LivePkPanelNoticeTip;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import java.util.ArrayList;
import com.kuaishou.live.core.show.pk.model.LivePkPanelNoticeTip$PlaceHolder;
import com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder;
import com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public class LivePkPanelNoticeTip implements Serializable	// class@000d9d
{
    public boolean hasShowed;
    public CDNUrl[] mBackgroundUrl;
    public String mClickActionUrl;
    public Map mExtraInfo;
    public long mNoticeShowMills;
    public String mNoticeText;
    public String mNoticeTextColor;
    public int mNoticeType;
    public List mPlaceHolderList;
    public static final long serialVersionUID = 0xe803d7463ee473;

    public void LivePkPanelNoticeTip(){
       super();
    }
    public static LivePkPanelNoticeTip convertNoticeTipFromProto(LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 p0){
       LivePkPanelNoticeTip obj = PatchProxy.applyOneRefs(p0, null, LivePkPanelNoticeTip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePkPanelNoticeTip();
       obj.mNoticeType = p0.noticeType;
       obj.mNoticeText = p0.noticeText;
       obj.mNoticeTextColor = p0.noticeTextColor;
       obj.mNoticeShowMills = p0.noticeShowMills;
       if (!j.h(p0.placeHolder)) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 placeHolder = p0.placeHolder;
          while (i < placeHolder.length) {
             object oobject = placeHolder[i];
             LivePkPanelNoticeTip$PlaceHolder placeHolder1 = new LivePkPanelNoticeTip$PlaceHolder();
             placeHolder1.mPlaceHolderKey = oobject.placeHolderKey;
             placeHolder1.mPlaceHolderText = oobject.placeHolderText;
             placeHolder1.mPlaceHolderTextColor = oobject.placeHolderTextColor;
             uArrayList.add(placeHolder1);
             i = i + 1;
          }
          obj.mPlaceHolderList = uArrayList;
       }
       LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 appDiffModel = p0.appDiffModel;
       if (appDiffModel != null) {
          obj.mBackgroundUrl = e0.i(appDiffModel.backgroundUrl);
          obj.mClickActionUrl = p0.appDiffModel.clickActionUrl;
       }
       obj.mExtraInfo = p0.extraInfo;
       return obj;
    }
}
