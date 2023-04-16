package com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;
import com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.lang.RuntimeException;

public class LiveCommentNoticeInfo implements Serializable	// class@000a53
{
    public String commonGuideSubBizType;
    public LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo mClickedButton;
    public String mClickedDesc;
    public long mClickedDisplayDurationMs;
    public String mClickedSubTitle;
    public long mDelayDisplayTimeMs;
    public int mEnableLiveModel;
    public JsonObject mExtraInfoJson;
    public boolean mIsFollowButtonEnable;
    public boolean mIsFromLiveSocket;
    public boolean mIsSquareContentLeftImageView;
    public String mLiveCommentNoticeBizId;
    public int mLiveCommentNoticeBizType;
    public LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo mLiveCommentNoticeButtonInfo;
    public LiveCommentNoticeClickEventInfo mLiveCommentNoticeClickEventInfo;
    public List mLiveCommentNoticeContentLeftIconList;
    public String mLiveCommentNoticeDescription;
    public long mLiveCommentNoticeDisplayTimeMs;
    public int mLiveCommentNoticePriority;
    public int mLiveCommentNoticeShowTotalCount;
    public String mLiveCommentNoticeSubtitle;
    public String mLiveCommentNoticeTitle;
    public List mLiveCommentNoticeTitleIconList;
    public int mLiveCommentNoticeType;
    public String mTargetLiveStreamId;
    public static final long serialVersionUID = 0xc7240908dad0a33d;

    public void LiveCommentNoticeInfo(){
       super();
    }
    public static LiveCommentNoticeInfo convertToLiveCommentNoticeInfo(SCCommentNotice p0){
       SCCommentNotice button;
       SCCommentNotice clickedDesc;
       LiveCommentNoticeInfo obj = PatchProxy.applyOneRefs(p0, null, LiveCommentNoticeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveCommentNoticeInfo();
       obj.mTargetLiveStreamId = p0.targetLiveStreamId;
       obj.mIsFromLiveSocket = true;
       obj.mLiveCommentNoticeBizType = p0.bizType;
       obj.mLiveCommentNoticeType = p0.type;
       if (p0.button != null) {
          LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeInfo$LiveCommentNoticeButtonInfo();
          obj.mLiveCommentNoticeButtonInfo = liveCommentN;
          button = p0.button;
          liveCommentN.mLiveCommentNoticeBtnTitle = button.text;
          liveCommentN.mLiveCommentNoticeBtnUrl = button.url;
       }
       obj.mIsSquareContentLeftImageView = p0.noticePicIsSquare;
       obj.mLiveCommentNoticeContentLeftIconList = q.a(e0.i(p0.commentNoticePicUrl));
       obj.mLiveCommentNoticeBizId = p0.bizId;
       if (p0.clickEvent != null) {
          LiveCommentNoticeClickEventInfo liveCommentN1 = new LiveCommentNoticeClickEventInfo();
          obj.mLiveCommentNoticeClickEventInfo = liveCommentN1;
          button = p0.clickEvent;
          liveCommentN1.mUrl = button.url;
          liveCommentN1.mHeightPercent = button.heightPercent;
          liveCommentN1.mFullScreen = button.fullScreen;
       }
       obj.mLiveCommentNoticeDescription = p0.desc;
       obj.mLiveCommentNoticeDisplayTimeMs = p0.displayDurationMs;
       if (!TextUtils.x(p0.extraInfo)) {
          try{
             obj.mExtraInfoJson = a.a.h(p0.extraInfo, JsonObject.class);
          }catch(com.google.gson.JsonSyntaxException e1){
             e1.printStackTrace();
          }
       }
    }
}
