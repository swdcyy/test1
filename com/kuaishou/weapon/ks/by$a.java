package com.kuaishou.weapon.ks.by$a;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Field;
import com.kuaishou.weapon.ks.e;
import java.util.ArrayList;

public final class by$a	// class@0011fb
{

    public void by$a(){
       super();
    }
    public static void a(ClassLoader p0,File p1){
       by$a.b(p0, p1);
    }
    public static void b(ClassLoader p0,File p1){
       p0 = e.a(p0, "pathList").get(p0);
       Field uField = e.a(p0, "nativeLibraryDirectories");
       File[] uFileArray = uField.get(p0);
       ArrayList uArrayList = new ArrayList();
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (!p1.equals(oobject)) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       uArrayList.add(p1);
       File[] uFileArray1 = new File[0];
       uField.set(p0, uArrayList.toArray(uFileArray1));
       return;
    }
}
