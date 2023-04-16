package com.yxcorp.gifshow.home.block.topbar.CenterContentPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout$LayoutParams;

public final class CenterContentPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@00164b
{

    public void CenterContentPagerSlidingTabStrip(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public ViewGroup$LayoutParams k(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, CenterContentPagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(0, -1);
       obj.weight = 0x3f800000;
       return obj;
    }
}
