package com.yxcorp.gifshow.profile.presenter.c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.e$a;
import java.lang.Object;
import om6.d;
import com.yxcorp.gifshow.profile.presenter.e;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.yxcorp.gifshow.profile.http.l;
import j4c.n;
import z5c.y1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i4c.p;
import n3d.a;

public final class c implements g	// class@001442
{
    public final e$a b;

    public void c(e$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       int draftsNum = tb.c.q.getDraftsNum();
       boolean b = n.S8(tb.c.p);
       boolean b1 = n.R8(tb.c.p);
       if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(draftsNum), Boolean.valueOf(b), Boolean.valueOf(b1), null, y1.class, "63")) {
          i3 oi3 = i3.f();
          oi3.c("draft_count", Integer.valueOf(draftsNum));
          String str = "TRUE";
          String str1 = (b)? str: "FALSE";
          oi3.d("has_encourage", str1);
          if (!b1) {
             str = "FALSE";
          }
          oi3.d("has_coin", str);
          h oh = h.k("DRAFT_BOX");
          oh.n(oi3.e());
          oh.h();
       }
       p0.yG(tb.c.getActivity(), 100, new p(tb));
       return;
    }
}
