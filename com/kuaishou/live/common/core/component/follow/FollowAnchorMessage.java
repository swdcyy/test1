package com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorShareInfo;
import b61.b;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User$FollowStatus;

public class FollowAnchorMessage extends QLiveMessage	// class@0010fe
{
    public String mAfterFollowString;
    public String mBeforeFollowString;
    public boolean mDataQualified;
    public LiveStreamMessages$FollowAuthorShareInfo mFollowAuthorShareInfo;
    public int mFollowAuthorSource;
    public UserInfo mFollowerUserInfo;
    public int mMaxUserNameLength;
    public boolean mShouldShowButton;
    public boolean mSpaceQualified;
    public String mUserNameString;
    public static final int b = 0;
    public static final long serialVersionUID = 0xa3f4a04092aa9be2;

    static {
       int i = (n.y(a1.c()) > a1.e(370.00f))? 9: 7;
       FollowAnchorMessage.b = i;
    }
    public void FollowAnchorMessage(){
       super();
       this.mAfterFollowString = "";
       this.mBeforeFollowString = "";
       this.mUserNameString = "";
       this.mMaxUserNameLength = 9;
    }
    public static int getMaxUserNameLength(){
       return FollowAnchorMessage.b;
    }
    public UserInfo getFollowerUserInfo(){
       return this.mFollowerUserInfo;
    }
    public UserInfo getUser(){
       Object obj = PatchProxy.apply(null, this, FollowAnchorMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getFollowerUserInfo();
    }
    public void parse(LiveStreamMessages$FollowAuthorFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowAnchorMessage.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.mId = p0.id;
          this.mLiveAssistantType = p0.liveAssistantType;
          this.mFollowAuthorShareInfo = p0.shareInfo;
          LiveStreamMessages$FollowAuthorFeed uFollowAutho = p0.fans;
          UserInfo userInfo = (uFollowAutho == null)? null: UserInfo.convertFromProto(uFollowAutho, 0);
          this.mFollowerUserInfo = userInfo;
          this.mFollowAuthorSource = p0.followAuthorSource;
          this.mLiveAudienceState = p0.senderState;
          this.mLogId = p0.id;
       }
       return;
    }
    public void setMaxUserNameLength(int p0){
       this.mMaxUserNameLength = p0;
    }
    public void setShouldShowButton(boolean p0){
       this.mShouldShowButton = p0;
    }
    public boolean shouldShowButton(){
       boolean b = (this.mShouldShowButton != null && this.mIsFoldMessage == null)? true: false;
       return b;
    }
    public void updateData(boolean p0,LiveStreamFeed p1){
       int b1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(FollowAnchorMessage.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, FollowAnchorMessage.class, "3")) {
          return;
       }
       boolean b = false;
       if (this.mFollowerUserInfo != null) {
          LiveStreamMessages$FollowAuthorShareInfo uFollowAutho = 3;
          StringBuilder str = 2;
          FollowAnchorMessage uFollowAncho = -1;
          if (!p0) {
             FollowAnchorMessage obj = PatchProxy.applyOneRefs(p1, this, FollowAnchorMessage.class, "4");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(p1 == null){
                User user1 = r1.T1(p1);
                if (user1 != null && TextUtils.n(QCurrentUser.me().getKwaiId(), user1.getKwaiId())) {
                   b1 = true;
                }
             }
             b1 = false;
             if (b1) {
             label_009d :
                obj = this.mFollowAuthorSource;
                if (obj == 1) {
                   i = 0x7f102c78;
                }else if(obj == str){
                   i = 0x7f102c76;
                }else if(obj == uFollowAutho){
                   i = 0x7f102c77;
                }else {
                   i = 0x7f102c79;
                }
             }else {
                obj = this.mFollowAuthorShareInfo;
                if (obj != null && obj.isFromShare != null) {
                   uFollowAutho = obj.shareUser;
                   if (uFollowAutho != null && TextUtils.n(String.valueOf(uFollowAutho.userId), QCurrentUser.me().getId())) {
                      i = 0x7f102213;
                      b1 = 0x7f10220d;
                   label_00b6 :
                      this.mAfterFollowString = a1.p(i);
                      if (b1 != uFollowAncho) {
                         this.mBeforeFollowString = a1.p(b1);
                      }
                      String str1 = b.c(this.mFollowerUserInfo);
                      Object obj1 = PatchProxy.applyOneRefs(str1, this, FollowAnchorMessage.class, "5");
                      if (obj1 != patchProxyRe) {
                         str1 = obj1;
                      }else if(str1 == null){
                         str1 = "";
                      }else {
                         int i1 = 0;
                         int i2 = 0;
                         while (i1 < str1.length()) {
                            b1 = str1.codePointAt(i1);
                            int i3 = 0;
                            while (true) {
                               int[][] b2 = TextUtils.b;
                               if (i3 < b2.length) {
                                  object oobject = b2[i3];
                                  if (oobject[b] <= b1 && b1 <= oobject[1]) {
                                     b1 = 1;
                                  label_00ff :
                                     b1 = (b1)? 2: 1;
                                     i2 = i2 + b1;
                                     if (i2 > this.mMaxUserNameLength) {
                                        str1 = str1.substring(b, i1)+"...";
                                     }else {
                                        i1 = i1 + 1;
                                     }
                                  }else {
                                     i3 = i3 + 1;
                                  }
                               }else {
                                  b1 = 0;
                                  goto label_00ff ;
                               }
                            }
                         }
                      }
                      this.mUserNameString = str1;
                   }else if(this.mFollowAuthorShareInfo.isFromFansGroupShare != null){
                      i = 0x7f102223;
                   }else {
                      i = 0x7f102c7c;
                   }
                }else {
                   obj = this.mFollowAuthorSource;
                   if (obj == 1) {
                      i = 0x7f102c7b;
                   }else if(obj == uFollowAutho){
                      i = 0x7f104a39;
                   }else {
                      i = 0x7f102c7a;
                   }
                }
             }
          }else {
             goto label_009d ;
          }
          b1 = -1;
          goto label_00b6 ;
       }
       User$FollowStatus fOLLOWING = User$FollowStatus.FOLLOWING;
       User user = (p1 != null)? r1.T1(p1): null;
       if (user != null) {
          fOLLOWING = user.getFollowStatus();
       }
       if (!p0 && fOLLOWING == User$FollowStatus.UNFOLLOW) {
          b = true;
       }
       this.mDataQualified = b;
       return;
    }
}
