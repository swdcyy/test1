package ab1.a;
import erd.g;
import ab1.b;
import java.lang.Object;
import java.lang.Long;
import android.widget.ViewFlipper;
import java.lang.Integer;
import java.util.Map;

public final class a implements g	// class@000054
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       if (tb.s.getChildCount() > 1) {
          tb.s.showNext();
          tb.s.startFlipping();
          tb.v = 3;
       }else if(tb.t.containsKey(Integer.valueOf(1))){
          tb.v = 4;
       }else {
          tb.x = true;
          tb.v = 1;
       }
       return;
    }
}
