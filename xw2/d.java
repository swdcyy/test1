package xw2.d;
import java.lang.Object;
import wa1.i;
import msd.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;

public abstract class d	// class@004be0
{
    public final i b;

    public void d(){
       super();
       this.b = new i();
    }
    public final void a(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "observer");
       this.b.add(p0);
       return;
    }
    public final void b(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "command");
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(p0, p1);
       }
       return;
    }
    public final void c(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.b.remove(p0);
       return;
    }
    public abstract void d();
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.clear();
       return;
    }
}
