package kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import kotlin.coroutines.CoroutineContext;
import dsd.c;
import java.lang.Object;
import java.util.List;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo$creationStackTrace$1;
import asd.c;
import msd.p;
import wsd.m;
import wsd.q;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.util.ArrayList;
import java.lang.StackTraceElement;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import wsd.o;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo$yieldFrames$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import qrd.l1;
import java.lang.StringBuilder;

public final class DebugCoroutineInfo	// class@0019a9
{
    public String a;
    public Thread b;
    public c c;
    public final CoroutineContext d;
    public final c e;
    public final long f;

    public void DebugCoroutineInfo(CoroutineContext p0,c p1,long p2){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.a = "CREATED";
    }
    public final DebugCoroutineInfo a(){
       DebugCoroutineInfo uDebugCorout = new DebugCoroutineInfo(this.d, this.e, this.f);
       uDebugCorout.a = this.a;
       uDebugCorout.c = this.c;
       uDebugCorout.b = this.b;
       return uDebugCorout;
    }
    public final List b(){
       DebugCoroutineInfo te = this.e;
       if (te != null) {
          return SequencesKt___SequencesKt.V2(q.e(new DebugCoroutineInfo$creationStackTrace$1(this, te, null)));
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public final CoroutineContext c(){
       return this.d;
    }
    public final c d(){
       return this.e;
    }
    public final List e(){
       return this.b();
    }
    public final String f(){
       return this.a;
    }
    public final List g(){
       DebugCoroutineInfo tc = this.c;
       if (tc == null) {
          return CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList();
       for (; tc != null; tc = tc.getCallerFrame()) {
          StackTraceElement stackTraceEl = tc.getStackTraceElement();
          if (stackTraceEl != null) {
             uArrayList.add(stackTraceEl);
          }
       }
       return uArrayList;
    }
    public final void h(String p0,c p1){
       if (a.g(this.a, p0) && (a.g(p0, "SUSPENDED") && this.c != null)) {
          return;
       }
       this.a = p0;
       Thread thread = null;
       if (!p1 instanceof c) {
          p1 = thread;
       }
       this.c = p1;
       if (a.g(p0, "RUNNING")) {
          thread = Thread.currentThread();
       }
       this.b = thread;
       return;
    }
    public final Object i(o p0,c p1,c p2){
       DebugCoroutineInfo$yieldFrames$1 oyieldFrames;
       DebugCoroutineInfo$yieldFrames$1 l$2;
       DebugCoroutineInfo$yieldFrames$1 l$1;
       if (p2 instanceof DebugCoroutineInfo$yieldFrames$1) {
          oyieldFrames = p2;
          DebugCoroutineInfo$yieldFrames$1 label = oyieldFrames.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             oyieldFrames.label = i2;
          label_0018 :
             DebugCoroutineInfo$yieldFrames$1 result = oyieldFrames.result;
             Object obj = b.h();
             DebugCoroutineInfo$yieldFrames$1 label1 = oyieldFrames.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = oyieldFrames.L$2;
                   l$1 = oyieldFrames.L$1;
                   label1 = oyieldFrames.L$0;
                   j0.n(result);
                label_0064 :
                   l$1 = l$2;
                   l$2 = l$1;
                label_0067 :
                   l$1 = l$1.getCallerFrame();
                   if (l$1 == null) {
                      return l1.a;
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                label1 = this;
             }
             if (l$1 == null) {
                return l1.a;
             }else {
                StackTraceElement stackTraceEl = l$1.getStackTraceElement();
                if (stackTraceEl != null) {
                   oyieldFrames.L$0 = label1;
                   oyieldFrames.L$1 = l$2;
                   oyieldFrames.L$2 = l$1;
                   oyieldFrames.L$3 = stackTraceEl;
                   oyieldFrames.label = 1;
                   if (l$2.b(stackTraceEl, oyieldFrames) == obj) {
                      return obj;
                   }else {
                      l$1 = l$2;
                      l$2 = l$1;
                      goto label_0064 ;
                   }
                }else {
                   goto label_0067 ;
                }
             }
          }
       }
       oyieldFrames = new DebugCoroutineInfo$yieldFrames$1(this, p2);
       goto label_0018 ;
    }
    public String toString(){
       return "DebugCoroutineInfo\(state="+this.f()+",context="+this.d+')';
    }
}
