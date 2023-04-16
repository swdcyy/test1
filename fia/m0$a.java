package fia.m0$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import fia.m0;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fia.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import android.os.Handler;
import fia.m0$a$a;
import java.lang.Runnable;

public final class m0$a implements IMediaPlayer$OnInfoListener	// class@00291e
{
    public final m0 b;

    public void m0$a(m0 p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(m0$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, m0$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (this.b.a9()) {
          User user = r1.T1(this.b.b9().mEntity);
          if (user != null && (user.isFollowingOrFollowRequesting() == true && p1 == 0x2775)) {
             if (!this.b.o9()) {
                return false;
             }else {
                this.b.c9().postDelayed(new m0$a$a(this), 100);
             }
          }
       }
       return false;
    }
}
