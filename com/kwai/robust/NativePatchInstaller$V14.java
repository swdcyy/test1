package com.kwai.robust.NativePatchInstaller$V14;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import com.kwai.robust.Reflect;
import java.lang.String;
import java.util.ArrayList;

public final class NativePatchInstaller$V14	// class@0013ee
{

    public void NativePatchInstaller$V14(){
       super();
    }
    public static void install(ClassLoader p0,File p1){
       p0 = Reflect.on(p0).get("pathList");
       File[] uFileArray = Reflect.on(p0).get("nativeLibraryDirectories");
       ArrayList uArrayList = new ArrayList((uFileArray.length + 1));
       uArrayList.add(p1);
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (!p1.equals(oobject)) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       File[] uFileArray1 = new File[0];
       Reflect.on(p0).set("nativeLibraryDirectories", uArrayList.toArray(uFileArray1));
       return;
    }
    public static void uninstall(ClassLoader p0,File p1){
       p0 = Reflect.on(p0).get("pathList");
       File[] uFileArray = Reflect.on(p0).get("nativeLibraryDirectories");
       ArrayList uArrayList = new ArrayList((uFileArray.length + 1));
       if (uArrayList.contains(p1)) {
          uArrayList.remove(p1);
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (!p1.equals(oobject)) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       File[] uFileArray1 = new File[0];
       Reflect.on(p0).set("nativeLibraryDirectories", uArrayList.toArray(uFileArray1));
       return;
    }
}
