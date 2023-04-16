package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$c$a;
import java.lang.Runnable;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$c;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import o56.a;
import android.os.Trace;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$c$a implements Runnable	// class@000c02
{
    public final String b;
    public final PresenterV2$c c;
    public final LiveScatterPresenterControl$c d;

    public void LiveScatterPresenterControl$c$a(String p0,PresenterV2$c p1,LiveScatterPresenterControl$c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       String str = this.b+".create";
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(str);
       }
       this.c.a.f(this.d.c);
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{str,Float.valueOf(f)};
          str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str);
       }
       return;
    }
}
