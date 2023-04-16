package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$i;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import gy9.b;
import android.content.Context;
import n3d.a;
import uw9.c;
import com.kwai.framework.model.user.User;
import qp7.x0;
import qp7.b;
import dr7.f0;
import dr7.f0$a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import k2b.e0;
import rra.a;
import p1a.a$a;
import lnc.i3;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import wkd.b;
import qra.d;

public final class IntensifyFollowElement$i implements g	// class@001417
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$i(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       IntensifyFollowElement y;
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$i.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, intensifyFol, "40")) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!mE.isLogined()) {
                String str = a.B.getString(R.string.arg_RES_7f103077);
                a.o(str, "AppEnv.APP.getString\(R.string.login_prompt_follow\)");
                b uob = d.a(-1712118428);
                y = p0.y;
                if (y == null) {
                   a.S("mActivity");
                }
                LoginParams$a uoa = new LoginParams$a();
                uoa.d(str);
                LoginParams loginParams = uoa.a();
                uob.x00(y, 14, loginParams, new b(p0));
             }else {
                int i = 0;
                if (p0.F != null) {
                   c.A(i);
                }
                y = p0.t;
                if (y == null) {
                   a.S("mUser");
                }
                if (y.isFollowingOrFollowRequesting()) {
                   if (p0.E().g().b()) {
                      intensifyFol = p0.z;
                      String str1 = "mFragment";
                      if (intensifyFol == null) {
                         a.S(str1);
                      }
                      y = p0.z;
                      if (y == null) {
                         a.S(str1);
                      }
                      c fragmentMana = y.getFragmentManager();
                      p0 = p0.t;
                      if (p0 == null) {
                         a.S("mUser");
                      }
                      a.a(intensifyFol, fragmentMana, p0, 1);
                   }
                }else {
                   p0.t0(1);
                   if (!PatchProxy.applyVoid(objArray, p0, intensifyFol, "41")) {
                      intensifyFol = p0.x;
                      if (intensifyFol == null) {
                         a.S("mLogListener");
                      }
                      a$a uoa1 = a$a.a(31, "点击强化关注按钮");
                      i3 oi3 = i3.f();
                      oi3.d("follow_position", p0.v0());
                      IntensifyFollowElement t1 = p0.t;
                      if (t1 == null) {
                         a.S("mUser");
                      }
                      String str2 = (t1.isFollowingOrFollowRequesting())? "FOLLOW": "UN_FOLLOW";
                      oi3.d("follow_state", str2);
                      str2 = (p0.F != null)? a1.p(R.string.arg_RES_7f101024): a1.p(R.string.arg_RES_7f100f8f);
                      oi3.d("follow_text", str2);
                      oi3.d("head_position", "FRIEND_CHAIN_TOAST");
                      uoa1.m(oi3.e());
                      uoa1.f("USER_FOLLOW");
                      uoa1.r(1);
                      intensifyFol.a(uoa1);
                   }
                   f0 uof0 = p0.E();
                   d uod = b.a(0x36dab11a);
                   y = p0.t;
                   if (y == null) {
                      a.S("mUser");
                   }
                   if (uod.d(y)) {
                      IntensifyFollowElement t = p0.t;
                      if (t == null) {
                         a.S("mUser");
                      }
                      if (!t.isPrivate()) {
                         i = true;
                      }
                   }
                   uof0.l(i);
                   p0.M0(1);
                }
             }
          }
       }
       return;
    }
}
