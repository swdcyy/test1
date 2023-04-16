package jq9.w0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.y0;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoronaInfo;

public class w0 extends Accessor	// class@002b63
{
    public final PadCoronaRankingListTabData c;
    public final y0 d;

    public void w0(y0 p0,PadCoronaRankingListTabData p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.getCoronaInfo();
    }
}
