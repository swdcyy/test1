package bf1.d;
import android.view.View$OnClickListener;
import bf1.e;
import df1.f;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import java.lang.Object;
import android.view.View;
import df1.c;
import bf1.j;
import s51.c;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bf1.c;

public final class d implements View$OnClickListener	// class@000372
{
    public final e b;
    public final f c;
    public final HighFrequencyActionGuide d;

    public void d(e p0,f p1,HighFrequencyActionGuide p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       tb.o(tc);
       tb.l().r4(this.d.actionUrl, tb.k());
       b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onMessageRemoved#", "reason", "ActionButtonClick", "message", tc.toString());
       tb.p(tc);
    }
}
