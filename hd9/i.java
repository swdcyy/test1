package hd9.i;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.n;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.video.player.KsMediaPlayer;

public final class i implements b$a	// class@002615
{
    public final b a;

    public void i(b p0){
       this.a = p0;
    }
    public final Object getData(){
       i ta = this.a;
       n on = ta.d.d(n.j);
       i oi = null;
       if (on.a == null || (on.e != null || on.g != null)) {
          if (ta.h1() == null) {
             ta = oi;
          }
          oi = ta;
       }
       return oi;
    }
}
