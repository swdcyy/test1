package com.yxcorp.gifshow.page.cost.list.c;
import erd.g;
import com.yxcorp.gifshow.page.cost.list.g;
import java.lang.Object;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$Event;
import java.util.Set;
import com.yxcorp.gifshow.page.cost.list.g$b;
import java.lang.Enum;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$FlagNode;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver;
import java.lang.String;
import java.lang.StringBuilder;
import dd5.m;
import java.lang.Long;
import com.kwai.soc.arch.rubas.base.Rubas;
import tvb.d;
import java.lang.Runnable;
import android.os.Handler;

public final class c implements g	// class@000e29
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.e.add(p0);
       int i = g$b.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                tb.c.a(ListPageFirstRenderObserver$FlagNode.DATA_INITED);
             }
          }else {
             tb.b("reqNetToDataParsed");
             tb.f = g.a();
             Rubas.d("dataToListRender_begin_"+tb.b.i(), Long.valueOf(tb.f));
          }
       }else {
          tb.l.post(new d(tb, g.a()));
       }
       return;
    }
}
