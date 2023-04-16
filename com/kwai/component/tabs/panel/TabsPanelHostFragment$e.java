package com.kwai.component.tabs.panel.TabsPanelHostFragment$e;
import android.view.View$OnClickListener;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.a$a;

public class TabsPanelHostFragment$e implements View$OnClickListener	// class@000b6c
{
    public final TabsPanelHostFragment b;

    public void TabsPanelHostFragment$e(TabsPanelHostFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment$e.class, "1")) {
          return;
       }
       this.b.F.onPanelCloseEvent(3);
       return;
    }
}
