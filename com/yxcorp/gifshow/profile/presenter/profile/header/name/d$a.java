package com.yxcorp.gifshow.profile.presenter.profile.header.name.d$a;
import s3c.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import u3c.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kwai.framework.model.user.User$FollowStatus;
import z5c.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import r4c.x;
import ou7.h$b;
import ou7.h;
import tkd.b;
import tkd.d;
import jyb.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.System;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.lang.Throwable;
import s3c.a;

public class d$a implements b	// class@0014f5
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void b(User p0){
       d uod1;
       String str2;
       String str3;
       d b;
       String str4;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       d$a ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, uod, "9")) {
          uod1 = ta.B;
          if (uod1 != null && uod1.a()) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack1.userPackage = userPackage;
             userPackage.kwaiId = ta.v.getId();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 993;
             showEvent.elementPackage = uElementPack;
             showEvent.contentPackage = uContentPack1;
             b.a(0x4b316083).h(showEvent);
          }
       }
       this.a.P8();
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uod, "1")) {
          uod = ta.B;
          uod1 = 1;
          String str = (uod != null && uod.a())? 1: null;
          if (str && User$FollowStatus.FOLLOW_REQUESTING != ta.v.getFollowStatus()) {
             ClientContent$ContentPackage uContentPack = b0.g(ta.v.getId());
             String str1 = "";
             if (!TextUtils.x(ta.B.b)) {
                str2 = a1.p(R.string.arg_RES_7f1002fc);
             }else if(TextUtils.x(ta.B.c)){
                str3 = str1;
             label_00b8 :
                Context context = ta.getContext();
                d v = ta.v;
                b = ta.B;
                Objects.requireNonNull(b);
                Object obj = PatchProxy.apply(objArray, b, g.class, "4");
                if (obj != PatchProxyResult.class) {
                   str4 = obj;
                }else if(!TextUtils.x(b.a)){
                   str1 = b.b;
                }else if(TextUtils.x(b.c)){
                   str1 = b.c;
                }
                str4 = str1;
                h.c(context, v, str3, str4, uContentPack, new x(ta));
             }else {
                str2 = a1.p(R.string.arg_RES_7f103e96);
             }
             str3 = str2;
             goto label_00b8 ;
          }else {
             d.a(-1079301847).pK(ActivityContext.g().e(), System.currentTimeMillis(), uod1);
          }
          if (!str) {
             ta.t.a("PROFILE_HAS_USER_RELATION");
          }
       }
       return;
    }
    public void c(Throwable p0){
       a.a(this, p0);
    }
}
