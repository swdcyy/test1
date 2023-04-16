package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$i;
import ok.h;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;

public final class GalleryPageBigCardPresenter$i implements h	// class@00182f
{
    public static final GalleryPageBigCardPresenter$i b;

    static {
       GalleryPageBigCardPresenter$i.b = new GalleryPageBigCardPresenter$i();
    }
    public void GalleryPageBigCardPresenter$i(){
       super();
    }
    public Object apply(Object p0){
       QPhoto qPhoto = PatchProxy.applyOneRefs(p0, this, GalleryPageBigCardPresenter$i.class, "1");
       if (qPhoto != PatchProxyResult.class) {
       }else {
          qPhoto = new QPhoto(p0);
       }
       return qPhoto;
    }
}
