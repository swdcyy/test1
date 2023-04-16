package com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import am4.c;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView$b;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import lnc.a1;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import zl4.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import vl4.j;
import androidx.fragment.app.Fragment;
import java.util.Map;
import al4.f;
import com.kwai.library.widget.popup.common.c;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView$a;
import com.yxcorp.gifshow.widget.m;

public class OrderTabFunctionTabView extends ConstraintLayout implements d	// class@0008e9
{
    public ImageView B;
    public AutoFitRowsView C;
    public List D;
    public Fragment E;
    public List F;
    public f G;
    public long H;
    public String I;
    public a J;
    public a K;
    public Runnable L;
    public static final int M;

    public void OrderTabFunctionTabView(Context p0){
       super(p0, null);
    }
    public void OrderTabFunctionTabView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void OrderTabFunctionTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OrderTabFunctionTabView.class, "3")) {
       }else if(PatchProxy.applyVoid(objArray, this, OrderTabFunctionTabView.class, "16")){
          a.f(this, R.layout.arg_RES_7f0d10f2, true);
          this.doBindView(this);
       }
       this.C.a(new c(this));
       this.C.setHorizontalSpace(a1.d(R.dimen.arg_RES_7f070271));
       return;
    }
    public void L(MerchantEventModel p0){
       OrderTabFunctionTabView tG;
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderTabFunctionTabView.class, "14")) {
          return;
       }
       if (this.G != null && p0 != null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, OrderTabFunctionTabView.class, "15")) {
             tG = this.L;
             if (tG != null) {
                tG.run();
             }
          }
          tG = this.G;
          OrderTabFunctionTabView tE = this.E;
          OrderTabFunctionTabView tK = this.K;
          BaseOrderViewModel e = tK.e;
          if (tK instanceof a) {
             objArray = tK.I.a();
          }
          tG.b(tE, p0, e, objArray);
       }
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, OrderTabFunctionTabView.class, "13")) {
          return;
       }
       OrderTabFunctionTabView tJ = this.J;
       if (tJ != null && tJ.K()) {
          this.J.o();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderTabFunctionTabView.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a2f2e);
       this.C = m1.f(p0, 0x7f0a2f30);
       m1.b(p0, new OrderTabFunctionTabView$a(this), R.id.order_tab_function_more_click);
       return;
    }
    public void setBeforeButtonClickListener(Runnable p0){
       this.L = p0;
    }
    public void setEventManager(f p0){
       this.G = p0;
    }
}
