package com.yxcorp.gifshow.listcomponent.layoutmanager.ViewLifeCycleHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$c;
import java.lang.Boolean;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ViewLifeCycleHelper$STATUS;
import w0b.i;
import java.util.HashMap;

public class ViewLifeCycleHelper	// class@001a77
{
    public final HashMap a;
    public final i b;
    public final VirtualLayoutManager c;
    public int d;

    public void a(){
       ViewLifeCycleHelper obj;
       boolean b;
       if (PatchProxy.applyVoid(null, this, ViewLifeCycleHelper.class, "1")) {
          return;
       }
       int i = 0;
       while (i < this.c.getChildCount()) {
          View childAt = this.c.getChildAt(i);
          if (this.d == null) {
             this.d = c.c(childAt.getContext().getResources()).heightPixels;
          }
          ViewLifeCycleHelper$STATUS sTATUS = 1;
          if (this.c.r.h == sTATUS) {
             if (childAt.getTop() <= 0 && (childAt.getBottom() >= 0 && this.d(childAt))) {
                this.f(childAt);
             }else if(childAt.getTop() <= this.d && (childAt.getBottom() >= this.d && this.c(childAt))){
                this.e(childAt);
             }
          }else if(childAt.getTop() <= 0 && (childAt.getBottom() >= 0 && this.c(childAt))){
             this.e(childAt);
          }else if(childAt.getTop() <= this.d && (childAt.getBottom() >= this.d && this.d(childAt))){
             this.f(childAt);
          }
          if (childAt.getTop() >= 0 && childAt.getBottom() <= this.d) {
             if (this.c(childAt)) {
                this.e(childAt);
             }else {
                obj = PatchProxy.applyOneRefs(childAt, this, ViewLifeCycleHelper.class, "6");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(this.b(childAt) == ViewLifeCycleHelper$STATUS.APPEARING){
                   sTATUS = null;
                }
                b = sTATUS;
                if (b != null && !PatchProxy.applyVoidOneRefs(childAt, this, ViewLifeCycleHelper.class, "7")) {
                   sTATUS = ViewLifeCycleHelper$STATUS.APPEARED;
                   if (this.b(childAt) != sTATUS) {
                      this.g(childAt, sTATUS);
                      obj = this.b;
                      if (obj != null) {
                         obj.a(childAt);
                      }
                   }
                }
             }
          }else if(childAt.getBottom() <= 0 || childAt.getTop() >= this.d){
             if (this.d(childAt)) {
                this.f(childAt);
             }else {
                ViewLifeCycleHelper$STATUS obj1 = PatchProxy.applyOneRefs(childAt, this, ViewLifeCycleHelper.class, "10");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(this.b(childAt) == ViewLifeCycleHelper$STATUS.DISAPPEARING){
                   sTATUS = null;
                }
                obj1 = sTATUS;
                if (b != null && !PatchProxy.applyVoidOneRefs(childAt, this, ViewLifeCycleHelper.class, "11")) {
                   sTATUS = ViewLifeCycleHelper$STATUS.DISAPPEARED;
                   if (this.b(childAt) != sTATUS) {
                      this.g(childAt, sTATUS);
                      obj = this.b;
                      if (obj != null) {
                         obj.d(childAt);
                      }
                   }
                }
             }
          }
       label_013d :
          i = i + 1;
       }
       return;
    }
    public final ViewLifeCycleHelper$STATUS b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewLifeCycleHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.containsKey(p0)) {
          return this.a.get(p0);
       }
       ViewLifeCycleHelper$STATUS dISAPPEARED = ViewLifeCycleHelper$STATUS.DISAPPEARED;
       this.a.put(p0, dISAPPEARED);
       return dISAPPEARED;
    }
    public final boolean c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewLifeCycleHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b(p0) == ViewLifeCycleHelper$STATUS.DISAPPEARED)? true: false;
       return b;
    }
    public final boolean d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewLifeCycleHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b(p0) == ViewLifeCycleHelper$STATUS.APPEARED)? true: false;
       return b;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewLifeCycleHelper.class, "5")) {
          return;
       }
       ViewLifeCycleHelper$STATUS aPPEARING = ViewLifeCycleHelper$STATUS.APPEARING;
       if (this.b(p0) == aPPEARING) {
          return;
       }
       this.g(p0, aPPEARING);
       ViewLifeCycleHelper tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       return;
    }
    public final void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewLifeCycleHelper.class, "9")) {
          return;
       }
       ViewLifeCycleHelper$STATUS dISAPPEARING = ViewLifeCycleHelper$STATUS.DISAPPEARING;
       if (this.b(p0) == dISAPPEARING) {
          return;
       }
       this.g(p0, dISAPPEARING);
       ViewLifeCycleHelper tb = this.b;
       if (tb != null) {
          tb.c(p0);
       }
       return;
    }
    public final void g(View p0,ViewLifeCycleHelper$STATUS p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewLifeCycleHelper.class, "3")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
}
