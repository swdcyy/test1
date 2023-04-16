package com.kuaishou.live.audience.component.gift.DrawingGiftGallery$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$c;
import java.util.List;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;

public class DrawingGiftGallery$a implements ViewPager$i	// class@000ad5
{
    public final DrawingGiftGallery b;

    public void DrawingGiftGallery$a(DrawingGiftGallery p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       DrawingGiftGallery$a uoa = DrawingGiftGallery$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.c.setPageIndex((p0 % uoa.e.d.size()));
       return;
    }
}
