package com.kwai.live.gzone.accompanyplay.anchor.b0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyNextRoundResponse;
import java.lang.CharSequence;
import e17.i;

public class b0$a implements g	// class@000af8
{
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null && p0.mResult != 1) {
             i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
          }
       }
       return;
    }
}
