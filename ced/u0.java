package ced.u0;
import erd.o;
import com.yxcorp.plugin.search.result.hashtag.presenters.u;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Integer;

public final class u0 implements o	// class@000581
{
    public final u b;

    public void u0(u p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Integer.valueOf(this.b.p.getLikeCount());
    }
}
