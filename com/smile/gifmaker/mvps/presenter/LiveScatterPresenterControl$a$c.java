package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a$c;
import java.lang.Runnable;
import wj3.a$a;
import java.lang.Object;
import java.lang.System;
import o56.a;
import java.lang.String;
import android.os.Trace;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$a$c implements Runnable	// class@000bff
{
    public final a$a b;

    public void LiveScatterPresenterControl$a$c(a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       long l = System.nanoTime();
       String str = "bindFinishAction";
       if (a.d()) {
          Trace.beginSection(str);
       }
       this.b.a();
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
