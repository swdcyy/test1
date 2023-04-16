package f5b.g;
import erd.g;
import f5b.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import q87.c;
import v36.a;

public final class g implements g	// class@0028aa
{
    public final c b;

    public void g(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       g og = g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, og, "1")) {
          Object[] objArray = new Object[0];
          b.D().s("MagicEmojiTab", "MagicEmojiVisiblePublisher:"+b+", tab:"+this.b.f(), objArray);
          if (!b) {
             c z = this.b.z;
             if (z != null) {
                z.c();
             }
          }
          this.b.n(b);
       }
       return;
    }
}
