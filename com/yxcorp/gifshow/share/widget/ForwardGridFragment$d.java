package com.yxcorp.gifshow.share.widget.ForwardGridFragment$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment;
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

public final class ForwardGridFragment$d implements View$OnClickListener	// class@001cbc
{
    public final ForwardGridFragment b;

    public void ForwardGridFragment$d(ForwardGridFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridFragment$d.class, "1")) {
          return;
       }
       if (!this.b.isAdded()) {
          return;
       }
       ForwardGridFragment$d tb = this.b;
       Dialog dialog = tb.getDialog();
       a.m(dialog);
       tb.onCancel(dialog);
       this.b.dismissAllowingStateLoss();
       return;
    }
}
