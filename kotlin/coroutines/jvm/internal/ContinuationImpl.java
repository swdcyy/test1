package kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import kotlin.jvm.internal.a;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import dsd.b;

public abstract class ContinuationImpl extends BaseContinuationImpl	// class@001c86
{
    public final CoroutineContext _context;
    public c intercepted;

    public void ContinuationImpl(c p0){
       CoroutineContext context = (p0 != null)? p0.getContext(): null;
       super(p0, context);
       return;
    }
    public void ContinuationImpl(c p0,CoroutineContext p1){
       super(p0);
       this._context = p1;
    }
    public CoroutineContext getContext(){
       ContinuationImpl t_context = this._context;
       a.m(t_context);
       return t_context;
    }
    public final c intercepted(){
       ContinuationImpl tintercepted = this.intercepted;
       if (tintercepted != null) {
       }else {
          d uod = this.getContext().get(d.b0);
          if (uod != null) {
             tintercepted = uod.I(this);
             if (tintercepted != null) {
             label_001b :
                this.intercepted = tintercepted;
             }
          }
          tintercepted = this;
          goto label_001b ;
       }
       return tintercepted;
    }
    public void releaseIntercepted(){
       ContinuationImpl tintercepted = this.intercepted;
       if (tintercepted != null && tintercepted != this) {
          CoroutineContext$a uoa = this.getContext().get(d.b0);
          a.m(uoa);
          uoa.U(tintercepted);
       }
       this.intercepted = b.b;
       return;
    }
}
