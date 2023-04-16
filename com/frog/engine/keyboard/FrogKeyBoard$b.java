package com.frog.engine.keyboard.FrogKeyBoard$b;
import java.lang.Runnable;
import com.frog.engine.keyboard.FrogKeyBoard;
import com.frog.engine.keyboard.KeyBoardShowParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.app.Dialog;
import com.frog.engine.view.FrogKeyBoardView;
import android.content.Context;
import android.widget.EditText;
import android.text.TextWatcher;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.frog.engine.keyboard.FrogKeyBoard$b$a;
import android.widget.TextView$OnEditorActionListener;
import android.widget.TextView;
import com.frog.engine.keyboard.FrogKeyBoard$b$b;
import android.view.View$OnClickListener;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.View;
import android.view.WindowManager$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.frog.engine.keyboard.FrogKeyBoard$b$c;
import android.widget.FrameLayout;

public class FrogKeyBoard$b implements Runnable	// class@001541
{
    public final KeyBoardShowParam a;
    public final FrogKeyBoard b;

    public void FrogKeyBoard$b(FrogKeyBoard p0,KeyBoardShowParam p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       int i2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrogKeyBoard$b.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity == null) {
          return;
       }
       FrogKeyBoard mKeyBoardDia = this.b.mKeyBoardDialog;
       if (mKeyBoardDia != null) {
          mKeyBoardDia.dismiss();
          FrogKeyBoard.access$202(this.b, objArray);
          FrogKeyBoard.access$302(this.b, objArray);
       }
       FrogKeyBoard.access$302(this.b, new FrogKeyBoardView(activity));
       this.b.mFrogKeyBoardView.setParam(this.a);
       this.b.mFrogKeyBoardView.getEditText().addTextChangedListener(this.b.mTextWatcher);
       int i = 1;
       int i1 = 0;
       if (!TextUtils.isEmpty(this.a.confirmType)) {
          KeyBoardShowParam confirmType = this.a.confirmType;
          Objects.requireNonNull(confirmType);
          FrogKeyBoard$b uob = 4;
          switch (confirmType.hashCode()){
              case 0xc9fa65a8:
                if (confirmType.equals("search")) {
                   i2 = 0;
                }
                break;
              case 3304:
                if (confirmType.equals("go")) {
                   i2 = 1;
                }
                break;
              case 0x2f2382:
                if (confirmType.equals("done")) {
                   i2 = 2;
                }
                break;
              case 0x338af3:
                if (confirmType.equals("next")) {
                   i2 = 3;
                }
                break;
              case 0x35cf88:
                if (confirmType.equals("send")) {
                   i2 = 4;
                }
                break;
              default:
             label_0068 :
                i2 = -1;
          }
          FrogKeyBoard$b$a uob$a = 6;
          switch (i2){
              case 0:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(3);
                break;
              case 1:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(2);
                break;
              case 2:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(uob$a);
                break;
              case 3:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(5);
                break;
              case 4:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(uob);
                break;
              default:
                this.b.mFrogKeyBoardView.getEditText().setImeOptions(uob$a);
          }
       }
       this.b.mFrogKeyBoardView.getEditText().setOnEditorActionListener(new FrogKeyBoard$b$a(this));
       this.b.mFrogKeyBoardView.getTextView().setOnClickListener(new FrogKeyBoard$b$b(this));
       FrogKeyBoard.access$202(this.b, new Dialog(this.b.getActivity()));
       Window window = this.b.mKeyBoardDialog.getWindow();
       if (Build$VERSION.SDK_INT >= 29) {
          window.getDecorView().setSystemUiVisibility(1280);
          window.setStatusBarColor(i1);
       }else {
          window.addFlags(0x4000000);
       }
       window.requestFeature(i);
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.width = -1;
       attributes.height = -1;
       window.setAttributes(attributes);
       window.setGravity(i1);
       window.setBackgroundDrawableResource(0x106000d);
       FrogKeyBoard$b tb = this.b;
       tb.mKeyBoardDialog.setContentView(tb.mFrogKeyBoardView, new FrameLayout$LayoutParams(-1, -1));
       window.setLayout(-1, -1);
       this.b.mKeyBoardDialog.show();
       FrogKeyBoard$b tb1 = this.b;
       tb1.showKeyboard(activity, tb1.mFrogKeyBoardView.getEditText());
       this.b.mFrogKeyBoardView.setOnClickListener(new FrogKeyBoard$b$c(this));
       return;
    }
}
