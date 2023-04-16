package hd2.r$c;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import hd2.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class r$c implements LivePlayerTypeChangeListener	// class@002d73
{
    public final r b;

    public void r$c(r p0){
       this.b = p0;
       super();
    }
    public final void onLiveTypeChange(int p0){
       r$c uoc = r$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       b.Z(this.b.a, "listener onLiveStreamTypeChange");
       this.b.c(false, p0);
       return;
    }
}
