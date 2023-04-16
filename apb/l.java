package apb.l;
import com.yxcorp.gifshow.music.util.a;
import apb.m;
import com.yxcorp.gifshow.music.util.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.k;
import q87.c;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import android.content.Intent;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.music.cloudmusic.MusicActivity;
import android.app.Activity;

public class l extends a	// class@0002ae
{
    public final m S;

    public void l(m p0,a$a p1){
       this.S = p0;
       super(p1);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       super.h();
       l tS = this.S;
       if (tS.M == null) {
          Object[] objArray = new Object[0];
          k.D().w("PlayHistoryPV2", "clip cancel after unbind", objArray);
          return;
       }else {
          tS.q.start();
          return;
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       super.k();
       this.S.q.pause();
       return;
    }
    public void x(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       if (this.S.M == null) {
          Object[] objArray = new Object[0];
          k.D().w("PlayHistoryPV2", "clip finish after unbind", objArray);
          return;
       }else {
          d tp = this.p;
          if (tp instanceof MusicActivity) {
             tp.u3();
             this.p.setResult(-1, p0);
             this.p.finish();
          }else {
             super.x(p0);
          }
          return;
       }
    }
}
