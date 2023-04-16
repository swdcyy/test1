package com.kuaishou.tuna_core.half_screen_webview.e;
import erd.g;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment;
import java.lang.Object;
import by5.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.half_screen_webview.a;
import msd.a;
import java.lang.Throwable;
import c15.b;
import wz4.i;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.tuna_core.half_screen_webview.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements g	// class@0010c8
{
    public final CommercialDialogWebFragment b;

    public void e(CommercialDialogWebFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       long l;
       e tb = this.b;
       Objects.requireNonNull(tb);
       String str = "CommercialDialogWebFragment";
       if (PatchProxy.applyVoidOneRefs(p0, tb, CommercialDialogWebFragment.class, "3")) {
       }else {
          a uoa = null;
          try{
             l = Long.parseLong(tb.S);
          }catch(java.lang.Exception e4){
             b.e(KsLogTunaCoreTag.TUNA_BUTTON.appendTag(str), a.b, e4);
             l = uoa;
          }
          KsLogTunaCoreTag ksLogTunaCor = (l - uoa && !l - p0.a)? 1: null;
          if (!ksLogTunaCor) {
             ksLogTunaCor = KsLogTunaCoreTag.TUNA_BUTTON;
             ksLogTunaCor.appendTag(str);
             KsLogTunaCoreTag ksLogTunaCor1 = ksLogTunaCor;
             b.b(ksLogTunaCor1, new i(tb, p0));
          }else if(p0.b == 1){
             try{
                tb.dismissAllowingStateLoss();
             }catch(java.lang.Exception e9){
                b.e(KsLogTunaCoreTag.TUNA_BUTTON.appendTag(str), b.b, e9);
                ExceptionHandler.handleCaughtException(e9);
             }
          }
       }
    }
}
