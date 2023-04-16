package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$h;
import ub.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import v2c.g;
import android.graphics.drawable.Animatable;
import w5c.c;
import java.io.File;
import android.net.Uri;
import ekd.x0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$h$a;
import java.util.Objects;
import java.lang.Integer;
import s0d.f;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import w5c.b;
import hc.b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class ProfileHeaderStatusPresenter$h extends a	// class@0014da
{
    public final ProfileHeaderStatusPresenter b;
    public final KwaiImageView c;
    public final String d;
    public final String e;

    public void ProfileHeaderStatusPresenter$h(ProfileHeaderStatusPresenter p0,KwaiImageView p1,String p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileHeaderStatusPresenter$h.class, "2")) {
          return;
       }
       g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "showMockStatus onFailure");
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfileHeaderStatusPresenter$h.class, "1")) {
          return;
       }
       g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "showMockStatus onFinalImageSet");
       this.b.o9(this.c, p1);
       if (p1 != null && this.b.N == null) {
          ProfileHeaderStatusPresenter$h td = this.d;
          if (td != null) {
             c h = c.h;
             p1 = this.c;
             Uri uri = x0.e(new File(td));
             a.o(uri, "SafetyUriUtil.getUriFromFile\(File\(it\)\)");
             ProfileHeaderStatusPresenter$h$a oh$a = new ProfileHeaderStatusPresenter$h$a(this);
             Objects.requireNonNull(h);
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(p1, uri, Integer.valueOf(1), oh$a, h, c.class, "1")) {
                a.p(p1, "imageView");
                a.p(uri, "uri");
                e[] uoeArray = f.x().s(uri).w();
                a.o(uoeArray, "KwaiImageRequestGroupBui¡­i\)\n      .buildRequests\(\)");
                d uod = Fresco.newDraweeControllerBuilder();
                uod.q(1);
                uod.u(uoeArray);
                uod.s(new b(1, oh$a));
                AbstractDraweeController uAbstractDra = uod.e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­       }\n      }\).build\(\)");
                p1.setController(uAbstractDra);
             }
             uri.N = true;
          }
       }
       return;
    }
}
