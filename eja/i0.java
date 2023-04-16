package eja.i0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.r;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.stagger.data.i;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public final class i0 implements g	// class@0026cb
{
    public final r b;

    public void i0(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       if (tb.r.ai() != null) {
          i oi = tb.r.ai();
          int i = p0.intValue();
          Objects.requireNonNull(oi);
          i oi1 = i.class;
          if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), oi, oi1, "3")) {
             c.j(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowPageList"), "setRefreshState", "state", String.valueOf(i));
             oi.H = i;
          }
       }
       return;
    }
}
