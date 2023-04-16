package dlc.b;
import erd.g;
import dlc.f;
import java.lang.Object;
import xkc.b;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class b implements g	// class@002239
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (tb.V8() && (tb.u != null && (tb.s.get() != null && !TextUtils.equals(tb.u.mId, tb.s.get().mId)))) {
          tb.X8(tb.s.get());
       }
    label_0035 :
       tb.u = tb.s.get();
       tb.v = p0.a;
       return;
    }
}
