package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$c;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoAdRotatePresenter$c extends c$b	// class@0015ad
{
    public final PhotoAdRotatePresenter a;

    public void PhotoAdRotatePresenter$c(PhotoAdRotatePresenter p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdRotatePresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (a.g(p1, this.a.t)) {
          this.a.S8(false);
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdRotatePresenter$c.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (a.g(p1, this.a.t)) {
          PhotoAdRotatePresenter$c ta = this.a;
          if (ta.x != null) {
             ta.S8(true);
          }
       }
       return;
    }
}
