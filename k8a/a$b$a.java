package k8a.a$b$a;
import java.lang.Runnable;
import k8a.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k8a.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.t3;
import com.kwai.robust.PatchProxyResult;
import b8a.z2;
import java.lang.Number;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.player.mid.manifest.RepInterface;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.util.Objects;
import java.lang.Long;
import zz9.c;

public final class a$b$a implements Runnable	// class@002c13
{
    public final a$b b;

    public void a$b$a(a$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       long l;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, a$b$a.class, str)) {
          return;
       }
       a$b b = this.b.b;
       if (b.u == null) {
          a p = b.p;
          if (p == null) {
             a.S("mBaseFragment");
          }
          if (t3.a(p, a.P8(this.b.b)) == -202) {
             b = this.b.b;
             boolean b1 = true;
             b.u = b1;
             p = b.s;
             if (p == null) {
                a.S("mSlidePlayTrafficViewModel");
             }
             String photoId = a.P8(this.b.b).getPhotoId();
             a.o(photoId, "mPhoto.photoId");
             QPhoto qPhoto = a.P8(this.b.b);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object[] obj = PatchProxy.applyOneRefs(qPhoto, objArray, z2.class, "2");
             if (obj != patchProxyRe) {
                l = obj.longValue();
             }else {
                a.p(qPhoto, "$this$getSavedBytes");
                KwaiManifest kwaiManifest = PatchProxy.applyOneRefs(qPhoto, objArray, z2.class, str);
                if (kwaiManifest != patchProxyRe) {
                }else {
                   kwaiManifest = r1.q1(qPhoto.getEntity());
                }
                if (kwaiManifest != null) {
                   List repList = kwaiManifest.getRepList();
                   if (repList != null) {
                      obj = (repList.size() >= 2)? 1: null;
                      if (!obj) {
                         repList = objArray;
                      }
                      if (repList != null) {
                         Iterator iterator = repList.iterator();
                         obj = objArray;
                         Object[] objArray1 = obj;
                         while (iterator.hasNext()) {
                            RepInterface repInterface = iterator.next();
                            Object[] objArray2 = (!repInterface instanceof Representation)? objArray: repInterface;
                            if (objArray2 != null) {
                               String qualityType = repInterface.getQualityType();
                               a.o(qualityType, "it.qualityType");
                               Objects.requireNonNull(qualityType, "null cannot be cast to non-null type java.lang.String");
                               qualityType = qualityType.toLowerCase();
                               a.o(qualityType, "\(this as java.lang.String\).toLowerCase\(\)");
                               if (a.g("1080p", qualityType) || (obj == null && a.g("720p", qualityType))) {
                                  obj = objArray2;
                               }
                               if (!a.g("480p", qualityType) && (a.g("540p", qualityType) || a.g("576p", qualityType))) {
                                  objArray1 = objArray2;
                               }
                            }
                         }
                         if (obj != null && objArray1 != null) {
                            a.m(obj);
                            a.m(objArray1);
                            Long longx = Long.valueOf((((long)(obj.avgBitrate - objArray1.avgBitrate) * qPhoto.getVideoDuration()) / (long)8000));
                            if (longx.longValue() <= 0) {
                               b1 = false;
                            }
                            if (b1) {
                               objArray = longx;
                            }
                            if (objArray != null) {
                               l = objArray.longValue();
                            }
                         }
                      }
                   }
                }
             label_0130 :
                l = 0;
             }
             p.D(photoId, l);
          }
       }
       return;
    }
}
