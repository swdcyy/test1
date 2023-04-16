package fh2.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import java.lang.Object;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public final class a implements Runnable	// class@00295b
{
    public final LiveNormalRedPacketFloatTipsView b;

    public void a(LiveNormalRedPacketFloatTipsView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       tb.i.stop();
       tb.h.setVisibility(8);
       tb.j = false;
    }
}
