package efa.d;
import cfa.b;
import java.lang.String;
import java.lang.Object;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import cfa.b$a;

public final class d implements b	// class@002677
{
    public final String a;

    public void d(String p0){
       super();
       this.a = p0;
    }
    public Serializable a(Serializable p0,Serializable p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (p1 != PatchProxyResult.class) {
          p0 = p1;
       }else if(this.a != null && p0 != null){
          HomeFeedResponse homeFeedResp = p0.clone();
          if (homeFeedResp != null) {
             homeFeedResp = homeFeedResp.mQPhotos;
             Iterator iterator = (homeFeedResp != null)? homeFeedResp.iterator(): null;
             while (iterator != null && iterator.hasNext() == true) {
                QPhoto qPhoto = iterator.next();
                String userId = (qPhoto != null)? qPhoto.getUserId(): null;
                if (a.g(userId, this.a)) {
                   iterator.remove();
                }
             }
          }
       }
       return p0;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
