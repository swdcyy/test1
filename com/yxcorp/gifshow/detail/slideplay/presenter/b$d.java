package com.yxcorp.gifshow.detail.slideplay.presenter.b$d;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;

public class b$d implements ViewPager$i	// class@00183f
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (!p0) {
          Object[] objArray = new Object[0];
          o.C().w("SlidePlayInteractStickerStickerPresenter", "»¬¶¯Í£Ö¹addInteractStickerView"+this.b.x.getPhotoId(), objArray);
          this.b.P8();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
