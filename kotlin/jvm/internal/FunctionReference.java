package kotlin.jvm.internal.FunctionReference;
import nsd.b0;
import vsd.i;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.c;
import nsd.m0;
import vsd.h;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public class FunctionReference extends CallableReference implements b0, i	// class@001c9b
{
    public final int arity;
    public final int flags;

    public void FunctionReference(int p0){
       super(p0, CallableReference.NO_RECEIVER, null, null, null, 0);
    }
    public void FunctionReference(int p0,Object p1){
       super(p0, p1, null, null, null, 0);
    }
    public void FunctionReference(int p0,Object p1,Class p2,String p3,String p4,int p5){
       boolean b = ((p5 & 0x01) == 1)? true: false;
       super(p1, p2, p3, p4, b);
       this.arity = p0;
       this.flags = p5 >> 1;
       return;
    }
    public c computeReflected(){
       return m0.c(this);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 instanceof FunctionReference) {
          if (!a.g(this.getOwner(), p0.getOwner()) || (!(this.getName()).equals(p0.getName()) || (!(this.getSignature()).equals(p0.getSignature()) || (this.flags != p0.flags || (this.arity != p0.arity || !a.g(this.getBoundReceiver(), p0.getBoundReceiver())))))) {
             b = false;
          }
          return b;
       }else if(p0 instanceof i){
          return p0.equals(this.compute());
       }else {
          return false;
       }
    }
    public int getArity(){
       return this.arity;
    }
    public c getReflected(){
       return this.getReflected();
    }
    public i getReflected(){
       return super.getReflected();
    }
    public int hashCode(){
       int i = (this.getOwner() == null)? 0: this.getOwner().hashCode() * 31;
       return (((i + (this.getName()).hashCode()) * 31) + (this.getSignature()).hashCode());
    }
    public boolean isExternal(){
       return this.getReflected().isExternal();
    }
    public boolean isInfix(){
       return this.getReflected().isInfix();
    }
    public boolean isInline(){
       return this.getReflected().isInline();
    }
    public boolean isOperator(){
       return this.getReflected().isOperator();
    }
    public boolean isSuspend(){
       return this.getReflected().isSuspend();
    }
    public String toString(){
       c uoc = this.compute();
       if (uoc != this) {
          return uoc.toString();
       }
       String str = (("<init>").equals(this.getName()))? "constructor \(Kotlin reflection is not available\)": "function "+this.getName()+" \(Kotlin reflection is not available\)";
       return str;
    }
}
