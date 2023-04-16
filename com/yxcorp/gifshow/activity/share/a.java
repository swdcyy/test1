package com.yxcorp.gifshow.activity.share.a;
import w26.a;
import java.lang.Object;
import android.app.Activity;
import y26.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qw8.o;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace$Type;
import qk7.b;
import s16.c;
import com.kuaishou.edit.draft.Workspace$Source;
import k2b.u1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import t45.d;
import brd.z;
import qw8.n;
import erd.o;
import qw8.c;
import qw8.f;
import erd.a;
import qw8.i;
import erd.g;
import r26.e;
import tkd.b;
import tkd.d;
import r16.f;
import q46.r;
import android.content.Intent;
import java.lang.Boolean;
import qw8.g;
import qw8.h;
import qw8.d;
import qw8.b;
import w26.c;
import w26.b;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import ax8.f;
import ax8.f$c;
import g46.a;
import kw8.m;
import r26.a;
import elb.d0;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Integer;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import f6c.a;
import android.view.View;
import android.widget.Button;
import java.util.List;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import com.yxcorp.gifshow.encode.i;
import android.content.Context;
import com.yxcorp.gifshow.location.LocationActivity;
import ow8.c;
import lnc.j8;
import java.util.Objects;
import lnc.p3;
import q87.c;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.a;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import lnc.f8;
import com.yxcorp.gifshow.util.AdvEditUtil;
import lnc.i8;
import lnc.c8;
import lnc.d8;
import lnc.y7;
import lnc.a8;
import lnc.b8;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Number;
import lq.i;
import f66.i;
import jq.a;
import qw8.e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import dnc.k1;
import wba.p0;
import vw8.a;
import k2b.e0;
import com.kwai.framework.network.degrade.e;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import ou5.b;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.model.mix.Location;
import lnc.r5;
import com.yxcorp.gifshow.encode.EncodeRequest;
import bx8.j;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.visible.ShareVisibleRepo;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.lang.System;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import com.kuaishou.android.post.StrArg;
import bba.b;
import wba.f0;
import com.kwai.kcube.TabIdentifier;
import wba.s;
import elb.x;
import czb.b;
import f6c.c;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Map;
import android.util.Pair;
import haa.f;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.android.post.topic.TagSourceUtils;
import pq.a;
import com.kuaishou.android.model.music.Music;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import com.google.common.collect.Lists;
import fg6.a;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList;
import com.google.gson.Gson;
import java.util.Iterator;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList$TaskInfo;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList$Friend;
import com.gifshow.twitter.widget.Extractor;
import com.gifshow.twitter.widget.Extractor$Entity;
import gx8.a;
import com.yxcorp.utility.m;
import oq.e;
import java.util.concurrent.Future;
import t45.c;
import com.kuaishou.edit.draft.Location;
import java.lang.Long;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.yxcorp.gifshow.custom.ShareCustomRepo;
import com.yxcorp.gifshow.entity.QPhoto;
import oe6.b;
import ow8.d;
import com.kuaishou.edit.draft.Merchandise;
import um6.i;
import um6.a;
import um6.j;
import qr4.i;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.kuaishou.android.post.MiniAppBusinessArg;
import com.kwai.feature.post.api.feature.mix.model.MiniAppBusinessInfoModel;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import lnc.d7;
import com.kuaishou.android.model.mix.HotspotParams;
import oa0.a;
import qr4.m$k0;
import java.util.HashMap;
import km6.f;
import qaa.a;
import haa.a;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.i;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import lnc.k9;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import dnc.x0;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import com.kuaishou.ax2c.PreloadParam;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.helper.e;
import d36.f;
import nw8.g;
import crd.a;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import xw8.a;
import pt9.b;
import okhttp3.MultipartBody$Part;
import cx8.h;
import cx8.g;
import nw8.h;
import nw8.i;
import nw8.j;
import crd.b;
import ekd.p0;
import oe6.a;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import y26.b$a;
import kw8.b;
import cx8.a;
import cx8.e;
import com.yxcorp.gifshow.log.h;
import ekd.j0;
import ow8.a;
import lnc.la;
import java.util.regex.Pattern;
import qkd.b;
import java.util.regex.Matcher;
import qw8.l;
import qw8.m;
import lq.a;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import y26.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.net.Uri;
import ekd.w0;
import android.os.Parcelable;
import org.parceler.b;
import android.os.Bundle;
import qvb.s;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.reflect.Type;
import sw8.a;
import o36.g;
import k36.c;
import sw8.a$c;
import sw8.a$a;
import k36.f;
import r16.a;
import km8.b;
import android.content.SharedPreferences;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nw8.a;
import nw8.b;
import nw8.c;
import nw8.d;

public class a implements a	// class@00136c
{

