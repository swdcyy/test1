package d89.l;
import n3d.a;
import d89.q;
import cxd.c;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.network.exception.AntispamException;
import java.lang.Throwable;
import ajd.a;
import java.lang.String;
import ekd.j0;

public final class l implements a	// class@00148c
{
    public final q b;
    public final c c;

    public void l(q p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 != -1) {
          tc.onError(new AntispamException(p1));
       }else {
          tb.b.d(j0.f(p2, "android.intent.extra.RETURN_RESULT"));
          tc.onNext(p2);
          tc.onComplete();
       }
       return;
    }
}
