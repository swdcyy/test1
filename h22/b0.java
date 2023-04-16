package h22.b0;
import n22.b$b;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.List;
import com.kuaishou.android.live.log.b;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import p91.m;

public final class b0 implements b$b	// class@002bec
{
    public final LiveActivityRedPacketPresenter a;

    public void b0(LiveActivityRedPacketPresenter p0){
       this.a = p0;
    }
    public final void a(String p0,boolean p1){
       b0 ta = this.a;
       if (!ta.t.containsKey(p0)) {
          b.S(LiveActivityRedPacketPresenter.I, "effect finish mUnShowRedPacketInfoMap not contains", "redPacketId", p0);
       }else {
          b uob = ta.t.get(p0);
          p1.autoShowTime = (p1)? ta.p.s(): false;
          ta.P8(p0, uob);
       }
       return;
    }
}