    public void a(){
       super();
    }
    public t Cx(Activity p0,b p1){
       z a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "11");
       if (obj != patchProxyRe) {
       }else {
          boolean b = true;
          if (p1.q.size() != b) {
             b = false;
          }
          DraftFileManager uDraftFileMa = DraftFileManager.E();
          Workspace$Type sINGLE_PICTU = (b)? Workspace$Type.SINGLE_PICTURE: Workspace$Type.ATLAS;
          c uoc = uDraftFileMa.f(sINGLE_PICTU, p1.get(b.b), u1.f(), p1.j);
          a = d.a;
          t ot = DraftFileManager.E().m0(uoc).observeOn(a).flatMap(new n(uoc, p1)).flatMap(c.b).observeOn(a);
          obj = ot.doOnComplete(new f(p1, b, uoc, p0)).doOnError(new i(uoc));
       }
       return obj;
    }
    public void Cy(Activity p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       r.b(p0, d.a(0x6758ee6d)).a(p1);
       return;
    }
    public Intent DL(b p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.rs(p0, false, p1, false);
    }
    public t Fu(b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = o.class;
       t ot = PatchProxy.applyOneRefs(p0, null, obj, "5");
       if (ot != patchProxyRe) {
       }else {
          c obj1 = PatchProxy.applyOneRefs(p0, null, obj, "7");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = DraftFileManager.E().f(Workspace$Type.VIDEO, p0.get(b.b), u1.f(), p0.j);
             Object obj2 = PatchProxy.applyTwoRefs(p0, obj1, null, obj, "8");
             obj1 = (obj2 != patchProxyRe)? obj2: DraftFileManager.E().m0(obj1).observeOn(d.a).doOnNext(new g(p0)).doOnError(new h(obj1));
          }
          ot = obj1.flatMap(d.b).flatMap(b.b);
       }
       return ot;
    }
    public void GK(){
       b.a(this);
    }
    public void GR(ProducerHelpConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       f.f.c(p0);
       return;
    }
    public a Jn(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
    public void KU(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "30")) {
          return;
       }
       d0.b(p0);
       return;
    }
    public void MQ(Activity p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       r.b(p0, d.a(0x6758ee6d)).c(p1);
       return;
    }
    public void Po(RxFragmentActivity p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "29")) {
          return;
       }
       if (p0 != null) {
          PhotoVisibility fRIENDS = (p1 == 2)? PhotoVisibility.FRIENDS: PhotoVisibility.PUBLIC;
          a.a.g(p0, fRIENDS, false);
       }
       return;
    }
    public void Qb(View p0,Button p1){
       b.b(this, p0, p1);
    }
    public t RT(List p0,KSAssetExportInfo p1,boolean p2,boolean p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return i.f(p0, p1, p2, p3, p4);
    }
    public void TS(Context p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       this.m70(p0, p1);
       return;
    }
    public Intent UQ(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Intent(p0, LocationActivity.class);
    }
    public List VQ(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.k(p0);
    }
    public Intent Z00(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.DL(p0, true);
    }
    public t hD(String p0,int p1){
       Ref$IntRef obj;
       String a;
       Object[] objArray1;
       t ot;
       Object[] objArray2;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(j8.b);
       a = j8.a;
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w(a, "directlyPublish： begin ", objArray);
       obj = new Ref$IntRef();
       obj.element = -1;
       b uob = d.a(-273232199);
       a.o(uob, "PluginManager.get\(PostWo…ternalPlugin::class.java\)");
       a uoa1 = uob.a20();
       if (TextUtils.isEmpty(p0)) {
          objArray1 = new Object[i];
          p3.D().A(a, "directlyPublish: empty assetPath", objArray1);
          ot = t.error(new IllegalArgumentException("directlyPublish: empty assetPath"));
          a.o(ot, "Observable.error\(Illegal…umentException\(errorMsg\)\)");
       }else {
          a.m(p0);
          boolean b = j8.d(p0);
          boolean b1 = j8.f(p0);
          if (!b && !b1) {
             p0 = "directlyPublish: illegal format, path: "+p0;
             objArray1 = new Object[i];
             p3.D().A(a, p0, objArray1);
             ot = t.error(new IllegalArgumentException(p0));
             a.o(ot, "Observable.error\(Illegal…umentException\(errorMsg\)\)");
          }else if(b){
             objArray2 = new Object[i];
             p3.D().w(a, "preparePictureDraft", objArray2);
             if (!j8.d(p0)) {
                p0 = "prepareSinglePictureDraft: illegal picPath: "+p0;
                objArray1 = new Object[i];
                p3.D().A(a, p0, objArray1);
                ot = t.error(new IllegalArgumentException(p0));
                a.o(ot, "Observable.error\(Illegal…umentException\(errorMsg\)\)");
             }else {
                ot = t.just(BitmapUtil.E(p0)).subscribeOn(d.c).observeOn(d.a).flatMap(new f8(p0));
                a.o(ot, "Observable.just\(BitmapUt…ureDraft\(picPath\)\n      }");
             }
          }else {
             objArray2 = new Object[i];
             p3.D().w(a, "prepareVideoDraft", objArray2);
             if (!j8.f(p0)) {
                p0 = "prepareVideoDraft: illegal videoPath: "+p0;
                objArray1 = new Object[i];
                p3.D().A(a, p0, objArray1);
                ot = t.error(new IllegalArgumentException(p0));
                a.o(ot, "Observable.error\(Illegal…umentException\(errorMsg\)\)");
             }else {
                ot = t.just(Integer.valueOf(AdvEditUtil.i(p0))).subscribeOn(d.c).observeOn(d.a).flatMap(new i8(p0));
                a.o(ot, "Observable.just\(AdvEditU…\(false\)\n        }\n      }");
             }
          }
          ot = ot.map(new c8(p1)).flatMap(d8.b);
          a.o(ot, "draftObservable\n      .m…aft, false, true\)\n      }");
       }
       ot = ot.observeOn(d.c).flatMap(new y7(p1)).observeOn(d.a).flatMap(new a8(obj, uoa1)).doOnDispose(new b8(uoa1, obj));
       a.o(ot, "prepareDraft\(assetPath, …   null\n        \)\n      }");
       return ot;
    }
    public boolean isAvailable(){
       return true;
    }
    public int lS(GifshowActivity p0,b p1,boolean p2,Object p3,Integer p4){
       Object[] objArray;
       Object[] obj;
       String str2;
       String str3;
       String str5;
       UploadRequest$a obj4;
       o oo1;
       object oobject3;
       Object[] objArray2;
       ShareVisibleRepo shareVisible;
       o oo3;
       EncodeRequest uEncodeReque1;
       String str6;
       int i7;
       File obj5;
       int b1;
       Size obj6;
       int id;
       long l;
       EncodeRequest uEncodeReque2;
       b n;
       MiniAppBusinessInfoModel mBusinessLin;
       String str7;
       boolean i8;
       Pair pair1;
       Publish publish;
       Object[] mOutputPath1;
       String str8;
       long l1;
       String obj7;
       Iterator iterator;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i = 4;
       int i1 = 5;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i1];
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i3] = Boolean.valueOf(p2);
          objArray[i2] = p3;
          objArray[i] = p4;
          obj = PatchProxy.apply(objArray, this, uoa, "22");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }else {
          int i10 = this;
       }
       int i6 = -1;
       if (!b && !i.h()) {
          obj = new Object[i5];
          a.b().w("PublishPluginImpl", "PostSession is not available", obj);
          return i6;
       }else {
          object oobject2 = p3;
          o oo = o.class;
          b obj1 = null;
          if (PatchProxy.isSupport(oo)) {
             obj = new Object[i1];
             obj[i5] = oobject;
             obj[i4] = oobject1;
             obj[i3] = oobject2;
             obj[i2] = Boolean.valueOf(p2);
             obj[i] = p4;
             b obj2 = PatchProxy.apply(obj, obj1, oo, "12");
             if (obj2 != patchProxyRe) {
                i6 = obj2.intValue();
             }else {
             label_007e :
                Object[] objArray1 = new Object[i5];
                String str = "ShareDraftUtil";
                a.b().w(str, "directlyPublish 点击发布 编辑页直接发布 noUiPublish:"+b, objArray1);
                if (o.f()) {
                   p3 = str;
                   k1.r(e.b, 300);
                }else {
                   p3 = str;
                }
                obj2 = PatchProxy.applyOneRefs(oobject1, obj1, oo, "13");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = oobject1.y;
                   if (TextUtils.x(obj2)) {
                      str2 = u1.f();
                   }
                   b.a(0x6223c5ca).g(str2);
                }
                String obj3 = obj2;
                p0.e(oobject2, i4);
                b j = oobject1.j;
                String str1 = "";
                if (oobject != null && !b) {
                   str2 = (j != null)? j.i(): str1;
                   str3 = oobject2.K0();
                   Workspace$Source source = oobject2.T0();
                   String str4 = str2;
                   str5 = str1;
                   obj4 = obj1;
                   oo1 = oo;
                   oobject3 = oobject2;
                   if (!PatchProxy.applyVoidFourRefs(p0, str2, source, str3, 0, a.class, "46")) {
                      a.y(oobject, str4, source, obj4, str3);
                   }
                }else {
                   str5 = str1;
                   obj4 = obj1;
                   oo1 = oo;
                   oobject3 = oobject2;
                }
                if (b.a(-1538291188).e().mDelayUpload != null) {
                   i.a(R.style.arg_RES_7f110668, 0x7f104f9c);
                }else if(!QCurrentUser.me().isLogined()){
                   d.a(-1712118428).ne(a1.c(), "share", "share_finish", 36, a.a().a().getString(R.string.arg_RES_7f103082), null, null, null, null).h();
                }else if(j == null){
                   ExceptionHandler.handleCaughtException(new DraftEditException("VideoContext is not passed along with workspace "+oobject3.D0()));
                   j = oobject3.d1();
                   oobject = oobject3;
                }else {
                   oobject = oobject3;
                   if (!PatchProxy.applyVoidTwoRefs(j, oobject, obj4, oo1, "38")) {
                      j.k1(oobject.d1().v());
                   }
                }
                j.T1(c.o());
                Location location = p1.getArgs().getPublishLocation().get();
                if (location != null) {
                   objArray = new Object[i5];
                   str3 = p3;
                   a.b().w(str3, "directlyPublish set location to photo meta ", objArray);
                   j.D1(location);
                }else {
                   str3 = p3;
                }
                EncodeRequest uEncodeReque = r5.b().a(oobject1.u, EncodeRequest.class);
                if (uEncodeReque == null) {
                   obj = new Object[i5];
                   a.b().w(str3, "directlyPublish encodeRequest is null", obj);
                }else {
                   EncodeRequest mOutputPath = uEncodeReque.mOutputPath;
                   if (TextUtils.x(mOutputPath)) {
                      ExceptionHandler.handleCaughtException(new DraftEditException("Output path is empty. Encode request not null"));
                   }else {
                      j oj = new j(oobject, j);
                      oj.b(true);
                      KtvInfo ktvInfo = PatchProxy.applyTwoRefs(oobject1, j, obj4, oo1, "14");
                      if (ktvInfo != patchProxyRe) {
                      }else {
                         ktvInfo = KtvInfo.fromJson(oobject1.N);
                         if (ktvInfo != null && ktvInfo.isSinglePicSongMode()) {
                            j.I0((long)ktvInfo.getRealDuration());
                         }
                      }
                      obj1 = oobject1.Y;
                      if (PatchProxy.isSupport(oo1)) {
                         objArray2 = new Object[]{j,oobject,ktvInfo,p4,Boolean.valueOf(obj1)};
                         shareVisible = PatchProxy.apply(objArray2, obj4, oo1, "21");
                         if (shareVisible != patchProxyRe) {
                         }else {
                         label_025d :
                            shareVisible = new ShareVisibleRepo(oobject, j, ktvInfo);
                            if (obj1 != null) {
                               Object[] objArray6 = new Object[i5];
                               a.b().w(str3, "fillVisibilityExpirationParam fromEditPublishTestCase", objArray6);
                            }else if(p0.a(oobject.T0())){
                               if (p4 != null) {
                                  j.Z1(p4.intValue());
                               }else {
                                  j.Z1(1);
                               }
                            }else {
                               b1 = 1;
                               if (PostExperimentUtils.t0() == 2) {
                                  j.Z1(b1);
                               }else {
                                  j.Z1(i5);
                               }
                            }
                         }
                      }else {
                         goto label_025d ;
                      }
                      obj4 = UploadRequest.newBuilder();
                      obj4.U(QCurrentUser.me().getId());
                      o oo2 = oo1;
                      obj4.E(System.currentTimeMillis());
                      obj4.b(QCurrentUser.me().getName());
                      obj4.j(mOutputPath);
                      obj4.Y(oobject.v());
                      obj4.Z(uEncodeReque.mWorkspaceDirectory);
                      obj4.D(a1.c().getString(R.string.arg_RES_7f101c05));
                      obj4.i(oobject1.A);
                      obj4.r(ktvInfo);
                      obj4.W(oobject1.I);
                      obj4.J(i.g().getThirdPartyAppPackage().get());
                      obj4.K(i.g().getThirdPartyPubInfo().get());
                      obj4.O(true);
                      obj4.I(obj3);
                      obj4.m(oobject1.B);
                      obj4.a0(oj.d);
                      obj4.V(j);
                      obj4.X(shareVisible.c());
                      obj4.M(oobject1.Q);
                      obj4.x(a.a(f0.a(oobject.Q0())));
                      obj4.S(a.e());
                      obj4.C(a.d());
                      obj4.v(s.b(j, oobject));
                      b = (i.h() && i.m().B())? true: false;
                      obj4.G(b);
                      obj4.T(oobject1.Y);
                      obj4.k(c.n(j));
                      obj4.h(s.a.a(oobject));
                      obj4.q(true);
                      x.b(obj4);
                      b.c.a(obj4);
                      d.a(-1931765893).TG(obj4);
                      if (!PatchProxy.applyVoidThreeRefs(oobject, obj4, ktvInfo, null, o.class, "15")) {
                         Workspace$Type type = oobject.a1();
                         if (type != Workspace$Type.VIDEO && (type != Workspace$Type.KTV_MV && (type != Workspace$Type.LONG_VIDEO && (type != Workspace$Type.PHOTO_MOVIE && (type != Workspace$Type.KUAISHAN && (type != Workspace$Type.ALBUM_MOVIE && (type == Workspace$Type.AI_CUT || (type == Workspace$Type.KTV_SONG && (ktvInfo != null && ktvInfo.getKaraokeType() == 3))))))))) {
                            obj4.o(true);
                         }
                      label_03d6 :
                         b = (type == Workspace$Type.LONG_VIDEO)? true: false;
                         obj4.p(b);
                      }
                      if (PatchProxy.applyVoidThreeRefs(obj4, p1, oobject, null, o.class, "22")) {
                         oo3 = oo2;
                         uEncodeReque1 = mOutputPath;
                         str6 = str5;
                         i7 = 0;
                      }else {
                         obj3 = "conversionTaskList";
                         if (PatchProxy.applyVoidThreeRefs(obj4, p1, oobject, null, o.class, "24")) {
                            oo3 = oo2;
                            uEncodeReque2 = mOutputPath;
                            str6 = str5;
                         }else {
                            str2 = " ";
                            if (oobject.Q0() != null && oobject.Q0().v() != null) {
                               n = oobject.Q0();
                               str1 = "PUBLISH_CAPTION_PARAM";
                               Objects.requireNonNull(n);
                               c uoc = c.class;
                               obj7 = PatchProxy.applyOneRefs(str1, n, uoc, "51");
                               if (obj7 != patchProxyRe) {
                                  b = obj7.booleanValue();
                               }else {
                                  String str9 = "BaseDraft";
                                  str6 = "need register param key:PUBLISH_CAPTION_PARAM";
                                  if (!n.A(str1)) {
                                     PostUtils.D(str9, "isParamChanged", new RuntimeException(str6));
                                     b = false;
                                  }else {
                                     Object obj8 = PatchProxy.applyOneRefs(str1, n, uoc, "52");
                                     obj7 = ",result:";
                                     if (obj8 != patchProxyRe) {
                                        b = obj8.intValue();
                                     }else if(!n.A(str1)){
                                        PostUtils.D(str9, "getParamVersion", new RuntimeException(str6));
                                        b = 0;
                                     }else {
                                        b = n.j.get(str1).second.intValue();
                                        int i9 = b;
                                        Object[] objArray5 = new Object[0];
                                        f.D().w(str9, "getParamVersion key:"+str1+obj7+b, objArray5);
                                        b = i9;
                                     }
                                     b = (b > 0)? true: false;
                                     Object[] objArray4 = new Object[0];
                                     f.D().w(str9, "isParamChanged key:"+str1+obj7+b, objArray4);
                                  }
                               }
                               if (b) {
                                  str7 = oobject.Q0().v().getCaption();
                                  str1 = oobject.Q0().v().getCaptionSourceJson();
                                  uEncodeReque2 = mOutputPath;
                                  str6 = str5;
                               label_05e5 :
                                  if (i.h()) {
                                     str8 = i.m().z(obj3);
                                     if (!TextUtils.x(str8)) {
                                        ConversionTaskList uConversionT = a.a.h(str8, ConversionTaskList.class);
                                        oo3 = oo2;
                                        obj7 = PatchProxy.applyTwoRefs(str7, uConversionT, null, oo3, "28");
                                        if (obj7 != patchProxyRe) {
                                           str7 = obj7;
                                        }else {
                                           obj7 = str7;
                                           if (uConversionT != null) {
                                              mOutputPath1 = new Object[0];
                                              a.b().s(str3, "replaceCurrentMissionTag add new tag", mOutputPath1);
                                              ConversionTaskList mTaskInfoLis = uConversionT.mTaskInfoList;
                                              if (q.f(mTaskInfoLis)) {
                                                 Object[] objArray3 = new Object[0];
                                                 a.b().s(str3, "addNewMissionTag taskInfoList is empty", objArray3);
                                                 str7 = obj7;
                                              }else {
                                                 iterator = mTaskInfoLis.iterator();
                                                 while (iterator.hasNext()) {
                                                    ConversionTaskList$TaskInfo taskInfo = iterator.next();
                                                    ConversionTaskList$TaskInfo mTopics = taskInfo.mTopics;
                                                    if (!q.f(mTopics)) {
                                                       Iterator iterator1 = mTopics.iterator();
                                                       while (iterator1.hasNext()) {
                                                          obj7 = obj7+"#"+iterator1.next()+str2;
                                                          iterator = iterator;
                                                          iterator1 = iterator1;
                                                       }
                                                    }
                                                    Iterator iterator2 = iterator;
                                                    ConversionTaskList$TaskInfo mFriendList = taskInfo.mFriendList;
                                                    if (!q.f(mFriendList)) {
                                                       iterator = mFriendList.iterator();
                                                       while (iterator.hasNext()) {
                                                          ConversionTaskList$Friend uFriend = iterator.next();
                                                          mOutputPath1 = new Object[]{uFriend.mName,uFriend.mId};
                                                          obj7 = obj7+String.format("@%s\(O%s\)", mOutputPath1);
                                                       }
                                                    }
                                                    mOutputPath1 = new Object[0];
                                                    a.b().s(str3, "final text: "+obj7, mOutputPath1);
                                                    iterator = iterator2;
                                                 }
                                              }
                                           }
                                           str7 = obj7;
                                        }
                                     }else {
                                     label_06e4 :
                                        oo3 = oo2;
                                     }
                                  }else {
                                     goto label_06e4 ;
                                  }
                                  obj4.c(str7);
                                  if (!TextUtils.x(str1)) {
                                     obj4.N(str1);
                                  }
                                  ArrayList uArrayList = new ArrayList();
                                  uArrayList.clear();
                                  iterator = new Extractor().a(str7).iterator();
                                  while (iterator.hasNext()) {
                                     uArrayList.add(iterator.next().d());
                                  }
                                  c.k(new a(e.b(), new ArrayList(uArrayList)));
                                  n = oobject1.j;
                                  if (n != null) {
                                     a.z(n, uArrayList);
                                  }
                               }
                            }
                         label_04f8 :
                            a uoa1 = TagSourceUtils.b.h();
                            ArrayList uArrayList1 = new ArrayList();
                            if (!TextUtils.x(oobject1.k)) {
                               uArrayList1.add(oobject1.k);
                            }
                            Music music1 = o.d(oobject1, oobject);
                            if (music1 != null && !q.f(music1.mMappingTextTags)) {
                               ArrayList uArrayList2 = Lists.c(music1.mMappingTextTags);
                               uoa1.f(uArrayList2, "MUSIC", null, false);
                               uArrayList2.removeAll(uArrayList1);
                               uArrayList1.addAll(uArrayList2);
                            }
                            if (oobject1.j != null && (q.f(uArrayList1) && (oobject1.j.B() != null && !TextUtils.x(oobject1.j.B().mName)))) {
                               obj7 = "66铃声";
                               if ((oobject1.j.B().mName).startsWith(obj7)) {
                                  uArrayList1.add(obj7);
                               }
                            }
                         label_0564 :
                            str6 = str5;
                            str1 = str6+c.l(oobject1.j, uArrayList1, oobject);
                            str8 = p1.getArgs().getShareInitCaption().get();
                            uEncodeReque2 = mOutputPath;
                            mOutputPath1 = new Object[0];
                            a.b().w(str3, "fill caption tags: "+str1+" paramCaption="+str8, mOutputPath1);
                            if (!TextUtils.x(str8)) {
                               if (!TextUtils.x(str1)) {
                                  str1 = str1+str2;
                               }
                               str1 = str1+str8;
                            }
                            str1 = uoa1.i();
                            str7 = c.c(str1);
                            goto label_05e5 ;
                         }
                         if (PatchProxy.applyVoidThreeRefs(obj4, p1, oobject, null, o.class, "25")) {
                            i7 = 0;
                         }else if(oobject.Q0() != null){
                            publish = oobject.Q0().v();
                            if (publish != null) {
                               location = publish.getLocation();
                               objArray2 = new Object[0];
                               a.b().w(str3, "地理位置: "+location.getTitle()+", id: "+location.getIdentifier(), objArray2);
                               if (!TextUtils.x(location.getIdentifier())) {
                                  l1 = Long.valueOf(location.getIdentifier()).longValue();
                               label_07a0 :
                                  Location location1 = p1.getArgs().getPublishLocation().get();
                                  mOutputPath1 = new Object[0];
                                  a.b().w(str3, "fillLocationToUploadRequest\(\) location="+location1+" poi="+l1, mOutputPath1);
                                  i7 = 0;
                                  if (l1 - i7 <= 0 && location1 != null) {
                                     l1 = location1.mId;
                                  }
                                  obj4.t(l1);
                               }
                            }
                         }
                         l1 = 0;
                         goto label_07a0 ;
                         if (!PatchProxy.applyVoidThreeRefs(obj4, p1, oobject, null, o.class, "29")) {
                            SameFrameShareConfig sameFrameSha = o.e(oobject, oobject1);
                            new ShareCustomRepo(oobject, oobject1.j, sameFrameSha, null).h(obj4);
                            Music music = o.d(oobject1, oobject);
                            i8 = c.g(oobject1.j, music);
                            if (music != null && i8) {
                               mOutputPath1 = new Object[0];
                               a.b().w(str3, "music: "+music.mName, mOutputPath1);
                               obj4.y(music);
                            }
                            str8 = (i8)? "1": "0";
                            obj4.z(str8);
                            oobject1.j.u1(i8);
                            if (!b.i()) {
                               b = d.a(oobject1.j, music, oobject, sameFrameSha, (TextUtils.x(oobject1.N) ^ 1));
                               objArray2 = new Object[0];
                               a.b().w(str3, "setShareSoundTrack: "+b, objArray2);
                               obj4.L(b);
                            }
                         }
                         if (!PatchProxy.applyVoidThreeRefs(obj4, p1, oobject, null, o.class, "26")) {
                            n = oobject.Q0();
                            Pair pair = PatchProxy.applyOneRefs(n, null, oo3, "27");
                            if (pair != patchProxyRe) {
                            }else if(n == null){
                               pair1 = new Pair(str6, str6);
                            }else {
                               publish = n.v();
                               if (publish == null) {
                                  pair1 = new Pair(str6, str6);
                               }else {
                                  Merchandise merchandise = publish.getMerchandise();
                                  objArray2 = new Object[0];
                                  a.b().w(str3, "getMerchant\(\) 小店信息: "+merchandise.getName(), objArray2);
                                  str1 = merchandise.getInfo();
                                  pair = new Pair(str1, merchandise.getName());
                               }
                            }
                            pair = pair1;
                            if (!TextUtils.x(pair.first)) {
                               obj4.a.mMerchantInfo = pair.first;
                            }
                            if (i.h()) {
                               str7 = i.m().z(obj3);
                               if (!TextUtils.x(str7)) {
                                  oobject1.j.A0(str7);
                               }
                            }
                         }
                      label_0902 :
                         VideoContext videoContext = oobject.d1();
                         uEncodeReque1 = uEncodeReque2;
                         if (!PatchProxy.applyVoidFourRefs(oobject, videoContext, p1, obj4, null, o.class, "23")) {
                            n = oobject1.N;
                            if (n != null) {
                               KtvInfo ktvInfo1 = KtvInfo.fromJson(n);
                               if (ktvInfo1.isSinglePicSongMode()) {
                                  videoContext.I0((long)ktvInfo1.getRealDuration());
                                  d.a(0x6ea9440a).Ps(videoContext, ktvInfo1);
                                  b.h(videoContext.F(), ktvInfo1.toSimpleJson());
                               }
                            }
                            if (i.h()) {
                               if (i.g().getMiniAppBusinessInfo().isValid()) {
                                  mBusinessLin = i.g().getMiniAppBusinessInfo().get().mBusinessLinkModel;
                                  i.m().b0(false);
                               }else {
                                  mBusinessLin = null;
                               }
                               if (mBusinessLin != null) {
                                  videoContext.R1(a.a.q(mBusinessLin));
                               }else if(videoContext.P() == null || !TextUtils.n("30", videoContext.P().mEntryId)){
                                  str7 = d7.a.f();
                                  if (TextUtils.x(str7)) {
                                     objArray = new Object[0];
                                     f.D().w(str3, "clear serviceLinkInfo", objArray);
                                     videoContext.R1(null);
                                  }else {
                                     videoContext.R1(str7);
                                  }
                               }
                               HotspotParams hotspotParam = d7.a.c();
                               if (d7.k(hotspotParam)) {
                                  videoContext.a1(hotspotParam.mId, hotspotParam.mConnectType);
                               }else {
                                  videoContext.c();
                               }
                            }
                            str7 = i.g().getThirdPartyAppPackage().get();
                            objArray2 = new Object[0];
                            a.b().w(str3, "fillVideoContext\(\) appPackage="+str7, objArray2);
                            if (!TextUtils.x(str7)) {
                               videoContext.y1(str7);
                            }
                            videoContext.F().b.g0 = a.I();
                            List list = c.d(obj4.a().getCaption(), new HashMap());
                            if (!q.f(list)) {
                               String[] stringArray = new String[list.size()];
                               for (i8 = 0; i8 < list.size(); i8 = i8 + 1) {
                                  stringArray[i8] = list.get(i8).getId();
                               }
                               videoContext.F().b.T0 = stringArray;
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidTwoRefs(j, oobject, null, oo3, "20")) {
                         if (p0.a(oobject.T0())) {
                            b = 2;
                            j.Y1(b);
                            j.w1(b);
                            j.g(true);
                         }else {
                            b = 2;
                         }
                         if (oobject.T0() == Workspace$Source.MUSIC_RECREATION) {
                            j.N1(b);
                         }
                         if (oobject.T0() == Workspace$Source.PICTURE_RECREATION) {
                            j.N1(1);
                         }
                         if (oobject.T0() == Workspace$Source.MERCHANT_COMMENT_RECREATION) {
                            objArray = new Object[0];
                            f.D().w(str3, "fillRecreationParam MERCHANT_COMMENT_RECREATION", objArray);
                            j.N1(3);
                         }
                      }
                      f.a(j);
                      if (!PatchProxy.applyVoidThreeRefs(p1, oobject, obj4, null, o.class, "16")) {
                         if (oobject1.C != null && !TextUtils.x(oobject1.f)) {
                            obj4.f(new File(oobject1.f));
                         }
                         if (oobject1.C != null) {
                            obj5 = DraftFileManager.E().G(a.f(oobject));
                            if (obj5 != null) {
                               obj4.B(obj5);
                            }
                         }
                         Cover uCover = a.f(oobject).v();
                         obj6 = (uCover != null && !TextUtils.x(uCover.getVideoCoverParam().getVideoCoverRatio()))? new Size(uCover.getVideoCoverParam().getCropOptions().getWidth(), uCover.getVideoCoverParam().getCropOptions().getHeight()): null;
                         obj4.g(obj6);
                      }
                      if (!PatchProxy.applyVoidTwoRefs(oobject, obj4, null, oo3, "17")) {
                         if (o.f()) {
                            str1 = a1.p(R.string.arg_RES_7f104fae);
                            l = 1000;
                         }else {
                            str1 = str6;
                            l = i7;
                         }
                         if (!TextUtils.x(str1)) {
                            obj4.n(true);
                            obj4.F(str1);
                            obj4.a.mPublishToastDelay = l;
                         }
                      }
                      RxBus.f.b(new i(j.F()));
                      a.B1(System.currentTimeMillis());
                      if (oobject1.v >= null) {
                         obj5 = PatchProxy.applyFourRefs(p1, oobject, obj4, uEncodeReque1, null, o.class, "19");
                         if (obj5 != patchProxyRe) {
                            b = obj5.intValue();
                         }else {
                            b = -273232199;
                            PostWorkInfo postWorkInfo = d.a(b).a20().L0(oobject1.v);
                            if (postWorkInfo != null) {
                               if (postWorkInfo.getEncodeInfo() != null) {
                                  b1 = false;
                                  postWorkInfo.getEncodeInfo().setIsHidden(b1);
                               }else {
                                  b1 = false;
                               }
                               postWorkInfo.setIsPublished(true);
                               b b2 = oobject1.B;
                               obj6 = (q.f(b2))? null: b2.get(b1);
                               postWorkInfo.setPhotoEditInfo(k9.b(oobject, obj6, d7.a.c()));
                            }
                            if (postWorkInfo != null && (postWorkInfo.getStatus() == PostStatus.ENCODE_PENDING || postWorkInfo.getStatus() == PostStatus.ENCODING)) {
                               d.a(b).a20().l3(postWorkInfo.getId(), true);
                               if (d.a(b).a20().X3(obj4.a(), postWorkInfo.getId())) {
                                  objArray = new Object[0];
                                  a.b().w(str3, "publish success index 0", objArray);
                                  b = postWorkInfo.getId();
                               }
                            }else if(new File(uEncodeReque1).exists()){
                               if (postWorkInfo != null && b.a(-2001546430).n(postWorkInfo.getEncodeInfo(), postWorkInfo.getUploadInfo())) {
                                  d.a(b).a20().l3(postWorkInfo.getId(), true);
                                  if (d.a(b).a20().X3(obj4.a(), postWorkInfo.getId())) {
                                     objArray = new Object[0];
                                     a.b().w(str3, "publish success index 1", objArray);
                                     b = postWorkInfo.getId();
                                  }
                               }else {
                                  obj4.o(false);
                                  id = (postWorkInfo != null)? postWorkInfo.getId(): -1;
                                  if (d.a(b).a20().X3(obj4.a(), id)) {
                                     objArray = new Object[0];
                                     a.b().w(str3, "publish success index 2", objArray);
                                     i6 = id;
                                  }
                               }
                            }
                         }
                         i6 = b;
                      }
                   }
                }
             }
          }else {
             goto label_007e ;
          }
       label_0c9a :
          return i6;
       }
    }
    public final void m70(Context p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       if (PostExperimentUtils.H0()) {
          PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.share_v2).addLayoutId(R.layout.arg_RES_7f0d14f5).setUseMutableContext(true).build());
          if (!TextUtils.x(p1.l)) {
             PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.share_edit_immutable_layout).setUseMutableContext(true).build());
          }else {
             PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.share_edit_input_layout).setUseMutableContext(true).build());
          }
          if (p1.L != null) {
             PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.share_photos_preview_container_v2).setUseMutableContext(true).build());
          }else {
             PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.share_preview_container_v2).setUseMutableContext(true).build());
          }
       }
       return;
    }
    public boolean oJ(boolean p0){
       d7 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = d7.a;
       if (!obj.a()) {
          return false;
       }else if(p0 && obj.i()){
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103ade));
          return true;
       }else {
          return false;
       }
    }
    public void oO(YodaBaseWebView p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       r.b(e.f(p0), d.a(0x6758ee6d)).a(p1);
       return;
    }
    public void oi(GifshowActivity p0,QPhoto p1,f p2){
       Object[] objArray;
       VideoContext obj = p0;
       f uof = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "17")) {
          return;
       }
       g b = g.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, b, g.class, "3")) {
          a.p(obj, "activity");
          a.p(p1, "qPhoto");
          int i = 0;
          String str = "ShareReeditPromoteVideoUtils";
          if (a.g(p1.getPhotoId(), g.a) ^ 0x01) {
             objArray = new Object[i];
             a.b().w(str, "not same id, need not upload", objArray);
          }else if(!uof || TextUtils.isEmpty(uof.a.mSubtype)){
             objArray = new Object[i];
             a.b().w(str, "not select, not need upload", objArray);
          }else {
             Object[] objArray1 = new Object[i];
             a.b().w(str, "upload photo", objArray1);
             a uoa = new a();
             obj = new VideoContext();
             obj.U1(u1.f());
             obj.R1(a.a.q(uof.a));
             str = p1.getPhotoId();
             a.o(str, "qPhoto.photoId");
             long l = Long.parseLong(str);
             a str1 = new a(null, null, obj, null, p1.getLocation(), p1.getCaption(), l, false, b.g(p1.recreationSetting()), null);
             uoa.c(g.a().e(v15.a, v15.a(), v15.b, v15.b(), v15.d, v15.e, v15.h, v15.c()).doFinally(new h(b.b(obj, uoa))).subscribe(i.b, j.b));
          }
       }
       return;
    }
    public void p00(GifshowActivity p0,Object p1){
       Object[] objArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "PublishPluginImpl";
       a.b().w(str, "current QPhoto: "+p1, objArray);
       if (!p0.C(p0)) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          return;
       }else if(!p1 instanceof QPhoto){
          Object[] objArray1 = new Object[0];
          a.b().w(str, "startActivityWithPhoto not QPhoto: "+p1, objArray1);
          return;
       }else {
          boolean b = true;
          a.X(b);
          boolean b1 = w.s0(p1);
          String photoId = p1.getPhotoId();
          boolean b2 = (p1.getFansTopStyle() != null && (p1.getFansTopStyle().getFansTopStatus() != b || p1.getFansTopStyle().isFansTopBoostRunning()))? true: false;
          try{
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(photoId, Boolean.valueOf(b2), null, uoa, "58")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "CLICK_REEDIT_ENTRY_BUTTON";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reedit_photo_id", photoId);
                photoId = "is_promote_video";
                String str1 = (b2)? "1": "0";
                jSONObject.put(photoId, str1);
                uElementPack.params = jSONObject.toString();
                u1.u(b, uElementPack, new ClientContent$ContentPackage());
             }
          }catch(org.json.JSONException e3){
             objArray2 = new Object[0];
             a.b().u("PublishLogger", e3, objArray2);
          }
          b$a uoa1 = b.b(p0);
          uoa1.p("FEED_PAGE");
          uoa1.P(new VideoContext());
          uoa1.T = p1;
          Intent intent = d.a(0x27e26f6e).Z00(uoa1.g());
          if (i.h()) {
             objArray2 = new Object[0];
             a.b().w(str, "discard current session", objArray2);
             intent.putExtra("discard_current_post_session", b);
          }
          p0.t1(intent, 0x2711, new b(p1, b1));
          p0.overridePendingTransition(R.anim.arg_RES_7f010105, 0);
          return;
       }
    }
    public void pV(YodaBaseWebView p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       r.b(e.f(p0), d.a(0x6758ee6d)).c(p1);
       return;
    }
    public t qJ(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != patchProxyRe) {
       }else {
          Object obj1 = b.a(0x4b316083);
          a.o(obj1, "Singleton.get\(ILogManager::class.java\)");
          obj = a.b().b(p0, obj1.getSessionId());
       }
       return obj;
    }
    public void rF(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       p0.startActivityForResult(this.Z00(p1), p1.mRequestCode);
       return;
    }
    public void rH(GifshowActivity p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "23")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, o.class, "30")) {
          b uob = p1.Q0();
          String str = "ShareDraftUtil";
          int i = 0;
          if (uob == null) {
             p1 = new Object[i];
             a.b().w(str, "initCustomSettingDraft: publishDraft is null.", p1);
          }else if(uob.v() == null || !uob.v().hasCustomSetting()){
             String str1 = j0.f(p0.getIntent(), "same_frame_origin_user_name");
             String str2 = j0.f(p0.getIntent(), "same_frame_origin_photo_id");
             int i1 = -1;
             int i2 = j0.b(p0.getIntent(), "same_frame_available_depth", i1);
             boolean b = a.a(p1.d1());
             boolean b1 = true;
             int i3 = (d.a(-273232199).Ta() && p1.a1() != Workspace$Type.PHOTO_MOVIE)? 1: 0;
             if (TextUtils.x(str2) && (i2 == i1 && i3)) {
                i2 = a1.s(la.d(p1.d1()), i1);
             }
          label_009a :
             b$a uoa = new b$a(p0);
             uoa.I(str1);
             uoa.H(str2);
             uoa.h(i2);
             b$a uoa1 = uoa.G(b);
             if (!i3 && i2) {
                b1 = false;
             }
             b uob1 = uoa1.j(b1).g();
             Object[] objArray = new Object[i];
             a.b().w(str, "initCustomSettingDraft: SharePageParam is : "+uob1, objArray);
             new ShareCustomRepo(p1, p1.d1(), o.e(p1, uob1), null).f();
          }
       }
       return;
    }
    public void rm(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       PreLoader.getInstance().clear(new int[6]{R.layout.share_v2,0x7f0d14f5,R.layout.share_edit_immutable_layout,0x7f0d14e5,R.layout.share_photos_preview_container_v2,0x7f0d14f9});
       return;
    }
    public Intent rs(b p0,boolean p1,boolean p2,boolean p3){
       Intent obj;
       Intent intent;
       b o;
       Uri uri;
       Workspace$Type vIDEO;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, a.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null || p0.c == null) {
          return obj;
       }else if(p1){
          if (!i.h() || p3) {
             i.V();
          }
          long l = System.currentTimeMillis();
          intent = PatchProxy.applyOneRefs(p0, obj, o.class, "6");
          if (intent != patchProxyRe) {
          }else {
             String str1 = p0.a();
             if (str1 == null) {
                a.b().e("ShareDraftUtil", "buildDraftSync: ", new IllegalArgumentException("filePath is null"));
                intent = obj;
             }else if(b.F().matcher(str1).find()){
                vIDEO = Workspace$Type.VIDEO;
             }else {
                vIDEO = Workspace$Type.SINGLE_PICTURE;
             }
             intent = DraftFileManager.E().f(vIDEO, p0.get(b.b), u1.f(), p0.j);
             DraftFileManager.E().m0(intent).subscribe(l.b, m.b);
             o.h(intent, p0);
          }
          if (intent == null) {
             return obj;
          }else {
             i.m().Z(intent);
             i.m().p().h(intent);
             Object[] objArray = new Object[0];
             a.b().w("PublishPluginImpl", "buildShareIntent: buildDraftSync cost="+k1.t(l), objArray);
          }
       }
       intent = new Intent(p0.c, ShareActivity.class);
       if (!PatchProxy.applyVoidTwoRefs(p0, intent, obj, c.class, "1")) {
          o = p0.O;
          if (o != null) {
             intent.putExtras(o);
          }
          intent.putExtra("tag", p0.k);
          intent.putExtra("IS_USE_SHARE_PARAM_PASS_TAG", true);
          intent.putExtra("immutable_text", p0.l);
          intent.putExtra("hie_photo_add_entrance", p0.S);
          intent.putExtra("wont_start_homepage_when_finished_as_last_activity", p0.i);
          intent.putExtra("from_page", p0.d);
          SerializableHook.putExtra(intent, "music", p0.r);
          o = p0.j;
          if (o != null) {
             intent.putExtra("VIDEO_CONTEXT", o.m());
          }
          o = p0.h;
          if (o == null) {
             b e = p0.e;
             if (e != null) {
                uri = w0.c(e);
             }
          }
          if (!TextUtils.x(p0.f)) {
             intent.putExtra("cover_path", p0.f);
          }
          if (!TextUtils.x(p0.g)) {
             intent.putExtra("ORIGIN_COVER_PATH", p0.g);
          }
          intent.putExtra("android.intent.extra.STREAM", uri);
          if (!TextUtils.x(p0.s)) {
             intent.putExtra("SOURCE", p0.s);
          }
          o = p0.t;
          if (o != null) {
             intent.setData(o);
          }
          c.a(intent, "encode_request_key", p0.u);
          intent.putExtra("pre_encode_id", p0.v);
          o = p0.w;
          if (o != null) {
             SerializableHook.putExtra(intent, "magic_emoji", o);
          }
          intent.putExtra("START_SHARE_ACTIVITY_TIME", p0.x);
          c.a(intent, "photo_task_id", p0.y);
          if (!TextUtils.x(p0.z)) {
             c.a(intent, "editSessionId", p0.z);
          }
          intent.putExtra("encode_config_id", p0.A);
          o = p0.B;
          String str = "INTERACT_STICKER_INFO";
          if (o == null) {
             intent.removeExtra(str);
          }else {
             SerializableHook.putExtra(intent, str, o);
          }
          intent.putExtra("cover_need_upload", p0.C);
          c.a(intent, "same_frame_user_name", p0.D);
          c.a(intent, "same_frame_photo_id", p0.E);
          o = p0.F;
          if (o != null) {
             intent.putExtra("disable_sameframe_switch", o.booleanValue());
          }
          intent.putExtra("same_frame_available_depth", p0.G);
          o = p0.H;
          if (o != null) {
             intent.putExtra("same_frame_allow_lrc", o.booleanValue());
          }
          intent.putExtra("share_video_duration", p0.I);
          intent.putExtra("EDITING_ACTION", p0.J);
          o = p0.p;
          if (o != null) {
             SerializableHook.putExtra(intent, "back_dialog_style", o);
          }
          o = p0.K;
          if (o != null) {
             intent.putExtra("share_qphoto", b.c(o));
          }
          intent.putExtra("IS_LONG_PIC_OR_ATLAS", p0.L);
          o = p0.M;
          if (o != null) {
             intent.putExtra("INTENT_SET_POST_SESSION_ENTRY", o.booleanValue());
          }
          d mThirdPartyB = p0.mThirdPartyBundle;
          if (mThirdPartyB != null) {
             intent.putExtra("THIRD_PARTY_PASS_THROUGH", mThirdPartyB);
          }
          c.a(intent, "ktv_info", p0.N);
          intent.putExtra("SHOW_FLOW_FEEDBACK", p0.Q);
          intent.putExtra("ALREADY_REQUESTED_FEEDBACK", p0.R);
          intent.putExtra("has_pic_template", p0.T);
          intent.putExtra("relay_draft_id", p0.U);
          p0.write(intent);
       }
       if (p0.mIPageCallBack == null) {
          p0.mIPageCallBack = this.Jn();
       }
       s.b().d(2, p0);
       if (p2) {
          this.m70(p0.c, p0);
       }
       return intent;
    }
    public boolean uu(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, a.class, "24");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = "PublishPluginImpl";
       if (!i.h()) {
          obj = new Object[0];
          a.b().w(str, "PostSession is not available", obj);
          return true;
       }else {
          c uoc = i.m().p().l();
          if (uoc == null) {
             obj = new Object[0];
             a.b().w(str, "miss param draft", obj);
             return true;
          }else {
             PublishPageSetting value = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting());
             Object obj1 = PatchProxy.applyTwoRefs(uoc, value, objArray, o.class, "32");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(uoc.Q0() == null){
                b = o.g(value);
             }else {
                b uob = uoc.Q0();
                if (uob.v() == null) {
                   b = o.g(value);
                }else {
                   String caption = uob.v().getCaption();
                   if (TextUtils.x(caption)) {
                      b = o.g(value);
                   }else if(c.h(c.d(caption, c.j(uoc))) <= c.e(value)){
                      b = 1;
                   }else {
                      b = 0;
                   }
                }
             }
             b = b ^ true;
             if (!b) {
                i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f104023, c.e(value)));
                return 0;
             }else {
                return true;
             }
          }
       }
    }
    public void w(PostStatus p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "25")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2") && (!g.a || (p0 != null && p1 != null))) {
          String sessionId = p1.getSessionId();
          if (p0 == PostStatus.UPLOAD_COMPLETE) {
             str = "UploadSuccess";
          }else if(p0 != PostStatus.ENCODE_FAILED && (p0 != PostStatus.ENCODE_CANCELED && (p0 == PostStatus.UPLOAD_FAILED || p0 == PostStatus.UPLOAD_CANCELED))){
             str = "UploadFailed";
          }
          c.d().g(new a$c(str, sessionId, null));
       }
    label_004a :
       d.a(0x14d6f666).w(p0, p1);
       return;
    }
    public long wD(){
       Object obj = PatchProxy.apply(null, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.a.getLong(b.d("user")+"user_last_publish_time", 0);
    }
    public void xU(PresenterV2 p0){
       b.c(this, p0);
    }
    public void yW(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "16")) {
          return;
       }
       g b = g.b;
       Objects.requireNonNull(b);
       g og = g.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, b, og, "1")) {
          a.p(p0, "activity");
          a.p(p1, "photoId");
          Object[] objArray = new Object[0];
          a.b().w("ShareReeditPromoteVideoUtils", "reeditPhoto "+p1, objArray);
          a uoa = new a();
          AttrAnimProgressFragment uAttrAnimPro = b.b(p0, uoa);
          t ot = PatchProxy.applyOneRefs(p1, b, og, "5");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = g.a().g(Long.parseLong(p1)).observeOn(d.a).map(new a(p1));
             a.o(ot, "PublishApi.getApiService…n@map it.body\(\)\n        }");
          }
          uoa.c(ot.doFinally(new b(uAttrAnimPro)).subscribe(new c(p0, p1), d.b));
       }
       return;
    }
}
