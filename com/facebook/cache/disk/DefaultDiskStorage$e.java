package com.facebook.cache.disk.DefaultDiskStorage$e;
import com.facebook.cache.disk.b$d;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import com.facebook.cache.common.d;
import java.io.FileOutputStream;
import com.facebook.common.internal.c;
import java.io.OutputStream;
import java.io.FilterOutputStream;
import com.facebook.cache.disk.DefaultDiskStorage$IncompleteFileException;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Class;
import java.lang.Throwable;
import com.facebook.cache.common.CacheErrorLogger;
import sa.a;
import hb.a;
import com.facebook.common.file.FileUtils;
import sa.b;
import java.io.IOException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import java.io.FileNotFoundException;

public class DefaultDiskStorage$e implements b$d	// class@001044
{
    public final String a;
    public final File b;
    public final DefaultDiskStorage c;

    public void DefaultDiskStorage$e(DefaultDiskStorage p0,String p1,File p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void a(d p0,Object p1){
       try{
          p1 = new FileOutputStream(this.b);
          c uoc = new c(p1);
          p0.a(uoc);
          uoc.flush();
          uoc = uoc.b;
          p1.close();
          if (!this.b.length() - uoc) {
             return;
          }
          throw new DefaultDiskStorage$IncompleteFileException(uoc, this.b.length());
       }catch(java.io.FileNotFoundException e5){
          this.c.d.a(CacheErrorLogger$CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f, "updateResource", e5);
          throw e5;
       }
    }
    public a b(Object p0){
       CacheErrorLogger$CacheErrorCategory wRITE_RENAME;
       long l = this.c.e.now();
       p0 = this.c.l(this.a);
       try{
          FileUtils.b(this.b, p0);
          if (p0.exists()) {
             p0.setLastModified(l);
          }
          return b.b(p0);
       }catch(com.facebook.common.file.FileUtils$RenameException e5){
          Throwable cause = e5.getCause();
          if (cause != null) {
             if (!cause instanceof FileUtils$ParentDirNotFoundException) {
                wRITE_RENAME = (cause instanceof FileNotFoundException)? CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND: CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
             }else {
                wRITE_RENAME = CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
             }
          }else {
             wRITE_RENAME = CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
          }
          this.c.d.a(wRITE_RENAME, DefaultDiskStorage.f, "commit", e5);
          throw e5;
       }
    }
    public a c(Object p0,long p1){
       CacheErrorLogger$CacheErrorCategory wRITE_RENAME;
       p0 = this.c.l(this.a);
       try{
          FileUtils.b(this.b, p0);
          if (p0.exists()) {
             p0.setLastModified(p1);
          }
          return b.b(p0);
       }catch(com.facebook.common.file.FileUtils$RenameException e3){
          Throwable cause = e3.getCause();
          if (cause != null) {
             if (!cause instanceof FileUtils$ParentDirNotFoundException) {
                wRITE_RENAME = (cause instanceof FileNotFoundException)? CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND: CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
             }else {
                wRITE_RENAME = CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
             }
          }else {
             wRITE_RENAME = CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
          }
          this.c.d.a(wRITE_RENAME, DefaultDiskStorage.f, "commit", e3);
          throw e3;
       }
    }
    public boolean cleanUp(){
       boolean b = (!this.b.exists() || this.b.delete())? true: false;
       return b;
    }
}
