package jq9.a1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.e1;
import com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CommonMeta;

public class a1 extends Accessor	// class@002b33
{
    public final TubeHomeLocalFeed c;
    public final e1 d;

    public void a1(e1 p0,TubeHomeLocalFeed p1){
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
