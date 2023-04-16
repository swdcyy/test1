package com.yxcorp.gifshow.photo.download.task.d0;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.io.File;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.task.f;
import qkd.b;
import ywb.e;
import java.lang.String;
import q87.c;
import ixb.a2;
import java.lang.Exception;
import ekd.k1;
import lnc.i1;

public final class d0 implements g	// class@000ef2
{
    public final n0 b;
    public final File c;
    public final Runnable d;

    public void d0(n0 p0,File p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       d0 tc = this.c;
       d0 td = this.d;
       try{
          Objects.requireNonNull(tb);
          b.g(tc, tb.j);
          td.run();
          Object[] objArray = new Object[0];
          e.C().w(n0.p, "reExportHighFrameRateVideoFromLocal task error", objArray);
       }catch(java.lang.Exception e1){
          k1.o(new a2(tb, e1));
          i1.c(e1);
       }
       i1.c(p0);
       return;
    }
}
