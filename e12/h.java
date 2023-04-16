package e12.h;
import io.reactivex.g;
import e12.l;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import e12.m;
import lm9.a$b;

public final class h implements g	// class@0025fc
{
    public final l b;
    public final LiveSlideResponse c;

    public void h(l p0,LiveSlideResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       d.a(-1638991736).RI(tb.x(tc), new m(tb, p0, tc), true);
    }
}
