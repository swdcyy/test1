package com.yxcorp.gifshow.custom.ShareCustomRepo;
import com.yxcorp.gifshow.custom.ShareCustomRepo$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import java.util.List;
import lnc.la;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import java.util.Collection;
import java.util.Iterator;
import q5b.h;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.utility.TextUtils;
import android.text.TextUtils;
import com.kuaishou.edit.draft.CustomSetting;
import com.yxcorp.gifshow.custom.CustomType;
import java.lang.Boolean;
import java.util.Map;
import pt9.b;
import qr4.i;
import qr4.m$k0;
import qr4.m$c0;
import km6.e;
import ow8.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import oa0.a;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import km8.b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import bba.b;
import com.kuaishou.edit.draft.Publish;
import lnc.s6;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.custom.ShareCustomRepo$initCustomSettingDraft$1;
import msd.l;
import com.yxcorp.gifshow.custom.ShareCustomRepo$initCustomSettingDraft$2;
import com.yxcorp.gifshow.custom.ShareCustomRepo$initCustomSettingDraft$3;
import com.yxcorp.gifshow.custom.ShareCustomRepo$initCustomSettingDraft$4;
import com.yxcorp.gifshow.custom.ShareCustomRepo$initCustomSettingDraft$5;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import com.kuaishou.edit.draft.CustomSetting$b;
import pt9.h;
import java.lang.Enum;
import java.lang.Integer;
import lq.i;
import java.lang.Iterable;
import com.yxcorp.gifshow.custom.ShareCustomRepo$updateRecreationSwitch$1;
import com.yxcorp.gifshow.custom.ShareCustomRepo$updateShieldLocalSwitch$1;
import com.yxcorp.gifshow.custom.ShareCustomRepo$updateDownloadDenySwitch$1;
import com.yxcorp.gifshow.custom.ShareCustomRepo$updateSameFrameSwitch$1;
import com.yxcorp.gifshow.custom.ShareCustomRepo$updateMagicSwitch$1;

public final class ShareCustomRepo	// class@00129b
{
    public final HashMap a;
    public boolean b;
    public boolean c;
    public final HashMap d;
    public final HashMap e;
    public String f;
    public List g;
    public int h;
    public final c i;
    public final VideoContext j;
    public final SameFrameShareConfig k;
    public final QPhoto l;
    public static final ShareCustomRepo$a m;

