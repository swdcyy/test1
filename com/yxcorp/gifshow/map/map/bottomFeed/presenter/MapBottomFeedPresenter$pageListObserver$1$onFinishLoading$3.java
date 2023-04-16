package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3 extends Lambda implements l	// class@001c8b
{
    public static final MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3 INSTANCE;

    static {
       MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3.INSTANCE = new MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3();
    }
    public void MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3(){
       super(1);
    }
    public final CharSequence invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.o(p0, "it");
       String photoId = p0.getPhotoId();
       a.o(photoId, "it.photoId");
       return photoId;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
