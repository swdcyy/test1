package com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$onCreate$initEngine$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Trace;
import kotlin.jvm.internal.a;
import or5.d;
import vb3.n;
import v51.a;
import xp5.i;
import qr5.b;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;

public final class LiveLiteEffectPresenter$onCreate$initEngine$1 extends Lambda implements a	// class@001d83
{
    public final LiveLiteEffectPresenter this$0;

    public void LiveLiteEffectPresenter$onCreate$initEngine$1(LiveLiteEffectPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveLiteEffectPresenter a;
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, this, LiveLiteEffectPresenter$onCreate$initEngine$1.class, "1")) {
          return;
       }
       String str2 = "Effect::initEffectEngine";
       long l = System.nanoTime();
       Trace.beginSection(str2);
       float f = 1000000.00f;
       LiveLiteEffectPresenter$onCreate$initEngine$1 tthis$0 = this.this$0;
       LiveLiteEffectPresenter e = tthis$0.E;
       if (e == null) {
          a.S("viewProviderService");
       }
       LiveLiteEffectPresenter y = this.this$0.y;
       if (y == null) {
          a.S("longConnectManager");
       }
       LiveLiteEffectPresenter z = this.this$0.z;
       if (z == null) {
          a.S("logPackageProvider");
       }
       a = this.this$0.A;
       if (a == null) {
          a.S("streamInfoReader");
       }
       tthis$0.d9(e, y, z, a, LiveLiteEffectPresenter.c9(this.this$0));
       l1 a1 = l1.a;
       Trace.endSection();
       float f1 = (float)(System.nanoTime() - l) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[]{str2,Float.valueOf(f1)};
             str1 = String.format(str1, Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[]{str2,Float.valueOf(f1)};
          str1 = String.format(str1, Arrays.copyOf(objArray, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f1), a1).getSecond();
       return;
    }
}
