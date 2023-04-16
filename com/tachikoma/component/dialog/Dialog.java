package com.tachikoma.component.dialog.Dialog;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.content.Context;
import java.util.ArrayList;
import java.lang.String;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ln8.a;
import java.lang.Boolean;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.AlertDialog$Builder;
import com.tachikoma.component.dialog.Dialog$b;
import android.content.DialogInterface$OnClickListener;
import com.tachikoma.component.dialog.Dialog$a;
import android.content.DialogInterface$OnDismissListener;
import android.app.AlertDialog;
import android.widget.Button;
import com.tachikoma.component.dialog.Dialog$e;
import com.tachikoma.component.dialog.Dialog$d;
import com.tachikoma.component.dialog.Dialog$c;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.tachikoma.core.component.e;
import android.view.View;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import java.util.List;
import com.tachikoma.core.component.view.TKView;
import gx4.f$a;
import gx4.e;
import yp8.a;
import jq8.a;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaAlign;
import android.util.DisplayMetrics;
import iq8.n;
import op8.a;
import java.util.Objects;
import no8.a;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import com.tachikoma.component.dialog.Dialog$f;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.graphics.drawable.ColorDrawable;
import iq8.p;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.tachikoma.core.component.TKYogaLayout;
import com.tachikoma.component.dialog.Dialog$g;
import android.view.ViewGroup;
import zp8.a;

public class Dialog extends TKBaseNativeModule	// class@000cf6
{
    public boolean cancelable;
    public final Context f;
    public V8Object g;
    public boolean h;
    public AlertDialog mDialog;
    public JsValueRef mOnDismissRef;
    public JsValueRef mOnMaskClickRef;
    public final List mV8ValueList;
    public boolean mask;
    public String maskColor;
    public V8Function ondismiss;
    public V8Function onmaskclick;

