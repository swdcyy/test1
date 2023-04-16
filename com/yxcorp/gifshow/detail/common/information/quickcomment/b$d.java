package com.yxcorp.gifshow.detail.common.information.quickcomment.b$d;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import java.lang.Object;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import z8a.c;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import uy9.s;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import wca.n;
import uy9.r;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.ba;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$e;
import qp7.b;
import java.util.Set;
import m9a.t;
import qp7.g;
import xq7.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import qp7.x0;
import or7.w;
import or7.w$c;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthCommentPlugin$GrowthQuickCommentType;
import java.util.Objects;
import lnc.b9;
import mvb.c;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$d$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b$d$b;

public class b$d	// class@001449
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final b e;
    public final b f;
    public final b g;

    public void b$d(b p0){
       this.g = p0;
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
       u1.a(this);
       RxBus f = RxBus.f;
       z a = d.a;
       this.e = f.f(c.class).observeOn(a).subscribe(new s(this), Functions.e);
       this.f = f.f(n.class).observeOn(a).subscribe(new r(this));
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ba.b(this.g.u.getPhotoId());
    }
    public final void b(b$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "8")) {
          return;
       }
       b$d tg = this.g;
       boolean b = false;
       Set set = (tg.m != null && tg.v0())? 1: null;
       p0.a();
       if (this.g.v0() && !set) {
          p0.b(true);
          ba.b.add(this.g.u.getPhotoId());
          if (t.c()) {
             this.g.A0();
          }
          this.g.x0(b, b);
          if (this.g.D().c() > 0) {
             return;
          }else {
             b$d tg1 = this.g;
             c2.h(tg1.u, tg1.w, tg1.U);
             tg1 = this.g;
             c2.d(tg1.u, tg1.w, tg1.U);
             this.g.E().j(new w$c(true, true, b));
             GrowthCommentPlugin$GrowthQuickCommentType dEFAULT = GrowthCommentPlugin$GrowthQuickCommentType.DEFAULT;
             b u = this.g.U;
             Objects.requireNonNull(u);
             switch (u.hashCode()){
                 case 0xd26c1f60:
                   if (!u.equals("FINISH_PLAY")) {
                   label_00ba :
                      b = -1;
                   }
                   break;
                 case 0x23a797:
                   if (!u.equals("LIKE")) {
                      goto label_00ba ;
                   }else {
                      b = true;
                   }
                   break;
                 case 0x4b357bf:
                   if (!u.equals("SHARE")) {
                      goto label_00ba ;
                   }else {
                      b = 2;
                   }
                   break;
                 case 0x3a95fa68:
                   if (!u.equals("CLICK_FOLLOW")) {
                      goto label_00ba ;
                   }else {
                      b = 3;
                   }
                   break;
                 default:
                   goto label_00ba ;
             }
             if (b) {
                if (b != true) {
                   if (b != 2) {
                      if (b == 3) {
                         dEFAULT = GrowthCommentPlugin$GrowthQuickCommentType.TYPE_FOLLOW;
                      }
                   }else {
                      dEFAULT = GrowthCommentPlugin$GrowthQuickCommentType.TYPE_SHARE;
                   }
                }else {
                   dEFAULT = GrowthCommentPlugin$GrowthQuickCommentType.TYPE_LIKE;
                }
             }else {
                dEFAULT = GrowthCommentPlugin$GrowthQuickCommentType.TYPE_PLAY_VIDEO;
             }
             this.g.E0(dEFAULT);
          }
       }else {
          p0.b(b);
          if (t.c()) {
             this.g.A0();
          }
          if (!ba.a(this.g.u.getPhotoId()) && this.g.v0()) {
             this.g.x0(b, b);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "2")) {
          return;
       }
       u1.b(this);
       b$d te = this.e;
       if (te != null) {
          te.dispose();
       }
       b9.a(this.f);
       this.g.U = "";
       return;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "5")) {
          return;
       }
       if (this.g.u.equals(p0.a) && p0.a.isLiked()) {
          this.b(new b$d$a(this));
       }
       return;
    }
    public void onFollowUpdateEvent(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "7")) {
          return;
       }
       if (p0.d != null || (p0.c != null && (p0.a.getId()).equals(this.g.u.getUserId()))) {
          this.b(new b$d$b(this));
       }
    label_0030 :
       return;
    }
}
