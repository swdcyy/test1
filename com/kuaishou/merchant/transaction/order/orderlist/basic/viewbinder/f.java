package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.f;
import rk0.b;
import androidx.fragment.app.Fragment;
import yk4.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import yk4.v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f extends b	// class@00086b
{
    public RecyclerView s;
    public BaseOrderViewModel t;
    public Runnable u;

    public void f(Fragment p0){
       super(p0);
       this.u = new w(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.J0(this.t.s, new v(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       super.J8();
       this.s.removeCallbacks(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_ORDER_CHECK_ORDER_VIEW_MODEL");
       return;
    }
}
