package com.kuaishou.android.model.mix.FusionInfo;
import java.io.Serializable;
import java.lang.Object;

public class FusionInfo implements Serializable	// class@000c92
{
    public boolean isEnableSDKFetch;
    public boolean isPreview;
    public long mDuration;
    public String mEpisodeId;
    public HighLightStartEndTime mHighlightStartEndTime;
    public boolean mHighlightUrlFake;
    public String mMediaId;
    public List mPlays;
    public String mSource;
    public static final long serialVersionUID = 0x9d367390f67aec32;

    public void FusionInfo(){
       super();
       this.isEnableSDKFetch = true;
       this.isPreview = false;
    }
}
