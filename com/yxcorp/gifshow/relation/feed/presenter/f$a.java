package com.yxcorp.gifshow.relation.feed.presenter.f$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.relation.feed.presenter.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;

public class f$a implements ViewPager$i	// class@0018aa
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       f v = this.b.v;
       if (v == null) {
          return;
       }
       QPhoto currentPhoto = v.getCurrentPhoto();
       if (currentPhoto == null) {
          return;
       }
       uoa = this.b;
       uoa.w = uoa.s.equals(currentPhoto.getEntity());
       return;
    }
}
