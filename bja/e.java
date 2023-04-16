package bja.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.lang.Long;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements Runnable	// class@0003e3
{
    public final QPhoto b;
    public final MockFeedPresenterV2$b c;

    public void e(QPhoto p0,MockFeedPresenterV2$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String photoId;
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "1")) {
          return;
       }
       try{
          Object[] objArray = new Object[0];
          a.C().w("MockFeedPresenterV2", "onBind\(\) insert mock feed "+this.b.getPhotoId(), objArray);
          photoId = this.b.getPhotoId();
          a.o(photoId, "qPhoto.photoId");
          this.c.b.q.onNext(new Pair(Long.valueOf(Long.parseLong(photoId)), this.b));
       }catch(java.lang.Exception e0){
          a.C().e("MockFeedViewModel", "photoId wrong", e0);
          ExceptionHandler.handleCaughtException(e0);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
