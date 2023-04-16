package gaa.n;
import voc.i;
import gaa.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import q87.c;
import java.util.Objects;
import gaa.k;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import java.lang.StringBuilder;
import w46.b;
import gaa.m;
import java.lang.Integer;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class n extends i	// class@002441
{
    public final s b;

    public void n(s p0){
       this.b = p0;
       super();
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("EditMusicDownloadDispatcher", "compoundTask onFinalComplete", objArray1);
       this.b.b();
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, s.class, "10")) {
          Object[] objArray2 = new Object[i];
          a.D().w("EditMusicDownloadDispatcher", "realGo", objArray2);
          k1.o(new k(tb));
       }
       return;
    }
    public void d(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("EditMusicDownloadDispatcher", "compoundTask onFinalFailed throwable = "+p0, objArray);
       this.b.b();
       k1.o(m.b);
       return;
    }
    public void e(int p0){
       s n;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditMusicDownloadDispatcher", "compoundTask onFinalProgress progress = "+p0, objArray);
       n = this.b.n;
       if (n != null) {
          n.Fh(p0, 100, true);
       }
       return;
    }
}
