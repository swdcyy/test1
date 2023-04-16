package nj.n;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.gifshow.tuna.player.component.a;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import nj.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nj.g;
import nj.b;
import com.kwai.framework.player.core.b;

public final class n implements IMediaPlayer$OnPreparedListener	// class@00271a
{
    public final a b;

    public void n(a p0){
       this.b = p0;
    }
    public final void onPrepared(IMediaPlayer p0){
       boolean b;
       g a;
       n tb = this.b;
       Objects.requireNonNull(tb);
       a obj = PatchProxy.apply(null, tb, a.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = tb.a;
          if (obj != null) {
             a = obj.a;
             if (a != null) {
                b = a.isSelected();
             }
          }
          b = false;
       }
       if (b) {
          obj = tb.c;
          if (obj != null && obj.isPrepared()) {
             tb.c.start();
          }
       }
       return;
    }
}
