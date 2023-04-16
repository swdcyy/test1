package m6a.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m6a.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;

public class i extends Accessor	// class@002f51
{
    public final GrootMerchantRecommendUserFragment c;
    public final l d;

    public void i(l p0,GrootMerchantRecommendUserFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.G;
    }
    public void set(Object p0){
       this.c.G = p0;
    }
}
