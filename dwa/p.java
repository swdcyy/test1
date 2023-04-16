package dwa.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dwa.u;
import dwa.k;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback;

public class p extends Accessor	// class@002599
{
    public final k c;
    public final u d;

    public void p(u p0,k p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
