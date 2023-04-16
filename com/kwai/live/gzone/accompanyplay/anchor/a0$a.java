package com.kwai.live.gzone.accompanyplay.anchor.a0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.a0;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyFinishResponse;
import e17.i;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import f37.a;
import java.lang.CharSequence;

public class a0$a implements g	// class@000af5
{
    public final a0 b;

    public void a0$a(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             if (p0.mResult == 1) {
                i.a(R.style.arg_RES_7f11066a, 0x7f102393);
                a0 b = this.b.b;
                LiveGzoneAccompanyFinishResponse mEnableAutoR = p0.mEnableAutoReady;
                b.H = mEnableAutoR;
                b.I = p0.mCountdownSeconds;
                a.k(mEnableAutoR);
             }else {
                i.d(R.style.arg_RES_7f110668, p0.mErrMsg);
             }
          }
       }
       return;
    }
}
