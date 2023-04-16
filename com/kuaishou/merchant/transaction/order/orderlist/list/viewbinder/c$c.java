package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$c;
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

public class c$c extends m	// class@0008a5
{
    public final c c;

    public void c$c(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       c$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, c.class, "3")) {
          OrderListResponse value = tc.x.j.h.getValue();
          if (value != null) {
             value = value.mSettingInfo;
             if (value != null) {
                tc.c9(value);
                tc.x.f.b(value.mTitle);
             }
          }
       }
       return;
    }
}
