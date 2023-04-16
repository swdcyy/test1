package kotlin.jvm.internal.PropertyReference;
import vsd.n;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.h;
import kotlin.jvm.internal.a;
import vsd.c;
import java.lang.StringBuilder;

public abstract class PropertyReference extends CallableReference implements n	// class@0018a1
{

    public void PropertyReference(){
       super();
    }
    public void PropertyReference(Object p0){
       super(p0);
    }
    public void PropertyReference(Object p0,Class p1,String p2,String p3,int p4){
       int i = 1;
       boolean b = ((p4 & i) == i)? true: false;
       super(p0, p1, p2, p3, b);
       return;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 instanceof PropertyReference) {
          if (!this.getOwner().equals(p0.getOwner()) || (!(this.getName()).equals(p0.getName()) || (!(this.getSignature()).equals(p0.getSignature()) || !a.g(this.getBoundReceiver(), p0.getBoundReceiver())))) {
             b = false;
          }
          return b;
       }else if(p0 instanceof n){
          return p0.equals(this.compute());
       }else {
          return false;
       }
    }
    public c getReflected(){
       return this.getReflected();
    }
    public n getReflected(){
       return super.getReflected();
    }
    public int hashCode(){
       return ((((this.getOwner().hashCode() * 31) + (this.getName()).hashCode()) * 31) + (this.getSignature()).hashCode());
    }
    public boolean isConst(){
       return this.getReflected().isConst();
    }
    public boolean isLateinit(){
       return this.getReflected().isLateinit();
    }
    public String toString(){
       c uoc = this.compute();
       if (uoc != this) {
          return uoc.toString();
       }
       return "property "+this.getName()+" \(Kotlin reflection is not available\)";
    }
}
