package a2.h;
import android.app.ActionBar;
import android.view.KeyEvent;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import a2.i0;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent$Callback;
import android.app.Dialog;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface;
import a2.h$a;
import android.view.Window$Callback;
import android.os.Build$VERSION;
import java.lang.reflect.Field;

public class h	// class@00005f
{
    public static boolean a;
    public static Method b;
    public static boolean c;
    public static Field d;

    public static boolean a(ActionBar p0,KeyEvent p1){
       Method b;
       Object[] objArray;
       int i = 1;
       if (!h.a) {
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = KeyEvent.class;
             h.b = p0.getClass().getMethod("onMenuKeyEvent", uClassArray);
             h.a = i;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static boolean b(Activity p0,KeyEvent p1){
       KeyEvent$DispatcherState keyDispatche;
       p0.onUserInteraction();
       Window window = p0.getWindow();
       if (window.hasFeature(8)) {
          ActionBar actionBar = p0.getActionBar();
          if (p1.getKeyCode() == 82 && (actionBar != null && h.a(actionBar, p1))) {
             return true;
          }
       }
       if (window.superDispatchKeyEvent(p1)) {
          return true;
       }else {
          View decorView = window.getDecorView();
          if (i0.j(decorView, p1)) {
             return true;
          }else if(decorView != null){
             keyDispatche = decorView.getKeyDispatcherState();
          }else {
             keyDispatche = null;
          }
          return p1.dispatch(p0, keyDispatche, p0);
       }
    }
    public static boolean c(Dialog p0,KeyEvent p1){
       DialogInterface$OnKeyListener onKeyListene = h.f(p0);
       if (onKeyListene != null && onKeyListene.onKey(p0, p1.getKeyCode(), p1)) {
          return true;
       }
       Window window = p0.getWindow();
       if (window.superDispatchKeyEvent(p1)) {
          return true;
       }
       View decorView = window.getDecorView();
       if (i0.j(decorView, p1)) {
          return true;
       }
       KeyEvent$DispatcherState keyDispatche = (decorView != null)? decorView.getKeyDispatcherState(): null;
       return p1.dispatch(p0, keyDispatche, p0);
    }
    public static boolean d(View p0,KeyEvent p1){
       return i0.k(p0, p1);
    }
    public static boolean e(h$a p0,View p1,Window$Callback p2,KeyEvent p3){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.superDispatchKeyEvent(p3);
       }
       if (p2 instanceof Activity) {
          return h.b(p2, p3);
       }
       if (p2 instanceof Dialog) {
          return h.c(p2, p3);
       }
       if (p1 == null || (i0.j(p1, p3) || p0.superDispatchKeyEvent(p3))) {
          b = true;
       }
       return b;
    }
    public static DialogInterface$OnKeyListener f(Dialog p0){
       Field d;
       if (!h.c) {
          boolean b = true;
          try{
             Field declaredFiel = Dialog.class.getDeclaredField("mOnKeyListener");
             h.d = declaredFiel;
             declaredFiel.setAccessible(b);
             h.c = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
}
