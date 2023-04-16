package kotlin.jvm.internal.Lambda;
import nsd.b0;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import nsd.m0;
import kotlin.jvm.internal.a;

public abstract class Lambda implements b0, Serializable	// class@001c9d
{
    public final int arity;

    public void Lambda(int p0){
       super();
       this.arity = p0;
    }
    public int getArity(){
       return this.arity;
    }
    public String toString(){
       String str = m0.t(this);
       a.o(str, "Reflection.renderLambdaToString\(this\)");
       return str;
    }
}
