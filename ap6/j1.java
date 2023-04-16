package ap6.j1;
import java.lang.Runnable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import cp6.n;

public final class j1 implements Runnable	// class@000341
{
    public final b b;
    public final String c;

    public void j1(b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n.i(this.b.b).g(this.c, 4);
    }
}
