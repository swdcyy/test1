package kotlin.jvm.internal.AdaptedFunctionReference;
import nsd.b0;
import java.io.Serializable;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import kotlin.jvm.internal.a;
import vsd.h;
import nsd.m0;
import vsd.d;

public class AdaptedFunctionReference implements b0, Serializable	// class@00188c
{
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public void AdaptedFunctionReference(int p0,Class p1,String p2,String p3,int p4){
       super(p0, CallableReference.NO_RECEIVER, p1, p2, p3, p4);
    }
    public void AdaptedFunctionReference(int p0,Object p1,Class p2,String p3,String p4,int p5){
       super();
       this.receiver = p1;
       this.owner = p2;
       this.name = p3;
       this.signature = p4;
       boolean b = ((p5 & 0x01) == 1)? true: false;
       this.isTopLevel = b;
       this.arity = p0;
       this.flags = p5 >> 1;
       return;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof AdaptedFunctionReference) {
          return false;
       }
       if (this.isTopLevel != p0.isTopLevel || (this.arity != p0.arity || (this.flags != p0.flags || (!a.g(this.receiver, p0.receiver) || (!a.g(this.owner, p0.owner) || (!(this.name).equals(p0.name) || !(this.signature).equals(p0.signature))))))) {
          b = false;
       }
       return b;
    }
    public int getArity(){
       return this.arity;
    }
    public h getOwner(){
       h oh;
       AdaptedFunctionReference towner = this.owner;
       if (towner == null) {
          oh = null;
       }else if(this.isTopLevel != null){
          oh = m0.g(towner);
       }else {
          oh = m0.d(towner);
       }
       return oh;
    }
    public int hashCode(){
       AdaptedFunctionReference treceiver = this.receiver;
       int i = 0;
       int i1 = (treceiver != null)? treceiver.hashCode(): 0;
       i1 = i1 * 31;
       AdaptedFunctionReference towner = this.owner;
       if (towner != null) {
          i = towner.hashCode();
       }
       i1 = (((((i1 + i) * 31) + (this.name).hashCode()) * 31) + (this.signature).hashCode()) * 31;
       i = (this.isTopLevel != null)? 1231: 1237;
       return (((((i1 + i) * 31) + this.arity) * 31) + this.flags);
    }
    public String toString(){
       return m0.u(this);
    }
}
