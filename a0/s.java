package a0.s;
import java.io.Closeable;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode$VmPolicy;
import java.lang.Object;
import android.os.StrictMode;

public final class s implements Closeable	// class@000033
{
    public final StrictMode$ThreadPolicy b;
    public final StrictMode$VmPolicy c;

    public void s(StrictMode$ThreadPolicy p0){
       super(p0, null);
    }
    public void s(StrictMode$ThreadPolicy p0,StrictMode$VmPolicy p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void s(StrictMode$VmPolicy p0){
       super(null, p0);
    }
    public static s a(){
       return new s(StrictMode.allowThreadDiskReads());
    }
    public static s c(){
       return new s(StrictMode.allowThreadDiskWrites());
    }
    public void close(){
       s tb = this.b;
       if (tb != null) {
          StrictMode.setThreadPolicy(tb);
       }
       tb = this.c;
       if (tb != null) {
          StrictMode.setVmPolicy(tb);
       }
       return;
    }
}
