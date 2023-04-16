package com.kwai.nearby.local.tab.view.NearbyChildScrollViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.CorrectOffsetViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class NearbyChildScrollViewPager extends CommonLogViewPager	// class@000ffa
{
    public boolean u;
    public boolean v;

    public void NearbyChildScrollViewPager(Context p0){
       super(p0, null);
    }
    public void NearbyChildScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.u = true;
       this.setIgnoreChildTranslation(false);
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(NearbyChildScrollViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NearbyChildScrollViewPager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.u != null && this.v == null) {
          return super.canScrollHorizontally(p0);
       }else {
          return false;
       }
    }
    public void setEnableForbidHorizontalScroll(boolean p0){
       if (PatchProxy.isSupport(NearbyChildScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NearbyChildScrollViewPager.class, "3")) {
          return;
       }
       this.v = p0;
       this.u = p0;
       super.setScrollable(p0);
       return;
    }
    public void setScrollable(boolean p0){
       if (PatchProxy.isSupport(NearbyChildScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NearbyChildScrollViewPager.class, "1")) {
          return;
       }
       if (this.v != null) {
          return;
       }
       this.u = p0;
       super.setScrollable(p0);
       return;
    }
}
