package com.frog.engine.keyboard.FrogKeyBoard$a;
import android.text.TextWatcher;
import com.frog.engine.keyboard.FrogKeyBoard;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.keyboard.FrogKeyBoardListener;
import java.lang.CharSequence;

public class FrogKeyBoard$a implements TextWatcher	// class@00153d
{
    public final FrogKeyBoard a;

    public void FrogKeyBoard$a(FrogKeyBoard p0){
       this.a = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard$a.class, "1")) {
          return;
       }
       FrogKeyBoard mFrogKeyBoar = this.a.mFrogKeyBoardListener;
       if (mFrogKeyBoar != null) {
          mFrogKeyBoar.onKeyBoardInput(p0.toString());
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
