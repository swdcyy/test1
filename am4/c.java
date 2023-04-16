package am4.c;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView$b;
import com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabMoreInfo;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.ButtonTabInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import zl4.a;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import vl4.j;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.widget.ImageView;
import qt3.c;

public class c implements AutoFitRowsView$b	// class@00009c
{
    public final OrderTabFunctionTabView a;

    public void c(OrderTabFunctionTabView p0){
       this.a = p0;
       super();
    }
    public void a(){
       c ta;
       OrderTabFunctionTabView b;
       JSONObject obj;
       JSONArray jSONArray;
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.a.C.getChildCount() <= 0) {
          return;
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (i1 < this.a.C.getChildCount()) {
             if (this.a.C.getChildAt(i1).getVisibility() == 8) {
             label_0039 :
                if (i1 >= 0) {
                   ta = this.a;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.isSupport(OrderTabFunctionTabView.class) || (PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), ta, OrderTabFunctionTabView.class, "8") || (i1 < 0 || (!q.f(ta.D) && i1 < ta.D.size())))) {
                      if (ta.F == null) {
                         ta.F = new ArrayList();
                      }
                      ta.F.clear();
                      for (int i7 = i1; i7 < ta.D.size(); i7 = i7 + 1) {
                         ta.F.add(new OrderTabMoreInfo(ta.D.get(i7).mEvent, ta.D.get(i7).mContent));
                      }
                   }
                }
                ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.isSupport(OrderTabFunctionTabView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), ta, OrderTabFunctionTabView.class, "4")) {
                   OrderTabFunctionTabView k = ta.K;
                   if (k instanceof a) {
                      a i3 = k.I;
                      OrderTabFunctionTabView h = ta.H;
                      OrderTabFunctionTabView i4 = ta.I;
                      if (PatchProxy.isSupport(OrderTabFunctionTabView.class)) {
                         obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), ta, OrderTabFunctionTabView.class, "9");
                         if (obj != PatchProxyResult.class) {
                            jSONArray = obj;
                         }
                      }
                      int i5 = (i1 < 0)? ta.D.size() + i2: i1;
                      jSONArray = new JSONArray();
                      int i6 = 0;
                      while (i6 <= i5) {
                         ButtonTabInfo uButtonTabIn = ta.D.get(i6);
                         try{
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("index", i6);
                            jSONObject.put("button_name", uButtonTabIn.mContent);
                            jSONArray.put(jSONObject);
                         }catch(org.json.JSONException e7){
                            e7.printStackTrace();
                         }
                         i6 = i6 + 1;
                      }
                      Objects.requireNonNull(i3);
                      if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(h), i4, jSONArray, i3, j.class, "2")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "FUNCTION_BUTTON";
                         try{
                            obj = new JSONObject();
                            obj.put("order_id", h);
                         }catch(org.json.JSONException e6){
                            e6.printStackTrace();
                         }
                         try{
                            obj.put("order_status", i4);
                         }catch(org.json.JSONException e6){
                            e6.printStackTrace();
                         }
                         if (jSONArray != null) {
                            try{
                               obj.put("button_list", jSONArray);
                            }catch(org.json.JSONException e3){
                               e3.printStackTrace();
                            }
                         }
                      }
                   }
                }
                b = this.a.B;
                if (i1 < 0) {
                   i = 4;
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0039 ;
          }
       }
       b.setVisibility(i);
       this.a.C.invalidate();
       return;
    }
    public void b(int p0,View p1){
       c.b(this, p0, p1);
    }
}
