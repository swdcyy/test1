package com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import n90.d;
import n90.g;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.gifshow.kuaishan.ui.album.c;
import com.kuaishou.gifshow.kuaishan.ui.album.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u80.d;
import java.util.ArrayList;
import java.lang.String;
import n3d.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.System;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.util.List;
import java.lang.Throwable;
import e17.i;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameVisibleTime;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameExtraRequirement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import ekd.q;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.models.EmptyQMedia;
import n90.k;
import java.lang.Integer;
import android.content.Intent;
import kotlin.jvm.internal.a;
import nsd.r0;
import lnc.a1;
import java.util.Arrays;
import o79.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.content.Context;
import w69.b$a;
import w69.f$a;
import w69.k$a;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import w69.i$a;
import w69.b;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k;
import ga9.c;
import java.util.HashMap;
import nsd.u;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectSelectedItemViewBinder;
import android.os.Bundle;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$Companion;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder$a;
import w69.d$a;
import w69.d;
import e16.a$a;
import w69.i;
import e16.a;
import x79.d;
import w46.b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import n90.a;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.DialogFragment;
import n90.b;
import android.view.View$OnClickListener;
import lnc.g7;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Activity;
import ekd.j0;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import lq.i;
import lnc.r5;
import x80.g;
import com.kuaishou.gifshow.kuaishan.ui.album.a;
import n90.f;
import java.lang.Runnable;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import java.util.Objects;
import t90.i;
import androidx.lifecycle.LiveData;
import n90.j;
import ekd.k1;
import androidx.fragment.app.Fragment;

public final class KSPostAlbumProcessActivity extends AlbumGifshowActivity	// class@001ab0
{
    public boolean O;
    public boolean P;
    public long Q;
    public ProgressFragment R;
    public o1 S;
    public g T;
    public Runnable U;
    public final g V;
    public final Observer W;
    public final Observer X;
    public static long Y;
    public static final int Z;

