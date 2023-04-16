package com.kuaishou.merchant.transaction.detail.skupanel.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.detail.skupanel.TransactionSkuPanelFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import li4.e;
import ii4.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$SkuPanelResult;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$a;

public class b extends m	// class@000780
{
    public final TransactionSkuPanelFragment c;

    public void b(TransactionSkuPanelFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.C.f.a(true);
       this.c.getFragmentManager().beginTransaction().u(this.c).m();
       b tc = this.c;
       if (tc.C.o != null) {
          tc.E.a(StartSkuPanelBridge$SkuPanelResult.cancelResult());
       }
       return;
    }
}
