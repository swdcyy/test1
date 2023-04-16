package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$d;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public final class HorizontalAtlasExpandPresenterV4$d implements ViewPager$i	// class@001bb8
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void HorizontalAtlasExpandPresenterV4$d(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       HorizontalAtlasExpandPresenterV4$d uod = HorizontalAtlasExpandPresenterV4$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       HorizontalAtlasExpandPresenterV4 b = this.b.B;
       if (b == null || b.getCurrentItem() != p0) {
          b = this.b.B;
          if (b != null) {
             b.setCurrentItem(p0);
          }
       }
       return;
    }
}
