package h92.k;
import cm1.b;
import h92.s;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public final class k implements b	// class@002d16
{
    public final s a;

    public void k(s p0){
       this.a = p0;
    }
    public final void a(){
       k ta = this.a;
       String str = "GiftStore";
       if (ta.P == null) {
          b.P(LiveLogTag.GIFT_GUIDE.appendTag(str), "[LiveAudienceGiftGuidePresenter][mGiftStateListener] receive gift callback, show gift guide");
          ta.c9();
       }else {
          LiveLogTag gIFT_GUIDE = LiveLogTag.GIFT_GUIDE;
          gIFT_GUIDE.appendTag(str);
          b.T(gIFT_GUIDE, "[mGiftStateListener]", "mExplicitGift", ta.P, "enable", Boolean.TRUE);
       }
       return;
    }
}
