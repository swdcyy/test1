package h0a.c;
import erd.g;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import df5.e;

public final class c implements g	// class@00252b
{
    public final NasaMilanoSlidePlayContainerFragment b;

    public void c(NasaMilanoSlidePlayContainerFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Iterator iterator = this.b.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0.booleanValue());
       }
       return;
    }
}
