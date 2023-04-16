package com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow;
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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.ViewTreeObserver;
import android.graphics.Rect;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow$a;

public final class ListenKeyboardPopupWindow extends PopupWindow implements ViewTreeObserver$OnGlobalLayoutListener	// class@001651
{
    public final View b;
    public ListenKeyboardPopupWindow$a c;
    public final int d;
    public final Activity e;

    public void ListenKeyboardPopupWindow(Activity p0){
       a.p(p0, "activity");
       super(p0);
       this.e = p0;
       View view = new View(p0);
       this.b = view;
       this.d = n.t(p0);
       this.setContentView(view);
       this.a();
       this.setBackgroundDrawable(new ColorDrawable(0));
       this.setWidth(0);
       Window window = p0.getWindow();
       a.o(window, "activity.window");
       view = window.getDecorView();
       a.o(view, "activity.window.decorView");
       this.setHeight(((view.getHeight() - n.q(p0)) - 100));
       this.setSoftInputMode(16);
       this.setInputMethodMode(1);
       if (!p0 instanceof FragmentActivity) {
          p0 = null;
       }
       if (p0 != null) {
          Lifecycle lifecycle = p0.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(new ListenKeyboardPopupWindow$1(this));
          }
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ListenKeyboardPopupWindow.class, "1")) {
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
       if (PatchProxy.applyVoid(null, this, ListenKeyboardPopupWindow.class, "4")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       super.dismiss();
       return;
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ListenKeyboardPopupWindow.class, "5")) {
          return;
       }
       Rect rect = new Rect();
       this.b.getWindowVisibleDisplayFrame(rect);
       rect = rect.bottom;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("ListenKeyboardPopupWindow", "onGlobalLayout keyboardOffset = "+rect+", screenHeight = "+this.d+", screenHeight * 0.85 = "+((double)this.d * 0x3feb333333333333)+", screenHeight * 0.4 = "+((double)this.d * 0x3fd999999999999a), objArray);
       double d = (double)rect;
       ListenKeyboardPopupWindow td = this.d;
       if (d - ((double)td * 0x3feb333333333333) < 0) {
          if (d - ((double)td * 0x3fd999999999999a) > 0) {
             Object[] objArray1 = new Object[i];
             a.D().w("ListenKeyboardPopupWindow", "onGlobalLayout onKeyboardVisibilityListener?.onKeyboardShow", objArray1);
             ListenKeyboardPopupWindow tc = this.c;
             if (tc != null) {
                tc.a(rect);
             }
          }
       }else {
          Object[] objArray2 = new Object[i];
          a.D().w("ListenKeyboardPopupWindow", "onGlobalLayout onKeyboardVisibilityListener?.onKeyboardHide", objArray2);
          ListenKeyboardPopupWindow tc1 = this.c;
          if (tc1 != null) {
             tc1.b();
          }
       }
       return;
    }
}
