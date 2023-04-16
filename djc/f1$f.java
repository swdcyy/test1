package djc.f1$f;
import android.view.View$OnClickListener;
import djc.f1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import djc.g1;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import djc.n1;
import kotlin.Result;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import android.widget.ImageView;

public final class f1$f implements View$OnClickListener	// class@0021ef
{
    public final f1 b;

    public void f1$f(f1 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       IWaynePlayer player;
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$f.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.b.l.K0().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof f1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             n1 value = iterator.next().getValue();
             if (value != null) {
                value.f();
                Result.constructor-impl(l1.a);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder");
             }
          }else {
             this.b.e();
             a uoa = this.b.b().getPlayerKitContext().e(a.class);
             if (uoa != null) {
                player = uoa.getPlayer();
                if (player != null) {
                   player.play();
                   break ;
                }
             }
             break ;
          }
       }
       this.b.i.setVisibility(4);
       this.b.j.setVisibility(4);
       this.b.c().setVisibility(4);
       this.b.a().setVisibility(4);
       player.k = false;
       return;
    }
}
