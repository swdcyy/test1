package com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$GiftSlotSize;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBulletinLayoutManager$GiftSlotSize extends Enum	// class@000e38
{
    public static final LiveBulletinLayoutManager$GiftSlotSize[] $VALUES;
    public static final LiveBulletinLayoutManager$GiftSlotSize NORMAL;
    public static final LiveBulletinLayoutManager$GiftSlotSize SMALL;

    static {
       LiveBulletinLayoutManager$GiftSlotSize giftSlotSize1;
       LiveBulletinLayoutManager$GiftSlotSize[] giftSlotSize = new LiveBulletinLayoutManager$GiftSlotSize[]{giftSlotSize1,giftSlotSize1};
       giftSlotSize1 = new LiveBulletinLayoutManager$GiftSlotSize("NORMAL", 0);
       LiveBulletinLayoutManager$GiftSlotSize.NORMAL = giftSlotSize1;
       giftSlotSize1 = new LiveBulletinLayoutManager$GiftSlotSize("SMALL", 1);
       LiveBulletinLayoutManager$GiftSlotSize.SMALL = giftSlotSize1;
       LiveBulletinLayoutManager$GiftSlotSize.$VALUES = giftSlotSize;
    }
    public void LiveBulletinLayoutManager$GiftSlotSize(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBulletinLayoutManager$GiftSlotSize valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBulletinLayoutManager$GiftSlotSize.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBulletinLayoutManager$GiftSlotSize.class, p0);
    }
    public static LiveBulletinLayoutManager$GiftSlotSize[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBulletinLayoutManager$GiftSlotSize.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBulletinLayoutManager$GiftSlotSize.$VALUES.clone();
    }
}
