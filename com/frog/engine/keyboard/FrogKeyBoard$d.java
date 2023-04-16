package com.frog.engine.keyboard.FrogKeyBoard$d;
import java.lang.Runnable;
import com.frog.engine.keyboard.FrogKeyBoard;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import com.frog.engine.view.FrogKeyBoardView;
import java.lang.CharSequence;
import android.text.TextUtils;

public class FrogKeyBoard$d implements Runnable	// class@001543
{
    public final String a;
    public final FrogKeyBoard b;

    public void FrogKeyBoard$d(FrogKeyBoard p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogKeyBoard$d.class, "1")) {
          return;
       }
       FrogKeyBoard$d tb = this.b;
       if (tb.mActivity == null) {
          return;
       }
       FrogKeyBoard mFrogKeyBoar = tb.mFrogKeyBoardView;
       if (mFrogKeyBoar != null) {
          EditText editText = mFrogKeyBoar.getEditText();
          String str = (TextUtils.isEmpty(this.a))? "": this.a;
          editText.setText(str);
       }
       return;
    }
}
