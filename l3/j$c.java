package l3.j$c;
import android.content.Context;
import k3.a;
import x3.a;
import t3.a;
import androidx.work.impl.WorkDatabase;
import java.lang.String;
import java.lang.Object;
import androidx.work.WorkerParameters$a;
import l3.j;
import java.util.List;

public class j$c	// class@00250b
{
    public Context a;
    public ListenableWorker b;
    public a c;
    public a d;
    public a e;
    public WorkDatabase f;
    public String g;
    public List h;
    public WorkerParameters$a i;

    public void j$c(Context p0,a p1,a p2,a p3,WorkDatabase p4,String p5){
       super();
       this.i = new WorkerParameters$a();
       this.a = p0.getApplicationContext();
       this.d = p2;
       this.c = p3;
       this.e = p1;
       this.f = p4;
       this.g = p5;
    }
    public j a(){
       return new j(this);
    }
    public j$c b(WorkerParameters$a p0){
       if (p0 != null) {
          this.i = p0;
       }
       return this;
    }
    public j$c c(List p0){
       this.h = p0;
       return this;
    }
}
