package jq9.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.g;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent;

public class c extends Accessor	// class@002b3a
{
    public final CoronaBannerFeed c;
    public final g d;

    public void c(g p0,CoronaBannerFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoronaBannerContent;
    }
    public void set(Object p0){
       this.c.mCoronaBannerContent = p0;
    }
}
