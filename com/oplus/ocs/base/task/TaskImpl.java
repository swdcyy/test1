package com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.q;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.OnCanceledListener;
import com.oplus.ocs.base.task.TaskExecutors;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.d;
import com.oplus.ocs.base.task.b;
import com.oplus.ocs.base.task.OnCompleteListener;
import com.oplus.ocs.base.task.f;
import com.oplus.ocs.base.task.OnFailureListener;
import com.oplus.ocs.base.task.h;
import com.oplus.ocs.base.task.OnSuccessListener;
import com.oplus.ocs.base.task.j;
import java.util.concurrent.CancellationException;
import java.lang.String;
import com.oplus.ocs.base.task.Continuation;
import com.oplus.ocs.base.task.c;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Class;
import com.oplus.ocs.base.task.SuccessContinuation;
import com.oplus.ocs.base.task.m;

public class TaskImpl extends Task	// class@000b08
{
    public final Object a;
    public Object b;
    public Exception c;
    public q d;
    public boolean e;
    public boolean f;

    public void TaskImpl(){
       super();
       this.a = new Object();
       this.d = new q();
    }
    public final void a(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       d.a(this.e, "Task is not yet complete");
       _monitor_exit(ta);
    }
    public Task addOnCanceledListener(OnCanceledListener p0){
       d.a(p0, "OnCanceledListener is not null");
       return this.addOnCanceledListener(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task addOnCanceledListener(Executor p0,OnCanceledListener p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "OnCanceledListener is not null");
       this.d.a(new d(p0, p1));
       this.d();
       return this;
    }
    public Task addOnCompleteListener(OnCompleteListener p0){
       d.a(p0, "OnCompleteListener is not null");
       return this.addOnCompleteListener(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task addOnCompleteListener(Executor p0,OnCompleteListener p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "OnCompleteListener is not null");
       this.d.a(new f(p0, p1));
       this.d();
       return this;
    }
    public Task addOnFailureListener(OnFailureListener p0){
       d.a(p0, "OnFailureListener is not null");
       return this.addOnFailureListener(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task addOnFailureListener(Executor p0,OnFailureListener p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "OnFailureListener is not null");
       this.d.a(new h(p0, p1));
       this.d();
       return this;
    }
    public Task addOnSuccessListener(OnSuccessListener p0){
       d.a(p0, "OnSuccessListener is not null");
       return this.addOnSuccessListener(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task addOnSuccessListener(Executor p0,OnSuccessListener p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "OnSuccessListener is not null");
       this.d.a(new j(p0, p1));
       this.d();
       return this;
    }
    public final void b(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       boolean b = (this.e == null)? true: false;
       d.a(b, "Task is already complete");
       _monitor_exit(ta);
       return;
    }
    public final void c(){
       if (this.f == null) {
          return;
       }
       throw new CancellationException("Task is already canceled.");
    }
    public Task continueWith(Continuation p0){
       d.a(p0, "Continuation is not null");
       return this.continueWith(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task continueWith(Executor p0,Continuation p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "Continuation is not null");
       TaskImpl taskImpl = new TaskImpl();
       this.d.a(new c(p0, p1, taskImpl));
       this.d();
       return taskImpl;
    }
    public Task continueWithTask(Continuation p0){
       d.a(p0, "Continuation is not null");
       return this.continueWithTask(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task continueWithTask(Executor p0,Continuation p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "Continuation is not null");
       TaskImpl taskImpl = new TaskImpl();
       this.d.a(new c(p0, p1, taskImpl));
       this.d();
       return taskImpl;
    }
    public final void d(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       if (this.e != null) {
          this.d.a(this);
       }
       _monitor_exit(ta);
       return;
    }
    public Exception getException(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.c;
    }
    public Object getResult(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       this.a();
       this.c();
       if (this.c != null) {
          throw new RuntimeException(this.c);
       }
       _monitor_exit(ta);
       return this.b;
    }
    public Object getResult(Class p0){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       this.a();
       this.c();
       if (p0.isInstance(this.c)) {
          throw p0.cast(this.c);
       }
       if (this.c != null) {
          throw new RuntimeException(this.c);
       }
       _monitor_exit(ta);
       return this.b;
    }
    public boolean isCanceled(){
       return this.f;
    }
    public boolean isComplete(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.e;
    }
    public boolean isSuccessful(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       boolean b = (this.e != null && (this.f == null && this.c == null))? true: false;
       _monitor_exit(ta);
       return b;
    }
    public Task onSuccessTask(SuccessContinuation p0){
       d.a(p0, "SuccessContinuation is not null");
       return this.onSuccessTask(TaskExecutors.MAIN_THREAD, p0);
    }
    public Task onSuccessTask(Executor p0,SuccessContinuation p1){
       d.a(p0, "Executor is not null");
       d.a(p1, "SuccessContinuation is not null");
       TaskImpl taskImpl = new TaskImpl();
       this.d.a(new m(p0, p1, taskImpl));
       this.d();
       return taskImpl;
    }
    public void setException(Exception p0){
       d.a(p0, "Exception must not be null");
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       this.b();
       this.e = true;
       this.c = p0;
       _monitor_exit(ta);
       this.d.a(this);
    }
    public void setResult(Object p0){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       this.b();
       this.e = true;
       this.b = p0;
       _monitor_exit(ta);
       this.d.a(this);
    }
    public boolean tryCancel(){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       boolean b = true;
       if (this.e != null) {
          b = false;
       }else {
          this.e = b;
          this.f = b;
          this.d.a(this);
       }
       _monitor_exit(ta);
       return b;
    }
    public boolean trySetException(Exception p0){
       d.a(p0, "Exception must not be null");
       d.a(p0, "Exception must not be null");
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       boolean b = true;
       if (this.e != null) {
          b = false;
       }else {
          this.e = b;
          this.c = p0;
          this.d.a(this);
       }
       _monitor_exit(ta);
       return b;
    }
    public boolean trySetResult(Object p0){
       TaskImpl ta = this.a;
       _monitor_enter(ta);
       boolean b = true;
       if (this.e != null) {
          b = false;
       }else {
          this.e = b;
          this.b = p0;
          this.d.a(this);
       }
       _monitor_exit(ta);
       return b;
    }
}
