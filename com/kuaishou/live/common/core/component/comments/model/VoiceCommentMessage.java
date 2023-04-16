package com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import mf1.a;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage$Status;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import java.lang.StringBuilder;

public class VoiceCommentMessage extends QLiveMessage implements a	// class@0010c9
{
    public boolean mAsrSuccess;
    public long mDurationMs;
    public boolean mHasCompressed;
    public boolean mIsManualPlay;
    public String mMmuDetectionId;
    public int mMmuDetectionResult;
    public String mSendType;
    public VoiceCommentMessage$Status mStatus;
    public UserStateRichTextSegment[] mUserStateSegment;
    public CDNUrl[] mVoiceFileCdnUrl;
    public String mVoiceFilePath;
    public static final long serialVersionUID = 0xbde89663a1d1393c;

    public void VoiceCommentMessage(){
       super();
       this.mAsrSuccess = false;
       this.mMmuDetectionResult = Integer.MIN_VALUE;
       this.mStatus = VoiceCommentMessage$Status.DOWNLOADING;
    }
    public boolean hasSetUserStateSegment(){
       Object obj = PatchProxy.apply(null, this, VoiceCommentMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.h(this.mUserStateSegment) ^ 0x01);
    }
    public void setUserStateSegment(UserStateRichTextSegment[] p0){
       this.mUserStateSegment = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoiceCommentMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoiceCommentMessage{mId=\'"+this.mId+'''+", mStatus=\'"+this.mStatus+'''+", mIsManualPlay=\'"+this.mIsManualPlay+'''+", mDurationMs=\'"+this.mDurationMs+'''+", mVoiceContent=\'"+this.mContent+'''+", mVoiceFilePath="+this.mVoiceFilePath+'}';
    }
}
