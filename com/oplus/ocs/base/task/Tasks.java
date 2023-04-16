package com.oplus.ocs.base.task.Tasks;
import java.lang.Object;
import com.oplus.ocs.base.task.Task;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.util.concurrent.ExecutionException;
import java.lang.Exception;
import java.lang.Throwable;
import com.oplus.ocs.base.task.Tasks$c;
import com.oplus.ocs.base.task.TaskExecutors;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnSuccessListener;
import com.oplus.ocs.base.task.OnFailureListener;
import com.oplus.ocs.base.task.OnCanceledListener;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Tasks$b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Callable;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.task.a;
import java.lang.Runnable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import com.oplus.ocs.base.task.Tasks$a;
import java.util.List;
import java.util.Arrays;
import com.oplus.ocs.base.task.o;
import com.oplus.ocs.base.task.Continuation;
import com.oplus.ocs.base.task.p;

public class Tasks	// class@000b0c
{

    public void Tasks(){
       super();
    }
    public static Object a(Task p0){
       if (p0.isSuccessful()) {
          return p0.getResult();
       }
       if (p0.isCanceled()) {
          throw new CancellationException("Task is already canceled");
       }
       throw new ExecutionException(p0.getException());
    }
    public static void a(Task p0,Tasks$c p1){
       Executor cURRENT_THRE = TaskExecutors.CURRENT_THREAD;
       p0.addOnSuccessListener(cURRENT_THRE, p1);
       p0.addOnFailureListener(cURRENT_THRE, p1);
       p0.addOnCanceledListener(cURRENT_THRE, p1);
    }
    public static Object await(Task p0){
       d.b("Must not be called on the main application thread");
       d.a(p0, "Task must not be null");
       if (p0.isComplete()) {
          return Tasks.a(p0);
       }
       Tasks$b uob = new Tasks$b(0);
       Tasks.a(p0, uob);
       uob.a.await();
       return Tasks.a(p0);
    }
    public static Object await(Task p0,long p1,TimeUnit p2){
       d.b("Must not be called on the main application thread");
       d.a(p0, "Task must not be null");
       d.a(p2, "TimeUnit must not be null");
       if (p0.isComplete()) {
          return Tasks.a(p0);
       }
       Tasks$b uob = new Tasks$b(0);
       Tasks.a(p0, uob);
       if (uob.a.await(p1, p2)) {
          return Tasks.a(p0);
       }
       throw new TimeoutException("Timed out waiting for Task");
    }
    public static Task call(Callable p0){
       d.a(p0);
       return Tasks.call(TaskExecutors.MAIN_THREAD, p0);
    }
    public static Task call(Executor p0,Callable p1){
       d.a(p0, "Executor must not be null");
       d.a(p1, "Callback must not be null");
       TaskImpl taskImpl = new TaskImpl();
       p0.execute(new a(taskImpl, p1));
       return taskImpl;
    }
    public static Task forCanceled(){
       TaskImpl taskImpl = new TaskImpl();
       taskImpl.tryCancel();
       return taskImpl;
    }
    public static Task forException(Exception p0){
       d.a(p0);
       TaskImpl taskImpl = new TaskImpl();
       taskImpl.setException(p0);
       return taskImpl;
    }
    public static Task forResult(Object p0){
       TaskImpl taskImpl = new TaskImpl();
       taskImpl.setResult(p0);
       return taskImpl;
    }
    public static Task whenAll(Collection p0){
       if (p0.isEmpty()) {
          return Tasks.forResult(null);
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next(), "null tasks are not accepted");
       }
       TaskImpl taskImpl = new TaskImpl();
       Tasks$a uoa = new Tasks$a(p0.size(), taskImpl);
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          Tasks.a(iterator1.next(), uoa);
       }
       return taskImpl;
    }
    public static Task whenAll(Task[] p0){
       if (!p0.length) {
          return Tasks.forResult(null);
       }
       return Tasks.whenAll(Arrays.asList(p0));
    }
    public static Task whenAllComplete(Collection p0){
       return Tasks.whenAll(p0).continueWithTask(new o(p0));
    }
    public static Task whenAllComplete(Task[] p0){
       return Tasks.whenAllComplete(Arrays.asList(p0));
    }
    public static Task whenAllSuccess(Collection p0){
       return Tasks.whenAll(p0).continueWith(new p(p0));
    }
    public static Task whenAllSuccess(Task[] p0){
       return Tasks.whenAllSuccess(Arrays.asList(p0));
    }
}
