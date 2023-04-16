package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$e;
import xj3.d;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import wj3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import java.lang.System;
import o56.a;
import android.os.Trace;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yj3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import java.util.List;
import vl8.b;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$e extends d	// class@000c07
{
    public final b f;
    public final LiveScatterPresenterControl g;

    public void LiveScatterPresenterControl$e(LiveScatterPresenterControl p0,b p1){
       a.p(p1, "presenterBuilder");
       this.g = p0;
       super(0, "PresenterCreater", p0.j, null);
       this.f = p1;
    }
    public void run(){
       long l = System.nanoTime();
       if (a.d()) {
          Trace.beginSection("PresenterCreator.init");
       }
       PresenterV2 presenterV2 = this.f.build();
       String str = c.b.a(presenterV2.getClass());
       if (!PatchProxy.applyVoidOneRefs(str, this, d.class, "3")) {
          a.p(str, "<set-?>");
          this.c = str;
       }
       str = this.a()+".init";
       long l1 = System.nanoTime();
       if (a.d()) {
          Trace.beginSection(str);
       }
       this.g.g.add(new PresenterV2$c(presenterV2));
       this.g.f.x(presenterV2);
       if (a.d()) {
          Trace.endSection();
       }
       float f = (float)(System.nanoTime() - l1) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray = new Object[]{str,Float.valueOf(f)};
          String str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str1, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str1);
       }
       if (a.d()) {
          Trace.endSection();
       }
       float f1 = (float)(System.nanoTime() - l) / 1000000.00f;
       if (a.d() && !SystemUtil.R()) {
          Object[] objArray1 = new Object[]{"PresenterCreator.init",Float.valueOf(f1)};
          String str2 = String.format("%s - %.3fms", Arrays.copyOf(objArray1, 2));
          a.o(str2, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLogTag.LIVE_PERFORMANCE, str2);
       }
       return;
    }
}
