package com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;

public final class AssistantViewPager$c implements ViewPager$i	// class@001d2c
{
    public final AssistantViewPager b;

    public void AssistantViewPager$c(AssistantViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       AssistantViewPager$c uoc = AssistantViewPager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       k1.m(this.b.getDisplayNextRunnable());
       k1.r(this.b.getDisplayNextRunnable(), 1500);
       return;
    }
}
