package h09.b$b;
import erd.g;
import h09.b$a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.ref.WeakReference;
import h09.b;
import com.yxcorp.gifshow.ad.AdMainProcess;
import nx8.j;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcess;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import tkd.b;
import tkd.d;
import h09.i;
import nx8.l;
import o35.b;

public final class b$b implements g	// class@00252b
{
    public final b$a b;

    public void b$b(b$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, str)) {
       }else {
          b$b tb = this.b;
          a.o(p0, "ret");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          b$a uoa = b$a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoa, str)) {
             b uob = tb.a.get();
             if (uob != null) {
                b uob1 = b.class;
                if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob, uob1, "2")) {
                   if (b) {
                      b = uob.d();
                      if (b != null) {
                         b = b.d();
                         if (b != null) {
                            b = b.getPhoto();
                            if (b != null) {
                               a.o(b, "mAdMainProcess?.mAdDataWrapper?.photo ?: return");
                               AdMainProcess uAdMainProce = uob.d();
                               FragmentActivity uFragmentAct = null;
                               Activity uActivity = (uAdMainProce != null)? uAdMainProce.c(): uFragmentAct;
                               if (uActivity instanceof FragmentActivity) {
                                  uFragmentAct = uActivity;
                               }
                               if (uFragmentAct != null) {
                                  d.a(0x4751263e).Lx(uFragmentAct, b, uob);
                               }
                            }
                         }
                      }
                   }else {
                      Object[] objArray = new Object[0];
                      b.g().d("AdMainProcess", "popar video plugin install fail", objArray);
                      uob.c();
                   }
                }
             }
          }
       }
       return;
    }
}
