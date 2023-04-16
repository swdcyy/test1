package com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.lib.BaseSpringDialogFragment;

public final class PushFragmentDialog$b implements View$OnClickListener	// class@001641
{
    public final PushFragmentDialog b;

    public void PushFragmentDialog$b(PushFragmentDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushFragmentDialog$b.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
