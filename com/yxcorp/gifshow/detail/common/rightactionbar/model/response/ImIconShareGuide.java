package com.yxcorp.gifshow.detail.common.rightactionbar.model.response.ImIconShareGuide;
import java.io.Serializable;
import java.lang.Object;

public class ImIconShareGuide implements Serializable	// class@0014a8
{
    public int imShareCount;
    public boolean lastImShare;
    public int likeOrFinishCount;
    public int likeOrPlayDuration;
    public ImIconShareGuide$NegativeFeedback negativeFeedback;
    public int playGap;
    public static final long serialVersionUID = 0xab32e574f2d5dbaf;

    public void ImIconShareGuide(){
       super();
       this.imShareCount = Integer.MAX_VALUE;
       this.lastImShare = false;
       this.likeOrFinishCount = 0;
       this.likeOrPlayDuration = 15;
       this.playGap = 60;
    }
}
