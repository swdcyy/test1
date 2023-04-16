package kw8.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import java.lang.Boolean;

public class j extends Accessor	// class@002c30
{
    public final ShareActivity c;
    public final l d;

    public void j(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.T);
    }
    public void set(Object p0){
       this.c.T = p0.booleanValue();
    }
}
