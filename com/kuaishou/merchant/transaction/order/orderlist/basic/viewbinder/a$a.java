package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a$a;
import al4.d;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.event.business.payload.BusinessEventPayloadInfo;
import msd.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import wl4.r;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Integer;
import wl4.q;
import wl4.o;
import androidx.fragment.app.Fragment;
import wl4.l;
import wl4.g;
import wl4.p;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.d;
import wl4.m;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.e;
import wl4.n;

public class a$a implements d	// class@000861
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(BusinessEventPayloadInfo p0,p p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, str)) {
          return;
       }
       a z = this.a.z;
       Objects.requireNonNull(z);
       r or = r.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, z, or, str) && p0 != null) {
          n on = PatchProxy.applyOneRefs(p0, z, or, "3");
          n on1 = null;
          if (on != PatchProxyResult.class) {
          }else if(TextUtils.isEmpty(p0.mPayloadJsonStr)){
             on = on1;
          }else {
             on = a.a.h(p0.mPayloadJsonStr, TabBusinessPayload.class);
          }
          if (on != null) {
             TabBusinessPayload mType = on.mType;
             if (PatchProxy.isSupport(or)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(mType), z, or, "4");
                if (obj != PatchProxyResult.class) {
                   on1 = obj;
                }else {
                   switch (mType){
                       case 1:
                         on1 = new n(z.a, z.b);
                         break;
                       case 2:
                         on1 = new e(z.a, z.b);
                         break;
                       case 3:
                         on1 = new m(z.a, z.b);
                         break;
                       case 4:
                         on1 = new d(z.a, z.b);
                         break;
                       case 5:
                         on1 = new p(z.a, z.b);
                         break;
                       case 6:
                         on1 = new g(z.a, z.b);
                         break;
                       case 7:
                         on1 = new l(z.a, z.b);
                         break;
                       case 8:
                         on1 = new o(z.a, z.b);
                         break;
                       default:
                   }
                }
             }else {
                goto label_0061 ;
             }
             if (on1 != null) {
                on1.onEvent(on, p1);
             }
          }
       }
    label_00b9 :
       return;
    }
}
