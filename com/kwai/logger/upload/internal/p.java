package com.kwai.logger.upload.internal.p;
import erd.g;
import java.lang.String;
import t87.c;
import java.lang.Object;
import w87.j;
import com.kwai.logger.upload.internal.s;
import com.kwai.logger.upload.internal.q;
import java.lang.Runnable;
import f97.a;

public final class p implements g	// class@000edb
{
    public final long b;
    public final String c;
    public final c d;

    public void p(long p0,String p1,String p2,c p3){
       super();
       this.b = p0;
       this.c = p2;
       this.d = p3;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       String str = p0;
       j.a().n(0, str);
       if (!s.c(str)) {
       }else {
          q oq = new q(str, tb, "REALTIME_LOG_RETRIEVE", tc, td);
          a.a(s.c(str));
       }
       return;
    }
}
