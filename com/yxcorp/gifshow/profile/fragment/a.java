package com.yxcorp.gifshow.profile.fragment.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import t3c.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k3c.e;
import ou7.h$b;
import ou7.h;

public final class a implements View$OnClickListener	// class@00131e
{
    public final AvatarFragment$b b;

    public void a(AvatarFragment$b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       AvatarFragment$b s = tb.s;
       String id = tb.q.getId();
       Objects.requireNonNull(s);
       if (PatchProxy.applyVoidOneRefs(id, s, g.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 993;
          ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
          ClientContent$ProfilePackage profilePacka1 = new ClientContent$ProfilePackage();
          profilePacka1.visitedUid = TextUtils.I(id);
          uContentPack1.profilePackage = profilePacka1;
          u1.u(1, uElementPack, uContentPack1);
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = tb.q.getId();
       uContentPack.profilePackage = profilePacka;
       h.b(tb.getContext(), tb.q, uContentPack, new e(tb));
       return;
    }
}
