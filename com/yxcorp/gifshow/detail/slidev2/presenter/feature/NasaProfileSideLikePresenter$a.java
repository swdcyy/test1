package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e8a.d0;
import android.view.View$OnClickListener;
import android.view.View;
import java.util.Objects;
import android.animation.AnimatorSet;

public class NasaProfileSideLikePresenter$a extends a	// class@00191a
{
    public final NasaProfileSideLikePresenter b;

    public void NasaProfileSideLikePresenter$a(NasaProfileSideLikePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideLikePresenter$a.class, "2")) {
          return;
       }
       this.b.y = false;
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaProfileSideLikePresenter$a.class, "1")) {
          return;
       }
       NasaProfileSideLikePresenter$a tb = this.b;
       tb.y = true;
       tb.p.setOnClickListener(new d0(this));
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, NasaProfileSideLikePresenter.class, "5")) {
          tb.S8();
          NasaProfileSideLikePresenter z = tb.z;
          if (z != null && z.isStarted()) {
             tb.z.cancel();
          }
          tb.P8();
          tb.Y8();
       }
       return;
    }
}
