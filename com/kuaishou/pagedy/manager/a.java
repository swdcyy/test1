package com.kuaishou.pagedy.manager.a;
import erd.g;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import su.g;
import co4.d;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.util.Objects;
import java.lang.String;
import nv.d;
import nv.c;
import android.os.MessageQueue;
import android.os.Looper;
import po4.a;
import android.os.MessageQueue$IdleHandler;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class a implements g	// class@000a90
{
    public final DynamicPageCenter b;
    public final g c;
    public final d d;

    public void a(DynamicPageCenter p0,g p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       Objects.requireNonNull(tb);
       if (p0 == null) {
          c.b(d.a(tb.p, "PageDy net error response is null"));
       }
       if (p0 != null && p0.result == 1) {
          Looper.myQueue().addIdleHandler(new a(tb, tc, p0, td));
       }else {
          DynamicPageCenter p = tb.p;
          StringBuilder str = "PageDy net error result = ";
          p0 = (p0 != null)? Integer.valueOf(p0.result): "-";
          c.b(d.a(p, str+p0));
       }
       return;
    }
}
