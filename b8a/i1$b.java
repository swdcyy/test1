package b8a.i1$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import b8a.i1;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class i1$b implements IMediaPlayer$OnInfoListener	// class@0003b0
{
    public final i1 b;

    public void i1$b(i1 p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(i1$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i1$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          i1$b tb = this.b;
          tb.u = tb.u + 1;
          i1 q = tb.q;
          if (q == null) {
             a.S("mDetailPlayedCount");
          }
          q.onNext(Integer.valueOf(this.b.u));
       }else if(p1 == 0x2713){
          this.b.R8();
       }
       return false;
    }
}
