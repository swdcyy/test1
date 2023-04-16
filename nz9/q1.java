package nz9.q1;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import nz9.u1;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nz9.u1$c;
import android.view.View;

public final class q1 implements IMediaPlayer$OnInfoListener	// class@00323f
{
    public final u1 b;

    public void q1(u1 p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       q1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775 && (PatchProxy.applyVoid(null, tb, u1.class, "2") || (!tb.h.c() && tb.h.b() != null))) {
          tb.e(tb.h.b());
       }
    label_002f :
       return false;
    }
}
