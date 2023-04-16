package com.yxcorp.gifshow.share.factory.TokenShareDialogFragment$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.factory.TokenShareDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TokenShareDialogFragment$b implements View$OnClickListener	// class@001b8a
{
    public final TokenShareDialogFragment b;

    public void TokenShareDialogFragment$b(TokenShareDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TokenShareDialogFragment$b.class, "1")) {
          return;
       }
       TokenShareDialogFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, TokenShareDialogFragment.class, "5")) {
          tb.dismissAllowingStateLoss();
          if (!PatchProxy.applyVoid(null, tb, TokenShareDialogFragment.class, "10")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHARE_TOKEN_CANCEL_CLICK";
             i3 oi3 = i3.f();
             oi3.d("click_area", "cancel");
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
