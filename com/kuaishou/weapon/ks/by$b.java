package com.kuaishou.weapon.ks.by$b;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Field;
import com.kuaishou.weapon.ks.e;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Class;
import java.lang.reflect.Method;

public final class by$b	// class@0011fc
{

    public void by$b(){
       super();
    }
    public static void a(ClassLoader p0,File p1){
       by$b.b(p0, p1);
    }
    public static void b(ClassLoader p0,File p1){
       p0 = e.a(p0, "pathList").get(p0);
       String str = "nativeLibraryDirectories";
       Field uField = e.a(p0, str);
       List list = uField.get(p0);
       if (list == null) {
          list = new ArrayList(2);
       }
       ArrayList uArrayList = new ArrayList(list);
       Iterator iterator = uArrayList.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p1.equals(iterator.next())) {
                return;
             }
             continue ;
          }else {
             uArrayList.add(p1);
             uField.set(p0, uArrayList);
             if (uField.get(p0) != uArrayList) {
                e.b(p0, str).set(p0, uArrayList);
             }
             List list1 = e.a(p0, "systemNativeLibraryDirectories").get(p0);
             if (list1 == null) {
                list1 = new ArrayList(2);
             }
             ArrayList uArrayList1 = new ArrayList(((uArrayList.size() + list1.size()) + 1));
             uArrayList1.addAll(uArrayList);
             uArrayList1.addAll(list1);
             Class[] uClassArray = new Class[]{List.class,File.class,List.class};
             Object[] objArray = new Object[]{uArrayList1,null,new ArrayList()};
             objArray = e.a(p0, "makePathElements", uClassArray).invoke(p0, objArray);
             str = "nativeLibraryPathElements";
             uField = e.a(p0, str);
             uField.set(p0, objArray);
             if (uField.get(p0) != objArray) {
                e.b(p0, str).set(p0, objArray);
                break ;
             }
             break ;
          }
       }
       return;
    }
}
