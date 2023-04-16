package f2b.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f2b.m;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import java.lang.Boolean;

public class k extends Accessor	// class@002879
{
    public final HomeLocalSizerViewPresenter c;
    public final m d;

    public void k(m p0,HomeLocalSizerViewPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.z);
    }
    public void set(Object p0){
       this.c.z = p0.booleanValue();
    }
}
