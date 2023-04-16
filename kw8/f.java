package kw8.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import java.util.Map;

public class f extends Accessor	// class@002c2c
{
    public final ShareActivity c;
    public final l d;

    public void f(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.S;
    }
    public void set(Object p0){
       this.c.S = p0;
    }
}
