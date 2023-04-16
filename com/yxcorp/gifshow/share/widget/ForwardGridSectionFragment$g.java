package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;

public final class ForwardGridSectionFragment$g implements View$OnClickListener	// class@001ccc
{
    public final ForwardGridSectionFragment b;

    public void ForwardGridSectionFragment$g(ForwardGridSectionFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$g.class, "1")) {
          return;
       }
       ForwardGridSectionFragment$g tb = this.b;
       Dialog dialog = tb.getDialog();
       a.m(dialog);
       tb.onCancel(dialog);
       this.b.dismiss();
       return;
    }
}
