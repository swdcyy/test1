package bm1.b$a;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$o;
import bm1.b;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ik1.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class b$a implements GiftAnimContainerView$o	// class@0003c6
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(GiftMessage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, b$a.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.a.a();
       boolean b = this.a.a.e();
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object[] objArray = new Object[]{liveStreamPa,p0,Boolean.valueOf(b),Boolean.valueOf(p1),Boolean.valueOf(p2)};
          if (PatchProxy.applyVoid(objArray, null, uoc0, "1")) {
          label_0075 :
             return;
          }
       }
       String str = (b)? "2440586": "2440584";
       u1.M(str, null, 1, c0.b("GIFT_CARD", p1, p2), c0.a(liveStreamPa, p0), null);
       goto label_0075 ;
    }
    public void b(GiftMessage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, b$a.class, "2")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.a.a();
       if (!PatchProxy.isSupport(c0.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, c0.class, "2")) {
          u1.M("3485247", null, 1, c0.b("SEND_GIFT_CARD_GIFT_BUTTON", p1, p2), c0.a(liveStreamPa, p0), null);
       }
       return;
    }
    public void c(GiftMessage p0,boolean p1,boolean p2){
    }
}
