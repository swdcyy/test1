package dfc.d;
import erd.g;
import dfc.g;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import brd.y;
import ekd.k1;
import java.lang.Long;
import im8.f;
import java.lang.String;
import java.util.List;
import kp.y1;

public final class d implements g	// class@0021a1
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       tb.r.onNext(p0);
       tb.p.set(Long.valueOf(k1.i()));
       y1.g(p0.mPhotos, 0, String.valueOf(p0.mLlsid));
    }
}
