package com.kuaishou.live.core.show.profilecard.photo.j$c;
import qvb.q;
import com.kuaishou.live.core.show.profilecard.photo.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.core.show.profilecard.photo.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qvb.p;
import android.app.Activity;
import d61.g;
import java.util.List;
import qvb.a;
import java.lang.Integer;
import com.kuaishou.live.core.show.profilecard.photo.j$c$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import com.kuaishou.live.core.show.profilecard.photo.j$d;
import u2.f;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lf2.l;
import java.lang.Runnable;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.util.Locale;
import ra6.a;
import o02.f;
import o02.e;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import a51.c;
import lf2.k;
import erd.g;
import crd.b;

public class j$c implements q	// class@000dec
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       j$c uoc = j$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       b.I(LiveLogTag.LIVE_PROFILE, "onError failed", p1);
       if (p1 != null) {
          ExceptionHandler.handleException(this.b.x, p1);
       }
       this.b.W8();
       this.b.F.t1();
       this.b.F.k0();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       j$c uoc = j$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (g.h(this.b.x)) {
          return;
       }
       b.d0(LiveLogTag.LIVE_PROFILE, "onFinishLoading", "userId", this.b.V8(), "count", Integer.valueOf(this.b.G.getItems().size()));
       this.b.W8();
       if (!p0) {
          this.b.F.t1();
          uoc = this.b;
          uoc.F.r1(uoc.G.getItems());
          h.b(new j$c$a(this)).e(new j$d(this.b));
       }else {
          this.b.F.t1();
          j$c tb = this.b;
          tb.F.r1(tb.G.getItems());
          this.b.F.k0();
       }
       this.b.m8().post(new l(this.b));
       if (p1 && !(this.b.V8()).equals(this.b.w.getAnchorUserId())) {
          e.a().y(this.b.w.getUserProfile().mProfile.mId, a.c().getLanguage(), 30, "public", null, this.b.S8(), true).map(new e()).compose(this.b.P8()).subscribe(new k(this));
       }
       return;
    }
}
