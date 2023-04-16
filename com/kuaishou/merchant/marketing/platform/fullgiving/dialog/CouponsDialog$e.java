package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$e;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class CouponsDialog$e implements View$OnClickListener	// class@001b0c
{
    public final CouponsDialog b;

    public void CouponsDialog$e(CouponsDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponsDialog$e.class, "1")) {
          return;
       }
       this.b.dismiss();
       return;
    }
}
