package com.yxcorp.gifshow.message.init.i;
import ob6.p$b;
import com.yxcorp.gifshow.message.init.s;
import java.lang.Object;
import ob6.h;
import hdb.m;
import com.yxcorp.gifshow.message.init.m;
import java.lang.Runnable;
import java.lang.String;
import com.kwai.framework.init.e;
import java.lang.Throwable;
import ob6.q;

public final class i implements p$b	// class@001d5a
{
    public final s a;

    public void i(s p0){
       this.a = p0;
    }
    public final void a(h p0){
       i ta = this.a;
       if (!ta.b.a()) {
       }else {
          e.g(new m(ta, p0), "MessageManager");
       }
       return;
    }
    public void onError(Throwable p0){
       q.a(this, p0);
    }
}
