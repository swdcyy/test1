package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import m4b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$a;
import nsd.u;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$b;
import w26.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import m4b.d;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.lang.Boolean;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import android.view.View;
import com.kwai.framework.location.k;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$c;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$d;
import erd.g;
import crd.b;
import crd.a;
import q96.d;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$e;
import a4b.a;
import e17.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$f;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Iterator;
import a4b.a$a;
import e4b.a;
import e4b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$g;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$h;
import a4b.b;
import java.util.HashMap;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$i;
import p4b.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$j;
import android.app.Dialog;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$k;
import android.content.Intent;
import n3d.a$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$l;
import n3d.a;
import w46.b;
import k4b.a;
import java.util.Map;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.c;
import zk.g;
import java.util.Date;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$m;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import lnc.b9;
import java.util.Objects;
import com.kwai.video.westeros.models.EffectResource;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.e;
import com.kwai.video.westeros.models.EffectHint;
import e4b.b;
import j4b.p;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$onCreate$1;
import p4b.g;
import msd.l;
import eoc.f;

public final class MagicEditionHandler implements e	// class@001bc8
{
    public MagicEmoji$MagicFace b;
    public EffectDescription c;
    public boolean d;
    public b e;
    public a f;
    public boolean g;
    public MagicEditionHandler$b h;
    public final c i;
    public static final MagicEditionHandler$a j;

