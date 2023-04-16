package kotlinx.coroutines.flow.CallbackFlowBuilder;
import jtd.b;
import msd.p;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import htd.w;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.c0;
import qrd.l1;
import kotlinx.coroutines.flow.internal.ChannelFlow;

public final class CallbackFlowBuilder extends b	// class@0019b4
{
    public final p d;

    public void CallbackFlowBuilder(p p0,CoroutineContext p1,int p2){
       super(p0, p1, p2);
       this.d = p0;
    }
    public void CallbackFlowBuilder(p p0,CoroutineContext p1,int p2,int p3,u p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x02) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x04) {
          p2 = -2;
       }
       super(p0, iNSTANCE, p2);
       return;
    }
    public Object f(w p0,c p1){
       CallbackFlowBuilder$collectTo$1 uocollectTo$;
       CallbackFlowBuilder$collectTo$1 l$1;
       if (p1 instanceof CallbackFlowBuilder$collectTo$1) {
          uocollectTo$ = p1;
          CallbackFlowBuilder$collectTo$1 label = uocollectTo$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocollectTo$.label = label - i;
          label_0018 :
             CallbackFlowBuilder$collectTo$1 result = uocollectTo$.result;
             Object obj = b.h();
             CallbackFlowBuilder$collectTo$1 label1 = uocollectTo$.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = uocollectTo$.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uocollectTo$.L$0 = this;
                uocollectTo$.L$1 = p0;
                uocollectTo$.label = 1;
                if (super.f(p0, uocollectTo$) == obj) {
                   return obj;
                }
             }
             if (l$1.m()) {
                return l1.a;
             }else {
                throw new IllegalStateException("\'awaitClose { yourCallbackOrListener.cancel\(\) }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
             }
          }
       }
       uocollectTo$ = new CallbackFlowBuilder$collectTo$1(this, p1);
       goto label_0018 ;
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new CallbackFlowBuilder(this.d, p0, p1);
    }
}
