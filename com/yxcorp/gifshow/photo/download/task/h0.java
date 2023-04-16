package com.yxcorp.gifshow.photo.download.task.h0;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.io.File;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import ywb.e;
import java.lang.String;
import q87.c;
import r16.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import ixb.w1;
import brd.t;
import ixb.b2;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import android.util.Pair;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Float;

public final class h0 implements o	// class@000efe
{
    public final n0 b;
    public final boolean c;
    public final File d;

    public void h0(n0 p0,boolean p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       h0 tb = this.b;
       h0 tc = this.c;
       h0 td = this.d;
       Objects.requireNonNull(tb);
       int i = 0;
       if (!p0.booleanValue()) {
          if (tc != null) {
             Object[] objArray = new Object[i];
             e.C().w(n0.p, "reExportHighFrameRateVideoFromLocal remux", objArray);
             p0 = y6.s(d.class, LoadPolicy.SILENT_IMMEDIATE).w(new w1(tb, td));
          }else {
             p0 = t.fromCallable(new b2(tb, td)).subscribeOn(d.c);
          }
       }else {
          Object[] objArray1 = new Object[i];
          e.C().w(n0.p, "reExportHighFrameRateVideoFromLocal promoted", objArray1);
          p0 = t.just(new Pair(tb.j, Float.valueOf(0x3f800000)));
       }
       return p0;
    }
}
