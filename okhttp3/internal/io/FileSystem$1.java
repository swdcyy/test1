package okhttp3.internal.io.FileSystem$1;
import okhttp3.internal.io.FileSystem;
import java.lang.Object;
import java.io.File;
import okio.m;
import okio.l;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;
import okio.n;

public class FileSystem$1 implements FileSystem	// class@001fc8
{

    public void FileSystem$1(){
       super();
    }
    public m appendingSink(File p0){
       m om;
       try{
          om = l.a(p0);
          return om;
       }catch(java.io.FileNotFoundException e0){
          om.getParentFile().mkdirs();
          return l.a(om);
       }
    }
    public void delete(File p0){
       if (p0.delete() || !p0.exists()) {
          return;
       }
       throw new IOException("failed to delete "+p0);
    }
    public void deleteContents(File p0){
       object oobject;
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          throw new IOException("not a readable directory: "+p0);
       }
       int len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = uFileArray[i];
          if (oobject.isDirectory()) {
             this.deleteContents(oobject);
          }
          if (oobject.delete()) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IOException("failed to delete "+oobject);
    }
    public boolean exists(File p0){
       return p0.exists();
    }
    public void rename(File p0,File p1){
       this.delete(p1);
       if (p0.renameTo(p1)) {
          return;
       }
       throw new IOException("failed to rename "+p0+" to "+p1);
    }
    public m sink(File p0){
       m om;
       try{
          om = l.f(p0);
          return om;
       }catch(java.io.FileNotFoundException e0){
          om.getParentFile().mkdirs();
          return l.f(om);
       }
    }
    public long size(File p0){
       return p0.length();
    }
    public n source(File p0){
       return l.j(p0);
    }
}
