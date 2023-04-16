package com.yxcorp.gifshow.v3.editor.magicfinger.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.magicfinger.o$a;
import kwc.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import android.widget.TextView;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import k17.b;
import com.yxcorp.gifshow.v3.editor.magicfinger.i;
import nrc.j;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import brd.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.j;
import erd.o;
import com.yxcorp.gifshow.v3.editor.magicfinger.k;
import erd.r;
import nrc.l;
import com.yxcorp.gifshow.v3.editor.magicfinger.n;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import nrc.n;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import nrc.i;
import android.view.View$OnTouchListener;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import nrc.k;
import com.yxcorp.gifshow.v3.editor.magicfinger.m;
import lnc.b9;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import k2b.s$b;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import nrc.a;
import qr4.e$n;
import com.yxcorp.gifshow.v3.editor.magicfinger.model.MagicFingerItem;
import qr4.e$q;
import com.yxcorp.gifshow.widget.adv.c;
import ekd.q;
import qr4.i;
import qr4.e$h;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import com.yxcorp.gifshow.v3.f;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import lnc.a1;
import nrc.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import nrc.f;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.editor.magicfinger.o$b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import java.lang.Double;
import x6b.a;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.j;
import com.yxcorp.gifshow.v3.editor.magicfinger.o$c;
import ekd.k1;
import java.lang.CharSequence;
import bld.b;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.v3.editor.k;
import com.yxcorp.gifshow.v3.editor.magicfinger.l;
import p16.c;
import android.graphics.Bitmap;
import java.util.Objects;
import java.lang.Math;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.app.Activity;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import ooc.f1;
import ekd.m1;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import nrc.g;
import nrc.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment;
import java.lang.Integer;
import cba.a;
import com.kwai.video.editorsdk2.PreviewPlayer;

public class o extends PresenterV2	// class@001040
{
    public int A;
    public String B;
    public String C;
    public Set D;
    public i E;
    public BaseEditor$EditorShowMode F;
    public a G;
    public a H;
    public i I;
    public MagicFingerItem J;
    public int K;
    public PreviewEventListenerV2 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public double R;
    public Minecraft$TimeEffectParam S;
    public int T;
    public boolean U;
    public boolean V;
    public b W;
    public y X;
    public ScrollToCenterRecyclerView p;
    public TimelineCoreView q;
    public View r;
    public TextView s;
    public LinearLayout t;
    public TextView u;
    public ImageView v;
    public View w;
    public TextView x;
    public c y;
    public MagicFingerFragment z;

