package com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import vl4.j;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import zl4.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONArray;
import java.util.List;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoreInfo;
import org.json.JSONObject;
import org.json.JSONException;
import am4.a;
import am4.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.b$a;
import com.kwai.library.widget.popup.common.c;

public class OrderTabFunctionTabView$a extends m	// class@0008e8
{
    public final OrderTabFunctionTabView c;

    public void OrderTabFunctionTabView$a(OrderTabFunctionTabView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a i;
       OrderTabFunctionTabView i3;
       JSONObject jSONObject;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, OrderTabFunctionTabView$a.class, "1")) {
          return;
       }
       if (obj.c.B.getVisibility()) {
          return;
       }
       OrderTabFunctionTabView$a c = obj.c;
       Objects.requireNonNull(c);
       j oj = j.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, c, OrderTabFunctionTabView.class, "11") && !q.f(c.F)) {
          OrderTabFunctionTabView e = c.E;
          if (e == null || (!e.isAdded() || (c.E.getActivity() != null && !c.E.getActivity().isFinishing()))) {
             e = c.K;
             if (e instanceof a) {
                i = e.I;
                OrderTabFunctionTabView h = c.H;
                OrderTabFunctionTabView i1 = c.I;
                Objects.requireNonNull(i);
                if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(h), i1, i, oj, "4")) {
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "OMIT_FUNCTION_AREA";
                   i3 oi3 = i3.f();
                   oi3.c("order_id", Long.valueOf(h));
                   oi3.d("order_status", i1);
                   uElementPack1.params = oi3.e();
                   u1.A(i.a(), "", 1, uElementPack1, new ClientContent$ContentPackage());
                }
                a i2 = c.K.I;
                OrderTabFunctionTabView h1 = c.H;
                i3 = c.I;
                MerchantLivePurchasePanelResponse$MoreInfo obj1 = PatchProxy.apply(objArray, c, OrderTabFunctionTabView.class, "10");
                if (obj1 != PatchProxyResult.class) {
                   objArray = obj1;
                }else if(q.f(c.F)){
                   objArray = new JSONArray();
                   int i4 = 0;
                   while (i4 < c.F.size()) {
                      obj1 = c.F.get(i4);
                      try{
                         JSONObject jSONObject1 = new JSONObject();
                         jSONObject1.put("index", i4);
                         jSONObject1.put("button_name", obj1.mTitle);
                         objArray.put(jSONObject1);
                      }catch(org.json.JSONException e0){
                         e0.printStackTrace();
                      }
                      i4 = i4 + 1;
                   }
                }
                Objects.requireNonNull(i2);
                if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(h1), i3, objArray, i2, j.class, "5")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "OMIT_FUNCTION_BUTTON";
                   try{
                      jSONObject = new JSONObject();
                      jSONObject.put("order_id", h1);
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                   try{
                      jSONObject.put("order_status", i3);
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                   if (objArray != null) {
                      try{
                         jSONObject.put("button_list", objArray);
                      }catch(org.json.JSONException e0){
                         e0.printStackTrace();
                      }
                   }
                }
             }
          label_015b :
             c.M();
             i = new a(c.E.getActivity(), c.B, new b(c), c.F);
             c.J = i;
             i.v = 0x7f081723;
             i.Z();
          }
       }
    label_017c :
       return;
    }
}
