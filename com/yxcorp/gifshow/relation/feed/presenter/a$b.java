package com.yxcorp.gifshow.relation.feed.presenter.a$b;
import erd.g;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import java.util.Objects;
import gac.b;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import com.yxcorp.gifshow.relation.util.b;
import com.yxcorp.gifshow.pymk.f;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import fac.c;
import gbc.b;
import org.json.JSONObject;
import com.kwai.framework.model.user.User;
import g7c.i;

public class a$b implements g	// class@0018a0
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          RecoUser recoUser = 2;
          if (p0.intValue() == recoUser) {
             p0 = this.b.C.N0(0);
             if (p0 != null && (p0.mType == recoUser && p0.mPymkGuideCard != null)) {
                a$b tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "6")) {
                   tb.p.v2(p0);
                   tb.w.onNext(Integer.valueOf(1));
                   if (!new ContactPermissionHolder(new b(new c())).d()) {
                      b.b();
                   }
                }
                PymkLogSender.reportClickCloseContactCard(this.b.p.l2(), this.b.p.m2());
             }else {
                this.b.P8();
                if (p0 != null && p0.mUser != null) {
                   int i = this.b.p.l2();
                   int i1 = this.b.D.f();
                   if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(i1), null, b.class, "4")) {
                      i.b(p0.mUser, i, b.c(i1), "close");
                   }
                }
             }
          }
       }
       return;
    }
}
