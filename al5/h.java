package al5.h;
import erd.g;
import al5.i;
import java.lang.Object;
import android.util.Pair;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;

public final class h implements g	// class@0000d3
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       if (tb.A == p0.first.intValue()) {
       }else {
          tb.y.setCurrentItem(p0.first.intValue(), p0.second.booleanValue());
       }
       return;
    }
}
