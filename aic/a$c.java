package aic.a$c;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.model.response.AuthorGuideResponse;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class a$c implements o	// class@000123
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public Object apply(Object p0){
       AuthorGuideResponse uAuthorGuide = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (uAuthorGuide != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.a();
          uAuthorGuide = p0.mPhotos;
          if (uAuthorGuide != null) {
             Iterator iterator = uAuthorGuide.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                a.o(qPhoto, "photo");
                qPhoto.setListLoadSequenceID(p0.mLlsid);
             }
          }
          p0 = p0.mPhotos;
          if (p0 == null) {
             p0 = CollectionsKt__CollectionsKt.E();
          }
          uAuthorGuide = p0;
       }
       return uAuthorGuide;
    }
}
