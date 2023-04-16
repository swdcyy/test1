package com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter$onBind$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.VideoFeed;
import kv5.f;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.framework.model.feed.BaseFeed;
import tkd.b;
import tkd.d;
import nl9.u;

public final class SearchAdLiveConversionPresenter$onBind$3 extends Lambda implements a	// class@001560
{
    public final SearchAdLiveConversionPresenter this$0;

    public void SearchAdLiveConversionPresenter$onBind$3(SearchAdLiveConversionPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final QPhoto invoke(){
       f a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SearchAdLiveConversionPresenter$onBind$3 obj = PatchProxy.apply(objArray, this, SearchAdLiveConversionPresenter$onBind$3.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, SearchAdLiveConversionPresenter.class, "7");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          SearchAdLiveConversionPresenter q = obj.q;
          if (q == null) {
             a.S("photo");
          }
          if (q.mEntity instanceof VideoFeed) {
             a = f.a;
             SearchAdLiveConversionPresenter q1 = obj.q;
             if (q1 == null) {
                a.S("photo");
             }
             QPhoto mEntity = q1.mEntity;
             Objects.requireNonNull(mEntity, "null cannot be cast to non-null type com.kuaishou.android.model.feed.VideoFeed");
             FeedUserAvatarInfo uFeedUserAva = a.a(mEntity);
             if (uFeedUserAva != null && (uFeedUserAva.mStatus == 1 && uFeedUserAva.mLiveStreamFeed != null)) {
                SearchAdLiveConversionPresenter q2 = obj.q;
                if (q2 == null) {
                   a.S("photo");
                }
                QPhoto mEntity1 = q2.mEntity;
                Objects.requireNonNull(mEntity1, "null cannot be cast to non-null type com.kuaishou.android.model.feed.VideoFeed");
                FeedUserAvatarInfo uFeedUserAva1 = a.a(mEntity1);
                if (uFeedUserAva1 != null) {
                   objArray = uFeedUserAva1.mLiveStreamFeed;
                }
                mEntity = new QPhoto(objArray);
                u ou = d.a(-1694791652);
                SearchAdLiveConversionPresenter q3 = obj.q;
                if (q3 == null) {
                   a.S("photo");
                }
                ou.l4(q3, mEntity.getEntity());
                objArray = mEntity;
             }
          }
       }
    label_0086 :
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
