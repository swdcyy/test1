package in1.h;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import java.lang.Object;
import java.util.LinkedHashSet;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class h implements LivePlayerStateChangeListener	// class@002967
{
    public final Set b;

    public void h(){
       super();
       this.b = new LinkedHashSet();
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStateChange(p0);
       }
       return;
    }
}
