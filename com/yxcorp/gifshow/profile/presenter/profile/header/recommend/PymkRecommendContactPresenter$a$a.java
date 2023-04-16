package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$a$a;
import n3d.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.widget.TextView;
import android.view.View;
import n7c.e;
import java.util.Objects;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import u4c.f;
import u4c.g;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class PymkRecommendContactPresenter$a$a implements a	// class@001518
{
    public final PymkRecommendContactPresenter$a b;

    public void PymkRecommendContactPresenter$a$a(PymkRecommendContactPresenter$a p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(PymkRecommendContactPresenter$a$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PymkRecommendContactPresenter$a$a.class, "1")) {
          return;
       }
       if (p2 != null) {
          p0.p = p2.getIntExtra("contactsCount", 0);
       }
       e.c(this.b.c.V8().d(), PymkRecommendContactPresenter.P8(this.b.c), PymkRecommendContactPresenter.R8(this.b.c));
       PymkRecommendContactPresenter$a c = this.b.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, PymkRecommendContactPresenter.class, "8")) {
          PymkRecommendContactPresenter p = c.p;
          if (p != -1) {
             PymkRecommendContactPresenter r = c.r;
             if (r == null) {
                a.S("mTitle");
             }
             PymkRecommendContactPresenter s = c.s;
             if (s == null) {
                a.S("mSubTitle");
             }
             e.d(p, r, s);
          }else {
             c.X7(b.f().map(new e()).observeOn(d.a).subscribe(new f(c), g.b));
          }
       }
       PatchProxy.onMethodExit(PymkRecommendContactPresenter$a$a.class, "1");
       return;
    }
}
