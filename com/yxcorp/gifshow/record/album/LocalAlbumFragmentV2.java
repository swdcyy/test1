package com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import java.lang.String;
import java.util.HashMap;
import hn6.a$a;
import android.util.Pair;
import java.lang.Object;
import java.util.Objects;
import java.lang.Float;
import java.io.File;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.music.Music;
import android.net.Uri;
import com.kuaishou.android.model.music.MusicType;
import tkd.b;
import tkd.d;
import hn6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hn6.a;
import com.kuaishou.android.model.mix.SameFrameInfo;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import hn6.c;
import k8c.a;
import q87.c;
import java.lang.StringBuilder;
import android.view.View;
import e17.i;
import crd.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import lnc.a1;
import java.lang.CharSequence;
import p8c.v;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import brd.t;
import k8c.g2;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import k8c.y;
import erd.a;
import k8c.d0;
import com.yxcorp.gifshow.record.album.j;
import com.yxcorp.gifshow.record.album.r;
import erd.g;
import m8c.e;
import java.lang.Boolean;
import r16.e;
import r16.f;
import lnc.d7;
import k8c.b0;
import k8c.e0;
import com.yxcorp.gifshow.record.album.k;
import k8c.p;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.record.album.e;
import com.yxcorp.gifshow.record.album.q;
import com.yxcorp.gifshow.record.album.model.c;
import com.yxcorp.gifshow.publish.ShareProject;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.encode.s0;
import qkd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import pca.w0;
import erd.o;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import java.lang.IllegalArgumentException;
import ooc.j;
import java.lang.System;
import ok.n;
import com.kuaishou.edit.draft.Workspace$Type;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.f;
import k8c.a0;
import k8c.f0;
import k8c.w;
import com.yxcorp.gifshow.record.album.u;
import k8c.x;
import java.lang.Integer;
import k8c.z;
import java.lang.Runnable;
import ekd.k1;
import crd.a;
import jcc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a17.c$a;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.util.List;
import java.util.Collections;
import com.yxcorp.gifshow.record.album.l;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import lq.i;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo;
import elb.w;
import k8c.r;
import com.yxcorp.gifshow.record.album.s;
import androidx.fragment.app.DialogFragment;
import k8c.j;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Long;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.album.LocalAlbumParams$b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.record.album.d;
import com.yxcorp.gifshow.record.album.o;
import com.yxcorp.gifshow.record.album.i;
import com.yxcorp.gifshow.record.album.p;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.content.res.Resources;
import java.util.Set;
import android.content.Context;
import zf6.j;
import brd.a0;
import k8c.u;
import com.yxcorp.gifshow.record.album.m;

public class LocalAlbumFragmentV2 extends LocalAlbumFragment	// class@0016fc
{
    public ProgressFragment B;
    public b C;
    public b D;
    public b E;
    public Map F;
    public Map G;
    public boolean H;
    public static String[] I;

