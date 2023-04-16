package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$i;
import java.lang.Runnable;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import wj3.c;
import java.lang.Object;
import java.lang.System;
import o56.a;
import java.lang.String;
import android.os.Trace;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import vl8.b;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$i implements Runnable	// class@000c12
{
    public final LiveScatterPresenterControl b;
    public final c c;

    public void LiveScatterPresenterControl$i(LiveScatterPresenterControl p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       long l = System.nanoTime();
       String str = "PresenterListCreator-init";
       if (a.d()) {
          Trace.beginSection(str);
       }
       List list = this.c.build();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             PresenterV2 presenterV2 = iterator.next();
             this.b.g.add(new PresenterV2$c(presenterV2));
             this.b.f.x(presenterV2);
          }
       }
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{str,Float.valueOf(f)};
          String str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str1, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str1);
       }
       return;
    }
}
