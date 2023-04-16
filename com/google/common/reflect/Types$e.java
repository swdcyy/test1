package com.google.common.reflect.Types$e;
import java.lang.reflect.InvocationHandler;
import com.google.common.reflect.Types$d;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.UnsupportedOperationException;

public final class Types$e implements InvocationHandler	// class@001912
{
    public final Types$d b;
    public static final ImmutableMap c;

    static {
       Types$d uod = Types$d.class;
       ImmutableMap$b uob = ImmutableMap.builder();
       Method[] methods = uod.getMethods();
       int len = methods.length;
       int i = 0;
       while (i < len) {
          object oobject = methods[i];
          if (oobject.getDeclaringClass().equals(uod)) {
             boolean b = true;
             try{
                oobject.setAccessible(b);
                uob.c(oobject.getName(), oobject);
             }catch(java.security.AccessControlException e0){
             }
          }
          i = i + 1;
       }
       Types$e.c = uob.a();
    }
    public void Types$e(Types$d p0){
       super();
       this.b = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = p1.getName();
       p1 = Types$e.c.get(p0);
       if (p1 != null) {
          return p1.invoke(this.b, p2);
       }
       throw new UnsupportedOperationException(p0);
    }
}
