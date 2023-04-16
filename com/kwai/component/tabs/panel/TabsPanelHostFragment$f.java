package com.kwai.component.tabs.panel.TabsPanelHostFragment$f;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import com.kwai.component.tabs.panel.h;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.tabs.panel.h$a;
import yg5.r0;
import yg5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.tabs.panel.a$b;
import yg5.k0;

public class TabsPanelHostFragment$f extends b	// class@000b6d
{
    public final h d;
    public final TabsPanelHostFragment e;

    public void TabsPanelHostFragment$f(TabsPanelHostFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3,h p4){
       this.e = p0;
       this.d = p4;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       TabsPanelHostFragment$f uof = TabsPanelHostFragment$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "1")) {
          return;
       }
       if (this.d.d() != null) {
          this.d.d().a(this.e.G);
       }
       if (this.d.b() != null) {
          this.d.b().a(p1);
       }
       p0.E = true;
       if (p1 instanceof a$b) {
          p1.I4(this.d.c());
       }
       return;
    }
}
