package em1.y;
import java.lang.Runnable;
import em1.a0;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import dm1.d;

public final class y implements Runnable	// class@0021cb
{
    public final a0 b;
    public final List c;
    public final boolean d;
    public final String e;

    public void y(a0 p0,List p1,boolean p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.g.a(null, this.c, this.d, this.e);
    }
}
