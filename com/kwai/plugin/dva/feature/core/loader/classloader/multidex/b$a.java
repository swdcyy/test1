package com.kwai.plugin.dva.feature.core.loader.classloader.multidex.b$a;
import java.lang.Object;
import java.lang.ClassLoader;
import java.util.List;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.b;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.io.IOException;
import java.lang.System;
import java.lang.Throwable;
import java.lang.NoSuchMethodException;
import java.lang.StringBuilder;
import java.util.Arrays;

public final class b$a	// class@001319
{

    public void b$a(){
       super();
    }
    public static void a(ClassLoader p0,List p1,File p2){
       Object obj = p0;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b$a.class, "1")) {
          return;
       }
       IOException obj1 = b.c(obj, "pathList").get(obj);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList(p1);
       Object[] objArray = PatchProxy.applyFourRefs(obj1, uArrayList1, p2, uArrayList, null, b$a.class, "2");
       if (objArray != PatchProxyResult.class) {
       }else {
          Class[] uClassArray = new Class[]{ArrayList.class,File.class,ArrayList.class};
          Method method = PatchProxy.applyThreeRefs(obj1, "makeDexElements", uClassArray, null, b.class, "8");
          if (method != PatchProxyResult.class) {
          }else {
             Class class = obj1.getClass();
          label_006a :
             if (class != null) {
                try{
                   Method declaredMeth = class.getDeclaredMethod("makeDexElements", uClassArray);
                   if (!declaredMeth.isAccessible()) {
                      declaredMeth.setAccessible(1);
                   }
                   method = declaredMeth;
                }catch(java.lang.NoSuchMethodException e0){
                   class = class.getSuperclass();
                   goto label_006a ;
                }
             }else {
                throw new NoSuchMethodException("Method "+"makeDexElements"+" with parameters "+Arrays.asList(uClassArray)+" not found in "+obj1.getClass());
             }
          }
          Object[] objArray1 = new Object[]{uArrayList1,p2,uArrayList};
          objArray = method.invoke(obj1, objArray1);
       }
       b.b(obj1, "dexElements", objArray);
       if (uArrayList.size() > 0) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             IOException iOException = iterator.next();
          }
          Field uField = b.c(obj1, "dexElementsSuppressedExceptions");
          IOException[] iOExceptionA = uField.get(obj1);
          if (iOExceptionA == null) {
             iOExceptionA = new IOException[uArrayList.size()];
             iOExceptionA = uArrayList.toArray(iOExceptionA);
          }else {
             IOException[] iOExceptionA1 = new IOException[(uArrayList.size() + iOExceptionA.length)];
             uArrayList.toArray(iOExceptionA1);
             System.arraycopy(iOExceptionA, 0, iOExceptionA1, uArrayList.size(), iOExceptionA.length);
             iOExceptionA = iOExceptionA1;
          }
          uField.set(obj1, iOExceptionA);
          obj1 = new IOException("I/O exception during makeDexElement");
          obj1.initCause(uArrayList.get(0));
          throw obj1;
       }else {
          return;
       }
    }
}
