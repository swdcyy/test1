package awd.j;
import java.util.concurrent.ConcurrentHashMap;
import awd.j$a;
import java.util.List;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import org.greenrobot.eventbus.b;
import java.lang.annotation.Annotation;
import org.greenrobot.eventbus.ThreadMode;
import awd.i;
import java.lang.StringBuilder;
import java.lang.String;
import org.greenrobot.eventbus.EventBusException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class j	// class@00029a
{
    public List a;
    public final boolean b;
    public final boolean c;
    public static final Map d;
    public static final j$a[] e;

    static {
       j.d = new ConcurrentHashMap();
       j$a[] uoaArray = new j$a[4];
       j.e = uoaArray;
    }
    public void j(List p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(j$a p0){
       object oobject;
       String str;
       Class[] parameterTyp;
       Class uClass = 1;
       Method[] declaredMeth = p0.f.getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = declaredMeth[i];
          int modifiers = oobject.getModifiers();
          int i1 = modifiers & 0x01;
          str = ".";
          if (i1) {
             modifiers = modifiers & 0x1448;
             if (!modifiers) {
                parameterTyp = oobject.getParameterTypes();
                if (parameterTyp.length == uClass) {
                   b annotation = oobject.getAnnotation(b.class);
                   if (annotation != null) {
                      object oobject1 = parameterTyp[0];
                      if (p0.a(oobject, oobject1)) {
                         i oi = new i(oobject, oobject1, annotation.threadMode(), annotation.priority(), annotation.sticky());
                         p0.a.add(v12);
                      }
                   }
                }else if(this.b == null || !oobject.isAnnotationPresent(b.class)){
                   break ;
                }
             }else if(this.b == null || !oobject.isAnnotationPresent(b.class)){
                throw new EventBusException(oobject.getDeclaringClass().getName()+str+oobject.getName()+" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
             }
          }else {
             goto label_00a7 ;
          }
          i = i + 1;
       }
       throw new EventBusException("@Subscribe method "+oobject.getDeclaringClass().getName()+str+oobject.getName()+"must have exactly 1 parameter but has "+parameterTyp.length);
    }
    public final List b(j$a p0){
       ArrayList uArrayList = new ArrayList(p0.a);
       p0.a.clear();
       p0.b.clear();
       p0.c.clear();
       int i = 0;
       (p0.d).setLength(i);
       p0.e = null;
       p0.f = null;
       p0.g = i;
       p0.h = null;
       j$a[] e = j.e;
       _monitor_enter(e);
       while (i < 4) {
          j$a[] e1 = j.e;
          if (e1[i] == null) {
             e1[i] = p0;
             break ;
          }else {
             i = i + 1;
          }
       }
       _monitor_exit(e);
       return uArrayList;
    }
    public final j$a c(){
       j$a[] e1;
       object oobject;
       j$a[] e = j.e;
       _monitor_enter(e);
       int i = 0;
       while (true) {
          if (i < 4) {
             e1 = j.e;
             oobject = e1[i];
             if (oobject != null) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(e);
             return new j$a();
          }
       }
       e1[i] = null;
       _monitor_exit(e);
       return oobject;
    }
}
