package i51.o;
import hf3.a;
import i51.g;
import java.lang.Object;
import i51.l;
import i51.k;
import i51.o$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import i51.j;
import i51.i;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import i51.p;
import com.kuaishou.android.live.model.Race;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.race.LiveRaceConfig;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import i51.n;
import erd.o;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import i51.m;
import com.gifshow.tuna.player.poi.e;

public class o	// class@002831
{
    public final a a;
    public final g b;
    public long c;
    public boolean d;
    public long e;
    public final k f;
    public final g g;
    public final b h;
    public final boolean i;

    public void o(a p0,g p1,boolean p2){
       super();
       this.d = true;
       l ol = new l(this);
       this.f = ol;
       k ok = new k(this);
       this.g = ok;
       o$a uoa = new o$a(this);
       this.h = uoa;
       this.a = p0;
       this.b = p1;
       this.i = p2;
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
       }else {
          p0.B0(uoa);
          p0.u0(300, LiveStreamMessages$SCEnterRoomAck.class, ol);
          p0.u0(310, LiveStreamMessages$SCFeedPush.class, ok);
       }
       return;
    }
    public static void b(String p0,String p1){
       i.b().b(p0, "gzip", p1).subscribe(Functions.d(), Functions.d());
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.a.F0(this.h);
       this.a.o(300, this.f);
       this.a.o(310, this.g);
       p.c(this.b);
       return;
    }
    public void c(String p0,Race p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "5")) {
          return;
       }
       if (this.i != null) {
          b.Z(LiveLogTag.LIVE_SOCKET, "forbidden race report");
          return;
       }else {
          LiveRaceConfig liveRaceConf = LiveRaceConfig.class;
          String str = a.a.getString("raceConfig", "{}");
          liveRaceConf = (str == null || str == "")? null: b.a(str, liveRaceConf);
          if (liveRaceConf != null && liveRaceConf.mDisableRaceLog == null) {
             t.just(new Object()).flatMap(new n(this, p1, p2)).subscribeOn(d.c).observeOn(a.c()).subscribe(new m(p0), e.b);
          }else {
             b.Z(LiveLogTag.LIVE_SOCKET, "onRaceComplete");
          }
          return;
       }
    }
}
