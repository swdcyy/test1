package efa.b;
import dfa.b;
import java.lang.Object;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.util.List;
import dfa.b$a;

public final class b implements b	// class@002675
{

    public void b(){
       super();
    }
    public Serializable a(Serializable p0){
       HomeFeedResponse homeFeedResp1;
       HomeFeedResponse homeFeedResp = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (homeFeedResp != PatchProxyResult.class) {
       }else if(p0 != null){
          homeFeedResp1 = p0.clone();
          if (homeFeedResp1 != null) {
             homeFeedResp = homeFeedResp1.mQPhotos;
             homeFeedResp1.mQPhotos = new ArrayList();
             if (homeFeedResp != null) {
                Iterator iterator = homeFeedResp.iterator();
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   a.o(qPhoto, "it");
                   if (qPhoto.isVideoType()) {
                      homeFeedResp1.mQPhotos.add(qPhoto);
                   }
                }
             }
          }
       }
       homeFeedResp = homeFeedResp1;
       return homeFeedResp;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
