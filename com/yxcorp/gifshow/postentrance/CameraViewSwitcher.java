package com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$c;
import nsd.u;
import ezb.f;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$e;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$clickListener$1;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$longClickListener$1;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$a;
import msd.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$b;
import android.view.View$OnLongClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import ekd.q$b;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$d;
import kotlin.Pair;
import java.util.Map;
import java.util.Iterator;
import java.lang.Boolean;
import java.util.Objects;

public class CameraViewSwitcher	// class@001005
{
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashMap d;
    public final HashMap e;
    public final CameraViewSwitcher$d f;
    public View$OnClickListener g;
    public View$OnLongClickListener h;
    public boolean i;
    public final f j;
    public final View k;
    public static final CameraViewSwitcher$c l;

    static {
       CameraViewSwitcher.l = new CameraViewSwitcher$c(null);
    }
    public void CameraViewSwitcher(f p0,View p1){
       a.p(p0, "defaultCameraItem");
       a.p(p1, "rootView");
       super();
       this.j = p0;
       this.k = p1;
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new CameraViewSwitcher$e();
       p0.g();
       p1.setOnClickListener(new CameraViewSwitcher$a(new CameraViewSwitcher$clickListener$1(this)));
       p1.setOnLongClickListener(new CameraViewSwitcher$b(new CameraViewSwitcher$longClickListener$1(this)));
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewSwitcher.class, "7")) {
          return;
       }
       a.p(p0, "item");
       int i = 0;
       Object[] objArray = new Object[i];
       g.C().w("CameraViewSwitcher", "closeItem "+p0.d(), objArray);
       if (a.g(p0, this.j)) {
          return;
       }
       if (this.b.contains(p0)) {
          Object[] objArray1 = new Object[i];
          g.C().w("CameraViewSwitcher", "pending special icons", objArray1);
          this.b.remove(p0);
          return;
       }else if(!this.a.contains(p0)){
          Object[] objArray2 = new Object[i];
          g.C().w("CameraViewSwitcher", "no items", objArray2);
          return;
       }else {
          f uof = this.e();
          this.a.remove(p0);
          if (a.g(uof, p0)) {
             this.j(uof, this.e());
          }
          return;
       }
    }
    public final View$OnClickListener b(){
       return this.g;
    }
    public final View$OnLongClickListener c(){
       return this.h;
    }
    public final f d(){
       return this.j;
    }
    public final f e(){
       CameraViewSwitcher obj = PatchProxy.apply(null, this, CameraViewSwitcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.isEmpty()) {
          obj = this.j;
       }else {
          obj = this.a;
          obj = obj.get((obj.size() - 1));
          a.o(obj, "items[items.size - 1]");
       }
       return obj;
    }
    public final void f(f p0,q$b p1,CameraViewSwitcher$d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CameraViewSwitcher.class, "8")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "predicate");
       a.p(p2, "delegate");
       this.h(this.d, p0, p1, p2);
       return;
    }
    public final void g(f p0,q$b p1,CameraViewSwitcher$d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CameraViewSwitcher.class, "9")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "predicate");
       a.p(p2, "delegate");
       this.h(this.e, p0, p1, p2);
       return;
    }
    public final void h(HashMap p0,f p1,q$b p2,CameraViewSwitcher$d p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CameraViewSwitcher.class, "15")) {
          return;
       }
       ArrayList uArrayList = p0.get(p1);
       if (uArrayList == null) {
          uArrayList = new ArrayList();
       }
       uArrayList.add(new Pair(p2, p3));
       p0.put(p1, uArrayList);
       return;
    }
    public final void i(View$OnClickListener p0){
       this.g = p0;
    }
    public void j(f p0,f p1){
       Iterator iterator;
       Pair pair;
       CameraViewSwitcher uCameraViewS = CameraViewSwitcher.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCameraViewS, "13")) {
          return;
       }
       a.p(p0, "previousItem");
       a.p(p1, "currentItem");
       if (a.g(p1, p0) ^ 0x01) {
          Object[] objArray = new Object[0];
          g.C().w("CameraViewSwitcher", "switchItem, previousItem: "+p0.d()+' '+"currentItem: "+p1.d(), objArray);
          CameraViewSwitcher$d uod = PatchProxy.applyTwoRefs(p0, p1, this, uCameraViewS, "14");
          if (uod != PatchProxyResult.class) {
          }else {
             ArrayList uArrayList = this.e.get(p0);
             if (uArrayList != null) {
                iterator = uArrayList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      pair = iterator.next();
                      if (pair.getFirst().a(p1)) {
                         uod = pair.getSecond();
                         break ;
                      }
                   }
                }
             }
             uArrayList = this.d.get(p1);
             if (uArrayList != null) {
                iterator = uArrayList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      pair = iterator.next();
                      if (pair.getFirst().a(p0)) {
                         uod = pair.getSecond();
                      }else {
                         continue ;
                      }
                   }
                }
             }
             uod = this.f;
          }
          uod.a(p0.c(), p1.c());
          p0.f();
          p1.g();
       }
       return;
    }
    public void k(f p0){
       int b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CameraViewSwitcher uCameraViewS = CameraViewSwitcher.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCameraViewS, "6")) {
          return;
       }
       String str = "item";
       a.p(p0, str);
       int i = 0;
       Object[] objArray = new Object[i];
       g.C().w("CameraViewSwitcher", "tryShowOrRefresh "+p0.d(), objArray);
       Object obj = PatchProxy.applyOneRefs(p0, this, uCameraViewS, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, str);
          b = a.g(this.e(), p0);
       }
       if (b) {
          objArray1 = new Object[i];
          g.C().w("CameraViewSwitcher", "refresh", objArray1);
          p0.i();
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uCameraViewS, "5")){
          a.p(p0, str);
          Object[] objArray2 = new Object[i];
          g.C().w("CameraViewSwitcher", "tryShow "+p0.d(), objArray2);
          if (!this.a.contains(p0) && !this.b.contains(p0)) {
             Object[] objArray3 = null;
             objArray1 = PatchProxy.apply(objArray3, this, uCameraViewS, "12");
             if (objArray1 != patchProxyRe) {
             }else if(this.c.isEmpty()){
                CameraViewSwitcher tc = this.c;
                objArray3 = tc.get((tc.size() - 1));
             }
             objArray1 = objArray3;
             if (objArray1 != null && objArray1.a(p0) > 0) {
                objArray1 = new Object[i];
                g.C().w("CameraViewSwitcher", "add pendingList", objArray1);
                this.b.add(p0);
             }else {
                f uof = this.e();
                CameraViewSwitcher$c l = CameraViewSwitcher.l;
                CameraViewSwitcher ta = this.a;
                Objects.requireNonNull(l);
                if (!PatchProxy.applyVoidTwoRefs(p0, ta, l, CameraViewSwitcher$c.class, "1") && !ta.contains(p0)) {
                   int i1 = ta.size();
                   b = ta.size();
                   while (i < b) {
                      Object obj1 = ta.get(i);
                      a.o(obj1, "itemList[i]");
                      if (p0.a(obj1) <= 0) {
                         i1 = i;
                         break ;
                      }
                      i = i + 1;
                   }
                   ta.add(i1, p0);
                }
                this.j(uof, this.e());
             }
          }
       }
       return;
    }
}
