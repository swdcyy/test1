package d4c.l;
import erd.r;
import d4c.v;
import java.lang.Object;
import java.lang.Long;
import npb.c;
import kob.r;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class l implements r	// class@0020d5
{
    public final v b;

    public void l(v p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       l tb = this.b;
       boolean b = (tb.D.getCurrent() != null && tb.F != null)? TextUtils.n(tb.D.getCurrent().c().getUniqueCode(), tb.F.getUniqueCode()): false;
       return b;
    }
}
