package com.kuaishou.live.gzone.treasurebox.presenter.r$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;

public class r$b extends ViewPager$l	// class@001c93
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       r$b uob = r$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b.E.setPageIndex(p0);
       return;
    }
}
