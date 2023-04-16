package en8.c;
import en8.a;
import en8.c$b;
import nsd.u;
import en8.c$a;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import com.stage.LiveStageLoader$initTaskDispatch$1;
import msd.a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import xj3.a;
import msd.l;
import xj3.d;
import com.stage.LiveLoadingStage;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.util.Map;
import o56.a;
import java.lang.IllegalStateException;
import en8.c$c;
import java.lang.Iterable;
import java.util.Iterator;

public final class c implements a	// class@00221b
{
    public a a;
    public final HashMap b;
    public LiveLoadingStage c;
    public final long d;
    public final double e;
    public static final c f;
    public static final c$b g;

    static {
       c.g = new c$b(null);
       c.f = c$a.b;
    }
    public void c(long p0,double p1){
       super();
       this.d = p0;
       this.e = p1;
       this.b = new HashMap();
       LiveMainThreadTaskDispatcher liveMainThre = new LiveMainThreadTaskDispatcher(p0, p1, new LiveStageLoader$initTaskDispatch$1(this));
       this.a = v0;
       v0.start();
    }
    public void a(LiveMainThreadTaskDispatcher$c p0){
       a.p(p0, "strategy");
       b.Z(c.f, "setScatterStrategy\(\): "+p0);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.a(p0);
       return;
    }
    public void b(l p0){
       a.p(p0, "condition");
       b.Z(c.f, "removeTasks\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.b(p0);
       return;
    }
    public void c(long p0){
       b.Z(c.f, "setLoopDuration\(\): "+p0);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.c(p0);
       return;
    }
    public void d(l p0){
       a.p(p0, "logger");
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.d(p0);
       return;
    }
    public void e(d p0){
       a.p(p0, "task");
       b.Z(c.f, "putTaskFront\(\): "+p0+' '+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.e(p0);
       return;
    }
    public void f(d p0){
       a.p(p0, "task");
       b.Z(c.f, "addTaskToCurrentStage\(\): "+p0+' '+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.h(p0);
       return;
    }
    public void flush(){
       b.Z(c.f, "flush\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.m();
       return;
    }
    public void g(l p0){
       a.p(p0, "condition");
       b.Z(c.f, "flushUntil\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.g(p0);
       return;
    }
    public void h(LiveLoadingStage p0,a p1,a p2){
       a.p(p0, "stage");
       a.p(p1, "tasksProvider");
       c f = c.f;
       b.Z(f, "startLoad\(\): "+p0+' '+this.c);
       c tc = this.c;
       if (tc != null) {
          tc = (p0.ordinal() >= tc.ordinal())? 1: null;
          if (!tc) {
             throw new IllegalArgumentException("startLoad stage must >= currentStage".toString());
          }
       }
       if (this.b.containsKey(p0)) {
          if (!a.d()) {
             b.j0(f, "ignore repeated stage: "+p0);
             return;
          }else {
             throw new IllegalStateException("不允许重复 startLoad 相同阶段: "+p0);
          }
       }else {
          c$c uoc = new c$c(p1, p2, false, 4, null);
          this.b.put(p0, v7);
          this.j(p0);
          return;
       }
    }
    public void i(l p0){
       a.p(p0, "condition");
       b.Z(c.f, "with condition flush\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.k(p0);
       return;
    }
    public final void j(LiveLoadingStage p0){
       c f = c.f;
       b.Z(f, "tryToStartLoadStage\(\): "+p0);
       a.p(p0, "$this$previousStage");
       int i = p0.ordinal() - 1;
       object oobject = (i < 0)? null: LiveLoadingStage.values()[i];
       if (oobject != null) {
          c$c uoc = this.b.get(oobject);
          if (uoc != null && uoc.c == null) {
             b.j0(f, "上一个阶段存在:"+oobject+"，且未加载完，暂不加载新阶段:"+p0);
             return;
          }
       }
       c$c uoc1 = this.b.get(p0);
       if (uoc1 != null) {
          a.o(uoc1, "stageInfos[stage] ?: ret\x20\x02exists, ignore it\"\)\n    }\x00");
          b.Z(f, "really startLoad stage: "+p0+", "+this.c+" -> "+p0);
          this.c = p0;
          Iterator iterator = uoc1.a.invoke().iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             c ta = this.a;
             if (ta == null) {
                a.S("taskDispatcher");
             }
             ta.h(uod);
          }
          return;
       }else {
          b.Z(f, p0+" not exists, ignore it");
          return;
       }
    }
    public void l(){
       b.Z(c.f, "quit\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.l();
       return;
    }
    public void pause(){
       b.Z(c.f, "pause\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.pause();
       return;
    }
    public void resume(){
       b.Z(c.f, "resume\(\): "+this.c);
       c ta = this.a;
       if (ta == null) {
          a.S("taskDispatcher");
       }
       ta.start();
       return;
    }
}
