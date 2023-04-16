package com.kuaishou.live.core.show.ask.model.LiveAskTabResponse$LiveAskMaxLikeQuestion;
import java.io.Serializable;
import com.kuaishou.live.core.show.ask.model.LiveAskTabResponse$LiveAskMaxLikeQuestion$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class LiveAskTabResponse$LiveAskMaxLikeQuestion implements Serializable	// class@0009d3
{
    public String mContent;
    public String mId;
    public int mLikeCount;
    public int mOrder;
    public static final LiveAskTabResponse$LiveAskMaxLikeQuestion$a Companion;
    public static final long serialVersionUID;

    static {
       LiveAskTabResponse$LiveAskMaxLikeQuestion.Companion = new LiveAskTabResponse$LiveAskMaxLikeQuestion$a(null);
    }
    public void LiveAskTabResponse$LiveAskMaxLikeQuestion(){
       super();
    }
    public final String getMId(){
       return this.mId;
    }
    public final int getMOrder(){
       return this.mOrder;
    }
    public final void setMId(String p0){
       this.mId = p0;
    }
    public final void setMOrder(int p0){
       this.mOrder = p0;
    }
}
