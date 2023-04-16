package jq9.s0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v0;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoronaInfo;

public class s0 extends Accessor	// class@002b5b
{
    public final PadCoronaRankingListFeed c;
    public final v0 d;

    public void s0(v0 p0,PadCoronaRankingListFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.coronaInfo;
    }
    public void set(Object p0){
       this.c.coronaInfo = p0;
    }
}
