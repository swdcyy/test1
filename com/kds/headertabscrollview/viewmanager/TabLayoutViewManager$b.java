package com.kds.headertabscrollview.viewmanager.TabLayoutViewManager$b;
import com.google.android.material.tabs.d$b;
import com.kds.headertabscrollview.viewmanager.TabLayoutViewManager;
import com.kds.headertabscrollview.layout.TabsView;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.android.material.tabs.CustomTabView;
import android.content.Context;
import android.widget.HorizontalScrollView;
import android.view.View;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.widget.TextView;

public final class TabLayoutViewManager$b implements d$b	// class@00073a
{
    public final TabLayoutViewManager a;
    public final TabsView b;

    public void TabLayoutViewManager$b(TabLayoutViewManager p0,TabsView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(TabLayout$f p0,int p1){
       a.q(p0, "tab");
       TabLayout$f g = p0.g;
       a.h(g, "tab.parent");
       CustomTabView uCustomTabVi = new CustomTabView(g.getContext());
       p0.k(uCustomTabVi);
       int i = this.b.getTabTexts().size();
       if (p1 < 0) {
       }else if(i > p1){
          p0.o(this.b.getTabTexts().get(p1));
          if (this.a.normalTextSize - (float)0 > 0) {
             uCustomTabVi.getTextView().setTextSize(0, this.a.normalTextSize);
          }
       }
       return;
    }
}
