package com.kuaishou.tuna_core.krn.c;
import erd.g;
import java.lang.String;
import com.kwai.kds.krn.api.page.KwaiKrnBottomSheetFragment;
import java.lang.Object;
import by5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import com.kuaishou.tuna_core.krn.TunaKrnUtils;
import java.util.Objects;
import java.util.List;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$listenLiveEndEvent$1$1;
import msd.a;
import java.lang.Throwable;
import c15.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class c implements g	// class@0010d7
{
    public final String b;
    public final KwaiKrnBottomSheetFragment c;

    public void c(String p0,KwaiKrnBottomSheetFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(a.g(String.valueOf(p0.a), this.b) && p0.b == 1){
          try{
             this.c.dismissAllowingStateLoss();
          }catch(java.lang.Exception e3){
             Objects.requireNonNull(TunaKrnUtils.b);
             b.e(KsLogTunaCoreTag.TUNA_BUTTON.appendTag(TunaKrnUtils.a), TunaKrnUtils$Companion$listenLiveEndEvent$1$1.INSTANCE, e3);
             ExceptionHandler.handleCaughtException(e3);
          }
       }
    }
}
