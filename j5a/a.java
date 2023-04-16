package j5a.a;
import erd.g;
import j5a.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import j8c.d;
import com.yxcorp.gifshow.entity.QPhoto;
import crd.b;
import lnc.b9;

public final class a implements g	// class@00290a
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "2")) {
       }else {
          int i = 0;
          if (p0 == ActivityEvent.PAUSE) {
             objArray = new Object[i];
             o.C().s("PostRecommendPresenter", "PostRecommendPresenter  onPause ", objArray);
             if (tb.q.mPhoto == null) {
                Object[] objArray1 = new Object[i];
                o.C().s("PostRecommendPresenter", "PostRecommendPresenter Photo is invalid", objArray1);
             }else {
                d.g().j(tb.q.mPhoto);
             }
          }else if(p0 == ActivityEvent.DESTROY){
             objArray = new Object[i];
             o.C().s("PostRecommendPresenter", "PostRecommendPresenter  onDestroy ", objArray);
             d.g().f();
             b9.a(tb.t);
          }
       }
       return;
    }
}
