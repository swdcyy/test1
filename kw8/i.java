package kw8.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import java.util.List;

public class i extends Accessor	// class@002c2f
{
    public final ShareActivity c;
    public final l d;

    public void i(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.R;
    }
    public void set(Object p0){
       this.c.R = p0;
    }
}
