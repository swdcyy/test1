package jq9.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.a0;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;

public class y extends Accessor	// class@002b68
{
    public final CoronaTitleFeed c;
    public final a0 d;

    public void y(a0 p0,CoronaTitleFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mTitleMeta;
    }
    public void set(Object p0){
       this.c.mTitleMeta = p0;
    }
}
