package com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.featured.detail.featured.t;
import qvb.i;
import wvb.e;
import mda.d;
import kp.r1;
import kotlin.jvm.internal.a;
import mda.a;
import mda.e;

public final class NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a implements ViewPager$i	// class@0020d4
{
    public final NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2 b;

    public void NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a(NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       BaseFeed entity;
       NasaMilanoDuplicateRealShowPresenter r1;
       if (PatchProxy.isSupport2(NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a.class, "1")) {
          return;
       }
       NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2 this$0 = this.b.this$0;
       NasaMilanoDuplicateRealShowPresenter r = this$0.r;
       Object[] objArray = null;
       if (r != null) {
          QPhoto currentPhoto = r.getCurrentPhoto();
          if (currentPhoto != null) {
             entity = currentPhoto.getEntity();
          label_002a :
             Objects.requireNonNull(this$0);
             if (!PatchProxy.applyVoidOneRefsWithListener(entity, this$0, NasaMilanoDuplicateRealShowPresenter.class, "9")) {
                NasaMilanoDuplicateRealShowPresenter s = this$0.s;
                if (s != null) {
                   objArray = s;
                }else {
                   String str1 = "10";
                   i oi = PatchProxy.applyWithListener(objArray, this$0, NasaMilanoDuplicateRealShowPresenter.class, str1);
                   if (oi != PatchProxyResult.class) {
                   }else {
                      r1 = this$0.r;
                      oi = (r1 != null)? r1.X0(): objArray;
                      while (oi instanceof e) {
                         oi = oi.m();
                      }
                      if (oi instanceof t) {
                         PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, str1);
                      }else {
                         PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, str1);
                         oi = objArray;
                      }
                   }
                   if (oi != null) {
                      this$0.s = oi;
                      objArray = oi;
                   }
                }
                if (objArray != null) {
                   t m = objArray.M;
                   if (m == null || (!PatchProxy.applyVoidOneRefs(entity, m, d.class, "2") && entity != null)) {
                      String str = r1.t1(entity);
                      a.o(str, "FeedExt.getPhotoId\(it\)");
                      a uoa = m.h.d(str);
                      if (uoa != null) {
                         uoa.a(true);
                      }
                   }
                }
                PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, "9");
             }
             PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a.class, "1");
             return;
          }
       }
       entity = objArray;
       goto label_002a ;
    }
}
