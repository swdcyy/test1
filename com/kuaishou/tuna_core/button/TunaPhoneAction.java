package com.kuaishou.tuna_core.button.TunaPhoneAction;
import uz4.a;
import com.kuaishou.tuna_core.button.TunaPhoneAction$a;
import nsd.u;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.io.Serializable;
import ma6.a;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaPhoneAction$run$1;
import msd.a;
import c15.b;
import com.kwai.framework.model.tuna.button.PhoneInfoModel$VirtualPhone;
import com.kuaishou.tuna_core.button.TunaPhoneAction$run$2;
import com.kuaishou.tuna_core.button.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.button.f$a;
import java.lang.Integer;
import brd.t;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.button.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.kuaishou.tuna_core.button.e;
import erd.o;
import uz4.k;
import uz4.l;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.d;
import zx5.e;
import zx5.d$a;
import java.lang.Boolean;
import ya.i;
import com.kuaishou.tuna_core.button.TunaPhoneAction$c;
import java.lang.Runnable;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.tuna_core.button.TunaPhoneAction$launchPhoneDialog$1;
import wkd.b;
import e05.a;
import com.kuaishou.tuna_core.button.TunaPhoneAction$d;
import com.kuaishou.tuna_core.button.TunaPhoneAction$e;
import android.app.Activity;
import i05.e;
import i05.d;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import lnc.a1;
import e17.i;
import kotlin.Pair;
import trd.t0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import g05.b;
import com.kuaishou.tuna_core.button.TunaPhoneAction$reportGetLocalPhoneNumberResult$1;
import msd.l;
import g05.b$a;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.tuna_core.button.TunaPhoneAction$requestVirtualPhone$1;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.concurrent.TimeUnit;
import uz4.h;
import erd.r;
import uz4.i;
import uz4.j;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import cjd.e;
import uz4.e;
import erd.a;
import uz4.f;
import uz4.g;
import com.kuaishou.tuna_core.button.TunaPhoneAction$f;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$AuthInfo;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$AuthItem;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.StringBuffer;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$LinkText;
import com.kuaishou.tuna_core.button.TunaPhoneAction$b;
import trd.s0;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.tuna_core.button.TunaPhoneAction$g;
import u07.u;
import com.kuaishou.tuna_core.button.TunaPhoneAction$h;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import yb6.d;

public final class TunaPhoneAction extends a	// class@0010b6
{
    public a a;
    public boolean b;
    public PhoneInfoModel c;
    public a d;
    public boolean e;
    public final WeakReference f;
    public static final TunaPhoneAction$a g;

