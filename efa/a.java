package efa.a;
import cfa.b;
import java.lang.Object;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.EvictingQueue;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Objects;
import trd.y;
import cfa.b$a;

public final class a implements b	// class@002674
{
    public final int a;

    public void a(int p0){
       super();
       this.a = p0;
    }
    public Serializable a(Serializable p0,Serializable p1){
       Iterator iterator;
       HomeFeedResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else if(p0 == null){
          obj = p0.mQPhotos;
          if (p1 != null) {
             HomeFeedResponse mQPhotos = p1.mQPhotos;
             if (mQPhotos != null) {
                EvictingQueue uEvictingQue = EvictingQueue.create(this.a);
                if (obj != null) {
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      QPhoto qPhoto = iterator.next();
                      if (!mQPhotos.contains(qPhoto)) {
                         uEvictingQue.offer(qPhoto);
                      }
                   }
                }
                iterator = mQPhotos.iterator();
                while (iterator.hasNext()) {
                   uEvictingQue.offer(iterator.next());
                }
                HomeFeedResponse homeFeedResp = p1.clone();
                if (homeFeedResp != null) {
                   ArrayList uArrayList = new ArrayList();
                   a.o(uEvictingQue, "cacheQueue");
                   QPhoto[] qPhotoArray = new QPhoto[0];
                   Object[] objArray = uEvictingQue.toArray(qPhotoArray);
                   Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                   y.s0(uArrayList, objArray);
                   homeFeedResp.mQPhotos = uArrayList;
                }
             }
          }
       }
       p0 = p1;
       return p0;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
