package com.yxcorp.gifshow.entity.transfer.QCommentDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.QComment;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.User;
import ekd.k0;
import xca.a;
import el.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.ArrayList;
import xca.b;
import java.util.List;
import xca.c;
import xca.d;
import xca.e;
import xca.f;
import java.util.Map;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo;

public class QCommentDeserializer implements b	// class@000e44
{

    public void QCommentDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       List list;
       QComment qComment = PatchProxy.applyThreeRefs(p0, p1, p2, this, QCommentDeserializer.class, "1");
       if (qComment != PatchProxyResult.class) {
       }else {
          qComment = new QComment();
          User user = p2.c(p0, User.class);
          qComment.mUser = user;
          String str = "";
          user.mId = k0.h(p0, "author_id", str);
          qComment.mUser.mName = k0.h(p0, "author_name", str);
          qComment.mUser.mSex = k0.h(p0, "author_sex", "U");
          String str1 = null;
          qComment.mUser.mAvatar = k0.h(p0, "headurl", str1);
          String str2 = "headurls";
          if (k0.a(p0, str2)) {
             qComment.mUser.mAvatars = p2.c(k0.e(p0, str2), new a(this).getType());
          }
          if (k0.f(p0, "isFollowed", 0) == 1) {
             qComment.mUser.setFollowStatus(User$FollowStatus.FOLLOWING);
          }
          String str3 = "authorVerifiedDetail";
          if (k0.a(p0, str3)) {
             qComment.mUser.mVerifiedDetail = p2.c(k0.e(p0, str3), UserVerifiedDetail.class);
          }
          str3.mVerified = k0.c(p0, "authorVerified", 0);
          str3 = k0.h(p0, "reply_to", str1);
          qComment.mReplyToUserId = str3;
          String str4 = "0";
          if (TextUtils.isEmpty(str3) || str4.equals((qComment.mReplyToUserId).trim())) {
             qComment.mReplyToUserId = str1;
          }
          str3 = k0.h(p0, "replyToCommentId", str1);
          qComment.mReplyToCommentId = str3;
          if (TextUtils.isEmpty(str3) || str4.equals((qComment.mReplyToCommentId).trim())) {
             qComment.mReplyToCommentId = str1;
          }
          qComment.mId = k0.h(p0, "comment_id", str);
          qComment.mPhotoId = k0.h(p0, "photo_id", str);
          qComment.mPhotoUserId = k0.h(p0, "user_id", str);
          qComment.mComment = k0.h(p0, "content", str);
          qComment.mCreated = k0.g(p0, "timestamp", 0);
          qComment.mReplyToUserName = k0.h(p0, "replyToUserName", str);
          qComment.mIsHot = k0.c(p0, "hot", 0);
          qComment.mLiked = k0.c(p0, "liked", 0);
          qComment.mDisliked = k0.c(p0, "disliked", 0);
          qComment.mLikedCount = k0.g(p0, "likedCount", 0);
          qComment.mSubCommentCount = k0.f(p0, "subCommentCount", 0);
          qComment.mRecallType = k0.f(p0, "recallType", 0);
          qComment.mIsFriendComment = k0.c(p0, "friendComment", 0);
          qComment.mIsFollowingComment = k0.c(p0, "followingComment", 0);
          qComment.mIsNearbyAuthor = k0.c(p0, "nearbyAuthor", 0);
          qComment.mSubCommentVisible = k0.c(p0, "subCommentVisible", 0);
          qComment.mSubCommentVisibleLimit = k0.f(p0, "subCommentVisibleLimit", 0);
          qComment.mIsAuthorPraised = k0.c(p0, "author_liked", 0);
          qComment.mRecommendDesc = k0.h(p0, "forwardPhotoComment", str);
          qComment.mAuthorArea = k0.h(p0, "authorArea", str);
          qComment.mConversation = k0.h(p0, "conversation", str);
          str = "emotion";
          if (k0.a(p0, str)) {
             qComment.mEmotionInfo = p2.c(k0.e(p0, str), EmotionInfo.class);
          }
          ArrayList uArrayList = new ArrayList();
          str1 = "attachments";
          if (k0.a(p0, str1)) {
             uArrayList = p2.c(k0.e(p0, str1), new b(this).getType());
          }
          qComment.attachmentList = uArrayList;
          uArrayList = new ArrayList();
          str1 = "commentAuthorTags";
          if (k0.a(p0, str1)) {
             list = p2.c(k0.e(p0, str1), new c(this).getType());
          }
          qComment.mLabels = list;
          str = "commentBottomTags";
          if (k0.a(p0, str)) {
             qComment.mCommentBottomTags = p2.c(k0.e(p0, str), new d(this).getType());
          }
          str = "bubbleTags";
          if (k0.a(p0, str)) {
             qComment.mCommentMarqueeTags = p2.c(k0.e(p0, str), new e(this).getType());
          }
          str = "cashTags";
          if (k0.a(p0, str)) {
             qComment.mCashTags = p2.c(k0.e(p0, str), new f(this).getType());
          }
          str = "authorPendantInfo";
          if (k0.a(p0, str)) {
             qComment.mCommentAuthorPendantInfo = p2.c(k0.e(p0, str), CommentAuthorPendantInfo.class);
          }
          qComment.mIsGodComment = k0.c(p0, "godComment", 0);
          qComment.mIsHighQualityComment = k0.c(p0, "highQualityComment", 0);
          qComment.mGodCommentNegatived = k0.c(p0, "godCommentNegatived", 0);
          qComment.mDisplaySubCommentCount = k0.c(p0, "displaySubCommentCount", 0);
          qComment.afterDeserialize();
       }
       return qComment;
    }
}
