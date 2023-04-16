package hn1.e0$f;
import erd.c;
import hn1.e0;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import hn1.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hn1.d0;
import kotlin.jvm.internal.a;
import hn1.z$b;
import hn1.d0$c;
import im8.f;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import hn1.z$c;
import hn1.d0$d;
import hn1.z$a;
import hn1.d0$a;
import kotlin.NoWhenBranchMatchedException;

public final class e0$f implements c	// class@002724
{
    public final e0 a;

    public void e0$f(e0 p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       d0$d obj;
       d0$c uoc = PatchProxy.applyTwoRefs(p0, p1, this, e0$f.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "qPhotoViewData");
          a.p(p1, "playerInfo");
          if (p1 instanceof z$b) {
             p0 = p0.mPhotoFeedView;
             a.o(p0, "qPhotoViewData.mPhotoFeedView");
             obj = this.a.b.get();
             a.o(obj, "position.get\(\)");
             uoc = new d0$c(p0, obj.longValue());
          }else if(p1 instanceof z$c){
             p0 = new d0$d(this.a.b);
          }else if(p1 instanceof z$a){
             p0 = new d0$a(p1.a());
          }else {
             throw new NoWhenBranchMatchedException();
          }
          obj = p0;
       }
       return uoc;
    }
}