    public void KSPostAlbumProcessActivity(){
       super();
       this.U = new d(this);
       this.V = new g(this);
       this.W = new c(this);
       this.X = new b(this);
    }
    public static boolean C3(GifshowActivity p0,d p1,ArrayList p2,byte[] p3,boolean p4,boolean p5,boolean p6,String p7,a p8){
       Object[] objArray;
       KSTemplateDetailInfo obj;
       long[] olongArray;
       long[] olongArray1;
       EmptyQMedia uEmptyQMedia1;
       Intent intent;
       int i7;
       int i8;
       String str4;
       String str5;
       int[] a;
       int i10;
       LinkedHashMap linkedHashMa3;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       int i = p4;
       object oobject4 = p7;
       object oobject5 = p8;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSPostAlbumProcessActivity kSPostAlbumP = KSPostAlbumProcessActivity.class;
       int i1 = 5;
       int i2 = 3;
       int i3 = 4;
       int i4 = 2;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(kSPostAlbumP)) {
          objArray = new Object[9];
          objArray[i6] = oobject;
          objArray[i5] = oobject1;
          objArray[i4] = oobject2;
          objArray[i2] = oobject3;
          objArray[i3] = Boolean.valueOf(p4);
          objArray[i1] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject4;
          objArray[8] = oobject5;
          obj = PatchProxy.apply(objArray, null, kSPostAlbumP, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if ((System.currentTimeMillis() - KSPostAlbumProcessActivity.Y) - 2000 < 0) {
          e.w("Launch album too frequently, 防暴击，不是问题");
          return i6;
       }else {
          KSPostAlbumProcessActivity.Y = System.currentTimeMillis();
          obj = p1.k0();
          Object[] objArray1 = new Object[i6];
          e.D().w("KSPostAlbumProcessActivity", "launch: templateId="+obj.mTemplateId, objArray1);
          KSBaseInfo mFrameVisibl = obj.mFrameVisibleTimeList;
          KSBaseInfo mFrameExtraR = obj.mFrameExtraRequirementList;
          String str = "mFrameVisibleTimeList与mFrameExtraRequirementList长度不等，无法正常初始化模板";
          i6 = 0x7f11066a;
          if (!obj.isShimmer() && (!oobject1.H0() && (mFrameVisibl != null && (mFrameExtraR == null || mFrameVisibl.size() != mFrameExtraR.size())))) {
             e.v(null, str);
             i.a(i6, R.string.arg_RES_7f101be3);
             return false;
          }else {
             Throwable throwable = null;
             i3 = 0x7f101be3;
             boolean b = false;
             if (!oobject1 instanceof o1) {
                e.v(throwable, "ksProject不是KuaiShanProject实例");
                i.a(R.style.arg_RES_7f11066a, i3);
                return b;
             }else {
                m1.w0().y0(oobject1);
                if (oobject1.H0() || mFrameVisibl == null) {
                   olongArray = oobject1.x0(true);
                   olongArray1 = oobject1.x0(false);
                }else {
                   float f = 1000.00f;
                   if (obj.isShimmer() && mFrameExtraR == null) {
                      olongArray = new long[mFrameVisibl.size()];
                      olongArray1 = new long[mFrameVisibl.size()];
                      for (i2 = 0; i2 < mFrameVisibl.size(); i2 = i2 + 1) {
                         float f1 = mFrameVisibl.get(i2).getRealFrameDuration() * f;
                         olongArray[i2] = (long)f1;
                         f1 = mFrameVisibl.get(i2).mDuration * f;
                         olongArray1[i2] = (long)f1;
                      }
                   }else if(mFrameExtraR.size() != mFrameVisibl.size()){
                      e.v(null, str);
                      i.a(R.style.arg_RES_7f11066a, 0x7f101be3);
                      return false;
                   }else {
                      LinkedHashMap linkedHashMa = new LinkedHashMap();
                      LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                      i3 = 0;
                      while (i3 < mFrameVisibl.size()) {
                         KSFeedTemplateDetailInfo$FrameExtraRequirement mGroupId = mFrameExtraR.get(i3).mGroupId;
                         if (TextUtils.n(mGroupId, "-1")) {
                            mGroupId = String.valueOf(Math.random());
                         }
                         Long longx = linkedHashMa.get(mGroupId);
                         KSBaseInfo kSBaseInfo = mFrameExtraR;
                         float f2 = mFrameVisibl.get(i3).getRealFrameDuration() * 1000.00f;
                         long l1 = (long)f2;
                         if (longx == null || longx.longValue() - l1 < 0) {
                            linkedHashMa.put(mGroupId, Long.valueOf(l1));
                         }
                         Long longx1 = linkedHashMa1.get(mGroupId);
                         float f3 = mFrameVisibl.get(i3).mDuration * 1000.00f;
                         LinkedHashMap linkedHashMa2 = linkedHashMa1;
                         long l2 = (long)f3;
                         if (longx1 == null || longx1.longValue() - l2 < 0) {
                            linkedHashMa3 = linkedHashMa2;
                            linkedHashMa3.put(mGroupId, Long.valueOf(l2));
                         }else {
                            linkedHashMa3 = linkedHashMa2;
                         }
                         i3 = i3 + 1;
                         linkedHashMa1 = linkedHashMa3;
                         mFrameExtraR = kSBaseInfo;
                         int i11 = p8;
                      }
                      linkedHashMa3 = linkedHashMa1;
                      long[] olongArray3 = new long[linkedHashMa.size()];
                      olongArray1 = new long[linkedHashMa3.size()];
                      Iterator iterator = linkedHashMa.entrySet().iterator();
                      i5 = 0;
                      while (iterator.hasNext()) {
                         olongArray3[i5] = iterator.next().getValue().longValue();
                         i5 = i5 + 1;
                      }
                      Iterator iterator1 = linkedHashMa3.entrySet().iterator();
                      i10 = 0;
                      while (iterator1.hasNext()) {
                         olongArray1[i10] = iterator1.next().getValue().longValue();
                         i10 = i10 + 1;
                      }
                      olongArray = olongArray3;
                   }
                }
                if (!q.f(p2) && p2.size() != olongArray.length) {
                   e.v(new IllegalArgumentException(), "批量替换，selectedMedias size="+p2.size()+", frameMediaTimeArray length="+olongArray1.length);
                   return false;
                }else {
                   ArrayList uArrayList = new ArrayList();
                   if (i && !q.f(p2)) {
                      EmptyQMedia uEmptyQMedia = 1;
                      i5 = 0;
                      while (i5 < p2.size()) {
                         QMedia qMedia = oobject2.get(i5);
                         if (qMedia != null && b.S(new File(qMedia.path))) {
                            uArrayList.add(qMedia);
                         }else {
                            uArrayList.add(new EmptyQMedia(olongArray[i5]));
                            uEmptyQMedia = null;
                         }
                         i5 = i5 + 1;
                      }
                      uEmptyQMedia1 = uEmptyQMedia;
                   }else {
                      uEmptyQMedia1 = true;
                   }
                   int len = olongArray.length;
                   String str1 = "3";
                   if (PatchProxy.isSupport2(k.class, str1)) {
                      Object[] objArray2 = new Object[]{oobject,oobject1,olongArray,olongArray1,uArrayList,Integer.valueOf(len),Boolean.FALSE};
                      intent = PatchProxy.apply(objArray2, null, k.class, str1);
                      if (intent != patchProxyRe) {
                      label_04ee :
                         intent.putExtra("key_is_update", p4);
                         intent.putExtra("key_need_segment_clip", p5);
                         intent.putExtra("key_all_media_file_exist", uEmptyQMedia1);
                         intent.putExtra("INTENT_KEY_ALBUM_TASK_IMPL", p7);
                         byte[] uobyteArray = p3;
                         if (uobyteArray) {
                            intent.putExtra("current_video_context", uobyteArray);
                         }
                         if (p6) {
                            intent.putExtra("album_enter_anim", R.anim.arg_RES_7f0100d4);
                         }
                         oobject.t1(intent, 100, p8);
                         return true;
                      }
                   }
                   a.p(oobject, "activity");
                   a.p(oobject1, "project");
                   if (olongArray1 == null) {
                      olongArray1 = oobject1.x0(false);
                   }
                   ArrayList uArrayList1 = new ArrayList();
                   if (uArrayList.isEmpty() ^ 1) {
                      uArrayList1.addAll(uArrayList);
                   }
                   if (len > uArrayList1.size()) {
                      for (i7 = uArrayList1.size(); i7 < len; i7 = i7 + 1) {
                         uArrayList1.add(new EmptyQMedia(olongArray1[i7]));
                      }
                   }
                   String str2 = "java.lang.String.format\(format, *args\)";
                   String str3 = "CommonUtil.string\(strRes\)";
                   if (oobject1.K0()) {
                      i7 = olongArray.length;
                      i8 = 0;
                      i4 = 0;
                      while (i4 < i7) {
                         int i9 = i7;
                         long l = olongArray[i4];
                         long[] olongArray2 = olongArray;
                         str4 = str1;
                         if ((long)i8 - l < 0) {
                            i8 = (int)l;
                         }
                         i4 = i4 + 1;
                         str1 = str4;
                         i7 = i9;
                         olongArray = olongArray2;
                      }
                      str4 = str1;
                      i = (oobject1.L0())? 0x7f101b9d: 0x7f101bee;
                      str5 = a1.p(i);
                      a.o(str5, str3);
                      i7 = 1;
                      objArray = new Object[i7];
                      objArray[0] = Integer.valueOf(len);
                      str5 = String.format(str5, Arrays.copyOf(objArray, i7));
                      a.o(str5, str2);
                   }else {
                      str4 = str1;
                      i8 = (oobject1.L0())? 0x7f101b9c: 0x7f101ba1;
                      String str7 = a1.p(i8);
                      a.o(str7, str3);
                      Object[] objArray3 = new Object[]{Integer.valueOf(len)};
                      str5 = String.format(str7, Arrays.copyOf(objArray3, 1));
                      a.o(str5, str2);
                      i8 = 0;
                   }
                   a = (oobject1.K0())? a.a: a.c;
                   if (PostExperimentUtils.g()) {
                      a.o(a, "albumTabs");
                      List list = ArraysKt___ArraysKt.Cy(a);
                      list.add(Integer.valueOf(4));
                      a = CollectionsKt___CollectionsKt.F5(list);
                   }
                   i10 = (oobject1.K0())? 2: 1;
                   intent = new Intent(oobject, kSPostAlbumP);
                   b$a uoa = new b$a();
                   uoa.c(true);
                   f$a uoa1 = new f$a();
                   uoa1.g(a);
                   uoa1.c(i10);
                   uoa1.i(m1.w0().f);
                   uoa1.d(true);
                   uoa1.j = false;
                   if (uArrayList1.isEmpty() ^ true) {
                      uoa1.f(uArrayList1);
                   }
                   k$a uoa2 = new k$a();
                   uoa2.h(true);
                   uoa2.l(true);
                   uoa2.n(false);
                   uoa2.f(a1.p(R.string.arg_RES_7f101bae));
                   uoa2.k(str5);
                   uoa2.q(true);
                   k$a uoa3 = uoa2.r(false);
                   AlbumLimitOption$Builder uBuilder = o.a().a("post_ks_import_album");
                   uBuilder.g(len);
                   uBuilder.p(false);
                   String str6 = a1.p(R.string.arg_RES_7f101bc1);
                   a.o(str6, "CommonUtil.string\(R.stri…an_min_duration_required\)");
                   AlbumLimitOption$Builder uBuilder1 = uBuilder.l(str6);
                   if (i8 > 0) {
                      uBuilder1.k(i8);
                      i8 = true;
                      uBuilder1.f(i8);
                   }else {
                      i$a uoa5 = 1;
                   }
                   if (oobject1.K0()) {
                      uBuilder1.n(2);
                   }else {
                      uBuilder1.n(i8);
                   }
                   i$a uoa4 = new i$a().a(uoa.a()).d(uoa1.a()).f(uBuilder1.d()).m(uoa3.b());
                   c uoc = new c(null, null, false, 7, null);
                   Bundle uBundle = new Bundle();
                   uBundle.putLongArray(MultiSelectSelectedItemViewBinder.l.a(), olongArray1);
                   uBundle.putBoolean(KSMultiSelectAlbumAssetItemViewBinder.w.a(), oobject1.J0());
                   uoa4.n(i8.e(AbsPreviewFragmentViewBinder.class, KSMultiSelectPreviewFragmentViewBinder.class).e(AbsAlbumAssetItemViewBinder.class, KSMultiSelectAlbumAssetItemViewBinder.class).e(AbsSelectedItemViewBinder.class, KSMultiSelectSelectedItemViewBinder.class)).c(new d$a().b(uBundle).c());
                   d.a(intent, new a$a().h(true).g(uoa4.b()).f());
                   intent.putExtra("ALBUM_STICKY_SELECT_BAR", true);
                   PatchProxy.onMethodExit(k.class, str4);
                   goto label_04ee ;
                }
             }
          }
       }
    }
    public final void A3(KSTemplateDetailInfo p0,boolean p1){
       KSPostAlbumProcessActivity kSPostAlbumP = KSPostAlbumProcessActivity.class;
       if (PatchProxy.isSupport(kSPostAlbumP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, kSPostAlbumP, "5")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          e.D().t("KSPostAlbumProcessActivity", "downloadTemplateSilently: templateInfo is null", objArray);
          return;
       }else {
          this.D3();
          this.V.e(p0, p1, i);
          return;
       }
    }
    public final KSTemplateDetailInfo B3(){
       KSPostAlbumProcessActivity obj = PatchProxy.apply(null, this, KSPostAlbumProcessActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       if (obj == null) {
          return null;
       }
       return obj.k0();
    }
    public final void D3(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "3")) {
          return;
       }
       this.V.i(this.W);
       this.V.h(this.X);
       return;
    }
    public final void E3(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "14")) {
          return;
       }
       int i = 0;
       if (this.R != null) {
          Object[] objArray = new Object[i];
          e.D().t("KSPostAlbumProcessActivity", "showProgressFragment: mProgressFragment is not null", objArray);
          this.z3();
       }
       ProgressFragment progressFrag = new ProgressFragment();
       this.R = progressFrag;
       progressFrag.Fh(i, 100, true);
       this.R.oh(new a(this));
       this.R.setCancelable(i);
       this.R.zh(i);
       this.R.xh(new b(this));
       KSPostAlbumProcessActivity tS = this.S;
       if (tS != null && tS.H0()) {
          i = 1;
       }
       KSPostAlbumProcessActivity tR = this.R;
       int i1 = (g7.b(this.B3()) && !i)? 0x7f100b7e: 0x7f100b82;
       tR.Ih(i1);
       this.R.vh(R.string.cancel);
       this.R.show(this.getSupportFragmentManager(), "KSPostAlbumProcessActivity");
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "6")) {
          return;
       }
       super.finish();
       if (!j0.a(this.getIntent(), "key_is_update", false)) {
          FetchFrameManager.i().b();
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KSPostAlbumProcessActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KSPostAlbumProcessActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KSPostAlbumProcessActivity.class, "10")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p1 == -1 && (!i.h() || i.m().D())) {
          this.setResult(-1, p2);
          this.finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPostAlbumProcessActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.D3();
       g og = r5.b().d(TextUtils.k(j0.f(this.getIntent(), "INTENT_KEY_ALBUM_TASK_IMPL")));
       this.T = og;
       this.V.c = og;
       boolean b = true;
       boolean b1 = j0.a(this.getIntent(), "key_all_media_file_exist", b);
       o1 oo1 = m1.w0().v0();
       this.S = oo1;
       if (oo1 == null) {
          Object[] objArray = new Object[0];
          e.D().t("KSPostAlbumProcessActivity", "onCreate: project is null ", objArray);
          this.setResult(0);
          this.finish();
          return;
       }else {
          this.V.g = this.getIntent().getByteArrayExtra("current_video_context");
          if (!e.q(this.S.k0()) && (this.S.c0() && e.A())) {
             e.E(this, a.b, new f(this));
          }
       label_008d :
          if (!this.S.H0() || ("0").equals(this.S.getTemplateId())) {
             this.A3(this.S.k0(), b);
          }
          if (!b1) {
             t$a uoa = new t$a(this);
             uoa.W0(R.string.arg_RES_7f10404e);
             uoa.S0(R.string.arg_RES_7f104050);
             f.e(uoa).Y(PopupInterface.a);
          }
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPostAlbumProcessActivity.class, "12")) {
          return;
       }
       super.onDestroy();
       this.z3();
       this.V.a();
       this.Q = 0;
       this.S = objArray;
       this.T = objArray;
       objArray = new Object[0];
       e.D().s("KSPostAlbumProcessActivity", "onDestroy: ", objArray);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "8")) {
          return;
       }
       super.onPause();
       this.O = false;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "7")) {
          return;
       }
       super.onResume();
       this.O = true;
       if (this.S != null) {
          m1.w0().y0(this.S);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "9")) {
          return;
       }
       super.onStop();
       if (!j0.a(this.getIntent(), "key_is_update", false)) {
          FetchFrameManager.i().b();
       }
       return;
    }
    public boolean w3(List p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, KSPostAlbumProcessActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.S == null) {
          obj = new Object[i];
          e.D().t("KSPostAlbumProcessActivity", "handleSelectedResult: project is null ", obj);
          this.setResult(i);
          this.finish();
          return true;
       }else {
          this.Q = System.currentTimeMillis();
          this.D3();
          KSPostAlbumProcessActivity tV = this.V;
          KSTemplateDetailInfo kSTemplateDe = this.S.k0();
          String str = j0.f(this.getIntent(), "intent_ref_id");
          boolean b = j0.a(this.getIntent(), "key_is_update", i);
          Objects.requireNonNull(tV);
          if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidFourRefs(kSTemplateDe, p0, str, Boolean.valueOf(b), tV, g.class, "6")) {
             a.p(kSTemplateDe, "templateInfo");
             a.p(p0, "mediaList");
             e.w("Selected media list size: "+p0.size()+" and refId: "+str);
             long l = System.currentTimeMillis();
             m1 om1 = m1.w0();
             String str1 = "KuaiShanManager.getInstance\(\)";
             a.o(om1, str1);
             o1 oo1 = om1.v0();
             KSTemplateDetailInfo kSTemplateDe1 = (oo1 != null)? oo1.k0(): null;
             boolean b1 = g7.b(kSTemplateDe1);
             m1 om11 = m1.w0();
             a.o(om11, str1);
             o1 oo11 = om11.v0();
             if (oo11 == null || (oo11.H0() == true || !b1)) {
                if (b1) {
                   i.a((System.currentTimeMillis() - l));
                }
                tV.d(p0, str, b);
             }else {
                tV.e(kSTemplateDe, i, i);
                g h = tV.h;
                if (h != null) {
                   tV.a.removeObserver(h);
                }
                j oj = new j(tV, l, p0, str, b);
                tV.h = h;
                tV.a.observe(tV.i, h);
             }
          }
          k1.r(this.U, 200);
          return true;
       }
    }
    public final void z3(){
       if (PatchProxy.applyVoid(null, this, KSPostAlbumProcessActivity.class, "15")) {
          return;
       }
       k1.m(this.U);
       KSPostAlbumProcessActivity tR = this.R;
       if (tR != null && tR.isAdded()) {
          Object[] objArray = new Object[0];
          e.D().s("KSPostAlbumProcessActivity", "dismissProgressFragment\(\)", objArray);
          this.R.dismiss();
          this.R = null;
       }
       return;
    }
}
