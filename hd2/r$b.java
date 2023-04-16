package hd2.r$b;
import java.lang.Runnable;
import hd2.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;

public final class r$b implements Runnable	// class@002d72
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, r$b.class, "1")) {
          return;
       }
       b.Z(this.b.a, "sendMessage onLiveTypeChange sideBySide stream");
       r$b tb = this.b;
       tb.f = true;
       tb.h.onLiveTypeChange(2);
       return;
    }
}
