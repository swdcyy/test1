package g7a.k$c;
import qvb.q;
import g7a.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import io.reactivex.subjects.PublishSubject;
import qvb.p;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import kotlin.jvm.internal.a;

public final class k$c implements q	// class@0023e2
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(k$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, k$c.class, "2")) {
          return;
       }
       k.R8(this.b).K.onNext(CollectionsKt__CollectionsKt.E());
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       List items;
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       QPhoto qPhoto = k.V8(this.b);
       k w = this.b.w;
       if (w != null) {
          items = w.getItems();
          if (items != null) {
          label_0030 :
             qPhoto.setRecentViewers(items);
             k$c tb = this.b;
             List recentViewer = k.V8(tb).getRecentViewers();
             a.m(recentViewer);
             a.o(recentViewer, "mPhoto.recentViewers!!");
             k.R8(this.b).K.onNext(tb.X8(recentViewer));
             return;
          }
       }
       items = CollectionsKt__CollectionsKt.E();
       goto label_0030 ;
    }
}
