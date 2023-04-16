package com.kuaishou.live.gzone.treasurebox.k;
import p53.q1;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.gzone.treasurebox.k$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.j;
import crd.b;
import ok.h;
import lnc.b9;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import com.kuaishou.live.gzone.treasurebox.k$b;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class k	// class@001c74
{
    public k$b a;
    public b b;
    public List c;
    public final q1 d;
    public final k$a e;

    public void k(q1 p0){
       super();
       this.c = new ArrayList();
       this.e = new k$a(this);
       this.d = p0;
    }
    public int a(){
       return this.e.a;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       if (this.e.g != null) {
          return;
       }
       this.d();
       this.b = b9.c(this.b, new j(this));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.e.g = true;
       b9.a(this.b);
       this.c.clear();
       this.e.i = null;
       return;
    }
    public boolean d(){
       k ok = k.class;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, ok, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.a();
       Iterator iterator = this.c.iterator();
       int i1 = 0;
       Object[] objArray1 = objArray;
       int i2 = 0;
       int i3 = 0;
       while (iterator.hasNext()) {
          LiveTreasureBoxModel liveTreasure = iterator.next();
          if (objArray1 == null && liveTreasure.getBoxStatus() != LiveTreasureBoxModel$BoxStatus.OPENED) {
             objArray1 = liveTreasure;
          }
          i2 = i2 | liveTreasure.onWatchedTimeChanged(i, true);
          if (liveTreasure.getBoxStatus() == LiveTreasureBoxModel$BoxStatus.OPENED) {
             i1 = i1 + 1;
          }else if(liveTreasure.getBoxStatus() == LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN || liveTreasure.getBoxStatus() == LiveTreasureBoxModel$BoxStatus.OPENING){
             i3 = i3 + 1;
          }
       }
       obj = this.e;
       obj.f = i1;
       k$a i4 = obj.i;
       if (i4 != null && i4.getBoxStatus() != LiveTreasureBoxModel$BoxStatus.OPENED) {
          objArray1 = this.e.i;
       }
       if (!PatchProxy.applyVoidOneRefs(objArray1, this, ok, "7")) {
          obj = this.e;
          if (obj.h != objArray1) {
             obj.h = objArray1;
             obj = this.a;
             if (obj != null) {
                obj.d(objArray1);
             }
          }
       }
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), this, ok, "6")) {
          obj = this.a;
          if (obj != null) {
             k$a e = this.e.e;
             if (e != i3) {
                obj.b(e, i3);
             }
          }
          this.e.e = i3;
       }
       this.d.a("¡¾LiveWatchedTimeHelper¡¿updateBoxesStatus£ºapplied:"+i2+", mHasAllOpened:"+this.e.a()+" watchedTime:"+this.a()+" readyCount:"+i3);
       if (!PatchProxy.applyVoid(objArray, this, ok, "8")) {
          ok = this.a;
          if (ok != null) {
             ok.c(this.a(), this.e.a());
          }
       }
       return i2;
    }
}
