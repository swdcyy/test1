package com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo;
import java.io.Serializable;
import java.lang.Object;

public class ShareOrderInfo implements Serializable	// class@001167
{
    public long mLastShareTime;
    public int mPriority;
    public int mShareCount;
    public long mUpdateTime;
    public static final ShareOrderInfo EMPTY;
    public static final long serialVersionUID;

    static {
       ShareOrderInfo.EMPTY = new ShareOrderInfo();
    }
    public void ShareOrderInfo(){
       super();
    }
}
