package kshark.lite.HeapObject;
import kshark.lite.HeapObject$a;
import nsd.u;
import kshark.lite.PrimitiveType;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Enum;
import java.util.Locale;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Objects;
import kotlin.Pair;
import qrd.r0;
import java.util.Collection;
import java.lang.Iterable;
import java.util.Map;
import trd.t0;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Character;
import java.lang.Float;
import java.lang.Double;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.util.Set;
import trd.d1;
import kshark.lite.HeapObject$HeapClass;
import kshark.lite.HeapObject$b;
import kshark.lite.b;
import rtd.l$a$a;

public abstract class HeapObject	// class@001b93
{
    public static final Map a;
    public static final Set b;
    public static final HeapObject$a c;

    static {
       String name;
       String name1;
       HeapObject.c = new HeapObject$a(null);
       PrimitiveType[] primitiveTyp = PrimitiveType.values();
       ArrayList uArrayList = new ArrayList(primitiveTyp.length);
       int len = primitiveTyp.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = primitiveTyp[i1];
          String str = oobject.name();
          Locale uS = Locale.US;
          a.o(uS, "Locale.US");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          str = str.toLowerCase(uS);
          a.o(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
          StringBuilder str1 = str;
          uArrayList.add(r0.a(str1+"[]", oobject));
       }
       HeapObject.a = t0.B0(uArrayList);
       String[] stringArray = new String[]{name,name,name1,name1,name1,name1,name1,name1};
       name = Boolean.class.getName();
       a.o(name, "Boolean::class.javaObjectType.name");
       name = Character.class.getName();
       a.o(name, "Char::class.javaObjectType.name");
       name1 = Float.class.getName();
       a.o(name1, "Float::class.javaObjectType.name");
       name1 = Double.class.getName();
       a.o(name1, "Double::class.javaObjectType.name");
       name1 = Byte.class.getName();
       a.o(name1, "Byte::class.javaObjectType.name");
       name1 = Short.class.getName();
       a.o(name1, "Short::class.javaObjectType.name");
       name1 = Integer.class.getName();
       a.o(name1, "Int::class.javaObjectType.name");
       name1 = Long.class.getName();
       a.o(name1, "Long::class.javaObjectType.name");
       HeapObject.b = d1.u(stringArray);
    }
    public void HeapObject(){
       super();
    }
    public void HeapObject(u p0){
       super();
    }
    public final HeapObject$HeapClass a(){
       HeapObject$HeapClass heapClass = (this instanceof HeapObject$HeapClass)? this: null;
       return heapClass;
    }
    public final HeapObject$b b(){
       HeapObject$b uob = (this instanceof HeapObject$b)? this: null;
       return uob;
    }
    public abstract b c();
    public abstract long d();
    public abstract int e();
    public abstract int f();
    public abstract l$a$a g();
}
