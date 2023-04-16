package nd9.z$c;
import erd.g;
import nd9.z;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MusicMagicResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw8.r;
import fw8.r$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.data.repo.response.MusicRecommendMagicInfo;
import j8c.a;
import q87.c;

public final class z$c implements g	// class@003165
{
    public final z b;

    public void z$c(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, z$c.class, "1")) {
       }else {
          z$c tb = this.b;
          r.c().g(tb.i2());
          a.m(p0);
          p0 = p0.musicRecommendMagicInfo;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, z.class, "8")) {
             MusicRecommendMagicInfo magicFaceId = (p0 != null)? p0.magicFaceId: null;
             int i = 0;
             if (magicFaceId == null) {
                objArray = new Object[i];
                a.D().w(tb.o, "response is null", objArray);
             }else if(!tb.g2()){
                objArray = new Object[i];
                a.D().w(tb.o, "popup can\'t show", objArray);
             }else {
                tb.p = p0.magicFaceId;
                tb.l2(p0);
             }
          }
       }
       return;
    }
}
