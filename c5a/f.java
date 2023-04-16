package c5a.f;
import erd.g;
import c5a.i;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.i;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;

public final class f implements g	// class@00054e
{
    public final i b;
    public final PostShowInfo c;
    public final BaseFeed d;
    public final boolean e;

    public void f(i p0,PostShowInfo p1,BaseFeed p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          i oi = new i(0, tc, td.getId(), te, true, null);
          RxBus.f.b(tb);
       }else {
          tb.R8();
       }
       return;
    }
}
