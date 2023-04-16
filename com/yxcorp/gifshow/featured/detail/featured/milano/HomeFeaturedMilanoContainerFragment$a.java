package com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;

public class HomeFeaturedMilanoContainerFragment$a extends ViewPager$l	// class@000f15
{
    public final HomeFeaturedMilanoContainerFragment b;

    public void HomeFeaturedMilanoContainerFragment$a(HomeFeaturedMilanoContainerFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(HomeFeaturedMilanoContainerFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, HomeFeaturedMilanoContainerFragment$a.class, "1")) {
          return;
       }
       InvalidGestureChecker.a(this.b.getContext(), AnswerType.SLIDE_VIEW_PAGE);
       return;
    }
}
