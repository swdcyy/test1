package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a$a;
import java.lang.Runnable;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a;
import com.smile.gifshow.annotation.provider.v2.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import o56.a;
import android.os.Trace;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$a$a implements Runnable	// class@000bfd
{
    public final String b;
    public final PresenterV2$c c;
    public final LiveScatterPresenterControl$a d;
    public final a e;

    public void LiveScatterPresenterControl$a$a(String p0,PresenterV2$c p1,LiveScatterPresenterControl$a p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       PresenterV2$c a;
       String str = this.b+".bind";
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(str);
       }
       a = this.c.a;
       a.h = false;
       Object[] objArray = new Object[]{this.e};
       a.i(objArray);
       a = this.c.a;
       a.h = true;
       a.K8(a.f);
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          objArray = new Object[]{str,Float.valueOf(f)};
          str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str);
       }
       return;
    }
}
