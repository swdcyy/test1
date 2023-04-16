package com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$requestJumpUrl$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import wy.e;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.commercial.search.b;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog;
import com.kuaishou.commercial.search.qrcode.AdARScanResultModel;
import com.google.gson.JsonObject;
import wy.g;
import nl9.a;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$requestJumpUrl$2$1$a;
import java.lang.Runnable;

public final class AdARScanResultDialog$requestJumpUrl$2$1 extends Lambda implements l	// class@00156f
{
    public final String $url;
    public final e this$0;

    public void AdARScanResultDialog$requestJumpUrl$2$1(e p0,String p1){
       this.this$0 = p0;
       this.$url = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       e b;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdARScanResultDialog$requestJumpUrl$2$1.class, "1")) {
          return;
       }
       a.p(p0, "view");
       b.c(this.$url, this.this$0.b.getActivity());
       b = this.this$0.b;
       AdARScanResultDialog v = b.v;
       if (v != null) {
          v.b(g.a(b.u));
       }
       p0.postDelayed(new AdARScanResultDialog$requestJumpUrl$2$1$a(this), 1000);
       return;
    }
}
