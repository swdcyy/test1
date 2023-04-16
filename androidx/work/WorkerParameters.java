package androidx.work.WorkerParameters;
import java.util.UUID;
import androidx.work.a;
import java.util.Collection;
import androidx.work.WorkerParameters$a;
import java.util.concurrent.Executor;
import x3.a;
import k3.n;
import k3.j;
import k3.e;
import java.lang.Object;
import java.util.HashSet;
import android.net.Network;
import java.util.Set;
import java.util.List;

public final class WorkerParameters	// class@000a57
{
    public UUID a;
    public a b;
    public Set c;
    public WorkerParameters$a d;
    public int e;
    public Executor f;
    public a g;
    public n h;
    public j i;
    public e j;

    public void WorkerParameters(UUID p0,a p1,Collection p2,WorkerParameters$a p3,int p4,Executor p5,a p6,n p7,j p8,e p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new HashSet(p2);
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public Executor a(){
       return this.f;
    }
    public e b(){
       return this.j;
    }
    public UUID c(){
       return this.a;
    }
    public a d(){
       return this.b;
    }
    public Network e(){
       return this.d.c;
    }
    public j f(){
       return this.i;
    }
    public int g(){
       return this.e;
    }
    public Set h(){
       return this.c;
    }
    public a i(){
       return this.g;
    }
    public List j(){
       return this.d.a;
    }
    public List k(){
       return this.d.b;
    }
    public n l(){
       return this.h;
    }
}
