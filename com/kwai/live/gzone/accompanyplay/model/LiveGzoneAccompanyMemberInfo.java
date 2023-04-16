package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneAccompanyMemberInfo implements Serializable	// class@000c3b
{
    public LiveGzoneAccompanyBindGameAccountInfo mBindGameAccountInfo;
    public String mConfirmStatus;
    public boolean mHasEnterGame;
    public String mIcon;
    public String mName;
    public List mOtherInfo;
    public long mUserId;
    public static final long serialVersionUID = 0x37052906bd812f55;

    public void LiveGzoneAccompanyMemberInfo(){
       super();
    }
}
