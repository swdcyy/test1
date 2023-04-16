package bm0.g;
import erd.g;
import bm0.f$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class g implements g	// class@0003c3
{
    public final f$b b;
    public final LiveAudienceParam c;

    public void g(f$b p0,LiveAudienceParam p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && d.a(-1638991736).SW(tc.mPhoto, Boolean.FALSE)) {
          tb.c(tc);
       }
       return;
    }
}
