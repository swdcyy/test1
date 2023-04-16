package wk.d;
import java.lang.Object;
import java.util.HashSet;
import com.google.common.collect.o;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import java.lang.Class;
import java.lang.reflect.GenericArrayType;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class d	// class@002f72
{
    public final Set a;

    public void d(){
       super();
       this.a = o.h();
    }
    public final void a(Type[] p0){
       object oobject;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = p0[i];
          if (oobject != null && this.a.add(oobject)) {
             if (oobject instanceof TypeVariable) {
                this.e(oobject);
             }else if(oobject instanceof WildcardType){
                this.f(oobject);
             }else if(oobject instanceof ParameterizedType){
                this.d(oobject);
             }else if(oobject instanceof Class){
                this.b(oobject);
             }else if(oobject instanceof GenericArrayType){
                this.c(oobject);
             }else {
                break ;
             }
          }
          i = i + 1;
       }
       throw new AssertionError("Unknown type: "+oobject);
    }
    public void b(Class p0){
    }
    public void c(GenericArrayType p0){
    }
    public void d(ParameterizedType p0){
    }
    public void e(TypeVariable p0){
    }
    public void f(WildcardType p0){
    }
}
