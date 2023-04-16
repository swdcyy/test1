package n21.d;
import n21.f;
import android.database.Observable;
import hf3.a;
import n21.a;
import n21.b;
import n21.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveActivityTopRightPendant$SCLiveActivityTopRightPendant;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import java.util.ArrayList;
import n21.f$a;
import ok.h;
import n21.e;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class d extends Observable implements f	// class@003285
{
    public final a a;
    public final h b;
    public final g c;
    public final g d;
    public static final int e;

    public void d(a p0){
       super();
       this.b = a.b;
       b uob = new b(this);
       this.c = uob;
       c uoc = new c(this);
       this.d = uoc;
       this.a = p0;
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
       }else {
          p0.u0(867, LiveActivityTopRightPendant$SCLiveActivityTopRightPendant.class, uob);
          p0.u0(868, LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose.class, uoc);
       }
       return;
    }
    public static void c(d p0,LiveActivityTopRightPendant$SCLiveActivityTopRightPendantClose p1){
       Objects.requireNonNull(p0);
       if (p1 != null && !TextUtils.x(p1.pendantId)) {
          Iterator iterator = p0.mObservers.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p1.pendantId);
          }
       }
       return;
    }
    public static void d(d p0,LiveActivityTopRightPendant$SCLiveActivityTopRightPendant p1){
       e uoe = p0.b.apply(p1);
       if (uoe == null) {
          b.P(LiveLogTag.LIVE_TOP_PENDANT.appendTag("AudienceCommonActivityPendant"), "scLiveActivityTopRightPendant is not valid");
       }else {
          Iterator iterator = p0.mObservers.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(uoe);
          }
       }
       return;
    }
    public void a(f$a p0){
       this.registerObserver(p0);
    }
    public void b(f$a p0){
       this.unregisterObserver(p0);
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          this.a.o(867, this.c);
          this.a.o(868, this.d);
       }
       return;
    }
}