    static {
       String[] stringArray = new String[]{"android.permission.READ_EXTERNAL_STORAGE","android.permission.WRITE_EXTERNAL_STORAGE"};
       LocalAlbumFragmentV2.I = stringArray;
    }
    public void LocalAlbumFragmentV2(){
       super();
       this.F = new HashMap();
       this.G = new HashMap();
       this.H = false;
    }
    public static void ph(LocalAlbumFragmentV2 p0){
       p0.zh();
    }
    public static void qh(LocalAlbumFragmentV2 p0,a$a p1,Pair p2){
       Objects.requireNonNull(p0);
       if (p2.first == null) {
          p0.Dh((int)(p2.second.floatValue() * 100.00f));
       }else {
          p0.zh();
          b uob = null;
          p0.C = uob;
          p1.i = p2.first;
          if (p0.getActivity() != null) {
             if (p1.m == null) {
                Music music = new Music();
                String absolutePath = p2.first.getAbsolutePath();
                music.mPath = absolutePath;
                music.mUrl = Uri.parse(absolutePath).toString();
                music.mName = "ÎÒµÄÔ­Éù";
                music.mType = MusicType.LOCAL;
                p1.f(music);
             }
             b uob1 = d.a(-1924371373);
             FragmentActivity activity = p0.getActivity();
             a uoa = PatchProxy.apply(uob, p1, a$a.class, "1");
             if (uoa != PatchProxyResult.class) {
             }else if(p1.h == null){
                SameFrameInfo sameFrameInf = new SameFrameInfo();
                p1.h = sameFrameInf;
                sameFrameInf.mAllowSameFrame = true;
                sameFrameInf.mAvailableDepth = 10;
                sameFrameInf.mCurrentDepth = 0;
                sameFrameInf.mUserName = "";
                sameFrameInf.mOriginPhotoId = "";
                sameFrameInf.mShowSameFrameCurrentTag = true;
                sameFrameInf.mLrcUrls = new ArrayList();
             }
             uoa = new a(p1);
             p0.startActivity(uob1.ay(activity, uoa));
          }else {
             Object[] objArray1 = new Object[0];
             a.D().w("ks://LocalAlbumFragmentV2", "getActivity\(\) is null", objArray1);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onLaunchSameFrameActivity end pair:"+p2, objArray);
       return;
    }
    public static void rh(LocalAlbumFragmentV2 p0,View p1){
       p0.zh();
       i.a(R.style.arg_RES_7f11066a, 0x7f1004c5);
       LocalAlbumFragmentV2 c = p0.C;
       if (c != null) {
          c.dispose();
          p0.C = null;
       }
       return;
    }
    public static void sh(LocalAlbumFragmentV2 p0,Throwable p1){
       Objects.requireNonNull(p0);
       PostUtils.D("ks://LocalAlbumFragmentV2", "prepare output file error", p1);
       if (PostWorkErrorTips.a(p1)) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1043cd));
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f100dd5);
       }
       p0.zh();
       p0.C = null;
       return;
    }
    public static void th(LocalAlbumFragmentV2 p0,Throwable p1){
       Objects.requireNonNull(p0);
       PostUtils.D("ks://LocalAlbumFragmentV2", "save album", p1);
       p0.zh();
       p0.C = null;
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100dd5));
       v.c(8);
    }
    public static void uh(LocalAlbumFragmentV2 p0,Throwable p1){
       p0.zh();
       p0.C = null;
       int i = 0x7f11066a;
       if (PostWorkErrorTips.a(p1)) {
          i.d(i, a1.p(R.string.arg_RES_7f1043cd));
       }else {
          i.a(i, R.string.arg_RES_7f103b10);
       }
       PostUtils.D("ks://LocalAlbumFragmentV2", "onShareProject", p1);
       return;
    }
    public static void vh(LocalAlbumFragmentV2 p0,Throwable p1){
       p0.zh();
       p0.C = null;
       int i = 0x7f11066a;
       if (PostWorkErrorTips.a(p1)) {
          i.d(i, a1.p(R.string.arg_RES_7f1043cd));
       }else {
          i.a(i, R.string.arg_RES_7f103b10);
       }
       PostUtils.D("ks://LocalAlbumFragmentV2", "onLaunchSameFrameActivity", p1);
       return;
    }
    public static void wh(LocalAlbumFragmentV2 p0,AtomicReference p1,Pair p2){
       Objects.requireNonNull(p0);
       if (p2.first == null) {
          p0.Dh((int)(p2.second.floatValue() * 100.00f));
       }else {
          AtomicReference uAtomicRefer = new AtomicReference();
          Pair first = p2.first;
          t ot = PatchProxy.applyOneRefs(first, null, LocalAlbumUtils.class, "26");
          if (ot != PatchProxyResult.class) {
          }else {
             Object[] objArray1 = new Object[0];
             a.D().w("LocalAlbumUtils", "checkFileAndShare currentFile:"+first, objArray1);
             ot = t.fromCallable(new g2(first)).subscribeOn(d.c).observeOn(d.a);
          }
          p1.set(ot.doOnTerminate(new y(p0)).doOnDispose(new d0(uAtomicRefer)).subscribe(new j(p0, uAtomicRefer), r.b));
          p0.zh();
          p0.C = null;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onShareProject pair:"+p2, objArray);
       return;
    }
    public static void xh(LocalAlbumFragmentV2 p0,File p1){
       p0.Dh(100);
       p0.zh();
       p0.C = null;
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100aa9));
       v.c(7);
    }
    public static void yh(LocalAlbumFragmentV2 p0,e p1,Boolean p2){
       Objects.requireNonNull(p0);
       if (p2.booleanValue()) {
          p0.Ef(p1);
       }else if(PatchProxy.applyVoidOneRefs(p1, p0, LocalAlbumFragmentV2.class, "28")){
          p0.Eh();
          int i = 0x7f11066a;
          if (d.a(0x6758ee6d).n2()) {
             i.a(i, R.string.arg_RES_7f100a5c);
             p0.zh();
          }else if(d7.l()){
             i.a(i, R.string.arg_RES_7f101691);
             p0.zh();
          }else {
             AtomicReference uAtomicRefer = new AtomicReference();
             k ok = new k(p0, uAtomicRefer, p1, new b0(p0), new y(p0));
             p0.C = LocalAlbumUtils.r(p1).doOnDispose(new e0(uAtomicRefer)).subscribe(i, new p(p0));
             Object[] objArray = new Object[0];
             a.D().w("ks://LocalAlbumFragmentV2", "onPublishProject", objArray);
          }
       }
       return;
    }
    private void zh(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragmentV2.class, "8")) {
          return;
       }
       if (this.B != null) {
          Object[] objArray = new Object[0];
          a.D().w("ks://LocalAlbumFragmentV2", "dismissProgressFragment\(\)", objArray);
          this.B.dismiss();
          this.B = null;
       }
       return;
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragmentV2.class, "6")) {
          return;
       }
       LocalAlbumFragmentV2 tE = this.E;
       if (tE != null && !tE.isDisposed()) {
          this.E.dispose();
       }
       return;
    }
    public String Bh(){
       return null;
    }
    public void C6(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onShareProject :"+p0, objArray);
       this.Ah();
       this.E = LocalAlbumUtils.q(p0).observeOn(d.a).subscribe(new e(this, p0), q.b);
       return;
    }
    public final t Ch(e p0,boolean p1){
       t obj;
       Object[] objArray;
       t ot1;
       boolean b;
       Workspace$Type type;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, LocalAlbumFragmentV2.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }else {
          v2 = p0 instanceof c;
          String str = "ks://LocalAlbumFragmentV2";
          int i = 0;
          if (v2) {
             ShareProject shareProject = p0.k();
             if (shareProject != null && (TextUtils.x(shareProject.f()) || !new File(shareProject.f()).exists())) {
                objArray = new Object[i];
                a.D().w(str, "Playable file of legacy project not found.", objArray);
                return obj;
             }else {
                String str1 = shareProject.f();
                s0 os0 = s0.class;
                t ot = PatchProxy.applyOneRefs(str1, obj, os0, "16");
                if (ot != patchProxyRe) {
                }else {
                   File uFile = new File(str1);
                   if (b.N(uFile)) {
                      File uFile1 = b.X(PostUtils.g("[>|60|>]"), ".mp4");
                      if (PatchProxy.isSupport(os0)) {
                         ot1 = PatchProxy.applyFourRefs(uFile, uFile1, null, Boolean.FALSE, null, s0.class, "27");
                         if (ot1 != patchProxyRe) {
                         label_008d :
                            ot = ot1.map(new w0(uFile));
                         }
                      }
                      ot1 = s0.i(uFile, uFile1, obj, i, obj);
                      goto label_008d ;
                   }else {
                      ot = t.just(new Pair(uFile, Float.valueOf(0x3f800000)));
                   }
                }
                return ot;
             }
          }else {
             b = p0 instanceof d;
             if (!b) {
                objArray = new Object[i];
                a.D().w(str, "Unknown LocalAlbumProject type.", objArray);
                return obj;
             }else {
                Object[] objArray1 = new Object[i];
                a.D().s("LocalAlbumFragmentV2", "Build video.", objArray1);
                d uod = p0;
                c uoc = uod.k();
                Object[] objArray2 = new Object[i];
                a.D().w(str, "prepareOutputFile project:"+p0.hashCode()+" draft: "+uoc.D0(), objArray2);
                if (uoc.o0() == null) {
                   PostUtils.D(str, "LocalAlbumFragmentV2 daft getAssetDraft is null", new IllegalArgumentException());
                }
                LocalAlbumUtils.i(uoc);
                j.a(uoc);
                long l = System.currentTimeMillis();
                Object obj1 = PatchProxy.applyOneRefs(p0, this, LocalAlbumFragmentV2.class, "14");
                if (obj1 != patchProxyRe) {
                   i = obj1.booleanValue();
                }else if(v2){
                   n.c(b, "Unknown project type");
                   type = PatchProxy.applyOneRefs(uod, this, LocalAlbumFragmentV2.class, "15");
                   if (type != patchProxyRe) {
                   }else {
                      n.j(uod);
                      Workspace workspace = uod.k().v();
                      type = (workspace == null)? Workspace$Type.UNKNOWN: workspace.getType();
                   }
                   i = f.E(type);
                }
                if (!i) {
                   return t.fromCallable(new a0(this, p0)).subscribeOn(d.c).observeOn(d.a).doOnNext(new f0(l)).flatMap(new w(uoc, p1));
                }else {
                   return t.fromCallable(u.b).subscribeOn(d.c).observeOn(d.a).flatMap(new x(uoc, p1));
                }
             }
          }
       }
    }
    public final void Dh(int p0){
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumFragmentV2.class, "7")) {
          return;
       }
       k1.o(new z(this, p0));
       return;
    }
    public void Ef(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onDeleteDeprecatedSparkProject :"+p0, objArray);
       this.Fh(p0, R.string.arg_RES_7f104a50);
       return;
    }
    public final void Eh(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragmentV2.class, "27")) {
          return;
       }
       if (this.B == null) {
          this.Gh(null, 0, "progress", 0);
       }
       return;
    }
    public void F7(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumFragmentV2.class, "21")) {
          return;
       }
       d.a(-1287741867).bi(p0.k(), this.getActivity(), true, p1, "draft_detail", null);
       return;
    }
    public final void Fh(e p0,int p1){
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LocalAlbumFragmentV2.class, "29")) {
          return;
       }
       c$a uoa = new c$a(this.getActivity());
       uoa.l0(p1);
       uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f104281), SheetItemStatus.Primary)));
       uoa.g0(R.string.cancel);
       uoa.i0(new l(this, p0));
       f.a(uoa).Y(PopupInterface.a);
       return;
    }
    public void G7(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onPublishProject\(\)", objArray);
       this.Ah();
       if (!i.h()) {
          i.V();
       }
       if (this.ih() != null) {
          d7.a.q(this.ih().toPostBenefitGuideData());
       }
       this.E = LocalAlbumUtils.q(p0).observeOn(d.a).subscribe(new r(this, p0), s.b);
       return;
    }
    public final void Gh(String p0,int p1,String p2,boolean p3){
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, LocalAlbumFragmentV2.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "showProgressFragment\(\) title="+p0, objArray);
       ProgressFragment progressFrag = new ProgressFragment();
       this.B = progressFrag;
       if (p1 > 0) {
          progressFrag.Fh(0, p1, true);
       }else {
          progressFrag.Fh(0, 0, 0);
       }
       this.B.Jh(p0);
       this.B.setCancelable(0);
       if (p3) {
          this.B.vh(R.string.cancel);
          this.B.xh(new j(this));
       }
       this.B.show(this.getFragmentManager(), p2);
       return;
    }
    public final void Hh(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumFragmentV2.class, "11")) {
          return;
       }
       this.Gh(p0, 100, p1, true);
       return;
    }
    public void Z4(boolean p0,long p1){
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, LocalAlbumFragmentV2.class, "5")) {
          return;
       }
       super.Z4(p0, p1);
       this.F.clear();
       this.G.clear();
       return;
    }
    public Bundle eh(){
       Bundle obj = PatchProxy.apply(null, this, LocalAlbumFragmentV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.eh();
       if (obj == null) {
          obj = new Bundle();
       }
       LocalAlbumParams$b uob = new LocalAlbumParams$b();
       int b = true;
       uob.b(b);
       uob.e = b;
       uob.f = b;
       uob.d(b);
       if (!a.a().c() || !g.W()) {
          b = f.a("enableShootSameVideo");
       }else if(g.W() == 2){
          b = false;
       }
       uob.k = b;
       uob.c(PostExperimentUtils.i());
       b = (!a.a().c() || !g.X())? f.e("enableShootVideo"): g.X() - 1;
       uob.l = b;
       SerializableHook.putSerializable(obj, "key_intent_local_album_params", uob.a());
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumFragmentV2.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LocalAlbumFragmentV2.class, null);
       return objectsByTag;
    }
    public void ic(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumFragmentV2.class, "20")) {
          return;
       }
       d.a(-1287741867).bi(p0.k(), this.getActivity(), true, p1, "draft_detail", null);
       return;
    }
    public void m6(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onDeleteProject :"+p0, objArray);
       this.Fh(p0, R.string.arg_RES_7f103d37);
       return;
    }
    public void mf(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onDownLoadProject :"+p0, objArray);
       this.Ah();
       this.E = LocalAlbumUtils.q(p0).observeOn(d.a).subscribe(new d(this, p0), o.b);
       return;
    }
    public void na(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragmentV2.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "onLaunchSameFrameActivity :"+p0, objArray);
       if (!i.h()) {
          i.V();
       }
       if (this.ih() != null) {
          d7.a.q(this.ih().toPostBenefitGuideData());
       }
       this.Ah();
       this.E = LocalAlbumUtils.q(p0).observeOn(d.a).subscribe(new i(this, p0), p.b);
       return;
    }
    public void oh(int p0){
       if (PatchProxy.isSupport(LocalAlbumFragmentV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumFragmentV2.class, "1")) {
          return;
       }
       int i = 1;
       if (p0 == i) {
          this.o.j(null);
          Object[] objArray = new Object[i];
          objArray[0] = " "+this.r.size()+" ";
          this.o.r(this.getResources().getString(R.string.arg_RES_7f100731, objArray));
       }else if(!p0){
          this.o.j(j.n(this.getActivity(), R.drawable.arg_RES_7f081d80, 0x7f060148));
          this.D = LocalAlbumUtils.x().d0().observeOn(d.a).subscribe(new u(this, this.fh()), m.b);
       }else {
          super.oh(p0);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragmentV2.class, "4")) {
          return;
       }
       super.onDestroyView();
       LocalAlbumFragmentV2 tD = this.D;
       if (tD != null && !tD.isDisposed()) {
          this.D.dispose();
       }
       this.Ah();
       return;
    }
}
