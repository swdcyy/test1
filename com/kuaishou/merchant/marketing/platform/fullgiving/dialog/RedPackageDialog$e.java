package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$e;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class RedPackageDialog$e implements View$OnClickListener	// class@001b1d
{
    public final RedPackageDialog b;

    public void RedPackageDialog$e(RedPackageDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPackageDialog$e.class, "1")) {
          return;
       }
       this.b.dismiss();
       return;
    }
}
