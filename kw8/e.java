package kw8.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class e extends Accessor	// class@002c2b
{
    public final ShareActivity c;
    public final l d;

    public void e(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.P;
    }
    public void set(Object p0){
       this.c.P = p0;
    }
}
