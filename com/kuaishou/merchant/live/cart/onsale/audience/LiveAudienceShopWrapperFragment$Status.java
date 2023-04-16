package com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceShopWrapperFragment$Status extends Enum	// class@00191b
{
    public final int mIndex;
    public static final LiveAudienceShopWrapperFragment$Status[] $VALUES;
    public static final LiveAudienceShopWrapperFragment$Status FAILURE;
    public static final LiveAudienceShopWrapperFragment$Status LOADING;
    public static final LiveAudienceShopWrapperFragment$Status SUCCESS;

    static {
       LiveAudienceShopWrapperFragment$Status status = new LiveAudienceShopWrapperFragment$Status("SUCCESS", 0, 1);
       LiveAudienceShopWrapperFragment$Status.SUCCESS = status;
       LiveAudienceShopWrapperFragment$Status status1 = new LiveAudienceShopWrapperFragment$Status("FAILURE", 1, 2);
       LiveAudienceShopWrapperFragment$Status.FAILURE = status1;
       LiveAudienceShopWrapperFragment$Status status2 = new LiveAudienceShopWrapperFragment$Status("LOADING", 2, 3);
       LiveAudienceShopWrapperFragment$Status.LOADING = status2;
       LiveAudienceShopWrapperFragment$Status[] statusArray = new LiveAudienceShopWrapperFragment$Status[]{status,status1,status2};
       LiveAudienceShopWrapperFragment$Status.$VALUES = statusArray;
    }
    public void LiveAudienceShopWrapperFragment$Status(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static LiveAudienceShopWrapperFragment$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceShopWrapperFragment$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceShopWrapperFragment$Status.class, p0);
    }
    public static LiveAudienceShopWrapperFragment$Status[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceShopWrapperFragment$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceShopWrapperFragment$Status.$VALUES.clone();
    }
}
