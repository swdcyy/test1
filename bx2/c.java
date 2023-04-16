package bx2.c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c	// class@000473
{

    public void c(){
       super();
    }
    public final void a(TheaterPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "player");
       p0.stop();
       p0.release();
       p0.q();
       return;
    }
}
