package ez0.q;
import gy2.b$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import mk1.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import androidx.fragment.app.Fragment;

public final class q implements b$a	// class@002256
{
    public final k a;
    public final b b;

    public void q(k p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void show(){
       q ta = this.a;
       q tb = this.b;
       Objects.requireNonNull(ta);
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "4")) {
       }else {
          tb.t = SystemClock.elapsedRealtime();
       }
       e uoe = ta.w.R().getChildFragmentManager().beginTransaction();
       uoe.w(R.id.gift_box_fragment_container, ta.u, "LiveAudienceGiftBoxFragment");
       uoe.m();
       return;
    }
}
