package com.kwai.component.tabs.panel.TabsPanelHostFragment$d;
import android.view.View$OnClickListener;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.a$a;

public class TabsPanelHostFragment$d implements View$OnClickListener	// class@000b6b
{
    public final TabsPanelHostFragment b;

    public void TabsPanelHostFragment$d(TabsPanelHostFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment$d.class, "1")) {
          return;
       }
       TabsPanelHostFragment f = this.b.F;
       if (f != null) {
          f.onPanelCloseEvent(1);
       }
       return;
    }
}
