package dz9.g;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e0a.j;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import dz9.f;
import android.content.Context;
import n3d.a;
import cm5.a;
import android.app.Activity;
import cm5.c;

public final class g extends w0	// class@002012
{
    public final GifshowActivity C;
    public final BaseFragment D;
    public final QPhoto E;
    public final m0 F;

    public void g(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("corona_watcher_later");
       this.F = p0;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.b;
       this.E = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f10515d);
       this.L(R.drawable.arg_RES_7f081695);
    }
    public boolean E(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.E;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, j.class, "21");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(QCurrentUser.ME.isLogined()){
          b = obj.isVideoType();
       }else {
          b = false;
       }
       return b;
    }
    public void d(w0 p0,g p1){
       g tE;
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       String str = "photo";
       if (!PatchProxy.applyVoid(null, this, og, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ADD_VIEW_LATER_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          tE = this.E;
          a.o(tE, str);
          uContentPack.photoPackage = w1.f(tE.getEntity());
          u1.M("", this.D, 6, uElementPack, uContentPack, null);
       }
       tE = this.E;
       a.o(tE, str);
       if (!PatchProxy.applyVoidOneRefs(tE, this, og, "4")) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!qCurrentUser.isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103078));
             LoginParams loginParams = uoa.a();
             a.o(loginParams, "LoginParams.LoginParamBu¡­eneral\)\)\n        .build\(\)");
             d.a(-1712118428).x00(this.C, 144, loginParams, new f(this, tE));
          }else {
             d.a(0x5f78d73).dw(tE, this.C, this.D, true);
          }
       }
       return;
    }
    public void onShow(){
    }
}
