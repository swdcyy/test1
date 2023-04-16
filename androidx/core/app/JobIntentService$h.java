package androidx.core.app.JobIntentService$h;
import android.content.ComponentName;
import java.lang.Object;
import android.content.Intent;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class JobIntentService$h	// class@0006db
{
    public final ComponentName a;
    public boolean b;
    public int c;

    public void JobIntentService$h(ComponentName p0){
       super();
       this.a = p0;
    }
    public abstract void a(Intent p0);
    public void b(int p0){
       if (this.b == null) {
          this.b = true;
          this.c = p0;
       }else if(this.c == p0){
          throw new IllegalArgumentException("Given job ID "+p0+" is different than previous "+this.c);
       }
       return;
    }
    public void c(){
    }
    public void d(){
    }
    public void e(){
    }
}
