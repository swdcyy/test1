package com.yxcorp.gifshow.homepage.kcube.k$b;
import vn5.d;
import com.yxcorp.gifshow.homepage.kcube.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import lnc.b9;
import tkd.b;
import tkd.d;
import lv5.c;
import com.yxcorp.gifshow.model.FollowTabNotify;
import lv5.b;
import wq6.h;
import zr6.e;
import wq6.f;
import on5.b;
import xr6.c$a;
import xr6.c;
import com.kwai.kcube.TabIdentifier;

public class k$b implements d	// class@001738
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, k$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("HomeTabLifecycleAwareness", "onBottomTabSelected: "+p0, objArray);
       b9.a(this.a.i);
       if (p0 && (p1 || (p2 && this.a.g == 3))) {
          FollowTabNotify uFollowTabNo = d.a(-242212848).YB();
          if (uFollowTabNo != null) {
             uFollowTabNo.mClickType = 2;
          }
          this.a.n().V(b.c, c.a("FollowRedPoint").a());
       }
    label_007a :
       return;
    }
    public void b(boolean p0,boolean p1){
    }
}
