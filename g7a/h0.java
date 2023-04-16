package g7a.h0;
import java.lang.Runnable;
import g7a.i0;
import io.reactivex.subjects.PublishSubject;
import rd5.g;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import java.lang.Object;

public final class h0 implements Runnable	// class@0023da
{
    public final i0 b;
    public final PublishSubject c;
    public final g d;
    public final NasaSlideSchemeAction e;

    public void h0(i0 p0,PublishSubject p1,g p2,NasaSlideSchemeAction p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.a = null;
       this.c.onNext(this.d);
       this.e.mHasConsume = true;
    }
}
