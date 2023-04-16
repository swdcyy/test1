package bz9.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import ekd.j;

public final class c	// class@00052c
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(QPhoto p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "2");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          QPhoto mEntity = p0.mEntity;
          b1 = (mEntity != null)? r1.v3(mEntity): false;
       }
       if (!b1) {
          if (!j.h(r1.n0(p0.mEntity))) {
             ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(p0.mEntity);
             a.o(uAtlasCoverS, "FeedExt.getAtlasSizes\(photo.mEntity\)");
             int i = (!uAtlasCoverS.length)? 1: 0;
             if (i ^ 1) {
             label_0055 :
                b = true;
             }
          }
       }else {
          goto label_0055 ;
       }
       return b;
    }
}
