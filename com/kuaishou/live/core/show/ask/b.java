package com.kuaishou.live.core.show.ask.b;
import ob1.d;
import lp3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.os.Bundle;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import p91.m;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment$a;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;

public class b extends a implements d	// class@0009c6
{

    public void b(){
       super();
    }
    public b Vb(PagerSlidingTabStrip$d p0,Bundle p1,LiveAskItemClickListener p2,m p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveAskTabFragment$a uoa = new LiveAskTabFragment$a(p0, LiveAskTabFragment.class, p1, p2, p3);
       return obj;
    }
}
