package com.yxcorp.gifshow.v3.editor.PostTaskManager;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import xl8.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$c;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import crd.b;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$d;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$e;
import erd.a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$f;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$g;
import erd.g;
import java.lang.Boolean;
import brd.a0;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$h;
import erd.r;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$i;
import erd.o;

public final class PostTaskManager	// class@000da2
{
    public final ObservableMap a;
    public final HashMap b;
    public List c;
    public b d;
    public PostTaskManager$a e;
    public g f;
    public boolean g;

    public void PostTaskManager(){
       super();
       this.a = a.a(new HashMap());
       this.b = new HashMap();
       this.c = new ArrayList();
       this.f = PostTaskManager$c.b;
       this.g = true;
    }
    public final void a(PostTaskManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTaskManager.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       this.c.add(p0);
       return;
    }
    public final PostTaskManager$PostTaskState b(PostTaskManager$a p0){
       PostTaskManager$PostTaskState obj = PatchProxy.applyOneRefs(p0, this, PostTaskManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "task");
       Object[] objArray = new Object[0];
       a.D().w("PostTaskManager", "addTask called taskData:"+p0, objArray);
       obj = this.e(p0);
       if (this.e(p0) != PostTaskManager$PostTaskState.IDLE) {
          return obj;
       }
       p0.f(this.c);
       PostTaskManager ta = this.a;
       a.o(ta, "mTaskMap");
       ta.put(p0.d(), p0);
       if (this.a.isEmpty()) {
          this.g();
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return PostTaskManager$PostTaskState.LOADING;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, PostTaskManager.class, "3")) {
          return;
       }
       this.a.clear();
       this.b.clear();
       if (this.g != null) {
          PostTaskManager td = this.d;
          if (td != null) {
             td.dispose();
          }
       }
       this.c.clear();
       return;
    }
    public final PostTaskManager$a d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostTaskManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "taskId");
       return this.b.get(p0);
    }
    public final PostTaskManager$PostTaskState e(PostTaskManager$a p0){
       PostTaskManager$PostTaskState lOADING;
       Object obj = PatchProxy.applyOneRefs(p0, this, PostTaskManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "task");
       if (this.a.containsKey(p0.d())) {
          lOADING = PostTaskManager$PostTaskState.LOADING;
       }else if(this.b.containsKey(p0.d())){
          lOADING = PostTaskManager$PostTaskState.SUCCESS;
       }else if(p0.g()){
          lOADING = PostTaskManager$PostTaskState.IDLE;
       }else {
          lOADING = PostTaskManager$PostTaskState.SUCCESS;
       }
       return lOADING;
    }
    public final void f(PostTaskManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTaskManager.class, "10")) {
          return;
       }
       a.p(p0, "listener");
       this.c.remove(p0);
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PostTaskManager.class, "11")) {
          return;
       }
       int i = 0;
       String str = "PostTaskManager";
       if (this.a.isEmpty()) {
          this.e = objArray;
          objArray = new Object[i];
          a.D().w(str, "run task is empty", objArray);
          return;
       }else {
          String str1 = this.a.keySet().iterator().next();
          PostTaskManager$a uoa = this.a.get(str1);
          this.e = uoa;
          if (uoa == null) {
             Object[] objArray1 = new Object[i];
             a.D().A(str, "keyNow="+str1+",task is null", objArray1);
             return;
          }else {
             this.d = t.fromCallable(new PostTaskManager$d(uoa)).subscribeOn(d.c).observeOn(d.a).doOnDispose(new PostTaskManager$e(this, str1, uoa)).subscribe(new PostTaskManager$f(this, uoa, str1), new PostTaskManager$g(this, str1, uoa));
             return;
          }
       }
    }
    public final void h(String p0,PostTaskManager$a p1,boolean p2){
       if (PatchProxy.isSupport(PostTaskManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PostTaskManager.class, "12")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       this.a.remove(p0);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          PostTaskManager$b uob = iterator.next();
          uob.e(p1, p2);
          uob.c(p1);
       }
       this.g();
       return;
    }
    public final void i(boolean p0){
       this.g = p0;
    }
    public final a0 j(){
       Object[] objArray;
       a0 obj = PatchProxy.apply(null, this, PostTaskManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (this.a.size() <= 0) {
          objArray = new Object[i];
          a.D().w("PostTaskManager", "No task.", objArray);
          obj = a0.B(new Object());
          a.o(obj, "Single.just\(Any\(\)\)");
          return obj;
       }else {
          objArray = new Object[i];
          a.D().w("PostTaskManager", "Wait for "+this.a.size()+" tasks, "+this.b.size()+" results", objArray);
          obj = this.a.observable().filter(PostTaskManager$h.b).map(PostTaskManager$i.b).first(new Object());
          a.o(obj, "mTaskMap\n      .observab¡­y\(\) }\n      .first\(Any\(\)\)");
          return obj;
       }
    }
}
