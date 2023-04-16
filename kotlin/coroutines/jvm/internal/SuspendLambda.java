package kotlin.coroutines.jvm.internal.SuspendLambda;
import nsd.b0;
import dsd.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.String;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import nsd.m0;
import java.lang.Object;
import kotlin.jvm.internal.a;

public abstract class SuspendLambda extends ContinuationImpl implements b0, i	// class@001c87
{
    public final int arity;

    public void SuspendLambda(int p0){
       super(p0, null);
    }
    public void SuspendLambda(int p0,c p1){
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
