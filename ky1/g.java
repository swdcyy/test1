package ky1.g;
import java.lang.Runnable;
import my1.e;
import androidx.lifecycle.Observer;
import java.lang.Object;
import androidx.lifecycle.LiveData;

public final class g implements Runnable	// class@002e27
{
    public final e b;
    public final Observer c;

    public void g(e p0,Observer p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.removeObserver(this.c);
    }
}
