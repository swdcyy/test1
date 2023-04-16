package bh2.a;
import ekd.f$i;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;

public class a extends f$i	// class@0003f0
{
    public final LiveFellowRedPacketFloatView b;

    public void a(LiveFellowRedPacketFloatView p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.f.setVisibility(8);
       this.b.f.setText("");
       return;
    }
}
