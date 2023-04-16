package bk2.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.statistics.b;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import az5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import az5.i;

public final class b implements Runnable	// class@0003fc
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       j oj = b.a(0x5e0c5014);
       String str = PatchProxy.apply(null, tb, b.class, "4");
       if (str != PatchProxyResult.class) {
       }else {
          a0 c = tb.K.c;
          str = (c == null)? "": c.getLiveStreamId();
       }
       oj.h(str);
       return;
    }
}
