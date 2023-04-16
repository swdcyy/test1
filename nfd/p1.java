package nfd.p1;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nfd.y0;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.plugin.search.entity.template.aggregate.CollectionPendant;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import j06.a;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.result.SearchCollectionBase;
import com.yxcorp.gifshow.entity.QPhoto;

public class p1	// class@001df0
{

    public void p1(){
       super();
    }
    public static boolean a(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (y0.h() && (p0.mItemType == SearchItem$SearchItemType.PHOTO && (p1.c(p0) != null && (p1.c(p0).mSearchCollectionItem != null && !q.f(p1.c(p0).mSearchCollectionItem.mFeeds)))))? true: false;
       return b;
    }
    public static boolean b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!NasaSlidePlayExperimentUtil.l()) {
          return false;
       }
       return a.a(p0);
    }
    public static CollectionPendant c(SearchItem p0){
       if (p0 != null) {
          p0 = p0.mExtInfo;
          if (p0 != null) {
             return p0.mCollectionPendant;
          }
       }
       return null;
    }
    public static String d(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CollectionPendant mCollectionI = (p1.a(p0))? p0.mExtInfo.mCollectionPendant.mCollectionId: "";
       return mCollectionI;
    }
    public static void e(SearchItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p1.class, "6")) {
          return;
       }
       p1.c(p0).mSearchCollectionItem.mPhotoOffset = p1.c(p0).mPhotoOffset;
       p1.c(p0).mSearchCollectionItem.mCurPhotoId = p0.mPhoto.getPhotoId();
       return;
    }
}
