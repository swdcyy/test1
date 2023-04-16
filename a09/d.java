package a09.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a09.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import im8.f;

public class d extends Accessor	// class@00000f
{
    public final PlayEndControlPresenter c;
    public final f d;

    public void d(f p0,PlayEndControlPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       boolean b1;
       boolean b2;
       d tc = this.c;
       Objects.requireNonNull(tc);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlayEndControlPresenter playEndContr = PlayEndControlPresenter.class;
       Object[] objArray = null;
       PlayEndControlPresenter obj = PatchProxy.apply(objArray, tc, playEndContr, "8");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tc.p == null){
          obj = tc.x;
          if (obj == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
          if (obj.v()) {
             Object obj1 = PatchProxy.apply(objArray, tc, playEndContr, "6");
             String str = "mPhoto";
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj = tc.p;
                if (obj == null) {
                   a.S(str);
                }
                if (obj.getDetailRealAspectRatio() - (float)1 < 0) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
             if (b1) {
                PhotoAdvertisement obj2 = PatchProxy.apply(objArray, tc, playEndContr, "7");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else {
                   playEndContr = tc.p;
                   if (playEndContr == null) {
                      a.S(str);
                   }
                   obj2 = k.B(playEndContr);
                   if (obj2 != null) {
                      objArray = obj2.mUrl;
                   }
                   h oh = h.n();
                   Objects.requireNonNull(oh);
                   obj1 = PatchProxy.applyOneRefs(objArray, oh, h.class, "26");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(oh.l(objArray) != null){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }
                if (!b2 && (tc.y == null && (tc.z == null && tc.A == null))) {
                   PlayEndControlPresenter v = tc.v;
                   if (v == null) {
                      a.S("mFullWebViewIsShowing");
                   }
                   if (!v.get().booleanValue()) {
                      b = true;
                   }
                }
             }
          }
       }
    label_00ba :
       return Boolean.valueOf(b);
    }
}
