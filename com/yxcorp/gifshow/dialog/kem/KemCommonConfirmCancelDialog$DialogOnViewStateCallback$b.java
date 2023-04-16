package com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b;
import android.view.View$OnClickListener;
import msd.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b implements View$OnClickListener	// class@001aa2
{
    public final l b;

    public void KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemCommonConfirmCancelDialog$DialogOnViewStateCallback$b.class, "1")) {
          return;
       }
       this.b.invoke("content");
       return;
    }
}
