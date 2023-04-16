package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$a;
import kc4.c$a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import kc4.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kc4.c;
import com.kuaishou.merchant.router.b;

public class w$a implements c$a	// class@000844
{
    public final w a;

    public void w$a(w p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0,String p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w$a.class, "1")) {
          return;
       }
       this.a.z = p2;
       b.k(p0, p1);
       return;
    }
}
