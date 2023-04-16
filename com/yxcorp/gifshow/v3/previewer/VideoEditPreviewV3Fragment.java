package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.v3.EditorActivity$h;
import c35.i;
import c35.c;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import io.reactivex.subjects.PublishSubject;
import t36.f;
import voc.o;
import mrd.a;
import java.util.HashMap;
import rwc.j;
import ooc.l0;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import java.lang.Boolean;
import wwc.n0;
import androidx.lifecycle.MutableLiveData;
import lwc.d;
import com.kwai.gifshow.post.api.core.model.VideoProduceTime;
import k2b.w;
import crd.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.Music;
import lnc.la;
import java.util.List;
import z16.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import z16.a;
import qr4.i;
import qr4.e$h;
import java.util.Set;
import com.yxcorp.gifshow.util.AdvEditUtil;
import qr4.e$j;
import java.util.HashSet;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import ooc.g1;
import lq.l$a;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import java.lang.StringBuilder;
import lwc.y2;
import java.lang.Runnable;
import lwc.f;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import lwc.h;
import lwc.g;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import android.app.Activity;
import lnc.r1;
import wba.e0;
import toc.a;
import com.google.common.collect.ImmutableList;
import kotlin.Pair;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.edit.draft.Workspace$Type;
import vaa.a;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.EditorManager;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lwc.e;
import lwc.a3;
import t36.f$a;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import k2b.s$b;
import android.content.Intent;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import ooc.j;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.e7;
import nwc.c;
import com.yxcorp.gifshow.v3.previewer.m0;
import kuaishou.perf.page.impl.d;
import com.kuaishou.edit.draft.Workspace$Source;
import lwc.o3;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import r1c.h;
import com.yxcorp.gifshow.v3.previewer.f1;
import lq.i;
import com.kwai.sdk.switchconfig.a;
import e17.i;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import q46.t;
import com.kuaishou.viewbinder.IViewBinder;
import qxc.c;
import com.yxcorp.gifshow.activity.BasePostActivity;
import ekd.j0;
import tkd.b;
import tkd.d;
import om6.c;
import om6.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import f6c.a;
import bba.b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import wba.f0;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.os.SystemClock;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite;
import ooc.j0;
import lwc.e3;
import k2b.s;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.EditAbilityConfig;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.v3.f;
import java.io.File;
import w46.b;
import com.yxcorp.gifshow.v3.previewer.k0;
import brd.t;
import t45.d;
import brd.z;
import lwc.q2;
import erd.o;
import io.reactivex.android.schedulers.a;
import lwc.g2;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.previewer.r0;
import crd.b;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.v;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$e;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.v3.previewer.l0;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import w26.a;
import w26.c;
import evc.c;
import uxb.u;
import uxb.l;
import uxb.r;
import k2b.n3;
import com.yxcorp.gifshow.v3.previewer.y0;
import ok.h;
import lnc.b9;
import lwc.x2;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import wba.p0;
import h69.h;
import xf6.l;
import lwc.u2;
import com.kuaishou.edit.draft.Workspace$From;
import lq.e;
import lnc.x;
import lwc.d3;
import elb.x;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import android.view.ViewGroup;
import ooc.h;
import java.lang.Number;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import f0c.t;
import com.kuaishou.edit.draft.Workspace;
import lnc.g7;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import taa.a;
import com.kuaishou.edit.draft.Preview;
import com.yxcorp.gifshow.v3.previewer.i0;
import com.yxcorp.gifshow.v3.previewer.o0;
import com.yxcorp.gifshow.v3.v;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.previewer.f0;
import com.yxcorp.gifshow.v3.previewer.g0;
import lwc.b3;
import com.yxcorp.gifshow.v3.previewer.h0;
import wba.d0;
import mca.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.previewer.d1;
import lwc.n3;
import uv8.o;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$c;
import com.yxcorp.gifshow.v3.previewer.e;
import brd.y;
import android.view.ViewTreeObserver;
import wwc.m0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import lwc.s4;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$a;
import java.lang.Enum;
import lq.a;
import com.kwai.video.editorsdk2.VideoEditorSession;
import ok.n;
import com.kwai.video.editorsdk2.PreviewPlayer;
import lnc.x$c;
import com.yxcorp.gifshow.v3.previewer.u0;
import lwc.v2;
import com.yxcorp.gifshow.v3.previewer.x0;
import lwc.w2;
import com.yxcorp.gifshow.v3.previewer.v0;
import lwc.z2;
import com.yxcorp.gifshow.v3.previewer.p0;
import io.reactivex.g;
import com.yxcorp.gifshow.log.EditFunnel;
import km6.e;
import qr4.m$k0;
import qr4.m$m;
import com.yxcorp.utility.TextUtils;
import java.io.Serializable;
import com.kwai.feature.post.api.core.model.RecreationParam;
import qr4.m$b0;
import lnc.o5;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.k5;
import android.os.Bundle;
import xvc.f;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.lang.RuntimeException;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import android.view.ViewParent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.ViewModelStore;
import lwc.f3;
import androidx.lifecycle.ViewModelProvider$Factory;
import uwc.f;
import lwc.b2;
import z1.a;
import lwc.d2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import lq.l;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.yxcorp.gifshow.v3.previewer.c;
import pb9.p;
import pb9.o;
import xwc.c;
import lwc.c3;
import com.yxcorp.gifshow.v3.editor.k;
import lwc.f2;
import com.yxcorp.gifshow.v3.previewer.n0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.pb;
import mba.m0;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import l26.e;
import l26.f;
import k2b.t;
import k2b.v1$d;
import k2b.v1$f;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import lwc.l2;
import lwc.e2;
import java.lang.System;
import owc.f;
import vl8.c;
import com.kuaishou.edit.draft.Music;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import com.kwai.feature.post.api.music.data.MusicSource;
import owc.f$a;
import com.kuaishou.edit.draft.Music$Type;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo$MusicScenes;
import com.kuaishou.edit.draft.Music$ParameterCase;
import com.kuaishou.edit.draft.ImportMusicParam;
import com.kuaishou.edit.draft.Song;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.gifshow.util.AdvEditUtil$EditorVersion;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest;
import lwc.t4;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import com.yxcorp.gifshow.v3.previewer.q0;
import lwc.k2;
import lwc.n2;
import lwc.i2;
import com.yxcorp.gifshow.v3.previewer.j0;
import nwc.e;
import uwc.a;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditFeaturesStatusPackage;

public class VideoEditPreviewV3Fragment extends EditorBasePreviewFragment implements EditorActivity$h, i, c	// class@001586
{
    public int A1;
    public int B1;
    public FlexScreenStatusData C1;
    public EditorSplashImageInfo D1;
    public h E1;
    public j0 F1;
    public VideoSDKPlayerView G;
    public f G1;
    public RelativeLayout H;
    public h H1;
    public PublishSubject I;
    public final j I1;
    public f J;
    public f J1;
    public PublishSubject K;
    public b K1;
    public o L;
    public b L1;
    public c M;
    public final l M1;
    public Fragment N;
    public boolean N1;
    public f O;
    public c O1;
    public a P;
    public f Q;
    public Map R;
    public f S;
    public j T;
    public j U;
    public BaseEditPreviewFragmentViewBinder U0;
    public boolean V;
    public String V0;
    public long W;
    public n0 W0;
    public long X;
    public boolean X0;
    public c Y;
    public boolean Y0;
    public a Z;
    public MutableLiveData Z0;
    public PublishSubject a1;
    public d b1;
    public a c1;
    public EditorItemFunc d1;
    public View e1;
    public VideoProduceTime f1;
    public final w g1;
    public final Map h1;
    public String i1;
    public String j1;
    public int k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public PresenterV2 p1;
    public c q1;
    public double r1;
    public b s1;
    public String t1;
    public a u1;
    public b v1;
    public AttrAnimProgressFragment w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    public static final int P1;

