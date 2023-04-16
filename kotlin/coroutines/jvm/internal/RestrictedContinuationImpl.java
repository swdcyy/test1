package kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;

public abstract class RestrictedContinuationImpl extends BaseContinuationImpl	// class@001873
{

    public void RestrictedContinuationImpl(c p0){
       super(p0);
       if (p0 != null) {
          IllegalArgumentException illegalArgum = (p0.getContext() == EmptyCoroutineContext.INSTANCE)? 1: null;
          if (!illegalArgum) {
             throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
          }
       }
       return;
    }
    public CoroutineContext getContext(){
       return EmptyCoroutineContext.INSTANCE;
    }
}
