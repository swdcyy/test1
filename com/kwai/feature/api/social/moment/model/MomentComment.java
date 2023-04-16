package com.kwai.feature.api.social.moment.model.MomentComment;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.api.social.moment.model.AddMomentCommentResponse;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.social.moment.model.MomentComment$a;
import java.lang.Number;

public class MomentComment implements Serializable	// class@001180
{
    public MomentComment$a b;
    public User mCommentUser;
    public String mContent;
    public EmotionInfo mEmotionInfo;
    public String mId;
    public String mMomentId;
    public String mMomentUserId;
    public String mPublishTime;
    public String mReplyToCommentId;
    public User mReplyToUser;
    public static final long serialVersionUID = 0xb8b2fc287c067e32;

    public void MomentComment(){
       super();
       this.mMomentUserId = "";
    }
    public static MomentComment create(AddMomentCommentResponse p0,String p1,String p2,String p3){
       MomentComment momentCommen = new MomentComment();
       if (p0 == null) {
          return momentCommen;
       }
       momentCommen.mId = p0.mId;
       momentCommen.mContent = p0.mContent;
       momentCommen.mPublishTime = p0.mPublishTime;
       momentCommen.mMomentId = p3;
       if (!TextUtils.x(p1) && !TextUtils.x(p2)) {
          User user = new User(p1, p2, "", "", null);
          momentCommen.mReplyToUser = TextUtils.x(p2);
       }
       return momentCommen;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentComment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!TextUtils.n(this.mId, p0.mId) || !TextUtils.n(this.mMomentId, p0.mMomentId)) {
          b = false;
       }
       return b;
    }
    public MomentComment$a getHolder(){
       MomentComment$a uoa;
       MomentComment obj = PatchProxy.apply(null, this, MomentComment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          uoa = new MomentComment$a();
          this.b = uoa;
       }
       return uoa;
    }
    public int hashCode(){
       MomentComment obj = PatchProxy.apply(null, this, MomentComment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MomentComment tmMomentId = this.mMomentId;
       if (tmMomentId != null) {
          i = tmMomentId.hashCode();
       }
       return (i1 + i);
    }
}
