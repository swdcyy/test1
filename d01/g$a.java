package d01.g$a;
import d01.a;
import d01.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import d01.o;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import android.widget.RelativeLayout;
import java.lang.Long;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import d01.p;
import com.kwai.robust.PatchProxyResult;
import d01.p$a;
import java.lang.Enum;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import mk1.b;
import o02.f;
import o02.e;
import mk1.h;
import xp5.g;
import lp3.c;
import lp3.e;
import brd.t;
import cjd.e;
import erd.o;
import d01.f;
import bp6.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g$a implements a	// class@001ed8
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(GiftTab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       g$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, g.class, "8")) {
          o oo = ta.V8(p0);
          if (ta.P8(oo)) {
             LiveGiftTitleView liveGiftTitl = oo.a();
             if (liveGiftTitl.getTag() instanceof Long) {
                LiveLogTag gIFT = LiveLogTag.GIFT;
                String str = "consume "+p0+"red dot";
                String str1 = PatchProxy.applyOneRefs(p0, null, p.class, "4");
                if (str1 != PatchProxyResult.class) {
                }else {
                   int i = p$a.a[p0.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                            str1 = (i != 4)? "": "liveLatestUpdatePropsTime";
                         }else {
                            str1 = "liveLatestUpdatePrivilegeGiftTime";
                         }
                      }else {
                         str1 = "liveLatestUpdateFansGroupGiftTime";
                      }
                   }else {
                      str1 = "liveLatestUpdatePacketPrizeTime";
                   }
                }
                b.h0(gIFT, str, ImmutableMap.of(str1, String.valueOf(liveGiftTitl.getTag())));
                ta.y.a(p0, liveGiftTitl.getTag().longValue());
             }
          }
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "3")) {
          return;
       }
       this.a.R8(GiftTab.PacketGift, p0);
       this.a.R8(GiftTab.FansGroupGift, p0);
       this.a.R8(GiftTab.PrivilegeGift, p0);
       this.a.R8(GiftTab.PropsPanel, p0);
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$a.class, "1")) {
          return;
       }
       g$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, g.class, "4") && !ta.W8()) {
          ta.X7(e.a().h0(ta.p.n.a(g.class).getLiveStreamId()).map(new e()).subscribe(new f(ta), new a()));
       }
       return;
    }
}
