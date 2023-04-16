package com.facebook.common.file.FileUtils;
import java.io.File;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.lang.String;
import com.facebook.common.file.FileUtils$FileDeleteException;
import java.lang.Throwable;
import java.lang.Object;
import ab.e;
import java.io.FileNotFoundException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import java.lang.StringBuilder;

public class FileUtils	// class@000440
{

    public static void a(File p0){
       if (p0.exists()) {
          if (p0.isDirectory()) {
             return;
          }else if(p0.delete()){
             throw new FileUtils$CreateDirectoryException(p0.getAbsolutePath(), new FileUtils$FileDeleteException(p0.getAbsolutePath()));
          }
       }
       if (p0.mkdirs() || p0.isDirectory()) {
          return;
       }else {
          throw new FileUtils$CreateDirectoryException(p0.getAbsolutePath());
       }
    }
    public static void b(File p0,File p1){
       e.d(p0);
       e.d(p1);
       p1.delete();
       if (p0.renameTo(p1)) {
          return;
       }
       FileNotFoundException uFileNotFoun = null;
       if (!p1.exists()) {
          if (p0.getParentFile().exists()) {
             if (!p0.exists()) {
                uFileNotFoun = new FileNotFoundException(p0.getAbsolutePath());
             }
          }else {
             uFileNotFoun = new FileUtils$ParentDirNotFoundException(p0.getAbsolutePath());
          }
       }else {
          uFileNotFoun = new FileUtils$FileDeleteException(p1.getAbsolutePath());
       }
       throw new FileUtils$RenameException("Unknown error renaming "+p0.getAbsolutePath()+" to "+p1.getAbsolutePath(), uFileNotFoun);
    }
}
