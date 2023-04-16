package com.kuaishou.live.core.show.redpacket.newpendant.b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.Long;
import z12.x;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import androidx.appcompat.widget.AppCompatTextView;

public class b extends CountDownTimer	// class@000eec
{
    public final LiveRedPacketNewPendantViewHelper a;

    public void b(LiveRedPacketNewPendantViewHelper p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.h(LiveRedPacketNewPendantViewHelper$Mode.Opening);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "1")) {
          return;
       }
       this.a.d.setText(x.g(p0));
       this.a.d.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070980));
       return;
    }
}
