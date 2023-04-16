package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mhc.p1;
import y8c.r;
import java.util.Objects;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import android.content.Context;
import android.content.ClipboardManager;
import android.content.ClipData;
import f17.c;
import e17.s;
import androidx.fragment.app.KwaiDialogFragment;
import msd.p;
import qrd.l1;

public final class MerchantForwardFragment$c$a implements View$OnClickListener	// class@001d10
{
    public final MerchantForwardFragment$c b;
    public final Object c;

    public void MerchantForwardFragment$c$a(MerchantForwardFragment$c p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment$c$a.class, "1")) {
          return;
       }
       MerchantForwardFragment$c$a tb = this.b;
       MerchantForwardFragment$c i = tb.i;
       MerchantForwardFragment$c$a tc = this.c;
       int i1 = tb.F();
       Objects.requireNonNull(i);
       if (!PatchProxy.isSupport(MerchantForwardFragment.class) || (!PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i1), i, MerchantForwardFragment.class, "9") && !i.isDetached())) {
          if (!TextUtils.isEmpty(i.C)) {
             MerchantForwardFragment a = i.A;
             if (a == null) {
                a.S("copyCb");
             }
             if (a.isChecked()) {
                Context context = i.getContext();
                Object systemServic = (context != null)? context.getSystemService("clipboard"): null;
                Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
                systemServic.setPrimaryClip(ClipData.newPlainText("Label", i.C));
                context = i.getContext();
                if (context != null) {
                   s.r(context, R.string.arg_RES_7f10326c, 1);
                }
             }
          }
       label_007c :
          i.dismissAllowingStateLoss();
          MerchantForwardFragment g = i.G;
          if (g != null) {
             g.invoke(tc, Integer.valueOf(i1));
          }
       }
    label_008d :
       return;
    }
}
