package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.http.l;
import java.util.List;
import qvb.n0;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2 extends Lambda implements a	// class@001414
{
    public final MyProfileEmptyGuideTipPresenter this$0;

    public void MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2(MyProfileEmptyGuideTipPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       int i;
       List obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.Y8().d1();
       a.o(obj, "mPageList.originItems");
       boolean b = true;
       if (obj instanceof Collection && obj.isEmpty()) {
          i = 0;
       }else {
          Iterator iterator = obj.iterator();
          i = 0;
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             a.o(qPhoto, "it");
             int i1 = qPhoto.getEntity() instanceof ProfileDraftsFeed ^ b;
             if (i1) {
                i = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.V();
                }
             }
          }
       }
       if (i <= 0) {
          b = false;
       }
       return b;
    }
}
