package com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager;
import com.kuaishou.android.post.session.previewtasks.GraphTask$a;
import java.lang.Object;
import com.kuaishou.android.post.session.previewtasks.a;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$ManagerState;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.kuaishou.android.post.session.previewtasks.GraphTask$RunningState;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.android.post.session.previewtasks.a$a;
import java.util.Collection;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import java.lang.System;
import ekd.k1;
import java.lang.Boolean;
import java.util.HashSet;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$a;
import java.util.ArrayList;
import mq.c;

public class GraphTaskExecuteManager implements GraphTask$a	// class@000ebb
{
    public final a a;
    public GraphTaskExecuteManager$ManagerState b;
    public final Set c;
    public Map d;

    public void GraphTaskExecuteManager(){
       super();
       this.a = new a();
       this.b = GraphTaskExecuteManager$ManagerState.IDLE;
       this.c = Collections.newSetFromMap(new ConcurrentHashMap());
    }
    public static Object i(String p0,Map p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, GraphTaskExecuteManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.get(p0) == null) {
          obj = new Object[0];
          a.D().A("GraphTaskExecuteManager", "getTaskResult task not exist taskKey:"+p0, obj);
          return null;
       }else {
          GraphTask graphTask = p1.get(p0);
          if (graphTask.h() != GraphTask$RunningState.SUCCESS) {
             return null;
          }
          return graphTask.g();
       }
    }
    public void a(List p0){
       RuntimeException runtimeExcep;
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTaskExecuteManager.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "addGraphTaskList", objArray);
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          GraphTask graphTask = iterator.next();
          this.a.h(graphTask);
          hashMap.put(graphTask.key(), graphTask);
       }
       Iterator iterator1 = p0.iterator();
       while (true) {
          if (iterator1.hasNext()) {
             GraphTask graphTask1 = iterator1.next();
             boolean b = this.a.g(graphTask1, this.g(graphTask1, hashMap));
             Object[] objArray1 = new Object[0];
             a.D().w("GraphTaskExecuteManager", "addGraphTaskList add "+graphTask1.key()+" task "+b, objArray1);
             if (b) {
                continue ;
             }else {
                runtimeExcep = new RuntimeException("addGraphTaskList predecessorsLink failed maybe graph task dependent task not exist");
                i1.c(runtimeExcep);
                throw runtimeExcep;
             }
          }else if(!this.a.e()){
             return;
          }else {
             break ;
          }
       }
       runtimeExcep = new RuntimeException("addGraphTaskList error this graph has cycle");
       i1.c(runtimeExcep);
       throw runtimeExcep;
    }
    public void b(GraphTaskExecuteManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTaskExecuteManager.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "addTaskGraphListener", objArray);
       this.c.add(p0);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "clearAllTaskListener", objArray);
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().p(null);
       }
       return;
    }
    public void d(){
       GraphTask graphTask;
       GraphTask graphTask2;
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("GraphTaskExecuteManager", "executeCanRunTasks mManagerState:"+this.b, objArray);
       if (this.b != GraphTaskExecuteManager$ManagerState.TASKS_RUNNING) {
          Object[] objArray1 = new Object[i];
          a.D().w("GraphTaskExecuteManager", "executeCanRunTasks mExecuteState not TASKS_RUNNING stop execute", objArray1);
          return;
       }else {
          Map map = this.f(this.a.c());
          Object[] objArray2 = new Object[i];
          a.D().w("GraphTaskExecuteManager", "executeCanRunTasks: allTaskMap cost="+k1.t(System.currentTimeMillis()), objArray2);
          HashMap hashMap = new HashMap();
          Iterator iterator = map.keySet().iterator();
          String str = 1;
          while (true) {
             boolean b = true;
             while (true) {
                if (iterator.hasNext()) {
                   graphTask = map.get(iterator.next());
                   boolean b1 = (graphTask.h() == GraphTask$RunningState.SUCCESS)? true: false;
                   hashMap.put(graphTask, Boolean.valueOf(b1));
                   if (b && b1) {
                      continue ;
                   }else {
                      b = false;
                   }
                }else {
                   Object[] objArray3 = new Object[i];
                   a.D().w("GraphTaskExecuteManager", "executeCanRunTasks allTaskSuccess:"+b, objArray3);
                   if (b) {
                      break ;
                   }else {
                      HashSet hashSet = new HashSet();
                      Iterator iterator1 = map.values().iterator();
                      while (iterator1.hasNext()) {
                         graphTask = iterator1.next();
                         objArray3 = (graphTask.h() == GraphTask$RunningState.IDLE)? 1: 0;
                         Iterator iterator2 = this.g(graphTask, map).iterator();
                         Boolean uBoolean = 1;
                         while (iterator2.hasNext()) {
                            GraphTask graphTask1 = iterator2.next();
                            uBoolean = (uBoolean && hashMap.get(graphTask1).booleanValue())? 1: null;
                            Object[] objArray4 = new Object[i];
                            a.D().w("GraphTaskExecuteManager", "executeCanRunTasks dependOnTask:"+graphTask1.key(), objArray4);
                         }
                         GraphTask$RunningState runningState = (objArray3 && uBoolean != null)? 1: null;
                         if (runningState) {
                            graphTask.f(map);
                            hashSet.add(graphTask);
                         }else {
                            continue ;
                         }
                      }
                      Iterator iterator3 = hashSet.iterator();
                      str = " run";
                      while (iterator3.hasNext()) {
                         graphTask2 = iterator3.next();
                         graphTask2.p(new GraphTaskExecuteManager$a(this, graphTask2));
                         graphTask2.k();
                         objArray2 = new Object[i];
                         a.D().w("GraphTaskExecuteManager", "executeCanRunTasks prepareRun "+graphTask2.key()+str, objArray2);
                      }
                      iterator3 = hashSet.iterator();
                      while (iterator3.hasNext()) {
                         graphTask2 = iterator3.next();
                         graphTask2.j();
                         Object[] objArray5 = new Object[i];
                         a.D().w("GraphTaskExecuteManager", "executeCanRunTasks mayRun "+graphTask2.key()+str, objArray5);
                      }
                      return;
                   }
                }
             }
             this.p();
             return;
          }
       }
    }
    public Map e(){
       Object obj = PatchProxy.apply(null, this, GraphTaskExecuteManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
    public Map f(Map p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, GraphTaskExecuteManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 != null && !p0.isEmpty()) {
          obj.putAll(p0);
       }
       GraphTaskExecuteManager td = this.d;
       if (td != null && !td.isEmpty()) {
          obj.putAll(this.d);
       }
       return obj;
    }
    public final List g(GraphTask p0,Map p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, GraphTaskExecuteManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       String[] stringArray = p0.e();
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          GraphTask graphTask = p1.get(oobject);
          if (graphTask == null) {
             Object[] objArray = new Object[0];
             a.D().A("GraphTaskExecuteManager", "targetTask:"+p0.key()+" dependOnTaskKey:"+oobject+" not exist", objArray);
          }else {
             obj.add(graphTask);
          }
          i = i + 1;
       }
       return obj;
    }
    public Object h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GraphTaskExecuteManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GraphTaskExecuteManager.i(p0, this.a.c());
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "reUse mManagerState:"+this.b, objArray);
       this.b = GraphTaskExecuteManager$ManagerState.IDLE;
       this.a.a();
       this.c.clear();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "release mManagerState:"+this.b, objArray);
       this.b = GraphTaskExecuteManager$ManagerState.RELEASED;
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().n();
       }
       this.c.clear();
       this.a.a();
       return;
    }
    public void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTaskExecuteManager.class, "3")) {
          return;
       }
       GraphTask graphTask = this.e().get(p0);
       if (graphTask != null) {
          this.a.i(graphTask);
       }
       return;
    }
    public void m(GraphTaskExecuteManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTaskExecuteManager.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "removeTaskGraphListener", objArray);
       this.c.remove(p0);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "startRunTaskGraph mManagerState:"+this.b, objArray);
       this.b = GraphTaskExecuteManager$ManagerState.TASKS_RUNNING;
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       this.d();
       return;
    }
    public void o(GraphTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTaskExecuteManager.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "taskGraphExecuteError mManagerState:"+this.b+" errorTask:"+p0.key(), objArray);
       this.b = GraphTaskExecuteManager$ManagerState.TASKS_ERROR;
       this.c();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       this.a.a();
       return;
    }
    public void onError(){
       c.a(this);
    }
    public void onSuccess(){
       c.b(this);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTaskExecuteManager", "taskGraphExecuteSuccess mManagerState:"+this.b, objArray);
       this.b = GraphTaskExecuteManager$ManagerState.TASKS_SUCCESS;
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
}
