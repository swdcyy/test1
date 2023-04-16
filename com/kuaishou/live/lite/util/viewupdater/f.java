package com.kuaishou.live.lite.util.viewupdater.f;
import com.kuaishou.live.lite.util.viewupdater.d;
import android.view.ViewGroup;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import com.kuaishou.live.lite.util.viewupdater.d$b$a;
import java.lang.Object;
import z1.a;
import va1.a;
import com.kuaishou.live.lite.util.viewupdater.e;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import android.view.View;
import java.lang.Iterable;
import qk.m;
import vd3.e;
import ok.o;
import com.google.common.collect.ImmutableList;
import qk.t0;
import java.util.Iterator;
import java.lang.Number;
import java.lang.Integer;

public class f implements d	// class@000baf
{
    public final ViewGroup b;
    public final d$b c;
    public final Object d;
    public a e;
    public a f;

    public void f(ViewGroup p0){
       d$b uob = d$b.a.a();
       super();
       this.d = new Object();
       this.e = a.a();
       this.f = a.a();
       this.b = p0;
       this.c = uob;
       p0.setOnHierarchyChangeListener(new e(this, uob));
    }
    public void a(List p0){
       ArrayList obj3;
       int i;
       Object obj = this;
       Object obj1 = p0;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uof, "1")) {
          return;
       }
       f b = obj.b;
       if (!PatchProxy.applyVoidTwoRefs(obj1, b, obj, uof, "5")) {
          obj3 = PatchProxy.applyOneRefs(b, obj, uof, "6");
          if (obj3 != PatchProxyResult.class) {
          }else {
             i = b.getChildCount();
             ArrayList uArrayList = new ArrayList(i);
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                uArrayList.add(b.getChildAt(i2));
             }
             obj3 = uArrayList;
          }
          t0 ot0 = m.s(obj3).p(new e(obj1)).B().iterator();
          while (ot0.hasNext()) {
             b.removeView(ot0.next());
          }
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          obj3 = PatchProxy.applyThreeRefs(b, obj2, p0, this, f.class, "3");
          if (obj3 != PatchProxyResult.class) {
             i = obj3.intValue();
          }else {
             int childCount = b.getChildCount();
             int i1 = 0;
             while (true) {
                if (i1 < childCount) {
                   View childAt = b.getChildAt(i1);
                   if (childAt == obj2) {
                      i = -1;
                   }else {
                      obj3 = PatchProxy.applyThreeRefs(childAt, obj2, p0, this, f.class, "4");
                      i = (obj3 != PatchProxyResult.class)? obj3.intValue(): Integer.compare(obj1.indexOf(childAt), obj1.indexOf(obj2));
                      if (i > 0) {
                         i = i1;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }else {
                   i = childCount;
                }
             }
          }
          if (i >= 0) {
             b.addView(obj2, i);
          }else {
             continue ;
          }
       }
       return;
    }
    public ViewGroup getContainer(){
       return this.b;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.e = a.a();
       this.f = a.a();
       this.c.a(this.d);
       return;
    }
    public void setAddViewCallback(a p0){
       this.f = p0;
    }
    public void setRemoveViewCallback(a p0){
       this.e = p0;
    }
}
