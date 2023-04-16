package com.frog.engine.keyboard.FrogKeyBoard$b$c;
import android.view.View$OnClickListener;
import com.frog.engine.keyboard.FrogKeyBoard$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.keyboard.FrogKeyBoard;

public class FrogKeyBoard$b$c implements View$OnClickListener	// class@001540
{
    public final FrogKeyBoard$b a;

    public void FrogKeyBoard$b$c(FrogKeyBoard$b p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoard$b$c.class, "1")) {
          return;
       }
       this.a.b.hideKeyBoard();
       return;
    }
}
