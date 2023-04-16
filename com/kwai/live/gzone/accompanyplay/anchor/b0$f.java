package com.kwai.live.gzone.accompanyplay.anchor.b0$f;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyFleetReadyResponse;
import e17.i;
import java.lang.CharSequence;

public class b0$f implements g	// class@000afd
{
    public final boolean b;
    public final b0 c;

    public void b0$f(b0 p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$f.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1) {
                if (this.b == null) {
                   i.a(R.style.arg_RES_7f110668, 0x7f102333);
                }
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
