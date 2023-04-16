package com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import a0c.g;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import po5.c;
import pr6.b;
import pr6.d;
import ta9.b;
import yzb.a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.feature.post.api.feature.upload.model.UploadSystemForbidNotify;
import java.lang.reflect.Type;
import rq.a;
import ozb.p;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.text.SimpleDateFormat;
import java.lang.Long;
import java.lang.System;
import java.lang.Double;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import java.lang.StringBuilder;
import yzb.b;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import ozb.o;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import g36.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class KsBottomBarCameraPresenterV2$b implements View$OnClickListener	// class@001052
{
    public final KsBottomBarCameraPresenterV2 b;

    public void KsBottomBarCameraPresenterV2$b(KsBottomBarCameraPresenterV2 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       UploadSystemForbidNotify obj2;
       int b1;
       String str1;
       boolean b2;
       Object obj = this;
       d obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, KsBottomBarCameraPresenterV2$b.class, "1")) {
          return;
       }
       KsBottomBarCameraPresenterV2$b b = obj.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(obj1, b, KsBottomBarCameraPresenterV2.class, "15")) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "NasaCameraPresenterV2";
          g.C().w(str, "onRootViewClick", objArray);
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!qCurrentUser.isLogined()) {
             Object[] objArray1 = new Object[i];
             g.C().w(str, "user not login", objArray1);
             b d = c.D;
             a.o(d, "HomeFragmentFuncIds.URL_SUPPLIER");
             obj2 = b.B.e(d);
             a.o(obj2, "fragment.callNonNull\(Hom¡­mentFuncIds.URL_SUPPLIER\)");
             d.a(-1712118428).ne(b.getActivity(), obj2.getUrl(), "NasaShoot", 82, "", null, null, null, new a(b, obj1)).h();
          }else {
             obj2 = a.I(UploadSystemForbidNotify.class);
             String obj3 = PatchProxy.applyOneRefs(obj2, null, p.class, "2");
             if (obj3 != PatchProxyResult.class) {
                b1 = obj3.booleanValue();
             }else {
                SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd");
                str1 = simpleDateFo.format(Long.valueOf(a.u()));
                b1 = str1.equals(simpleDateFo.format(Double.valueOf((double)System.currentTimeMillis()))) ^ true;
                String str2 = "enableCreatePop";
                if (a.a().c()) {
                   if (!g.D()) {
                      b2 = f.a(str2);
                   }else if(g.D() == 1){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }else {
                   b2 = f.a(str2);
                }
                if (b2 && (obj2 != null && (obj2.mCreateNoteDialog != null && (obj2.mForbidden != null && b1)))) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
             if (b1 && b.getActivity() != null) {
                Object[] objArray2 = new Object[i];
                obj3 = "notifyInfo";
                a.o(obj2, obj3);
                Activity activity = b.getActivity();
                a.m(activity);
                a.o(activity, "activity!!");
                b uob = new b(b, obj1);
                b uob1 = uob;
                b uob2 = uob;
                if (!PatchProxy.applyVoidThreeRefs(obj2, activity, uob1, null, p.class, "1")) {
                   a.p(obj2, obj3);
                   a.p(activity, "context");
                   a.p(uob2, "listener");
                   objArray = new Object[i];
                   str1 = "PostForbidDialogUtils";
                   g.C().w(str1, "showForbiddenNotifyDialog: ", objArray);
                   if (p.a) {
                      Object[] objArray3 = new Object[i];
                      g.C().w(str1, "isPostDialogShowing = true", objArray3);
                   }else {
                      p.a = true;
                      obj1 = new d(activity);
                      obj1.Z0(176);
                      obj1.z(i);
                      obj1.A(i);
                      obj1.L(new o(obj2, uob2));
                      obj1.b0().Z();
                      a.V(System.currentTimeMillis());
                      if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "POST_REMIND_POPUP";
                         u1.D0(null, null, 6, uElementPack, null, null);
                      }
                   }
                }
             }else {
                b.Y8(b.getActivity(), obj1);
             }
          }
       }
       PatchProxy.onMethodExit(KsBottomBarCameraPresenterV2$b.class, "1");
       return;
    }
}
