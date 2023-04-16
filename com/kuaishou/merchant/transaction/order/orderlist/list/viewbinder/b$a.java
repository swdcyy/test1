package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse;
import androidx.fragment.app.Fragment;
import rk0.b;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse$AnnouncementInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import al4.f;

public class b$a extends m	// class@0008a1
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "5")) {
          OrderListResponse value = tc.s.j.h.getValue();
          if (value != null && value.mAnnouncementInfo != null) {
             m e = tc.s.e;
             if (e != null) {
                e.a(tc.R8(), value.mAnnouncementInfo.mEvent, u1.k());
             }
          }
       }
       return;
    }
}
