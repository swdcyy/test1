package com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import r26.e;
import ml8.d;
import l8c.b;
import z69.x;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.a1;
import io.reactivex.subjects.PublishSubject;
import k8c.l0;
import com.yxcorp.gifshow.postwork.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import f0c.t;
import m8c.e;
import com.yxcorp.gifshow.fragment.user.l;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k8c.p0;
import u07.u;
import java.util.Objects;
import p8c.v;
import java.lang.Boolean;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.util.ArrayList;
import mz6.b$d;
import com.yxcorp.gifshow.record.album.model.c;
import android.view.View;
import lnc.pb;
import k2b.v1$d;
import wsc.h;
import k2b.v1$f;
import k8c.v0;
import com.kuaishou.edit.draft.Workspace$Type;
import lnc.d9;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.System;
import com.yxcorp.gifshow.publish.ShareProject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.NumberFormatException;
import mz6.b;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import ika.h;
import crd.a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import l8c.a;
import r26.a;
import ika.n;
import ekd.p0;
import e17.i;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kuaishou.android.model.music.Music;
import qm6.b$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.MusicType;
import qm6.b;
import kotlin.jvm.internal.a;
import om6.r;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lq.i;
import k8c.o0;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.record.album.x;
import com.yxcorp.gifshow.record.album.y;
import erd.g;
import crd.b;
import java.lang.Long;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.util.Iterator;
import com.yxcorp.gifshow.fragment.user.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import ekd.q;
import ekd.m1;
import k8c.g0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.content.Intent;
import com.yxcorp.gifshow.record.album.LocalAlbumActivity;
import mm6.a;
import elb.w;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo;
import org.json.JSONObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.d7;
import lq.a;
import k8c.s0;
import lq.f;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragmentAccessor;
import java.util.Map;
import java.util.HashMap;
import r16.e;
import r16.f;
import huc.d;
import q16.a$a;
import r16.a;
import r16.d;
import k8c.i0;
import k8c.u0;
import com.yxcorp.gifshow.record.album.model.b;
import io.reactivex.android.schedulers.a;
import k8c.k0;
import erd.o;
import k8c.r0;
import erd.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.record.album.a0;
import k8c.j0;
import k8c.q0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import faa.a;
import com.yxcorp.gifshow.fragment.user.g;
import android.view.ViewGroup;
import ekd.j0;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.album.LocalAlbumParams$b;
import android.view.LayoutInflater;
import i2b.a;
import com.yxcorp.utility.n;
import java.lang.Math;
import com.kwai.feature.post.api.feature.localalbum.LocalAlbumEntranceParams;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$c;
import z8c.b;
import androidx.recyclerview.widget.RecyclerView$n;
import l26.e;
import l26.f;
import ika.a;
import k8c.m0;
import z1.a;
import androidx.recyclerview.widget.RecyclerView$s;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment$b;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment$c;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewParent;
import lnc.b9;
import java.lang.Runnable;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.record.album.utils.LocalAlbumBubbleItem;
import ra9.c;
import k8c.h2;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.record.album.m0;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import lnc.j8;
import k8c.t0;
import k8c.h0;

public class LocalAlbumListFragment extends BaseFragment implements e, d, b, x, g	// class@001700
{
    public ProgressFragment A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public LocalAlbumBannerInfo F;
    public int G;
    public boolean H;
    public String I;
    public final Runnable J;
    public PublishSubject j;
    public long k;
    public RecyclerView l;
    public TextView m;
    public View n;
    public View o;
    public ExpandableFloatButton p;
    public View q;
    public a r;
    public View s;
    public h t;
    public b u;
    public LocalAlbumParams v;
    public boolean w;
    public b x;
    public boolean y;
    public boolean z;
    public static final int K;

