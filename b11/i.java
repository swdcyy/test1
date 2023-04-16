package b11.i;
import erd.g;
import b11.j;
import java.lang.Object;
import java.lang.Long;
import ok.x;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import android.util.SparseArray;
import b11.j$b;
import java.lang.CharSequence;

public final class i implements g	// class@0002fe
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       p0 = tb.c.get();
       int i = tb.d.get().intValue();
       TextView textView = tb.b.get();
       if (textView == null) {
          b.Z(LiveLogTag.WEALTH_GRADE, "[LiveGiftBoxWealthGradeTipLogic][runPreIncrementDelayTask]: tipTv is null");
       }else {
          textView.setText(tb.a.get(tb.b(p0)).a(i, p0));
       }
       return;
    }
}
