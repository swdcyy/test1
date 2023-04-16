package m3a.p;
import m3a.o;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import m3a.s;
import msd.r;

public final class p implements o	// class@002f1c
{
    public final SmallWindowFragment a;

    public void p(SmallWindowFragment p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0,long p1,boolean p2,Bitmap p3){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), p3, this, p.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       p ta = this.a;
       Objects.requireNonNull(ta);
       SmallWindowFragment smallWindowF = PatchProxy.apply(null, ta, SmallWindowFragment.class, "1");
       if (smallWindowF != PatchProxyResult.class) {
       }else {
          smallWindowF = ta.j;
          if (smallWindowF == null) {
             a.S("mSmallWindowParam");
          }
       }
       smallWindowF.d.invoke(p0, Long.valueOf(p1), Boolean.valueOf(p2), p3);
       return;
    }
}
