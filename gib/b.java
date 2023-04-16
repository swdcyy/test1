package gib.b;
import r0c.i;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import dc5.c;
import ui9.f$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import r0c.h;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.d1;
import xi9.b;

public final class b implements i	// class@002aec
{
    public final IMBeautyController a;

    public void b(IMBeautyController p0){
       this.a = p0;
       super();
    }
    public void a(BeautifyConfig p0,Set p1){
       IMBeautyController a;
       MagicEmoji$MagicFace mDisableBeau;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p1, "disableBeautyList");
       c.g("IMBeautyController", "sdkAdapter setBeauty : "+p0);
       b ta = this.a;
       a = ta.a;
       if (a != null) {
          Objects.requireNonNull(ta);
          Set set = PatchProxy.apply(null, ta, IMBeautyController.class, "11");
          if (set != PatchProxyResult.class) {
          }else {
             h f = ta.k.f;
             if (f != null) {
                mDisableBeau = f.mDisableBeautylist;
                if (mDisableBeau != null) {
                   mDisableBeau = CollectionsKt___CollectionsKt.L5(mDisableBeau);
                   if (mDisableBeau != null) {
                   label_0056 :
                      set = mDisableBeau;
                   }
                }
             }
             mDisableBeau = d1.k();
             goto label_0056 ;
          }
          a.R(new f$a(p0, set));
       }
       return;
    }
}
