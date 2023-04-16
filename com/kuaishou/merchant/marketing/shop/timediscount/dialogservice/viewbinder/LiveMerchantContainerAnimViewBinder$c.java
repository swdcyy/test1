package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$c;
import y94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import ca4.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.ArrayList;
import y94.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import da4.a;
import q94.b;

public final class LiveMerchantContainerAnimViewBinder$c implements a	// class@001c23
{
    public final LiveMerchantContainerAnimViewBinder a;

    public void LiveMerchantContainerAnimViewBinder$c(LiveMerchantContainerAnimViewBinder p0){
       this.a = p0;
       super();
    }
    public void onChanged(Object p0){
       int i = p0.intValue();
       LiveMerchantContainerAnimViewBinder$c uoc = LiveMerchantContainerAnimViewBinder$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoc, "1")) {
          i = this.a;
          Objects.requireNonNull(i);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, i, LiveMerchantContainerAnimViewBinder.class, "9")) {
             i = i.B;
             if (i == null) {
                a.S("mViewModel");
             }
             if (i != null && !PatchProxy.applyVoid(objArray, i, a.class, "2")) {
                a e = i.e;
                if (e >= null && e < i.b.size()) {
                   c uoc1 = i.b.get(i.e);
                   if (uoc1 != null) {
                      c obj = PatchProxy.apply(objArray, uoc1, c.class, "5");
                      boolean b = true;
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         obj = uoc1.b;
                         if (obj == b || obj == 2) {
                            obj = uoc1.d;
                            if (obj != null) {
                               a t = obj.t;
                               if (t == b) {
                                  if (obj.u <= null) {
                                  }
                               }else if(t == 2 && obj.w > null){
                               }
                            }else {
                            }
                         }else {
                         }
                      }
                   label_008d :
                      if (b) {
                         i = i.f;
                         if (i != null) {
                            i.a(uoc1);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0097 :
       return;
    }
}
