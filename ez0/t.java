package ez0.t;
import oq5.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import android.content.res.Configuration;
import rkd.b;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class t implements c	// class@002259
{
    public final k b;

    public void t(k p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       k s = this.b.S;
       long l = (b.g())? 0: 200;
       f.j("hideGiftBox", s, l);
       return;
    }
}
