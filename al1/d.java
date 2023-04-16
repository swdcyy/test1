package al1.d;
import tx1.d;
import al1.c;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import tx1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintExtInfo;
import ug1.u;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import al1.h;

public class d implements d	// class@0000cb
{
    public final LiveGiftItemHintItem a;
    public final Gift b;
    public final c c;

    public void d(c p0,LiveGiftItemHintItem p1,Gift p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(User p0){
       c.g(this, p0);
    }
    public void b(){
       c.b(this);
    }
    public void c(){
       c.e(this);
    }
    public void d(){
       c.a(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       LiveGiftItemHintItem mExtInfo = this.a.mExtInfo;
       if (mExtInfo != null && mExtInfo.activityTitleGift != null) {
          this.c.q.a();
          d tc = this.c;
          d tb = this.b;
          d ta = this.a;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(tb, ta, tc, c.class, "12") && tb != null) {
             ClientContent$LiveStreamPackage liveStreamPa = tc.S8();
             ClientContent$GiftPackage giftPackage = tc.R8(tb);
             ClientContent$UserPackage userPackage = tc.V8(ta);
             LiveGiftItemHintItem mDescription = ta.mDescription;
             if (!PatchProxy.applyVoidFourRefs(liveStreamPa, giftPackage, userPackage, mDescription, null, h.class, "2")) {
                h.a("GIFT_PANEL_BANNER", mDescription, liveStreamPa, giftPackage, userPackage, "2859511");
             }
          }
       }else {
          this.c.q.b();
       }
       return;
    }
    public void f(){
       c.d(this);
    }
    public void g(){
       c.c(this);
    }
    public void h(String p0){
       c.f(this, p0);
    }
}