    public void o(){
       super();
       this.N = false;
       this.O = false;
       this.P = false;
       this.Q = false;
       this.T = 0;
       this.U = false;
       this.V = false;
       this.X = new o$a(this);
       this.U7(new u());
    }
    public void E8(){
       int b;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       this.D.add(this.X);
       i obj = PatchProxy.apply(objArray, this, oo, "4");
       n on = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          o ty = this.y;
          if (ty == null || (ty.v() != null && DraftUtils.n0(this.y.T0()))) {
             List assetsList = this.y.v().getAssetsList();
             if (assetsList != null && assetsList.size()) {
                Iterator iterator = assetsList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().getSpeed() - 0x3ff0000000000000) {
                         b = true;
                         break ;
                      }
                   }
                }
             }
          }
          b = false;
       }
       this.V = b;
       if (b) {
          this.s.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "6")) {
          b = n.c(a.a().a(), 9.00f);
          if (this.p.getLayoutManager() == null) {
             this.p.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), false, false));
          }
          if (this.p.getItemDecorationCount() > 0) {
             this.p.removeItemDecorationAt(false);
          }
          obj = new i();
          this.I = obj;
          obj.i = new j(this);
          this.p.addItemDecoration(new b(false, n.c(a.a().a(), 5.00f), false, b));
          this.p.setLayoutFrozen(false);
          this.p.setAdapter(this.I);
          this.p.setHasFixedSize(on);
          this.Z8();
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "25")) {
          h.p(this.G).s(j.b).h(k.b).A(new l(this), n.b);
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "8") && this.E != null) {
          this.q.b(false);
          if (this.K == null) {
             this.Y8(false);
          }
          if (this.L == null) {
             this.L = new n(this);
          }
          this.P8().setPreviewEventListener(this.C, this.L);
          this.w.setOnTouchListener(new i(this));
          this.V8();
       }
       this.q.a();
       this.x.setText(R.string.arg_RES_7f100b89);
       if (this.F == BaseEditor$EditorShowMode.SHOW_FOREGROUND) {
          this.a9();
       }
       this.W = this.z.m().subscribe(new k(this), m.b);
       return;
    }
    public void J8(){
       o tE;
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, oo, "5")) {
          return;
       }
       this.D.remove(this.X);
       b9.a(this.W);
       if (!PatchProxy.applyVoid(null, this, oo, "20")) {
          tE = this.t;
          if (tE != null) {
             tE.setVisibility(8);
          }
       }
       tE = this.E;
       if (tE != null) {
          s$b uob = tE.f().a(EditorDelegate$ShowLoggerType.MAGIC_FINGER);
          if (uob != null) {
             o tp = this.p;
             if (tp != null) {
                uob.c(tp);
             }
          }
          VideoContext videoContext = this.E.f().x().e();
          if (PatchProxy.applyVoidOneRefs(videoContext, this, oo, "23") || (this.S8() != null && videoContext != null)) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(this.S8().g);
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (!uoa.d() instanceof a) {
                   continue ;
                }
                uoa = uoa.d();
                e$n on = new e$n();
                on.a = uoa.j.mFilterName;
                e$q oq = new e$q();
                on.b = oq;
                oq.a = uoa.c();
                on.b.b = uoa.d();
                uArrayList1.add(on);
             }
             if (!q.f(uArrayList1)) {
                e$n[] onArray = new e$n[false];
                videoContext.F().d.p = uArrayList1.toArray(onArray);
             }
          }
          this.P8().setPreviewEventListener(this.C, null);
          if (!PatchProxy.applyVoid(null, this, oo, "22") && this.S != null) {
             this.P8().getVideoProject().setTimeEffect(this.S);
             this.P8().sendChangeToPlayer(false);
             this.S = null;
          }
       }
    label_00fb :
       return;
    }
    public VideoSDKPlayerView P8(){
       Object obj = PatchProxy.apply(null, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.n(this.E.f());
    }
    public final ViewGroup R8(){
       Object obj = PatchProxy.apply(null, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.f().J();
    }
    public final f S8(){
       Object obj = PatchProxy.apply(null, this, o.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.i();
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "9")) {
          return;
       }
       o tE = this.E;
       if (tE != null && tE.i() != null) {
          this.E.i().i.b(this.q.getCenterIndicator(), objArray);
          this.E.i().i.d = a1.d(0x7f070d66);
          this.E.i().i.l = true;
          this.q.getPlayStatusView().setOnClickListener(new d(this));
          this.q.getTimeLineView().e(this.E.i().i);
          this.q.postDelayed(new f(this), 100);
          this.q.getTimeLineView().setTimelineListener(new o$b(this));
          this.q.getTimeLineView().k(this.E.i().d()).E();
          this.P8().seekTo(this.R);
          this.R = 0;
       }
       return;
    }
    public final void W8(EditorSdk2V2$VideoEditorProject p0,double p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Double.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, o.class, "11")) {
          return;
       }
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), Boolean.valueOf(p3), null, a.class, "8") && !j.h(p0.trackAssets().toNormalArray()))) {
          Iterator iterator = p0.trackAssets().iterator();
          while (iterator.hasNext()) {
             EditorSdk2V2$TrackAsset trackAsset = iterator.next();
             if (trackAsset.assetSpeed() - 0x3ff0000000000000 && !p3) {
                continue ;
             }
             trackAsset.setAssetSpeed(p1);
          }
       }
       if (p2 && this.E != null) {
          this.P8().sendChangeToPlayer(false);
       }
       return;
    }
    public void X8(boolean p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oo, "16")) {
          return;
       }
       oo = this.E;
       if (oo == null) {
          return;
       }
       if (this.V != null) {
          return;
       }
       this.W8(oo.f().x().f(), 0x3ff0000000000000, p1, true);
       if (p0) {
          k1.r(new o$c(this), 200);
       }else {
          this.s.setText("1.0x");
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060759));
          uob.s(DrawableCreator$Shape.Oval);
          this.s.setBackground(uob.a());
       }
       return;
    }
    public final void Y8(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "29")) {
          return;
       }
       this.r.setEnabled(p0);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       int i = n.c(a.a().a(), 50.00f);
       o tI = this.I;
       Bitmap uBitmap = k.f().c(0, i, i, new l(this), true, false);
       Objects.requireNonNull(tI);
       if (!PatchProxy.applyVoidOneRefs(uBitmap, tI, i.class, "4")) {
          if (uBitmap != null) {
             uBitmap = BitmapUtil.o(uBitmap, Math.min(uBitmap.getWidth(), uBitmap.getHeight()), Math.min(uBitmap.getWidth(), uBitmap.getHeight()));
          }
          tI.f = uBitmap;
          tI.k0();
       }
       return;
    }
    public final void a9(){
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, oo, "17")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       this.P8().pause();
       boolean b = false;
       this.P8().setLoop(b);
       if (!PatchProxy.applyVoid(null, this, oo, "18") && (this.E != null && this.S == null)) {
          this.S = this.P8().getVideoProject().timeEffect();
          this.P8().getVideoProject().setTimeEffect(null);
          this.P8().sendChangeToPlayer(b);
       }
    label_0051 :
       this.V8();
       if (this.S8() != null) {
          this.K = this.S8().g.size();
       }
       if (this.K > null) {
          b = true;
       }
       this.Y8(b);
       return;
    }
    public void b9(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "19")) {
          return;
       }
       if (this.t != null && this.P != null) {
          int i = n.j(this.getActivity());
          Context context = this.getContext();
          int i1 = (p0)? 116: 15;
          i = (i - n.c(context, (float)(i1 + 220))) / 2;
          i1 = 0;
          this.t.setVisibility(i1);
          o tv = this.v;
          if (!p0) {
             i1 = 8;
          }
          tv.setVisibility(i1);
          RelativeLayout$LayoutParams layoutParams = this.t.getLayoutParams();
          layoutParams.topMargin = i;
          this.t.setLayoutParams(layoutParams);
       }
       return;
    }
    public void c9(VideoSDKPlayerView p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oo, "12")) {
          return;
       }
       if (this.H != null && Math.abs((p0.getCurrentTime() - this.H.h())) - Math.abs(this.H.j()) > 0) {
          this.H.E((p0.getCurrentTime() - this.H.h()));
          this.q.getTimeLineView().h(this.H);
       }
       f1.a(this.q.getTimeLineView(), p0.getCurrentTime(), false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a41cc);
       this.r = m1.f(p0, 0x7f0a4327);
       this.w = m1.f(p0, 0x7f0a4030);
       this.u = m1.f(p0, 0x7f0a3f23);
       this.s = m1.f(p0, 0x7f0a3aaf);
       this.q = m1.f(p0, 0x7f0a3ef8);
       this.t = m1.f(p0, 0x7f0a3f0e);
       this.p = m1.f(p0, 0x7f0a34df);
       this.v = m1.f(p0, 0x7f0a3f18);
       m1.a(p0, new g(this), R.id.undo_btn);
       m1.a(p0, new h(this), R.id.speed_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.y = this.r8("WORKSPACE");
       this.z = this.r8("FRAGMENT");
       this.A = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.B = this.r8("SUB_TYPE");
       this.C = this.r8("PAGE_TAG");
       this.D = this.r8("EDITOR_VIEW_LISTENERS");
       this.E = this.r8("EDITOR_HELPER_CONTRACT");
       this.F = this.r8("EDITOR_SHOW_MODE");
       this.G = this.r8("SCRAWL");
       return;
    }
    public void onClick(View p0){
       o tE;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "10")) {
          return;
       }
       int i = 1;
       if (p0.getId() == 0x7f0a4327) {
          ArrayList uArrayList = new ArrayList(this.q.getTimeLineView().getNormalViewModels());
          f uof = this.S8();
          if (!uArrayList.isEmpty() && (uof != null && !uof.g.isEmpty())) {
             uof = uof.g;
             a uoa = uof.remove((uof.size() - i));
             ITimelineView$IRangeView$a iRangeView$a = null;
             Iterator iterator = uArrayList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ITimelineView$IRangeView$a iRangeView$a1 = iterator.next();
                   if (uoa.e() == iRangeView$a1.e()) {
                      iRangeView$a = iRangeView$a1;
                   }
                }
                if (iRangeView$a != null) {
                   uArrayList.remove(iRangeView$a);
                }
                this.q.getTimeLineView().k(uArrayList).E();
                tE = this.E;
                if (tE != null) {
                   tE.f();
                   if (iRangeView$a != null) {
                      this.P8().seekTo(iRangeView$a.h());
                   }
                   if (this.P8().getPlayer() != null) {
                      this.P8().getPlayer().undoMagicTouch(i);
                   }
                   this.P8().storeMagicTouchDataToProject(false);
                   this.P8().sendChangeToPlayer(false);
                   this.P8().pause();
                }
                this.U = false;
             }
          }
       label_00b4 :
          tE = this.K;
          if (tE > null) {
             this.K = tE - i;
          }
          if (this.K == null) {
             this.Y8(false);
          }
       }else if(p0.getId() == 0x7f0a3aaf){
          if (this.s.getText().equals("1.0x")) {
             this.E.f();
             this.s.setText("0.5x");
             b uob = new b();
             uob.v(a1.a(R.color.arg_RES_7f0604c8));
             uob.s(DrawableCreator$Shape.Oval);
             this.s.setBackground(uob.a());
             this.W8(this.E.f().x().f(), 0x3fe0000000000000, true, false);
          }else {
             this.X8(false, i);
          }
       }
       return;
    }
}
