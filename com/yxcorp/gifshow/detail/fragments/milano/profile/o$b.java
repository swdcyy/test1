package com.yxcorp.gifshow.detail.fragments.milano.profile.o$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.fragments.milano.profile.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class o$b implements ViewPager$i	// class@00155e
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       o q = this.b.q;
       q = q.G0(q.j());
       q.w = (q == -1 || q == -2)? false: true;
       Log.g("MilanoProfileSwipeP", "call trySetProfileFeedEnabled\(\) when onPageSelected.  mIsItemValid="+this.b.w);
       this.b.P8();
       return;
    }
}
