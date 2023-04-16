package lf1.c;
import erd.g;
import com.kuaishou.live.common.core.component.comments.mock.b;
import java.lang.Object;
import crd.b;
import java.util.Objects;
import android.os.SystemClock;

public final class c implements g	// class@002ee4
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.r = SystemClock.elapsedRealtime();
    }
}
