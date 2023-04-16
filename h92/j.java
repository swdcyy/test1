package h92.j;
import ok.x;
import h92.s;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;

public final class j implements x	// class@002d14
{
    public final s b;

    public void j(s p0){
       this.b = p0;
    }
    public final Object get(){
       s p = this.b.P;
       int i = (p == null)? 0: p.mId;
       b.Z(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][showGuideGiftBottomIconIfNecessary]supplier giftId:"+i);
       return Integer.valueOf(i);
    }
}
