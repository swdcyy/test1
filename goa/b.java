package goa.b;
import ayb.d;
import java.lang.Object;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import wkd.b;
import goa.d;
import java.util.Objects;
import com.google.gson.JsonObject;
import tb7.d;
import ioa.d;
import ioa.a;
import java.lang.Runnable;
import ekd.k1;
import goa.k;
import joa.a;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import tkd.b;
import tkd.d;
import nsb.h;
import goa.a;
import dra.c;
import fg6.a;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import dra.b;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import lnc.u1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.growth.invitecode.token.InviteCodeResponseCache;
import com.yxcorp.gifshow.model.config.UnLoginPopupConfig;
import cra.w;
import q87.c;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import goa.f;
import erd.g;

public class b implements d	// class@002b36
{

    public void b(){
       super();
    }
    public boolean NL(int p0,BaseDialogInfo p1,boolean p2){
       d obj;
       boolean b;
       boolean b1;
       String str1;
       c d;
       boolean i1;
       d c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, b.class, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = b.a(0x56d4a121);
       Objects.requireNonNull(obj);
       d uod = d.class;
       Uri$Builder uBuilder = null;
       b = false;
       if (PatchProxy.isSupport(uod)) {
          BaseDialogInfo obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, uod, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p1 != null){
             obj1 = p1.mOriginSubBiz;
          }else {
             obj1 = uBuilder;
          }
          if (obj.b(obj1)) {
             obj1 = (p1 != null)? p1.mExtParams: uBuilder;
             if (d.d(obj1, "ignore", b)) {
                if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, obj, uod, "14") && p0 == 1)) {
                   obj1 = (p1 != null)? p1.mOriginSubBiz: uBuilder;
                   if (obj.b(obj1)) {
                      c = d.c;
                      Objects.requireNonNull(c);
                      if (!PatchProxy.applyVoid(uBuilder, c, d.class, "2")) {
                         d.a = true;
                         k1.o(a.b);
                      }
                      k.b.a(true);
                   }else {
                      obj.c();
                   }
                }
                if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, obj, uod, "13") && (p0 == 1 && (p1 != null && obj.b(p1.mOriginSubBiz))))) {
                   b.a(-415247079).c(p1);
                }
             label_00da :
                QCurrentUser mE = QCurrentUser.ME;
                String str2 = "QCurrentUser.ME";
                a.o(mE, str2);
                if (mE.isLogined() && p1 != null) {
                   BaseDialogInfo mExtParams = p1.mExtParams;
                   if (mExtParams != null && d.d(mExtParams, "silent", b) == true) {
                      mExtParams = p1.mExtParams;
                      String str3 = d.b(mExtParams, "InvitationCode", "");
                      i1 = d.e(mExtParams, "sourceType", 9);
                      obj.a(str3, i1, d.b(mExtParams, "traceDetail", uBuilder));
                   }else if(!p1 instanceof BigPictureDialogInfo){
                      Object obj3 = p1;
                      QCurrentUser obj4 = PatchProxy.applyOneRefs(obj3, obj, uod, "15");
                      if (obj4 != patchProxyRe) {
                         i1 = obj4.booleanValue();
                      }else {
                         obj4 = QCurrentUser.ME;
                         a.o(obj4, str2);
                         if (obj4.isLogined()) {
                            i1 = false;
                         }else {
                            d.a(0x11fcff7c).fl(true);
                            k.b.b(true);
                            b.a(0x30d01328).b(obj3);
                            i1 = true;
                         }
                      }
                      if (!i1) {
                         Object obj5 = PatchProxy.applyOneRefs(obj3, obj, uod, "11");
                         if (obj5 != patchProxyRe) {
                            b1 = obj5.booleanValue();
                         }else {
                            b.a(0x30d01328).a(obj3);
                            b1 = true;
                         }
                         if (!b1) {
                         label_0171 :
                            b1 = false;
                         }
                      }
                   }
                }else {
                   goto label_0111 ;
                }
                b1 = true;
             }
          }
       }else {
          goto label_0050 ;
       }
       if (!b1) {
          c uoc = c.class;
          String str = "1";
          GrowthVfcModel obj2 = PatchProxy.applyOneRefs(p1, uBuilder, uoc, str);
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(p1 != null){
             BaseDialogInfo mOriginSubBi = p1.mOriginSubBiz;
             if (mOriginSubBi != null) {
                str1 = mOriginSubBi.toUpperCase();
                a.o(str1, "\(this as java.lang.String\).toUpperCase\(\)");
             label_0199 :
                if (a.g(str1, "BIG_V_PULL_A")) {
                   mOriginSubBi = p1.mExtParams;
                   if (mOriginSubBi != null) {
                      GrowthVfcModel growthVfcMod = a.a.c(mOriginSubBi, GrowthVfcModel.class);
                      obj2 = (growthVfcMod != null)? growthVfcMod.actionSelector: uBuilder;
                      if (obj2 != null) {
                         boolean i = b.a[obj2.ordinal()];
                         if (i != 1) {
                            if (i == 2 || i == 3) {
                               i = false;
                            }
                         }else {
                            i = true;
                         }
                         c.b = p1.mShareObjectId;
                         c.c = p1.mOriginSubBiz;
                         d = c.d;
                         Objects.requireNonNull(d);
                         if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidTwoRefs(growthVfcMod, Boolean.valueOf(i), d, uoc, "4") && !TextUtils.x(growthVfcMod.linkUrl))) {
                            GrowthVfcModel linkUrl = growthVfcMod.linkUrl;
                            if (!i) {
                               c.a = growthVfcMod;
                               Uri uri = x0.f(linkUrl);
                               if (uri != null) {
                                  uBuilder = uri.buildUpon();
                               }
                               if (uBuilder != null) {
                                  uBuilder.appendQueryParameter("fromVfcDialog", str);
                                  linkUrl = uBuilder.build().toString();
                                  a.o(linkUrl, "build\(\).toString\(\)");
                               }
                               u1.a(d);
                            }
                            ActivityContext uActivityCon = ActivityContext.g();
                            a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                            Activity uActivity = uActivityCon.e();
                            uActivity.startActivity(b.a(0x66dce92a).a(uActivity, x0.f(linkUrl)));
                         }
                         b1 = true;
                      }
                   }
                }
                b1 = false;
             }
          }
          str1 = uBuilder;
          goto label_0199 ;
          if (!b1) {
          label_0246 :
             return b;
          }
       }
       b = true;
       goto label_0246 ;
    }
    public void O50(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, b.class, "2")) {
          return;
       }
       d uod = b.a(0x56d4a121);
       Objects.requireNonNull(uod);
       if (PatchProxy.isSupport(d.class) && (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), uod, d.class, "5") && (p0 == 1 && (p2 && p1 != 0x2710)))) {
          if (p1 != 0x2713 && p1 != 0x2719) {
             uod.c();
          }else if(PatchProxy.applyVoid(null, uod, d.class, "6")){
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!mE.isLogined()) {
                InviteCodeResponseCache inviteCodeRe = b.a(-415247079).b();
                if (inviteCodeRe != null) {
                   inviteCodeRe = inviteCodeRe.mResponse;
                   if (inviteCodeRe != null) {
                      d.a(0x11fcff7c).fl(1);
                      k.b.b(1);
                      b.a(0x30d01328).b(inviteCodeRe);
                   }
                }
             }
          }
          uod.c();
       }
       return;
    }
    public void VK(String p0,int p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "4")) {
          return;
       }
       b.a(0x56d4a121).a(p0, p1, p2);
       return;
    }
    public boolean dI(UnLoginPopupConfig p0){
       return false;
    }
    public void init(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       d uod = b.a(0x56d4a121);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(objArray, uod, d.class, str)) {
          Object[] objArray1 = new Object[0];
          w.C().t("GrowthModule", "init", objArray1);
          b9.a(d.c);
          d.c = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new f(uod));
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
