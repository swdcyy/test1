package com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment$a;
import k61.f;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import java.lang.Object;
import z61.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import k61.g;
import java.lang.Integer;
import java.util.Set;
import k61.e;

public class LiveBottomBarBasePanelFragment$a implements f	// class@000d37
{
    public final LiveBottomBarBasePanelFragment a;

    public void LiveBottomBarBasePanelFragment$a(LiveBottomBarBasePanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(b p0,boolean p1){
       LiveBottomBarBasePanelFragment$a uoa = LiveBottomBarBasePanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       LiveBottomBarBasePanelFragment f = this.a.f;
       if (f != null) {
          f.a(p0, p1);
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarBasePanelFragment$a.class, "2")) {
          return;
       }
       if (!p0 instanceof g && !this.a.g.contains(Integer.valueOf(p0.mFeatureId))) {
          this.a.g.add(Integer.valueOf(p0.mFeatureId));
          LiveBottomBarBasePanelFragment f = this.a.f;
          if (f != null) {
             f.b(p0);
          }
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarBasePanelFragment$a.class, "1")) {
          return;
       }
       LiveBottomBarBasePanelFragment f = this.a.f;
       if (f != null) {
          f.c(p0);
       }
       return;
    }
    public void d(){
       e.b(this);
    }
}
