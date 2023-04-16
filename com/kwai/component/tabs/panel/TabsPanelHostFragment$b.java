package com.kwai.component.tabs.panel.TabsPanelHostFragment$b;
import com.kwai.component.tabs.panel.c$f;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.a$a;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import yg5.t0;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;
import com.kwai.component.tabs.panel.h;
import com.kwai.component.tabs.panel.h$a;
import yg5.r0;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import android.view.View;
import brd.y;
import java.lang.Integer;
import java.lang.Float;
import rkd.b;

public class TabsPanelHostFragment$b implements c$f	// class@000b69
{
    public final TabsPanelHostFragment a;

    public void TabsPanelHostFragment$b(TabsPanelHostFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment$b.class, "4")) {
          return;
       }
       TabsPanelHostFragment$b ta = this.a;
       if (ta.F != null && ta.Uh()) {
          this.a.F.onPanelCloseEvent(0);
       }
       return;
    }
    public void s(boolean p0){
       TabsPanelHostFragment$b uob = TabsPanelHostFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(TabsPanelHostFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, TabsPanelHostFragment.class, "22")) {
          TabsPanelHostFragment c = uob.C;
          if (c != null) {
             Iterator iterator = c.iterator();
             while (iterator.hasNext()) {
                iterator.next().s(p0);
             }
          }
          c = uob.H;
          if (c != null) {
             c.s(p0);
          }
          int i = 0;
          while (i < uob.v.j()) {
             if (uob.v.a(i) instanceof t0) {
                uob.v.a(i).s(p0);
             }
             i = i + 1;
          }
          Iterator iterator1 = uob.B.iterator();
          while (iterator1.hasNext()) {
             h oh = iterator1.next();
             if (oh.d() != null) {
                oh.d().b(p0, true, null);
             }
          }
       }
       TabsPanelHostFragment$b ta = this.a;
       if (ta.I.i != null) {
          ta.P.setClickable(false);
       }
       ta.Q = false;
       return;
    }
    public void t(boolean p0){
       TabsPanelHostFragment$b uob = TabsPanelHostFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.N.onNext(Boolean.valueOf(p0));
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(TabsPanelHostFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, TabsPanelHostFragment.class, "20")) {
          TabsPanelHostFragment c = uob.C;
          if (c != null) {
             Iterator iterator = c.iterator();
             while (iterator.hasNext()) {
                iterator.next().xe(p0, uob.G);
             }
          }
          c = uob.H;
          if (c != null) {
             c.xe(p0, uob.G);
          }
          boolean b = false;
          int i = 0;
          while (i < uob.v.j()) {
             if (uob.v.a(i) instanceof t0) {
                uob.v.a(i).xe(p0, uob.G);
             }
             i = i + 1;
          }
          Iterator iterator1 = uob.B.iterator();
          while (iterator1.hasNext()) {
             h oh = iterator1.next();
             if (oh.d() != null) {
                oh.d().b(p0, b, uob.G);
             }
          }
       }
       TabsPanelHostFragment$b ta = this.a;
       if (ta.I.i != null) {
          ta.P.setClickable(true);
       }
       ta.Q = true;
       return;
    }
    public void u(int p0,int p1,int p2,float p3,int p4){
       TabsPanelHostFragment$b uob = TabsPanelHostFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       if (b.g() && (b.e() || !b.c())) {
          return;
       }else {
          this.a.Wh(p0, p1, p2, p3, p4);
          return;
       }
    }
}
