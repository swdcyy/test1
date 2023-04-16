package ba2.j0;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfoClose;
import android.view.View;
import android.widget.ViewFlipper;
import lf3.f;

public final class j0 implements g	// class@000397
{
    public final h b;

    public void j0(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       j0 tb = this.b;
       tb.Z = null;
       h r = tb.r;
       if (r != null) {
          h x = tb.x;
          if (x != null) {
             r.removeView(x);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
