package com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import t3c.a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import t3c.a$b;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import mw4.a;
import wkd.b;
import rfc.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.user.User;
import k2b.e0;
import z5c.y1;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class MyProfileAddFriendsPresenter$a extends m	// class@0014f9
{
    public final MyProfileAddFriendsPresenter c;

    public void MyProfileAddFriendsPresenter$a(MyProfileAddFriendsPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a$b obj2;
       String str1;
       ClientEvent$ElementPackage uElementPack;
       ClientContentWrapper$RedPointPackage redPointDeta;
       ClientContentWrapper$ContentWrapper uContentWrap;
       int i;
       Object obj = this;
       MyProfileAddFriendsPresenter obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MyProfileAddFriendsPresenter$a.class, "1")) {
          return;
       }
       MyProfileAddFriendsPresenter$a c = obj.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(obj1, c, MyProfileAddFriendsPresenter.class, "10")) {
          obj1 = c.B;
          if (!PatchProxy.applyVoidOneRefs(obj1, null, a.class, "2")) {
             String str = "profile_new_recommed_friend";
             if (PatchProxy.isSupport(a.class)) {
                obj2 = PatchProxy.applyThreeRefs(str, Boolean.FALSE, obj1, null, a.class, "5");
                if (obj2 != PatchProxyResult.class) {
                   obj2.booleanValue();
                }
             }
             if (obj1 != null && !obj1.getVisibility()) {
                a$b uob = a.b(obj1);
                if (uob != null) {
                   obj2 = (uob.b != null)? uob.a: 0;
                   uob = uob.c;
                   if (PatchProxy.isSupport(a.class)) {
                      str1 = str;
                      if (!PatchProxy.applyVoidFourRefs(str, Integer.valueOf(obj2), Boolean.FALSE, uob, null, a.class, "12")) {
                      }
                   }else {
                      str1 = str;
                   }
                }
             }
          }
       label_00b1 :
          if (a.v() > 0) {
             b.a(0x4a533fa).d("remindNewFriendsJoined").subscribe(Functions.d(), Functions.d());
          }
          if (c.A == null) {
             y1.g(c.w, c.v.getId(), 1, c.A);
          }else {
             y1.g(c.w, c.v.getId(), 2, c.A);
          }
          a.A(0);
          c.R8();
          d.a(0x6de3c81e).td(c.getContext());
       }
       return;
    }
}
