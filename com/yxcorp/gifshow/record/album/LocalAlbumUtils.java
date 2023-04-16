package com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Object;
import m8c.e;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mca.a;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Exception;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$DraftFileException;
import java.lang.Throwable;
import java.io.File;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.a;
import crd.b;
import java.lang.System;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.record.album.model.c;
import com.yxcorp.gifshow.publish.ShareProject;
import brd.t;
import com.yxcorp.gifshow.record.album.model.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import k8c.h1;
import k8c.i1;
import erd.g;
import maa.a;
import java.lang.IllegalArgumentException;
import ooc.j;
import android.content.Context;
import y26.b$a;
import y26.b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import android.net.Uri;
import ekd.w0;
import java.util.concurrent.atomic.AtomicReference;
import t45.d;
import k8c.e1;
import k8c.s1;
import erd.o;
import k8c.w1;
import k8c.z1;
import com.yxcorp.gifshow.record.album.x0;
import com.yxcorp.gifshow.record.album.c0;
import k8c.j1;
import e17.i;
import u07.u;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import lnc.a1;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import u07.t$a;
import android.app.Activity;
import java.lang.CharSequence;
import k8c.p1;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import p8c.v;
import java.lang.Integer;
import kzc.d;
import com.yxcorp.gifshow.record.album.d0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.record.album.k0;
import k8c.k1;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import q16.a$a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import java.io.Serializable;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.yxcorp.utility.TextUtils;
import java.lang.Double;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import java.lang.reflect.Field;
import com.yxcorp.gifshow.record.album.i1;
import com.yxcorp.gifshow.record.album.v0;
import com.kuaishou.edit.draft.Workspace;
import qr4.i;
import com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataResult$EligibleDraftData;
import com.kuaishou.edit.draft.Asset;
import qr4.k$j;
import qr4.k$e;
import com.kwai.sdk.switchconfig.a;
import java.util.Iterator;
import java.lang.RuntimeException;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import qr4.m$p;
import haa.f;
import qr4.m$k0;
import ekd.j;
import qr4.m$n;
import qr4.m$j0;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import qr4.k$l;
import java.lang.Long;
import brd.a0;
import com.yxcorp.gifshow.record.album.k1;
import android.util.Pair;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.record.album.e1;
import brd.w;
import com.yxcorp.gifshow.record.album.f1;
import wkd.b;
import j80.c;
import o8c.j;
import o8c.k;
import cjd.e;
import com.yxcorp.gifshow.record.album.r0;
import com.yxcorp.gifshow.record.album.a1;
import com.yxcorp.gifshow.record.album.y0;
import java.lang.Number;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.util.j;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import k8c.f2;
import java.util.concurrent.Callable;
import com.kuaishou.edit.draft.Asset$Type;
import com.kuaishou.edit.draft.TimeRange;
import k8c.e2;
import com.yxcorp.gifshow.record.album.c1;
import com.yxcorp.gifshow.record.album.s0;
import yaa.c;
import yaa.a;
import com.kuaishou.edit.draft.EditLyric;
import com.yxcorp.gifshow.record.album.o1;
import io.reactivex.g;
import com.yxcorp.gifshow.record.album.j1;
import java.util.regex.Pattern;
import lnc.v5;
import com.yxcorp.gifshow.record.album.x1;
import brd.e0;
import brd.h;
import com.yxcorp.gifshow.record.album.y1;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import cxd.b;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import ird.a;
import com.yxcorp.gifshow.record.album.b0;
import io.reactivex.internal.operators.flowable.p;
import erd.c;
import brd.m;
import io.reactivex.internal.operators.maybe.o;
import brd.q;
import com.yxcorp.gifshow.record.album.w1;
import com.yxcorp.gifshow.record.album.g1;

public class LocalAlbumUtils	// class@001709
{
    public static String a = "";
    public static long b = 0x5265c00;
    public static String c = "data:image/jpg;base64,";

