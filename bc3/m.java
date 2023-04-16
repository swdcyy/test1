package bc3.m;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.luckystar.d;
import java.lang.Object;
import com.kuaishou.live.lite.luckystar.b$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.k;
import android.content.Context;
import android.view.View;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.tempplay.d;
import com.kuaishou.live.lite.luckystar.LiveLiteLuckyStarPendantView;
import com.kwai.robust.PatchProxyResult;
import qd3.r$a;
import bc3.n;
import qd3.r;
import com.kuaishou.live.lite.luckystar.c;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public final class m implements Observer	// class@00037b
{
    public final d b;

    public void m(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod, "3")) {
       }else if(p0 == null){
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uod, "6")) {
             if (tb.g == null) {
                tb.g = b.e(tb.a.get(), 0x7f0d099a);
             }
             tb.g.findViewById(R.id.lite_temp_play_profit_animation_image).U(p0.c);
          }
          b$a a = p0.a;
          if (a == 1) {
             if (tb.i == null && !PatchProxy.applyVoid(null, tb, uod, "4")) {
                d.d(tb.e.get().a(), "PROFIT_INFO", "LUCY_ASST", null);
                LiveLiteLuckyStarPendantView liveLiteLuck = new LiveLiteLuckyStarPendantView(tb.a.get());
                tb.h = liveLiteLuck;
                n on = PatchProxy.applyOneRefs(liveLiteLuck, tb, uod, "7");
                if (on != PatchProxyResult.class) {
                }else {
                   on = new n(tb, liveLiteLuck);
                }
                tb.i = on;
                tb.c.get().c(tb.i);
             }
             tb.h.setIconUrl(p0.b);
             tb.h.setCountdownText(p0.d);
             tb.h.setOnClickListener(new c(tb, p0));
          }else if(a != null || tb.i == null){
             tb.c.get().b(tb.i);
             tb.i = null;
             tb.h = null;
          }
       }
       return;
    }
}
