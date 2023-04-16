package com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker;
import gh5.c;
import com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker$rationRandom$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker$commitRatio$2;
import gh5.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import qrd.l1;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;
import com.yxcorp.gifshow.log.timemachine.EventTriggerType;
import org.json.JSONObject;
import com.yxcorp.utility.Log;
import java.util.Collection;
import gh5.e;
import java.lang.Runnable;
import t45.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import gh5.f;

public final class SlideVsyncScatterTracker implements c	// class@000b8f
{
    public final HashMap a;
    public final List b;
    public final List c;
    public final p d;
    public final p e;
    public final long f;
    public static final SlideVsyncScatterTracker$a g;

    static {
       SlideVsyncScatterTracker.g = new SlideVsyncScatterTracker$a(null);
    }
    public void SlideVsyncScatterTracker(long p0){
       List a;
       super();
       this.f = p0;
       this.a = new HashMap();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = s.c(SlideVsyncScatterTracker$rationRandom$2.INSTANCE);
       this.e = s.c(SlideVsyncScatterTracker$commitRatio$2.INSTANCE);
       b b = b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(this, b, b.class, "1")) {
       }else {
          a.p(this, "tracker");
          a = b.a;
          _monitor_enter(a);
          if (!a.contains(this)) {
             a.add(this);
          }
          _monitor_exit(a);
       }
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVsyncScatterTracker.class, "10")) {
          return;
       }
       TMLogManager.e.e("SlidePlay", EventTriggerType.SlideDispatcher.getMessageType(), new JSONObject(p0));
       return;
    }
    public void b(){
    }
    public void c(){
       SlideVsyncScatterTracker slideVsyncSc = SlideVsyncScatterTracker.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slideVsyncSc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, slideVsyncSc, "7")) {
          Log.b("SlideVsyncScatterTracker", "commitDispatch: ");
          if (this.b.isEmpty() ^ 0x01) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(this.b);
             c.a(new e(this, uArrayList));
             this.b.clear();
          }
       }
       return;
    }
    public void onCreate(){
    }
    public void onDestroy(){
       SlideVsyncScatterTracker slideVsyncSc = SlideVsyncScatterTracker.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slideVsyncSc, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, slideVsyncSc, "8")) {
          Log.b("SlideVsyncScatterTracker", "commitSlowTask: ");
          Collection uCollection = this.a.values();
          a.o(uCollection, "slowTaskMap.values");
          List list = CollectionsKt___CollectionsKt.J5(uCollection);
          if (list.isEmpty() ^ 0x01) {
             c.a(new f(this, list));
             this.a.clear();
          }
       }
       return;
    }
}
