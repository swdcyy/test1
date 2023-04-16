package ej2.f;
import erd.g;
import ej2.g;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import ej2.v;

public final class f implements g	// class@00272a
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.SCORE_RANK, "recevie audience urls from net");
       if (p0 != null) {
          tb.q = p0.mHeadWidget;
          tb.r = p0.mHeadWidgetAnimationUrls;
          tb.R8();
       }
       return;
    }
}
