package b0c.c;
import erd.g;
import com.tkruntime.v8.JsValueRef;
import com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import com.tkruntime.v8.V8Function;
import java.lang.Boolean;
import com.tkruntime.v8.V8Object;

public final class c implements g	// class@000380
{
    public final JsValueRef b;
    public final BubbleTitlesLayout c;

    public void c(JsValueRef p0,BubbleTitlesLayout p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Object[] objArray;
       c tb = this.b;
       c tc = this.c;
       if (p0.length > 0 && p0[0] != null) {
          if (tb != null && tb.get() != null) {
             tc.setTitle(p0[0]);
             objArray = new Object[]{Boolean.TRUE};
             tb.get().call(null, objArray);
          }
       }else if(tb != null && tb.get() != null){
          objArray = new Object[]{Boolean.FALSE};
          tb.get().call(null, objArray);
       }
       return;
    }
}
