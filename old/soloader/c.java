package old.soloader.c;
import old.soloader.g;
import java.io.File;
import java.lang.String;
import android.os.StrictMode$ThreadPolicy;
import old.soloader.SoLoader;
import java.lang.StringBuilder;
import eud.a;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import old.soloader.MinElf;
import eud.b;
import java.lang.UnsatisfiedLinkError;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;

public class c extends g	// class@00200b
{
    public final File a;
    public final int b;

    public void c(File p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int a(String p0,int p1,StrictMode$ThreadPolicy p2){
       return this.d(p0, p1, this.a, p2);
    }
    public File c(String p0){
       File uFile = new File(this.a, p0);
       if (uFile.exists()) {
          return uFile;
       }
       return null;
    }
    public int d(String p0,int p1,File p2,StrictMode$ThreadPolicy p3){
       File uFile = new File(p2, p0);
       int i = 0;
       if (!uFile.exists()) {
          return i;
       }
       boolean i1 = p1 & 0x01;
       if (i1) {
          int i2 = 2;
          i1 = this.b & i2;
          if (i1) {
             return i2;
          }
       }
       i1 = this.b & 1;
       if (i1) {
          i1 = SoLoader.a;
          if (i1) {
             a.a("SoLoader.getElfDependencies["+uFile.getName()+"]");
          }
          FileInputStream uFileInputSt = new FileInputStream(uFile);
          String[] stringArray = MinElf.a(uFileInputSt.getChannel());
          uFileInputSt.close();
          if (i1) {
             a.b();
          }
          while (i < stringArray.length) {
             object oobject = stringArray[i];
             if (!oobject.startsWith("/")) {
                int i3 = p1 | 0x01;
                SoLoader.f(oobject, null, null, i3, p3);
             }
             i++;
          }
       }
       try{
          SoLoader.b.a(uFile.getAbsolutePath(), p1);
          return 1;
       }catch(java.lang.UnsatisfiedLinkError e6){
          if ((e6.getMessage()).contains("bad ELF magic")) {
             return 3;
          }else {
             throw e6;
          }
       }
    }
    public String toString(){
       String str;
       try{
          str = String.valueOf(this.a.getCanonicalPath());
       }catch(java.io.IOException e0){
          str = this.a.getName();
       }
       return this.getClass().getName()+"[root = "+str+" flags = "+this.b+']';
    }
}
