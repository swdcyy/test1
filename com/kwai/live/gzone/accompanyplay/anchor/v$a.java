package com.kwai.live.gzone.accompanyplay.anchor.v$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.v;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import com.kwai.live.gzone.accompanyplay.anchor.x;
import java.lang.Integer;
import mrd.a;
import e17.i;
import java.lang.CharSequence;

public class v$a implements g	// class@000b3a
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1) {
                this.b.b.k.onNext(Integer.valueOf(0));
                i.a(R.style.arg_RES_7f110669, 0x7f102344);
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
