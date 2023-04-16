package com.frog.engine.keyboard.FrogKeyBoard$b$a;
import android.widget.TextView$OnEditorActionListener;
import com.frog.engine.keyboard.FrogKeyBoard$b;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.frog.engine.keyboard.FrogKeyBoard;
import android.widget.EditText;
import com.frog.engine.view.FrogKeyBoardView;
import android.text.Editable;
import com.frog.engine.keyboard.FrogKeyBoardListener;
import com.frog.engine.keyboard.KeyBoardShowParam;

public class FrogKeyBoard$b$a implements TextView$OnEditorActionListener	// class@00153e
{
    public final FrogKeyBoard$b a;

    public void FrogKeyBoard$b$a(FrogKeyBoard$b p0){
       this.a = p0;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(FrogKeyBoard$b$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, FrogKeyBoard$b$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       int i = 3;
       if (p1 != i && (p1 != 6 && (p1 != 5 && (p1 == i || p1 == 4)))) {
          FrogKeyBoard$b b = this.a.b;
          if (b.mFrogKeyBoardListener != null) {
             FrogKeyBoard mFrogKeyBoar = b.mFrogKeyBoardView;
             if (mFrogKeyBoar != null && mFrogKeyBoar.getEditText() != null) {
                b = this.a.b;
                b.mFrogKeyBoardListener.onKeyBoardConfirm(b.mFrogKeyBoardView.getEditText().getText().toString());
             }
          }
          FrogKeyBoard$b$a ta = this.a;
          if (ta.a.confirmHold == null) {
             ta.b.hideKeyBoard();
          }
       }
       return false;
    }
}
