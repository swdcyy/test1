package com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.Integer;
import android.graphics.Rect;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow$a;

public final class ListenKeyboardPopupWindow extends PopupWindow implements ViewTreeObserver$OnGlobalLayoutListener	// class@000797
{
    public final View b;
    public ListenKeyboardPopupWindow$a c;
    public final int d;
    public int e;
    public final Activity f;

    public void ListenKeyboardPopupWindow(Activity p0){
       super(p0);
       this.f = p0;
       View view = new View(p0);
       this.b = view;
       this.d = n.t(p0);
       this.setContentView(view);
       this.a();
       this.setBackgroundDrawable(new ColorDrawable(0));
       this.setWidth(0);
       this.setHeight(((p0.getWindow().getDecorView().getHeight() - n.q(p0)) - 100));
       this.setSoftInputMode(16);
       this.setInputMethodMode(1);
       view.getViewTreeObserver().addOnGlobalLayoutListener(this);
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
       try{
          if (Build$VERSION.SDK_INT < 23) {
             Field declaredFiel = PopupWindow.class.getDeclaredField("mWindowLayoutType");
             declaredFiel.setAccessible(true);
             declaredFiel.set(this, Integer.valueOf(1002));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, ListenKeyboardPopupWindow.class, "3")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       super.dismiss();
       return;
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ListenKeyboardPopupWindow.class, "4")) {
          return;
       }
       Rect rect = new Rect();
       this.b.getWindowVisibleDisplayFrame(rect);
       rect = rect.bottom;
       if (this.e == rect) {
          return;
       }
       this.e = rect;
       double d = (double)rect;
       ListenKeyboardPopupWindow td = this.d;
       if (d - ((double)td * 0x3fe999999999999a) < 0) {
          if (d - ((double)td * 0x3fd999999999999a) > 0) {
             ListenKeyboardPopupWindow tc = this.c;
             if (tc != null) {
                tc.a(rect);
             }
          }
       }else {
          ListenKeyboardPopupWindow tc1 = this.c;
          if (tc1 != null) {
             tc1.b();
          }
       }
       return;
    }
}
