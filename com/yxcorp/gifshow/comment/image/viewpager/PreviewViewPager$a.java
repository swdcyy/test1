package com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class PreviewViewPager$a extends ViewPager$l	// class@0010d5
{
    public final PreviewViewPager b;

    public void PreviewViewPager$a(PreviewViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       PreviewViewPager$a uoa = PreviewViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.g = p0;
       return;
    }
    public void onPageSelected(int p0){
       PreviewViewPager$a uoa = PreviewViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.i = p0;
       return;
    }
}
