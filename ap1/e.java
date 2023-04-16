package ap1.e;
import vq5.b;
import ap1.h;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import d61.v;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import zo1.a;

public final class e implements b	// class@000271
{
    public final h a;

    public void e(h p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, h.class, "4")) {
       }else {
          int i = v.e(x0.a(p0, "giftid"), -1);
          String str = x0.b(p0, "source", "UNKNOWN");
          String str1 = x0.b(p0, "recipient", "");
          if (i < 0) {
             b.Z(LiveLogTag.Live_MAGIC_BOX, "can\'t start magic box router,giftId invalid");
          }else {
             ta.u.Eb(i, null, false, str, str1);
          }
       }
       return;
    }
}
