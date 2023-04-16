package mc9.l;
import erd.r;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Arrays;
import q87.c;

public final class l implements r	// class@002e4b
{
    public final c b;
    public final CDNUrl[] c;

    public void l(c p0,CDNUrl[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       boolean b = (tc != null && tb.c < tc.length)? true: false;
       a.D().v("SampleProcessor", "retry:"+b+" , mIndex:"+tb.c+" , videoCdn:"+Arrays.toString(tc), p0);
       return b;
    }
}
