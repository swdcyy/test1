package com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a;
import oj0.a;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import i05.b;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a implements a	// class@0010ce
{
    public final TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2 b;

    public void TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a(TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2 p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a.class, "1")) {
          return;
       }
       String str = (p0 != null)? p0.get("actionModel"): null;
       if (str instanceof String) {
          TunaButtonModel tunaButtonMo = b.b(str, TunaButtonModel.class, KsLogTunaCoreTag.TUNA_KRN.appendTag("TunaKrnBottomDialog_TunaButtonAction"));
          if (tunaButtonMo != null) {
             k1.o(new TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2$a$a(tunaButtonMo, this));
          }
       }
       return;
    }
}
