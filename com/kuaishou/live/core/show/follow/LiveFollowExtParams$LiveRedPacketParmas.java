package com.kuaishou.live.core.show.follow.LiveFollowExtParams$LiveRedPacketParmas;
import java.io.Serializable;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.lang.String;
import java.lang.Object;

public class LiveFollowExtParams$LiveRedPacketParmas implements Serializable	// class@000bab
{
    public String id;
    public String mDeliveryOrderId;
    public final LiveFollowExtParams this$0;
    public int type;
    public static final long serialVersionUID = 0xb050103f6d430ec4;

    public void LiveFollowExtParams$LiveRedPacketParmas(LiveFollowExtParams p0,int p1,String p2,String p3){
       this.this$0 = p0;
       super();
       this.type = p1;
       this.id = p2;
       this.mDeliveryOrderId = p3;
    }
}
