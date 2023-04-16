package m6a.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m6a.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import java.lang.Object;
import java.lang.Integer;

public class h extends Accessor	// class@002f50
{
    public final GrootMerchantRecommendUserFragment c;
    public final l d;

    public void h(l p0,GrootMerchantRecommendUserFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.J);
    }
    public void set(Object p0){
       this.c.J = p0.intValue();
    }
}
