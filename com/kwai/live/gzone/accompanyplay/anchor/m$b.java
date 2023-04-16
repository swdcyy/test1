package com.kwai.live.gzone.accompanyplay.anchor.m$b;
import com.kwai.live.gzone.accompanyplay.anchor.m$a;
import com.kwai.live.gzone.accompanyplay.anchor.m;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import g37.d;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.f;
import h37.g;
import u07.u;
import h37.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class m$b implements m$a	// class@000b26
{
    public final m a;

    public void m$b(m p0){
       this.a = p0;
       super();
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.hide();
    }
    public void b(LiveGzoneAccompanySdkPlatformConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
          return;
       }
       m$b ta = this.a;
       Objects.requireNonNull(ta);
       m om = m.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, om, "3")) {
          if (p0 != null) {
             p0 = p0.mSdkConfig;
             if (p0 != null) {
                LiveGzoneAccompanyGameSdkConfig mKwaiSDKMini = p0.mKwaiSDKMinimumVersion;
                if (mKwaiSDKMini != null) {
                   m q = ta.q;
                   if (q != null && q.a(mKwaiSDKMini)) {
                   label_0068 :
                      return;
                   }
                }
             }
          }
          if (PatchProxy.applyVoid(null, ta, om, "4")) {
             goto label_0068 ;
          }else {
             t$a uoa = f.e(new t$a(ta.getActivity()));
             uoa.W0(R.string.arg_RES_7f1023da);
             uoa.Q0(R.string.cancel);
             uoa.S0(R.string.arg_RES_7f102368);
             uoa.u0(new g(ta));
             uoa.Y(new f(ta));
             goto label_0068 ;
          }
       }
    }
}
