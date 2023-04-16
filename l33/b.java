package l33.b;
import l33.c;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;

public interface abstract b	// class@001d3f
{

    int getCount();
    c getDateLimitedGiftUIConfig(int p0);
    String getDescription();
    String getExpireTip();
    List getImageUrls();
    float getLeftExpireTime();
    List getLeftTopTagUrls();
    String getName();
    GiftPanelItemViewData getPanelItemViewData();
    boolean isCountLimited();
    boolean isExpiredSoon();
    boolean shouldIgnoreEmptyTag();
}
