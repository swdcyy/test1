package e8a.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.c;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import e8a.d;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements Runnable	// class@0020a2
{
    public final c b;
    public final HomeFeedResponse c;

    public void e(c p0,HomeFeedResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Iterator iterator = new ArrayList(this.c.getItems()).iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.isVideoType() && !qPhoto.isImageType()) {
             continue ;
          }else {
             boolean b = true;
             try{
                tb.p0(qPhoto, b).j();
             }catch(java.lang.Exception e2){
                ExceptionHandler.handleCaughtException(e2);
                goto label_0014 ;
             }
          }
       }
       return;
    }
}
