package com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil$logPublisher$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import yf0.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.Result;
import io.reactivex.subjects.ReplaySubject;
import ke0.a;
import ke0.b$a;
import ke0.b;
import qrd.l1;
import qrd.j0;
import nsd.u;
import ke0.b$c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;

public final class TaskCenterLogUtil	// class@00075e
{
    public static final p a;
    public static final TaskCenterLogUtil b;

    static {
       TaskCenterLogUtil.b = new TaskCenterLogUtil();
       TaskCenterLogUtil.a = s.c(TaskCenterLogUtil$logPublisher$2.INSTANCE);
    }
    public void TaskCenterLogUtil(){
       super();
    }
    public static void a(TaskCenterLogUtil p0,String p1,String p2,Throwable p3,boolean p4,int p5,Object p6){
       String str = null;
       if (p5 & 0x02) {
          p2 = str;
       }
       if (p5 & 0x04) {
          p3 = str;
       }
       if (p5 & 0x08) {
          p4 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(TaskCenterLogUtil.class) || !PatchProxy.applyVoidFourRefs(p1, p2, p3, Boolean.valueOf(p4), p0, TaskCenterLogUtil.class, "4")) {
          a.p(p1, "tag");
          a.c.e("TaskCenter", p1+" : "+p2, p3);
          if (!p0.c()) {
             if (p4) {
                TaskCenterLogUtil.b.b().onNext(new a(p1, p2, b$a.b, p3));
             }
             Result.constructor-impl(l1.a);
          }
       }
       return;
    }
    public static void d(TaskCenterLogUtil p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(TaskCenterLogUtil.class) || !PatchProxy.applyVoidThreeRefs(p1, p2, Boolean.valueOf(p3), p0, TaskCenterLogUtil.class, "2")) {
          a.p(p1, "tag");
          Object[] objArray = new Object[0];
          a.c.s("TaskCenter", p1+" : "+p2, objArray);
          if (!p0.c()) {
             if (p3) {
                a uoa = new a(p1, p2, null, null, 12, null);
                TaskCenterLogUtil.b.b().onNext(p3);
             }
             Result.constructor-impl(l1.a);
          }
       }
       return;
    }
    public static void e(TaskCenterLogUtil p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(TaskCenterLogUtil.class) || !PatchProxy.applyVoidThreeRefs(p1, p2, Boolean.valueOf(p3), p0, TaskCenterLogUtil.class, "3")) {
          a.p(p1, "tag");
          Object[] objArray = new Object[0];
          a.c.A("TaskCenter", p1+" : "+p2, objArray);
          if (!p0.c()) {
             if (p3) {
                a uoa = new a(p1, p2, b$c.b, null, 8, null);
                TaskCenterLogUtil.b.b().onNext(p3);
             }
             Result.constructor-impl(l1.a);
          }
       }
       return;
    }
    public final ReplaySubject b(){
       Object obj = PatchProxy.apply(null, this, TaskCenterLogUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TaskCenterLogUtil.a.getValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, TaskCenterLogUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TaskCenterDTHelper.d.e() ^ 0x01);
    }
}