    public void Dialog(f p0){
       super(p0);
       this.h = false;
       this.cancelable = true;
       this.mask = true;
       this.f = this.getContext();
       this.mV8ValueList = new ArrayList();
    }
    public void alert(String p0,String p1,V8Function p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Dialog.class, "4")) {
          return;
       }
       this.h = false;
       if (a.c.booleanValue() && p2 != null) {
          p2.setFunctionName("Dialog_alert");
       }
       JsValueRef jsValueRef = y.b(p2, this);
       if (TextUtils.isEmpty(p1)) {
          p1 = this.f.getString(0x104000a);
       }
       AlertDialog uAlertDialog = new AlertDialog$Builder(this.f).setCancelable(this.cancelable).setMessage(p0).setPositiveButton(p1, new Dialog$b(this, jsValueRef)).setOnDismissListener(new Dialog$a(this, jsValueRef)).create();
       this.mDialog = uAlertDialog;
       uAlertDialog.show();
       this.mDialog.getButton(-1).setTextColor(0xff000000);
       return;
    }
    public void confirm(String p0,String p1,String p2,String p3,V8Function p4,V8Function p5){
       Dialog uDialog = Dialog.class;
       if (PatchProxy.isSupport(uDialog)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uDialog, "5")) {
             return;
          }
       }
       this.h = false;
       if (a.c.booleanValue()) {
          if (p4 != null) {
             p4.setFunctionName("Dialog_okCallback");
          }
          if (p5 != null) {
             p5.setFunctionName("Dialog_cancelCallback");
          }
       }
       JsValueRef jsValueRef = y.b(p4, this);
       JsValueRef jsValueRef1 = y.b(p5, this);
       if (TextUtils.isEmpty(p2)) {
          p2 = this.f.getString(0x104000a);
       }
       if (TextUtils.isEmpty(p3)) {
          p3 = this.f.getString(0x1040000);
       }
       AlertDialog uAlertDialog = new AlertDialog$Builder(this.f).setCancelable(this.cancelable).setTitle(p0).setMessage(p1).setPositiveButton(p2, new Dialog$e(this, jsValueRef)).setNegativeButton(p3, new Dialog$d(this, jsValueRef1)).setOnDismissListener(new Dialog$c(this, jsValueRef, jsValueRef1)).create();
       this.mDialog = uAlertDialog;
       uAlertDialog.show();
       this.mDialog.getButton(-1).setTextColor(0xff000000);
       this.mDialog.getButton(-2).setTextColor(-7829368);
       return;
    }
    public void custom(V8Object p0){
       HashMap hashMap;
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog.class, "6")) {
          return;
       }
       this.h = true;
       e nativeModule = this.getNativeModule(p0);
       if (nativeModule == null || nativeModule.getView() == null) {
          a.c("Dialog customView is illegal");
          return;
       }else {
          V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.getJSContext().g(), "Dialog-customContainer");
          this.mV8ValueList.add(v8ObjectProx);
          TKView tKView = new TKView(new f$a(this.getTKContext(), v8ObjectProx).a());
          v8ObjectProx.setNativeObject(tKView);
          tKView.getDomNode().c().u(YogaJustify.CENTER);
          tKView.getDomNode().c().n(YogaAlign.CENTER);
          tKView.getDomNode().c().D((float)n.c().widthPixels);
          tKView.getDomNode().c().s((float)n.c().heightPixels);
          tKView.add(p0);
          if (a.c.booleanValue()) {
             this.g = v8ObjectProx;
             a uoa = a.n();
             String str = this.getJSContext().h();
             Dialog tg = this.g;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidTwoRefs(str, tg, uoa, a.class, "9") && a.c.booleanValue()) {
                String str1 = str+"_"+tg.v8.getHandle();
                Map map = uoa.d.get(str);
                if (map != null) {
                   Iterator iterator = map.keySet().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         String str2 = iterator.next();
                         if (!map.get(str2).v8.getHandle() - tg.v8.getHandle()) {
                            str1 = str2;
                         }
                      }
                   }
                }
                map = uoa.f.get(str);
                if (map == null) {
                   hashMap = new HashMap();
                   uoa.f.put(str, hashMap);
                }
                hashMap.put(str1, tg);
             }
          }
          AlertDialog uAlertDialog = new AlertDialog$Builder(this.f, R.style.arg_RES_7f11044e).setCancelable(this.cancelable).setView(tKView.getView()).setOnDismissListener(new Dialog$f(this, tKView, v8ObjectProx)).create();
          this.mDialog = uAlertDialog;
          uAlertDialog.show();
          if (this.mDialog.getWindow() != null) {
             if (this.mask == null) {
                this.mDialog.getWindow().setDimAmount(0);
             }
             WindowManager$LayoutParams attributes = this.mDialog.getWindow().getAttributes();
             attributes.width = -1;
             attributes.height = -1;
             this.mDialog.getWindow().setAttributes(attributes);
             if (!TextUtils.isEmpty(this.maskColor)) {
                this.mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(p.b(this.maskColor)));
             }
          }
          if (!nativeModule.getView().hasOnClickListeners()) {
             nativeModule.getView().setOnClickListener(null);
          }
          tKView.getView().setOnClickListener(new Dialog$g(this));
          return;
       }
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, Dialog.class, "7")) {
          return;
       }
       if (a.c.booleanValue() && this.g != null) {
          a uoa = a.n();
          String str = this.getJSContext().h();
          Dialog tg = this.g;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidTwoRefs(str, tg, uoa, a.class, "10")) {
             Map map = uoa.f.get(str);
             if (map != null) {
                Iterator iterator = map.keySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      String str1 = iterator.next();
                      if (!map.get(str1).v8.getHandle() - tg.v8.getHandle()) {
                         uoa.q(str, str1);
                      }
                   }
                }
             }
             uoa.s(tg.getNativeObject());
          }
          this.g = null;
       }
       Dialog tmDialog = this.mDialog;
       if (tmDialog != null) {
          tmDialog.dismiss();
       }
       return;
    }
    public void setMaskColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog.class, "1")) {
          return;
       }
       this.maskColor = p0;
       if (!TextUtils.isEmpty(p0) && this.h != null) {
          Dialog tmDialog = this.mDialog;
          if (tmDialog != null && tmDialog.getWindow() != null) {
             this.mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(p.b(p0)));
          }
       }
       return;
    }
    public void setOnDismiss(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog.class, "2")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("Dialog_ondismiss");
       }
       y.c(this.mOnDismissRef);
       this.mOnDismissRef = y.b(p0, this);
       return;
    }
    public void setOnMaskClick(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog.class, "3")) {
          return;
       }
       y.c(this.mOnMaskClickRef);
       this.mOnMaskClickRef = y.b(p0, this);
       this.onmaskclick = p0;
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, Dialog.class, "8")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.mOnDismissRef);
       y.c(this.mOnMaskClickRef);
       Iterator iterator = this.mV8ValueList.iterator();
       while (iterator.hasNext()) {
          V8Value v8Value = iterator.next();
          if (v8Value != null) {
             v8Value.setWeak();
          }
       }
       this.mV8ValueList.clear();
       return;
    }
}
