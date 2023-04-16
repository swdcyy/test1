package bh2.b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.CharSequence;
import android.widget.TextView;

public class b extends CountDownTimer	// class@0003f1
{
    public final LiveFellowRedPacketFloatView a;

    public void b(LiveFellowRedPacketFloatView p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta.d != null) {
          ta.f();
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "1")) {
          return;
       }
       this.a.d.setText(String.valueOf(((p0 + 1000) / 1000)));
       return;
    }
}
