package gf1.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import gf1.q;

public final class i implements Runnable	// class@0024c2
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.LIVE_QUICK_COMMENT, "LiveQuickCommentMessagePool.resetShowing");
       tb.l.b();
       tb.k();
    }
}