    static {
       ShareCustomRepo.m = new ShareCustomRepo$a(null);
    }
    public void ShareCustomRepo(c p0,VideoContext p1,SameFrameShareConfig p2,QPhoto p3){
       String str;
       Object[] objArray;
       boolean b;
       Object[] objArray1;
       ShareCustomRepo i;
       Publish publish;
       CustomSetting customSettin;
       m$k0 e0;
       i oi;
       boolean b1;
       Object[] objArray2;
       boolean b2;
       ShareCustomRepo a;
       CustomType kuaiyingPlc;
       boolean i1;
       Object[] objArray3;
       MagicEmoji$MagicFace obj1;
       VideoContext obj2;
       ShareCustomRepo shareCustomR;
       List list2;
       c uoc = this;
       QCurrentUser obj = p1;
       a.p(obj, "mVideoContext");
       super();
       uoc.i = p0;
       uoc.j = obj;
       uoc.k = p2;
       uoc.l = p3;
       uoc.a = new HashMap();
       uoc.d = new HashMap();
       uoc.e = new HashMap();
       uoc.g = new ArrayList();
       if (PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "4")) {
       }else {
          objArray2 = new Object[0];
          a.b().w("ShareCustomRepo", "initMagicEntry", objArray2);
          List list = b.j(la.a(p1));
          a.o(list, "PhotoMetaUtils.removeDup¡­Recursive\(mVideoContext\)\)");
          uoc.g.addAll(list);
          if (obj != null) {
             Iterator iterator = p1.t().iterator();
             do {
                if (iterator.hasNext()) {
                   obj2 = iterator.next();
                   if (obj2 == null) {
                      continue ;
                   }
                }
                list2 = obj2.n();
             } while (list2 != null);
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(uoc.g);
             if (objArray != null) {
                uArrayList.addAll(objArray);
             }
             List list1 = b.j(uArrayList);
             str = ", ";
             StringBuilder str1 = PatchProxy.applyTwoRefs(list1, str, null, h.class, "3");
             if (str1 != PatchProxyResult.class) {
             }else if(list1 == null || list1.isEmpty()){
                str1 = "";
             }else {
                str1 = "";
                iterator = list1.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (!TextUtils.x(obj1.mName)) {
                      if (str1.length() > 0) {
                         str1 = str1+str;
                      }
                      str1 = str1+obj1.mName;
                   }
                }
             }
             String str2 = str1.toString();
             uoc.f = str2;
             if (!TextUtils.isEmpty(str2)) {
                customSettin = this.a();
                b = (customSettin != null)? customSettin.getAllowMagicFace(): true;
                objArray1 = new Object[0];
                a.b().w("ShareCustomRepo", "mMagicName "+uoc.f+"  switch: "+b, objArray1);
                uoc.a.put(CustomType.Emojis, Boolean.valueOf(b));
                uoc.j.p1(b);
             }
          }
          objArray = null;
          goto label_0089 ;
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "6")) {
          objArray = new Object[0];
          a.b().w("ShareCustomRepo", "initSameFrameEntry", objArray);
          i = uoc.k;
          if (i != null && i.mAllowSameFrame != null) {
             if (b.e(uoc.l, uoc.i)) {
                objArray = new Object[0];
                a.b().w("ShareCustomRepo", "reedit not support sameframe", objArray);
             }else {
                customSettin = this.a();
                boolean b5 = (customSettin != null)? customSettin.getAllowSameFrame(): true;
                objArray2 = new Object[0];
                a.b().w("ShareCustomRepo", "initSameFrame  switch: "+b5, objArray2);
                uoc.a.put(CustomType.SameFrame, Boolean.valueOf(b5));
                ShareCustomRepo j = uoc.j;
                ShareCustomRepo k = uoc.k;
                if (PatchProxy.isSupport(ShareCustomRepo.class)) {
                   shareCustomR = k;
                   if (!PatchProxy.applyVoidThreeRefs(j, k, Boolean.valueOf(b5), this, ShareCustomRepo.class, "7")) {
                   }
                }else {
                   shareCustomR = k;
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "8")) {
          objArray = new Object[0];
          a.b().w("ShareCustomRepo", "initHdExportEntry", objArray);
          if (b.e(uoc.l, uoc.i)) {
             objArray = new Object[0];
             a.b().w("ShareCustomRepo", "reedit not support hd", objArray);
          }else {
             i = uoc.i;
             obj2 = PatchProxy.applyOneRefs(i, null, c.class, "23");
             if (obj2 != PatchProxyResult.class) {
                b = obj2.booleanValue();
             }else if(i == null || (i.v() != null && (i.a1() != Workspace$Type.ATLAS && (i.a1() != Workspace$Type.SINGLE_PICTURE && i.a1() != Workspace$Type.LONG_PICTURE)))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                SharedPreferences a2 = a.a;
                str = "has_auto_open_hd_export";
                if (!a2.getBoolean(str, 0) && n.b().getBoolean(PostUtils.s("enableAutoOpenHdExport"), 0)) {
                   b2 = true;
                   a.Y0(b2);
                   SharedPreferences$Editor uEditor = a2.edit();
                   uEditor.putBoolean(str, b2);
                   g.a(uEditor);
                }
                b = a.I();
                objArray1 = new Object[0];
                a.b().w("ShareCustomRepo", "initHdExportEntry  switch: "+b, objArray1);
                uoc.a.put(CustomType.HdExport, Boolean.valueOf(b));
             }
          }
       }
       str = "initDownloadDenyEntry switch ";
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "9")) {
          if (b.e(uoc.l, uoc.i)) {
             objArray2 = new Object[0];
             a.b().w("ShareCustomRepo", "reedit not support download switch", objArray2);
          }else {
             b = uoc.b(this.a());
             objArray3 = new Object[0];
             a.b().w("ShareCustomRepo", str+b, objArray3);
             uoc.a.put(CustomType.DownloadDeny, Boolean.valueOf(b));
          }
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "13")) {
          customSettin = this.a();
          b = (customSettin != null)? customSettin.getDisableNearby(): false;
          objArray1 = new Object[0];
          a.b().w("ShareCustomRepo", str+b, objArray1);
          uoc.a.put(CustomType.ShieldLocal, Boolean.valueOf(b));
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "14")) {
          if (b.e(uoc.l, uoc.i)) {
             objArray = new Object[0];
             a.b().w("ShareCustomRepo", "reedit not support save album", objArray);
          }else if(PermissionUtils.a(a.b(), "android.permission.WRITE_EXTERNAL_STORAGE") && b.c(a.w, 0).getBoolean("key_save_album", 0)){
             b = true;
          }else {
             b = false;
          }
          objArray1 = new Object[0];
          a.b().w("ShareCustomRepo", "initSaveAlbumSwitch switch "+b, objArray1);
          uoc.a.put(CustomType.SaveAlbum, Boolean.valueOf(b));
       }
       str = "2";
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "3")) {
          b = c.a();
          objArray3 = new Object[0];
          a.b().w("ShareCustomRepo", "initRecreationSwitch: "+b, objArray3);
          if (!b) {
             uoc.j.g(true);
          }else if(b.a(uoc.l)){
             i = uoc.l;
             Boolean uBoolean = (i != null)? Boolean.valueOf(b.g(i.recreationSetting())): null;
             objArray3 = new Object[0];
             a.b().w("ShareCustomRepo", "initRecreationSwitch from qPhoto switch "+uBoolean, objArray3);
             a = uoc.a;
             kuaiyingPlc = CustomType.Recreation;
             i1 = (uBoolean != null)? uBoolean.booleanValue(): false;
             a.put(kuaiyingPlc, Boolean.valueOf(i1));
             a = uoc.j;
             b = (uBoolean != null)? uBoolean.booleanValue(): false;
             a.g(b);
          }else {
             uoc.j.g(true);
             if (b.f(uoc.i)) {
                i = uoc.l;
                a = uoc.i;
                obj1 = PatchProxy.applyTwoRefs(i, a, null, b.class, str);
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(b.e(i, a) && !b.a(i)){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                   customSettin = this.a();
                   b = (customSettin != null)? customSettin.getDisallowRecreation(): false;
                   objArray3 = new Object[0];
                   a.b().w("ShareCustomRepo", "initRecreationSwitch from workspace switch "+b, objArray3);
                   uoc.a.put(CustomType.Recreation, Boolean.valueOf(b));
                   uoc.j.g(b);
                }
             }
             uoc.j.g(true);
          }
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "1")) {
          b = b.c(uoc.j);
          b2 = b.b(uoc.i);
          DraftUtils.N(uoc.i);
          if (b.d() && (b || b2)) {
             boolean b3 = true;
             uoc.b = b3;
             a = uoc.a;
             kuaiyingPlc = CustomType.KuaiyingPlc;
             i oi1 = uoc.j.d2(0);
             if (oi1 != null) {
                oi1 = oi1.b;
                if (oi1 != null) {
                   i1 = oi1.g1 ^ b3;
                label_04bf :
                   a.put(kuaiyingPlc, Boolean.valueOf(i1));
                   ShareCustomRepo a1 = uoc.a;
                   CustomType kuaishanTemp = CustomType.KuaishanTemplatePlc;
                   oi1 = uoc.j.d2(0);
                   if (oi1 != null) {
                      oi1 = oi1.b;
                      if (oi1 != null) {
                         i1 = oi1.o1 ^ 1;
                      label_04dd :
                         a1.put(kuaishanTemp, Boolean.valueOf(i1));
                         if (b) {
                            uoc.c = true;
                            str = a1.p(R.string.arg_RES_7f1001b9);
                            a.o(str, "CommonUtil.string\(R.stri¡­.allow_show_kuaiying_plc\)");
                            uoc.d.put(kuaiyingPlc, str);
                            str = a1.p(R.string.arg_RES_7f1001b8);
                            a.o(str, "CommonUtil.string\(R.stri¡­kuaishan_plc_to_somebody\)");
                            uoc.d.put(kuaishanTemp, str);
                         }else {
                            uoc.c = false;
                            str = a1.p(R.string.arg_RES_7f1001b7);
                            a.o(str, "CommonUtil.string\(R.stri¡­.allow_show_kuaishan_plc\)");
                            uoc.d.put(kuaishanTemp, str);
                            str = a1.p(R.string.arg_RES_7f1001ba);
                            a.o(str, "CommonUtil.string\(R.stri¡­kuaiying_plc_to_somebody\)");
                            uoc.d.put(kuaiyingPlc, str);
                         }
                      }
                   }
                   boolean b4 = true;
                   i1 = true;
                   goto label_04dd ;
                }
             }
             i1 = true;
             goto label_04bf ;
          }else if(PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, str) || (a.g("com.kwai.videoeditor", uoc.j.D()) ^ 1)){
             if (b.e(uoc.l, uoc.i)) {
                objArray = new Object[0];
                a.b().w("ShareCustomRepo", "reedit not support kuaiying plc", objArray);
             }else {
                objArray = new Object[0];
                a.b().w("ShareCustomRepo", "initKuaiyingPlcSwitch switch", objArray);
                i = uoc.a;
                CustomType kuaiyingPlc1 = CustomType.KuaiyingPlc;
                i oi2 = uoc.j.d2(0);
                if (oi2 != null) {
                   oi2 = oi2.b;
                   if (oi2 != null) {
                      b2 = oi2.g1 ^ 1;
                   label_0580 :
                      i.put(kuaiyingPlc1, Boolean.valueOf(b2));
                   }
                }
                b2 = true;
                goto label_0580 ;
             }
          }
       }
       if (!PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "11")) {
          if (PostExperimentUtils.O()) {
             objArray = new Object[0];
             a.b().w("ShareCustomRepo", "initVisibility24Hours not executed, enablePublishVisibleDurationOpt = true", objArray);
          }else if(b.e(uoc.l, uoc.i)){
             objArray = new Object[0];
             a.b().w("ShareCustomRepo", "reedit not support visibility24Hours switch", objArray);
          }else {
             i = uoc.i;
             if (i != null) {
                b uob = i.Q0();
                if (uob != null) {
                   publish = uob.v();
                label_05cd :
                   if (publish != null) {
                      uob = uoc.i.Q0();
                      a.o(uob, "mWorkspaceDraft.publishDraft");
                      publish = uob.v();
                      if (publish != null) {
                         customSettin = publish.getCustomSetting();
                         if (customSettin == null || customSettin.getShowVisibilityExpirationSwitch()) {
                         }
                      }else {
                      }
                   }
                   objArray = new Object[0];
                   a.b().w("ShareCustomRepo", "draft not allowed visibility24Hours switch", objArray);
                }
             }
             publish = null;
             goto label_05cd ;
          }
       }
       if (s6.d() && !PatchProxy.applyVoid(null, uoc, ShareCustomRepo.class, "10")) {
          if (b.e(uoc.l, uoc.i)) {
             objArray = new Object[0];
             a.b().w("ShareCustomRepo", "reedit not support watermark switch", objArray);
          }else {
             obj = QCurrentUser.ME;
             a.o(obj, "QCurrentUser.ME");
             b = obj.isAddWatermarkEnabled();
             objArray1 = new Object[0];
             a.b().w("ShareCustomRepo", "initWaterMark memory switch "+b, objArray1);
             uoc.a.put(CustomType.Watermark, Boolean.valueOf(b));
          }
       }
       this.f();
       return;
    }
    public static void k(ShareCustomRepo p0,CustomType p1,boolean p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = true;
       }
       p0.j(p1, p2, p3);
       return;
    }
    public final CustomSetting a(){
       Object[] objArray = null;
       ShareCustomRepo obj = PatchProxy.apply(objArray, this, ShareCustomRepo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          b uob = obj.Q0();
          if (uob != null) {
             Publish publish = uob.v();
             if (publish != null && publish.hasCustomSetting() == true) {
                uob = this.i.Q0();
                if (uob != null) {
                   publish = uob.v();
                   if (publish != null) {
                      objArray = publish.getCustomSetting();
                   }
                }
             }
          }
       }
       return objArray;
    }
    public final boolean b(CustomSetting p0){
       boolean b2;
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareCustomRepo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       boolean b1 = a.t().d("disableDownloadUnder15", b);
       if (b1) {
          int i = -1;
          int intx = a.a.getInt("share_deny_download_under15", i);
          Object[] objArray = new Object[b];
          a.b().w("ShareCustomRepo", "initDownloadDenyEntry : under15="+b1+" select="+intx, objArray);
          b2 = true;
          if (intx == i || intx == b2) {
          label_0055 :
             Object[] objArray1 = new Object[b];
             a.b().w("ShareCustomRepo", "default: "+b2+" under15: "+b1, objArray1);
             if (p0 != null) {
                b2 = p0.getDenyDownload();
             }
             return b2;
          }
       }
       b2 = false;
       goto label_0055 ;
    }
    public final HashMap c(){
       return this.a;
    }
    public final String d(){
       return this.f;
    }
    public final HashMap e(){
       return this.d;
    }
    public final void f(){
       ShareCustomRepo ti;
       b uob;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareCustomRepo.class, "31")) {
          return;
       }
       String str = "ShareCustomRepo";
       int i = 0;
       if (!this.g() || this.a() != null) {
          objArray = new Object[i];
          a.b().w(str, "don\'t need updateCustomSettingDraft", objArray);
          return;
       }else {
          Iterator iterator = this.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object[] objArray1 = new Object[i];
             a.b().w(str, "updateCustomSettingDraft type: "+uEntry, objArray1);
             if (uEntry.getKey() == CustomType.Recreation) {
                int i1 = uEntry.getValue().booleanValue() ^ 0x01;
                this.j(uEntry.getKey(), i1, i);
             }else {
                this.j(uEntry.getKey(), uEntry.getValue().booleanValue(), i);
             }
          }
          if (!this.a.containsKey(CustomType.Emojis)) {
             ti = this.i;
             uob = (ti != null)? ti.Q0(): objArray;
             a.m(uob);
             this.i(uob, i, ShareCustomRepo$initCustomSettingDraft$1.INSTANCE);
          }
          if (!this.a.containsKey(CustomType.SameFrame)) {
             ti = this.i;
             uob = (ti != null)? ti.Q0(): objArray;
             a.m(uob);
             this.i(uob, i, ShareCustomRepo$initCustomSettingDraft$2.INSTANCE);
          }
          if (!this.a.containsKey(CustomType.ShieldLocal)) {
             ti = this.i;
             uob = (ti != null)? ti.Q0(): objArray;
             a.m(uob);
             this.i(uob, i, ShareCustomRepo$initCustomSettingDraft$3.INSTANCE);
          }
          if (!this.a.containsKey(CustomType.Recreation)) {
             ti = this.i;
             uob = (ti != null)? ti.Q0(): objArray;
             a.m(uob);
             this.i(uob, i, ShareCustomRepo$initCustomSettingDraft$4.INSTANCE);
          }
          if (!this.a.containsKey(CustomType.DownloadDeny)) {
             ti = this.i;
             if (ti != null) {
                objArray = ti.Q0();
             }
             a.m(objArray);
             this.i(objArray, i, new ShareCustomRepo$initCustomSettingDraft$5(this));
          }
          return;
       }
    }
    public final boolean g(){
       Object[] objArray = null;
       ShareCustomRepo obj = PatchProxy.apply(objArray, this, ShareCustomRepo.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       if (obj != null) {
          objArray = obj.Q0();
       }
       boolean b = (objArray != null)? true: false;
       return b;
    }
    public final void h(UploadRequest$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCustomRepo.class, "30")) {
          return;
       }
       a.p(p0, "builder");
       Boolean tRUE = Boolean.TRUE;
       CustomType emojis = CustomType.Emojis;
       String str = (a.g(tRUE, this.a.get(emojis)))? "1": "0";
       p0.a.mMagicFaceSwitch = str;
       p0.a.mDisableNearbyShow = a.g(tRUE, this.a.get(CustomType.ShieldLocal));
       p0.a.mPhotoDownloadDeny = a.g(tRUE, this.a.get(CustomType.DownloadDeny));
       p0.a.mDisallowRecreation = a.g(tRUE, this.a.get(CustomType.Recreation));
       List list = this.j.n();
       boolean b = false;
       int i = 1;
       int i1 = (list == null || list.isEmpty())? 1: 0;
       i1 = i1 ^ i;
       p0.u(this.g);
       if ((this.g.isEmpty() ^ i) || (i1 && a.g(tRUE, this.a.get(emojis)))) {
          b = true;
       }
       p0.a.mMagicEmojiTag = b;
       emojis = CustomType.SameFrame;
       if (this.a.get(emojis) != null) {
          ShareCustomRepo tk = this.k;
          a.m(tk);
          ShareCustomRepo tk1 = this.k;
          SameFrameShareConfig sameFrameSha = new SameFrameShareConfig(tk.mOriginSameFrameUserName, this.k.mOriginSameFramePhotoId, a.g(tRUE, this.a.get(emojis)), tk1.mHasLrc, tk1.mAvailableDepth);
          p0.mSameFrameShareConfig = i1;
       }
       return;
    }
    public final void i(b p0,boolean p1,l p2){
       if (PatchProxy.isSupport(ShareCustomRepo.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, ShareCustomRepo.class, "16")) {
          return;
       }
       p0.c0();
       GeneratedMessageLite$Builder uBuilder = p0.k();
       a.o(uBuilder, "ensureFirstBuilder\(\)");
       GeneratedMessageLite$Builder uBuilder1 = uBuilder.getCustomSetting().toBuilder();
       p2.invoke(uBuilder1);
       uBuilder.e(uBuilder1);
       p0.g(p1);
       return;
    }
    public final void j(CustomType p0,boolean p1,boolean p2){
       Object[] this;
       ShareCustomRepo ti;
       int i;
       CustomType kuaiyingPlc;
       Object[] objArray;
       Object[] objArray2;
       ShareCustomRepo shareCustomR = ShareCustomRepo.class;
       if (PatchProxy.isSupport(shareCustomR) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, ShareCustomRepo.class, "15")) {
          return;
       }
       a.p(p0, "type");
       String str = "updateSwitch type ";
       this = new Object[0];
       a.b().w("ShareCustomRepo", str+p0+" switch "+p1, this);
       String str1 = 1;
       b this1 = null;
       switch (h.a[p0.ordinal()]){
           case 1:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "23")) {
                this.a.put(CustomType.HdExport, Boolean.valueOf(p1));
                a.Y0(p1);
             }
             break;
           case 2:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), this, shareCustomR, "17")) {
                this.a.put(CustomType.Emojis, Boolean.valueOf(p1));
                if (this.g()) {
                   ti = this.i;
                   if (ti != null) {
                      this1 = ti.Q0();
                   }
                   a.m(this1);
                   this.i(this1, p2, new ShareCustomRepo$updateMagicSwitch$1(p1));
                }
                this.j.p1(p1);
             }
             break;
           case 3:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), this, shareCustomR, "18")) {
                this.a.put(CustomType.SameFrame, Boolean.valueOf(p1));
                if (this.g()) {
                   ti = this.i;
                   if (ti != null) {
                      this1 = ti.Q0();
                   }
                   a.m(this1);
                   this.i(this1, p2, new ShareCustomRepo$updateSameFrameSwitch$1(p1));
                }
                this.j.q0(p1);
             }
             break;
           case 4:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), this, shareCustomR, "19")) {
                this.a.put(CustomType.DownloadDeny, Boolean.valueOf(p1));
                if (a.t().d("disableDownloadUnder15", str1)) {
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putInt("share_deny_download_under15", p1);
                   g.a(uEditor);
                }
                if (this.g()) {
                   ti = this.i;
                   if (ti != null) {
                      this1 = ti.Q0();
                   }
                   a.m(this1);
                   this.i(this1, p2, new ShareCustomRepo$updateDownloadDenySwitch$1(p1));
                }
             }
             break;
           case 5:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), this, shareCustomR, "22")) {
                this.a.put(CustomType.ShieldLocal, Boolean.valueOf(p1));
                if (this.g()) {
                   ti = this.i;
                   if (ti != null) {
                      this1 = ti.Q0();
                   }
                   a.m(this1);
                   this.i(this1, p2, new ShareCustomRepo$updateShieldLocalSwitch$1(p1));
                }
             }
             break;
           case 6:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "24")) {
                this.a.put(CustomType.SaveAlbum, Boolean.valueOf(p1));
                g.a(b.c(a.w, 0).edit().putBoolean("key_save_album", p1));
             }
             break;
           case 7:
             i = p1 ^ 0x01;
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), Boolean.valueOf(p2), this, shareCustomR, "21")) {
                this.a.put(CustomType.Recreation, Boolean.valueOf(i));
                if (this.g()) {
                   ShareCustomRepo ti1 = this.i;
                   if (ti1 != null) {
                      this1 = ti1.Q0();
                   }
                   a.m(this1);
                   this.i(this1, p2, new ShareCustomRepo$updateRecreationSwitch$1(i));
                }
                this.j.g(i);
             }
             break;
           case 8:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "20")) {
                this.a.put(CustomType.DownloadDeny, Boolean.valueOf(p1));
                QCurrentUser.ME.startEdit().setPrivacyOption("add_watermark_saving_self_photo", p1);
                QCurrentUser.ME.commitChanges();
             }
             break;
           case 9:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "25")) {
                kuaiyingPlc = CustomType.KuaiyingPlc;
                objArray = new Object[0];
                a.b().w("ShareCustomRepo", "updateKuaiyingPlcSwitch "+this.a.get(kuaiyingPlc), objArray);
                this.a.put(kuaiyingPlc, Boolean.valueOf(p1));
                p0.g1 = p1 ^ str1;
             }
             break;
           case 10:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "26")) {
                kuaiyingPlc = CustomType.KuaishanTemplatePlc;
                objArray = new Object[0];
                a.b().w("ShareCustomRepo", "updateTemplatePlcSwitch "+this.a.get(kuaiyingPlc), objArray);
                this.a.put(kuaiyingPlc, Boolean.valueOf(p1));
                p0.o1 = p1 ^ str1;
             }
             break;
           case 11:
             if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, shareCustomR, "27")) {
                CustomType visibility24 = CustomType.Visibility24Hours;
                Object[] objArray1 = new Object[0];
                a.b().w("ShareCustomRepo", "updateVisibility24Hours: "+this.a.get(visibility24), objArray1);
                this.a.put(visibility24, Boolean.valueOf(p1));
                if (!p1) {
                   str1 = this.h;
                }
                this.j.Z1(str1);
                if (!PatchProxy.isSupport(shareCustomR) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(str1), this, shareCustomR, "28")) {
                   if (!i.h()) {
                      objArray2 = new Object[0];
                      a.b().t("ShareCustomRepo", "syncAllPublishDraftIfNeed postSession is not available", objArray2);
                   }else {
                      i oi = i.m();
                      String str2 = "PostSession.current\(\)";
                      a.o(oi, str2);
                      if (oi.y().isEmpty()) {
                         objArray2 = new Object[0];
                         a.b().t("ShareCustomRepo", "syncAllPublishDraftIfNeed empty Draft", objArray2);
                      }else {
                         ti = this.i;
                         if (ti == null || (ti.a1() != Workspace$Type.ATLAS && (this.i.a1() != Workspace$Type.LONG_PICTURE && this.i.a1() != Workspace$Type.PHOTO_MOVIE))) {
                            objArray2 = new Object[0];
                            a.b().w("ShareCustomRepo", "syncAllPublishDraftIfNeed not switch tab draft", objArray2);
                         }else {
                            oi = i.m();
                            a.o(oi, str2);
                            List list = oi.y();
                            a.o(list, "PostSession.current\(\).drafts");
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               c uoc = iterator.next();
                               a.o(uoc, "workspaceDraft");
                               VideoContext videoContext = uoc.d1();
                               a.o(videoContext, "workspaceDraft.videoContext");
                               if (videoContext.F().b != null) {
                                  videoContext = uoc.d1();
                                  a.o(videoContext, "workspaceDraft.videoContext");
                                  if (videoContext.F().b.E0 == str1) {
                                  }
                               }
                               uoc.d1().Z1(str1);
                            }
                         }
                      }
                   }
                }
             }
             break;
           default:
             Object[] objArray3 = new Object[0];
             a.b().w("ShareCustomRepo", str+p0+" do nothing", objArray3);
       }
    label_0404 :
       return;
    }
}
