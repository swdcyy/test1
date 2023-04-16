package gaa.h0$a;
import voc.i;
import gaa.h0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.util.Objects;
import gaa.v;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Integer;
import cq.a;
import java.lang.StringBuilder;
import q87.c;

public class h0$a extends i	// class@002432
{
    public final h0 b;

    public void h0$a(h0 p0){
       this.b = p0;
       super();
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0$a.class, "2")) {
          return;
       }
       h0 r = this.b.r;
       if (r != null) {
          r.dismiss();
          this.b.r = objArray;
       }
       h0$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, h0.class, "11")) {
          k1.o(new v(tb));
       }
       this.b.f();
       return;
    }
    public void d(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "3")) {
          return;
       }
       PostUtils.D("EditSourcePictureDownloadDispatcher", "compoundTask onFinalFailed throwable = ", p0);
       this.b.e();
       return;
    }
    public void e(int p0){
       h0$a uoa = h0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePictureDownloadDispatcher", "compoundTask onFinalProgress progress = "+p0, objArray);
       h0 r = this.b.r;
       if (r != null) {
          r.Fh(p0, 100, true);
       }
       return;
    }
}
