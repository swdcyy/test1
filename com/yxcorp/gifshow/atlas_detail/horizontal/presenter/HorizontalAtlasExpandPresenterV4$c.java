package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public final class HorizontalAtlasExpandPresenterV4$c implements ViewPager$i	// class@001bb7
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void HorizontalAtlasExpandPresenterV4$c(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       HorizontalAtlasExpandPresenterV4$c uoc = HorizontalAtlasExpandPresenterV4$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       HorizontalAtlasExpandPresenterV4 f = this.b.F;
       if (f == null || f.getCurrentItem() != p0) {
          f = this.b.F;
          if (f != null) {
             f.setCurrentItem(p0);
          }
       }
       return;
    }
}
