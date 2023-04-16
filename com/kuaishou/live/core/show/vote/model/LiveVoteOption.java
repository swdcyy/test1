package com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoteOption implements Serializable	// class@00123b
{
    public boolean isHighLight;
    public String mContent;
    public int mCount;
    public String mDisplayCount;
    public int mOptionId;

    public void LiveVoteOption(){
       super();
       this.isHighLight = false;
    }
}
