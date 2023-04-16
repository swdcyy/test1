package com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.OnCanceledListener;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnCompleteListener;
import com.oplus.ocs.base.task.OnFailureListener;
import com.oplus.ocs.base.task.OnSuccessListener;
import com.oplus.ocs.base.task.Continuation;
import java.lang.Exception;
import java.lang.Class;
import com.oplus.ocs.base.task.SuccessContinuation;

public abstract class Task	// class@000b04
{

    public void Task(){
       super();
    }
    public abstract Task addOnCanceledListener(OnCanceledListener p0);
    public abstract Task addOnCanceledListener(Executor p0,OnCanceledListener p1);
    public abstract Task addOnCompleteListener(OnCompleteListener p0);
    public abstract Task addOnCompleteListener(Executor p0,OnCompleteListener p1);
    public abstract Task addOnFailureListener(OnFailureListener p0);
    public abstract Task addOnFailureListener(Executor p0,OnFailureListener p1);
    public abstract Task addOnSuccessListener(OnSuccessListener p0);
    public abstract Task addOnSuccessListener(Executor p0,OnSuccessListener p1);
    public abstract Task continueWith(Continuation p0);
    public abstract Task continueWith(Executor p0,Continuation p1);
    public abstract Task continueWithTask(Continuation p0);
    public abstract Task continueWithTask(Executor p0,Continuation p1);
    public abstract Exception getException();
    public abstract Object getResult();
    public abstract Object getResult(Class p0);
    public abstract boolean isCanceled();
    public abstract boolean isComplete();
    public abstract boolean isSuccessful();
    public abstract Task onSuccessTask(SuccessContinuation p0);
    public abstract Task onSuccessTask(Executor p0,SuccessContinuation p1);
}