    public void LocalAlbumUtils(){
       super();
    }
    public static b$a A(e p0){
       b$a obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.u();
       if (p0 instanceof d) {
          b$a uoa = new b(p0.k(), f.h()).b();
          if (uoa.getProject() != null) {
             uoa.getProject().setMarginColor(EditorSdk2Utils.createRGBAColor(0, 0, 0, 0));
             uoa.getProject().setPaddingColor(EditorSdk2Utils.createRGBAColor(0, 0, 0, 0));
             return uoa;
          }else if(uoa.h() != null){
             throw new DraftFileManager$DraftFileException(uoa.h());
          }else {
             throw new DraftFileManager$DraftFileException("Failed to load workspace, project null");
          }
       }else {
          obj = new b$a();
          obj.k(EditorSdk2UtilsV2.createProjectWithFile(p0.c().getAbsolutePath()));
          return obj;
       }
    }
    public static boolean B(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022 || p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL)? true: false;
       return b;
    }
    public static b C(e p0,boolean p1,boolean p2,GifshowActivity p3,a p4,a p5,String p6,String p7){
       a obj1;
       object oobject = p0;
       boolean b = p1;
       boolean b1 = p2;
       object oobject1 = p3;
       object oobject2 = p5;
       object oobject3 = p6;
       object oobject4 = p7;
       int i = 1;
       b$a[] obj = null;
       int i1 = 0;
       if (PatchProxy.isSupport2(LocalAlbumUtils.class, "25")) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Boolean.valueOf(p2),oobject1,p4,oobject2,oobject3,oobject4};
          obj1 = PatchProxy.apply(objArray, obj, LocalAlbumUtils.class, "25");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       long l = System.currentTimeMillis();
       obj1 = a.D();
       String str = "EditCost share start isDurationOverLimit:"+b1+",convertIfLegacy:"+b;
       Object[] objArray1 = new Object[i1];
       String str1 = "LocalAlbumUtils";
       try{
          obj1.w(str1, str, objArray1);
          p4.run();
       }catch(java.lang.Exception e0){
          PostUtils.D(str1, "showProgress", e0);
       }
       if (oobject instanceof c) {
          if (!b) {
             try{
                p5.run();
             }catch(java.lang.Exception e0){
                PostUtils.D(str1, "dismissProgress", e0);
             }
             PatchProxy.onMethodExit(LocalAlbumUtils.class, "25");
             return obj;
          }else {
             h1 oh1 = new h1(p0, p2, p3, p4, p5, p6, p7);
             PatchProxy.onMethodExit(LocalAlbumUtils.class, "25");
             return b.a(oobject.k()).observeOn(a.c()).subscribe(str1, new i1(oobject2));
          }
       }else {
          object oobject5 = oobject;
          c uoc = oobject5.k();
          if (oobject5.l() || LocalAlbumUtils.G(uoc.D0())) {
             try{
                p5.run();
             }catch(java.lang.Exception e0){
                PostUtils.D(str1, "share dismissProgress", e0);
             }
             i.a(R.style.arg_RES_7f11066a, 0x7f1004c9);
             Object[] objArray2 = new Object[0];
             a.D().w(str1, "share can not edit during posting", objArray2);
             PatchProxy.onMethodExit(LocalAlbumUtils.class, "25");
             return null;
          }else if(uoc.o0() == null){
             PostUtils.D(str1, "LocalAlbumUtils daft getAssetDraft is null", new IllegalArgumentException());
          }
          LocalAlbumUtils.i(uoc);
          j.a(uoc);
          b$a uoa = b.b(p3);
          uoa.w(f.E(uoc.a1()));
          uoa = uoa.B(true);
          uoa.p("review");
          uoa.M(System.currentTimeMillis());
          uoa.t(w0.f("ks://share/old"));
          t ot = (b1)? LocalAlbumUtils.e(uoc): t.just(uoc);
          obj = new b$a[]{null};
          AtomicReference uAtomicRefer = new AtomicReference();
          c0 uoc0 = new c0(l, p3, uoc, obj, uAtomicRefer, p5);
          PatchProxy.onMethodExit(LocalAlbumUtils.class, "25");
          return ot.observeOn(d.c).doOnDispose(new e1(uAtomicRefer)).map(new s1(uoc, obj, oobject)).flatMap(new w1(p6, oobject4)).observeOn(d.a).flatMap(new z1(obj, oobject1, uoc, uoa)).map(x0.b).subscribe(str1, new j1(oobject2));
       }
    }
    public static void D(GifshowActivity p0,u p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, LocalAlbumUtils.class, "17")) {
          return;
       }
       t$a uoa = new t$a(p0);
       uoa.X0(a1.q(R.string.arg_RES_7f102f77, LongVideoLocalProject.f()));
       uoa.z0(a1.q(R.string.arg_RES_7f102f76, LongVideoLocalProject.f()));
       uoa.S0(R.string.arg_RES_7f102f64);
       uoa.Q0(R.string.cancel);
       uoa.u0(p1);
       uoa.t0(new p1(p0));
       d.a(0x34dc9f9c).lV(uoa, PostDialogPlugin$DialogScenario.UNKNOWN);
       int page = p0.getPage();
       v ov = v.class;
       if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(page), Integer.valueOf(1483), null, ov, "25")) {
          v.m(page, 1483, "", 4, null);
       }
       PatchProxy.onMethodExit(LocalAlbumUtils.class, "17");
       return;
    }
    public static void E(GifshowActivity p0,c p1,u p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, LocalAlbumUtils.class, "38")) {
          return;
       }
       d uod = new d(p0);
       uod.Q0(R.string.arg_RES_7f1012a9);
       uod.S0(R.string.arg_RES_7f103d59);
       uod.y0(R.string.arg_RES_7f103d5a);
       uod.u0(p2);
       uod.L(d0.b);
       uod.A(false);
       uod.k().Z();
       PatchProxy.onMethodExit(LocalAlbumUtils.class, "38");
       return;
    }
    public static t F(c p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LocalAlbumUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftFileManager.E().m0(p0).observeOn(d.a).doOnNext(k0.b).doOnNext(new k1(p1, p2));
    }
    public static boolean G(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.a(-273232199).a20().e4(p0) != null)? true: false;
       return b;
    }
    public static boolean H(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!LocalAlbumUtils.G(p0)) {
          return i;
       }
       Object[] objArray = new Object[i];
       a.D().w("LocalAlbumUtils", "filterPublishingWorkspace\(\) save to local switch close and workspace is publishing id="+p0, objArray);
       return true;
    }
    public static a$a a(c p0,GifshowActivity p1,File p2,int p3,boolean p4,String p5){
       a$a obj;
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       int i = 1;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, null, localAlbumUt, "39");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$a();
       Object[] objArray1 = new Object[0];
       a.D().w("LocalAlbumUtils", "buildDraftToEditParam", objArray1);
       obj.a0("album_draft");
       obj.f0(p0.V0());
       VideoContextDraftHelper.c(p0, p0.d1());
       obj.d0(Integer.valueOf(R.anim.arg_RES_7f010109));
       if (DraftUtils.a0(p0) && (!p4 && p1 != null)) {
          if (p2 != null) {
             obj.b0(EditorSplashImageInfo.generateEditorSplashImageWithFilePath(p1, p2.getAbsolutePath()));
          }else {
             p2 = DraftFileManager.E().u(p0);
             String str = (p0.s0() != null && (p0.s0().v() != null && !TextUtils.x(p0.s0().v().getVideoCoverParam().getVideoCoverRatio())))? 1: null;
             if (p2 != null && !str) {
                obj.b0(EditorSplashImageInfo.generateEditorSplashImageWithFilePath(p1, p2.getAbsolutePath()));
             }
          }
       }
    label_00be :
       if (p3 != i) {
          i = false;
       }
       Boolean uBoolean = Boolean.valueOf(i);
       if (PatchProxy.applyOneRefs(uBoolean, obj, a$a.class, "77") != PatchProxyResult.class) {
       }else {
          obj.l = uBoolean.booleanValue();
       }
       if (!TextUtils.x(p5)) {
          if (PatchProxy.applyOneRefs(p5, obj, a$a.class, "83") != PatchProxyResult.class) {
          }else {
             obj.Q1 = p5;
          }
       }
       return obj;
    }
    public static boolean b(double p0){
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, localAlbumUt, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if ((p0 * 0x408f400000000000) - (double)LongVideoLocalProject.e(b) <= 0) {
          b = false;
       }
       return b;
    }
    public static List c(List p0){
       Object obj = null;
       Object[] obj1 = PatchProxy.applyOneRefs(p0, obj, LocalAlbumUtils.class, "71");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       int i = 0;
       if (!p0.size()) {
          obj1 = new Object[i];
          a.D().A("LocalAlbumUtils", "no value in list targetObject", obj1);
          return obj;
       }else if(LocalAlbumUtils.t(p0.get(i).getClass())){
          return p0;
       }else {
          ArrayList uArrayList = new ArrayList();
          for (; i < p0.size(); i = i + 1) {
             uArrayList.add(LocalAlbumUtils.d(p0.get(i)));
          }
          return uArrayList;
       }
    }
    public static JSONObject d(Object p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       Field[] declaredFiel = p0.getClass().getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          boolean b = true;
          try{
             oobject.setAccessible(b);
             Object obj1 = oobject.get(p0);
             if (obj1 == null) {
                Object[] objArray = new Object[0];
                a.D().w("LocalAlbumUtils", "constructObjectInfo\(\) no value for field, name="+oobject.getName(), objArray);
             }else if(obj1.getClass() == p0.getClass()){
                if (LocalAlbumUtils.t(obj1.getClass())) {
                   obj.put(oobject.getName(), obj1);
                }else if(obj1 instanceof List){
                   obj.put(oobject.getName(), LocalAlbumUtils.c(obj1));
                }else {
                   obj.put(oobject.getName(), LocalAlbumUtils.d(obj1));
                }
             }
             i = i + 1;
          }catch(java.lang.IllegalAccessException e11){
             a.D().z("LocalAlbumUtils", "constructObjectInfo\(\) failed to access target field, name="+oobject.getName(), e11);
             return null;
          }catch(org.json.JSONException e11){
             a.D().z("LocalAlbumUtils", "constructObjectInfo\(\) failed to write json, name="+oobject.getName(), e11);
             return null;
          }
       }
       return obj;
    }
    public static t e(c p0){
       i1 obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i1.b;
       t ot = DraftFileManager.E().m0(p0).observeOn(d.a).map(obj);
       return ot.flatMap(obj.b);
    }
    public static JSGetEligibleDraftDataResult$EligibleDraftData f(Workspace p0,i p1,List p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JSGetEligibleDraftDataResult$EligibleDraftData obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LocalAlbumUtils.class, "67");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JSGetEligibleDraftDataResult$EligibleDraftData();
       obj.mIdentifier = p0.getIdentifier();
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p0.getAssetsCount(); i = i + 1) {
          uArrayList.add(p0.getAssets(i).getAlbumId());
       }
       obj.mAssetDataList = uArrayList;
       i c = p1.c;
       if (c != null) {
          k$j u = c.u;
          if (u != null && u.length > 0) {
             ArrayList uArrayList1 = new ArrayList();
             int len = u.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                uArrayList1.add(u[i1].b);
             }
             obj.mMagicEmojiDataList = uArrayList1;
          }
       }
       if (a.t().d("enableGetDraftExtraParams", true) && (p2 != null && p2.size() > 0)) {
          JSONObject jSONObject = PatchProxy.applyThreeRefs(p0, p1, p2, null, LocalAlbumUtils.class, "68");
          if (jSONObject != patchProxyRe) {
          }else {
             Object[] objArray = new Object[0];
             a.D().w("LocalAlbumUtils", "getDataForExtraParams\(\) extraParams="+p2, objArray);
             jSONObject = new JSONObject();
             Iterator iterator = p2.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                String[] stringArray = str.split("\\.");
                if (stringArray.length < 2) {
                   a.D().z("LocalAlbumUtils", "extraParam is too short, extraParam="+str, new IllegalArgumentException());
                }else {
                   Object obj1 = null;
                   if ((stringArray[0]).equals("workspace")) {
                      obj1 = LocalAlbumUtils.j(stringArray, true, p0);
                   }else if((stringArray[0]).equals("photoMeta")){
                      obj1 = LocalAlbumUtils.j(stringArray, true, p1);
                   }
                   if (obj1 != null) {
                      try{
                         jSONObject.put(str, obj1);
                      }catch(org.json.JSONException e4){
                         a.D().z("LocalAlbumUtils", "failed to put extraData, param="+str, e4);
                         goto label_00a7 ;
                      }
                   }
                }
             }
          }
          obj.mExtraData = jSONObject;
       }
    label_011b :
       return obj;
    }
    public static File g(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(PostUtils.g("[>|43|>]"), p0.getName()+"-"+(p0.getAbsolutePath()).hashCode()+"-tmp.jpg");
    }
    public static File h(File p0){
       Object[] objArray1;
       a obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          PostUtils.D("LocalAlbumUtils", "createVideoTmpDefaultCover", new RuntimeException(" videoFile is not exits"));
          return null;
       }else {
          obj = a.D();
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "createVideoTmpDefaultCover: create video bitmap";
          try{
             obj.w("LocalAlbumUtils", str, objArray);
             File uFile = LocalAlbumUtils.g(p0);
             Bitmap uBitmap = BitmapUtil.m(p0.getAbsolutePath(), 2);
             if (uBitmap == null) {
                uBitmap = BitmapUtil.q(p0.getAbsoluteFile());
             }
             if (uBitmap == null) {
                objArray1 = new Object[i];
                a.D().A("LocalAlbumUtils", "createVideoTmpDefaultCover get video cover null", objArray1);
                return null;
             }else {
                BitmapUtil.N("post_smart_album", uBitmap, uFile.getAbsolutePath(), 98);
                uBitmap.recycle();
                objArray1 = new Object[i];
                a.D().s("LocalAlbumUtils", "createVideoTmpDefaultCover: success "+uFile, objArray1);
                return uFile;
             }
          }catch(java.lang.Exception e8){
             PostUtils.D("LocalAlbumUtils", "createVideoTmpDefaultCover", e8);
             return null;
          }
       }
    }
    public static void i(c p0){
       Object[] objArray;
       boolean b1;
       Object[] objArray2;
       Object[] objArray4;
       i b2;
       Object[] objArray5;
       Object[] objArray6;
       Object obj = p0;
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       Object[] obj1 = null;
       if (PatchProxy.applyVoidOneRefs(obj, obj1, localAlbumUt, "42")) {
          return;
       }
       VideoContext videoContext = p0.d1();
       if (videoContext == null) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(videoContext, obj, obj1, localAlbumUt, "41")) {
          m$p op = videoContext.u();
          if (op == null) {
             objArray4 = new Object[0];
             f.D().w("LocalAlbumUtils", "fillKuaishanInfoIfNeed\(\) VideoContext has no kuaishan, No need fill", objArray4);
          }else {
             b2 = videoContext.F().b;
             if (p0.T0() == Workspace$Source.IMPORT || p0.T0() == Workspace$Source.IMPORT_MIXED) {
                objArray5 = new Object[0];
                f.D().w("LocalAlbumUtils", "fillKuaishanInfoIfNeed\(\) is import workspace", objArray5);
                if (b2 == null || j.h(b2.E)) {
                   objArray4 = new Object[0];
                   f.D().A("LocalAlbumUtils", "fillKuaishanInfoIfNeed\(\) videoInfo.kuaishanVideo is null", objArray4);
                }else {
                   b2.E[0].q = op;
                   objArray6 = new Object[0];
                   f.D().w("LocalAlbumUtils", "fillKuaishanInfoIfNeed\(\) fill kuaishan for "+p0.D0(), objArray6);
                }
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(videoContext, obj, obj1, localAlbumUt, "40")) {
          m$j0 oj0 = videoContext.S();
          if (oj0 == null) {
             objArray4 = new Object[0];
             f.D().w("LocalAlbumUtils", "fillThirdPartyInfoIfNeed\(\) VideoContext has no thirdParty, No need fill", objArray4);
          }else {
             b2 = videoContext.F().b;
             if (p0.T0() == Workspace$Source.IMPORT || p0.T0() == Workspace$Source.IMPORT_MIXED) {
                objArray5 = new Object[0];
                f.D().w("LocalAlbumUtils", "fillThirdPartyInfoIfNeed\(\) is import workspace", objArray5);
                if (b2 == null || j.h(b2.E)) {
                   objArray4 = new Object[0];
                   f.D().A("LocalAlbumUtils", "fillThirdPartyInfoIfNeed\(\) videoInfo.importPart is null", objArray4);
                }else {
                   b2.E[0].o = oj0;
                   objArray6 = new Object[0];
                   f.D().w("LocalAlbumUtils", "fillThirdPartyInfoIfNeed\(\) fill third party for "+p0.D0(), objArray6);
                }
             }
          }
       }
       k$e[] uoeArray = videoContext.w();
       String str = " source=";
       if (uoeArray == null || !uoeArray.length) {
          obj1 = new Object[0];
          f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\) VideoContext has no magicEmoji, No need fill "+p0.a1()+str+p0.T0(), obj1);
          return;
       }else {
          i b = videoContext.F().b;
          if (p0.T0() == Workspace$Source.IMPORT || p0.T0() == Workspace$Source.IMPORT_MIXED) {
             obj1 = new Object[0];
             f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\) is import workspace", obj1);
             if (b == null || j.h(b.E)) {
                objArray = new Object[0];
                f.D().A("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\) videoInfo.importPart is empty", objArray);
                return;
             }else if(j.h(b.E[0].p)){
                videoContext.F().b.E[0].p = uoeArray;
                obj1 = new Object[0];
                f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\) fill magic emoji for "+p0.D0(), obj1);
             }
             return;
          }else if(p0.T0() != Workspace$Source.SAME_FRAME && (p0.T0() == Workspace$Source.FOLLOW_SHOOT || p0.a1() == Workspace$Type.KTV_MV)){
             b = 1;
          }else {
             b = null;
          }
          if (!b) {
             obj1 = new Object[0];
             f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\), dont need save magic workspaceDraft type is "+p0.a1()+str+p0.T0(), obj1);
             return;
          }else if(videoContext.F().b != null && !j.h(videoContext.F().b.E)){
             obj1 = new Object[0];
             f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\), importPart exist "+p0.a1()+str+p0.T0(), obj1);
             return;
          }else {
             a uoa = p0.o0();
             if (uoa == null) {
                objArray = new Object[0];
                f.D().A("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\) No assetDraft", objArray);
                return;
             }else {
                List list = uoa.z();
                Object[] objArray1 = new Object[0];
                f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\)  workspace"+p0.D0(), objArray1);
                m$n[] onArray = new m$n[]{new m$n()};
                int i = 0;
                while (i < list.size() && i < uoeArray.length) {
                   Asset uAsset = list.get(i);
                   if (!uAsset.hasShootInfo() || !uAsset.getShootInfo().hasRecordMagicface()) {
                      String albumId = uAsset.getAlbumId();
                      if (list.size() != 1) {
                         i obj2 = PatchProxy.applyTwoRefs(videoContext, albumId, obj1, localAlbumUt, "43");
                         if (obj2 != PatchProxyResult.class) {
                            b1 = obj2.booleanValue();
                         }else if(TextUtils.x(albumId)){
                            objArray2 = new Object[0];
                            f.D().A("LocalAlbumUtils", "hasCorrespondingMagicEmoji\(\) path is empty", objArray2);
                         }else {
                            obj2 = videoContext.F().c;
                            if (obj2 != null) {
                               k$j t = obj2.t;
                               if (t != null) {
                                  int len = t.length;
                                  int i1 = 0;
                                  while (true) {
                                     if (i1 < len) {
                                        if (albumId.equals(t[i1].f)) {
                                           objArray2 = new Object[0];
                                           f.D().w("LocalAlbumUtils", "filePath match, has corresponding MagicEmoji path="+albumId, objArray2);
                                           b1 = true;
                                        }else {
                                           i1 = i1 + 1;
                                           object oobject = null;
                                        }
                                     }else {
                                        objArray2 = new Object[0];
                                        f.D().w("LocalAlbumUtils", "no filePath match, no corresponding MagicEmoji path="+albumId, objArray2);
                                     }
                                  }
                               label_02ec :
                                  return;
                               }
                            }
                            Object[] objArray3 = new Object[0];
                            f.D().w("LocalAlbumUtils", "hasCorrespondingMagicEmoji\(\) record is null ", objArray3);
                         }
                         b1 = false;
                         if (!b1) {
                         label_02a3 :
                            i = i + 1;
                            obj1 = null;
                         }
                      }
                      onArray[0].p = uoeArray;
                      onArray[0].g = albumId;
                      obj1 = new Object[0];
                      f.D().w("LocalAlbumUtils", "fillImportPartForOldDraftIfNeed\(\), fill magic for type is "+p0.a1()+str+p0.T0()+" fill magic "+uoeArray[0].a, obj1);
                      videoContext.F().b.E = onArray;
                      goto label_02ec ;
                   }
                }
             }
          }
       }
    }
    public static Object j(String[] p0,int p1,Object p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, LocalAlbumUtils.class, "69");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1 < p0.length) {
          object oobject = p0[p1];
          try{
             Field declaredFiel = p2.getClass().getDeclaredField(oobject);
             declaredFiel.setAccessible(true);
             p2 = declaredFiel.get(p2);
             if (p2 instanceof List) {
                ArrayList uArrayList = new ArrayList();
                p2 = p2.iterator();
                while (p2.hasNext()) {
                   int i = p1 + 1;
                   uArrayList.add(LocalAlbumUtils.j(p0, i, p2.next()));
                }
                return uArrayList;
             }else {
                return LocalAlbumUtils.j(p0, (p1 + true), p2);
             }
          }catch(java.lang.NoSuchFieldException e10){
             a.D().z("LocalAlbumUtils", "failed to get target field, name="+oobject, e10);
             return null;
          }catch(java.lang.IllegalAccessException e10){
             a.D().z("LocalAlbumUtils", "failed to access target field, name-"+oobject, e10);
             return null;
          }
       }else {
          p0 = PatchProxy.applyOneRefs(p2, null, localAlbumUt, "70");
          if (p0 != patchProxyRe) {
             p2 = p0;
          }else if(LocalAlbumUtils.t(p2.getClass())){
             p2 = (p2 instanceof List)? LocalAlbumUtils.c(p2): LocalAlbumUtils.d(p2);
          }
          return p2;
       }
    }
    public static t k(long p0){
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       Object obj = null;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(p0), obj, localAlbumUt, "34");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       return t.merge(LocalAlbumUtils.n().w(k1.b), t.just(new Pair(new BubbleEnterPostParam(1, obj, obj), Integer.valueOf(-103))).observeOn(d.c).delay(p0, TimeUnit.MILLISECONDS).map(e1.b)).map(f1.b);
    }
    public static File l(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).n();
    }
    public static t m(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.a().c().map(new e()).map(r0.b);
    }
    public static a0 n(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalAlbumUtils.x().d0().flatMap(a1.b).toList().G(d.c).C(y0.b);
    }
    public static int o(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("localAlbumShootVideoTipsCount", 3);
    }
    public static Uri p(File p0,GifshowActivity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LocalAlbumUtils.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 29) {
          return j.b(p0);
       }
       return j.e(p1, "", p0);
    }
    public static t q(e p0){
       Kuaishan obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof d || p0.getType() != Workspace$Type.KUAISHAN) {
          return t.just(Boolean.FALSE);
       }
       a uoa = p0.k().F0();
       if (uoa == null) {
          return t.just(Boolean.FALSE);
       }
       obj = uoa.v();
       if (obj == null) {
          return t.just(Boolean.FALSE);
       }
       File uFile = DraftFileManager.E().B(obj.getTemplateDirectory(), uoa);
       if (uFile != null && uFile.exists()) {
          File uFile1 = new File(uFile.getAbsolutePath()+File.separator+"project");
          if (uFile1.exists() && uFile1.isFile()) {
             return t.fromCallable(new f2(uFile)).subscribeOn(d.c);
          }
       }
       return t.just(Boolean.FALSE);
    }
    public static t r(e p0){
       double videoDuratio;
       Object[] objArray;
       TimeRange obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 instanceof c) {
          videoDuratio = p0.getVideoDuration();
          objArray = new Object[i];
          a.D().w("LocalAlbumUtils", "project is LocalAlbumLegacyProject,duration: "+videoDuratio, objArray);
          return t.just(Boolean.valueOf(LocalAlbumUtils.b(videoDuratio)));
       }else if(p0 instanceof d){
          Object[] objArray1 = new Object[i];
          a.D().w("LocalAlbumUtils", "project is LocalAlbumWorkspaceProject", objArray1);
          c uoc = p0.k();
          if (uoc != null && uoc.d1().F().b.C != null) {
             objArray1 = new Object[i];
             a.D().w("LocalAlbumUtils", "project is localAlbumImportedVideo", objArray1);
             a uoa = uoc.o0();
             if (uoa != null && (uoa.z().size() == 1 && (uoa.v() != null && uoa.v().getType() == Asset$Type.VIDEO))) {
                obj = uoa.v().getSelectedRange();
                String str = null;
                if (obj.getDuration() - str > 0) {
                   objArray = new Object[i];
                   a.D().w("LocalAlbumUtils", "timeRange duration: "+obj.getDuration(), objArray);
                   return t.just(Boolean.valueOf(LocalAlbumUtils.b(obj.getDuration())));
                }else if(uoa.v().getDuration() - str > 0){
                   videoDuratio = uoa.v().getDuration();
                   objArray = new Object[i];
                   a.D().w("LocalAlbumUtils", "asset duration: "+videoDuratio, objArray);
                   return t.just(Boolean.valueOf(LocalAlbumUtils.b(videoDuratio)));
                }else {
                   File uFile = DraftFileManager.E().B(uoa.v().getFile(), uoa);
                   if (uFile != null) {
                      objArray = new Object[i];
                      a.D().w("LocalAlbumUtils", "video asset file path: "+uFile.getAbsolutePath(), objArray);
                      return t.fromCallable(new e2(uFile)).subscribeOn(d.c).observeOn(d.a).map(c1.b);
                   }
                }
             }
          }
       }
       return t.just(Boolean.FALSE);
    }
    public static t s(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalAlbumUtils.x().C(s0.b).d0();
    }
    public static boolean t(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.isPrimitive() || p0 == String.class) {
          return true;
       }
       try{
          p0 = p0.getField("TYPE").get(null);
          if (p0 != null && p0.isPrimitive()) {
             return true;
          }
       }catch(java.lang.IllegalAccessException e4){
          a.D().z("LocalAlbumUtils", "isInfoWritable\(\) failed to access TYPE", e4);
       }catch(java.lang.NoSuchFieldException e4){
          a.D().z("LocalAlbumUtils", "isInfoWritable\(\) failed to get field TYPE", e4);
       }
       return false;
    }
    public static boolean u(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.J0();
       boolean b = true;
       if (p0 == null) {
          return b;
       }
       a uoa = p0.f0();
       if (uoa == null) {
          return b;
       }
       EditLyric uEditLyric = uoa.v();
       if (uEditLyric == null) {
          return b;
       }
       if (!uEditLyric.getAeRender() && uEditLyric.getStickerResultsList().size() > 0) {
          b = false;
       }
       return b;
    }
    public static boolean v(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (p0.getPath()).endsWith(".mp4");
    }
    public static t w(long p0){
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, localAlbumUt, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new o1(p0));
    }
    public static a0 x(){
       b0 a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, objArray, localAlbumUt, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DraftFileManager.E().R().C(j1.b);
       a0 uoa0 = PatchProxy.apply(objArray, objArray, localAlbumUt, "3");
       if (uoa0 != patchProxyRe) {
       }else {
          uoa0 = a0.y(new x1(v5.b())).T(d.c);
       }
       h oh = a0.h(obj, uoa0);
       a0 uoa01 = PatchProxy.apply(objArray, objArray, localAlbumUt, "4");
       if (uoa01 != patchProxyRe) {
       }else {
          uoa01 = a0.y(y1.b).T(d.c);
       }
       h oh1 = uoa01.a0();
       Objects.requireNonNull(oh);
       a.c(oh1, "other is null");
       a.c(oh, "source1 is null");
       a.c(oh1, "source2 is null");
       b[] uobArray = new b[]{oh,oh1};
       oh1 = a.f(new FlowableConcatArray(uobArray, 0));
       a = b0.a;
       Objects.requireNonNull(oh1);
       a.c(a, "reducer is null");
       m om = a.g(new p(oh1, a));
       Integer integer = Integer.valueOf(0);
       Objects.requireNonNull(om);
       a.c(integer, "defaultValue is null");
       return a.i(new o(om, integer));
    }
    public static t y(long p0){
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, localAlbumUt, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new w1(p0, v5.b())).subscribeOn(d.c);
    }
    public static t z(long p0){
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, localAlbumUt, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new g1(p0)).subscribeOn(d.c);
    }
}
