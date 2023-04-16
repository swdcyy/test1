package cd8.e;
import cd8.f;
import android.inputmethodservice.KeyboardView$OnKeyboardActionListener;
import android.widget.EditText;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.inputmethodservice.Keyboard;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.inputmethodservice.KeyboardView;
import android.widget.PopupWindow;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import cd8.c;
import android.widget.PopupWindow$OnDismissListener;
import android.app.Activity;
import zi8.c;
import android.view.Window;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.mini.d;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.text.Editable;
import java.lang.Character;
import java.lang.CharSequence;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import cd8.d;
import java.lang.Runnable;
import cd8.f$a;

public class e implements f, KeyboardView$OnKeyboardActionListener	// class@0003f6
{
    public Keyboard a;
    public KeyboardView b;
    public PopupWindow c;
    public f$a d;
    public EditText e;
    public View f;

    public void e(EditText p0,int p1){
       super();
       this.e = p0;
       this.f = p0.getRootView();
       Context context = this.e.getContext();
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidTwoRefs(context, Integer.valueOf(p1), this, e.class, "1")) {
          this.a = new Keyboard(context, p1);
          ViewGroup viewGroup = null;
          KeyboardView keyboardView = LayoutInflater.from(context).inflate(R.layout.arg_RES_7f0d0f97, viewGroup);
          this.b = keyboardView;
          keyboardView.setKeyboard(this.a);
          this.b.setPreviewEnabled(false);
          this.b.setOnKeyboardActionListener(this);
          PopupWindow popupWindow = new PopupWindow(this.b, -1, -2);
          this.c = popupWindow;
          popupWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F8F8F8")));
          boolean b = true;
          this.c.setTouchable(b);
          this.c.setFocusable(false);
          this.c.setOutsideTouchable(false);
          this.c.setOnDismissListener(new c(this));
          if (!PatchProxy.applyVoid(viewGroup, this, e.class, "5")) {
             Activity uActivity = c.a(this.e);
             if (uActivity != null) {
                uActivity.getWindow().setSoftInputMode(3);
             }else {
                d.r(new RuntimeException("notSystemSoftInput activity is null"));
             }
             try{
                Class[] uClassArray = new Class[b];
                uClassArray[0] = Boolean.TYPE;
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", uClassArray);
                method.setAccessible(b);
                Object[] objArray = new Object[b];
                objArray[0] = Boolean.FALSE;
                method.invoke(this.e, objArray);
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
          }
       }
    }
    public void onKey(int p0,int[] p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, e.class, "6")) {
          return;
       }
       Editable text = this.e.getText();
       int selectionSta = this.e.getSelectionStart();
       if (p0 != -5) {
          if (p0 != -4 && p0 != -3) {
             if (p0) {
                switch (p0){
                    case 9994:
                      this.e.setSelection((selectionSta - 1));
                      break;
                    case 9995:
                      text.clear();
                      break;
                    case 9996:
                      if (selectionSta < this.e.length()) {
                         this.e.setSelection((selectionSta + 1));
                      }
                      break;
                    default:
                      if (selectionSta >= 0) {
                         text.insert(selectionSta, Character.toString((char)p0));
                      }
                }
             }
          }else {
             this.p2();
          }
       }else if(text != null && (text.length() > 0 && selectionSta > 0)){
          text.delete((selectionSta - 1), selectionSta);
       }
       return;
    }
    public void onPress(int p0){
    }
    public void onRelease(int p0){
    }
    public void onText(CharSequence p0){
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.e.clearFocus();
       e tc = this.c;
       if (tc != null) {
          if (tc.isShowing()) {
             if (d.f()) {
                d.a("#CustomKeyboard#", "hideKeyboard >>> 销毁键盘，恢复偏移位置。。。");
             }
             this.c.dismiss();
          }else {
             d.c("#CustomKeyboard#", "hideKeyboard >>> 键盘已经销毁了，忽略这次调用");
          }
       }
       return;
    }
    public void q2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       this.e.requestFocus();
       if (!PatchProxy.applyVoid(objArray, this, e.class, "7") && this.e.getWindowToken() != null) {
          InputMethodManager systemServic = this.e.getContext().getSystemService("input_method");
          if (systemServic != null) {
             systemServic.hideSoftInputFromWindow(this.e.getWindowToken(), 2);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, e.class, "8")) {
          e tc = this.c;
          if (tc != null && !tc.isShowing()) {
             this.b.setKeyboard(this.a);
             this.c.showAtLocation(this.f, 80, 0, 0);
             this.e.post(new d(this));
          }
       }
       return;
    }
    public void r2(f$a p0){
       if (p0 == this.d) {
          this.d = null;
       }
       return;
    }
    public void s2(f$a p0){
       this.d = p0;
    }
    public void swipeDown(){
    }
    public void swipeLeft(){
    }
    public void swipeRight(){
    }
    public void swipeUp(){
    }
}
