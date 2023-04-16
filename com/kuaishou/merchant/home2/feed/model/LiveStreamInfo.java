package com.kuaishou.merchant.home2.feed.model.LiveStreamInfo;
import java.io.Serializable;
import com.kuaishou.merchant.home2.feed.model.LiveStreamInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class LiveStreamInfo implements Serializable	// class@0017b8
{
    public boolean isLiving;
    public String liveAuthorId;
    public String liveStreamId;
    public static final LiveStreamInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveStreamInfo.Companion = new LiveStreamInfo$a(null);
    }
    public void LiveStreamInfo(){
       super(null, null, false, 7, null);
    }
    public void LiveStreamInfo(String p0,String p1,boolean p2){
       super();
       this.liveAuthorId = p0;
       this.liveStreamId = p1;
       this.isLiving = p2;
    }
    public void LiveStreamInfo(String p0,String p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getLiveAuthorId(){
       return this.liveAuthorId;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final boolean isLiving(){
       return this.isLiving;
    }
    public final void setLiveAuthorId(String p0){
       this.liveAuthorId = p0;
    }
    public final void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
    public final void setLiving(boolean p0){
       this.isLiving = p0;
    }
}
