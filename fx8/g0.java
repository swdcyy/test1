package fx8.g0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.activity.share.topic.i;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.m;
import oq.e;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import java.lang.Long;
import fx8.a0;
import java.util.List;

public final class g0 implements Callable	// class@00237d
{
    public final i b;

    public void g0(i p0){
       this.b = p0;
    }
    public final Object call(){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       return e.b().c(Long.parseLong(QCurrentUser.me().getId()), tb.p.c(), "");
    }
}
