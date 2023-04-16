package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c;
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
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ServiceEntryInfo;
import fl4.d;

public class c$a extends m	// class@0008a3
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, c.class, "8")) {
          OrderListResponse value = tc.x.j.h.getValue();
          if (value != null) {
             value = value.mCSInfo;
             if (value != null) {
                tc.x.f.b(value.mTitle);
                tc.c9(value);
             }
          }
       }
       return;
    }
}