    public void VideoEditPreviewV3Fragment(){
       super();
       this.I = PublishSubject.g();
       this.J = new f();
       this.K = PublishSubject.g();
       this.L = new o(false);
       this.N = this;
       this.O = new f();
       this.P = a.g();
       this.Q = new f();
       this.R = new HashMap();
       this.S = new f();
       this.T = new j(new l0(a1.p(0x7f100c60), a1.p(0x7f100c5e), a1.p(0x7f100c5f)));
       Boolean fALSE = Boolean.FALSE;
       this.U = new j(fALSE);
       this.V = false;
       this.Y = a.g();
       this.Z = a.g();
       this.W0 = new n0();
       this.X0 = false;
       this.Y0 = false;
       this.Z0 = new MutableLiveData(fALSE);
       this.a1 = PublishSubject.g();
       this.b1 = new d();
       this.c1 = a.g();
       this.d1 = null;
       this.f1 = new VideoProduceTime();
       this.g1 = new w();
       this.h1 = new HashMap();
       this.k1 = -1;
       this.m1 = false;
       this.n1 = true;
       this.r1 = 0;
       this.u1 = new a();
       this.y1 = false;
       this.z1 = false;
       this.A1 = 0;
       this.B1 = 0;
       this.I1 = new j(this.t);
       this.L1 = null;
       this.M1 = new VideoEditPreviewV3Fragment$b(this);
       this.N1 = true;
       this.O1 = null;
    }
    public static boolean Fh(VideoContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoEditPreviewV3Fragment.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (la.c(p0, true, false) == null) {
          return false;
       }
       if (la.c(p0, false, true) != null) {
          return false;
       }
       List list = c.a(p0);
       if (!q.f(list)) {
          long l = p0.C();
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa.a > 0 && uoa.b - l < 0) {
                   return false;
                }
                continue ;
             }
          }
       }
       if (p0.F().d.n != null && p0.F().d.n.length > 0) {
          Set set = AdvEditUtil.g();
          e$h n = p0.F().d.n;
          int len = n.length;
          int i = 0;
          while (i < len) {
             if (set.contains(n[i].a)) {
                return false;
             }
             i = i + 1;
          }
       }
       return true;
    }
    private void Gh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "86")) {
          return;
       }
       VideoEditPreviewV3Fragment tM = this.M;
       if (tM != null && !tM.L0().isEmpty()) {
          tM = this.M;
          DraftFileManager.d(tM, tM.L0());
       }
       return;
    }
    private void Nh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "42")) {
          return;
       }
       g1.l("continue_edit_continue", 1457);
       this.Mh(1, null);
       return;
    }
    private void ki(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "53")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "showProgressDialog", objArray);
       if (this.w1 == null) {
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          this.w1 = uAttrAnimPro;
          uAttrAnimPro.vh(true);
          this.w1.uh(R.dimen.arg_RES_7f070340, 0x7f070340);
       }
       this.w1.setCancelable(i);
       this.w1.show(this.getActivity().getSupportFragmentManager(), "Build");
       return;
    }
    public static void yh(VideoEditPreviewV3Fragment p0){
       p0.Nh();
    }
    public static void zh(VideoEditPreviewV3Fragment p0){
       p0.Nh();
    }
    public void Ah(LayoutInflater p0,View p1){
    }
    public void Bh(boolean p0,int p1,Size p2,boolean p3,boolean p4){
       int i = 0;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "78")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "adjustMainView notifyContextChange:"+p0+",isInit:"+p4+",pullUpTabHeight:"+p1+",newSize:"+p2+",needUpdatePreview:"+p3, objArray1);
       if (p4) {
          y2 oy2 = new y2(this, p0, p1, p2, p3);
          this.e1.post(v6);
       }else {
          this.Ch(p0, p1, p2, p3);
       }
       return;
    }
    public final void Ch(boolean p0,int p1,Size p2,boolean p3){
       int this;
       VideoEditPreviewV3Fragment videoEditPre = this;
       object oobject = p2;
       boolean b = p3;
       f uof = f.class;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, VideoEditPreviewV3Fragment.class, "79")) {
          return;
       }
       VideoEditPreviewV3Fragment obj = null;
       boolean i = 6;
       boolean i1 = 5;
       int i2 = 4;
       this = 3;
       int i3 = 2;
       int i4 = 1;
       if (oobject) {
          f uof1 = videoEditPre.L.d();
          FragmentActivity activity = this.getActivity();
          VideoEditPreviewV3Fragment m = videoEditPre.M;
          VideoEditPreviewV3Fragment g = videoEditPre.G;
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray = new Object[i];
             objArray[0] = uof1;
             objArray[i4] = activity;
             objArray[i3] = oobject;
             objArray[this] = m;
             objArray[i2] = g;
             objArray[i1] = Boolean.valueOf(p3);
             if (!PatchProxy.applyVoid(objArray, obj, uof, "2")) {
             label_0064 :
                if (b) {
                   f.b(g, m, i4);
                }
                Objects.requireNonNull(uof1);
                if (!PatchProxy.applyVoidOneRefs(oobject, uof1, f.class, "3")) {
                   Integer[] integerArray = new Integer[i4];
                   integerArray[0] = Integer.valueOf(oobject.b);
                   uof1.b = Lists.e(integerArray);
                   integerArray = new Integer[i4];
                   integerArray[0] = Integer.valueOf(oobject.c);
                   uof1.c = Lists.e(integerArray);
                   uof1.i.e = uof1.b.get(0).intValue();
                   uof1.i.f = uof1.c.get(0).intValue();
                }
             }
          }else {
             goto label_0064 ;
          }
          obj = videoEditPre.E1;
          FragmentActivity activity1 = this.getActivity();
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidTwoRefs(oobject, activity1, obj, h.class, "11") && activity1 != null) {
             h p = obj.p;
             Objects.requireNonNull(p);
             if (!PatchProxy.applyVoidTwoRefs(oobject, activity1, p, g.class, "5")) {
                Size[] sizeArray = new Size[i4];
                sizeArray[0] = p2.a();
                ArrayList uArrayList = Lists.e(sizeArray);
                a.o(uArrayList, "Lists.newArrayList\(newSize.clone\(\)\)");
                p.c(uArrayList);
             }
             Size size = obj.p.a(0);
             Size size1 = r1.d(size.b, size.c, activity1, Asset$ShootInfo$Resolution.NONE, false, false);
             h i5 = obj.i;
             if (i5 == null) {
                a.S("workspaceDraft");
             }
             if (e0.e(i5)) {
                size1 = a.c.d(size.b, size.c, activity1);
             }
             ImmutableList immutableLis = ImmutableList.of(Integer.valueOf(size1.b));
             String str = "ImmutableList.of\(playerViewSize.width\)";
             a.o(immutableLis, str);
             obj.c = immutableLis;
             immutableLis = ImmutableList.of(Integer.valueOf(size1.c));
             a.o(immutableLis, "ImmutableList.of\(playerViewSize.height\)");
             obj.d = immutableLis;
             obj.e.setValue(new Size(size1.b, size1.c));
             obj.f.setValue(new Pair(Integer.valueOf(0), new Size(size1.b, size1.c)));
             immutableLis = ImmutableList.of(Integer.valueOf(size1.b));
             a.o(immutableLis, str);
             obj.g = immutableLis;
             immutableLis = ImmutableList.of(Integer.valueOf(size1.c));
             a.o(immutableLis, "ImmutableList.of\(playerViewSize.height\)");
             obj.h = immutableLis;
          }
       }else {
          f uof2 = videoEditPre.L.d();
          FragmentActivity activity2 = this.getActivity();
          VideoEditPreviewV3Fragment m1 = videoEditPre.M;
          EditorSdk2V2$VideoEditorProject videoEditorP = videoEditPre.L.f();
          Workspace$Type type = this.Sh();
          obj = videoEditPre.G;
          i = this.Yh();
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray1 = new Object[]{uof2,activity2,m1,videoEditorP,type,obj,Boolean.valueOf(i),Boolean.valueOf(p3)};
             if (PatchProxy.applyVoid(objArray1, null, uof, "1")) {
             label_0264 :
                videoEditPre.E1.J0(this.getActivity(), videoEditPre.M, videoEditPre.L.f());
             }
          }
          f.b(obj, m1, b);
          uof2.e(videoEditorP);
          i1 = (type != Workspace$Type.AI_CUT && (type != Workspace$Type.KUAISHAN && (m1.F0() == null || m1.F0().u() == null)))? EditorManager.v(obj.getVideoProject(), m1): false;
          f i6 = uof2.i;
          double d = 2.00f;
          double d1 = (i1)? (double)obj.getVideoProject().trackAssets().length() * d: obj.getVideoLength();
          i6.b = d1;
          i6 = uof2.i;
          i6.m = i1;
          if (i1) {
             i6.o = (float)d;
             i6.c = (int)(((float)(uof2.c(0).b * uof2.i.d) * 0x3f000000) / (float)uof2.c(0).c);
          }else {
             i6.o = 0;
             i6.c = (int)((double)n.y(a.a().a()) / 7.00f);
          }
          f i7 = uof2.i;
          i7.j = i;
          i7.g = new e(obj);
          uof2.i.k = i4;
          goto label_0264 ;
       }
       videoEditPre.S.s0(new a3(p1));
       BaseEditorFragment b1 = videoEditPre.B;
       if (b1 != null && p0) {
          VideoEditPreviewV3Fragment l = videoEditPre.L;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidOneRefs(l, b1, EditorManager.class, "15")) {
             EditorManager g1 = b1.g;
             if (g1 != null) {
                Iterator iterator = g1.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().C(l);
                }
             }
          }
       }
       return;
    }
    public void Dh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "52")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "batchReportEditorItemShown", objArray);
       if (!this.h1.isEmpty()) {
          Iterator iterator = this.h1.values().iterator();
          while (iterator.hasNext()) {
             s$b uob = iterator.next();
             if (uob.e()) {
                uob.a();
             }
          }
       }
       return;
    }
    public String E7(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Sh() == Workspace$Type.PHOTO_MOVIE) {
          return "PictureMovie";
       }
       return "Video";
    }
    public final void Eh(boolean p0){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "54")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCost", "build:"+p0, objArray);
       if (this.G != null && (this.getActivity() != null && (this.Qh() == null || this.L.f() == null))) {
          this.l1 = false;
          return;
       }else {
          PageMonitor.INSTANCE.onInit("com.yxcorp.gifshow.activity.share.ShareActivity");
          j.a(this.M);
          if (p0) {
             if (!PostExperimentUtils.t0()) {
                e7.c("post_directly");
             }else {
                e7.c("visibility_expiration");
             }
             this.W0.c();
          }
          this.m1 = true;
          this.G.pause();
          f.p0(this.R, c.class).s0(m0.a);
          VideoEditPreviewV3Fragment tW0 = this.W0;
          Objects.requireNonNull(tW0);
          objArray = null;
          if (!PatchProxy.applyVoid(objArray, tW0, n0.class, "8")) {
             d.d("postEditNextMonitor").h("clickToCover");
             d.d("postEditNextMonitor").g("coverToDraft");
          }
          if (this.M.T0() == Workspace$Source.REEDIT) {
             this.ki();
             if (!PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "58")) {
                Object[] objArray1 = new Object[0];
                a.D().w("EditCostVideoEditPreviewV3Fragment", "nextStepForReEdit called ", objArray1);
                this.H1.a(new o3(this));
                this.H1.d();
                this.H1.i();
             }
             return;
          }else {
             this.ki();
             if (!PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "57")) {
                objArray = new Object[0];
                a.D().w("EditCostVideoEditPreviewV3Fragment", "nextstep cost nextOnTaskGraph start isDirectlyPublish:"+p0, objArray);
                this.H1.a(new f1(this, p0));
                this.H1.d();
                if (i.m().M() && !p0) {
                   if (this.Th() - a.t().b("chat_video_duration_limited", 0xea60) > 0) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f100521);
                      this.Ih();
                      this.l1 = false;
                      this.G.play();
                   }else {
                      this.H1.g("VideoShareParamBuildMTNSTask");
                      p0.d = false;
                   }
                }
                this.H1.i();
             }
             return;
          }
       }
    }
    public AbsVideoFragmentV3ViewBinder Hh(int p0){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "84");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.a(t.c(this.Qh()), AbsVideoFragmentV3ViewBinder.class, this);
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "55")) {
          return;
       }
       VideoEditPreviewV3Fragment tw1 = this.w1;
       if (tw1 != null) {
          tw1.dismiss();
          this.w1 = null;
       }
       return;
    }
    public final void Jh(int p0,Intent p1,boolean p2){
       String this;
       Object[] objArray1;
       VideoEditPreviewV3Fragment obj;
       boolean b;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, VideoEditPreviewV3Fragment.class, "81")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       this = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(this, "finish postResult:"+p0+",isDirectlyPublish:"+p2, objArray);
       VideoEditPreviewV3Fragment tG = this.G;
       if (tG != null && !tG.isReleased()) {
          this.G.stop();
       }
       BasePostActivity activity = this.getActivity();
       if (activity != null) {
          int i1 = -1139054219;
          String str = "from_click_draft_remind_bubble";
          int i2 = 2;
          int i3 = -1;
          if (p0 == i2) {
             objArray1 = new Object[i];
             a.D().w(this, "Save draft, finish PostSession and quit video edit.", objArray1);
             i.m().d0(i2);
             obj = i.m().A("fromRecordDraftTab", Boolean.FALSE);
             if (obj instanceof Boolean && obj.booleanValue()) {
                activity.setResult(i3);
                activity.finish();
             }else {
                activity.finishAffinity();
                if (j0.a(this.Qh(), str, i)) {
                   d.a(i1).Ev(activity);
                }
             }
          }else {
             i2 = 1;
             if (p0 == i2 && p2) {
                this.M.j1(Phase.POST);
                a.l();
                if (i.h()) {
                   b = i.m().B();
                   i.m().d0(i2);
                   Object[] objArray2 = new Object[i];
                   a.D().w(this, "publish finish, goHome= "+b, objArray2);
                }else {
                   b = true;
                }
                if (p1 != null) {
                   a.i(j0.b(p1, "video_file_upload_id", i3));
                }
                if (b) {
                   activity.finishAffinity();
                   obj = this.M;
                   PhotoVisibility photoVisibil = (obj == null)? null: f0.a(obj.Q0());
                   a.a.f(activity, photoVisibil);
                   activity.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
                }else if(p1 == null){
                   p1 = new Intent();
                }
                p1.putExtra("key_publish_complete", i2);
                if (i.h()) {
                   i.m().t(i3, p1);
                }
                activity.setResult(i3, p1);
                activity.finish();
             }else if(this.Wh()){
                objArray1 = new Object[i];
                a.D().w(this, "isFromThirdAppAICut finishAffinity", objArray1);
                activity.finishAffinity();
             }else if(p1 == null){
                p1 = new Intent();
             }
             p1.putExtra("back_to_activity_time", SystemClock.uptimeMillis());
             if (!p0) {
                i3 = 0;
             }
             activity.setResult(i3, p1);
             activity.finish();
             if (j0.a(this.Qh(), str, i)) {
                d.a(i1).Ev(activity);
             }
          }
       }
       if (p2) {
          this.W0.d();
       }
       return;
    }
    public final void Kh(int p0,boolean p1){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, VideoEditPreviewV3Fragment.class, "80")) {
          return;
       }
       this.Jh(p0, null, p1);
       return;
    }
    public final void Lh(boolean p0){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "44")) {
          return;
       }
       if (j.g(this.M) || DraftUtils.e(this.M)) {
          Workspace$b uob = this.M.k();
          uob.u(Workspace$Type.UNKNOWN);
          uob.t(this.M.b1());
          uob.build();
       }
       this.F1.o0().s0(new e3(this));
       this.Mh(2, null);
       if (p0) {
          s.g(1764);
       }
       return;
    }
    public boolean Mh(int p0,l$a p1){
       EditorActivity obj;
       a uoa;
       Object[] objArray3;
       t ot;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, VideoEditPreviewV3Fragment.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(str, "finishDraft whensunset6 action:"+p0, objArray);
       obj = this.getActivity();
       if (obj == null) {
          return i;
       }else if(p0 == 2){
          this.Dh();
          FragmentActivity activity = this.getActivity();
          VideoEditPreviewV3Fragment tM = this.M;
          EditAbilityConfig uEditAbility = i.g().getEditAbilityConfig().get(EditAbilityConfig.DEFAULT);
          if (!PatchProxy.applyVoidThreeRefs(activity, tM, uEditAbility, null, f.class, "50")) {
             if (tM == null || activity == null) {
                Object[] objArray1 = new Object[i];
                a.D().t("EditUtils", "clearPublishDraftIfNeed: workSpaceDraft"+tM+"activity"+activity, objArray1);
             }else if(!DraftFileManager.E().H(tM).exists() && (tM.T0() == Workspace$Source.CAPTURE && f.c(activity, tM, uEditAbility))){
                uoa = 1;
             }else {
                uoa = null;
             }
             if (uoa) {
                Object[] objArray2 = new Object[i];
                a.D().w("EditUtils", "clearPublishDraftIfNeed: clearPublishDraft ", objArray2);
                tM.j0();
             }
          }
          this.Kh(i, i);
          return true;
       }else {
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          uAttrAnimPro.setCancelable(i);
          uAttrAnimPro.show(obj.getSupportFragmentManager(), "VideoEditBack");
          if (DraftUtils.b0(this.M) && (!this.Xh() && p1 == null)) {
             objArray3 = new Object[i];
             a.D().w(str, "finishDraft need save cover", objArray3);
             f.p0(this.R, c.class).s0(k0.a);
             ot = this.li().observeOn(d.a);
          }else {
             objArray3 = new Object[i];
             a.D().w(str, "finishDraft do not need save cover", objArray3);
             ot = t.just(Boolean.TRUE);
          }
          this.u1.c(ot.flatMap(new q2(this)).observeOn(a.c()).doAfterTerminate(new g2(this, uAttrAnimPro, p1)).subscribe(Functions.d(), r0.b));
          return true;
       }
    }
    public IViewBinder O1(){
       return this.Uh();
    }
    public v Oh(EditorItemFunc p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VideoEditPreviewV3Fragment$e(this, p0);
    }
    public Object Ph(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Object();
    }
    public void Qd(boolean p0){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "46")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onNextStepClick isDirectlyPublish:"+p0, objArray);
       this.U.setValue(Boolean.valueOf(p0));
       this.F1.o0().s0(new VideoEditPreviewV3Fragment$d(this, p0));
       VideoEditPreviewV3Fragment tW0 = this.W0;
       Workspace$Type type = this.Sh();
       Objects.requireNonNull(tW0);
       if (!PatchProxy.applyVoidOneRefs(type, tW0, n0.class, "6") && (type != null && !TextUtils.isEmpty(n0.b(type)))) {
          d.d("postEditNextMonitor").n();
          d.d("postEditNextMonitor").g("clickToCover");
          d.d("postEditNextMonitor").l(n0.b(type));
       }
    label_0088 :
       this.Q.s0(l0.a);
       View view = null;
       PostCommonFunnel.b.b(view, "video_preview_next_press");
       if (this.isAdded() && this.l1 == null) {
          this.l1 = true;
          if (p0 && !d.a(0x27e26f6e).uu()) {
             this.l1 = i;
             return;
          }else {
             this.Dh();
             if (!PatchProxy.applyVoid(view, this, VideoEditPreviewV3Fragment.class, "47")) {
                Object[] objArray1 = new Object[i];
                a.D().w("EditCostVideoEditPreviewV3Fragment", "handleNextStepClick", objArray1);
                tW0 = this.q1;
                if (tW0 != null && !TextUtils.isEmpty(tW0.a())) {
                   this.u1.c(l.n().VN(this.q1, this.L));
                }else if(PostExperimentUtils.A(this.M)){
                   this.u1.c(l.i().k20(this));
                }
             }
             n3.a(this.f1, this.g1);
             this.c1.onNext(Boolean.valueOf(p0));
             if (this.b1.b()) {
                this.L1 = b9.c(this.L1, new y0(this, p0));
             }else if(PostExperimentUtils.A(this.M)){
                this.u1.c(f.R(new x2(this, p0), this.I1.getValue()));
             }else {
                this.Eh(p0);
             }
          }
       }
       return;
    }
    public Intent Qh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, VideoEditPreviewV3Fragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() != null) {
          objArray = this.getActivity().getIntent();
       }
       return objArray;
    }
    public VideoSDKPlayerView Rh(){
       return this.G;
    }
    public Workspace$Type Sh(){
       VideoEditPreviewV3Fragment obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       Workspace$Type type = (obj != null)? obj.a1(): Workspace$Type.UNKNOWN;
       return type;
    }
    public boolean T0(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.Sh() == Workspace$Type.PHOTO_MOVIE)? true: false;
       return b;
    }
    public boolean T4(boolean p0){
       Intent obj;
       boolean i1;
       Object[] objArray3;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.getActivity() != null && (!this.getActivity().isFinishing() && (!this.getActivity() instanceof EditorActivity || this.getActivity().N3() == null))) {
          return b;
       }else {
          Object[] objArray = new Object[b];
          String str = "EditCostVideoEditPreviewV3Fragment";
          a.D().w(str, "cancelPrompt showDialog:"+p0, objArray);
          int i = 2;
          l$a uoa = null;
          if (p0.b(this.t1)) {
             this.Mh(i, uoa);
             return true;
          }else if(("memory").equals(this.t1) || ("memory_album").equals(this.t1)){
             i1 = -1595266550;
             if (d.a(i1).YF() || l.c("key_smart_album_retain", b)) {
                this.N1 = b;
                BaseEditorFragment tB = this.B;
                EditorItemFunc sTYLE = EditorItemFunc.STYLE;
                Objects.requireNonNull(tB);
                if (!PatchProxy.applyVoidOneRefs(sTYLE, tB, EditorManager.class, "28")) {
                   BaseEditor uBaseEditor = tB.g.get(sTYLE);
                   if (uBaseEditor != null) {
                      uBaseEditor.l = true;
                      uBaseEditor.M(sTYLE);
                      uBaseEditor.L(tB.m);
                      uBaseEditor.P(true);
                      tB.o = uBaseEditor;
                      tB.K();
                      Iterator iterator = tB.n.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().d(sTYLE);
                      }
                      tB.o.O(BaseEditor$EditorShowMode.SHOW_FOREGROUND);
                      tB.b.setAlpha(0);
                   }
                }
                h.i(this.e1.findViewById(R.id.edit_player_mask_view), this, true);
                d.a(i1).wm(b);
                return true;
             }
          }
          Workspace$Source rEEDIT = Workspace$Source.REEDIT;
          if (this.M.T0() == rEEDIT) {
             this.Eh(b);
             return true;
          }else {
             obj = this.Qh();
             String str1 = (obj != null)? j0.f(obj, "SOURCE"): uoa;
             if (TextUtils.equals(str1, "share_photos")) {
                f.O(this.getActivity(), new u2(this));
                return true;
             }else if(!this.isAdded()){
                return b;
             }else if(obj != null && j0.a(obj, "IS_RECOVER", b)){
                i1 = true;
             }else {
                i1 = false;
             }
             boolean b1 = DraftFileManager.E().H(this.M).exists();
             int i2 = (this.getActivity().D3() && !j0.a(this.Qh(), "EDIT_CLOSE_ICON_DEFAULT", b))? 1: 0;
             Object[] objArray1 = new Object[b];
             a.D().w(str, "cancelPrompt workspace is recovered: "+i1+", has origin: "+b1, objArray1);
             boolean i3 = (!b1 && (this.M.T0() == Workspace$Source.MEDIA_SCENE && (this.M.B0() != Workspace$From.PROFILE_AVATAR && this.M.B0() != Workspace$From.MEDIA_SENCE_COMMON)))? 1: 0;
             int i4 = (this.Wh() || i3)? 1: 0;
             if (DraftUtils.e0(this.M) && (!i1 && (!i4 && (this.y1 == null && !DraftUtils.N(this.M))))) {
                Object[] objArray2 = new Object[b];
                a.D().w(str, "Workspace unmodified. Finish.", objArray2);
                return this.Mh(i, uoa);
             }else {
                this.z1 = b;
                String str2 = "edit";
                if (!b1 || (!TextUtils.equals(str1, str2) && (TextUtils.equals(str1, "album_draft") || (!i2 && (i4 || TextUtils.equals(this.t1, "post_share_photo")))))) {
                   g1.m("edit_edit_dialog", 1580);
                   l0 b2 = this.T.getValue().b;
                   l0 c = this.T.getValue().c;
                   if (i3 && !x.f()) {
                      b2 = a1.p(R.string.arg_RES_7f104051);
                      c = a1.p(R.string.arg_RES_7f103d65);
                   }
                   this.ji(true, true, false, b2, c);
                   objArray3 = new Object[b];
                   a.D().w(str, "Workspace modified or recovered. Ask user.", objArray3);
                }else if(!TextUtils.equals(this.t1, str2) && !TextUtils.equals(this.t1, "picture")){
                   i3 = true;
                }else {
                   i3 = false;
                }
                if (p0) {
                   if (i.h()) {
                      i.m().k().d();
                   }
                   VideoEditPreviewV3Fragment tM = this.M;
                   a.p(tM, "workspaceDraft");
                   Workspace$Source source = tM.T0();
                   a.o(source, "workspaceDraft.source");
                   Workspace$Type type = tM.a1();
                   a.o(type, "workspaceDraft.type");
                   Workspace$From uFrom = tM.B0();
                   a.o(uFrom, "workspaceDraft.from");
                   a uoa1 = (source == Workspace$Source.SEASON_ALBUM_MOVIE || (source != Workspace$Source.SHOP_COMMENT && (source != Workspace$Source.SHOP && (source != Workspace$Source.JUXING && (source != rEEDIT && (source != Workspace$Source.VIDEO_RECREATION && (source != Workspace$Source.PROFILE_BACKGROUND_POST && (type != Workspace$Type.KTV_MV && (type != Workspace$Type.KTV_SONG && uFrom != Workspace$From.IM_SEND_MESSAGE)))))))))? 1: null;
                   this.z1 = true;
                   this.ji(false, uoa1, i3, null, null);
                   if (uoa1) {
                      x.f();
                   }
                }else {
                   this.F1.o0().s0(new d3(this));
                   this.Mh(i, uoa);
                   if (i3) {
                      s.g(1764);
                   }
                }
                objArray3 = new Object[b];
                a.D().w(str, "New workspace modified or recovered. Ask user.", objArray3);
                return true;
             }
          }
       }
    }
    public final long Th(){
       VideoEditPreviewV3Fragment obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.G;
       if (obj == null) {
          return -1;
       }
       return (long)(obj.getDisplayDuration() * 0x408f400000000000);
    }
    public AbsVideoFragmentV3ViewBinder Uh(){
       return this.n;
    }
    public IViewBinder V5(int p0){
       return this.Hh(p0);
    }
    public final boolean Vh(){
       Workspace$Type obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Sh();
       boolean b = (d.a(-273232199).Ta() && obj != Workspace$Type.PHOTO_MOVIE)? true: false;
       return b;
    }
    public final boolean Wh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, VideoEditPreviewV3Fragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.Qh() != null) {
          objArray = j0.f(this.Qh(), "SOURCE");
       }
       boolean b = (!TextUtils.isEmpty(this.M.d1().D()) && TextUtils.equals(objArray, "source_ai_cut"))? true: false;
       return b;
    }
    public boolean Xh(){
       return false;
    }
    public boolean Yh(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.Sh() != Workspace$Type.KTV_SONG || this.M.v().getAssetsCount() != b) {
          b = false;
       }
       return b;
    }
    public boolean Zg(){
       return false;
    }
    public void Zh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "loadExtraWorkspace", objArray);
       if (!DraftUtils.K(this.M) && (g7.a(this.M) || (j.h(this.M.T0()) && !f.C(this.Qh())))) {
          AICutProjectManager.a(this.L.f(), this.M);
       }
       return;
    }
    public boolean ai(){
       return true;
    }
    public boolean bi(){
       return true;
    }
    public void ch(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "10")) {
          return;
       }
       super.ch();
       if (!i.h()) {
          return;
       }
       if (this.getActivity() != null) {
          objArray = this.getActivity().getIntent();
       }
       if (objArray == null) {
          return;
       }else {
          Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE,Workspace$Type.SINGLE_PICTURE};
          c uoc = i.m().w(typeArray);
          if (uoc == null) {
             return;
          }else if(uoc.a1() == Workspace$Type.KUAISHAN){
             a uoa = uoc.P0();
             if (uoa != null && (uoa.v() != null && ((float)uoa.v().getWidth() / (float)uoa.v().getHeight()) - 0x3f078788 <= 0)) {
                t.a(objArray, "fullScreenPreview");
             }
          }else if(p0.a(uoc.T0())){
             t.a(objArray, "fullScreenPreview");
          }else if(!(EditAbilityConfig.fragmentScenario(i.g())).isEmpty()){
             t.a(objArray, EditAbilityConfig.fragmentScenario(i.g()));
          }
          return;
       }
    }
    public void ci(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "27")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       String str = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(str, "onEditorHide", objArray1);
       this.getActivity().Z3();
       if (!PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "25")) {
          objArray = new Object[0];
          a.D().w(str, "showCoinTaskProgress", objArray);
          if (this.getActivity() != null) {
             this.getActivity().Y3();
          }
       }
       this.J.s0(i0.a);
       this.N1 = true;
       h.i(this.e1.findViewById(R.id.edit_player_mask_view), this, 0);
       this.J.s0(o0.a);
       f0 uof0 = 4;
       if (v.c(this.getActivity(), this.M)) {
          this.Uh().h.setVisibility(0);
       }else {
          this.Uh().h.setVisibility(uof0);
       }
       if (x.a()) {
          this.Uh().i.setVisibility(0);
       }
       if (this.Uh().K() != null) {
          if (v.b(this.M, i.g().getEditAbilityConfig().get(EditAbilityConfig.DEFAULT))) {
             this.Uh().K().setVisibility(0);
             if (x.a()) {
                this.Uh().i.setVisibility(0);
             }
          }else {
             this.Uh().K().setVisibility(uof0);
          }
       }
       this.J.s0(f0.a);
       return;
    }
    public void di(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "24")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onEditorShow func:"+p0, objArray);
       if (p0 == EditorItemFunc.BACKGROUND) {
          return;
       }
       boolean b = true;
       if (this.Sh() == Workspace$Type.KTV_SONG || (this.Sh() == Workspace$Type.KTV_MV && (p0 != EditorItemFunc.FILTER && (p0 == EditorItemFunc.PRETTIFY || p0 == EditorItemFunc.KTV)))) {
          b = false;
       }
       if (this.N1 != null) {
          this.getActivity().R3(b);
       }
       if (!PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "26")) {
          Object[] objArray1 = new Object[i];
          a.D().w("EditCostVideoEditPreviewV3Fragment", "hideCoinTaskProgress", objArray1);
          if (this.getActivity() != null) {
             this.getActivity().O3();
          }
       }
       this.J.s0(g0.a);
       this.J.s0(new b3(p0));
       if (p0 == EditorItemFunc.COVER_VIDEO) {
          f.p0(this.R, c.class).s0(h0.a);
       }
       this.Uh().h.setVisibility(4);
       if (this.Uh().H() != null) {
          this.Uh().H().setVisibility(8);
       }
       if (x.a()) {
          this.Uh().i.setVisibility(4);
       }
       if (this.Uh().K() != null) {
          this.Uh().K().setVisibility(4);
       }
       this.d1 = p0;
       return;
    }
    public final void ei(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onLoadComplete", objArray);
       this.Ih();
       this.s1 = null;
       this.x1 = true;
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "74")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "attachPresenter", objArray);
       return;
    }
    public void fi(){
       Object[] objArray3;
       long l = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, l, VideoEditPreviewV3Fragment.class, "22")) {
          return;
       }
       boolean b = this.isResumed();
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(str, "onWorkspaceLoaded startPlay:"+b, objArray1);
       if (l.L.f() != null) {
          Workspace$Type type = 1;
          if (l.L.f().trackAssetsSize() >= type) {
             EditorSdk2V2$VideoEditorProject videoProject = l.G.getVideoProject();
             EditorManager obj = PatchProxy.applyOneRefs(videoProject, objArray, d0.class, "1");
             float f = (obj != PatchProxyResult.class)? obj.floatValue(): ((float)a.s(videoProject) * 0x3f800000) / (float)a.r(videoProject);
             l.G.setRatio(f);
             l.G.setWorkSpaceInfo(l.M.a1(), l.M.T0());
             if (b) {
                Object[] objArray2 = new Object[i];
                a.D().w("EditCost", "开始播放", objArray2);
                l.W = SystemClock.elapsedRealtime();
                l.G.play();
             }else {
                l.G.pause();
             }
             EditorActivity activity = this.getActivity();
             VideoEditPreviewV3Fragment m = l.M;
             Objects.requireNonNull(activity);
             if (!PatchProxy.applyVoidOneRefs(m, activity, EditorActivity.class, "59")) {
                if (!DraftUtils.f(m) || (activity.V0 == null && !("album_draft").equals(activity.W))) {
                   a uoa = a.D();
                   StringBuilder str2 = "recover title btn not show, source :"+activity.W+", draft is null：";
                   boolean b1 = (m == null)? true: false;
                   objArray3 = new Object[i];
                   uoa.w("EditorActivity", str2+b1, objArray3);
                   activity.N3().l.setVisibility(8);
                }else {
                   activity.N3().l.setTextSize(type, 11.00f);
                   RelativeLayout$LayoutParams layoutParams = activity.N3().l.getLayoutParams();
                   layoutParams.width = h.c;
                   layoutParams.height = h.d;
                   activity.N3().l.setLayoutParams(layoutParams);
                   activity.N3().l.setBackgroundResource(R.drawable.arg_RES_7f081a13);
                   activity.N3().l.setVisibility(i);
                   int i1 = 6;
                   int i2 = 485;
                   String str3 = "show_record";
                   if (!PatchProxy.isSupport(s.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), Integer.valueOf(i2), str3, null, s.class, "1")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action = i2;
                      uElementPack.name = str3;
                      uElementPack.type = type;
                      u1.u0(i1, uElementPack, new ClientContent$ContentPackage());
                   }
                   activity.N3().l.setText(R.string.arg_RES_7f100cea);
                   activity.N3().l.setOnClickListener(new g(activity, m));
                }
             }
             String str1 = "23";
             if (!PatchProxy.applyVoid(objArray, l, VideoEditPreviewV3Fragment.class, str1)) {
                objArray3 = new Object[i];
                a.D().w(str, "initEditorManager mEditorManager:"+l.B, objArray3);
                if (l.B == null) {
                   d1 uod1 = new d1(l);
                   l.I1.setValue(uod1);
                   obj = new EditorManager(this.getActivity(), l.e1, this.Sh(), l.M.T0(), l.M.B0(), uod1, l.t1, new n3(l), this.Uh(), l.F1.p0());
                   l.B = activity;
                }
             }
             if (a.t().d("enableThumbnailPrefetchInVideo", i) && AbiUtil.b()) {
                i = 1;
             }
             if (i && this.Sh() != Workspace$Type.LONG_VIDEO) {
                this.getActivity().E3(new VideoEditPreviewV3Fragment$c(l));
             }
             if (!l.B.u()) {
                l.J.s0(e.a);
             }
             l.Y.onNext(new Object());
             View view = l.e1.findViewById(R.id.action_recycler_view);
             type = this.Sh();
             if (!PatchProxy.applyVoidTwoRefs(view, type, objArray, n0.class, str1)) {
                view.getViewTreeObserver().addOnPreDrawListener(new m0(view, type));
             }
             return;
          }
       }
       i.a(R.style.arg_RES_7f110668, 0x7f100ddc);
       l.Kh(i, i);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(VideoEditPreviewV3Fragment.class, new s4());
       }else {
          obj.put(VideoEditPreviewV3Fragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.V0;
    }
    public String getUrl(){
       String obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = VideoEditPreviewV3Fragment$a.a[this.Sh().ordinal()];
       if (i == 1) {
          return "ks://preview/karaoke";
       }
       if (i == 2) {
          return "ks://preview/karaoke-mv";
       }
       obj = (TextUtils.isEmpty(this.t1))? "": "/"+this.t1;
       return "ks://preview"+obj;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "75")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "detachPresenter", objArray);
       return;
    }
    public void gi(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "83")) {
          return;
       }
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.D();
       }
       return;
    }
    public final void hi(boolean p0,boolean p1){
       int i;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VideoEditPreviewV3Fragment.class, "11")) {
          return;
       }
       if (!p0) {
          i = this.isHidden() ^ 0x01;
       }
       VideoEditPreviewV3Fragment tG = this.G;
       if (tG != null && i) {
          if (tG.isReleased()) {
             VideoEditorSession videoEditorS = i.m().p().q();
             n.k(videoEditorS, "EditSession should be initialized first");
             this.G.initialize(videoEditorS, i.m().p().s());
             this.G.setVideoProject(this.L.f());
             this.G.seekToWithDeletedRange(this.r1);
          }
          this.G.onResume();
          if (p1) {
             if (this.W <= 0) {
                this.W = SystemClock.elapsedRealtime();
             }
             this.G.play();
          }
       }
    label_007d :
       return;
    }
    public void ii(){
    }
    public final void ji(boolean p0,boolean p1,boolean p2,String p3,String p4){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "41")) {
             return;
          }
       }
       ArrayList uArrayList = new ArrayList();
       if (p0) {
          String str = a1.p(R.string.arg_RES_7f100c5e);
          String str1 = a1.p(R.string.arg_RES_7f103d65);
          if (!x.f() || (TextUtils.isEmpty(p3) || TextUtils.isEmpty(p4))) {
             p3 = str;
             p4 = str1;
          }
          uArrayList.add(new x$c(R.drawable.arg_RES_7f081b66, p3, new u0(this), 1));
          uArrayList.add(new x$c(R.drawable.arg_RES_7f081b6b, p4, new v2(this), 0));
          x.g(this.getActivity(), this.getActivity().N3().e, uArrayList, 0, x0.b);
       }else {
          uArrayList.add(new x$c(R.drawable.arg_RES_7f081b7f, a1.p(R.string.arg_RES_7f100c50), new w2(this, p2), 1));
          if (p1) {
             uArrayList.add(new x$c(R.drawable.arg_RES_7f081b66, a1.p(R.string.arg_RES_7f1047a2), new v0(this), 0));
          }
          x.g(this.getActivity(), this.getActivity().N3().e, uArrayList, 0, new z2(p2));
       }
       return;
    }
    public t li(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "updateCover start", objArray);
       return t.create(new p0(this)).subscribeOn(d.c);
    }
    public void mi(){
       VideoContext videoContext2;
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "60")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "updateVideoContextEnter", objArray);
       EditFunnel.a.a(this.V0);
       this.L.e().U1(this.V0);
       VideoContext videoContext1 = this.L.e();
       boolean b = (this.Sh() == Workspace$Type.LONG_VIDEO)? true: false;
       videoContext1.m1(b);
       if (!TextUtils.isEmpty(this.i1)) {
          this.L.e().Q1(this.i1);
          e.b(this.L.e(), this.j1);
       }
       if (this.k1 != -1) {
          this.L.e().P1(this.k1);
       }
       this.L.e().Z0("preview"+this.t1);
       Intent intent = this.Qh();
       if (intent != null) {
          b = j0.a(intent, "VIDEO_IS_LIP_SYNC", i);
          if (!this.L.e().i0()) {
             videoContext2 = this.L.e();
             Objects.requireNonNull(videoContext2);
             if (!PatchProxy.isSupport(videoContext) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), videoContext2, videoContext, "182")) {
                VideoContext.b();
                videoContext2.f0();
                i b2 = videoContext2.a.b;
                if (b2.A == null) {
                   b2.A = new m$m();
                }
                videoContext2.a.b.A.d = b;
             }
          }
          String str = TextUtils.k(j0.f(intent, "m2uExtraInfo"));
          videoContext2 = this.L.e();
          Objects.requireNonNull(videoContext2);
          String str1 = "";
          if (PatchProxy.applyOneRefs(str, videoContext2, videoContext, "16") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             videoContext2.f0();
             i b1 = videoContext2.a.b;
             String str3 = (str == null)? str1: str;
             b1.H = str3;
          }
          Object[] objArray1 = new Object[i];
          a.D().w("EditCostVideoEditPreviewV3Fragment", str, objArray1);
          if (p0.b(this.t1)) {
             RecreationParam recreationPa = j0.e(intent, "INTENT_EXTRA_RECREATION_PARAM");
             String str2 = (recreationPa == null)? str1: recreationPa.mRecreationOriginPhotoId;
             if (recreationPa != null) {
                str1 = recreationPa.mRecreationOriginUserName;
             }
             if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str1)) {
                if (!TextUtils.equals(this.t1, "music_recreation") && !TextUtils.equals(this.t1, "merchant_comment_recreation")) {
                   PostUtils.D("EditCostVideoEditPreviewV3Fragment", "updateVideoContextEnter", new IllegalArgumentException("photoAuthor is "+str1+", photoId is "+str2+"."));
                }
             }else {
                videoContext1 = this.L.e();
                Objects.requireNonNull(videoContext1);
                if (!PatchProxy.applyVoidTwoRefs(str2, str1, videoContext1, videoContext, "228")) {
                   VideoContext.b();
                   videoContext1.f0();
                   if (videoContext1.F().b.P0 == null) {
                      videoContext1.F().b.P0 = new m$b0();
                   }
                   videoContext1.F().b.P0.a = o5.c(str2);
                   videoContext1.F().b.P0.b = str1;
                }
             }
          }
       }
    label_01c3 :
       return;
    }
    public final void ni(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "40")) {
          return;
       }
       if (PostExperimentUtils.A(this.M)) {
          this.u1.c(f.R(p0, this.I1.getValue()));
       }else {
          p0.run();
       }
       return;
    }
    public void onActivityPause(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "49")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onActivityPause", objArray);
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.y();
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, VideoEditPreviewV3Fragment.class, "35")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onActivityResult requestCode:"+p0+",resultCode:"+p1, objArray);
       if (p0 == 529) {
          this.X = j0.c(p2, "back_to_activity_time", 0);
          if (p1 == -1) {
             VideoEditPreviewV3Fragment tG = this.G;
             if (tG != null && !tG.isReleased()) {
                this.G.stop();
             }
          }else {
             this.Y.onNext(new Object());
          }
       }else {
          k5.a(this.getChildFragmentManager(), p0, p1, p2);
       }
       return;
    }
    public void onActivityResume(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "50")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onActivityPause", objArray);
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.z();
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.ra(false);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onCreate isFinishing:"+this.getActivity().isFinishing(), objArray);
       if (this.getActivity().isFinishing()) {
          return;
       }
       VideoEditPreviewV3Fragment tW0 = this.W0;
       Objects.requireNonNull(tW0);
       if (!PatchProxy.applyVoid(null, tW0, n0.class, "2")) {
          d.d("postLoadToEditorMonitor").h("pauseToCreate");
          d.d("postLoadToEditorMonitor").g("createToPreview");
       }
       this.U0 = this.n;
       this.J1 = i.m().p().f();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j0 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoEditPreviewV3Fragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = ViewModelProviders.of(this.jh()).get(j0.class);
       this.F1 = obj;
       this.H1 = new h(obj.o0(), false);
       Object[] objArray = new Object[false];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onCreateView mEditorActivityViewModel:"+this.F1, objArray);
       Object[] obj1 = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment.class, "12");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = new Object[false];
          String str2 = "checkInit";
          a.D().w("EditCostVideoEditPreviewV3Fragment", str2, obj1);
          if (this.getActivity() == null || this.Qh() == null) {
             obj1 = new Object[false];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "checkInit activity or intent is null", obj1);
          }else if(this.getActivity() != null && this.getActivity().isFinishing()){
             obj1 = new Object[false];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "checkInit activity is finishing", obj1);
          }else {
             Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE,Workspace$Type.SINGLE_PICTURE};
             c uoc = i.m().w(typeArray);
             this.M = uoc;
             if (uoc == null || uoc.v() == null) {
                PostUtils.D("EditCostVideoEditPreviewV3Fragment", str2, new RuntimeException("Workspace is empty. Finish."));
                this.getActivity().finish();
             }else {
                this.t1 = j0.f(this.Qh(), "SOURCE");
                if (this.M.a1() != Workspace$Type.KUAISHAN && !this.M.v().getAssetsCount()) {
                   PostUtils.D("EditCostVideoEditPreviewV3Fragment", str2, new RuntimeException("Asset not found in workspace. Finish."));
                   this.getActivity().finish();
                }else {
                   b = true;
                }
             }
          }
          b = false;
       }
       if (!b) {
          return null;
       }else if(PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VideoEditPreviewV3Fragment.class, "13")){
          a.f.a().g(PostCommonBiz.EDIT, "EditCostVideoEditPreviewV3Fragment", "init mRootView:"+this.e1);
          VideoEditPreviewV3Fragment te1 = this.e1;
          if (te1 == null) {
             this.e1 = super.onCreateView(p0, p1, p2);
          }else if(te1.getParent() instanceof ViewGroup){
             this.e1.getParent().removeView(this.e1);
          }
          this.p1 = new PresenterV2();
          this.getViewModelStore().clear();
          this.G1 = ViewModelProviders.of(this, new f3(this)).get(f.class);
          this.F1.p0().c(new b2(this));
          this.F1.o0().s0(new d2(this, p0, p1, p2));
          this.Ah(p0, this.e1);
          h oh = f.l(this);
          this.E1 = oh;
          oh.M0(this.M);
          this.E1.H0(this.J1);
          this.getActivity().F2(this);
          i.m().f(this.M1);
          if (!PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "14")) {
             objArray1 = new Object[false];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "initParam", objArray1);
             String str = "photo_task_id";
             String str1 = j0.f(this.Qh(), str);
             this.V0 = str1;
             if (TextUtils.isEmpty(str1)) {
                this.V0 = u1.f();
                this.Qh().putExtra(str, this.V0);
             }
             this.Qh().putExtra(str, this.V0);
             this.i1 = j0.f(this.Qh(), "same_frame_origin_photo_id");
             this.j1 = j0.f(this.Qh(), "same_frame_origin_user_name");
             this.k1 = j0.b(this.Qh(), "same_frame_available_depth", -1);
             str = "video_produce_time";
             this.f1 = (j0.g(this.Qh(), str))? j0.e(this.Qh(), str): new VideoProduceTime();
             Object[] objArray2 = new Object[false];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "initParam mTaskId:"+this.V0+",mSameFrameOriginPhotoId:"+this.i1+",mSameFrameOriginAuthorName:"+this.j1+",mAvailableSameFrameDepth:"+this.k1+",mVideoProduceTime:"+this.f1, objArray2);
          }
          if (!PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "15")) {
             objArray1 = new Object[false];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "initView", objArray1);
             this.Uh().V(this.E1);
             this.Uh().P(this.J);
             this.Uh().O(this.S);
             this.Uh().bindViews(this.e1);
             AbsVideoFragmentV3ViewBinder s = this.Uh().s;
             this.G = s;
             s.setTaskId(this.V0);
             VideoEditorSession videoEditorS = i.m().p().q();
             n.k(videoEditorS, "EditSession should be initialized first");
             this.G.initialize(videoEditorS, i.m().p().s());
             this.G.seekToPlaybackStart();
             this.G.setPage(this.getActivity().getPage());
             this.G.setVisibility(false);
             this.H = this.Uh().D;
             this.getActivity().y3();
             this.getActivity().N3().G(this.E1, this);
             this.S.s0(c.a);
             AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment(this.getActivity());
             this.w1 = uAttrAnimPro;
             uAttrAnimPro.vh(true);
             this.w1.uh(R.dimen.arg_RES_7f070340, 0x7f070340);
          }
          o.b(p.g(false), this.V0);
          objArray1 = new Object[false];
          a.D().w("EditCost", "创建视频编辑页布局", objArray1);
       }
       return this.dh(this.e1);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "31")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onDestroy", objArray);
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.E();
       }
       VideoEditPreviewV3Fragment tH1 = this.H1;
       if (tH1 != null) {
          tH1.f();
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "30")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onDestroyView", objArray1);
       if (this.O1 != null) {
          this.O1.a();
       }
       if (i.h()) {
          i.m().U(this.M1);
       }
       this.F1.o0().s0(new c3(this));
       VideoEditPreviewV3Fragment tG = this.G;
       if (tG != null) {
          tG.release();
       }
       k.f().i();
       tG = this.s1;
       if (tG != null) {
          b9.a(tG);
          this.s1 = objArray;
       }
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.E();
       }
       this.w1 = objArray;
       tG = this.L1;
       if (tG != null) {
          b9.a(tG);
       }
       b9.a(this.K1);
       b9.a(this.u1);
       b9.a(this.v1);
       tG = this.p1;
       if (tG != null) {
          tG.unbind();
          this.p1.destroy();
          this.p1 = objArray;
       }
       if (!f.C(this.Qh()) && (!("memory").equals(this.t1) && (!("memory_album").equals(this.t1) && (!("source_ai_cut").equals(this.t1) && !("album_movie").equals(this.t1))))) {
          AICutProjectManager.b();
       }
    label_00b9 :
       if (DraftUtils.S(this.M)) {
          AICutProjectManager.b();
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this);
       }
       super.onDestroyView();
       return;
    }
    public void onHiddenChanged(boolean p0){
       BaseEditorFragment tB;
       VideoEditPreviewV3Fragment tG;
       Object[] objArray2;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "73")) {
          return;
       }
       super.onHiddenChanged(p0);
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "onHiddenChanged hidden:"+p0, objArray);
       Object[] objArray1 = null;
       if (!p0) {
          this.Gh();
          this.F1.p0().c(new f2(this));
          if (!PatchProxy.applyVoid(objArray1, this, VideoEditPreviewV3Fragment.class, "76")) {
             objArray2 = new Object[0];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "doSomeThingOnResume", objArray2);
             if (!this.isHidden()) {
                tB = this.B;
                boolean b = true;
                tB = (tB != null && (tB.w() && this.bi()))? true: false;
                this.hi(b, tB);
                if (!PatchProxy.applyVoid(objArray1, this, VideoEditPreviewV3Fragment.class, "34")) {
                   objArray1 = new Object[0];
                   a.D().w("EditCostVideoEditPreviewV3Fragment", "play", objArray1);
                   if (this.G != null && this.L.f() != null) {
                      tB = this.B;
                      if (tB != null && tB.w()) {
                         this.G.setVisibility(0);
                         this.G.seekTo(0);
                         this.G.play();
                      }
                   }
                }
                this.g1.c();
                if (this.x1 != null) {
                   tB = this.B;
                   if (tB != null && tB.w()) {
                      tG = this.G;
                      if (tG != null) {
                         tG.resume();
                      }
                   }
                }
                tG = this.G;
                if (tG != null) {
                   tG.onResume();
                   this.G.play();
                }
             }
          }
          tB = this.B;
          if (tB != null && tB.w()) {
             tG = this.G;
             if (tG != null) {
                tG.setVisibility(0);
             }
          }
          this.E1.L0();
       }else if(PatchProxy.applyVoid(objArray1, this, VideoEditPreviewV3Fragment.class, "77")){
          objArray2 = new Object[0];
          a.D().w("EditCostVideoEditPreviewV3Fragment", "doSomeThingOnPause mIsLoaderResultComplete:"+this.x1, objArray2);
          if (this.x1 != null) {
             tG = this.G;
             if (tG != null) {
                tG.pause();
             }
          }
          this.g1.b();
          tG = this.G;
          if (tG != null) {
             tG.onPause();
          }
          this.Q.s0(n0.a);
       }
       tG = this.G;
       if (tG != null) {
          tG.setVisibility(4);
       }
       this.E1.K0();
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment.class, "7")) {
          return;
       }
       super.onPause();
       boolean b = true;
       boolean b1 = (this.Uh().s != null && (!this.Uh().s.isReleased() && (!this.Uh().s.isPlaying() && (this.m1 != null || pb.c(i.m())))))? true: false;
       this.n1 = b1;
       if (this.Uh().s != null && !this.Uh().s.isPlaying()) {
          this.Uh().s.onPause();
       }
       this.L.h(b);
       VideoEditPreviewV3Fragment tW0 = this.W0;
       Objects.requireNonNull(tW0);
       if (!PatchProxy.applyVoid(objArray, tW0, n0.class, "3")) {
          d.d("postEditNextMonitor").h("finishToPause");
          d.d("postEditNextMonitor").g("pauseToCreate");
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "8")) {
          return;
       }
       super.onResume();
       if (this.getActivity() != null && !this.getActivity().isFinishing()) {
          this.Gh();
          if (this.Uh().s != null && this.Uh().s.isSharingPlayer()) {
             this.Uh().s.restorePlayer();
             this.Uh().s.seekToPlaybackStart();
             if (this.Uh().s.getPlayer() != null && this.Uh().s.getPlayer().mProject != null) {
                k.f().j(this.Uh().s.getPlayer().mProject);
             }
          }
          BaseEditorFragment tB = this.B;
          boolean b = true;
          int b1 = (tB != null && (tB.w() && (this.n1 != null && this.bi())))? true: false;
          this.hi(false, b1);
          this.l1 = false;
          this.m1 = false;
          VideoEditPreviewV3Fragment tM = this.M;
          if (tM != null) {
             if (tM.D()) {
                this.M.j1(Phase.EDIT);
             }
             this.M.u().q(b);
          }
          this.L.h(false);
          if (k.d != null && k.d.c != null) {
             b = false;
          }
          if (b) {
             tB = this.B;
             if (tB != null) {
                tB.t(this.Sh());
             }
          }
          if (j.j(this.M)) {
             MemoryLogger.d("enterEdit", this.V0);
             b1 = -1077260241;
             if (d.a(b1).Dn()) {
                t.a.a("coin").show();
             }else if(d.a(b1).Ad()){
                t.a.a("pendant").show();
             }
          }
       }
    label_0112 :
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, VideoEditPreviewV3Fragment.class, "9")) {
          return;
       }
       super.onStop();
       VideoEditPreviewV3Fragment tW0 = this.W0;
       Objects.requireNonNull(tW0);
       if (!PatchProxy.applyVoid(null, tW0, n0.class, "5")) {
          d.d("postLoadToEditorMonitor").f();
          d.d("postVideoToEditorMonitor").f();
       }
       tW0 = this.G;
       if (tW0 != null && !tW0.isReleased()) {
          this.r1 = this.G.getCurrentTime();
          this.G.stop();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Intent intent1;
       String str2;
       long l1;
       String str3;
       long l4;
       o obj2;
       boolean b1;
       String str6;
       Object[] objArray5;
       MusicClipInfo$MusicScenes musicScenes;
       object oobject;
       MusicSource dEFAULT;
       String str9;
       String str10;
       Song song;
       File uFile1;
       MusicSource uNKNOWN;
       String str11;
       b uob = this;
       PatchProxyResult obj = p0;
       Object[] obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uob, VideoEditPreviewV3Fragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "EditCostVideoEditPreviewV3Fragment";
       a.D().w(str, "onViewCreated", objArray);
       if (this.getActivity() == null || this.getActivity().isFinishing()) {
          obj1 = new Object[0];
          a.D().w(str, "onViewCreated activity is finishing", obj1);
          return;
       }else {
          uob.K1 = uob.J1.e().subscribe(new l2(uob));
          uob.F1.o0().s0(new e2(uob, obj, obj1));
          obj = PatchProxyResult.class;
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, uob, VideoEditPreviewV3Fragment.class, "16")) {
             objArray = new Object[i];
             a.D().w(str, "loadWorkspace", objArray);
             if (this.getActivity() == null || uob.M.v() == null) {
                obj1 = new Object[0];
                a.D().w(str, "loadWorkspace activity is null or draft is null", obj1);
             }else {
                Intent intent = this.Qh();
                Bundle arguments = this.getArguments();
                String str1 = "2";
                if (arguments != null && arguments.getBoolean("FADE_COVER_NO_DIALOG", i)) {
                   uob.w1 = objArray1;
                }else {
                   AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                   uob.w1 = uAttrAnimPro;
                   uAttrAnimPro.setCancelable(i);
                   if (intent != null && !j0.a(intent, "edit_from_mix_preview", i)) {
                      VideoEditPreviewV3Fragment w1 = uob.w1;
                      int i2 = 0x7f102f5c;
                      Objects.requireNonNull(w1);
                      if (PatchProxy.isSupport(AttrAnimProgressFragment.class) && PatchProxy.applyOneRefs(Integer.valueOf(i2), w1, AttrAnimProgressFragment.class, str1) != obj) {
                      }else {
                         w1.s = objArray1;
                         w1.t = i2;
                         uAttrAnimPro = w1.p;
                         if (uAttrAnimPro != null) {
                            uAttrAnimPro.setText(i2);
                         }
                      }
                   }
                   uob.w1.show(this.getActivity().getSupportFragmentManager(), "InitLoad");
                   Object[] objArray6 = new Object[i];
                   a.D().w("EditCost", "开始转菊花加载草稿", objArray6);
                }
                long l = System.currentTimeMillis();
                if (PatchProxy.applyVoid(objArray1, uob, VideoEditPreviewV3Fragment.class, "19")) {
                   intent1 = intent;
                   str2 = str;
                   l1 = l;
                }else {
                   uob.L.l(uob.M.d1());
                   long l3 = System.currentTimeMillis();
                   Object[] objArray3 = new Object[i];
                   a.D().w("EditCost", "加载mvparam和photoMeta耗时 "+(l3 - System.currentTimeMillis()), objArray3);
                   f uof = new f();
                   objArray3 = new Object[]{uob};
                   uof.u(objArray3);
                   f uof1 = f.class;
                   if (PatchProxy.applyVoid(null, uof, uof1, "1")) {
                      intent1 = intent;
                      str3 = str;
                   }else {
                      objArray = new Object[i];
                      String str4 = "MusicClipInfoLoader";
                      intent1 = intent;
                      a.D().s(str4, "load---------->start!", objArray);
                      Music music = uof.d.v();
                      str3 = str;
                      String str5 = null;
                      if (music == null) {
                         Workspace workspace = uof.c.v();
                         obj2 = PatchProxy.applyOneRefs(workspace, uof, uof1, str1);
                         if (obj2 != obj) {
                            b1 = obj2.booleanValue();
                         }else if(workspace.getType() == Workspace$Type.AI_CUT || workspace.getType() == Workspace$Type.ALBUM_MOVIE){
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                         if (b1) {
                            MusicClipInfo.b(2.00f, 2.00f);
                         }else {
                            MusicClipInfo.b(str5, str5);
                         }
                         objArray1 = new Object[0];
                         a.D().s(str4, "load music is null<----------end!", objArray1);
                      }else {
                         Music music1 = uof.e.e().K();
                         File uFile = DraftFileManager.E().B(music.getFile(), uof.d);
                         if (music1 != null) {
                            str6 = music1.toString();
                            String str7 = str6;
                            objArray5 = new Object[0];
                            a.D().s(str4, "load record music musicMeta:"+str6, objArray5);
                            str6 = str7;
                            musicScenes = null;
                            oobject = MusicSource.values()[uof.e.e().L()];
                         }else {
                            music1 = uof.e.e().B();
                            if (music1 != null) {
                               str6 = music1.toString();
                               oobject = MusicSource.values()[uof.e.e().o()];
                               str11 = str6;
                               objArray5 = new Object[0];
                               a.D().s(str4, "load edit music musicMeta:"+str6, objArray5);
                            }else {
                               oobject = 0;
                               str11 = null;
                            }
                            str6 = str11;
                            musicScenes = 1;
                         }
                         int i1 = 0x7f103726;
                         str1 = a.a().a().getString(i1);
                         String str8 = "";
                         switch (f$a.a[music.getType().ordinal()]){
                             case 1:
                               dEFAULT = MusicSource.DEFAULT;
                            label_02cf :
                               str9 = str6;
                               str10 = str8;
                               break;
                             case 2:
                               oobject = MusicSource.RECORD;
                               str1 = a.a().a().getString(R.string.arg_RES_7f103759);
                            label_02d4 :
                               str9 = str6;
                               str10 = str1;
                               dEFAULT = oobject;
                               break;
                             case 3:
                               oobject = MusicSource.LOCAL;
                               str1 = a.a().a().getString(R.string.arg_RES_7f10371d);
                               goto label_02d4 ;
                               break;
                             case 4:
                               oobject = MusicSource.CLOUD_MUSIC;
                               str1 = a.a().a().getString(i1);
                               goto label_02d4 ;
                               break;
                             case 5:
                               oobject = MusicSource.RECOMMEND_MUSIC;
                               str1 = a.a().a().getString(i1);
                               goto label_02d4 ;
                               break;
                             case 6:
                               uNKNOWN = MusicSource.UNKNOWN;
                               if (uFile == null) {
                               label_027d :
                                  dEFAULT = uNKNOWN;
                                  str6 = str8;
                                  goto label_02cf ;
                               }else {
                                  str1 = uFile.getAbsolutePath();
                               label_0285 :
                                  dEFAULT = uNKNOWN;
                                  str6 = str1;
                                  goto label_02cf ;
                               }
                               break;
                             case 7:
                               uNKNOWN = MusicSource.UNKNOWN;
                               if (uFile == null) {
                                  goto label_027d ;
                               }else {
                                  str1 = uFile.getAbsolutePath();
                                  goto label_0285 ;
                               }
                               break;
                             default:
                               goto label_02d4 ;
                         }
                         musicScenes = (musicScenes)? MusicClipInfo$MusicScenes.EDITPAGE: MusicClipInfo$MusicScenes.RECORDPAGE;
                         MusicClipInfo$MusicScenes musicScenes1 = musicScenes;
                         double loudness = (music.getLoudness() < 0)? music.getLoudness(): 0xc02e000000000000;
                         MusicClipInfo musicClipInf = new MusicClipInfo(dEFAULT, str10, str9, true, musicScenes1, loudness);
                         str = (uFile != null)? uFile.getAbsolutePath(): null;
                         str6.mClippedResultPath = str;
                         if (music.getType() == Music$Type.IMPORT && (music.getParameterCase() == Music$ParameterCase.IMPORT_PARAM && music.getImportParam().hasSong())) {
                            song = music.getImportParam().getSong();
                         }else if(music.getType() == Music$Type.ONLINE && (music.getParameterCase() == Music$ParameterCase.ONLINE_PARAM && music.getOnlineParam().hasSong())){
                            song = music.getOnlineParam().getSong();
                         }else if(music.getType() == Music$Type.OPERATION && (music.getParameterCase() == Music$ParameterCase.OPERATION_PARAM && music.getOperationParam().hasSong())){
                            song = music.getOperationParam().getSong();
                         }else {
                            song = null;
                         }
                         if (song != null && !URLUtil.isNetworkUrl(song.getFile())) {
                            str2 = str3;
                            l1 = l;
                            uFile1 = DraftFileManager.E().B(song.getFile(), uof.d);
                         }else {
                            l1 = l;
                            str2 = str3;
                            uFile1 = null;
                         }
                         String absolutePath = (uFile1 != null)? uFile1.getAbsolutePath(): str6.mClippedResultPath;
                         str6.mOriginFilePath = absolutePath;
                         l4 = l3;
                         MusicClipInfo.b(music.getFadeInTime(), music.getFadeOutTime());
                         uof = uof.e;
                         Objects.requireNonNull(uof);
                         if (!PatchProxy.applyVoidOneRefs(str6, uof, o.class, "1")) {
                            obj2 = uof.c;
                            Objects.requireNonNull(obj2);
                            obj2.mMusicSource = str6.mMusicSource;
                            obj2.mMusicTypeName = str6.mMusicTypeName;
                            obj2.mMusicMeta = str6.mMusicMeta;
                            obj2.mOriginFilePath = str6.mOriginFilePath;
                            obj2.mClippedResultPath = str6.mClippedResultPath;
                            obj2.mClipStartMills = str6.mClipStartMills;
                            obj2.mClipResultDuration = str6.mClipResultDuration;
                            obj2.mAllowLoopPlay = str6.mAllowLoopPlay;
                            obj2.mMusicScenes = str6.mMusicScenes;
                            obj2.mLoudness = str6.mLoudness;
                            obj2.a = str6.a;
                         }
                         objArray = new Object[0];
                         a.D().s(str4, "load song:"+song+",originFile:"+uFile1+",musicClipInfo:"+str6+",musicFile:"+uFile+",musicSource:"+dEFAULT+", fadeInTime:"+music.getFadeInTime()+",fadeOutTime:"+music.getFadeOutTime(), objArray);
                      label_0443 :
                         Object[] objArray4 = new Object[0];
                         a.D().w("EditCost", "加载musicClipInfo耗时 "+(System.currentTimeMillis() - l4), objArray4);
                         uob.L.e().X1(AdvEditUtil$EditorVersion.V3_FULLSCREEN.versionName);
                         uob.L.j(new Intent());
                         uob.L.i(EncodeRequest.newBuilder());
                      }
                   }
                   l1 = l;
                   l4 = l3;
                   str2 = str3;
                   goto label_0443 ;
                }
                long l2 = System.currentTimeMillis();
                Object[] objArray2 = new Object[0];
                a.D().w("EditCost", "初始化VideoContext共计耗时 "+(l2 - l1), objArray2);
                if (!PatchProxy.applyVoid(null, uob, VideoEditPreviewV3Fragment.class, "20")) {
                   objArray2 = new Object[0];
                   a.D().w(str2, "restoreSameFrameInfoFromVideoContext hasSameFrameFeature:"+this.Vh()+"mSameFrameOriginPhotoId:"+uob.i1+",mAvailableSameFrameDepth:"+uob.k1, objArray2);
                   if (this.Vh() && TextUtils.isEmpty(uob.i1)) {
                      i = -1;
                      if (uob.k1 == i) {
                         uob.i1 = la.f(uob.L.e());
                         uob.j1 = la.e(uob.L.e());
                         uob.k1 = a1.s(la.d(uob.L.e()), i);
                      }
                   }
                }
                objArray2 = new Object[0];
                a.D().w("EditCost", "读取同框信息耗时 "+(System.currentTimeMillis() - l2), objArray2);
                boolean b = DraftUtils.n0(uob.M.T0());
                uob.o1 = b;
                if (!b) {
                   t4.a(uob.M, this.Qh(), uob.L.e());
                   objArray1 = new Object[0];
                   a.D().w("EditCost", "组建comment耗时 "+(System.currentTimeMillis() - l2), objArray1);
                }
                uob.D1 = j0.e(intent1, "INTENT_EDITOR_SPLASH_IMAGE_INFO");
                uob.A1 = n.j(this.getActivity());
                uob.B1 = n.k(this.getActivity());
                uob.C1 = u6.a(this.getActivity(), 0);
                uob.s1 = i.m().p().w(new q0(uob, l1), new k2(uob), new n2(uob), new i2(uob));
             }
          }
          return;
       }
    }
    public boolean ra(boolean p0){
       BaseEditorFragment obj;
       if (PatchProxy.isSupport(VideoEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, VideoEditPreviewV3Fragment.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.getActivity() != null && !this.getActivity().V3(this)) {
          return false;
       }else {
          Object[] objArray = new Object[false];
          a.D().w("EditCostVideoEditPreviewV3Fragment", "onBackPressed", objArray);
          PostCommonFunnel.b.b(null, "video_preview_back_press");
          this.Q.s0(j0.a);
          if (!this.isAdded()) {
             return false;
          }else {
             obj = this.B;
             if (obj != null && obj.A()) {
                return true;
             }else if(this.G1.s0().d() == EditorFragmentBackPressedResult.INTERCEPT_EVENT){
                return true;
             }else if(EditAbilityConfig.enableBackDialog(i.g())){
                return this.T4(true);
             }else if(!EditAbilityConfig.enableDraft(i.g())){
                this.Mh(2, null);
                return true;
             }else if(p0){
                this.Lh(true);
             }
             return false;
          }
       }
    }
    public void v9(ClientContent$VideoEditFeaturesStatusPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment.class, "51")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "fillVideoEditFeaturesStatusPackage", objArray);
       if (this.B != null) {
          s.b(p0, this.I1.getValue());
       }
       return;
    }
}
