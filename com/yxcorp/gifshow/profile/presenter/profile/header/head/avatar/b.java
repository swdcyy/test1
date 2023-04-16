package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import j5c.c;
import o4c.q;
import erd.g;
import z5c.l0;
import crd.b;
import bld.b;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import java.lang.Integer;

public class b extends PresenterV2	// class@0014e5
{
    public KwaiImageView p;
    public KwaiImageView q;
    public View r;
    public View s;
    public ProfileParam t;
    public User u;
    public int v;
    public c w;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(this.w.e().subscribe(new q(this), l0.a("ProfileHeaderAvatarPresenter")));
       b uob = new b();
       uob.v(this.getContext().getResources().getColor(0x106000d));
       uob.s(DrawableCreator$Shape.Oval);
       this.q.setForegroundDrawable(uob.a());
       this.q.setPlaceHolderImage(R.drawable.detail_avatar_secret);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0333);
       this.r = m1.f(p0, 0x7f0a435e);
       this.p = m1.f(p0, 0x7f0a033d);
       this.s = m1.f(p0, 0x7f0a4383);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.t = this.q8(ProfileParam.class);
       this.u = this.q8(User.class);
       this.w = this.r8("PROFILE_LOAD_STATE");
       this.v = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
