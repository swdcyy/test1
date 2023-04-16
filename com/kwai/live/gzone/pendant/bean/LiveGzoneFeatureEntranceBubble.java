package com.kwai.live.gzone.pendant.bean.LiveGzoneFeatureEntranceBubble;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;

public class LiveGzoneFeatureEntranceBubble implements Serializable, a	// class@000d92
{
    public String mBubbleContent;
    public String mBubbleId;
    public String mEntranceId;
    public boolean mIsIgnoreOtherTips;
    public boolean mLogBubbleShowEvent;
    public boolean mSaveDisplayedBubble;
    public static final long serialVersionUID = 0x7c0b9b011a6aa5fe;

    public void LiveGzoneFeatureEntranceBubble(){
       super();
       this.mIsIgnoreOtherTips = false;
    }
    public void afterDeserialize(){
       this.mSaveDisplayedBubble = true;
       this.mLogBubbleShowEvent = true;
    }
}
