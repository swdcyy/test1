package ih9.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ih9.p;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import java.lang.Object;
import java.lang.Integer;

public class k extends Accessor	// class@002822
{
    public final PostToolBoxFragment c;
    public final p d;

    public void k(p p0,PostToolBoxFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.r);
    }
}
