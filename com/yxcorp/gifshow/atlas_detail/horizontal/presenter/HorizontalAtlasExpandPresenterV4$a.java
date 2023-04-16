package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import tp7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import nsd.u;
import java.util.Objects;
import com.kwai.slide.play.detail.bottom.atlasplayprogress.AtlasSegmentedProgressBar;

public final class HorizontalAtlasExpandPresenterV4$a implements ViewPager$i	// class@001bb5
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void HorizontalAtlasExpandPresenterV4$a(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(HorizontalAtlasExpandPresenterV4$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, HorizontalAtlasExpandPresenterV4$a.class, "1")) {
          return;
       }
       HorizontalAtlasExpandPresenterV4$a tb = this.b;
       Activity activity = tb.getActivity();
       a.m(activity);
       if ((double)((float)p2 / (float)n.k(activity)) - 0x3fe0000000000000 >= 0) {
          p0++;
       }
       tb.H = p0;
       HorizontalAtlasExpandPresenterV4$a tb1 = this.b;
       a uoa = new a(tb1.H, HorizontalAtlasExpandPresenterV4.P8(tb1).getAtlasListSize(), false, 0, 12, null);
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoidOneRefs(tb, tb1, HorizontalAtlasExpandPresenterV4.class, "3") && tb.b() > 0) {
          HorizontalAtlasExpandPresenterV4 g = tb1.G;
          if (g != null) {
             g.setCount(tb.b());
             g.setCurrentSegment(tb.a());
          }
       }
       return;
    }
    public void onPageSelected(int p0){
    }
}
