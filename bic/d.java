package bic.d;
import bic.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.guide.ShareMyFeedGuideConfig;
import java.lang.reflect.Type;
import lnc.l1;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import yhc.d;
import com.kwai.framework.model.feed.BaseFeed;
import az6.a;
import kzc.c;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import kzc.e;

public class d implements b	// class@00047f
{
    public final GifshowActivity a;
    public final PhotoDetailParam b;
    public final int c;

    public void d(GifshowActivity p0,PhotoDetailParam p1,int p2){
       a.p(p0, "activity");
       a.p(p1, "mDetailParam");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean N(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       ShareMyFeedGuideConfig obj = PatchProxy.apply(objArray, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.t().getValue("shareMyFeedGuideConfig", ShareMyFeedGuideConfig.class, new ShareMyFeedGuideConfig());
       if (!l1.a() && obj.canSharePopGuideShow()) {
          PhotoDetailParam mPhoto = this.b.mPhoto;
          a.o(mPhoto, "mDetailParam\n    .mPhoto");
          if (!mPhoto.isMine()) {
             if (this.a.isFinishing()) {
                return false;
             }else if(this.c == true){
                QPhoto obj1 = PatchProxy.apply(objArray, this, uod, "2");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = this.b.mPhoto.mEntity;
                   a.o(obj1, "mDetailParam.mPhoto.mEntity");
                   Object obj2 = PatchProxy.applyOneRefs(obj1, this, uod, "3");
                   b = (obj2 != patchProxyRe)? obj2.booleanValue(): d.a.a(obj1, true);
                   if (b) {
                      a mSource = this.b.mSource;
                      mSource = (mSource != 16 && (mSource != 9 && (mSource != 8 && (mSource == 82 || mSource == 90))))? 1: 0;
                      if (mSource) {
                         b = true;
                      }
                   }
                   b = false;
                }
                if (!b) {
                   return false;
                }
             }
             List list = b.a().l(this.a);
             List list1 = b.b().l(this.a);
             if (list1 == null || (list1.size() || (list != null && list.size()))) {
                return false;
             }else {
                return true;
             }
          }
       }
       return false;
    }
}
