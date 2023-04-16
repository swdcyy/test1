package hd2.r$e;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import hd2.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.util.SeiExtraData;
import java.util.Objects;
import crd.b;
import lnc.b9;
import brd.t;
import hd2.s;
import erd.o;
import t45.d;
import brd.z;
import hd2.t;
import erd.g;

public final class r$e implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@002d75
{
    public final r a;

    public void r$e(r p0){
       this.a = p0;
       super();
    }
    public final void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(r$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, r$e.class, "1")) {
          return;
       }
       r$e ta = this.a;
       b.c0(ta.a, "onSeiInfo", "hasHandled", Boolean.valueOf(ta.f));
       ta = this.a;
       if (ta.f == null && ta.a(ta.g.getPkLiveStreamType())) {
          SeiExtraData pkSeiCache = this.a.g.getPkSeiCache();
          if (this.a.b(pkSeiCache)) {
             b.Z(this.a.a, "onSeiInfo tryStopNoticeSideBySideTask");
             r$e ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(pkSeiCache, ta1, r.class, "5") && pkSeiCache != null) {
                b.Z(ta1.a, "tryStopNoticeSideBySideTask");
                b9.a(ta1.e);
                ta1.e = t.just(pkSeiCache).map(new s(ta1)).observeOn(d.a).subscribe(new t(ta1));
             }
          }
       }
       return;
    }
}
