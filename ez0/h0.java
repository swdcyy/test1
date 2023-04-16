package ez0.h0;
import ok.o;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;

public final class h0 implements o	// class@00224a
{
    public final GiftTab b;

    public void h0(GiftTab p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       h0 tb = this.b;
       boolean b = (p0.a(tb) && p0.c() == tb)? true: false;
       return b;
    }
}
