package o3a.c$c$a;
import java.lang.Runnable;
import o3a.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import o3a.c;
import android.widget.ImageView;
import android.graphics.Bitmap;

public final class c$c$a implements Runnable	// class@003279
{
    public final c$c b;

    public void c$c$a(c$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$c$a.class, "1")) {
          return;
       }
       PlayerKitContentFrame playerKitCon = this.b.b.R8();
       if (playerKitCon != null) {
          ImageView cover = playerKitCon.getCover();
          if (cover != null) {
             cover.setImageBitmap(null);
          }
       }
       return;
    }
}
