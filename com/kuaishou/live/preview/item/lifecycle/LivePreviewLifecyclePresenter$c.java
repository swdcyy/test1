package com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$c;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import java.util.Iterator;
import java.util.List;
import wk3.b;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ul3.a;
import java.lang.Math;

public class LivePreviewLifecyclePresenter$c extends ViewPager$l	// class@000deb
{
    public final LivePreviewLifecyclePresenter b;

    public void LivePreviewLifecyclePresenter$c(LivePreviewLifecyclePresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       Iterator iterator;
       LivePreviewLifecyclePresenter$c uoc = LivePreviewLifecyclePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (!p0) {
          LivePreviewLifecyclePresenter$c tb = this.b;
          if (tb.A != LiveWillShowType.NONE) {
             iterator = tb.D.iterator();
             while (iterator.hasNext()) {
                iterator.next().y1();
             }
          }
          this.b.S8();
          iterator.B = 0;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       LivePreviewLifecyclePresenter$c obj;
       boolean b;
       LivePreviewLifecyclePresenter$c uoc = LivePreviewLifecyclePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LivePreviewLifecyclePresenter$c.class, "2")) {
          return;
       }
       int i = 0;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_003d :
             obj = this.b;
             b = (obj.x == null && (obj.A != LiveWillShowType.NONE || Math.abs((p0 - a.c(obj.w))) > 1))? true: false;
          }
       }else {
          goto label_003d ;
       }
       if (b) {
          return;
       }else {
          obj = this.b;
          if (obj.B <= 0) {
             obj.B = p1;
             return;
          }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uoc, "4")){
             obj = a.c(this.b.w);
             p1 = p1 - this.b.B;
             if (Math.abs(p1) - 0x3d4ccccd > 0) {
                if (p1 > 0) {
                   i = 1;
                }
                if (i && obj == (p0 + 1)) {
                   p0.A = LiveWillShowType.UP_SLIDE;
                }else if(!i && obj == p0){
                   p0.A = LiveWillShowType.DOWN_SLIDE;
                }
             }
          }
          LivePreviewLifecyclePresenter$c tb = this.b;
          if (tb.A != LiveWillShowType.NONE) {
             Iterator iterator = tb.D.iterator();
             while (iterator.hasNext()) {
                iterator.next().t4(this.b.A);
             }
          }
          return;
       }
    }
}
