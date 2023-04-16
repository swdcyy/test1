package kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.TypesJVMKt;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;

public final class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements l	// class@0018b6
{
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE;

    static {
       ParameterizedTypeImpl$getTypeName$1$1.INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();
    }
    public void ParameterizedTypeImpl$getTypeName$1$1(){
       super(1, TypesJVMKt.class, "typeToString", "typeToString\(Ljava/lang/reflect/Type;\)Ljava/lang/String;", 1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(Type p0){
       a.p(p0, "p1");
       return TypesJVMKt.h(p0);
    }
}
