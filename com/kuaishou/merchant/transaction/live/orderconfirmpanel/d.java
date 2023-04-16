package com.kuaishou.merchant.transaction.live.orderconfirmpanel.d;
import erd.o;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.CharSequence;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import yj4.c;

public class d implements o	// class@0007ea
{
    public int b;
    public RefreshLayout c;

    public void d(RefreshLayout p0){
       super();
       this.b = -1;
       this.c = p0;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       d tc = this.c;
       if (tc != null && tc.getStateView() instanceof KwaiLoadingView) {
          KwaiLoadingView stateView = this.c.getStateView();
          if (stateView != null) {
             stateView.setLoadingText(p0);
          }
       }
       return;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new c(this));
       }
       return ot;
    }
}
