package fh2.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;

public class b extends m	// class@00295c
{
    public final LiveNormalRedPacketFloatTipsView c;

    public void b(LiveNormalRedPacketFloatTipsView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       LiveNormalRedPacketFloatTipsView r = tc.r;
       if (r != null) {
          r.onClick(tc);
       }
       return;
    }
}
