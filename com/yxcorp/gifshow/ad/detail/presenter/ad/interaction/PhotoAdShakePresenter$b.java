package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$b;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoAdShakePresenter$b extends c$b	// class@0015b6
{
    public final PhotoAdShakePresenter a;

    public void PhotoAdShakePresenter$b(PhotoAdShakePresenter p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdShakePresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (a.g(p1, this.a.t)) {
          p0.x = true;
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdShakePresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (a.g(p1, this.a.t)) {
          PhotoAdShakePresenter$b ta = this.a;
          if (ta.x != null && (ta.A != null && ta.w == null)) {
             ta.S8();
          }
       label_0030 :
          ta.x = false;
       }
       return;
    }
}
