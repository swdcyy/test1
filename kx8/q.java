package kx8.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kx8.s;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class q extends Accessor	// class@002c47
{
    public final OperateWebViewFragment c;
    public final s d;

    public void q(s p0,OperateWebViewFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.C;
    }
    public void set(Object p0){
       this.c.C = p0;
    }
}
