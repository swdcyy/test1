package h0a.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h0a.p;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class i extends Accessor	// class@002531
{
    public final NasaMilanoSlidePlayContainerFragment c;
    public final p d;

    public void i(p p0,NasaMilanoSlidePlayContainerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.F;
    }
    public void set(Object p0){
       this.c.F = p0;
    }
}
