package com.kwai.robust.NativePatchInstaller;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.io.File;
import com.kwai.robust.RobustException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import com.kwai.robust.NativePatchInstaller$V25;
import com.kwai.robust.NativePatchInstaller$V23;
import com.kwai.robust.NativePatchInstaller$V14;

public class NativePatchInstaller	// class@0013f2
{

    public void NativePatchInstaller(){
       super();
    }
    public static boolean installNativeLibraryABI(ClassLoader p0,String p1,boolean p2){
       File uFile = new File(p1);
       if (!uFile.exists()) {
          throw new RobustException("so patch apply: nativeFile is not exists:"+uFile);
       }
       if (p0 == null) {
          throw new RobustException("so patch apply: classLoader is null:"+uFile);
       }
       NativePatchInstaller.installNativeLibraryPath(p0, uFile, p2);
       return true;
    }
    public static void installNativeLibraryPath(ClassLoader p0,File p1,boolean p2){
       if (p1 == null || (p1.exists() && p1.isDirectory())) {
          int sDK_INT = Build$VERSION.SDK_INT;
          int i = 25;
          if (sDK_INT != i || (Build$VERSION.PREVIEW_SDK_INT || sDK_INT > i)) {
             if (p2) {
                NativePatchInstaller$V25.install(p0, p1);
             }else {
                NativePatchInstaller$V25.uninstall(p0, p1);
             }
          }else if(sDK_INT >= 23){
             if (p2) {
                NativePatchInstaller$V23.install(p0, p1);
             }else {
                NativePatchInstaller$V23.uninstall(p0, p1);
             }
          }else if(p2){
             NativePatchInstaller$V14.install(p0, p1);
          }else {
             NativePatchInstaller$V14.uninstall(p0, p1);
          }
       }
       return;
    }
}
