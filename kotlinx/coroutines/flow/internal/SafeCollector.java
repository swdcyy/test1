package kotlinx.coroutines.flow.internal.SafeCollector;
import jtd.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.CoroutineContext;
import ktd.h;
import kotlin.coroutines.EmptyCoroutineContext;
import asd.c;
import java.lang.Integer;
import kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1;
import java.lang.Object;
import msd.p;
import java.lang.Number;
import ktd.c;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import ftd.c2;
import kotlinx.coroutines.flow.internal.SafeCollectorKt;
import msd.q;
import kotlin.TypeCastException;
import java.lang.String;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__IndentKt;
import java.lang.IllegalStateException;
import csd.b;
import dsd.e;
import qrd.l1;
import java.lang.Throwable;
import kotlin.Result;

public final class SafeCollector extends ContinuationImpl implements e	// class@001b2b
{
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final e collector;
    public c completion;
    public CoroutineContext lastEmissionContext;

    public void SafeCollector(e p0,CoroutineContext p1){
       super(h.c, EmptyCoroutineContext.INSTANCE);
       this.collector = p0;
       this.collectContext = p1;
       this.collectContextSize = p1.fold(Integer.valueOf(0), SafeCollector$collectContextSize$1.INSTANCE).intValue();
    }
    public final void b(CoroutineContext p0,CoroutineContext p1,Object p2){
       if (p1 instanceof c) {
          this.e(p1, p2);
       }
       SafeCollector_commonKt.a(this, p0);
       this.lastEmissionContext = p0;
       return;
    }
    public final Object d(c p0,Object p1){
       CoroutineContext context = p0.getContext();
       c2.B(context);
       SafeCollector tlastEmissio = this.lastEmissionContext;
       if (tlastEmissio != context) {
          this.b(context, tlastEmissio, p1);
       }
       this.completion = p0;
       q a = SafeCollectorKt.a;
       SafeCollector tcollector = this.collector;
       if (tcollector != null) {
          return a.invoke(tcollector, p1, this);
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
       }
    }
    public final void e(c p0,Object p1){
       throw new IllegalStateException(StringsKt__IndentKt.p("\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "+p0.c+", but then emission attempt of value \'"+p1+"\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
    public Object emit(Object p0,c p1){
       p0 = this.d(p1, p0);
       if (p0 == b.h()) {
          e.c(p1);
       }
       if (p0 == b.h()) {
          return p0;
       }else {
          return l1.a;
       }
    }
    public CoroutineContext getContext(){
       CoroutineContext context;
       SafeCollector tcompletion = this.completion;
       if (tcompletion != null) {
          context = tcompletion.getContext();
          if (context != null) {
          label_000d :
             return context;
          }
       }
       context = EmptyCoroutineContext.INSTANCE;
       goto label_000d ;
    }
    public Object invokeSuspend(Object p0){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          this.lastEmissionContext = new c(throwable);
       }
       SafeCollector tcompletion = this.completion;
       if (tcompletion != null) {
          tcompletion.resumeWith(p0);
       }
       return b.h();
    }
    public void releaseIntercepted(){
       super.releaseIntercepted();
    }
}
