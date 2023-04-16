package com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveGiftTag extends Enum implements c	// class@001320
{
    public final String mName;
    public static final LiveGiftTag[] $VALUES;
    public static final LiveGiftTag COMBO;
    public static final LiveGiftTag FEED_PUSH;
    public static final LiveGiftTag GIFT_BOX;
    public static final LiveGiftTag GIFT_NAMING;
    public static final LiveGiftTag GIFT_SEND;
    public static final LiveGiftTag GIFT_SLOT;
    public static final LiveGiftTag GIFT_STORE;
    public static final LiveGiftTag LIVE_GIFT_GUIDE;
    public static final LiveGiftTag LIVE_GIFT_GUIDE_NOTICE;
    public static final LiveGiftTag LIVE_POPULARITY;
    public static final LiveGiftTag LIVE_POPULARITY_NOTICE;
    public static final LiveGiftTag LIVE_VICE_GIFT_GUIDE;
    public static final LiveGiftTag RECHARGE;

    static {
       LiveGiftTag liveGiftTag = new LiveGiftTag("GIFT_SEND", 0, "SEND_GIFT");
       LiveGiftTag.GIFT_SEND = liveGiftTag;
       LiveGiftTag liveGiftTag1 = new LiveGiftTag("COMBO", 1, "COMBO");
       LiveGiftTag.COMBO = liveGiftTag1;
       LiveGiftTag liveGiftTag2 = new LiveGiftTag("GIFT_BOX", 2, "GIFT_BOX");
       LiveGiftTag.GIFT_BOX = liveGiftTag2;
       LiveGiftTag liveGiftTag3 = new LiveGiftTag("LIVE_GIFT_GUIDE", 3, "LIVE_GIFT_GUIDE");
       LiveGiftTag.LIVE_GIFT_GUIDE = liveGiftTag3;
       LiveGiftTag liveGiftTag4 = new LiveGiftTag("LIVE_VICE_GIFT_GUIDE", 4, "LIVE_VICE_GIFT_GUIDE");
       LiveGiftTag.LIVE_VICE_GIFT_GUIDE = liveGiftTag4;
       LiveGiftTag liveGiftTag5 = new LiveGiftTag("LIVE_POPULARITY", 5, "LIVE_POPULARITY");
       LiveGiftTag.LIVE_POPULARITY = liveGiftTag5;
       LiveGiftTag liveGiftTag6 = new LiveGiftTag("LIVE_GIFT_GUIDE_NOTICE", 6, "LIVE_GIFT_GUIDE_NOTICE");
       LiveGiftTag.LIVE_GIFT_GUIDE_NOTICE = liveGiftTag6;
       LiveGiftTag liveGiftTag7 = new LiveGiftTag("LIVE_POPULARITY_NOTICE", 7, "LIVE_POPULARITY_NOTICE");
       LiveGiftTag.LIVE_POPULARITY_NOTICE = liveGiftTag7;
       LiveGiftTag liveGiftTag8 = new LiveGiftTag("FEED_PUSH", 8, "feed_push");
       LiveGiftTag.FEED_PUSH = liveGiftTag8;
       LiveGiftTag liveGiftTag9 = new LiveGiftTag("GIFT_SLOT", 9, "GIFT_SLOT");
       LiveGiftTag.GIFT_SLOT = liveGiftTag9;
       LiveGiftTag liveGiftTag10 = new LiveGiftTag("RECHARGE", 10, "RECHARGE");
       LiveGiftTag.RECHARGE = liveGiftTag10;
       LiveGiftTag liveGiftTag11 = new LiveGiftTag("GIFT_STORE", 11, "GIFT_STORE");
       LiveGiftTag.GIFT_STORE = liveGiftTag11;
       LiveGiftTag liveGiftTag12 = new LiveGiftTag("GIFT_NAMING", 12, "GIFT_NAMING");
       LiveGiftTag.GIFT_NAMING = liveGiftTag12;
       LiveGiftTag[] liveGiftTagA = new LiveGiftTag[13];
       liveGiftTagA[0] = liveGiftTag;
       liveGiftTagA[1] = liveGiftTag1;
       liveGiftTagA[2] = liveGiftTag2;
       liveGiftTagA[3] = liveGiftTag3;
       liveGiftTagA[4] = liveGiftTag4;
       liveGiftTagA[5] = liveGiftTag5;
       liveGiftTagA[6] = liveGiftTag6;
       liveGiftTagA[7] = liveGiftTag7;
       liveGiftTagA[8] = liveGiftTag8;
       liveGiftTagA[9] = liveGiftTag9;
       liveGiftTagA[10] = liveGiftTag10;
       liveGiftTagA[11] = liveGiftTag11;
       liveGiftTagA[12] = liveGiftTag12;
       LiveGiftTag.$VALUES = liveGiftTagA;
    }
    public void LiveGiftTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveGiftTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftTag.class, p0);
    }
    public static LiveGiftTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
