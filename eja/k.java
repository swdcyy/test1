package eja.k;
import erd.o;
import com.yxcorp.gifshow.follow.stagger.presenter.g;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import aja.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import sq4.c;

public final class k implements o	// class@0026d3
{
    public final g b;

    public void k(g p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b();
       uob.a(3);
       p0 = uob.b(tb.t).d(p0);
       p0.f(QCurrentUser.ME.getId());
       return p0.e().c();
    }
}
