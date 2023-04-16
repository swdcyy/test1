package com.frog.engine.keyboard.FrogKeyBoard$b$b;
import android.view.View$OnClickListener;
import com.frog.engine.keyboard.FrogKeyBoard$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.keyboard.KeyBoardShowParam;
import com.frog.engine.keyboard.FrogKeyBoard;
import android.widget.EditText;
import com.frog.engine.view.FrogKeyBoardView;
import android.text.Editable;
import com.frog.engine.keyboard.FrogKeyBoardListener;

public class FrogKeyBoard$b$b implements View$OnClickListener	// class@00153f
{
    public final FrogKeyBoard$b a;

    public void FrogKeyBoard$b$b(FrogKeyBoard$b p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard$b$b.class, "1")) {
          return;
       }
       FrogKeyBoard$b$b ta = this.a;
       if (ta.a.confirmHold == null) {
          ta.b.hideKeyBoard();
       }
       FrogKeyBoard$b b = this.a.b;
       if (b.mFrogKeyBoardListener != null) {
          FrogKeyBoard mFrogKeyBoar = b.mFrogKeyBoardView;
          if (mFrogKeyBoar != null && mFrogKeyBoar.getEditText() != null) {
             b = this.a.b;
             b.mFrogKeyBoardListener.onKeyBoardConfirm(b.mFrogKeyBoardView.getEditText().getText().toString());
          }
       }
       return;
    }
}
