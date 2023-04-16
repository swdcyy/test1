package com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a;
import java.lang.Runnable;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.button.TunaButton;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager;
import android.app.Activity;
import com.kuaishou.tuna_core.button.TunaButton$Companion;

public final class TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a implements Runnable	// class@0010cd
{
    public final TunaButtonModel b;
    public final TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a c;

    public void TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a(TunaButtonModel p0,TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a.class, "1")) {
          return;
       }
       TunaButton.a.c(this.c.b.this$0.b, this.b);
       PatchProxy.onMethodExit(TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a.class, "1");
       return;
    }
}
