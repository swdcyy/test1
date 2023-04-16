package com.facebook.react.views.modal.ReactModalHostView;
import com.facebook.react.bridge.LifecycleEventListener;
import android.view.ViewGroup;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.UiThreadUtil;
import android.app.Dialog;
import android.app.Activity;
import mf.a;
import com.kwai.robust.PatchProxyResult;
import android.content.ContextWrapper;
import android.view.ViewParent;
import java.util.ArrayList;
import android.view.View;
import java.lang.Integer;
import android.view.Window;
import android.content.DialogInterface$OnShowListener;
import com.facebook.react.views.modal.ReactModalHostView$a;
import android.content.DialogInterface$OnKeyListener;
import od.a;
import android.view.WindowManager$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewStructure;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.Number;
import android.widget.FrameLayout;
import com.facebook.react.views.modal.ReactModalHostView$b;

public class ReactModalHostView extends ViewGroup implements LifecycleEventListener	// class@0013ce
{
    public ReactModalHostView$DialogRootViewGroup b;
    public Dialog c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;
    public boolean h;
    public DialogInterface$OnShowListener i;
    public ReactModalHostView$b j;

    public void ReactModalHostView(Context p0){
       super(p0);
       p0.addLifecycleEventListener(this);
       this.b = new ReactModalHostView$DialogRootViewGroup(p0);
    }
    public final void a(){
       Context baseContext;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactModalHostView.class, "9")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       ReactModalHostView tc = this.c;
       if (tc != null) {
          if (tc.isShowing()) {
             Context context = this.c.getContext();
             Object[] objArray1 = PatchProxy.applyTwoRefs(context, Activity.class, objArray, a.class, "1");
             if (objArray1 == PatchProxyResult.class) {
                while (true) {
                   if (!Activity.class.isInstance(context)) {
                      if (context instanceof ContextWrapper) {
                         baseContext = context.getBaseContext();
                         if (context != baseContext) {
                            context = baseContext;
                         }
                      }
                      objArray1 = objArray;
                   }else {
                      baseContext = context;
                   }
                }
             }
             if (objArray1 == null || !objArray1.isFinishing()) {
                this.c.dismiss();
             }
          }
          this.c = objArray;
          this.b.getParent().removeViewAt(0);
       }
       return;
    }
    public void addChildrenForAccessibility(ArrayList p0){
    }
    public void addView(View p0,int p1){
       if (PatchProxy.isSupport(ReactModalHostView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ReactModalHostView.class, "3")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.b.addView(p0, p1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "8")) {
          return;
       }
       this.getContext().removeLifecycleEventListener(this);
       this.a();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "13")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.c != null) {
          if (this.h != null) {
             this.a();
          }else {
             this.d();
             return;
          }
       }
       this.h = false;
       int i = 0x7f110368;
       if ((this.f).equals("fade")) {
          i = 0x7f110369;
       }else if((this.f).equals("slide")){
          i = 0x7f11036a;
       }
       Activity currentActiv = this.getCurrentActivity();
       Context context = (currentActiv == null)? this.getContext(): currentActiv;
       Dialog uDialog = new Dialog(context, i);
       this.c = uDialog;
       Window window = uDialog.getWindow();
       window.setFlags(8, 8);
       this.c.setContentView(this.getContentView());
       this.d();
       this.c.setOnShowListener(this.i);
       this.c.setOnKeyListener(new ReactModalHostView$a(this));
       this.c.getWindow().setSoftInputMode(16);
       if (this.g != null) {
          this.c.getWindow().addFlags(0x1000000);
       }
       if (currentActiv != null && !currentActiv.isFinishing()) {
          this.c.show();
          if (context instanceof Activity) {
             this.c.getWindow().getDecorView().setSystemUiVisibility(context.getWindow().getDecorView().getSystemUiVisibility());
          }
          this.c.getWindow().clearFlags(8);
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "16")) {
          return;
       }
       a.d(this.c, "mDialog must exist when we call updateProperties");
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv != null) {
          int i = 1024;
          if (currentActiv.getWindow().getAttributes().flags & i) {
             this.c.getWindow().addFlags(i);
          }else {
             this.c.getWindow().clearFlags(i);
          }
       }
       if (this.d != null) {
          this.c.getWindow().clearFlags(2);
       }else {
          this.c.getWindow().setDimAmount(0x3f000000);
          this.c.getWindow().setFlags(2, 2);
       }
       return;
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       return false;
    }
    public void dispatchProvideStructure(ViewStructure p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostView.class, "1")) {
          return;
       }
       this.b.dispatchProvideStructure(p0);
       return;
    }
    public View getChildAt(int p0){
       if (PatchProxy.isSupport(ReactModalHostView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactModalHostView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.getChildAt(p0);
    }
    public int getChildCount(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getChildCount();
    }
    public final View getContentView(){
       FrameLayout obj = PatchProxy.apply(null, this, ReactModalHostView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrameLayout(this.getContext());
       obj.addView(this.b);
       if (this.e != null) {
          obj.setSystemUiVisibility(1024);
       }else {
          obj.setFitsSystemWindows(true);
       }
       return obj;
    }
    public final Activity getCurrentActivity(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext().getCurrentActivity();
    }
    public Dialog getDialog(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "11")) {
          return;
       }
       this.b();
       return;
    }
    public void onHostPause(){
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView.class, "10")) {
          return;
       }
       this.c();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostView.class, "6")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.b.removeView(p0);
       return;
    }
    public void removeViewAt(int p0){
       if (PatchProxy.isSupport(ReactModalHostView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactModalHostView.class, "7")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.b.removeView(this.getChildAt(p0));
       return;
    }
    public void setAnimationType(String p0){
       this.f = p0;
       this.h = true;
    }
    public void setHardwareAccelerated(boolean p0){
       this.g = p0;
       this.h = true;
    }
    public void setOnRequestCloseListener(ReactModalHostView$b p0){
       this.j = p0;
    }
    public void setOnShowListener(DialogInterface$OnShowListener p0){
       this.i = p0;
    }
    public void setStatusBarTranslucent(boolean p0){
       this.e = p0;
       this.h = true;
    }
    public void setTransparent(boolean p0){
       this.d = p0;
    }
}
