package f2b.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f2b.m;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import tw5.f;

public class i extends Accessor	// class@002877
{
    public final HomeLocalSizerViewPresenter c;
    public final m d;

    public void i(m p0,HomeLocalSizerViewPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.B;
    }
    public void set(Object p0){
       this.c.B = p0;
    }
}
