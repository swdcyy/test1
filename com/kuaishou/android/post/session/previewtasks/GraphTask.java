package com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.kuaishou.android.post.session.previewtasks.a$a;
import g56.e;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import com.kuaishou.android.post.session.previewtasks.GraphTask$RunningState;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.post.session.previewtasks.b;
import com.google.common.collect.ImmutableTable;
import java.util.List;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import cq.a;
import q87.c;
import com.kuaishou.android.post.session.previewtasks.GraphTask$a;
import com.kwai.flash.Flash$State;
import crd.b;
import java.util.Map;
import com.kwai.flash.Flash$Type;
import g56.i;
import g56.a;
import java.lang.Runnable;
import mq.b;
import ekd.k1;
import com.kwai.flash.Flash$Priority;
import java.lang.System;

public abstract class GraphTask extends e implements a$a	// class@000eb7
{
    public Object b;
    public final AtomicReference c;
    public GraphTask$RunningState d;
    public final AtomicReference e;
    public GraphTask$a f;
    public static final String[] g;

    static {
       String[] stringArray = new String[0];
       GraphTask.g = stringArray;
    }
    public void GraphTask(Object p0){
       super();
       this.c = new AtomicReference();
       this.d = GraphTask$RunningState.IDLE;
       this.e = new AtomicReference(new a());
       this.f = null;
       this.b = p0;
    }
    public static void a(GraphTask p0,boolean p1){
       p0.i(p1);
    }
    public static boolean d(GraphTask$RunningState p0,GraphTask$RunningState p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, GraphTask.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.a.get(p0, p1) != null) {
          return true;
       }
       i1.c(new RuntimeException("checkRunningState task state can not from "+p0+" to "+p1));
       return false;
    }
    private void i(boolean p0){
       if (this.d != GraphTask$RunningState.RUNNING) {
          Object[] objArray = new Object[0];
          a.D().w("GraphTask", "runEnd not running mCurrentRunningState:"+this.d, objArray);
          return;
       }else if(p0){
          this.d = GraphTask$RunningState.SUCCESS;
       }else {
          this.d = GraphTask$RunningState.ERROR;
       }
       GraphTask tf = this.f;
       if (tf != null) {
          if (p0) {
             tf.onSuccess();
          }else {
             tf.onError();
          }
       }
       return;
    }
    public Flash$State K5(){
       return Flash$State.BOOT_END;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTask.class, "9")) {
          return;
       }
       this.e.get().c(p0);
       return;
    }
    public boolean c(){
       return true;
    }
    public String[] e(){
       return GraphTask.g;
    }
    public void f(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraphTask.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "fillRequest currentState:"+this.d, objArray);
       if (this.d != GraphTask$RunningState.IDLE) {
          i1.c(new RuntimeException("fillRequest error task state error"));
          return;
       }else {
          this.l(p0);
          return;
       }
    }
    public Object g(){
       Object obj = PatchProxy.apply(null, this, GraphTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get();
    }
    public GraphTask$RunningState h(){
       return this.d;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, GraphTask.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "mayRun type:"+this.type(), objArray);
       if (!this.c()) {
          this.o(true);
          return;
       }else if(this.type() == Flash$Type.MAIN){
          this.run();
       }else if(this.type() == Flash$Type.BACKGROUND){
          a.c().d(this);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, GraphTask.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "prepareRun currentState:"+this.d, objArray);
       GraphTask$RunningState rUNNING = GraphTask$RunningState.RUNNING;
       if (!GraphTask.d(GraphTask$RunningState.IDLE, rUNNING)) {
          return;
       }
       this.d = rUNNING;
       return;
    }
    public void l(Map p0){
    }
    public synchronized void m(){
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, GraphTask.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "release currentState:"+this.d, objArray);
       this.e.get().dispose();
       this.d = GraphTask$RunningState.RELEASED;
       this.f = null;
       this.c.set(null);
       return;
    }
    public final void o(boolean p0){
       if (PatchProxy.isSupport(GraphTask.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GraphTask.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "runEnd success:"+p0, objArray);
       k1.o(new b(this, p0));
       return;
    }
    public void p(GraphTask$a p0){
       this.f = p0;
    }
    public Flash$Priority priority(){
       return Flash$Priority.HIGH;
    }
    public void run(){
       String str = " cost time:";
       if (PatchProxy.applyVoid(null, this, GraphTask.class, "5")) {
          return;
       }
       long l = System.currentTimeMillis();
       a uoa = a.D();
       String str1 = "run start "+this.key();
       Object[] objArray = new Object[0];
       try{
          uoa.w("GraphTask", str1, objArray);
          this.m();
          objArray = new Object[0];
          a.D().w("GraphTask", "realRun end "+this.key()+str+k1.t(l), objArray);
          this.o(true);
       }catch(java.lang.Exception e3){
          i1.c(e3);
          this.o(0);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("GraphTask", "run end "+this.key()+str+k1.t(l), objArray1);
       return;
    }
}
