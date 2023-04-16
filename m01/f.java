package m01.f;
import com.yxcorp.gifshow.widget.m;
import m01.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import mk1.h;
import tk1.b;

public class f extends m	// class@00309f
{
    public final b c;

    public void f(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       GiftTab fansGroupGif = GiftTab.FansGroupGift;
       tc.S8(tc.s, fansGroupGif, "CLIENT_GIFT_BOX_TAB_CLICK", "[LiveAudienceGiftBoxTabChangePresenter][initGiftTabInfos]click fans group gift tab", 1);
       tc = this.c;
       tc.P8(fansGroupGif, tc.q.D);
       return;
    }
}
