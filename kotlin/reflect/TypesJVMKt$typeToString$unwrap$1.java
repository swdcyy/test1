package kotlin.reflect.TypesJVMKt$typeToString$unwrap$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements l	// class@0018b8
{
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE;

    static {
       TypesJVMKt$typeToString$unwrap$1.INSTANCE = new TypesJVMKt$typeToString$unwrap$1();
    }
    public void TypesJVMKt$typeToString$unwrap$1(){
       super(1, Class.class, "getComponentType", "getComponentType\(\)Ljava/lang/Class;", 0);
    }
    public final Class invoke(Class p0){
       a.p(p0, "p1");
       return p0.getComponentType();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
