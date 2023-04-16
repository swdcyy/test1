package fx8.d0;
import erd.o;
import com.yxcorp.gifshow.activity.share.topic.i;
import java.lang.Object;
import retrofit2.p;
import java.util.Objects;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import fx8.a0;
import java.util.List;
import java.util.ArrayList;

public final class d0 implements o	// class@002377
{
    public final i b;

    public void d0(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a();
       tb.p.f(p0);
       if (p0 != null) {
          p0 = (tb.p.b != null)? p0.getPageItems(): p0.getItems();
       }else {
          p0 = new ArrayList();
       }
       return p0;
    }
}
