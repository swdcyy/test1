package com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$PicUrl;

public class LiveGzoneInteractiveCommentMessage extends QLiveMessage	// class@0010bf
{
    public String mCommentBackgroundColorLeft;
    public String mCommentBackgroundColorRight;
    public String mCommentColor;
    public String mCommentText;
    public long mDisPlayDurationMS;
    public int mMessageViewLeftMargin;
    public int mMessageViewRightMargin;
    public UserInfos$PicUrl[] mRoleAvatarUrl;
    public String mRoleName;
    public int mRoleType;
    public static final long serialVersionUID = 0xbc0f46e53bebbcf3;

    public void LiveGzoneInteractiveCommentMessage(int p0,String p1,UserInfos$PicUrl[] p2,String p3,String p4,String p5,String p6,long p7){
       super();
       this.mRoleType = p0;
       this.mRoleName = p1;
       this.mRoleAvatarUrl = p2;
       this.mCommentText = p3;
       this.mCommentColor = p4;
       this.mCommentBackgroundColorLeft = p5;
       this.mCommentBackgroundColorRight = p6;
       this.mDisPlayDurationMS = p7;
    }
}