    static {
       LocalAlbumListFragment.K = a1.e(100.00f);
    }
    public void LocalAlbumListFragment(){
       super();
       this.j = PublishSubject.g();
       this.k = -1;
       this.B = 0;
       this.C = 0;
       this.D = false;
       this.E = false;
       this.F = null;
       this.G = 0;
       this.I = "";
       this.J = new l0(this);
    }
    public static a hh(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-273232199).a20();
    }
    public void A2(e p0,l p1){
       String str3;
       boolean b;
       VideoContext videoContext1;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, LocalAlbumListFragment.class, "21")) {
          return;
       }
       if (obj.w == null) {
          if (obj1 instanceof d) {
             c uoc = obj1.k();
             if (LocalAlbumUtils.B(uoc)) {
                LocalAlbumUtils.E(this.getActivity(), uoc, new p0(obj, obj1));
                return;
             }
          }
          LocalAlbumListFragment r = obj.r;
          LocalAlbumListFragment s = obj.s;
          LocalAlbumListFragment h = obj.H;
          Objects.requireNonNull(p1);
          if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(p0, r, s, Boolean.valueOf(h), p1, l.class, "10")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("LocalAlbumHolder", "showMoreOptions, project: "+obj1, objArray);
             if (obj1 != null) {
                String str = obj2.c(obj1);
                int i1 = 68;
                if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str, null, v.class, "10")) {
                   v.g(68, 0, "OPEN_OPERATE_BUTTON", -1, "", str);
                }
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(new b$d(R.string.arg_RES_7f102f70, -1, R.color.arg_RES_7f0607c5));
                String str1 = obj2.c(obj1);
                if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str1, null, v.class, "12")) {
                   v.m(i1, i, "CLICK_TO_PUBLISH", 3, str1);
                }
                if (h == null) {
                   v3 = obj1 instanceof c;
                   String str2 = "4";
                   Workspace$Type type = (!str1 && pb.a("photoDraft", obj1.k(), str2, s))? 1: null;
                   str3 = (!str1 && pb.a("videoDraft", obj1.k(), str2, s))? 1: null;
                   if (type || str3) {
                      int i2 = (str3)? 0x7f104fb5: 0x7f1012ac;
                      uArrayList.add(new b$d(i2));
                      str3 = (str3)? "kuaiying": "yitian";
                      h.a(str3, "draft_detail").show();
                   }
                   uArrayList.add(new b$d(R.string.arg_RES_7f102fec));
                   str3 = obj2.c(obj1);
                   if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str3, null, v.class, "14")) {
                      v.m(i1, i, "DOWNLOAD_PHOTO", 3, str3);
                   }
                   if (p0.b()) {
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      v0 ov0 = v0.class;
                      Object obj3 = PatchProxy.applyOneRefs(obj1, null, ov0, "1");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      }else if(p0.getType() != Workspace$Type.VIDEO && (p0.getType() != Workspace$Type.KUAISHAN && (p0.getType() == Workspace$Type.ALBUM_MOVIE || (p0.getType() != Workspace$Type.LONG_VIDEO || !d9.a())))){
                         VideoContext videoContext = PatchProxy.applyOneRefs(obj1, null, ov0, "2");
                         if (videoContext != patchProxyRe) {
                         }else if(obj1 instanceof d){
                            videoContext1 = obj1.k().d1();
                         }else {
                            videoContext1 = obj1.k().j();
                            Object[] objArray1 = new Object[i];
                            a.D().s("EditCost", "从文件加载VideoContext耗时 "+(System.currentTimeMillis() - System.currentTimeMillis()), objArray1);
                         }
                         videoContext = videoContext1;
                         try{
                            if (videoContext == null || (videoContext.I() <= 0 && (TextUtils.x(videoContext.N()) || Integer.parseInt(videoContext.N()) > 0))) {
                            }
                         }catch(java.lang.NumberFormatException e0){
                            e0.printStackTrace();
                         }
                      }
                   label_0205 :
                      b = false;
                      if (b) {
                         uArrayList.add(new b$d(R.string.arg_RES_7f1047a1));
                         str3 = obj2.c(obj1);
                         if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str3, null, v.class, "16")) {
                            v.m(i1, i, "JOIN_VIDEO_REC", 3, str3);
                         }
                      }
                   }
                label_022f :
                   uArrayList.add(new b$d(R.string.arg_RES_7f1036d5));
                   str3 = obj2.c(obj1);
                   if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str3, null, v.class, "18")) {
                      v.m(i1, i, "SHARE_PHOTO", 3, str3);
                   }
                }
                uArrayList.add(new b$d(R.string.arg_RES_7f104282));
                str3 = obj2.c(obj1);
                if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), str3, null, v.class, "20")) {
                   v.m(i1, i, "DELETE_ALBUM", 3, str3);
                }
                b uob = new b(p1.b());
                b$d[] uodArray = new b$d[uArrayList.size()];
                b$d[] uodArray1 = uArrayList.toArray(uodArray);
                for (; i < uodArray1.length; i = i + 1) {
                   uob.c.add(uodArray1[i]);
                }
                uob.l(new h(obj2, obj1, r));
                uob.q();
             }
          }
       }
    label_02aa :
       return;
    }
    public void C6(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "25")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.C6(p0);
       }
       return;
    }
    public void Ef(e p0){
       a.b(this, p0);
    }
    public void F7(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumListFragment.class, "28")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.F7(p0, p1);
       }
       return;
    }
    public void G7(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "22")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.G7(p0);
       }
       this.D = true;
       return;
    }
    public boolean Pe(){
       return false;
    }
    public void V4(float p0,a p1){
    }
    public void X1(e p0,l p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumListFragment.class, "20")) {
          return;
       }
       if (this.w == null && p1 instanceof n) {
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidOneRefs(p0, p1, n.class, "3")) {
             if (!p0.C(p1.r.getContext())) {
                i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
             }else {
                MagicEmoji$MagicFace magicFace = p1.g(p0);
                Music music = p1.h(p0);
                i = 0;
                b$a uoa = new b$a(i).p(p1.b());
                int i1 = 1;
                if (magicFace != null) {
                   uoa.M(magicFace.mId).o(magicFace.mChildId).L(i1);
                }
                if (music != null) {
                   b$a uoa1 = uoa.S(music.getId());
                   music = music.mType;
                   MusicType mValue = (music != null)? music.mValue: 0;
                   b$a uoa2 = uoa1.W(mValue);
                   if (magicFace == null) {
                      i = true;
                   }
                   Objects.requireNonNull(uoa2);
                   b$a uoa3 = b$a.class;
                   if (PatchProxy.isSupport(uoa3) && PatchProxy.applyOneRefs(Boolean.valueOf(i), uoa2, uoa3, "76") != PatchProxyResult.class) {
                   }else {
                      uoa2.p1 = i;
                   }
                }
                b uob = uoa.G(Boolean.FALSE).f();
                a.o(uob, "CameraPageParam.Builder\(….setLiveOn\(false\).build\(\)");
                d.a(-831446984).Um(p1.b(), uob);
             }
          }
       }
       return;
    }
    public void X2(e p0,int p1){
       Object[] objArray1;
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LocalAlbumListFragment.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("LocalAlbumListFragment", "onItemClick position: "+p1, objArray);
       if (i.h()) {
          objArray1 = new Object[i];
          a.D().w("LocalAlbumListFragment", "onItemClick ignore exist post session ", objArray1);
          return;
       }else if(p0 instanceof d){
          c uoc = p0.k();
          if (LocalAlbumUtils.B(uoc)) {
             LocalAlbumUtils.E(this.getActivity(), uoc, new o0(this, p0));
             return;
          }
       }
       if (this.w != null) {
          objArray1 = new Object[i];
          a.D().w("LocalAlbumListFragment", "can not click item", objArray1);
          return;
       }else {
          PageMonitor.INSTANCE.onInit(VideoEditPreviewV3Fragment.class);
          this.w = true;
          this.r.c(LocalAlbumUtils.q(p0).observeOn(d.a).subscribe(new x(this, p0, p1), y.b));
          this.D = true;
          return;
       }
    }
    public void X4(e p0,boolean p1){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LocalAlbumListFragment.class, "18")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.X4(p0, p1);
       }
       return;
    }
    public void Z4(boolean p0,long p1){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, LocalAlbumListFragment.class, "17")) {
          return;
       }
       this.k = p1;
       if (p0 && this.t.Q0().size() > 0) {
          this.l.scrollToPosition(0);
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.Z4(p0, p1);
       }
       return;
    }
    public void b8(boolean p0){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalAlbumListFragment.class, "16")) {
          return;
       }
       int i = 8;
       if (!p0) {
          this.n.setVisibility(0);
          this.q.setVisibility(i);
          this.m.setText(R.string.arg_RES_7f10398e);
          Drawable drawable = ContextCompat.getDrawable(this.m.getContext(), R.drawable.arg_RES_7f080603);
          Drawable uDrawable = null;
          if (drawable != null) {
             drawable.setBounds(0, 0, a1.e(84.00f), a1.e(84.00f));
             this.m.setCompoundDrawablesWithIntrinsicBounds(uDrawable, drawable, uDrawable, uDrawable);
          }
          if (this.v.isNeedShowPublishButtonWhenEmpty()) {
             this.o.setVisibility(0);
             if (!PatchProxy.applyVoid(uDrawable, uDrawable, v.class, "9")) {
                v.m(68, 0, "INTRODUCE_ALBUM", 6, "");
             }
          }else {
             this.o.setVisibility(i);
          }
       }else {
          this.n.setVisibility(i);
       }
       this.ch();
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.b8(p0);
       }
       return;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "39")) {
          return;
       }
       int i = 1;
       if (this.E == null && (!this.o.isShown() && this.v.getEnableShootVideoTipCount() > 0)) {
          if (this.p.getVisibility()) {
             LocalAlbumListFragment tp = this.p;
             if (tp.u != null) {
                if (this.B <= LocalAlbumListFragment.K) {
                   i = 0;
                }
                i = (i)? 5: 4;
                tp.t(i);
             }else {
                tp.t(0);
             }
          }
       }else {
          this.p.t(i);
       }
       return;
    }
    public void dh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "12")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.t.e1(iterator.next());
       }
       this.t.k0();
       this.b8((q.f(this.t.Q0()) ^ 0x01));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "2")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a01e3);
       this.n = m1.f(p0, 0x7f0a0d0c);
       this.m = m1.f(p0, 0x7f0a16ad);
       this.o = m1.f(p0, 0x7f0a3316);
       this.p = m1.f(p0, 0x7f0a0db4);
       this.q = m1.f(p0, 0x7f0a32db);
       m1.a(p0, new g0(this), R.id.publish_button);
       return;
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "36")) {
          return;
       }
       LocalAlbumListFragment tA = this.A;
       if (tA != null && this.y == null) {
          tA.dismiss();
          this.A = null;
       }
       return;
    }
    public String f8(){
       return a.a(this);
    }
    public final void fh(GifshowActivity p0,Intent p1,long p2,c p3){
       LocalAlbumListFragment f;
       w ow;
       JSONObject jSONObject;
       LocalAlbumListFragment localAlbumLi = this;
       if (PatchProxy.isSupport2(LocalAlbumListFragment.class, "34") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, Long.valueOf(p2), p3, this, LocalAlbumListFragment.class, "34")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditCost", "mDone:"+localAlbumLi.w, objArray);
       if (localAlbumLi.w != null) {
          Object obj = null;
          if (this.getActivity() instanceof LocalAlbumActivity || this.getActivity() instanceof a) {
             f = localAlbumLi.F;
             ow = (f != null)? f.toPostBenefitGuideData(): obj;
             FragmentActivity uFragmentAct = 1;
             boolean b = (ow != null && ow.a() - false > 0)? true: false;
             v ov = v.class;
             if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), obj, ov, "4")) {
                try{
                   jSONObject = new JSONObject();
                   jSONObject.put("show_coin_banner", b);
                }catch(org.json.JSONException e0){
                   Object[] objArray4 = new Object[i];
                   a.D().A("LocalVideoLogger", "JSONObject failed", objArray4);
                }
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                urlPackage.page = 68;
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = i;
                uElementPack.action2 = "CLICK_EDIT_BUTTON";
                uElementPack.type = uFragmentAct;
                uElementPack.params = jSONObject.toString();
                u1.A(urlPackage, "", uFragmentAct, uElementPack, v.o());
             }
             if (!this.getActivity() instanceof a) {
                i.V();
             }
             Object[] objArray1 = new Object[i];
             a.D().w("EditCost", "discardCurrentPostSession is LocalAlbumActivity or CameraActivity:"+this.getActivity(), objArray1);
          }else {
             ow = obj;
          }
          if (!i.h()) {
             Object[] objArray2 = new Object[i];
             a.D().w("EditCost", "create post session", objArray2);
             i.V();
          }
          i.m().Z(p3);
          d7.a.q(ow);
          i.m().p().init().subscribe(new s0(p1), f.b);
          p0.startActivityForResult(p1, 291);
          this.eh();
          localAlbumLi.x = obj;
          Object[] objArray3 = new Object[i];
          a.D().w("EditCost", "草稿准备就绪，关闭菊花，开始进入编辑页，菊花总计耗时 "+(System.currentTimeMillis() - p2), objArray3);
       }
       PatchProxy.onMethodExit(LocalAlbumListFragment.class, "34");
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumListFragment.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new LocalAlbumListFragmentAccessor();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumListFragment.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LocalAlbumListFragment.class, new LocalAlbumListFragmentAccessor());
       }else {
          obj.put(LocalAlbumListFragment.class, null);
       }
       return obj;
    }
    public String getUrl(){
       return "ks://local/";
    }
    public final void gh(GifshowActivity p0,e p1,int p2,boolean p3,String p4){
       boolean b = this;
       object oobject = p0;
       object oobject1 = p1;
       boolean b1 = p3;
       object oobject2 = p4;
       int i = 1;
       if (PatchProxy.isSupport(LocalAlbumListFragment.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Boolean.valueOf(p3),oobject2};
          if (PatchProxy.applyVoid(objArray, b, LocalAlbumListFragment.class, "33")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("LocalAlbumListFragment", "edit\(\) really edit duration is over limit: "+b1, objArray1);
       b.w = i;
       int i1 = 0x7f11066a;
       if (d.a(0x6758ee6d).n2()) {
          i.a(i1, R.string.arg_RES_7f100a5c);
          b.w = false;
          return;
       }else if(oobject1 == null){
          b.w = false;
          return;
       }else {
          d.t();
          a$a uoa = new a$a();
          Intent intent = d.a(0x14d6f666).zM(oobject);
          Object[] objArray2 = new Object[0];
          a.D().w("LocalAlbumListFragment", "build SOURCE_ALBUM_DRAFT", objArray2);
          uoa.a0("album_draft");
          long l = System.currentTimeMillis();
          objArray2 = new Object[0];
          a.D().w("EditCost", "开始转菊花", objArray2);
          i0 oi0 = v5;
          i0 oi01 = v5;
          String str = "EditCost";
          oi0 = new i0(this, uoa, p1, p0, intent, p2);
          u0 ou0 = new u0(b);
          if (oobject1 instanceof c) {
             objArray2 = new Object[0];
             a.D().w(str, "老数据，需要转换", objArray2);
             c[] uocArray = new c[1];
             r0 or0 = new r0(this, p0, intent, l, uocArray);
             b.x = b.a(oobject1.k()).observeOn(a.c()).flatMap(new k0(b, uocArray, oobject2)).subscribe(oi01, ou0, oobject2);
          }else if(oobject1 instanceof d){
             object oobject3 = oobject1;
             c uoc = oobject3.k();
             if (uoc.a1() == Workspace$Type.UNRECOGNIZED) {
                i.a(R.style.arg_RES_7f110668, 0x7f100ddc);
                b.w = false;
                return;
             }else if(oobject3.l() || LocalAlbumListFragment.hh().e4(uoc.D0()) != null){
                i.a(R.style.arg_RES_7f11066a, 0x7f1004c9);
                objArray2 = new Object[0];
                a.D().w("LocalAlbumListFragment", "edit\(\) cant edit now isReloading", objArray2);
                b.w = false;
                return;
             }else {
                objArray2 = new Object[0];
                a.D().w(str, "开始编辑草稿，拷贝文件到editing目录", objArray2);
                t ot = (b1)? LocalAlbumUtils.e(uoc): t.just(uoc);
                if (DraftUtils.K(uoc) && PostExperimentUtils.L0()) {
                   ot = ot.flatMap(a0.b);
                }
                q0 oq0 = new q0(this, p0, intent, l, uoc);
                b.x = ot.flatMap(new j0(b, oobject2)).subscribe(oi01, ou0, oobject2);
             }
          }else {
             objArray2 = new Object[0];
             a.D().A("ReviewEdit", "Unknown LocalAlbumProject type.", objArray2);
             b.w = false;
             return;
          }
          if (!PatchProxy.applyVoid(null, b, LocalAlbumListFragment.class, "35") && this.getActivity() != null) {
             ProgressFragment progressFrag = new ProgressFragment();
             b.A = progressFrag;
             progressFrag.Fh(0, 0, 0);
             b.A.setCancelable(0);
             b.A.show(this.getActivity().getSupportFragmentManager(), "progress");
          }
          return;
       }
    }
    public void ic(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumListFragment.class, "27")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.ic(p0, p1);
       }
       return;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "38")) {
          return;
       }
       int i = (this.B > LocalAlbumListFragment.K)? 1: 0;
       if (!this.p.getVisibility()) {
          LocalAlbumListFragment tp = this.p;
          i = (i)? 3: 2;
          tp.t(i);
       }
       return;
    }
    public final void jh(boolean p0){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalAlbumListFragment.class, "10")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumListFragment", "reload reset: "+p0, objArray);
       if (!this.t.Q0().size()) {
          this.n.setVisibility(0);
          this.q.setVisibility(0);
          this.m.setText(R.string.loading);
          this.m.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          this.o.setVisibility(8);
       }
       this.ch();
       this.t.b1(p0);
       this.j.onNext(Boolean.TRUE);
       return;
    }
    public void kh(b p0){
       this.u = p0;
    }
    public void lh(LocalAlbumBannerInfo p0){
       this.F = p0;
    }
    public void m6(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "26")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.m6(p0);
       }
       return;
    }
    public void mf(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "23")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.mf(p0);
       }
       return;
    }
    public void mh(boolean p0){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalAlbumListFragment.class, "11")) {
          return;
       }
       if (this.getActivity() != null) {
          LocalAlbumListFragment tt = this.t;
          if (tt != null) {
             tt.f1(p0);
             this.E = p0;
             this.ch();
          }
       }
       return;
    }
    public void na(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "24")) {
          return;
       }
       LocalAlbumListFragment tu = this.u;
       if (tu != null) {
          tu.na(p0);
       }
       return;
    }
    public void nh(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "29")) {
          return;
       }
       if (this.H != null) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && activity instanceof a) {
             activity.A0();
             return;
          }
       }
       d.a(-831446984).Um(this.getActivity(), new b$a(this.getActivity(), 0).i(0x4000000).l(12).f());
       return;
    }
    public void oh(int p0){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumListFragment.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumListFragment", "updatePhotoViewPaddingBottom bottom height: "+p0, objArray);
       LocalAlbumListFragment tl = this.l;
       tl.setPadding(tl.getPaddingLeft(), this.l.getPaddingTop(), this.l.getPaddingRight(), (this.l.getPaddingBottom() + p0));
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LocalAlbumListFragment.class, "9")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 != 259 && (p0 == 257 || (p0 == 291 && (p1 == -1 && p2 != null)))) {
          String str = j0.f(p2, "DELETED_ID");
          if (!TextUtils.x(str)) {
             Iterator iterator = this.t.Q0().iterator();
             while (iterator.hasNext()) {
                e uoe = iterator.next();
                if ((uoe.getIdentifier()).equals(str)) {
                   this.t.e1(uoe);
                   this.t.k0();
                   this.b8((q.f(this.t.Q0()) ^ 0x01));
                   break ;
                }
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       LocalAlbumListFragment.hh().V3(this);
       if (this.getArguments() != null) {
          this.v = SerializableHook.getSerializable(this.getArguments(), "key_intent_local_album_params");
          this.F = SerializableHook.getSerializable(this.getArguments(), "key_intent_local_album_banner_params");
       }else {
          this.v = new LocalAlbumParams$b().a();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i2;
       boolean objArray1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalAlbumListFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.r = new a();
       LocalAlbumListFragment ts = this.s;
       if (ts == null) {
          View view = a.h(p0, R.layout.arg_RES_7f0d0e9c, p1, false, this.G);
          this.s = view;
          this.doBindView(view);
          int i = 8;
          int columnCount = this.v.getColumnCount();
          int i1 = n.x(this.getActivity());
          Object[] objArray = new Object[false];
          String str = "LocalAlbumListFragment";
          a.D().w(str, "screenWidth: "+i1, objArray);
          float f = 0x3f800000;
          if (i1 > 0) {
             i1 = i1 - (n.c(this.getActivity(), f) * (columnCount - 1));
             i2 = (!(i1 % columnCount))? i1 / columnCount: 0;
             objArray1 = n.j(this.getActivity());
             if (objArray1 > 0) {
                i = (int)Math.ceil((((double)objArray1 / (double)i1) * (double)columnCount));
             }
          }else {
             i2 = 0;
          }
          Object[] objArray2 = new Object[false];
          a.D().w(str, "column width: "+i2, objArray2);
          Serializable serializable = j0.e(this.getActivity().getIntent(), "start_local_album_params");
          if (serializable instanceof LocalAlbumEntranceParams) {
             objArray1 = (serializable.getPageFrom() == 3)? true: false;
             Object[] objArray3 = new Object[false];
             a.D().w(str, "LocalAlbumEntranceParams is valid and from "+serializable.getPageFrom(), objArray3);
          }else {
             objArray1 = false;
          }
          h oh = new h(objArray1, (i * columnCount), this.v, this.G);
          this.t = oh;
          if (i2 > 0) {
             oh.s = i2;
          }
          LocalAlbumGridGroupHeaderAdapter localAlbumGr = new LocalAlbumGridGroupHeaderAdapter(this.t, this.G);
          NpaGridLayoutManager npaGridLayou = new NpaGridLayoutManager(this.getActivity(), this.v.getColumnCount());
          npaGridLayou.m1(new LocalAlbumListFragment$a(this, localAlbumGr));
          this.l.setLayoutManager(npaGridLayou);
          LocalAlbumGridGroupHeaderAdapter$c uoc = (this.v.isNeedShowGroupDivideByTime())? new LocalAlbumGridGroupHeaderAdapter$c(n.c(this.getActivity(), f), this.v.getColumnCount()): new b(n.c(this.getActivity(), f), this.v.getColumnCount());
          uoc.f(false);
          uoc.h(true);
          this.l.addItemDecoration(uoc);
          if (this.v.isNeedShowHeadView()) {
             i1 = -1077260241;
             String str1 = "local";
             if (d.a(i1).CS(str1)) {
                uoc.g(true);
                localAlbumGr.V0(true);
                LocalAlbumListFragment tt = this.t;
                View view1 = d.a(i1).ea(this.l, new m0(this, uoc, localAlbumGr), str1);
                Objects.requireNonNull(tt);
                if (!PatchProxy.applyVoidOneRefs(view1, tt, h.class, "11")) {
                   tt.t = view1;
                   tt.n0(false);
                }
             }
          }
          this.l.getRecycledViewPool().k(false, 50);
          LocalAlbumListFragment tl = this.l;
          if (!this.v.isNeedShowGroupDivideByTime()) {
             localAlbumGr = this.t;
          }
          tl.setAdapter(localAlbumGr);
          localAlbumGr.p = this;
          this.p.setOnClickListener(new LocalAlbumListFragment$b(this));
          this.B = 0;
          this.l.addOnScrollListener(new LocalAlbumListFragment$c(this));
       }else if(ts.getParent() != null && this.s.getParent() instanceof ViewGroup){
          this.s.getParent().removeView(this.s);
       }
       return this.s;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumListFragment.class, "8")) {
          return;
       }
       LocalAlbumListFragment.hh().K3(this);
       LocalAlbumListFragment tt = this.t;
       if (tt != null) {
          tt.f1(false);
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(objArray, tt, g.class, "11")) {
             b9.a(tt.m);
             b9.a(tt.n);
          }
       }
       tt = this.l;
       if (tt != null) {
          tt.removeCallbacks(this.J);
       }
       b9.a(this.r);
       b9.a(this.x);
       super.onDestroyView();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "31")) {
          return;
       }
       super.onPause();
       this.z = true;
       d.d("postLoadToEditorMonitor").h("clickToPause");
       d.d("postLoadToEditorMonitor").g("pauseToCreate");
       return;
    }
    public void onResume(){
       File uFile;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumListFragment.class, "7")) {
          return;
       }
       super.onResume();
       Object[] objArray1 = new Object[0];
       a.D().w("LocalAlbumListFragment", "onResume from Edit|Share "+this.D, objArray1);
       int i = 1;
       if (this.D != null) {
          this.D = false;
          int i1 = this.C + i;
          this.C = i1;
          if (i1 == this.v.getEnableShootVideoTipCount() && !this.p.getVisibility()) {
             FragmentActivity activity = this.getActivity();
             LocalAlbumListFragment tp = this.p;
             LocalAlbumListFragment tG = this.G;
             if (!PatchProxy.isSupport(LocalAlbumUtils.class) || (PatchProxy.applyVoidThreeRefs(activity, tp, Integer.valueOf(tG), null, LocalAlbumUtils.class, "47") || (tp != null && activity != null))) {
                b uob = new b(LocalAlbumBubbleItem.POST_TIP);
                uob.b(tp);
                uob.j(new h2());
                uob.k(new m0(tG));
                PostBubbleManager.e(activity).n(uob);
             }
          }
       }
       this.w = false;
       List obj = PatchProxy.apply(objArray, this, LocalAlbumListFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          i = obj.booleanValue();
       }else if(this.z != null && !this.v.isNeedReloadOnResume()){
          if (!this.k - -1) {
             objArray = new Object[0];
             a.D().w("LocalAlbumListFragment", "needRefreshList: needRefreshList = -1", objArray);
          }else {
             obj = DraftFileManager.E().Q();
             if (q.f(obj)) {
                objArray = new Object[0];
                a.D().w("LocalAlbumListFragment", "needRefreshList: not find workspace dir", objArray);
             }else {
                Iterator iterator = obj.iterator();
                do {
                   if (iterator.hasNext()) {
                   }
                   uFile = iterator.next();
                } while (uFile != null && uFile.lastModified() - this.k);
             }
          }
       }
       i = false;
       if (i) {
          this.jh(0);
       }
       this.z = false;
       this.j.onNext(Boolean.TRUE);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "5")) {
          return;
       }
       super.onStart();
       this.w = false;
       this.y = false;
       if (this.x == null) {
          this.eh();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumListFragment.class, "6")) {
          return;
       }
       super.onStop();
       this.y = true;
       return;
    }
    public void w9(PostStatus p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumListFragment.class, "15")) {
          return;
       }
       if (this.r == null || (this.t != null && (p1.getUploadInfo() == null || (!TextUtils.x(p1.getUploadInfo().getWorkspaceId()) && (p0 != PostStatus.UPLOAD_COMPLETE || (j8.c() || (p0 != PostStatus.ENCODE_CANCELED || (p1.needUpload() || p0 == PostStatus.UPLOAD_CANCELED)))))))) {
          this.r.c(this.t.d1(p1.getUploadInfo().getWorkspaceId()).subscribe(new t0(this), new h0(this)));
       }
    label_0064 :
       return;
    }
}
