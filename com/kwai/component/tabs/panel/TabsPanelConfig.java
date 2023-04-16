package com.kwai.component.tabs.panel.TabsPanelConfig;
import java.lang.Object;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import com.kwai.component.tabs.panel.TabsPanelConfig$a;
import yg5.u0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class TabsPanelConfig	// class@000b67
{
    public u0 a;
    public q0 b;
    public Object c;
    public o0 d;
    public e0 e;
    public j0 f;
    public List g;
    public boolean h;
    public boolean i;
    public int j;
    public TabsPanelConfig$Style k;
    public boolean l;
    public boolean m;
    public long n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;

    public void TabsPanelConfig(){
       super();
       this.k = TabsPanelConfig$Style.DEFAULT;
    }
    public void TabsPanelConfig(TabsPanelConfig$a p0){
       super();
       this.k = TabsPanelConfig$Style.DEFAULT;
    }
    public static u0 a(){
       u0 obj = PatchProxy.apply(null, null, TabsPanelConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new u0(0x7f0d15a5, 0x7f0a3cc0, 0x7f0a3cbe);
       obj.b(R.id.tabs_panel_close);
       obj.c(R.id.tabs_panel_title_layout_stub);
       return obj;
    }
    public TabsPanelConfig$Style b(){
       return this.k;
    }
}
