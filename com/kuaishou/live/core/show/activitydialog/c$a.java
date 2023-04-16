package com.kuaishou.live.core.show.activitydialog.c$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.String;
import com.kuaishou.live.common.core.component.pk.entry.LiveTabView;
import android.view.View;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class c$a extends PagerSlidingTabStrip$d	// class@00092a
{

    public void c$a(String p0,LiveTabView p1){
       super(p0, p1);
    }
    public void k(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       super.k(p0);
       this.e().setText(p0);
       return;
    }
}
