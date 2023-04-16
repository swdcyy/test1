package old.soloader.b;
import old.soloader.g;
import android.content.Context;
import old.soloader.c;
import java.io.File;
import android.content.pm.ApplicationInfo;
import java.lang.String;
import android.os.StrictMode$ThreadPolicy;
import java.lang.Object;
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class b extends g	// class@00200a
{
    public Context a;
    public int b;
    public c c;

    public void b(Context p0,int p1){
       super();
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       if (applicationC == null) {
          this.a = p0;
       }
       this.b = p1;
       this.c = new c(new File(this.a.getApplicationInfo().nativeLibraryDir), p1);
       return;
    }
    public int a(String p0,int p1,StrictMode$ThreadPolicy p2){
       return this.c.a(p0, p1, p2);
    }
    public void b(int p0){
       this.c.b(p0);
    }
    public File c(String p0){
       b tc = this.c;
       Objects.requireNonNull(tc);
       File uFile = new File(tc.a, p0);
       if (uFile.exists()) {
       }else {
          uFile = null;
       }
       return uFile;
    }
    public boolean d(){
       try{
          b ta = this.a;
          int i = 0;
          Context uContext = ta.createPackageContext(ta.getPackageName(), i);
          File uFile = new File(uContext.getApplicationInfo().nativeLibraryDir);
          if (!this.c.a.equals(uFile)) {
             i = 1;
             int i1 = this.b | i;
             this.b = i1;
             this.c = new c(uFile, i1);
             this.a = uContext;
          }
          return i;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          throw new RuntimeException(e0);
       }
    }
    public String toString(){
       return this.c.toString();
    }
}
