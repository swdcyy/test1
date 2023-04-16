package kotlin.jvm.internal.CallableReference;
import vsd.c;
import java.io.Serializable;
import kotlin.jvm.internal.CallableReference$NoReceiver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.Map;
import java.util.List;
import vsd.b;
import vsd.h;
import nsd.m0;
import vsd.d;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import vsd.r;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements c, Serializable	// class@001c9a
{
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public c reflected;
    public final String signature;
    public static final Object NO_RECEIVER;

    static {
       CallableReference.NO_RECEIVER = CallableReference$NoReceiver.INSTANCE;
    }
    public void CallableReference(){
       super(CallableReference.NO_RECEIVER);
    }
    public void CallableReference(Object p0){
       super(p0, null, null, null, false);
    }
    public void CallableReference(Object p0,Class p1,String p2,String p3,boolean p4){
       super();
       this.receiver = p0;
       this.owner = p1;
       this.name = p2;
       this.signature = p3;
       this.isTopLevel = p4;
    }
    public Object call(Object[] p0){
       return this.getReflected().call(p0);
    }
    public Object callBy(Map p0){
       return this.getReflected().callBy(p0);
    }
    public c compute(){
       CallableReference treflected = this.reflected;
       if (treflected == null) {
          treflected = this.computeReflected();
          this.reflected = treflected;
       }
       return treflected;
    }
    public abstract c computeReflected();
    public List getAnnotations(){
       return this.getReflected().getAnnotations();
    }
    public Object getBoundReceiver(){
       return this.receiver;
    }
    public String getName(){
       return this.name;
    }
    public h getOwner(){
       h oh;
       CallableReference towner = this.owner;
       if (towner == null) {
          oh = null;
       }else if(this.isTopLevel != null){
          oh = m0.g(towner);
       }else {
          oh = m0.d(towner);
       }
       return oh;
    }
    public List getParameters(){
       return this.getReflected().getParameters();
    }
    public c getReflected(){
       c uoc = this.compute();
       if (uoc != this) {
          return uoc;
       }
       throw new KotlinReflectionNotSupportedError();
    }
    public r getReturnType(){
       return this.getReflected().getReturnType();
    }
    public String getSignature(){
       return this.signature;
    }
    public List getTypeParameters(){
       return this.getReflected().getTypeParameters();
    }
    public KVisibility getVisibility(){
       return this.getReflected().getVisibility();
    }
    public boolean isAbstract(){
       return this.getReflected().isAbstract();
    }
    public boolean isFinal(){
       return this.getReflected().isFinal();
    }
    public boolean isOpen(){
       return this.getReflected().isOpen();
    }
    public boolean isSuspend(){
       return this.getReflected().isSuspend();
    }
}
