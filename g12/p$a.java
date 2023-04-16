package g12.p$a;
import c51.b;
import g12.p;
import java.lang.Object;
import c51.a;
import java.lang.Throwable;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import d61.a0;
import java.util.Iterator;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;

public class p$a implements b	// class@002a35
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       a.d(this, p0);
    }
    public void X(boolean p0,Throwable p1){
       a.c(this, p0, p1);
    }
    public void c0(){
       a.a(this);
    }
    public void w(boolean p0,List p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       int i = a0.b(this.b.r.mLiveSourceType);
       if (i) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             x.y(i, iterator.next());
          }
       }
       return;
    }
}
