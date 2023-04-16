package com.kds.headertabscrollview.layout.TabsView$b;
import com.google.android.material.tabs.TabLayout$d;
import com.kds.headertabscrollview.layout.TabsView;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kds.headertabscrollview.event.TabEvent;

public final class TabsView$b implements TabLayout$d	// class@00072e
{
    public final TabsView b;

    public void TabsView$b(TabsView p0){
       this.b = p0;
       super();
    }
    public void H7(TabLayout$f p0){
       a.q(p0, "tab");
       this.b.O(TabEvent.ON_TAB_UNSELECTED, p0.c());
       this.b.P(p0, false);
    }
    public void sf(TabLayout$f p0){
       a.q(p0, "tab");
       this.b.O(TabEvent.ON_TAB_RESELECTED, p0.c());
    }
    public void ua(TabLayout$f p0){
       a.q(p0, "tab");
       this.b.O(TabEvent.ON_TAB_SELECTED, p0.c());
       this.b.P(p0, true);
    }
}
