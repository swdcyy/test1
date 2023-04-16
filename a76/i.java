package a76.i;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class i implements Runnable	// class@000037
{
    public final Runnable b;

    public void i(Runnable p0){
       this.b = p0;
    }
    public final void run(){
       e.g.d(this.b);
    }
}
