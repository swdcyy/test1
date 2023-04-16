package kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import nsd.b0;
import dsd.i;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import asd.c;
import java.lang.String;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import nsd.m0;
import java.lang.Object;
import kotlin.jvm.internal.a;

public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements b0, i	// class@001874
{
    public final int arity;

    public void RestrictedSuspendLambda(int p0){
       super(p0, null);
    }
    public void RestrictedSuspendLambda(int p0,c p1){
       super(p1);
       this.arity = p0;
    }
    public int getArity(){
       return this.arity;
    }
    public String toString(){
       String str;
       if (this.getCompletion() == null) {
          str = m0.u(this);
          a.o(str, "Reflection.renderLambdaToString\(this\)");
       }else {
          str = super.toString();
       }
       return str;
    }
}
