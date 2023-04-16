package androidx.multidex.MultiDex$V19;
import java.lang.Object;
import java.lang.ClassLoader;
import java.util.List;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Field;
import androidx.multidex.MultiDex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.io.IOException;
import java.lang.System;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.reflect.Method;

public final class MultiDex$V19	// class@000854
{

    public void MultiDex$V19(){
       super();
    }
    public static void install(ClassLoader p0,List p1,File p2){
       p0 = MultiDex.findField(p0, "pathList").get(p0);
       ArrayList uArrayList = new ArrayList();
       MultiDex.expandFieldArray(p0, "dexElements", MultiDex$V19.makeDexElements(p0, new ArrayList(p1), p2, uArrayList));
       if (uArrayList.size() <= 0) {
          return;
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          IOException iOException = iterator.next();
       }
       Field uField = MultiDex.findField(p0, "dexElementsSuppressedExceptions");
       IOException[] iOExceptionA = uField.get(p0);
       if (iOExceptionA == null) {
          iOExceptionA = new IOException[uArrayList.size()];
          iOExceptionA = uArrayList.toArray(iOExceptionA);
       }else {
          IOException[] iOExceptionA1 = new IOException[(uArrayList.size() + iOExceptionA.length)];
          uArrayList.toArray(iOExceptionA1);
          System.arraycopy(iOExceptionA, 0, iOExceptionA1, uArrayList.size(), iOExceptionA.length);
          iOExceptionA = iOExceptionA1;
       }
       uField.set(p0, iOExceptionA);
       IOException iOException1 = new IOException("I/O exception during makeDexElement");
       iOException1.initCause(uArrayList.get(0));
       throw iOException1;
    }
    public static Object[] makeDexElements(Object p0,ArrayList p1,File p2,ArrayList p3){
       Class[] uClassArray = new Class[]{ArrayList.class,File.class,ArrayList.class};
       Object[] objArray = new Object[]{p1,p2,p3};
       return MultiDex.findMethod(p0, "makeDexElements", uClassArray).invoke(p0, objArray);
    }
}
