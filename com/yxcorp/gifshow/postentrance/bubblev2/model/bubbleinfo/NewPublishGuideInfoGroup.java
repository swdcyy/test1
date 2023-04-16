package com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfoGroup;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfo;

public class NewPublishGuideInfoGroup implements Serializable	// class@001010
{
    public NewPublishGuideInfo mBubbleInfo;
    public static final long serialVersionUID = 0x3e65d9ce3676e99a;

    public void NewPublishGuideInfoGroup(){
       super();
       this.mBubbleInfo = new NewPublishGuideInfo();
    }
}
