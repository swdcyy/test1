package kw8.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kw8.l;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import android.content.SharedPreferences;

public class g extends Accessor	// class@002c2d
{
    public final ShareActivity c;
    public final l d;

    public void g(l p0,ShareActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.O;
    }
    public void set(Object p0){
       this.c.O = p0;
    }
}
