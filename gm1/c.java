package gm1.c;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import v51.a;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import gm1.b;
import com.kwai.robust.PatchProxy;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;

public class c extends Model	// class@00251c
{
    public final a i;
    public final g j;

    public void c(a p0){
       Object obj = null;
       super(c.class.getName(), obj, false, false);
       b uob = new b(this);
       this.j = uob;
       this.i = p0;
       if (PatchProxy.applyVoid(obj, this, c.class, "3")) {
       }else {
          p0.u().u0(310, LiveStreamMessages$SCFeedPush.class, uob);
       }
       return;
    }
}
