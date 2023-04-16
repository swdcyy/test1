package com.kwai.feature.api.social.bridge.beans.JsSendImFriendMessageParams;
import java.io.Serializable;
import java.lang.Object;

public class JsSendImFriendMessageParams implements Serializable	// class@0010b0
{
    public String mActivityId;
    public String mCallback;
    public boolean mDisableShareDialog;
    public JsSendImFriendMessageParams$ImageContent mImage;
    public JsSendImFriendMessageParams$LinkContent mLink;
    public int mMsgScene;
    public int mMsgType;
    public JsSendImFriendMessageParams$PaiYiPaiContent mPaiYiPai;
    public List mPhotos;
    public String mTargetHeadUrl;
    public String mTargetId;
    public String mTargetName;
    public int mTargetType;
    public String mText;
    public static final long serialVersionUID = 0x41674c189160c1e7;

    public void JsSendImFriendMessageParams(){
       super();
    }
}
