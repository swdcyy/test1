package bja.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.lang.Long;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a implements Runnable	// class@0003db
{
    public final QPhoto b;
    public final MockFeedPresenter$b c;

    public void a(QPhoto p0,MockFeedPresenter$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String photoId;
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "1")) {
          return;
       }
       try{
          Object[] objArray = new Object[0];
          a.C().w("MockFeedPresenter", "onBind\(\) insert mock feed "+this.b.getPhotoId(), objArray);
          photoId = this.b.getPhotoId();
          a.o(photoId, "qPhoto.photoId");
          this.c.b.r.onNext(new Pair(Long.valueOf(Long.parseLong(photoId)), this.b));
       }catch(java.lang.Exception e0){
          a.C().e("MockFeedViewModel", "photoId wrong", e0);
          ExceptionHandler.handleCaughtException(e0);
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
