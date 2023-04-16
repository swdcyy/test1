package m01.g;
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

public class g extends m	// class@0030a0
{
    public final b c;

    public void g(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tc = this.c;
       GiftTab propsPanel = GiftTab.PropsPanel;
       tc.S8(tc.s, propsPanel, "CLIENT_GIFT_BOX_TAB_CLICK", "[LiveAudienceGiftBoxTabChangePresenter][initGiftTabInfos]click props tab", 1);
       tc = this.c;
       tc.P8(propsPanel, tc.q.E);
       return;
    }
}
