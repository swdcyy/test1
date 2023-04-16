package com.kwai.live.gzone.accompanyplay.anchor.b0$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyFleetStartResponse;
import e17.i;
import java.lang.CharSequence;

public class b0$b implements g	// class@000af9
{
    public final b0 b;

    public void b0$b(b0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$b.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1) {
                i.a(R.style.arg_RES_7f110669, 0x7f10233f);
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
