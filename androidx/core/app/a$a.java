package androidx.core.app.a$a;
import java.lang.Runnable;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import android.content.pm.PackageManager;
import androidx.core.app.a$c;

public class a$a implements Runnable	// class@0006f4
{
    public final String[] b;
    public final Activity c;
    public final int d;

    public void a$a(String[] p0,Activity p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void run(){
       int[] ointArray = new int[this.b.length];
       PackageManager packageManag = this.c.getPackageManager();
       String packageName = this.c.getPackageName();
       int len = this.b.length;
       for (int i = 0; i < len; i = i + 1) {
          ointArray[i] = packageManag.checkPermission(this.b[i], packageName);
       }
       this.c.onRequestPermissionsResult(this.d, this.b, ointArray);
       return;
    }
}
