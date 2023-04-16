package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.a;
import com.kuaishou.merchant.transaction.base.model.live.CertificatePropInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import com.kuaishou.merchant.basic.util.f;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import kg4.a;

public class a$a extends m	// class@000765
{
    public final CertificatePropInfo c;
    public final a d;

    public void a$a(a p0,CertificatePropInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       f.e(this.d.P8(), this.c.mReportUrl);
       this.d.y.m.u();
       return;
    }
}
