package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;
import java.lang.Object;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.j;
import com.yxcorp.gifshow.profile.presenter.profile.x;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType;
import i4c.c1;
import com.yxcorp.gifshow.profile.presenter.profile.a0;
import com.yxcorp.gifshow.profile.presenter.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.feedstaggercard.presenter.f;
import com.yxcorp.gifshow.profile.presenter.f;
import com.yxcorp.gifshow.profile.presenter.k;
import i4c.w0;
import com.kwai.framework.model.user.User;
import z5c.d3;
import com.yxcorp.gifshow.profile.presenter.i;

public final class ProfilePhotoItemType$a	// class@001201
{

    public void ProfilePhotoItemType$a(){
       super();
    }
    public void ProfilePhotoItemType$a(u p0){
       super();
    }
    public final void a(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$a.class, "4") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$a.class, "4")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new j(p2));
       p0.U7(new x());
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined() && ProfilePhotoItemType.Companion.d(p1)) {
          p0.U7(new c1());
       }
       this.c(p0, p1);
       PatchProxy.onMethodExit(ProfilePhotoItemType$a.class, "4");
       return;
    }
    public final void b(PresenterV2 p0,r0 p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ProfilePhotoItemType$a.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       String str = "profilePageParam";
       a.p(p1, str);
       p0.U7(new a0());
       p0.U7(new g());
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          ProfilePhotoItemType$a companion = ProfilePhotoItemType.Companion;
          if (!companion.d(p1)) {
             Objects.requireNonNull(companion);
             Object obj = PatchProxy.applyOneRefs(p1, companion, ProfilePhotoItemType$a.class, "7");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(p1, str);
                b = (p1.c == 19)? true: false;
             }
             if (!b) {
             label_0067 :
                p0.U7(new f());
                p0.U7(new k());
                p0.U7(new w0());
                PatchProxy.onMethodExit(ProfilePhotoItemType$a.class, "3");
                return;
             }
          }
          p0.U7(new f(true, p1.c));
          goto label_0067 ;
       }else {
          goto label_0067 ;
       }
    }
    public final void c(PresenterV2 p0,r0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ProfilePhotoItemType$a.class, "5")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       if (!d3.a(p1.b) && this.d(p1)) {
          p0.U7(new i());
       }
       PatchProxy.onMethodExit(ProfilePhotoItemType$a.class, "5");
       return;
    }
    public final boolean d(r0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePhotoItemType$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "profilePageParam");
       boolean b = true;
       if (p0.c != b) {
          b = false;
       }
       return b;
    }
}
