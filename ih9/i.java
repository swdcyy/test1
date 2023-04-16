package ih9.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ih9.p;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import java.lang.Object;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;

public class i extends Accessor	// class@002820
{
    public final PostToolBoxFragment c;
    public final p d;

    public void i(p p0,PostToolBoxFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
