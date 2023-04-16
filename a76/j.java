package a76.j;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class j implements Runnable	// class@000038
{
    public final Runnable b;

    public void j(Runnable p0){
       this.b = p0;
    }
    public final void run(){
       e.g.b(this.b);
    }
}
