package kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import asd.c;
import dsd.c;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.UnsupportedOperationException;
import java.lang.StackTraceElement;
import dsd.d;
import dsd.e;
import csd.b;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class BaseContinuationImpl implements c, c, Serializable	// class@001c85
{
    public final c completion;

    public void BaseContinuationImpl(c p0){
       super();
       this.completion = p0;
    }
    public c create(c p0){
       a.p(p0, "completion");
       throw new UnsupportedOperationException("create\(Continuation\) has not been overridden");
    }
    public c create(Object p0,c p1){
       a.p(p1, "completion");
       throw new UnsupportedOperationException("create\(Any?;Continuation\) has not been overridden");
    }
    public c getCallerFrame(){
       BaseContinuationImpl tcompletion = this.completion;
       if (!tcompletion instanceof c) {
          tcompletion = null;
       }
       return tcompletion;
    }
    public final c getCompletion(){
       return this.completion;
    }
    public StackTraceElement getStackTraceElement(){
       return d.e(this);
    }
    public abstract Object invokeSuspend(Object p0);
    public void releaseIntercepted(){
    }
    public final void resumeWith(Object p0){
       BaseContinuationImpl completion;
       c uoc = this;
       while (true) {
          e.b(uoc);
          completion = uoc.completion;
          a.m(completion);
          p0 = uoc.invokeSuspend(p0);
          if (p0 == b.h()) {
             return;
          }
          p0 = Result.constructor-impl(p0);
          uoc.releaseIntercepted();
          if (completion instanceof BaseContinuationImpl) {
             uoc = completion;
          }else {
             break ;
          }
       }
       completion.resumeWith(p0);
       return;
    }
    public String toString(){
       StringBuilder str = "Continuation at ";
       StackTraceElement stackTraceEl = this.getStackTraceElement();
       if (stackTraceEl != null) {
       }else {
          stackTraceEl = this.getClass().getName();
       }
       return str+stackTraceEl;
    }
}
