package com.kuaishou.live.gzone.v2.profile.e$g;
import qvb.q;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.gzone.v2.profile.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qvb.p;
import android.app.Activity;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import java.util.List;
import qvb.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.gzone.v2.profile.e$g$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import com.kuaishou.live.gzone.v2.profile.e$h;
import u2.f;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e63.j1;
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
import com.kuaishou.live.gzone.v2.profile.e$g$b;
import erd.g;
import crd.b;

public class e$g implements q	// class@001ce6
{
    public final e b;

    public void e$g(e p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(e$g.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, e$g.class, "2")) {
          return;
       }
       if (p1 != null) {
          ExceptionHandler.handleException(this.b.p, p1);
       }
       this.b.B9(0);
       this.b.Z.t1();
       this.b.Z.k0();
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
       e$g og = e$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, og, "1")) {
          return;
       }
       e p = this.b.p;
       if (p != null && !p.isFinishing()) {
          b.Z(LiveLogTag.LIVE_PROFILE, "onFinishLoading, UserId:"+this.b.q.mId+" count:"+this.b.U0.getItems().size());
          og = this.b;
          og.B9(og.U0.getItems().size());
          if (!p0) {
             this.b.Z.t1();
             og = this.b;
             og.Z.r1(og.U0.getItems());
             h.b(new e$g$a(this)).e(new e$h(this.b));
          }else {
             this.b.Z.t1();
             e$g tb = this.b;
             tb.Z.r1(tb.U0.getItems());
             this.b.Z.k0();
          }
          this.b.m8().post(new j1(this.b));
          if (p1 && !(this.b.q.getId()).equals(this.b.r.getAnchorUserId())) {
             e.a().y(this.b.r.getUserProfile().mProfile.mId, a.c().getLanguage(), 30, "public", null, this.b.l9(), true).map(new e()).subscribe(new e$g$b(this));
          }
       }
    label_010c :
       return;
    }
}
