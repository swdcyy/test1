package g5b.g;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import t4b.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;
import android.view.View;

public final class g implements g	// class@002a81
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "36")) {
       }else if(tb.D == null){
          if (p0.a()) {
             tb.Q.set(1);
          }else {
             tb.Q.clear(1);
          }
          p0 = tb.D;
          int i = (tb.Q.isEmpty())? 0: 4;
          p0.setVisibility(i);
       }
       return;
    }
}
