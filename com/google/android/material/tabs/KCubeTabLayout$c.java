package com.google.android.material.tabs.KCubeTabLayout$c;
import com.google.android.material.tabs.TabLayout$d;
import com.google.android.material.tabs.KCubeTabLayout;
import java.lang.Object;
import com.google.android.material.tabs.NasaTabView;
import vn5.d;
import java.lang.String;
import wq6.f;
import com.google.android.material.tabs.TabLayout$f;
import android.os.SystemClock;
import com.yxcorp.utility.Log;
import android.view.View;
import wq6.h;
import yq6.d;
import qn5.a;
import com.google.android.material.tabs.c;
import java.lang.Boolean;
import yq6.a;
import msd.l;
import wq6.g;
import com.google.android.material.tabs.KCubeTabLayout$e;
import jk.v;
import z1.a;
import com.kwai.kcube.TabIdentifier;
import xr6.c$a;
import xr6.c;
import zq6.b;
import rn5.a;
import zq6.p;
import sn5.e;
import java.lang.CharSequence;
import sn5.g;
import java.util.Map;
import com.google.android.material.tabs.b;

public class KCubeTabLayout$c implements TabLayout$d	// class@0016b6
{
    public TabLayout$f b;
    public long c;
    public final KCubeTabLayout d;

    public void KCubeTabLayout$c(KCubeTabLayout p0){
       this.d = p0;
       super();
    }
    public static void a(KCubeTabLayout$c p0,NasaTabView p1,int p2,d p3){
       p0.b(p1, p2, p3);
    }
    private void b(NasaTabView p0,int p1,d p2){
       boolean b = this.d.l0(p0);
       boolean b1 = ("userScroll").equals(this.d.r.D0());
       boolean b2 = (this.d.o == p1)? true: false;
       p2.a(b, b1, b2);
       return;
    }
    public void H7(TabLayout$f p0){
    }
    public void sf(TabLayout$f p0){
       int i = p0.c();
       if (p0 == this.b && (SystemClock.elapsedRealtime() - this.c) - 1000 < 0) {
          Log.g("KCubeTabLayout", "onTabReselected Throttled");
          return;
       }else {
          this.b = p0;
          this.c = SystemClock.elapsedRealtime();
          NasaTabView nasaTabView = p0.a();
          h oh = p0.d();
          if (oh == null) {
             return;
          }
          if (this.d.r.d().d(oh, a.c, c.b, Boolean.FALSE).booleanValue()) {
             KCubeTabLayout$c td = this.d;
             td.s.d(i, nasaTabView, td.r.j());
          }
          return;
       }
    }
    public void ua(TabLayout$f p0){
       int i = p0.c();
       View view = p0.a();
       h oh = p0.d();
       this.d.r.d().b(oh, a.b, new v(this, view, i));
       KCubeTabLayout r = this.d.r;
       TabIdentifier tabIdentifie = oh.M2();
       String str = (this.d.o == i)? "tabClick": "userScroll";
       r.V(tabIdentifie, c.a(str).a());
       KCubeTabLayout$c td = this.d;
       if (td.o != i) {
          td.s.b(i, false, td.g0(i), this.d.r.U(i));
       }
       if (this.d.l0(view) && this.d.s.c()) {
          b uob = this.d.r.y();
          e uoe = uob.e(oh, a.i);
          if (uoe != null && (uoe.a != null && !uoe.e())) {
             this.d.s.a(i, view, oh, view.getCurrentBadgeStatus(), view.getText(), e.d());
             view.d(e.d());
          }
       label_00a4 :
          g og = uob.e(oh, a.k);
          if (og != null && og.a != null) {
             og = g.a();
             this.d.s.e(i, view, oh, og);
             this.d.t.get(view).e(og);
          }
       }
    label_00ca :
       this.d.Y();
       return;
    }
}
