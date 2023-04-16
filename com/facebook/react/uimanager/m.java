package com.facebook.react.uimanager.m;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import af.a;
import java.lang.reflect.Method;
import java.lang.Class;
import com.facebook.react.uimanager.m$k;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.m$g;
import java.lang.Boolean;
import com.facebook.react.uimanager.m$c;
import java.lang.Integer;
import com.facebook.react.uimanager.m$i;
import java.lang.Float;
import com.facebook.react.uimanager.m$h;
import java.lang.Double;
import com.facebook.react.uimanager.m$f;
import com.facebook.react.uimanager.m$l;
import com.facebook.react.uimanager.m$d;
import com.facebook.react.uimanager.m$e;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.m$b;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.m$j;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import af.b;
import java.util.Map;
import ze.x;
import java.util.HashMap;
import java.lang.annotation.Annotation;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;

public class m	// class@001387
{
    public static final Map a;
    public static final Map b;

    static {
       m.a = new ConcurrentHashMap();
       m.b = new ConcurrentHashMap();
    }
    public void m(){
       super();
    }
    public static m$k a(a p0,Method p1,Class p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == Dynamic.class) {
          return new m$g(p0, p1);
       }
       if (p2 == Boolean.TYPE) {
          return new m$c(p0, p1, p0.defaultBoolean());
       }
       if (p2 == Integer.TYPE) {
          return new m$i(p0, p1, p0.defaultInt());
       }
       if (p2 == Float.TYPE) {
          return new m$h(p0, p1, p0.defaultFloat());
       }
       if (p2 == Double.TYPE) {
          return new m$f(p0, p1, p0.defaultDouble());
       }
       if (p2 == String.class) {
          return new m$l(p0, p1);
       }
       if (p2 == Boolean.class) {
          return new m$d(p0, p1);
       }
       if (p2 == Integer.class) {
          return new m$e(p0, p1);
       }
       if (p2 == ReadableArray.class) {
          return new m$b(p0, p1);
       }
       if (p2 == ReadableMap.class) {
          return new m$j(p0, p1);
       }
       throw new RuntimeException("Unrecognized type: "+p2+" for method: "+p1.getDeclaringClass().getName()+"#"+p1.getName());
    }
    public static void b(b p0,Method p1,Class p2,Map p3){
       int i;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, m.class, "6")) {
          return;
       }
       String[] stringArray = p0.names();
       if (p2 == Dynamic.class) {
          for (i = 0; i < stringArray.length; i = i + 1) {
             p3.put(stringArray[i], new m$g(p0, p1, i));
          }
       }else if(p2 == Integer.TYPE){
          for (; i < stringArray.length; i = i + 1) {
             p3.put(stringArray[i], new m$i(p0, p1, i, p0.defaultInt()));
          }
       }else if(p2 == Float.TYPE){
          for (; i < stringArray.length; i = i + 1) {
             p3.put(stringArray[i], new m$h(p0, p1, i, p0.defaultFloat()));
          }
       }else if(p2 == Double.TYPE){
          for (; i < stringArray.length; i = i + 1) {
             m$f uof = new m$f(p0, p1, i, p0.defaultDouble());
             p3.put(stringArray[i], v1);
          }
       }else if(p2 == Integer.class){
          for (; i < stringArray.length; i = i + 1) {
             p3.put(stringArray[i], new m$e(p0, p1, i));
          }
       }else {
          throw new RuntimeException("Unrecognized type: "+p2+" for method: "+p1.getDeclaringClass().getName()+"#"+p1.getName());
       }
       return;
    }
    public static Map c(Class p0){
       HashMap hashMap;
       Class[] parameterTyp;
       m om = m.class;
       Object obj = null;
       Class[] obj1 = PatchProxy.applyOneRefs(p0, obj, om, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.getInterfaces();
       int len = obj1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (obj1[i] == x.class) {
                return m.b;
             }else {
                i = i + 1;
             }
          }else {
             Map map = m.a.get(p0);
             if (map != null) {
                return map;
             }
             hashMap = new HashMap(m.c(p0.getSuperclass()));
             if (!PatchProxy.applyVoidTwoRefs(p0, hashMap, obj, om, "8")) {
                Method[] declaredMeth = p0.getDeclaredMethods();
                int len1 = declaredMeth.length;
                len = 0;
                while (len < len1) {
                   object oobject = declaredMeth[len];
                   a annotation = oobject.getAnnotation(a.class);
                   String str = "#";
                   if (annotation != null) {
                      parameterTyp = oobject.getParameterTypes();
                      if (parameterTyp.length == 1) {
                         hashMap.put(annotation.name(), m.a(annotation, oobject, parameterTyp[0]));
                      }else {
                         throw new RuntimeException("Wrong number of args for prop setter: "+p0.getName()+str+oobject.getName());
                      }
                   }
                   b annotation1 = oobject.getAnnotation(b.class);
                   if (annotation1 != null) {
                      parameterTyp = oobject.getParameterTypes();
                      if (parameterTyp.length == 2) {
                         if (parameterTyp[0] == Integer.TYPE) {
                            m.b(annotation1, oobject, parameterTyp[1], hashMap);
                         }else {
                            throw new RuntimeException("Second argument should be property index: "+p0.getName()+str+oobject.getName());
                         }
                      }else {
                         throw new RuntimeException("Wrong number of args for group prop setter: "+p0.getName()+str+oobject.getName());
                      }
                   }
                   len = len + 1;
                }
             }
             break ;
          }
       }
       m.a.put(p0, hashMap);
       return hashMap;
    }
    public static Map d(Class p0){
       Class[] parameterTyp;
       m om = m.class;
       Object obj = null;
       Map obj1 = PatchProxy.applyOneRefs(p0, obj, om, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == ViewManager.class) {
          return m.b;
       }
       obj1 = m.a.get(p0);
       if (obj1 != null) {
          return obj1;
       }
       HashMap hashMap = new HashMap(m.d(p0.getSuperclass()));
       if (!PatchProxy.applyVoidTwoRefs(p0, hashMap, obj, om, "7")) {
          Method[] declaredMeth = p0.getDeclaredMethods();
          int i = 0;
          int i1 = 0;
          while (i1 < declaredMeth.length) {
             object oobject = declaredMeth[i1];
             a annotation = oobject.getAnnotation(a.class);
             String str = "First param should be a view subclass to be updated: ";
             int i2 = 1;
             if (annotation != null) {
                parameterTyp = oobject.getParameterTypes();
                if (parameterTyp.length == 2) {
                   if (View.class.isAssignableFrom(parameterTyp[i])) {
                      hashMap.put(annotation.name(), m.a(annotation, oobject, parameterTyp[i2]));
                   }else {
                      throw new RuntimeException(str+p0.getName()+"#"+oobject.getName());
                   }
                }else {
                   throw new RuntimeException("Wrong number of args for prop setter: "+p0.getName()+"#"+oobject.getName());
                }
             }
             b annotation1 = oobject.getAnnotation(b.class);
             if (annotation1 != null) {
                parameterTyp = oobject.getParameterTypes();
                if (parameterTyp.length == 3) {
                   if (View.class.isAssignableFrom(parameterTyp[i])) {
                      if (parameterTyp[i2] == Integer.TYPE) {
                         m.b(annotation1, oobject, parameterTyp[2], hashMap);
                      }else {
                         throw new RuntimeException("Second argument should be property index: "+p0.getName()+"#"+oobject.getName());
                      }
                   }else {
                      throw new RuntimeException(str+p0.getName()+"#"+oobject.getName());
                   }
                }else {
                   throw new RuntimeException("Wrong number of args for group prop setter: "+p0.getName()+"#"+oobject.getName());
                }
             }
             i1 = i1 + 1;
          }
       }
       m.a.put(p0, hashMap);
       return hashMap;
    }
}
