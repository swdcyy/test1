package nfd.c2;
import erd.g;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import java.lang.Object;
import crd.b;
import java.util.Objects;
import android.os.SystemClock;

public final class c2 implements g	// class@001d96
{
    public final SearchLiveDanmakuHelper b;

    public void c2(SearchLiveDanmakuHelper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c2 tb = this.b;
       Objects.requireNonNull(tb);
       tb.l = SystemClock.elapsedRealtime();
    }
}
