package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$b;
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
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fl4.d;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;

public class c$b extends m	// class@0008a4
{
    public final c c;

    public void c$b(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b tc = this.c;
       Objects.requireNonNull(tc);
       String str = "9";
       if (!PatchProxy.applyVoid(null, tc, c.class, str)) {
          OrderListResponse value = tc.x.j.h.getValue();
          if (value != null) {
             value = value.mAfterSaleInfo;
             tc.c9(value);
             if (value != null) {
                m f = tc.x.f;
                int i = TextUtils.x(value.mNum) ^ 1;
                ServiceEntryInfo mTitle = value.mTitle;
                Objects.requireNonNull(f);
                d uod = d.class;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), mTitle, f, uod, str)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "TOP_ICON";
                   i3 oi3 = i3.f();
                   oi3.c("red_point_status", Integer.valueOf(i));
                   oi3.d("icon_name", mTitle);
                   uElementPack.params = oi3.e();
                   u1.A(f.a(), "", 1, uElementPack, new ClientContent$ContentPackage());
                }
             }
          }
       }
       return;
    }
}
