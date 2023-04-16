package com.frog.engine.keyboard.FrogKeyBoard;
import android.app.Activity;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.frog.engine.keyboard.FrogKeyBoard$a;
import java.lang.ref.WeakReference;
import android.app.Dialog;
import com.frog.engine.view.FrogKeyBoardView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.text.TextWatcher;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.keyboard.FrogKeyBoard$c;
import java.lang.Runnable;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import com.frog.engine.keyboard.FrogKeyBoardListener;
import com.frog.engine.keyboard.KeyBoardShowParam;
import com.frog.engine.keyboard.FrogKeyBoard$b;
import com.frog.engine.keyboard.FrogKeyBoard$d;

public class FrogKeyBoard	// class@001544
{
    public WeakReference mActivity;
    public FrogKeyBoardListener mFrogKeyBoardListener;
    public FrogKeyBoardView mFrogKeyBoardView;
    public Dialog mKeyBoardDialog;
    public TextWatcher mTextWatcher;
    public int mWindowHeight;
    public Handler mainHandler;

    public void FrogKeyBoard(Activity p0){
       super();
       this.mWindowHeight = 0;
       this.mainHandler = new Handler(Looper.getMainLooper());
       this.mTextWatcher = new FrogKeyBoard$a(this);
       this.mActivity = new WeakReference(p0);
    }
    public static Dialog access$202(FrogKeyBoard p0,Dialog p1){
       p0.mKeyBoardDialog = p1;
       return p1;
    }
    public static FrogKeyBoardView access$302(FrogKeyBoard p0,FrogKeyBoardView p1){
       p0.mFrogKeyBoardView = p1;
       return p1;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, FrogKeyBoard.class, "2")) {
          return;
       }
       FrogKeyBoard tmActivity = this.mActivity;
       if (tmActivity != null) {
          tmActivity.clear();
       }
       tmActivity = this.mFrogKeyBoardView;
       if (tmActivity != null && tmActivity.getEditText() != null) {
          this.mFrogKeyBoardView.getEditText().removeTextChangedListener(this.mTextWatcher);
       }
       this.mainHandler.removeCallbacksAndMessages(null);
       return;
    }
    public Activity getActivity(){
       Object[] objArray = null;
       FrogKeyBoard obj = PatchProxy.apply(objArray, this, FrogKeyBoard.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mActivity;
       if (obj == null || (obj.get() != null && !this.mActivity.get().isFinishing())) {
          objArray = this.mActivity.get();
       }
    label_0032 :
       return objArray;
    }
    public void hideKeyBoard(){
       if (PatchProxy.applyVoid(null, this, FrogKeyBoard.class, "4")) {
          return;
       }
       this.mainHandler.post(new FrogKeyBoard$c(this));
       return;
    }
    public void hideRealKeyboard(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       InputMethodManager systemServic = p0.getSystemService("input_method");
       View currentFocus = p0.getCurrentFocus();
       if (currentFocus == null) {
          currentFocus = new View(p0);
       }
       systemServic.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
       FrogKeyBoard tmFrogKeyBoa = this.mFrogKeyBoardListener;
       if (tmFrogKeyBoa != null) {
          FrogKeyBoard tmFrogKeyBoa1 = this.mFrogKeyBoardView;
          if (tmFrogKeyBoa1 != null) {
             tmFrogKeyBoa.onKeyBoardComplete(tmFrogKeyBoa1.getEditText().getText().toString());
          }
       }
       return;
    }
    public void setFrogKeyBoardListener(FrogKeyBoardListener p0){
       this.mFrogKeyBoardListener = p0;
    }
    public void showKeyBoard(KeyBoardShowParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard.class, "3")) {
          return;
       }
       this.mainHandler.post(new FrogKeyBoard$b(this, p0));
       return;
    }
    public void showKeyboard(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogKeyBoard.class, "7")) {
          return;
       }
       if (p0 != null && p1 != null) {
          p1.requestFocus();
          p0.getSystemService("input_method").toggleSoftInput(2, 0);
       }
       return;
    }
    public void updateKeyboard(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard.class, "5")) {
          return;
       }
       this.mainHandler.post(new FrogKeyBoard$d(this, p0));
       return;
    }
}
