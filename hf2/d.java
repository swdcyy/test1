package hf2.d;
import android.view.View$OnClickListener;
import hf2.l;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.User;
import tx1.d;
import ne2.k;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements View$OnClickListener	// class@002d7f
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l j;
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "29")) {
       }else {
          tb.S8();
          if (tb.E.isInVoiceParty()) {
             j = tb.J;
             if (j != null) {
                j.h(tb.G.mId);
             }
          }else if(tb.J != null){
             j = tb.K;
             int profileOrigi = tb.E.getProfileOriginSource();
             User mId = tb.G.mId;
             Objects.requireNonNull(j);
             k ok = k.class;
             if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(profileOrigi), mId, j, ok, "22")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PERSONAL_CARD_USERCHAT_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("source", Integer.valueOf(profileOrigi));
                uElementPack.params = oi3.e();
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = mId;
                ClientContent$ContentPackage uContentPack = j.a();
                uContentPack.userPackage = userPackage;
                u1.G("", 1, uElementPack, uContentPack);
             }
             tb.J.g();
          }
       }
       return;
    }
}
