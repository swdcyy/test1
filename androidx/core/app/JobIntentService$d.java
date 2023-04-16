package androidx.core.app.JobIntentService$d;
import androidx.core.app.JobIntentService$e;
import androidx.core.app.JobIntentService;
import android.content.Intent;
import java.lang.Object;
import android.app.Service;

public final class JobIntentService$d implements JobIntentService$e	// class@0006d6
{
    public final Intent a;
    public final int b;
    public final JobIntentService c;

    public void JobIntentService$d(JobIntentService p0,Intent p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void complete(){
       this.c.stopSelf(this.b);
    }
    public Intent getIntent(){
       return this.a;
    }
}
