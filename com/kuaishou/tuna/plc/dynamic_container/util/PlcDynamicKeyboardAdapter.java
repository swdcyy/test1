package com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicKeyboardAdapter;
import o07.d$a;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicKeyboardAdapter$mNeedAdapterWithoutFocusedView$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import iy4.b;
import androidx.fragment.app.Fragment;
import android.widget.RelativeLayout;
import android.view.View;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.LinkedBlockingQueue;
import android.widget.EditText;
import android.view.ViewGroup;
import ekd.i;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.lang.Boolean;
import a27.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import lnc.a1;
import android.view.Window;
import o07.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import kotlin.jvm.internal.a;
import my4.b;
import java.lang.Enum;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class PlcDynamicKeyboardAdapter implements d$a, LifecycleEventObserver	// class@000ffb
{
    public PlcDynamicContainerFragment b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public final p g;
    public final p h;

    public void PlcDynamicKeyboardAdapter(){
       super();
       this.g = s.c(PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2.INSTANCE);
       this.h = s.c(PlcDynamicKeyboardAdapter$mNeedAdapterWithoutFocusedView$2.INSTANCE);
    }
    public void a(int p0){
       PlcDynamicKeyboardAdapter plcDynamicKe = PlcDynamicKeyboardAdapter.class;
       if (PatchProxy.isSupport(plcDynamicKe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, plcDynamicKe, "9")) {
          return;
       }
       this.d = p0;
       int i = 1;
       boolean b = false;
       int b1 = (p0 > 0)? true: false;
       this.c = b1;
       this.e = b;
       if (this.c() || (!this.d() || p0 <= 0)) {
          return;
       }else {
          PlcDynamicKeyboardAdapter tb = this.b;
          if (tb != null) {
             PlcDynamicContainerLayout plcDynamicCo = tb.Za();
             if (plcDynamicCo != null) {
                b uob = tb.Ge();
                if (uob != null) {
                   Fragment page = uob.getPage();
                   if (page != null) {
                      float translationY = plcDynamicCo.getTranslationY();
                      int i1 = 0;
                      if (!translationY - i1) {
                         return;
                      }else {
                         View view = page.getView();
                         Object obj = null;
                         int[] obj1 = PatchProxy.applyOneRefs(view, obj, PlcDynamicUtils.class, "20");
                         if (obj1 != PatchProxyResult.class) {
                            obj = obj1;
                         }else if(view == null){
                            LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
                            linkedBlocki.offer(view);
                            while (!linkedBlocki.isEmpty()) {
                               view = linkedBlocki.poll();
                               if (view instanceof EditText) {
                                  obj = view;
                                  break ;
                               }else if(view instanceof ViewGroup){
                                  view = view.getFocusedChild();
                                  if (view != null) {
                                     linkedBlocki.offer(view);
                                  }
                               }
                            }
                         }
                         if (obj != null) {
                            if (!this.c()) {
                               this.e = b;
                               return;
                            }else {
                               obj1 = new int[2];
                               obj.getLocationInWindow(obj1);
                               int i2 = obj1[i];
                               int i3 = (!i.c())? n.A(a.b()): 0;
                               obj1[i] = i2 - i3;
                               int i4 = obj1[i] + obj.getHeight();
                               b1 = tb.sa();
                               if (b1 > 0) {
                                  float f = (float)(i4 - (b1 - p0));
                                  if (f - i1 <= 0) {
                                     i = false;
                                  }
                                  this.e = i;
                                  if (i) {
                                     translationY = translationY - f;
                                     plcDynamicCo.b(translationY);
                                     PlcDynamicLogger.c("focus edit was found, container view offsetKeyboard: "+translationY+", keyboardHeight:"+p0);
                                  }
                               }
                            }
                         }else if(!this.d()){
                            this.e = b;
                            return;
                         }else {
                            this.e = i;
                            i = tb.sa();
                            float f1 = (float)(i - p0) - ((float)i - plcDynamicCo.getAnchorTranslationY());
                            plcDynamicCo.b(f1);
                            PlcDynamicLogger.c("focus edit is null, offset container view : "+f1+", keyboardHeight:"+p0);
                         }
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public void b(int p0){
       PlcDynamicKeyboardAdapter plcDynamicKe = PlcDynamicKeyboardAdapter.class;
       if (PatchProxy.isSupport(plcDynamicKe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, plcDynamicKe, "10")) {
          return;
       }
       this.d = p0;
       this.c = false;
       if (this.e == null) {
          return;
       }
       plcDynamicKe = this.b;
       if (plcDynamicKe != null) {
          PlcDynamicContainerLayout plcDynamicCo = plcDynamicKe.Za();
          if (plcDynamicCo != null) {
             plcDynamicCo.f(false);
          }
       }
       return;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicKeyboardAdapter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.g.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicKeyboardAdapter.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.h.getValue();
       }
       return obj.booleanValue();
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicKeyboardAdapter.class, "8")) {
          return;
       }
       PlcDynamicKeyboardAdapter tb = this.b;
       if (tb != null) {
          View view = tb.getView();
          if (view != null) {
             c.d(view);
          }
       }
       if (this.f == null) {
          this.c = false;
       }
       return;
    }
    public final boolean f(){
       return this.c;
    }
    public final void g(boolean p0){
       PlcDynamicKeyboardAdapter plcDynamicKe = PlcDynamicKeyboardAdapter.class;
       if (PatchProxy.isSupport(plcDynamicKe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, plcDynamicKe, "7")) {
          return;
       }
       plcDynamicKe = this.b;
       FragmentActivity activity = (plcDynamicKe != null)? plcDynamicKe.getActivity(): null;
       if (!a1.i(activity)) {
          return;
       }else {
          plcDynamicKe = this.b;
          if (plcDynamicKe != null) {
             activity = plcDynamicKe.getActivity();
             if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                   if (p0) {
                      d.b(window, this);
                      p0 = true;
                   }else {
                      d.c(window, this);
                      p0 = false;
                   }
                   this.f = p0;
                }
             }
          }
          return;
       }
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       boolean b;
       PlcDynamicKeyboardAdapter tb;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcDynamicKeyboardAdapter.class, "11")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       int i = b.a[p1.ordinal()];
       b = true;
       if (i != b) {
          if (i != 2) {
             if (i == 3 && !PatchProxy.applyVoid(null, this, PlcDynamicKeyboardAdapter.class, "6")) {
                this.g(false);
                tb = this.b;
                if (tb != null) {
                   Lifecycle lifecycle = tb.getLifecycle();
                   if (lifecycle != null) {
                      lifecycle.removeObserver(this);
                   }
                }
                this.b = null;
             }
          }else if(PatchProxy.applyVoid(null, this, PlcDynamicKeyboardAdapter.class, "5")){
             this.e();
             if (this.f()) {
                tb = this.b;
                if (tb != null) {
                   PlcDynamicContainerLayout plcDynamicCo = tb.nh();
                   if (plcDynamicCo != null) {
                      plcDynamicCo.f(false);
                   }
                }
             }
          }
       }else if(PatchProxy.applyVoid(null, this, PlcDynamicKeyboardAdapter.class, "4")){
          this.g(b);
       }
       return;
    }
}
