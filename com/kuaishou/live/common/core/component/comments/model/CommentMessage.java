package com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import mf1.a;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeedEmotion;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;

public class CommentMessage extends QLiveMessage implements a	// class@0010b4
{
    public String mCommentId;
    public String mLandscapeFontColor;
    public String[] mUnsupportedGzoneEmotions;
    public UserStateRichTextSegment[] mUserStateSegment;
    public static final long serialVersionUID = 0xe4e2e75f34a5563c;

    public void CommentMessage(){
       super();
       this.mUnsupportedGzoneEmotions = null;
       this.setBackgroundGroupType(1);
    }
    public boolean hasSetUserStateSegment(){
       Object obj = PatchProxy.apply(null, this, CommentMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.h(this.mUserStateSegment) ^ 0x01);
    }
    public CommentMessage setCommentId(String p0){
       this.mCommentId = p0;
       return this;
    }
    public CommentMessage setLandscapeFontColor(String p0){
       this.mLandscapeFontColor = p0;
       return this;
    }
    public CommentMessage setUnsupportedGzoneEmotions(LiveStreamMessages$CommentFeedEmotion[] p0){
       if (p0 != null && p0.length > 0) {
          String[] stringArray = new String[p0.length];
          this.mUnsupportedGzoneEmotions = stringArray;
          for (int i = 0; i < p0.length; i = i + 1) {
             this.mUnsupportedGzoneEmotions[i] = p0[i].emotionName;
          }
       }
       return this;
    }
    public void setUserStateSegment(UserStateRichTextSegment[] p0){
       this.mUserStateSegment = p0;
    }
}
