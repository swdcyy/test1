package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;

public final class MerchantForwardFragment$f implements View$OnClickListener	// class@001d15
{
    public final MerchantForwardFragment b;

    public void MerchantForwardFragment$f(MerchantForwardFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment$f.class, "1")) {
          return;
       }
       if (!this.b.isAdded()) {
          return;
       }
       MerchantForwardFragment$f tb = this.b;
       Dialog dialog = tb.getDialog();
       a.m(dialog);
       tb.onCancel(dialog);
       this.b.dismissAllowingStateLoss();
       return;
    }
}
