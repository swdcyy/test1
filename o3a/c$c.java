package o3a.c$c;
import mx6.c;
import o3a.c;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import mx6.b;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import java.lang.StringBuilder;
import m3a.t;
import com.yxcorp.gifshow.entity.QPhoto;
import m3a.r;
import q87.c;
import o3a.d;
import java.lang.Enum;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.widget.ImageView;
import o3a.c$c$a;
import java.lang.Runnable;
import java.lang.Integer;

public final class c$c implements c	// class@00327a
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void onInfo(IMediaPlayer p0,int p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void r0(PlayerState p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       a.p(p0, "state");
       b.c(this, p0);
       o oo = o.C();
       StringBuilder str = "onPlayStateChanged: state "+p0+", ";
       QPhoto qPhoto = c.P8(this.b).a();
       String str1 = (qPhoto != null)? r.a(qPhoto): null;
       Object[] objArray = new Object[0];
       oo.w("SmallWindowPlayPresenter", str+str1, objArray);
       int i = d.a[p0.ordinal()];
       b = true;
       if (i != b) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                c.P8(this.b).d();
             }
          }else {
             PlayerKitContentFrame playerKitCon = this.b.R8();
             if (playerKitCon != null) {
                ImageView cover = playerKitCon.getCover();
                if (cover != null) {
                   cover.postDelayed(new c$c$a(this), 2000);
                }
             }
             this.b.X8(b);
          }
       }else {
          QPhoto qPhoto1 = c.P8(this.b).b();
          if (qPhoto1 == null) {
             qPhoto1 = c.P8(this.b).a();
          }
          c.W8(this.b, qPhoto1, 0, null, 6, null);
       }
       return;
    }
    public void w(boolean p0){
       b.b(this, p0);
    }
}
