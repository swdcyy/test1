package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.g;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.ksmvvm.command.KSCommand;
import yk4.d0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import yk4.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g extends c	// class@00086c
{
    public KSCommand x;

    public void g(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.J0(this.x.g, new d0(this));
       this.J0(this.x.i, new e0(this));
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tx = this.x;
       if (tx != null) {
          tx.a();
       }
       return;
    }
    public String getTag(){
       return "OrderListLoadingViewBinder";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.x = this.r8("LIVE_ORDER_LIST_RELOAD_PAGE_INFO");
       return;
    }
}
