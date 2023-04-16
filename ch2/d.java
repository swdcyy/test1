package ch2.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.krn.f;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.krn.f$c;

public final class d implements View$OnClickListener	// class@000535
{
    public final f b;
    public final String c;

    public void d(f p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       if (tb.h != null) {
          b.P(f.j, "onKrnRedPacketPendantClick£¬ redPacketId = "+tc);
          tb.h.a(tb.b);
       }
       return;
    }
}
