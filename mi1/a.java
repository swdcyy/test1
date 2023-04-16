package mi1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public interface abstract a	// class@003183
{

    GiftMessage a(LiveStreamMessages$GiftFeed p0);
    LiveGiftToAudienceMessage b(LiveStreamMessages$ToAudienceGiftFeed p0);
    BroadcastGiftMessage c(LiveStreamMessages$BroadcastGiftFeed p0);
}
