package com.yxcorp.gifshow.prettify.v4.magic.filter.l;
import java.lang.Runnable;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import j16.b;
import t16.a;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import o1c.v;
import java.lang.Iterable;
import ok.o;
import qk.y;
import xyb.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import o1c.a;

public final class l implements Runnable	// class@0011c7
{
    public final FilterConfig b;
    public final boolean c;
    public final b d;
    public final a e;

    public void l(FilterConfig p0,boolean p1,b p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       l tb = this.b;
       l td = this.d;
       l te = this.e;
       Queue a = n.a;
       _monitor_enter(a);
       y.q(a, new v(tb));
       Object[] objArray = new Object[0];
       a.D().w("FilterDownloadHelper", "downloadFilter "+tb.getDisplayName(), objArray);
       if (this.c == null && (n.l(tb) && n.m(tb))) {
          if (td != null) {
             Object[] objArray1 = new Object[0];
             a.D().w("FilterDownloadHelper", tb.getDisplayName()+" already exist", objArray1);
             td.onComplete(tb.mFilterId);
          }
          _monitor_exit(a);
       }else {
          n.r(te, new a(tb, 0), td);
          _monitor_exit(a);
       }
       return;
    }
}
