package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$AuctionSuspendStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AbstractAuctionBubble$AuctionSuspendStatus extends Enum	// class@001b82
{
    public static final AbstractAuctionBubble$AuctionSuspendStatus[] $VALUES;
    public static final AbstractAuctionBubble$AuctionSuspendStatus RESUME;
    public static final AbstractAuctionBubble$AuctionSuspendStatus SUSPEND;

    static {
       AbstractAuctionBubble$AuctionSuspendStatus uAuctionSusp = new AbstractAuctionBubble$AuctionSuspendStatus("SUSPEND", 0);
       AbstractAuctionBubble$AuctionSuspendStatus.SUSPEND = uAuctionSusp;
       AbstractAuctionBubble$AuctionSuspendStatus uAuctionSusp1 = new AbstractAuctionBubble$AuctionSuspendStatus("RESUME", 1);
       AbstractAuctionBubble$AuctionSuspendStatus.RESUME = uAuctionSusp1;
       AbstractAuctionBubble$AuctionSuspendStatus[] uAuctionSusp2 = new AbstractAuctionBubble$AuctionSuspendStatus[]{uAuctionSusp,uAuctionSusp1};
       AbstractAuctionBubble$AuctionSuspendStatus.$VALUES = uAuctionSusp2;
    }
    public void AbstractAuctionBubble$AuctionSuspendStatus(String p0,int p1){
       super(p0, p1);
    }
    public static AbstractAuctionBubble$AuctionSuspendStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AbstractAuctionBubble$AuctionSuspendStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AbstractAuctionBubble$AuctionSuspendStatus.class, p0);
    }
    public static AbstractAuctionBubble$AuctionSuspendStatus[] values(){
       Object obj = PatchProxy.apply(null, null, AbstractAuctionBubble$AuctionSuspendStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AbstractAuctionBubble$AuctionSuspendStatus.$VALUES.clone();
    }
}
