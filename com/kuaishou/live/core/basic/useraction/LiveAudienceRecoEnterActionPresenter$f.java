package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$f;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y12.b;

public final class LiveAudienceRecoEnterActionPresenter$f extends c$b	// class@0008d7
{
    public final LiveAudienceRecoEnterActionPresenter a;

    public void LiveAudienceRecoEnterActionPresenter$f(LiveAudienceRecoEnterActionPresenter p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceRecoEnterActionPresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (this.a.R8()) {
          this.a.w.d("onFragmentResumed");
       }
       return;
    }
}
