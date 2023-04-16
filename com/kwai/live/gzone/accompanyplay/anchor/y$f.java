package com.kwai.live.gzone.accompanyplay.anchor.y$f;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import e17.i;
import java.lang.CharSequence;

public class y$f implements g	// class@000b44
{
    public final boolean b;
    public final boolean c;
    public final y d;

    public void y$f(y p0,boolean p1,boolean p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, y$f.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1 && this.b == null) {
                i = (this.c != null)? 0x7f1023c3: 0x7f1023c7;
                i.a(R.style.arg_RES_7f110669, i);
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
