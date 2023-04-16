package com.yxcorp.gifshow.share.factory.TokenShareDialogFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.factory.TokenShareDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import hp7.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.KwaiDialogFragment;

public final class TokenShareDialogFragment$c implements View$OnClickListener	// class@001b8b
{
    public final TokenShareDialogFragment b;

    public void TokenShareDialogFragment$c(TokenShareDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TokenShareDialogFragment$c.class, "1")) {
          return;
       }
       TokenShareDialogFragment$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, TokenShareDialogFragment.class, "4")) {
          TokenShareDialogFragment u = tb.u;
          if (u != null) {
             TokenShareDialogFragment p = tb.p;
             if (p == null) {
                a.S("mShareMessage");
             }
             u.b(p);
          }
          tb.x = true;
          if (!PatchProxy.applyVoid(null, tb, TokenShareDialogFragment.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHARE_TOKEN_CLICK";
             u1.u(true, uElementPack, null);
          }
          tb.dismissAllowingStateLoss();
       }
       return;
    }
}
