package com.kwai.live.gzone.accompanyplay.anchor.i0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.i0;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import e17.i;
import java.lang.CharSequence;

public class i0$a implements g	// class@000b13
{
    public final i0 b;

    public void i0$a(i0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1) {
                i.a(R.style.arg_RES_7f110669, 0x7f102378);
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}