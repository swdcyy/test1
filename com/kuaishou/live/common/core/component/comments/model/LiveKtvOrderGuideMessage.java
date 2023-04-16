package com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderGuideMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveKtvOrderGuideMessage extends QLiveMessage	// class@0010c1
{
    public boolean mHasApply;
    public SCKtvRecommendToSing mRecommendToSingMsg;
    public static final long serialVersionUID = 0x6f09c95f1b363a99;

    public void LiveKtvOrderGuideMessage(){
       super();
       this.mHasApply = false;
    }
}
