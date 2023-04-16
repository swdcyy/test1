package com.yxcorp.gifshow.detail.fragments.milano.profile.l$b;
import tw6.c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import k2b.e0;
import lnc.i3;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p1a.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import i0a.d;

public class l$b implements c	// class@001555
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "1")) {
          return;
       }
       if (!this.a.B.t() instanceof e0) {
          return;
       }
       l$b ta = this.a;
       if (ta.v == null) {
          return;
       }
       l b = ta.B;
       i3 oi3 = i3.f();
       oi3.d("last_photo_index", String.valueOf(b.q(b.j())));
       String str = oi3.e();
       a$a uoa = a$a.t("NO_MORE_PHOTO", "NO_MORE_PHOTO");
       uoa.m(str);
       d.b(this.a.B.t(), this.a.m8(), this.a.v, uoa);
       return;
    }
}
