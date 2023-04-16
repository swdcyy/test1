package l19.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import l19.d;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import a09.b;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import l19.b;
import erd.g;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import l19.c;

public final class a implements IMediaPlayer$OnInfoListener	// class@002c71
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       boolean b;
       a tb = this.b;
       if (tb.C == null) {
       }else if(p1 != 0x2775 || PatchProxy.applyVoid(null, tb, d.class, "4")){
          d u = tb.u;
          if (u != null) {
             b uob = u.get();
             p2 = 24;
             if (uob == null) {
                o.z().e(p2, tb.r.mEntity).d(b.b).a();
             }else {
                b = true;
                if (uob.b()) {
                   tb.R8(b, false, uob);
                   a.d().k(new PlayEvent(tb.r, PlayEvent$Status.PAUSE, 14));
                }else {
                   tb.R8(false, b, uob);
                   o.z().e(p2, tb.r.mEntity).d(c.b).a();
                }
             }
          }
       }
       return false;
    }
}
