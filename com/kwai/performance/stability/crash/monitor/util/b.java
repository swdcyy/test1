package com.kwai.performance.stability.crash.monitor.util.b;
import java.util.List;
import erd.g;
import java.lang.Runnable;
import java.lang.Iterable;
import brd.t;
import vg7.b;
import java.lang.Object;
import java.util.Objects;
import ap3.k;
import erd.a;
import crd.b;

public class b	// class@001212
{

    public static void a(List p0,g p1,Runnable p2,Runnable p3){
       if (p0.size() > 0) {
          Objects.requireNonNull(p2);
          t.mergeDelayError(p0, p0.size()).subscribe(p1, new b(p2), new k(p2));
       }else {
          p3.run();
       }
       return;
    }
}
