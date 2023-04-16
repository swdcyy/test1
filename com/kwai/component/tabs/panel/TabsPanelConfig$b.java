package com.kwai.component.tabs.panel.TabsPanelConfig$b;
import java.lang.Object;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import com.kwai.component.tabs.panel.TabsPanelConfig$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import yg5.u0;
import java.lang.IllegalArgumentException;
import yg5.j0;
import yg5.q0;
import java.util.List;

public class TabsPanelConfig$b	// class@000b66
{
    public TabsPanelConfig a;

    public void TabsPanelConfig$b(){
       super();
       this.a = new TabsPanelConfig(null);
    }
    public TabsPanelConfig a(){
       u0 ou0;
       TabsPanelConfig tabsPanelCon = TabsPanelConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TabsPanelConfig$b obj = PatchProxy.apply(null, this, TabsPanelConfig$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj.a == null) {
          TabsPanelConfig k = obj.k;
          if (k == TabsPanelConfig$Style.STYLE1) {
             ou0 = PatchProxy.apply(null, null, tabsPanelCon, "2");
             if (ou0 != patchProxyRe) {
             }else {
                ou0 = new u0(0x7f0d15a7, 0x7f0a3cc0, 0x7f0a3cbe);
                ou0.b(R.id.tabs_panel_close);
                ou0.c(R.id.tabs_panel_title_layout_stub);
             }
             obj.a = ou0;
          }else if(k == TabsPanelConfig$Style.STYLE2){
             ou0 = PatchProxy.apply(null, null, tabsPanelCon, "3");
             if (ou0 != patchProxyRe) {
             }else {
                ou0 = new u0(0x7f0d15a8, 0x7f0a3cc0, 0x7f0a3cbe);
                ou0.b(R.id.tabs_panel_close_top);
                ou0.c(R.id.tabs_panel_title_layout_stub);
             }
             obj.a = ou0;
          }else if(k == TabsPanelConfig$Style.STYLE_AI_TEXT){
             ou0 = PatchProxy.apply(null, null, tabsPanelCon, "4");
             if (ou0 != patchProxyRe) {
             }else {
                ou0 = new u0(0x7f0d15a9, 0x7f0a3cc0, 0x7f0a3cbe);
                ou0.b(R.id.tabs_panel_close);
                ou0.c(R.id.tabs_panel_title_layout_stub);
             }
             obj.a = ou0;
          }else if(k == TabsPanelConfig$Style.DEFAULT){
             obj.a = TabsPanelConfig.a();
          }
       }else if(obj.k == TabsPanelConfig$Style.DEFAULT){
          throw new IllegalArgumentException("only default style panel support tabsPanelViewProvider param ");
       }
       return this.a;
    }
    public TabsPanelConfig$b b(Object p0){
       this.a.c = p0;
       return this;
    }
    public TabsPanelConfig$b c(boolean p0){
       this.a.q = p0;
       return this;
    }
    public TabsPanelConfig$b d(boolean p0){
       this.a.i = p0;
       return this;
    }
    public TabsPanelConfig$b e(boolean p0){
       this.a.h = p0;
       return this;
    }
    public TabsPanelConfig$b f(j0 p0){
       this.a.f = p0;
       return this;
    }
    public TabsPanelConfig$b g(q0 p0){
       this.a.b = p0;
       return this;
    }
    public TabsPanelConfig$b h(boolean p0){
       this.a.l = p0;
       return this;
    }
    public TabsPanelConfig$b i(TabsPanelConfig$Style p0){
       this.a.k = p0;
       return this;
    }
    public TabsPanelConfig$b j(boolean p0){
       this.a.r = p0;
       return this;
    }
    public TabsPanelConfig$b k(List p0){
       this.a.g = p0;
       return this;
    }
}
