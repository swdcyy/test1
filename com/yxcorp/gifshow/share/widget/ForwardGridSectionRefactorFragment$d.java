package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
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

public final class ForwardGridSectionRefactorFragment$d implements View$OnClickListener	// class@001cda
{
    public final ForwardGridSectionRefactorFragment b;

    public void ForwardGridSectionRefactorFragment$d(ForwardGridSectionRefactorFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment$d.class, "1")) {
          return;
       }
       if (!this.b.isAdded()) {
          return;
       }
       ForwardGridSectionRefactorFragment$d tb = this.b;
       Dialog dialog = tb.getDialog();
       a.m(dialog);
       tb.onCancel(dialog);
       this.b.dismissAllowingStateLoss();
       return;
    }
}
