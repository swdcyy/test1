package com.kuaishou.merchant.container.rndialog.MerchantRnDialog$b;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.merchant.container.rndialog.MerchantRnDialog;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.model.LaunchModel;
import zt3.e;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public final class MerchantRnDialog$b implements DialogInterface$OnShowListener	// class@00164e
{
    public final MerchantRnDialog b;

    public void MerchantRnDialog$b(MerchantRnDialog p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRnDialog$b.class, "1")) {
          return;
       }
       MerchantRnDialog$b tb = this.b;
       MerchantRnDialog r = tb.r;
       if (r != null) {
          tb.d8(r);
       }
       tb = this.b;
       r = tb.t;
       if (r != null) {
          r.onShow(tb.getDialog());
       }
       return;
    }
}
