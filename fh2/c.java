package fh2.c;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.CharSequence;
import android.widget.TextView;

public class c extends CountDownTimer	// class@00295d
{
    public final LiveNormalRedPacketFloatTipsView a;

    public void c(LiveNormalRedPacketFloatTipsView p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c ta = this.a;
       if (ta.f != null) {
          ta.k();
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       LiveNormalRedPacketFloatTipsView e = ta.e;
       if (e != null) {
          LiveNormalRedPacketFloatTipsView t = ta.t;
          if (p0 - t <= 0 || (p0 - t) - 3000 > 0) {
             ta.t = p0;
             e.setText(String.valueOf(((p0 + 1000) / 1000)));
          }
       }
       return;
    }
}
