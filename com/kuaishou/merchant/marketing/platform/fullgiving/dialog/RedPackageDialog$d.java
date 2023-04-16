package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$d;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.RedPackage;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$b;

public final class RedPackageDialog$d implements View$OnClickListener	// class@001b1c
{
    public final RedPackageDialog b;

    public void RedPackageDialog$d(RedPackageDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPackageDialog$d.class, "1")) {
          return;
       }
       RedPackageDialog b = this.b.B;
       if (b != null) {
          String clickUrl = b.getClickUrl();
          if (clickUrl != null) {
             RedPackageDialog c = this.b.C;
             if (c != null) {
                c.a(clickUrl);
             }
          }
       }
       return;
    }
}
