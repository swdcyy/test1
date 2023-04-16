package com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter$a;
import v7a.a$a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import wa5.e;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class NasaLivePhotoDuplicatedPresenter$a implements a$a	// class@001514
{
    public final NasaLivePhotoDuplicatedPresenter a;

    public void NasaLivePhotoDuplicatedPresenter$a(NasaLivePhotoDuplicatedPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, NasaLivePhotoDuplicatedPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "loadMoreItems");
       obj = new ArrayList();
       List list = NasaLivePhotoDuplicatedPresenter.P8(this.a).V0();
       if (list != null) {
          a.o(list, "mSlidePlayViewModel.pageItems ?: return false");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (!qPhoto.isLiveStream()) {
                continue ;
             }else {
                int i = list.indexOf(qPhoto);
                if (i < 0) {
                   continue ;
                }else {
                   qPhoto = list.get(i);
                   if (e.e(qPhoto)) {
                      iterator.remove();
                      Log.d("NLPDP-DETAIL-GROOT", "not expired,deleted new£¬photo="+qPhoto);
                   }else if(NasaLivePhotoDuplicatedPresenter.P8(this.a).getCurrentPhoto() == qPhoto){
                      iterator.remove();
                      Log.d("NLPDP-DETAIL-GROOT", "expired,but is current,deleted new£¬photo="+qPhoto);
                   }else {
                      a.o(qPhoto, "cachePhoto");
                      obj.add(qPhoto);
                      Log.d("NLPDP-DETAIL-GROOT", "expired,deleted old£¬photo="+qPhoto);
                   }
                }
             }
          }
          NasaLivePhotoDuplicatedPresenter.P8(this.a).D1(obj, null, "NLPDP");
       }
       return false;
    }
}
