package lf1.a;
import brd.w;
import com.kuaishou.live.common.core.component.comments.mock.b;
import java.lang.Object;
import brd.y;
import java.util.Objects;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements w	// class@002ee2
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void subscribe(y p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b.P(b.x, "request timeout");
       p0.onNext(tb.p);
       p0.onComplete();
    }
}
