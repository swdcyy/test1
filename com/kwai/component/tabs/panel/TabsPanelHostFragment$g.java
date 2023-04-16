package com.kwai.component.tabs.panel.TabsPanelHostFragment$g;
import yg5.b0;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import com.kwai.component.tabs.panel.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.tabs.panel.c;
import com.kwai.component.tabs.panel.a$a;
import brd.t;
import yg5.r0;
import yg5.t0;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import android.view.View;
import lnc.a1;

public class TabsPanelHostFragment$g implements b0	// class@000b6e
{
    public final h a;
    public final TabsPanelHostFragment b;

    public void TabsPanelHostFragment$g(TabsPanelHostFragment p0,h p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, TabsPanelHostFragment$g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.T.c();
    }
    public void Y(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment$g.class, "4")) {
          return;
       }
       TabsPanelHostFragment f = this.b.F;
       if (f != null) {
          f.a(2, this.a);
       }
       return;
    }
    public t a(){
       return this.b.N;
    }
    public r0 b(){
       return this.b.G;
    }
    public void c(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment$g.class, "1")) {
          return;
       }
       this.b.C.add(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment$g.class, "6")) {
          return;
       }
       TabsPanelHostFragment$g ta = this.a;
       if (ta == null) {
          throw new UnsupportedOperationException("switchToThisTab is not support in panel TabsPanelController");
       }
       TabsPanelHostFragment$g tb = this.b;
       tb.Fh(tb.B.indexOf(ta));
       return;
    }
    public boolean e(){
       return this.b.Q;
    }
    public void f(t0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment$g.class, "2")) {
          return;
       }
       this.b.C.remove(p0);
       return;
    }
    public void g(int p0){
       TabsPanelHostFragment$g og = TabsPanelHostFragment$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "3")) {
          return;
       }
       View view = this.b.s.findViewById(R.id.tabs_panel_tab_root);
       if (view != null) {
          view.setVisibility(0);
          if (p0 <= 0) {
             view.setAlpha(0);
          }else {
             float f = 48.00f;
             if (p0 <= a1.e(f) && p0 > 0) {
                view.setAlpha(((float)p0 / (float)a1.e(f)));
             }else {
                view.setAlpha(0x3f800000);
             }
          }
       }
       return;
    }
}
