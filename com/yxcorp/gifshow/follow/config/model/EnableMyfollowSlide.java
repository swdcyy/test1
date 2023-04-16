package com.yxcorp.gifshow.follow.config.model.EnableMyfollowSlide;
import java.io.Serializable;
import java.lang.Object;

public class EnableMyfollowSlide implements Serializable	// class@00108e
{
    public boolean animationUserHead;
    public int autoPlayLiveMaxCount;
    public int notFirstScreenSimpleLiveIntervalMinute;
    public int notFirstScreenSimpleLiveStaySecond;
    public boolean sameLiveOrderInAndOut;
    public int topBarFoldInterval;
    public boolean topBarLiveOptimize;
    public String topBarLiveRowContent;
    public int topBarRefreshInterval;
    public int topBarRefreshThreshold;
    public static final long serialVersionUID = 0xa621c3b1c190b867;

    public void EnableMyfollowSlide(){
       super();
       this.topBarFoldInterval = 5;
       this.topBarRefreshInterval = 300;
       this.topBarRefreshThreshold = 10;
       this.animationUserHead = true;
       this.sameLiveOrderInAndOut = false;
    }
}
