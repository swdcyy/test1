package com.kuaishou.live.common.core.component.gift.gift.audience.v2.sendgiftguide.LiveGiftLinkageMessage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftLinkageMessage extends Enum	// class@001294
{
    public static final LiveGiftLinkageMessage[] $VALUES;
    public static final LiveGiftLinkageMessage COMBO_BUTTON_DISMISS_MSG;
    public static final LiveGiftLinkageMessage COMBO_BUTTON_SHOW_MSG;
    public static final LiveGiftLinkageMessage GIFT_ITEM_ANIMATOR_CANCELED_MSG;
    public static final LiveGiftLinkageMessage GIFT_ITEM_ANIMATOR_END_MSG;
    public static final LiveGiftLinkageMessage GIFT_ITEM_PLAY_INITIAL_SELECTION_ANIMATOR;
    public static final LiveGiftLinkageMessage GIFT_ITEM_PLAY_SELECTION_ANIMATOR;
    public static final LiveGiftLinkageMessage GIFT_ITEM_SELECTION_SHOW_MSG;
    public static final LiveGiftLinkageMessage GIFT_ITEM_STOP_SELECTION_ANIMATOR;

    static {
       LiveGiftLinkageMessage liveGiftLink1;
       LiveGiftLinkageMessage[] liveGiftLink = new LiveGiftLinkageMessage[]{liveGiftLink1,liveGiftLink1,liveGiftLink1,liveGiftLink1,liveGiftLink1,liveGiftLink1,liveGiftLink1,liveGiftLink1};
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_SELECTION_SHOW_MSG", 0);
       LiveGiftLinkageMessage.GIFT_ITEM_SELECTION_SHOW_MSG = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_ANIMATOR_END_MSG", 1);
       LiveGiftLinkageMessage.GIFT_ITEM_ANIMATOR_END_MSG = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_ANIMATOR_CANCELED_MSG", 2);
       LiveGiftLinkageMessage.GIFT_ITEM_ANIMATOR_CANCELED_MSG = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("COMBO_BUTTON_SHOW_MSG", 3);
       LiveGiftLinkageMessage.COMBO_BUTTON_SHOW_MSG = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("COMBO_BUTTON_DISMISS_MSG", 4);
       LiveGiftLinkageMessage.COMBO_BUTTON_DISMISS_MSG = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_PLAY_SELECTION_ANIMATOR", 5);
       LiveGiftLinkageMessage.GIFT_ITEM_PLAY_SELECTION_ANIMATOR = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_PLAY_INITIAL_SELECTION_ANIMATOR", 6);
       LiveGiftLinkageMessage.GIFT_ITEM_PLAY_INITIAL_SELECTION_ANIMATOR = liveGiftLink1;
       liveGiftLink1 = new LiveGiftLinkageMessage("GIFT_ITEM_STOP_SELECTION_ANIMATOR", 7);
       LiveGiftLinkageMessage.GIFT_ITEM_STOP_SELECTION_ANIMATOR = liveGiftLink1;
       LiveGiftLinkageMessage.$VALUES = liveGiftLink;
    }
    public void LiveGiftLinkageMessage(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftLinkageMessage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftLinkageMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftLinkageMessage.class, p0);
    }
    public static LiveGiftLinkageMessage[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftLinkageMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftLinkageMessage.$VALUES.clone();
    }
}
