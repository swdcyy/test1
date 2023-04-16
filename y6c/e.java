package y6c.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import a7c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import y6c.b;
import android.content.Context;
import n3d.a;
import jga.f$a;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.utility.TextUtils;
import fka.e;
import wca.b;
import jga.c;
import com.yxcorp.gifshow.pymk.b;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import y6c.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import y6c.d;
import oe6.e;

public abstract class e	// class@0049ec
{
    public GifshowActivity a;
    public User b;
    public c c;
    public int d;
    public RecoUser e;
    public boolean f;
    public b g;
    public boolean h;

    public void e(GifshowActivity p0,RecoUser p1,c p2,boolean p3,int p4){
       super();
       this.h = false;
       this.a = p0;
       this.e = p1;
       RecoUser mUser = p1.mUser;
       this.b = mUser;
       this.c = p2;
       int i = c.a(p2.od(mUser));
       this.d = (i != -1)? i: p4;
       this.f = p3;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.b(true, true);
       return;
    }
    public void b(boolean p0,boolean p1){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, e.class, "3")) {
          return;
       }
       if (this.b.mIsHiddenUser != null) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          return;
       }else if(this.h == null){
          e tc = this.c;
          if (tc != null) {
             e te = this.e;
             if (te != null) {
                tc.ce(te, te.mUser);
             label_0040 :
                Object[] objArray = null;
                LoginParams obj = PatchProxy.apply(objArray, this, e.class, "1");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(!QCurrentUser.me().isLogined()){
                   LoginParams$a uoa2 = new LoginParams$a();
                   uoa2.d(a1.p(R.string.arg_RES_7f103077));
                   obj = uoa2.a();
                   d.a(-1712118428).x00(this.a, 23, obj, new b(this));
                   b = false;
                }else {
                   b = true;
                }
                if (!b) {
                   return;
                }else if(!this.c.od(this.b)){
                   b = 1;
                }else {
                   b = this.c.od(this.b);
                }
                e tb = this.b;
                String str = PatchProxy.apply(objArray, this, e.class, "5");
                String str1 = "";
                if (str != patchProxyRe) {
                }else {
                   e td = this.d;
                   if (td != null) {
                      e ta = this.a;
                      str = (ta instanceof GifshowActivity)? TextUtils.I(x.a(ta.Q2(), this.d)): String.valueOf(td);
                   }else {
                      td = this.a;
                      str = (td instanceof GifshowActivity)? TextUtils.I(td.Q2()): str1;
                   }
                }
                f$a uoa = new f$a(tb, str);
                String str2 = PatchProxy.apply(objArray, this, e.class, "6");
                if (str2 != patchProxyRe) {
                }else if(this.d != null){
                   str2 = e.a().c(this.d);
                }else {
                   str2 = e.a().b();
                }
                uoa.l(str2);
                uoa.o(this.a.getUrl());
                f$a uoa1 = uoa.h(this.b.mFollowActionReasonTextId);
                uoa1.i(b.i(this.b.getId(), this.b.getId(), 1, b.a(b)));
                if (this.f != null) {
                   str1 = this.b.getThirdPartyName();
                }
                uoa1.d(str1);
                b.m(uoa1, this.b);
                te = this.e;
                this.c.cf(te, te.mUser);
                if (!p1) {
                   uoa1.q(1);
                }
                if (this.b.isFollowingOrFollowRequesting()) {
                   if (!PatchProxy.applyVoidOneRefs(uoa1, this, e.class, "4")) {
                      uoa1.q(1);
                      this.g = FollowHelper.k(uoa1.b()).subscribe(new c(this), Functions.d());
                   }
                }else {
                   FollowHelper.d(uoa1.b(), new d(this, p0), Functions.e);
                }
                e.f0(false);
                return;
             }
          }
       }
       this.h = false;
       goto label_0040 ;
    }
    public abstract void c(User p0);
}
