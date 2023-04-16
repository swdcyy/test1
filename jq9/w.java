package jq9.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.a0;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CommonMeta;

public class w extends Accessor	// class@002b64
{
    public final CoronaTitleFeed c;
    public final a0 d;

    public void w(a0 p0,CoronaTitleFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCommonMeta;
    }
    public void set(Object p0){
       this.c.mCommonMeta = p0;
    }
}
