package com.yxcorp.gifshow.model.WebVideoParam;
import java.io.Serializable;
import java.lang.Object;

public class WebVideoParam implements Serializable	// class@001ea6
{
    public String mBizType;
    public CDNUrl[] mCoverUrl;
    public boolean mPlayIfWarmUpFailed;
    public boolean mUseHardwareDecoding;
    public int mVideoHeight;
    public String mVideoId;
    public CDNUrl[] mVideoUrl;
    public int mVideoWidth;
    public String pageParams;
    public static final long serialVersionUID = 0x780ebe3cb65921a5;

    public void WebVideoParam(){
       super();
    }
}
