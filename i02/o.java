package i02.o;
import erd.g;
import i02.r;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class o implements g	// class@0027f6
{
    public final r b;
    public final String c;
    public final LiveIncreaseFansNoticeInfo d;

    public void o(r p0,String p1,LiveIncreaseFansNoticeInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       tb.So(this.c, p0.booleanValue(), this.d);
    }
}
