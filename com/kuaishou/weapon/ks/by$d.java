package com.kuaishou.weapon.ks.by$d;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Field;
import com.kuaishou.weapon.ks.e;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Class;
import java.lang.reflect.Method;

public final class by$d	// class@0011fe
{

    public void by$d(){
       super();
    }
    public static void a(ClassLoader p0,File p1){
       by$d.b(p0, p1);
    }
    public static void b(ClassLoader p0,File p1){
       List list1;
       p0 = e.a(p0, "pathList").get(p0);
       List list = e.a(p0, "nativeLibraryDirectories").get(p0);
       int i = 2;
       if (list == null) {
          list = new ArrayList(i);
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p1.equals(iterator.next())) {
                return;
             }
             continue ;
          }else {
             list.add(p1);
             list1 = e.a(p0, "systemNativeLibraryDirectories").get(p0);
             if (list1 == null) {
                list1 = new ArrayList(i);
                break ;
             }
             break ;
          }
       }
       ArrayList uArrayList = new ArrayList(((list.size() + list1.size()) + 1));
       uArrayList.addAll(list);
       uArrayList.addAll(list1);
       Class[] uClassArray = new Class[]{List.class};
       Object[] objArray = new Object[]{uArrayList};
       e.a(p0, "nativeLibraryPathElements").set(p0, e.a(p0, "makePathElements", uClassArray).invoke(p0, objArray));
       return;
    }
}
