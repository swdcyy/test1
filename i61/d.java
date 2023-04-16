package i61.d;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren;
import java.lang.Iterable;
import qk.m;
import i61.c;
import com.google.common.base.Optional;

public final class d implements o	// class@002837
{
    public final int b;

    public void d(int p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       d tb = this.b;
       boolean b = (p0 != null && m.s(p0.mButtons).r(new c(tb)).orNull() != null)? true: false;
       return b;
    }
}
