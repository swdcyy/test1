package bolts.Task;
import java.util.concurrent.ExecutorService;
import y3.b;
import y3.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import y3.c;
import y3.g;
import bolts.Task$j;
import java.lang.Runnable;
import bolts.ExecutorException;
import java.lang.Exception;
import bolts.a;
import bolts.Task$f;
import bolts.Task$e;
import bolts.Task$p;
import java.util.concurrent.ScheduledExecutorService;
import bolts.Task$g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import bolts.Task$h;
import y3.e;
import y3.d;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.List;
import bolts.Task$q;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import bolts.Task$n;
import bolts.Task$m;
import bolts.Task$l;
import bolts.Task$k;
import y3.f;
import bolts.Task$o;
import bolts.Task$a;
import bolts.Task$b;
import bolts.b;
import bolts.Task$i;
import bolts.Task$c;
import bolts.Task$d;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class Task	// class@000b6a
{
    public boolean cancelled;
    public boolean complete;
    public List continuations;
    public Exception error;
    public boolean errorHasBeenObserved;
    public final Object lock;
    public Object result;
    public b unobservedErrorNotifier;
    public static final ExecutorService BACKGROUND_EXECUTOR;
    public static final Executor IMMEDIATE_EXECUTOR;
    public static Task TASK_CANCELLED;
    public static Task TASK_FALSE;
    public static Task TASK_NULL;
    public static Task TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    public static Task$q unobservedExceptionHandler;

    static {
       Task.BACKGROUND_EXECUTOR = b.a();
       Task.IMMEDIATE_EXECUTOR = b.d.c;
       Task.UI_THREAD_EXECUTOR = a.b.a;
       Task.TASK_NULL = new Task(null);
       Task.TASK_TRUE = new Task(Boolean.TRUE);
       Task.TASK_FALSE = new Task(Boolean.FALSE);
       Task.TASK_CANCELLED = new Task(true);
    }
    public void Task(){
       super();
       this.lock = new Object();
       this.continuations = new ArrayList();
    }
    public void Task(Object p0){
       super();
       this.lock = new Object();
       this.continuations = new ArrayList();
       this.trySetResult(p0);
    }
    public void Task(boolean p0){
       super();
       this.lock = new Object();
       this.continuations = new ArrayList();
       if (p0) {
          this.trySetCancelled();
       }else {
          this.trySetResult(null);
       }
       return;
    }
    public static Task call(Callable p0){
       return Task.call(p0, Task.IMMEDIATE_EXECUTOR, null);
    }
    public static Task call(Callable p0,Executor p1){
       return Task.call(p0, p1, null);
    }
    public static Task call(Callable p0,Executor p1,c p2){
       g og;
       try{
          og = new g();
          p1.execute(new Task$j(p2, og, p0));
       }catch(java.lang.Exception e2){
          og.c(new ExecutorException(e2));
       }
       return og.a();
    }
    public static Task call(Callable p0,c p1){
       return Task.call(p0, Task.IMMEDIATE_EXECUTOR, p1);
    }
    public static Task callInBackground(Callable p0){
       return Task.call(p0, Task.BACKGROUND_EXECUTOR, null);
    }
    public static Task callInBackground(Callable p0,c p1){
       return Task.call(p0, Task.BACKGROUND_EXECUTOR, p1);
    }
    public static Task cancelled(){
       return Task.TASK_CANCELLED;
    }
    public static void completeAfterTask(g p0,a p1,Task p2,Executor p3,c p4){
       try{
          p3.execute(new Task$f(p4, p0, p1, p2));
       }catch(java.lang.Exception e2){
          p0.c(new ExecutorException(e2));
       }
       return;
    }
    public static void completeImmediately(g p0,a p1,Task p2,Executor p3,c p4){
       try{
          p3.execute(new Task$e(p4, p0, p1, p2));
       }catch(java.lang.Exception e2){
          p0.c(new ExecutorException(e2));
       }
       return;
    }
    public static Task$p create(){
       return new Task$p(new Task());
    }
    public static Task delay(long p0){
       return Task.delay(p0, b.b(), null);
    }
    public static Task delay(long p0,ScheduledExecutorService p1,c p2){
       if (p2 != null && p2.a()) {
          return Task.cancelled();
       }
       if (p0 - null <= 0) {
          return Task.forResult(null);
       }
       g og = new g();
       ScheduledFuture scheduledFut = p1.schedule(new Task$g(og), p0, TimeUnit.MILLISECONDS);
       if (p2 != null) {
          c a = p2.a;
          e b = a.b;
          _monitor_enter(b);
          a.c();
          d uod = new d(a, new Task$h(scheduledFut, og));
          if (a.f != null) {
             d b1 = uod.b;
             _monitor_enter(b1);
             if (uod.e == null) {
                uod.d.run();
                uod.close();
                _monitor_exit(b1);
             }else {
                throw new IllegalStateException("Object already closed");
             }
          }else {
             a.c.add(uod);
          }
          _monitor_exit(b);
       }
       return og.a();
    }
    public static Task delay(long p0,c p1){
       return Task.delay(p0, b.b(), p1);
    }
    public static Task forError(Exception p0){
       g og = new g();
       og.c(p0);
       return og.a();
    }
    public static Task forResult(Object p0){
       if (p0 == null) {
          return Task.TASK_NULL;
       }
       if (p0 instanceof Boolean) {
          p0 = (p0.booleanValue())? Task.TASK_TRUE: Task.TASK_FALSE;
          return p0;
       }else {
          g og = new g();
          og.d(p0);
          return og.a();
       }
    }
    public static Task$q getUnobservedExceptionHandler(){
       return Task.unobservedExceptionHandler;
    }
    public static void setUnobservedExceptionHandler(Task$q p0){
       Task.unobservedExceptionHandler = p0;
    }
    public static Task whenAll(Collection p0){
       if (!p0.size()) {
          return Task.forResult(null);
       }
       g og = new g();
       ArrayList uArrayList = new ArrayList();
       Object obj = new Object();
       AtomicInteger uAtomicInteg = new AtomicInteger(p0.size());
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Task$n on = new Task$n(obj, uArrayList, uAtomicBoole, uAtomicInteg, og);
          iterator.next().continueWith(v12);
       }
       return og.a();
    }
    public static Task whenAllResult(Collection p0){
       return Task.whenAll(p0).onSuccess(new Task$m(p0));
    }
    public static Task whenAny(Collection p0){
       if (!p0.size()) {
          return Task.forResult(null);
       }
       g og = new g();
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().continueWith(new Task$l(uAtomicBoole, og));
       }
       return og.a();
    }
    public static Task whenAnyResult(Collection p0){
       if (!p0.size()) {
          return Task.forResult(null);
       }
       g og = new g();
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().continueWith(new Task$k(uAtomicBoole, og));
       }
       return og.a();
    }
    public Task cast(){
       return this;
    }
    public Task continueWhile(Callable p0,a p1){
       return this.continueWhile(p0, p1, Task.IMMEDIATE_EXECUTOR, null);
    }
    public Task continueWhile(Callable p0,a p1,Executor p2){
       return this.continueWhile(p0, p1, p2, null);
    }
    public Task continueWhile(Callable p0,a p1,Executor p2,c p3){
       f uof = new f();
       Task$o oo = new Task$o(this, p3, p0, p1, p2, uof);
       uof.b(v8);
       return this.makeVoid().continueWithTask(uof.a(), p2);
    }
    public Task continueWhile(Callable p0,a p1,c p2){
       return this.continueWhile(p0, p1, Task.IMMEDIATE_EXECUTOR, p2);
    }
    public Task continueWith(a p0){
       return this.continueWith(p0, Task.IMMEDIATE_EXECUTOR, null);
    }
    public Task continueWith(a p0,Executor p1){
       return this.continueWith(p0, p1, null);
    }
    public Task continueWith(a p0,Executor p1,c p2){
       g og = new g();
       Task tlock = this.lock;
       _monitor_enter(tlock);
       boolean b = this.isCompleted();
       if (!b) {
          Task$a uoa = new Task$a(this, og, p0, p1, p2);
          this.continuations.add(v10);
       }
       _monitor_exit(tlock);
       if (b) {
          Task.completeImmediately(og, p0, this, p1, p2);
       }
       return og.a();
    }
    public Task continueWith(a p0,c p1){
       return this.continueWith(p0, Task.IMMEDIATE_EXECUTOR, p1);
    }
    public Task continueWithTask(a p0){
       return this.continueWithTask(p0, Task.IMMEDIATE_EXECUTOR, null);
    }
    public Task continueWithTask(a p0,Executor p1){
       return this.continueWithTask(p0, p1, null);
    }
    public Task continueWithTask(a p0,Executor p1,c p2){
       g og = new g();
       Task tlock = this.lock;
       _monitor_enter(tlock);
       boolean b = this.isCompleted();
       if (!b) {
          Task$b uob = new Task$b(this, og, p0, p1, p2);
          this.continuations.add(v10);
       }
       _monitor_exit(tlock);
       if (b) {
          Task.completeAfterTask(og, p0, this, p1, p2);
       }
       return og.a();
    }
    public Task continueWithTask(a p0,c p1){
       return this.continueWithTask(p0, Task.IMMEDIATE_EXECUTOR, p1);
    }
    public Exception getError(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       Task terror = this.error;
       if (terror != null) {
          this.errorHasBeenObserved = true;
          Task tunobservedE = this.unobservedErrorNotifier;
          if (tunobservedE != null) {
             tunobservedE.a = null;
             this.unobservedErrorNotifier = null;
          }
       }
       _monitor_exit(tlock);
       return terror;
    }
    public Object getResult(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       _monitor_exit(tlock);
       return this.result;
    }
    public boolean isCancelled(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       _monitor_exit(tlock);
       return this.cancelled;
    }
    public boolean isCompleted(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       _monitor_exit(tlock);
       return this.complete;
    }
    public boolean isFaulted(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       boolean b = (this.getError() != null)? true: false;
       _monitor_exit(tlock);
       return b;
    }
    public Task makeVoid(){
       return this.continueWithTask(new Task$i(this));
    }
    public Task onSuccess(a p0){
       return this.onSuccess(p0, Task.IMMEDIATE_EXECUTOR, null);
    }
    public Task onSuccess(a p0,Executor p1){
       return this.onSuccess(p0, p1, null);
    }
    public Task onSuccess(a p0,Executor p1,c p2){
       return this.continueWithTask(new Task$c(this, p2, p0), p1);
    }
    public Task onSuccess(a p0,c p1){
       return this.onSuccess(p0, Task.IMMEDIATE_EXECUTOR, p1);
    }
    public Task onSuccessTask(a p0){
       return this.onSuccessTask(p0, Task.IMMEDIATE_EXECUTOR);
    }
    public Task onSuccessTask(a p0,Executor p1){
       return this.onSuccessTask(p0, p1, null);
    }
    public Task onSuccessTask(a p0,Executor p1,c p2){
       return this.continueWithTask(new Task$d(this, p2, p0), p1);
    }
    public Task onSuccessTask(a p0,c p1){
       return this.onSuccessTask(p0, Task.IMMEDIATE_EXECUTOR, p1);
    }
    public final void runContinuations(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       Iterator iterator = this.continuations.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          try{
             uoa.a(this);
          }catch(java.lang.RuntimeException e1){
             throw e1;
          }catch(java.lang.Exception e1){
             throw new RuntimeException(e1);
          }
       }
       this.continuations = null;
       _monitor_exit(tlock);
       return;
    }
    public boolean trySetCancelled(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       if (this.complete != null) {
          _monitor_exit(tlock);
          return false;
       }else {
          this.complete = true;
          this.cancelled = true;
          this.lock.notifyAll();
          this.runContinuations();
          _monitor_exit(tlock);
          return true;
       }
    }
    public boolean trySetError(Exception p0){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       if (this.complete != null) {
          _monitor_exit(tlock);
          return false;
       }else {
          this.complete = true;
          this.error = p0;
          this.errorHasBeenObserved = false;
          this.lock.notifyAll();
          this.runContinuations();
          if (this.errorHasBeenObserved == null && Task.getUnobservedExceptionHandler() != null) {
             this.unobservedErrorNotifier = new b(this);
          }
          _monitor_exit(tlock);
          return true;
       }
    }
    public boolean trySetResult(Object p0){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       if (this.complete != null) {
          _monitor_exit(tlock);
          return false;
       }else {
          this.complete = true;
          this.result = p0;
          this.lock.notifyAll();
          this.runContinuations();
          _monitor_exit(tlock);
          return true;
       }
    }
    public void waitForCompletion(){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       if (!this.isCompleted()) {
          this.lock.wait();
       }
       _monitor_exit(tlock);
       return;
    }
    public boolean waitForCompletion(long p0,TimeUnit p1){
       Task tlock = this.lock;
       _monitor_enter(tlock);
       if (!this.isCompleted()) {
          this.lock.wait(p1.toMillis(p0));
       }
       _monitor_exit(tlock);
       return this.isCompleted();
    }
}
