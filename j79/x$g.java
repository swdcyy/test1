package j79.x$g;
import androidx.lifecycle.Observer;
import j79.x;
import java.lang.Object;
import ha9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import ha9.a;
import j79.y;
import java.lang.Enum;
import java.util.List;
import com.yxcorp.gifshow.album.preview.d;

public final class x$g implements Observer	// class@00279e
{
    public final x b;

    public void x$g(x p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$g.class, "1")) {
       }else {
          UpdateType updateType = p0.c();
          if (updateType != null) {
             int i = y.a[updateType.ordinal()];
             if (i != 1) {
                if (i == 2 && p0.g().isEmpty()) {
                   this.b.e.M(true);
                }
             }else if(p0.g().size() == 1){
                p0 = 1;
             }else {
                p0 = null;
             }
             if (p0) {
                this.b.e.M(true);
             }
          }
       }
       return;
    }
}
