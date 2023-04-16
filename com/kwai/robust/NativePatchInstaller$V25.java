package com.kwai.robust.NativePatchInstaller$V25;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import com.kwai.robust.Reflect;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public final class NativePatchInstaller$V25	// class@0013f0
{

    public void NativePatchInstaller$V25(){
       super();
    }
    public static void install(ClassLoader p0,File p1){
       p0 = Reflect.on(p0).get("pathList");
       List list = Reflect.on(p0).get("nativeLibraryDirectories");
       int i = 2;
       if (list == null) {
          list = new ArrayList(i);
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p1.equals(iterator.next())) {
                iterator.remove();
             }
          }
          list.add(0, p1);
          List list1 = Reflect.on(p0).get("systemNativeLibraryDirectories");
          if (list1 == null) {
             list1 = new ArrayList(i);
          }
          Iterator iterator1 = list1.iterator();
          while (iterator1.hasNext()) {
             File uFile = iterator1.next();
          }
          ArrayList uArrayList = new ArrayList(((list.size() + list1.size()) + 1));
          uArrayList.addAll(list);
          uArrayList.addAll(list1);
          Iterator iterator2 = list.iterator();
          while (iterator2.hasNext()) {
             File uFile1 = iterator2.next();
          }
          Object[] objArray = new Object[]{uArrayList};
          Reflect.on(p0).set("nativeLibraryPathElements", Reflect.on(p0).call("makePathElements", objArray).get());
          return;
       }
    }
    public static void uninstall(ClassLoader p0,File p1){
       p0 = Reflect.on(p0).get("pathList");
       List list = Reflect.on(p0).get("nativeLibraryDirectories");
       if (list != null) {
          Iterator iterator = list.iterator();
          if (iterator.hasNext() && p1.equals(iterator.next())) {
             iterator.remove();
          }
       }
       List list1 = Reflect.on(p0).get("systemNativeLibraryDirectories");
       if (list1 != null) {
          ArrayList uArrayList = new ArrayList(((list.size() + list1.size()) - 1));
          uArrayList.addAll(list);
          uArrayList.addAll(list1);
          Object[] objArray = new Object[]{uArrayList};
          Reflect.on(p0).set("nativeLibraryPathElements", Reflect.on(p0).call("makePathElements", objArray).get());
       }
       return;
    }
}
