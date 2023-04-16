package ih9.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ih9.p;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import java.lang.Object;
import java.lang.String;

public class n extends Accessor	// class@002825
{
    public final PostToolBoxFragment c;
    public final p d;

    public void n(p p0,PostToolBoxFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
