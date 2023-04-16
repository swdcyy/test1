package com.kwai.feature.post.api.feature.bridge.JsApplyRecordMusicParam;
import java.io.Serializable;
import java.lang.Object;

public class JsApplyRecordMusicParam implements Serializable	// class@00132e
{
    public JsApplyRecordMusicParam$DownloadBarOption mDownloadBarOption;
    public int mDownloadBarUIMode;
    public JsonObject mExtraParam;
    public boolean mIsForceUpdate;
    public String mMusicId;
    public int mMusicSource;
    public int mMusicType;
    public static final long serialVersionUID = 0xc6f495fbffc857fd;

    public void JsApplyRecordMusicParam(){
       super();
       this.mMusicSource = 0;
       this.mDownloadBarUIMode = 0;
    }
}
