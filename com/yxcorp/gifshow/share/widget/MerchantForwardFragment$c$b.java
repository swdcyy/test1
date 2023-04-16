package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import android.content.Context;
import nl8.p;
import java.util.Objects;
import android.content.ClipboardManager;
import android.content.ClipData;
import f17.c;
import e17.s;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$e;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$d;
import androidx.fragment.app.KwaiDialogFragment;

public final class MerchantForwardFragment$c$b implements View$OnClickListener	// class@001d11
{
    public final MerchantForwardFragment$c b;
    public final Object c;

    public void MerchantForwardFragment$c$b(MerchantForwardFragment$c p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       MerchantForwardFragment a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment$c$b.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.b.i.Jh())) {
          a = this.b.i.A;
          if (a == null) {
             a.S("copyCb");
          }
          if (a.isChecked()) {
             Context uContext = this.b.s();
             uContext = (uContext != null)? uContext.getSystemService("clipboard"): null;
             Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.content.ClipboardManager");
             uContext.setPrimaryClip(ClipData.newPlainText("Label", this.b.i.Jh()));
             uContext = this.b.s();
             if (uContext != null) {
                s.r(uContext, R.string.arg_RES_7f10326b, 1);
             }
          }
       }
    label_0063 :
       a = this.b.i.I;
       if (a != null) {
          a.a(this.c.c);
       }
       this.b.i.dismissAllowingStateLoss();
       return;
    }
}
