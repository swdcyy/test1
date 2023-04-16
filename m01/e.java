package m01.e;
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

public class e extends m	// class@00309e
{
    public final b c;

    public void e(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tc = this.c;
       GiftTab privilegeGif = GiftTab.PrivilegeGift;
       tc.S8(tc.s, privilegeGif, "CLIENT_GIFT_BOX_TAB_CLICK", "[LiveAudienceGiftBoxTabChangePresenter][initGiftTabInfos]click privilege gift tab", 1);
       tc = this.c;
       tc.P8(privilegeGif, tc.q.C);
       return;
    }
}
