package com.kwai.feature.post.api.widget.SoftInputPopupWindow;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Window;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t46.y;
import a2.z;
import a2.i0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kwai.feature.post.api.widget.SoftInputPopupWindow$1;
import androidx.lifecycle.LifecycleObserver;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.ViewTreeObserver;
import android.graphics.Rect;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.widget.SoftInputPopupWindow$a;

public final class SoftInputPopupWindow extends PopupWindow implements ViewTreeObserver$OnGlobalLayoutListener	// class@001484
{
    public final View b;
    public SoftInputPopupWindow$a c;
    public final int d;
    public int e;
    public boolean f;
    public final Activity g;

    public void SoftInputPopupWindow(Activity p0){
       a.p(p0, "activity");
       super(p0);
       this.g = p0;
       View view = new View(p0);
       this.b = view;
       this.d = n.j(p0);
       this.f = true;
       this.setContentView(view);
       this.a();
       this.setBackgroundDrawable(new ColorDrawable(0));
       this.setWidth(0);
       Window window = p0.getWindow();
       a.o(window, "activity.window");
       view = window.getDecorView();
       a.o(view, "activity.window.decorView");
       this.setHeight(((view.getHeight() - n.q(p0)) - 100));
       this.setSoftInputMode(2064);
       this.setInputMethodMode(true);
       view = this.getContentView();
       a.o(view, "contentView");
       if (PatchProxy.applyVoidOneRefs(view, this, SoftInputPopupWindow.class, "1")) {
       }else {
          i0.I0(view, new y(this));
       }
       if (!p0 instanceof FragmentActivity) {
          p0 = null;
       }
       if (p0 != null) {
          Lifecycle lifecycle = p0.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(new SoftInputPopupWindow$1(this));
          }
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SoftInputPopupWindow.class, "2")) {
          return;
       }
       int i = 1002;
       if (Build$VERSION.SDK_INT < 23) {
          try{
             Field declaredFiel = PopupWindow.class.getDeclaredField("mWindowLayoutType");
             a.o(declaredFiel, "mWindowLayoutTypeField");
             declaredFiel.setAccessible(true);
             declaredFiel.set(this, Integer.valueOf(i));
          }catch(java.lang.Exception e0){
             PostUtils.D("ListenKeyboardPopupWindow", "setWindowLayoutType", e0);
          }
       }
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, SoftInputPopupWindow.class, "5")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       super.dismiss();
       return;
    }
    public void onGlobalLayout(){
       SoftInputPopupWindow tc;
       if (PatchProxy.applyVoid(null, this, SoftInputPopupWindow.class, "6")) {
          return;
       }
       Rect rect = new Rect();
       this.b.getWindowVisibleDisplayFrame(rect);
       rect = rect.bottom;
       double d = 0x3fd999999999999a;
       Object[] objArray = new Object[0];
       p3.D().w("SoftInputPopupWindow", "onGlobalLayout keyboardOffset = "+rect+", screenHeight = "+this.d+", screenHeight * 0.85 = "+((double)this.d * 0x3feb333333333333)+", screenHeight * 0.4 = "+((double)this.d * d), objArray);
       double d1 = (double)rect;
       SoftInputPopupWindow td = this.d;
       if (d1 - ((double)td * 0x3feb333333333333) < 0) {
          if (d1 - ((double)td * d) > 0) {
             int i = td - rect;
             Object[] objArray1 = new Object[0];
             p3.D().w("SoftInputPopupWindow", "onGlobalLayout onKeyboardVisibilityListener?.onKeyboardShow keyboardHeight "+i, objArray1);
             if (this.e != i || this.f == null) {
                this.e = i;
                tc = this.c;
                if (tc != null) {
                   tc.a(i);
                }
                this.f = true;
             }
          }
       }else {
          Object[] objArray2 = new Object[0];
          p3.D().w("SoftInputPopupWindow", "onGlobalLayout onKeyboardVisibilityListener?.onKeyboardHide", objArray2);
          if (this.f != null) {
             tc = this.c;
             if (tc != null) {
                tc.b();
             }
             this.f = false;
          }
       }
       return;
    }
}
