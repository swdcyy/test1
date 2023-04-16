package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$i;
import ub.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import v2c.e;
import v2c.g;
import android.graphics.drawable.Animatable;
import bd.f;
import kotlin.jvm.internal.a;
import java.util.Collection;
import w5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.c;
import java.util.Objects;
import java.lang.Integer;
import s0d.f;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import w5c.a;
import hc.b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class ProfileHeaderStatusPresenter$i extends a	// class@0014db
{
    public final ProfileHeaderStatusPresenter b;
    public final KwaiImageView c;
    public final List d;
    public final List e;

    public void ProfileHeaderStatusPresenter$i(ProfileHeaderStatusPresenter p0,KwaiImageView p1,List p2,List p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileHeaderStatusPresenter$i.class, "2")) {
          return;
       }
       g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag("ProfileHeaderStatusPresenter"), "showStatus onFailure");
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfileHeaderStatusPresenter$i.class, "1")) {
       }else {
          a.p(p0, "id");
          KsLogProfileStatusTag sTATUS_HEADE = KsLogProfileStatusTag.STATUS_HEADER;
          String str = "ProfileHeaderStatusPresenter";
          sTATUS_HEADE.appendTag(str);
          g.e(sTATUS_HEADE, "showStatus onFinalImageSet");
          this.b.o9(this.c, p1);
          if (p1 != null && this.b.M == null) {
             p1 = this.d;
             p1 = (p1 == null || p1.isEmpty())? 1: null;
             if (p1) {
                g.e(sTATUS_HEADE.appendTag(str), "dynamicImageUrls is null");
             }else {
                c h = c.h;
                ProfileHeaderStatusPresenter$i tc = this.c;
                p1 = this.d;
                c uoc = new c(this);
                Objects.requireNonNull(h);
                if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(tc, p1, Integer.valueOf(1), uoc, h, c.class, "2")) {
                   a.p(tc, "imageView");
                   a.p(p1, "cdnUrls");
                   p1 = f.x().q(p1).w();
                   a.o(p1, "KwaiImageRequestGroupBui¡­s\)\n      .buildRequests\(\)");
                   d uod = Fresco.newDraweeControllerBuilder();
                   uod.q(1);
                   uod.u(p1);
                   uod.s(new a(1, uoc));
                   p1 = uod.e();
                   a.o(p1, "Fresco.newDraweeControll¡­       }\n      }\).build\(\)");
                   tc.setController(p1);
                }
                tc.M = true;
             }
          }
       }
       return;
    }
}
