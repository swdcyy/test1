package com.kwai.robust.NativePatchInstaller$V23;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import com.kwai.robust.Reflect;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public final class NativePatchInstaller$V23	// class@0013ef
{

    public void NativePatchInstaller$V23(){
       super();
    }
    public static void install(ClassLoader p0,File p1){
       List list1;
       p0 = Reflect.on(p0).get("pathList");
       List list = Reflect.on(p0).get("nativeLibraryDirectories");
       if (list == null) {
          list = new ArrayList(2);
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p1.equals(iterator.next())) {
                iterator.remove();
             }
          }
          int i = 0;
          list.add(i, p1);
          list1 = Reflect.on(p0).get("systemNativeLibraryDirectories");
          if (list1 == null) {
             list1 = new ArrayList(2);
             break ;
          }
          break ;
       }
       ArrayList uArrayList = new ArrayList(((list.size() + list1.size()) + 1));
       uArrayList.addAll(list);
       uArrayList.addAll(list1);
       Object[] objArray = new Object[]{uArrayList,null,new ArrayList()};
       Reflect.on(p0).set("nativeLibraryPathElements", Reflect.on(p0).call("makePathElements", objArray).get());
       return;
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
       if (list1 == null) {
          list1 = new ArrayList(2);
       }
       ArrayList uArrayList = new ArrayList(((list.size() + list1.size()) - 1));
       uArrayList.addAll(list);
       uArrayList.addAll(list1);
       Object[] objArray = new Object[]{uArrayList,null,new ArrayList()};
       Reflect.on(p0).set("nativeLibraryPathElements", Reflect.on(p0).call("makePathElements", objArray).get());
       return;
    }
}
