package f2b.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f2b.m;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import xl8.b;

public class j extends Accessor	// class@002878
{
    public final HomeLocalSizerViewPresenter c;
    public final m d;

    public void j(m p0,HomeLocalSizerViewPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.A;
    }
    public void set(Object p0){
       this.c.A = p0;
    }
}
