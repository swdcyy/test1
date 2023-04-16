package com.kuaishou.live.common.core.component.multipk.game.vc.a;
import ws1.c;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import jt1.b;
import z0.a;
import androidx.lifecycle.Transformations;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ys1.a;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;
import android.view.View;
import android.view.ViewGroup;
import xs1.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import xs1.c;
import xs1.d;
import ws1.e;
import ws1.b;

public class a extends ViewController implements c	// class@0015ec
{
    public final HashMap j;
    public final boolean k;
    public final LiveData l;

    public void a(boolean p0,boolean p1,LiveData p2){
       super();
       this.j = new HashMap();
       this.k = p0;
       this.l = Transformations.distinctUntilChanged(Transformations.map(p2, new b(p1)));
    }
    public void F2(){
       c uoc;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cc2);
       a uoa = new a();
       this.j.put(LiveMultiPKAreaType.PROGRESS, uoa);
       this.y2(this.P2(), uoa);
       uoa = this.k;
       a tl = this.l;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(Boolean.valueOf(uoa), tl, objArray, uob, "1");
          if (uoc != PatchProxyResult.class) {
          }else if(uoa != null){
             uoc = new c(tl);
          }else {
             uoc = new d(tl);
          }
       }else {
          goto label_0044 ;
       }
       this.j.put(LiveMultiPKAreaType.BANGS, uoc);
       this.y2(this.P2(), uoc);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.j.clear();
       return;
    }
    public void n(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       b uob = this.j.get(p0.w1());
       if (uob != null) {
          uob.n(p0);
       }
       return;
    }
    public void w(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b uob = this.j.get(p0.w1());
       if (uob != null) {
          uob.w(p0);
       }
       return;
    }
}