    static {
       TunaPhoneAction.g = new TunaPhoneAction$a(null);
    }
    public void TunaPhoneAction(WeakReference p0){
       super();
       this.f = p0;
       this.e = true;
    }
    public String a(){
       return "TunaPhoneAction";
    }
    public void b(Serializable p0,a p1){
       t ot;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaPhoneAction.class, "1")) {
       }else {
          String str = "TunaPhoneAction";
          if (p0 == null) {
             if (p1 != null) {
                p1.mFailureReason = "CallDataInvalid";
             }
             b.g(KsLogTunaCoreTag.TUNA_BUTTON.appendTag(str), TunaPhoneAction$run$1.INSTANCE);
          }else {
             PhoneInfoModel mVirtualPhon = p0.mVirtualPhone;
             if (mVirtualPhon == null) {
                mVirtualPhon = new PhoneInfoModel$VirtualPhone();
             }
             KsLogTunaCoreTag tUNA_BUTTON = KsLogTunaCoreTag.TUNA_BUTTON;
             tUNA_BUTTON.appendTag(str);
             KsLogTunaCoreTag ksLogTunaCor = tUNA_BUTTON;
             b.g(ksLogTunaCor, new TunaPhoneAction$run$2(mVirtualPhon));
             if (mVirtualPhon.mIsNeedGetLocalPhoneNumber != null) {
                this.k(true);
                f$a a = f.a;
                PhoneInfoModel$VirtualPhone mBizType = mVirtualPhon.mBizType;
                PhoneInfoModel$VirtualPhone mSource = mVirtualPhon.mSource;
                String str1 = "";
                PhoneInfoModel$VirtualPhone virtualPhone = (mSource != null)? mSource: str1;
                PhoneInfoModel mUserId = p0.mUserId;
                PhoneInfoModel phoneInfoMod = (mUserId != null)? mUserId: str1;
                Objects.requireNonNull(a);
                if (PatchProxy.isSupport(f$a.class)) {
                   ot = PatchProxy.applyThreeRefs(Integer.valueOf(mBizType), virtualPhone, phoneInfoMod, a, f$a.class, "2");
                   if (ot != PatchProxyResult.class) {
                   label_00af :
                      ot.observeOn(d.a).subscribe(new k(this, mVirtualPhon, p0, p1), new l(this, mVirtualPhon, p0, p1));
                   }
                }
                a.p(virtualPhone, "source");
                a.p(phoneInfoMod, "userId");
                t ot1 = PatchProxy.apply(null, a, f$a.class, "3");
                if (ot1 != PatchProxyResult.class) {
                }else {
                   ot1 = t.create(d.b).subscribeOn(d.c);
                   a.o(ot1, "Observable.create<PrePho¡­eOn\(KwaiSchedulers.ASYNC\)");
                }
                ot = ot1.flatMap(new e(mBizType, virtualPhone, phoneInfoMod));
                a.o(ot, "tryGetLocalPhoneInfo\(\).f¡­, source, userId\)\n      }");
                goto label_00af ;
             }else {
                this.j(p0, p1, mVirtualPhon);
             }
          }
       }
       return;
    }
    public final String c(PhoneInfoModel p0,String p1){
       String str;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, TunaPhoneAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mAdCallBack;
       if (p0 != null) {
          if (!(TextUtils.x(p0) ^ 0x01)) {
             str = 0;
          }
          PhoneInfoModel phoneInfoMod = p0;
          if (phoneInfoMod != null) {
             g og = d.a(-174493078);
             if (og != null) {
                obj = og.PB(d.class);
                if (obj != null) {
                   str = d$a.a(obj, p1, "adCallback", phoneInfoMod, false, false, 24, null);
                   if (str != null) {
                      p1 = str;
                   }
                }
             }
          }
       }
    label_0045 :
       return p1;
    }
    public final void d(boolean p0,String p1,PhoneInfoModel p2,int p3,String p4,String p5){
       Object[] objArray;
       int i;
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       if (PatchProxy.isSupport(tunaPhoneAct)) {
          objArray = new Object[]{Boolean.valueOf(p0),p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, tunaPhoneAct, "8")) {
             return;
          }
       }else {
          i = this;
       }
       TunaPhoneAction$c uoc = new TunaPhoneAction$c(this, p0, p4, p1, p2, p3, p5);
       i.d().execute(objArray);
       return;
    }
    public final ClientEvent$ElementPackage e(String p0,Map p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, TunaPhoneAction.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       if (p1 != null && (p1.isEmpty() ^ 1) == 1) {
          obj.params = a.a.q(p1);
       }
       return obj;
    }
    public final void f(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TunaPhoneAction.class, "10")) {
          return;
       }
       b.f(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("callPhone"), new TunaPhoneAction$launchPhoneDialog$1(p0, p1, p2));
       TunaPhoneAction td = this.d;
       if (td != null) {
          td.mCallPhoneSource = p2;
       }
       if (p0 != null) {
          e uoe = null;
          TunaPhoneAction$e uoe1 = 1;
          int i = (p0.length() > 0)? 1: 0;
          if (i == uoe1) {
             i = null;
             if (p1 != null) {
                if (p1.length() > 0) {
                   uoe = 1;
                }
                if (!uoe) {
                   p1 = i;
                }
                if (p1 != null) {
                   b.a(-93866330).d(p1, p0).subscribe(TunaPhoneAction$d.b, TunaPhoneAction$e.b);
                }
             }
             TunaPhoneAction tf = this.f;
             if (tf != null) {
                Activity uActivity = tf.get();
                if (uActivity != null && !PatchProxy.applyVoidTwoRefs(uActivity, p0, i, e.class, "1")) {
                   if (TextUtils.x(p0)) {
                      b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("contact"), d.b);
                   }else {
                      Intent intent = new Intent("android.intent.action.DIAL");
                      intent.setData(w0.f("tel:"+p0));
                      uActivity.startActivity(intent);
                   }
                }
             }
          }else {
          label_00a6 :
             TunaPhoneAction td1 = this.d;
             if (td1 != null) {
                td1.mFailureReason = "CallDataInvalid";
             }
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104c15));
          }
       }else {
          goto label_00a6 ;
       }
    label_00bb :
       return;
    }
    public final void g(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaPhoneAction.class, "15")) {
          return;
       }
       Pair[] pairArray = new Pair[]{new Pair("button_name", p1),new Pair("itemScene", p0)};
       u1.B(new ClickMetaData().setType(3).setElementPackage(this.e("BUSINESS_PHONE_CONFIRM_POPUP_BUTTON", t0.W(pairArray))));
       return;
    }
    public final void h(boolean p0){
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       if (PatchProxy.isSupport(tunaPhoneAct) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tunaPhoneAct, "17")) {
          return;
       }
       b.a.e("GET_USER_CARD_PHONE", false, new TunaPhoneAction$reportGetLocalPhoneNumberResult$1(p0));
       return;
    }
    public final void i(String p0,PhoneInfoModel p1,String p2,int p3,boolean p4,boolean p5){
       Long longx1;
       Long longx2;
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       if (PatchProxy.isSupport(tunaPhoneAct)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, tunaPhoneAct, "11")) {
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       String str = "user_id";
       Long longx = null;
       PhoneInfoModel mUserId = (p1 != null)? p1.mUserId: longx;
       jsonObject.c0(str, mUserId);
       str = "phone";
       if (p1 != null) {
          mUserId = p1.mVirtualPhone;
          if (mUserId != null) {
             PhoneInfoModel$VirtualPhone mPhone = mUserId.mPhone;
          label_004f :
             jsonObject.c0(str, mPhone);
             str = "backup_phone";
             if (p1 != null) {
                mUserId = p1.mVirtualPhone;
                if (mUserId != null) {
                   mPhone = mUserId.mBackupPhone;
                label_005e :
                   jsonObject.c0(str, mPhone);
                   str = "phone_valid_timestamp";
                   if (p1 != null) {
                      mUserId = p1.mVirtualPhone;
                      if (mUserId != null) {
                         longx1 = Long.valueOf(mUserId.mPhoneExpiryTimestamp);
                      label_0071 :
                         jsonObject.a0(str, longx1);
                         jsonObject.H("phone_valid", Boolean.valueOf(p4));
                         String str1 = "backup_phone_valid_timestamp";
                         if (p1 != null) {
                            PhoneInfoModel mVirtualPhon = p1.mVirtualPhone;
                            if (mVirtualPhon != null) {
                               longx2 = Long.valueOf(mVirtualPhon.mBackupPhoneExpiryTimestamp);
                            label_008d :
                               jsonObject.a0(str1, longx2);
                               jsonObject.H("backup_phone_valid", Boolean.valueOf(p5));
                               if (p1 != null) {
                                  p1 = p1.mVirtualPhone;
                                  if (p1 != null) {
                                     longx = Long.valueOf(p1.mPhoneTimeout);
                                  }
                               }
                               jsonObject.a0("phone_time_out", longx);
                               jsonObject.c0("final_phone", p2);
                               jsonObject.H("is_time_out", Boolean.valueOf(this.b));
                               jsonObject.a0("request_state", Integer.valueOf(p3));
                               u1.Q(p0, jsonObject.toString());
                               return;
                            }
                         }
                         longx2 = longx;
                         goto label_008d ;
                      }
                   }
                   longx1 = longx;
                   goto label_0071 ;
                }
             }
             longx1 = longx;
             goto label_005e ;
          }
       }
       longx1 = longx;
       goto label_004f ;
    }
    public final void j(PhoneInfoModel p0,a p1,PhoneInfoModel$VirtualPhone p2){
       boolean b2;
       z a;
       TunaPhoneAction d;
       Integer integer;
       TunaPhoneAction tunaPhoneAct = this;
       PhoneInfoModel phoneInfoMod = p0;
       a uoa = p1;
       f obj = p2;
       PhoneInfoModel$VirtualPhone virtualPhone = PhoneInfoModel$VirtualPhone.class;
       TunaPhoneAction tunaPhoneAct1 = TunaPhoneAction.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TunaPhoneAction.class, "3")) {
          return;
       }
       if (tunaPhoneAct.e == null) {
          return;
       }
       boolean b = false;
       tunaPhoneAct.e = b;
       if (phoneInfoMod) {
          tunaPhoneAct.c = phoneInfoMod;
          tunaPhoneAct.d = uoa;
          PhoneInfoModel mUserId = phoneInfoMod.mUserId;
          PhoneInfoModel mAdCallBack = phoneInfoMod.mAdCallBack;
          String str = "";
          PhoneInfoModel phoneInfoMod1 = (mAdCallBack != null)? mAdCallBack: str;
          if (uoa != null) {
             uoa.mCallPhoneUid = mUserId;
          }
          TunaPhoneAction a obj1 = PatchProxy.applyOneRefs(obj, tunaPhoneAct, tunaPhoneAct1, "4");
          boolean b1 = true;
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else if(obj != null){
             b2 = tunaPhoneAct.m(obj.mPhoneExpiryTimestamp, b1);
          }else {
             b2 = true;
          }
          Object[] objArray = null;
          if (mUserId != null) {
             String str1 = (mUserId.length() > 0)? 1: null;
             if (str1 == b1) {
                Objects.requireNonNull(p2);
                PhoneInfoModel$VirtualPhone obj2 = PatchProxy.apply(objArray, obj, virtualPhone, "1");
                boolean b3 = (obj2 != patchProxyRe)? obj2.booleanValue(): TextUtils.x(obj.mPhone);
                if (b3) {
                label_0082 :
                   a.o(mUserId, "userId");
                   if (!PatchProxy.applyVoidThreeRefs(mUserId, phoneInfoMod1, p2, this, TunaPhoneAction.class, "7")) {
                      b.f(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("callPhone"), TunaPhoneAction$requestVirtualPhone$1.INSTANCE);
                      PhoneInfoModel$VirtualPhone mPhoneTimeou = obj.mPhoneTimeout;
                      if (mPhoneTimeou - null <= 0) {
                         mPhoneTimeou = 1000;
                      }
                      obj2 = PatchProxy.applyOneRefs(obj, tunaPhoneAct, tunaPhoneAct1, "5");
                      b3 = (obj2 != patchProxyRe)? obj2.booleanValue(): tunaPhoneAct.m(obj.mBackupPhoneExpiryTimestamp, b1);
                      boolean b4 = b3;
                      tunaPhoneAct.k(b1);
                      Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                      uBooleanRef.element = b1;
                      a = d.a;
                      i oi = v5;
                      i oi1 = v5;
                      oi = new i(this, uBooleanRef, p2, b4, mUserId);
                      b uob = t.timer(mPhoneTimeou, TimeUnit.MILLISECONDS).filter(super(mPhoneTimeou)).observeOn(a).subscribeOn(d.c).subscribe(oi1, j.b);
                      long l = SystemClock.elapsedRealtime();
                      d = tunaPhoneAct.d;
                      if (d != null) {
                         a a1 = d.a;
                         if (a1 != null) {
                            integer = Integer.valueOf(a1.incrementAndGet());
                         label_0115 :
                            obj1 = b.a(-93866330);
                            obj2 = obj.mSource;
                            if (obj2 != null) {
                               str = obj2;
                            }
                            f uof = a;
                            obj1 = this;
                            b uob1 = uob;
                            Ref$BooleanRef uBooleanRef1 = uBooleanRef;
                            boolean b5 = b4;
                            obj = a;
                            uof = new f(obj1, uob1, uBooleanRef1, b5, mUserId, p2, l);
                            g og = new g(obj1, uob1, uBooleanRef1, b5, p2, mUserId);
                            obj1.e(mUserId, str, phoneInfoMod1, obj.mLocalPhoneNumber).map(new e()).subscribeOn(d.b).observeOn(a).doFinally(new e(tunaPhoneAct, integer)).subscribe(obj, a);
                         }
                      }
                      integer = null;
                      goto label_0115 ;
                   }
                }
             }
          }
       label_0080 :
          if (!b2) {
             goto label_0082 ;
          }else {
             tunaPhoneAct.k(b);
             Objects.requireNonNull(p2);
             Object obj3 = p2;
             Object obj4 = PatchProxy.apply(null, obj3, virtualPhone, "2");
             if (obj4 != patchProxyRe) {
                str = obj4;
             }else if(!TextUtils.x(obj3.mPhone)){
                str = obj3.mPhone;
             }else if(!TextUtils.x(obj3.mBackupPhone)){
                str = obj3.mBackupPhone;
             }
             tunaPhoneAct.f(str, mUserId, "existedVirtualPhone");
          }
       }
       return;
    }
    public final void k(boolean p0){
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       if (PatchProxy.isSupport(tunaPhoneAct) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tunaPhoneAct, "9")) {
          return;
       }
       d.a.d(new TunaPhoneAction$f(this, p0));
       return;
    }
    public final void l(TunaVirtualPhoneResponse$AuthInfo p0,String p1,a p2,a p3,String p4){
       TunaVirtualPhoneResponse$LinkText linkText;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       int i = 0;
       int i1 = 1;
       int i2 = 3;
       if (PatchProxy.isSupport(tunaPhoneAct)) {
          Object[] objArray = new Object[]{oobject,p1,p2,oobject1,p4};
          if (PatchProxy.applyVoid(objArray, obj, tunaPhoneAct, "12")) {
             return;
          }
       }
       if (oobject == null) {
          p2.invoke();
          return;
       }else if(oobject.mNeedAuth == null){
          p2.invoke();
          return;
       }else {
          TunaPhoneAction f = obj.f;
          if (f != null) {
             Activity uActivity = f.get();
             if (uActivity != null) {
                a.o(uActivity, "activity?.get\(\) ?: return onDenied\(\)");
                int i3 = 0x7f104c15;
                int i4 = 0x7f11066a;
                if (a1.j(obj.f) && oobject.mTitle != null) {
                   TunaVirtualPhoneResponse$AuthInfo mAuthItems = oobject.mAuthItems;
                   if (mAuthItems != null) {
                      a.o(mAuthItems, "authInfo.mAuthItems");
                      mAuthItems = (!mAuthItems.length)? 1: null;
                      if (!mAuthItems) {
                         object oobject2 = oobject.mAuthItems[i];
                         TunaVirtualPhoneResponse$AuthItem mItemScene = (oobject2 != null)? oobject2.mItemScene: null;
                         if (mItemScene == null || oobject2.mContent == null) {
                            i.d(i4, a1.p(i3));
                            p3.invoke();
                            return;
                         }else {
                            SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                            Ref$ObjectRef objectRef = new Ref$ObjectRef();
                            objectRef.element = "";
                            TunaVirtualPhoneResponse$AuthItem mContent = oobject2.mContent;
                            int len = mContent.length;
                            while (i < len) {
                               object oobject3 = mContent[i];
                               if (!TextUtils.x(oobject3.mText)) {
                                  int i5 = spannableStr.length();
                                  spannableStr.append(oobject3.mText);
                                  if (!TextUtils.x(oobject3.mLink)) {
                                     StringBuffer str = objectRef.element+oobject3.mText;
                                     TunaVirtualPhoneResponse$LinkText mLink = oobject3.mLink;
                                     a.o(mLink, "linkText.mLink");
                                     TunaPhoneAction$b uob = new TunaPhoneAction$b(uActivity, mLink);
                                     spannableStr.setSpan(uob, i5, spannableStr.length(), 17);
                                  }
                               }
                               i = i + 1;
                               linkText = 1;
                            }
                            TunaVirtualPhoneResponse$AuthItem mItemScene1 = oobject2.mItemScene;
                            a.o(mItemScene1, "authItem.mItemScene");
                            if (!PatchProxy.applyVoidOneRefs(mItemScene1, obj, tunaPhoneAct, "14")) {
                               u1.B0(new ShowMetaData().setType(i2).setElementPackage(obj.e("BUSINESS_PHONE_CONFIRM_POPUP", s0.k(new Pair("itemScene", mItemScene1)))));
                            }
                            StringBuilder str1 = oobject.mTitle;
                            String str2 = (p1 != null)? p1: "";
                            t$a uoa = new t$a(uActivity);
                            uoa.X0(str1+str2);
                            uoa.z0(spannableStr);
                            uoa.T0(oobject.mButtonText);
                            uoa.Q0(R.string.cancel);
                            uoa.v(true);
                            TunaPhoneAction$g og = new TunaPhoneAction$g(this, oobject2, p0, p4, objectRef, p2);
                            uoa.u0(len);
                            uoa.t0(new TunaPhoneAction$h(obj, oobject2, oobject1));
                            t$a uoa1 = f.e(uoa);
                            a.o(uoa1, "DialogBuilderFactory.app¡­ied\(\)\n            }\n    \)");
                            uoa1.Y(PopupInterface.a);
                            return;
                         }
                      }
                   }
                }
                i.d(i4, a1.p(i3));
                p3.invoke();
                return;
             }
          }
          p3.invoke();
          return;
       }
    }
    public final boolean m(long p0,boolean p1){
       TunaPhoneAction tunaPhoneAct = TunaPhoneAction.class;
       if (PatchProxy.isSupport(tunaPhoneAct)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, tunaPhoneAct, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 > 0) {
          try{
             boolean b = (d.a() - p0 < 0)? true: false;
             return b;
          }catch(java.lang.Exception e0){
             return d.a() - p0;
          }
       }else {
          goto label_0033 ;
       }
    }
}
