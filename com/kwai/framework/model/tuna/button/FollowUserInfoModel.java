package com.kwai.framework.model.tuna.button.FollowUserInfoModel;
import java.io.Serializable;
import java.lang.Object;

public class FollowUserInfoModel implements Serializable	// class@0016ca
{
    public int mFollowRefer;
    public int mFollowStatus;
    public JumpUrlModel mJumpUrlModel;
    public String mUserId;
    public static final long serialVersionUID = 0x3ef687d775cc6d9f;

    public void FollowUserInfoModel(){
       super();
    }
    public void setFollowRefer(int p0){
       this.mFollowRefer = p0;
    }
}
