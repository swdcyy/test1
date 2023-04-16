package androidx.media.MediaBrowserServiceCompat$i;
import java.lang.Object;
import android.os.Bundle;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;

public class MediaBrowserServiceCompat$i	// class@00083c
{
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;

    public void MediaBrowserServiceCompat$i(Object p0){
       super();
       this.a = p0;
    }
    public int a(){
       return this.e;
    }
    public boolean b(){
       boolean b = (this.b == null && (this.c != null || this.d != null))? true: false;
       return b;
    }
    public void c(Bundle p0){
       throw new UnsupportedOperationException("It is not supported to send an error for "+this.a);
    }
    public void d(Object p0){
    }
    public void e(Bundle p0){
       if (this.c != null || this.d != null) {
          throw new IllegalStateException("sendError\(\) called when either sendResult\(\) or sendError\(\) had already been called for: "+this.a);
       }
       this.d = true;
       this.c(null);
       return;
    }
    public void f(Object p0){
       if (this.c != null || this.d != null) {
          throw new IllegalStateException("sendResult\(\) called when either sendResult\(\) or sendError\(\) had already been called for: "+this.a);
       }
       this.c = true;
       this.d(null);
       return;
    }
    public void g(int p0){
       this.e = p0;
    }
}
