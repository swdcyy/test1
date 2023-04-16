package com.kuaishou.live.widget.page2.ViewPager2$h$a;
import b2.g;
import com.kuaishou.live.widget.page2.ViewPager2$h;
import java.lang.Object;
import android.view.View;
import b2.g$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.widget.page2.ViewPager2;

public class ViewPager2$h$a implements g	// class@001033
{
    public final ViewPager2$h a;

    public void ViewPager2$h$a(ViewPager2$h p0){
       this.a = p0;
       super();
    }
    public boolean a(View p0,g$a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, ViewPager2$h$a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       this.a.s((p0.getCurrentItem() + 1));
       return 1;
    }
}
