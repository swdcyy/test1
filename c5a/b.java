package c5a.b;
import java.lang.Runnable;
import c5a.c;
import java.lang.Object;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;

public final class b implements Runnable	// class@000548
{
    public final c b;
    public final boolean c;

    public void b(c p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       c u = tb.u;
       QPhoto qPhoto = u.n(u.q(u.j()));
       if (qPhoto != tb.r) {
          tb.P8(qPhoto, tc);
       }
       return;
    }
}
