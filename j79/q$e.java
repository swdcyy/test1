package j79.q$e;
import androidx.lifecycle.Observer;
import j79.q;
import java.lang.Object;
import ha9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import ha9.a;
import j79.r;
import java.lang.Enum;
import java.util.List;
import j79.l0;
import com.yxcorp.gifshow.album.preview.d;
import w69.k;

public final class q$e implements Observer	// class@00278e
{
    public final q b;

    public void q$e(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$e.class, "1")) {
       }else {
          UpdateType updateType = p0.c();
          if (updateType != null) {
             int i = r.a[updateType.ordinal()];
             int i1 = 1;
             if (i != i1) {
                if (i == 2 && p0.g().isEmpty()) {
                   p0 = this.b;
                   p0.e.M(p0.l.J0());
                }
             }else if(p0.g().size() == i1){
                p0 = 1;
             }else {
                p0 = null;
             }
             if (p0) {
                p0 = this.b;
                p0.e.M(p0.l.J0());
             }
             if (this.b.l.r0().o()) {
                p0 = this.b;
                q i2 = p0.i;
                if (i2 != null) {
                   i = i2 ^ i1;
                   p0.i(i);
                   this.b.h(i);
                }
             }
          }
       }
       return;
    }
}
