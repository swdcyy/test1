package hz0.d;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$n;
import hz0.b;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import j47.a;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;

public class d implements GiftAnimContainerView$n	// class@0027d1
{
    public final b a;

    public void d(b p0){
       this.a = p0;
       super();
    }
    public void a(GiftMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.a.z.E1.uk()) {
          return;
       }
       a0 u = this.a.z.U;
       if (u != null) {
          u.w0(new UserProfile(p0.mUser, p0.mLiveAssistantType), LiveStreamClickType.GIFT_SLOT, 3, false, 9);
       }
       return;
    }
    public void b(GiftMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a.P8(p0);
       return;
    }
}
