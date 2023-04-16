package androidx.core.app.JobIntentService$a;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;
import java.lang.Void;
import androidx.core.app.JobIntentService$e;
import android.content.Intent;
import java.lang.Object;

public final class JobIntentService$a extends AsyncTask	// class@0006d3
{
    public final JobIntentService a;

    public void JobIntentService$a(JobIntentService p0){
       this.a = p0;
       super();
    }
    public Void a(Void[] p0){
       JobIntentService$e uoe = this.a.a();
       while (uoe != null) {
          this.a.e(uoe.getIntent());
          uoe.complete();
       }
       return null;
    }
    public void b(Void p0){
       this.a.f();
    }
    public void c(Void p0){
       this.a.f();
    }
    public Object doInBackground(Object[] p0){
       this.a(p0);
       return null;
    }
    public void onCancelled(Object p0){
       this.b(p0);
    }
    public void onPostExecute(Object p0){
       this.c(p0);
    }
}
