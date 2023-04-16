package ffd.g;
import erd.o;
import ffd.c;
import java.lang.Object;
import njd.a;
import com.yxcorp.plugin.search.response.ZTPhotoListResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.ZTPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class g implements o	// class@000e1d
{
    public final c b;

    public void g(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       p0 = p0.a();
       if (!q.f(p0.getItems())) {
          p0 = p0.getItems().iterator();
          while (true) {
             if (p0.hasNext()) {
                ZTPhoto zTPhoto = p0.next();
                if (TextUtils.n(zTPhoto.mPhotoId, tb.d)) {
                   p0 = zTPhoto.mMediaManifest;
                   break ;
                }
             }
          }
          return p0;
       }
       p0 = tb.b;
       goto label_0037 ;
    }
}
