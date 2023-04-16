package i51.b;
import erd.g;
import i51.d;
import java.lang.Object;
import com.kuaishou.live.core.show.race.HorseRaceInfoResponse;
import java.util.Objects;
import com.kuaishou.android.live.model.Race;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import i51.f;
import java.util.Collection;
import hf3.a;

public final class b implements g	// class@002821
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          HorseRaceInfoResponse mRace = p0.mRace;
          if (mRace != null && !mRace.mRounds.isEmpty()) {
             b.d0(LiveLogTag.LIVE_SOCKET, "getNewRaceInfo success", "new attach", p0.mAttach, "new race", p0.mRace);
             tb.b.h(p0.mAttach);
             tb.b.f().mRounds.clear();
             tb.b.f().clearState();
             tb.b.f().mRounds.addAll(p0.mRace.mRounds);
             tb.a.y0();
          }
       }
       return;
    }
}
