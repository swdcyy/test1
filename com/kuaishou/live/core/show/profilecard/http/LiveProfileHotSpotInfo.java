package com.kuaishou.live.core.show.profilecard.http.LiveProfileHotSpotInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileHotSpotInfo$a;
import nsd.u;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class LiveProfileHotSpotInfo implements Serializable	// class@000dca
{
    public final String hotSpotId;
    public final String hotSpotName;
    public final CDNUrl[] leftIcon;
    public final int rank;
    public static final LiveProfileHotSpotInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveProfileHotSpotInfo.Companion = new LiveProfileHotSpotInfo$a(null);
    }
    public void LiveProfileHotSpotInfo(CDNUrl[] p0,int p1,String p2,String p3){
       a.p(p0, "leftIcon");
       a.p(p2, "hotSpotName");
       a.p(p3, "hotSpotId");
       super();
       this.leftIcon = p0;
       this.rank = p1;
       this.hotSpotName = p2;
       this.hotSpotId = p3;
    }
    public final String getHotSpotId(){
       return this.hotSpotId;
    }
    public final String getHotSpotName(){
       return this.hotSpotName;
    }
    public final CDNUrl[] getLeftIcon(){
       return this.leftIcon;
    }
    public final int getRank(){
       return this.rank;
    }
}
