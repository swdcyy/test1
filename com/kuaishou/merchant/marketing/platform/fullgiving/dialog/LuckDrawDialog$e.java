package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$e;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class LuckDrawDialog$e implements View$OnClickListener	// class@001b13
{
    public final LuckDrawDialog b;

    public void LuckDrawDialog$e(LuckDrawDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LuckDrawDialog$e.class, "1")) {
          return;
       }
       this.b.dismiss();
       return;
    }
}
