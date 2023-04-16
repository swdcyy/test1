package bo4.d;
import java.lang.Runnable;
import com.kuaishou.bowl.core.component.a;
import java.lang.String;
import java.lang.Object;

public final class d implements Runnable	// class@0003aa
{
    public final a b;
    public final String c;

    public void d(a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.tryAnchor(this.c);
    }
}
