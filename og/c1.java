package og.c1;
import io.reactivex.g;
import java.util.concurrent.Callable;
import java.lang.Object;
import brd.v;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.feature.post.bridge.util.UploadTokenHelper;
import com.feature.post.bridge.util.UploadTokenHelper$a;
import com.feature.post.bridge.util.UploadTokenHelper$ApplyTokenResponse;
import brd.g;
import java.lang.Throwable;

public final class c1 implements g	// class@00279c
{
    public final Callable b;

    public void c1(Callable p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       a.p(p0, "emitter");
       Object obj = this.b.call();
       a.m(obj);
       p0.onNext(UploadTokenHelper.a.a(obj));
       p0.onComplete();
    }
}
