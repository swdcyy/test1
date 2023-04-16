package com.kuaishou.live.core.show.hourlytrank.h$a;
import ba2.r;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import android.view.View;
import ba2.q;
import android.widget.ViewFlipper;
import ba2.p;
import java.util.Set;

public class h$a implements r	// class@000c12
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       uoa = this.a;
       if (uoa.q == p0) {
          return;
       }
       uoa.q = p0;
       h p = uoa.p;
       if (p >= null) {
          h f = uoa.F;
          if (f != null) {
             f.a(p);
          }
       }
       return;
    }
    public int b(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h$a obj = PatchProxy.apply(objArray, this, h$a.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, h.class, "49");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(obj.r == null){
          i = -1;
       }else {
          int[] ointArray = new int[2];
          obj.t.getLocationOnScreen(ointArray);
          i = ointArray[0];
       }
       return i;
    }
    public void c(){
       q.a(this);
    }
    public int d(){
       h obj = PatchProxy.apply(null, this, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.r;
       if (obj != null) {
          View currentView = obj.getCurrentView();
          if (currentView != null && (!currentView.getVisibility() && currentView.getWidth() > 0)) {
             return currentView.getWidth();
          }
       }
       return 0;
    }
    public void e(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "5")) {
          return;
       }
       this.a.d1.remove(p0);
       return;
    }
    public boolean f(){
       return false;
    }
    public a g(){
       h$a obj = PatchProxy.apply(null, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj.F == null) {
          obj.F = obj.P8();
       }
       return this.a.F;
    }
    public void h(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "4")) {
          return;
       }
       this.a.d1.add(p0);
       return;
    }
}
