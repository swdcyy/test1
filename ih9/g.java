package ih9.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ih9.p;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import java.lang.Object;

public class g extends Accessor	// class@00281e
{
    public final PostToolBoxFragment c;
    public final p d;

    public void g(p p0,PostToolBoxFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
