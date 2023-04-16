package b94.c;
import erd.r;
import b94.m;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import java.util.Objects;
import java.lang.String;
import fq5.b;

public final class c implements r	// class@000329
{
    public final m b;

    public void c(m p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       LiveRoomSignalMessage$SCKwaishopLiveActivityPendant liveStreamRo = p0.liveStreamRoomId;
       boolean b = (liveStreamRo != null && (liveStreamRo.equals(tb.v.getLiveStreamId()) && p0.pendantType == 60))? true: false;
       return b;
    }
}
