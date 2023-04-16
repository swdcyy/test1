package com.frog.engine.keyboard.FrogKeyBoard$c;
import java.lang.Runnable;
import com.frog.engine.keyboard.FrogKeyBoard;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.app.Dialog;
import com.frog.engine.view.FrogKeyBoardView;

public class FrogKeyBoard$c implements Runnable	// class@001542
{
    public final FrogKeyBoard a;

    public void FrogKeyBoard$c(FrogKeyBoard p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogKeyBoard$c.class, "1")) {
          return;
       }
       Activity activity = this.a.getActivity();
       if (activity == null) {
          return;
       }
       this.a.hideRealKeyboard(activity);
       FrogKeyBoard mKeyBoardDia = this.a.mKeyBoardDialog;
       if (mKeyBoardDia != null) {
          mKeyBoardDia.dismiss();
          FrogKeyBoard.access$202(this.a, null);
          FrogKeyBoard.access$302(this.a, null);
       }
       return;
    }
}
