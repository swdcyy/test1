package lf1.e;
import erd.g;
import com.kuaishou.live.common.core.component.comments.mock.b;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@002ee6
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.p = p0;
       b.S(b.x, "request subscribe", "state", p0);
    }
}
