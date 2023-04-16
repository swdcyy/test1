package com.yxcorp.gifshow.entity.transfer.QCommentSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;

public class QCommentSerializer implements i	// class@000e45
{

    public void QCommentSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, QCommentSerializer.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.c0("comment_id", p0.getId());
          jsonObject.c0("photo_id", p0.getPhotoId());
          jsonObject.c0("user_id", p0.getPhotoUserId());
          jsonObject.c0("author_id", p0.getUser().getId());
          jsonObject.c0("author_name", p0.getUser().getName());
          jsonObject.c0("author_sex", p0.getUser().getSex());
          String str = (p0.getUser().isFollowingOrFollowRequesting())? "1": "0";
          jsonObject.c0("isFollowed", str);
          QComment mReplyToUser = p0.mReplyToUserId;
          String str1 = "";
          if (mReplyToUser == null) {
             mReplyToUser = str1;
          }
          jsonObject.c0("reply_to", mReplyToUser);
          mReplyToUser = p0.mReplyToCommentId;
          if (mReplyToUser != null) {
             str1 = mReplyToUser;
          }
          jsonObject.c0("replyToCommentId", str1);
          jsonObject.c0("headurl", p0.getUser().getAvatar());
          if (p0.getUser().getAvatars() != null) {
             jsonObject.G("headurls", p2.a(p0.getUser().getAvatars()));
          }
          jsonObject.c0("content", p0.getComment());
          jsonObject.a0("timestamp", Long.valueOf(p0.created()));
          jsonObject.H("author_liked", Boolean.valueOf(p0.mIsAuthorPraised));
          jsonObject.H("godComment", Boolean.valueOf(p0.mIsGodComment));
          jsonObject.H("highQualityComment", Boolean.valueOf(p0.mIsHighQualityComment));
          jsonObject.H("displaySubCommentCount", Boolean.valueOf(p0.mDisplaySubCommentCount));
          jsonObject.H("godCommentNegatived", Boolean.valueOf(p0.mGodCommentNegatived));
          jsonObject.c0("replyToUserName", p0.mReplyToUserName);
       }
       return jsonObject;
    }
}
