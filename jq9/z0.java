package jq9.z0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.e1;
import com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;

public class z0 extends Accessor	// class@002b69
{
    public final TubeHomeLocalFeed c;
    public final e1 d;

    public void z0(e1 p0,TubeHomeLocalFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mAggregateTemplateMeta;
    }
    public void set(Object p0){
       this.c.mAggregateTemplateMeta = p0;
    }
}
