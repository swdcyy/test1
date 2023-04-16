package kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1;
import msd.q;
import dsd.i;
import kotlin.jvm.internal.FunctionReference;
import java.lang.String;
import vsd.h;
import jtd.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.Object;
import asd.c;
import nsd.c0;

public final class SafeCollectorKt$emitFun$1 extends FunctionReference implements q, i	// class@001b2c
{

    public void SafeCollectorKt$emitFun$1(){
       super(3);
    }
    public final String getName(){
       return "emit";
    }
    public final h getOwner(){
       return m0.d(e.class);
    }
    public final String getSignature(){
       return "emit\(Ljava/lang/Object;Lkotlin/coroutines/Continuation;\)Ljava/lang/Object;";
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
    public final Object invoke(e p0,Object p1,c p2){
       c0.e(0);
       c0.e(2);
       c0.e(1);
       return p0.emit(p1, p2);
    }
}
