package com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.String;
import android.view.View;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class GzonePagerSlidingTabStrip$e extends PagerSlidingTabStrip$d	// class@00185b
{
    public boolean j;

    public void GzonePagerSlidingTabStrip$e(String p0){
       super(p0);
       this.j = false;
    }
    public void GzonePagerSlidingTabStrip$e(String p0,View p1){
       super(p0, p1);
       this.j = false;
    }
    public void GzonePagerSlidingTabStrip$e(String p0,CharSequence p1){
       super(p0, p1);
       this.j = false;
    }
    public View e(){
       Object obj = PatchProxy.apply(null, this, GzonePagerSlidingTabStrip$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b() != null) {
          return this.b();
       }
       return super.e();
    }
}
