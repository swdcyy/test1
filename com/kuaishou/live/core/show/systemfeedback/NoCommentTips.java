package com.kuaishou.live.core.show.systemfeedback.NoCommentTips;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class NoCommentTips implements Serializable	// class@001173
{
    public final int displayLimit;
    public final int threshold;
    public final String tip;

    public void NoCommentTips(){
       super();
    }
    public final int getDisplayLimit(){
       return this.displayLimit;
    }
    public final int getThreshold(){
       return this.threshold;
    }
    public final String getTip(){
       return this.tip;
    }
}
