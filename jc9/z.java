package jc9.z;
import java.lang.Runnable;
import jc9.b0;
import java.lang.Object;
import android.os.Handler;

public final class z implements Runnable	// class@002952
{
    public final b0 b;

    public void z(b0 p0){
       this.b = p0;
    }
    public final void run(){
       this.b.g.removeCallbacksAndMessages(null);
    }
}