    static {
       MagicEditionHandler.j = new MagicEditionHandler$a(null);
    }
    public void MagicEditionHandler(MagicEditionHandler$b p0,c p1){
       a.p(p0, "editionlistener");
       a.p(p1, "publishPostPlugin");
       super();
       this.h = p0;
       this.i = p1;
       this.d = true;
    }
    public void G(){
       d.e(this);
    }
    public final String a(Location p0){
       String obj = PatchProxy.applyOneRefs(p0, this, MagicEditionHandler.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(p0);
       Object[] objArray = new Object[0];
       b.D().w("MagicEditionController", "fillLocationInfo: "+p0, objArray);
       a.o(obj, "locationJson");
       return obj;
    }
    public final MagicEditionHandler$b b(){
       return this.h;
    }
    public final Integer c(){
       Object[] objArray = null;
       MagicEditionHandler obj = PatchProxy.apply(objArray, this, MagicEditionHandler.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          MagicEmoji$MagicFace mExtraParams = obj.mExtraParams;
          if (mExtraParams != null) {
             MagicFaceExtraParams mRecordId = mExtraParams.mRecordId;
             Object[] objArray1 = new Object[0];
             b.D().w("MagicEditionController", "recordId: "+mRecordId, objArray1);
             return Integer.valueOf(mRecordId);
          }
       }
       return objArray;
    }
    public final boolean d(){
       LocationCityInfo obj = PatchProxy.apply(null, this, MagicEditionHandler.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = u.e("default");
       int i = 0;
       boolean b = (obj != null && !obj.isInvalid())? true: false;
       Object[] objArray = new Object[i];
       b.D().w("MagicEditionController", "hasLocationCache location="+obj+" hasCache="+b, objArray);
       return b;
    }
    public void doBindView(View p0){
       d.b(this, p0);
    }
    public final boolean e(){
       boolean b;
       Activity obj = PatchProxy.apply(null, this, MagicEditionHandler.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (k.a("default")) {
          obj = this.h.getActivity();
          a.m(obj);
          if (PermissionUtils.a(obj, "android.permission.ACCESS_FINE_LOCATION")) {
             b = true;
          label_0030 :
             return b;
          }
       }
       b = false;
       goto label_0030 ;
    }
    public void e1(int p0){
       d.l(this, p0);
    }
    public final void f(){
       MagicEditionHandler magicEdition = MagicEditionHandler.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, magicEdition, "13")) {
          return;
       }
       this.g = false;
       b uob = this.i.qJ(objArray).observeOn(d.c).subscribe(new MagicEditionHandler$c(this), MagicEditionHandler$d.b);
       a.o(uob, "disposable");
       if (!PatchProxy.applyVoidOneRefs(uob, this, magicEdition, "15")) {
          if (this.f == null) {
             this.f = new a();
          }
          magicEdition = this.f;
          if (magicEdition != null) {
             magicEdition.c(uob);
          }
       }
       return;
    }
    public final void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler.class, "14")) {
          return;
       }
       u.o(false, p0, "default", "post_magicface", "post_magicface");
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       d.a(this, p0, p1);
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, MagicEditionHandler.class, "12")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       if (!this.e()) {
          return;
       }
       if (!this.d()) {
          this.g(new MagicEditionHandler$e(this));
       }else {
          this.f();
       }
       return;
    }
    public final void j(Activity p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicEditionHandler.class, "18")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       if (!this.e()) {
          return;
       }
       if (!k.f()) {
          i.a(R.style.arg_RES_7f110668, 0x7f10304e);
          return;
       }else if(!this.d()){
          this.g(new MagicEditionHandler$f(this, p0, p1));
       }else {
          this.n(p0, p1);
       }
       return;
    }
    public final void k(a p0){
       JsonObject jsonObject;
       MagicEditionHandler magicEdition = MagicEditionHandler.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, magicEdition, "5")) {
          return;
       }
       Integer integer = this.c();
       if (integer != null) {
          int i = integer.intValue();
          String str = p0.b();
          Iterator obj = PatchProxy.applyOneRefs(p0, this, magicEdition, "22");
          if (obj != PatchProxyResult.class) {
             jsonObject = obj;
          }else {
             JsonObject jsonObject1 = new JsonObject();
             obj = p0.a().iterator();
             while (obj.hasNext()) {
                a$a uoa = obj.next();
                a.o(uoa, "element");
                String str1 = uoa.b();
                jsonObject1.c0(str1, uoa.a());
             }
             if (p0.b() != null) {
                jsonObject1.c0("id", p0.b());
             }
             jsonObject = jsonObject1;
          }
          this.p(p0, i, str, jsonObject);
          MagicEditionHandler$g og = new MagicEditionHandler$g(this, p0, i, str, jsonObject);
          c.a().n(i, str, jsonObject).observeOn(d.c).subscribe(integer, MagicEditionHandler$h.b);
       }
       return;
    }
    public final void l(boolean p0){
       a obj;
       MagicEditionHandler magicEdition = MagicEditionHandler.class;
       if (PatchProxy.isSupport(magicEdition) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, magicEdition, "4")) {
          return;
       }
       Integer integer = this.c();
       if (integer != null) {
          int i = integer.intValue();
          a uoa = b.d.a().get(Integer.valueOf(i));
          if (uoa != null) {
             a.o(uoa, "MagicEditionResourceInst\x20\x02cordId]\n        ?: return\x00");
             Activity activity = this.h.getActivity();
             if (activity != null) {
                if (activity.isFinishing()) {
                   return;
                }else {
                   int i1 = 0;
                   if (p0 && uoa.a().size() == 1) {
                      obj = uoa.a().get(i1);
                      a.o(obj, "magicEditionDialogModel.elements[0]");
                      if (a.g(obj.d(), "location")) {
                         Object[] objArray = new Object[i1];
                         b.D().w("MagicEditionController", "只有地理位置信息的魔表, 直接跳转到发布页地理位置选择", objArray);
                         if (!this.e()) {
                            this.m(new MagicEditionHandler$i(this, activity, uoa));
                         }else {
                            this.j(activity, uoa);
                         }
                         return;
                      }
                   }
                   Object[] objArray1 = new Object[i1];
                   b.D().w("MagicEditionController", "正常展示魔表编辑弹窗", objArray1);
                   obj = new a(activity, uoa);
                   obj.d = new MagicEditionHandler$j(this, i, obj);
                   obj.show();
                }
             }
          }
       }
       return;
    }
    public final void m(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler.class, "10")) {
          return;
       }
       this.g = false;
       u.n("default", false, false, new MagicEditionHandler$k(this, p0), "post_magicface", "post_magicface", "post_magicface");
       return;
    }
    public final void n(Activity p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicEditionHandler.class, "19")) {
          return;
       }
       Intent intent = this.i.UQ(p0);
       intent.putExtra("page_title", p0.getString(R.string.user_location));
       boolean b = false;
       intent.putExtra("show_none", b);
       if (p0 instanceof a$a) {
          p0.t1(intent, 1000, new MagicEditionHandler$l(this, p1));
       }else {
          Object[] objArray = new Object[b];
          b.D().t("MagicEditionController", "activity need instanceof ActivityCallback.CallbackHandler", objArray);
       }
       p0.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f01004c);
       return;
    }
    public final void o(EffectDescription p0){
       JsonObject jsonObject;
       JsonObject jsonObject1;
       boolean b;
       String str4;
       JsonObject jsonObject2;
       Serializable serializable;
       EffectDescription uEffectDescr = this;
       EffectDescription uEffectDescr1 = p0;
       if (PatchProxy.applyVoidOneRefs(uEffectDescr1, uEffectDescr, MagicEditionHandler.class, "9")) {
          return;
       }
       if (uEffectDescr1 != null && p0.getCustomStickerJsonCount()) {
          Integer integer = this.c();
          if (integer != null) {
             boolean i = integer.intValue();
             Object[] objArray = new Object[0];
             b.D().w("MagicEditionController", "刷新缓存数据", objArray);
             String str = p0.getCustomStickerJsonMap().get(uEffectDescr.h.getLanguage());
             if (str == null) {
                str = p0.getCustomStickerJsonMap().get("en");
             }
             if (str == null) {
                str = p0.getCustomStickerJsonMap().get("zh");
             }
             if (str == null) {
                return;
             }else {
                a uoa = a.a.h(str, a.class);
                if (uoa == null) {
                   return;
                }else {
                   List list = uoa.a();
                   MagicEmojiUserInfo magicEmojiUs = b.d.c();
                   if (magicEmojiUs != null || uEffectDescr.b == null) {
                      uEffectDescr1 = null;
                   }
                   uEffectDescr.c = uEffectDescr1;
                   MagicEmojiUserInfo mRecordInfo = (magicEmojiUs != null)? magicEmojiUs.mRecordInfo: null;
                   if (mRecordInfo != null && magicEmojiUs.mRecordInfo.size() > 0) {
                      Object[] objArray1 = new Object[0];
                      b.D().w("MagicEditionController", "获取用户配置数据", objArray1);
                      JsonArray jsonArray = magicEmojiUs.mRecordInfo.e0(String.valueOf(i));
                      if (jsonArray != null) {
                         JsonElement jsonElement = jsonArray.e0(0);
                         if (jsonElement != null) {
                            jsonObject = jsonElement.r();
                         label_00b6 :
                            if (jsonObject != null) {
                               c uoc = new c();
                               g og = jsonObject.r0("data");
                               String str1 = (og != null)? og.w(): null;
                               JsonElement jsonElement1 = uoc.a(str1);
                               a.o(jsonElement1, "JsonParser\(\).parse\(recor\x20\x02onDialog.DATA\)?.asString\)\x00");
                               jsonObject1 = jsonElement1.r();
                               g og1 = jsonObject.r0("id");
                               String str2 = (og1 != null)? og1.w(): null;
                               uoa.c(str2);
                            label_00eb :
                               Iterator iterator = list.iterator();
                               b = false;
                               str1 = 0;
                               boolean b1 = true;
                               while (iterator.hasNext()) {
                                  a$a uoa1 = iterator.next();
                                  String str3 = "element";
                                  if (jsonObject1 != null) {
                                     a.o(uoa1, str3);
                                     g og2 = jsonObject1.r0(uoa1.b());
                                     if (og2 != null) {
                                        str4 = og2.w();
                                     label_0115 :
                                        if (str4 != null) {
                                           a.o(uoa1, str3);
                                           uoa1.f(str4);
                                        }else {
                                           a.o(uoa1, str3);
                                           if (a.g(uoa1.d(), "date")) {
                                              jsonObject2 = jsonObject1;
                                              long l = new Date().getTime() / (long)1000;
                                              uoa1.f(String.valueOf(l));
                                           label_0146 :
                                              if (uoa1.e()) {
                                                 b = true;
                                              }
                                              if (a.g(uoa1.d(), "location")) {
                                                 if (!this.e()) {
                                                    uEffectDescr.m(new MagicEditionHandler$m(uEffectDescr));
                                                 }else {
                                                    this.i();
                                                 }
                                                 str1 = 1;
                                              }
                                              jsonObject1 = jsonObject2;
                                           }
                                        }
                                        jsonObject2 = jsonObject1;
                                        goto label_0146 ;
                                     }
                                  }
                                  str4 = null;
                                  goto label_0115 ;
                               }
                               str2 = a.a.q(uoa);
                               b uob = b.D();
                               StringBuilder str5 = "magicFace Id: ";
                               MagicEditionHandler b2 = uEffectDescr.b;
                               SimpleMagicFace mId = (b2 != null)? b2.mId: null;
                               Object[] objArray2 = new Object[0];
                               uob.w("MagicEditionController", str5+mId+", isEdit: "+b, objArray2);
                               uob = b.d;
                               uob.b().put(Integer.valueOf(i), Boolean.valueOf(b));
                               uob.a().put(Integer.valueOf(i), uoa);
                               if (magicEmojiUs != null) {
                                  MagicEmojiUserInfo mRecordInfo1 = magicEmojiUs.mRecordInfo;
                                  if (mRecordInfo1 != null && !mRecordInfo1.size()) {
                                     i = false;
                                  label_01cb :
                                     Activity activity = uEffectDescr.h.getActivity();
                                     if (activity != null) {
                                        Intent intent = activity.getIntent();
                                        if (intent != null) {
                                           serializable = SerializableHook.getSerializableExtra(intent, "magic_face");
                                        label_01e1 :
                                           if (serializable == null) {
                                              b1 = false;
                                           }
                                           Object[] objArray3 = new Object[0];
                                           b.D().w("MagicEditionController", "魔表是否首次加载: "+uEffectDescr.d+", 是否有用户配置信息: "+i+"是否可以编辑: "+b+", 是否是从别的页面过来的魔表: "+b1, objArray3);
                                           if (uEffectDescr.d != null && (!i && (b1 && (b && !str1)))) {
                                              uEffectDescr.d = false;
                                              uEffectDescr.l(0);
                                           }
                                        label_022a :
                                           Object[] objArray4 = new Object[0];
                                           b.D().w("MagicEditionController", "configJson: "+str2, objArray4);
                                           MagicEditionHandler b3 = uEffectDescr.b;
                                           if (b3 != null) {
                                              b3.mMagicUserInfo = str2;
                                           }
                                           if (!str1) {
                                              b3 = uEffectDescr.h;
                                              if (b3 != null) {
                                                 b3.q(str2);
                                              }
                                           }
                                        }
                                     }
                                     serializable = null;
                                     goto label_01e1 ;
                                  }
                               }
                               i = true;
                               goto label_01cb ;
                            }
                         }
                      }
                      jsonObject = null;
                      goto label_00b6 ;
                   }
                label_00ea :
                   jsonObject1 = null;
                   goto label_00eb ;
                }
             }
          }
       }
    label_0253 :
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       d.d(this, p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MagicEditionHandler.class, "3")) {
          return;
       }
       this.g = false;
       b9.a(this.e);
       b9.a(this.f);
       this.f = null;
       this.c = null;
       b d = b.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoid(null, d, b.class, "3")) {
          b.b.clear();
          b.c.clear();
          b.a = null;
       }
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MagicEditionHandler.class, "8")) {
          return;
       }
       b uob = b.D();
       StringBuilder str = "onEffectDescriptionUpdated: ";
       String str1 = (p0 != null)? p0.toString(): null;
       int i = 0;
       Object[] objArray = new Object[i];
       uob.w("MagicEditionController", str+str1, objArray);
       this.g = i;
       this.o(p0);
       Integer integer = this.c();
       Boolean uBoolean = (integer != null)? b.d.b().get(integer): Boolean.FALSE;
       RxBus.f.b(new e(a.g(uBoolean, Boolean.TRUE)));
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       d.k(this, p0);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MagicEditionHandler.class, "2")) {
          return;
       }
       if (this.g != null) {
          this.i();
       }
       return;
    }
    public final void p(a p0,int p1,String p2,JsonObject p3){
       if (PatchProxy.isSupport(MagicEditionHandler.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MagicEditionHandler.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicEditionController", "updateMagicUserInfoIfNeed recordId: "+p1+", "+"dataId: "+p2+", resultData: "+p3, objArray);
       if (p2 != null) {
          p0.c(p2);
          b d = b.d;
          d.a().put(Integer.valueOf(p1), p0);
          String str = String.valueOf(p1);
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidThreeRefs(str, p2, p3, d, b.class, "2")) {
             MagicEmojiUserInfo a = b.a;
             if (a != null) {
                a = a.mRecordInfo;
                if (a != null) {
                   JsonElement jsonElement = a.e0(str);
                   if (jsonElement != null) {
                      Iterator iterator = jsonElement.iterator();
                      while (iterator.hasNext()) {
                         JsonElement jsonElement1 = iterator.next();
                         a.o(jsonElement1, "ria");
                         JsonElement jsonElement2 = jsonElement1.r().e0("id");
                         a.o(jsonElement2, "ria.asJsonObject.get\(MagicEditionDialog.ID\)");
                         g og = jsonElement2.s();
                         a.o(og, "ria.asJsonObject.get\(Mag…ialog.ID\).asJsonPrimitive");
                         if (a.g(og.w(), p2)) {
                            jsonElement1.r().c0("data", String.valueOf(p3));
                         }
                      }
                      b.e(b.a);
                      Object[] objArray1 = new Object[0];
                      b.D().w("MagicEditionResourceInstance", "updated data: "+a, objArray1);
                   }
                }
             }
          }
       }
       return;
    }
    public void unbind(){
       d.n(this);
    }
    public void w(){
       d.f(this);
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler.class, "1")) {
          return;
       }
       d.h(this, p0);
       this.e = f.a(p.class, new g(new MagicEditionHandler$onCreate$1(this)));
       return;
    }
    public void x1(){
       d.g(this);
    }
    public void y1(){
       d.c(this);
    }
}
