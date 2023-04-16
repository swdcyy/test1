package gb3.a;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Trace;
import qrd.l1;
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

public abstract class a extends LiveLitePresenterLoaderBase	// class@0029c7
{
    public final LinkedList h;

    public void a(String p0){
       a.p(p0, "name");
       super(p0);
       this.h = new LinkedList();
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "task");
       this.h.add(p1);
       return;
    }
    public final void o(Activity p0,LifecycleOwner p1,e p2,LiveLiteModelManager p3,c p4){
       l1 a;
       Object[] objArray1;
       String str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "parentLifecycle");
       a.p(p2, "presenterRegistry");
       a.p(p3, "modelManager");
       a.p(p4, "serviceManager");
       String str = this.g()+"Sync";
       long l = System.nanoTime();
       Trace.beginSection(str);
       this.m(p0, p1, p2, p3, p4);
       int i = this.h.isEmpty() ^ 1;
       while (i) {
          this.h.removeFirst().invoke();
       }
       this.k();
       a = l1.a;
       Trace.endSection();
       float f = (float)(System.nanoTime() - l) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray1 = new Object[]{str,Float.valueOf(f)};
             str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray1, 2));
             a.o(str1, "java.lang.String.format\(format, *args\)");
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray1 = new Object[]{str,Float.valueOf(f)};
          str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray1, 2));
          a.o(str1, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f), a).getSecond();
       return;
    }
}
