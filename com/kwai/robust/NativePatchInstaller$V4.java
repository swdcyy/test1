package com.kwai.robust.NativePatchInstaller$V4;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import java.lang.String;
import com.kwai.robust.Reflect;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class NativePatchInstaller$V4	// class@0013f1
{

    public void NativePatchInstaller$V4(){
       super();
    }
    public static void install(ClassLoader p0,File p1){
       String path = p1.getPath();
       String str = "libPath";
       String[] stringArray = (Reflect.on(p0).get(str)).split(":");
       String str1 = path;
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (oobject != null && !path.equals(oobject)) {
             str1 = str1+':'+oobject;
          }
          i = i + 1;
       }
       Reflect.on(p0).set(str, str1);
       List list = Reflect.on(p0).get(str);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          if (path.equals(iterator.next())) {
             iterator.remove();
             break ;
          }
       }
       list.add(0, path);
       Reflect.on(p0).set("libraryPathElements", list);
       return;
    }
    public static void uninstall(ClassLoader p0,File p1){
       String path = p1.getPath();
       String str = "libPath";
       String[] stringArray = (Reflect.on(p0).get(str)).split(":");
       StringBuilder str1 = "";
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (oobject != null && !path.equals(oobject)) {
             if (!TextUtils.isEmpty(str1)) {
                str1 = str1+':';
             }
             str1 = str1+oobject;
          }
          i = i + 1;
       }
       Reflect.on(p0).set(str, str1);
       List list = Reflect.on(p0).get("libraryPathElements");
       Iterator iterator = list.iterator();
       if (iterator.hasNext() && path.equals(iterator.next())) {
          iterator.remove();
       }
       Reflect.on(p0).set("libraryPathElements", list);
       return;
    }
}
