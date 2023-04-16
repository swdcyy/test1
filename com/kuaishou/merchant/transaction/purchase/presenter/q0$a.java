package com.kuaishou.merchant.transaction.purchase.presenter.q0$a;
import kc4.c$a;
import com.kuaishou.merchant.transaction.purchase.presenter.q0;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import kc4.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kc4.c;
import com.kuaishou.merchant.router.b;

public class q0$a implements c$a	// class@000999
{
    public final q0 a;

    public void q0$a(q0 p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, q0$a.class, "1")) {
          return;
       }
       this.a.z = p2;
       b.k(p0, p1);
       return;
    }
}
