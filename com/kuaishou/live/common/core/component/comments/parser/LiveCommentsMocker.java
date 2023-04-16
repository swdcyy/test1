package com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Exception;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import ekd.k1;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import java.lang.System;
import com.kuaishou.android.live.model.QLivePlayConfig$NoticeContent;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;

public class LiveCommentsMocker	// class@0010cb
{

    public void LiveCommentsMocker(){
       super();
    }
    public static void a(SystemNoticeMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveCommentsMocker.class, "9")) {
          return;
       }
       QLiveMessage mUser = p0.mUser;
       if (mUser == null || (!TextUtils.x(mUser.mName) && (TextUtils.x(p0.mContent) || (p0.mContent).contains("null")))) {
          b.H(LiveLogTag.COMMENT, "systemMessage warning from mock", "id", p0.getId(), new Exception(""));
       }
       return;
    }
    public static CommentMessage b(String p0,UserInfo p1,long p2,int p3){
       CommentMessage obj;
       if (PatchProxy.isSupport(LiveCommentsMocker.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(p2), Integer.valueOf(p3), null, LiveCommentsMocker.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new CommentMessage();
       obj.mId = String.valueOf(p2);
       obj.mTime = p2;
       obj.mUser = p1;
       obj.mContent = p0;
       obj.mSortRank = 0;
       obj.mLiveAssistantType = p3;
       return obj;
    }
    public static LikeMessage c(){
       Object obj = PatchProxy.apply(null, null, LiveCommentsMocker.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentsMocker.d(0);
    }
    public static LikeMessage d(int p0){
       LikeMessage obj;
       LiveCommentsMocker liveComments = LiveCommentsMocker.class;
       if (PatchProxy.isSupport(liveComments)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveComments, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LikeMessage();
       obj.setId(String.valueOf(k1.j())).setUser(f.p(QCurrentUser.me())).setTime(System.currentTimeMillis()).setLiveAssistantType(p0).setSortRank(0);
       return obj;
    }
    public static SystemNoticeMessage e(QLivePlayConfig$NoticeContent p0,long p1,boolean p2){
       SystemNoticeMessage obj;
       if (PatchProxy.isSupport(LiveCommentsMocker.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), null, LiveCommentsMocker.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SystemNoticeMessage();
       obj.mId = String.valueOf(System.currentTimeMillis());
       obj.mTime = System.currentTimeMillis();
       obj.mContent = p0.mContent;
       obj.mDisplayDuration = p1;
       obj.mSortRank = 0;
       obj.mDisplayType = 1;
       UserInfo userInfo = new UserInfo();
       obj.mUser = userInfo;
       userInfo.mId = p0.mUserId;
       userInfo.mSex = p0.mUserGender;
       userInfo.mName = p0.mUserName;
       obj.mIsFirstSystemNotice = p2;
       LiveCommentsMocker.a(obj);
       return obj;
    }
    public static SystemNoticeMessage f(String p0,String p1){
       SystemNoticeMessage obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveCommentsMocker.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SystemNoticeMessage();
       obj.mDisplayType = 1;
       long l = System.currentTimeMillis();
       obj.mId = String.valueOf(l);
       obj.mTime = l;
       UserInfo userInfo = f.p(QCurrentUser.me());
       userInfo.mName = p0;
       obj.mUser = userInfo;
       obj.mContent = p1;
       obj.mSortRank = 0;
       return obj;
    }
    public static VoiceCommentMessage g(String p0,UserInfo p1,long p2,int p3,long p4){
       VoiceCommentMessage obj;
       LiveCommentsMocker liveComments = LiveCommentsMocker.class;
       if (PatchProxy.isSupport(liveComments)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, liveComments, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new VoiceCommentMessage();
       obj.mId = p0;
       obj.mTime = p2;
       obj.mUser = p1;
       obj.mSortRank = 0;
       obj.mLiveAssistantType = p3;
       obj.mDurationMs = p4;
       return obj;
    }
}
