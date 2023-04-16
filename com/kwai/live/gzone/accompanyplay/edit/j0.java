package com.kwai.live.gzone.accompanyplay.edit.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n37.l1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.anchor.m$a;
import com.kwai.live.gzone.accompanyplay.edit.j0$c;
import sfc.a;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kwai.live.gzone.accompanyplay.edit.j0$d;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.edit.i0;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import n37.k;
import java.util.HashMap;
import com.kwai.library.widget.popup.common.c;
import lnc.b9;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View$OnKeyListener;
import android.view.View$OnTouchListener;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import n37.f0;
import java.util.ArrayList;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import fq5.b;
import j37.b;
import j37.a;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.j0$g;
import com.kwai.live.gzone.accompanyplay.edit.j0$f;
import n37.y0;
import erd.a;
import io.reactivex.internal.functions.Functions;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import mkc.b;
import mkc.c;
import com.kwai.live.gzone.accompanyplay.edit.h0;
import com.kwai.live.gzone.accompanyplay.edit.j0$e;
import u07.t$a;
import android.app.Activity;
import lnc.a1;
import n37.w0;
import u07.u;
import n37.v0;
import u07.f;
import n37.o1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import e17.i;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserGameInfoResponse$FollowOfficialAccount;
import android.widget.ImageView;
import jga.f$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import n37.a;
import dj2.b;
import n37.n1;
import n37.q1;
import com.kwai.live.gzone.accompanyplay.edit.n;
import com.kwai.live.gzone.accompanyplay.edit.j0$h;
import n37.x0;
import com.kwai.live.gzone.accompanyplay.edit.n$a;
import h37.n0;
import io.reactivex.subjects.PublishSubject;
import n37.f1;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import n37.k1;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.j0$a;
import com.kwai.live.gzone.accompanyplay.edit.j0$b;
import n37.j1;
import n37.i1;
import n37.u0;
import n37.e1;
import n37.g1;
import n37.h1;
import n37.b;
import com.kwai.live.gzone.accompanyplay.edit.g0;

public class j0 extends PresenterV2	// class@000c02
{
    public View A;
    public View B;
    public View C;
    public g0 D;
    public m$a E;
    public m F;
    public k G;
    public f0 H;
    public c I;
    public c J;
    public c K;
    public c L;
    public b M;
    public b N;
    public View$OnKeyListener O;
    public int p;
    public ViewGroup q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public ImageView x;
    public RecyclerView y;
    public KwaiImageView z;

    public void j0(){
       super();
       this.O = new l1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       j0 tE = this.E;
       if (tE != null) {
          this.X7(tE.a().subscribe(new j0$c(this), new a()));
       }
       this.X7(this.F.m.subscribe(new j0$d(this)));
       if (this.F.c != null) {
          this.A.setVisibility(0);
       }
       if (!TextUtils.x(this.F.n)) {
          this.r.setText(this.F.n);
       }
       this.t.setText(this.F.b);
       f.F(this.q, new i0(this));
       this.X8();
       return;
    }
    public void J8(){
       j0 oj0 = j0.class;
       if (PatchProxy.applyVoid(null, this, oj0, "12")) {
          return;
       }
       this.y.setAdapter(null);
       j0 tG = this.G;
       if (tG != null) {
          tG.m.clear();
       }
       this.W8();
       this.V8();
       if (!PatchProxy.applyVoid(null, this, oj0, "26")) {
          tG = this.K;
          if (tG != null) {
             tG.o();
             this.K = null;
          }
       }
       if (!PatchProxy.applyVoid(null, this, oj0, "13")) {
          oj0 = this.L;
          if (oj0 != null) {
             oj0.o();
             this.L = null;
          }
       }
       b9.a(this.M);
       b9.a(this.N);
       if (this.q.getParent() != null) {
          this.d9(this.q.getParent(), null);
          this.q.getParent().setOnTouchListener(null);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "23")) {
          return;
       }
       j0 tG = this.G;
       LiveGzoneAccompanyFleetSetting liveGzoneAcc = tG.m.get(tG.d);
       if (liveGzoneAcc == null) {
          return;
       }
       if (this.F.d != null) {
          this.s.setVisibility(0);
          this.s.setText(liveGzoneAcc.mEditingTitle);
       }
       this.e9();
       if (this.H == null) {
          f0 uof0 = new f0(this.F, this.G);
          this.H = uof0;
          this.y.setAdapter(uof0);
       }
       liveGzoneAcc = liveGzoneAcc.mFleetSettingItems;
       if (liveGzoneAcc == null) {
          this.H.W0(new ArrayList());
       }else {
          this.H.W0(liveGzoneAcc);
       }
       this.H.k0();
       return;
    }
    public final boolean R8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       LiveGzoneAccompanyFleetSetting liveGzoneAcc = obj.m.get(obj.d);
       boolean b = true;
       Iterator iterator = liveGzoneAcc.mFleetSettingItems.iterator();
       while (iterator.hasNext()) {
          if (TextUtils.x(iterator.next().mEditingItemValue)) {
             b = false;
          }
       }
       if (this.G.b.mEnableOneClick != null && liveGzoneAcc.mEditingGameAccountInfo == null) {
          b = false;
       }
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "6")) {
          return;
       }
       b9.a(this.N);
       String liveStreamId = this.F.o.getLiveStreamId();
       if (!TextUtils.x(liveStreamId)) {
          this.N = a.b().d(liveStreamId).map(new e()).doOnSubscribe(new j0$g(this)).flatMap(new j0$f(this)).doFinally(new y0(this)).subscribe(Functions.d(), Functions.e);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "25")) {
          return;
       }
       j0 tJ = this.J;
       if (tJ != null) {
          tJ.o();
          this.J = null;
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "11")) {
          return;
       }
       j0 tI = this.I;
       if (tI != null) {
          tI.q(0);
          this.I = null;
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "4")) {
          return;
       }
       this.C.setVisibility(0);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.b();
       b[] uobArray = new b[]{b.g};
       c.d(this.C, uobArray);
       c.e(this.C, b.d, uoa);
       b9.a(this.M);
       this.M = this.F.l.subscribe(new h0(this), new j0$e(this));
       return;
    }
    public final void Y8(){
       m t;
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "14")) {
          return;
       }
       j0 tG = this.G;
       if (tG != null && (tG.a == null || !tG.m.get(tG.d).isItemValueChanged())) {
          this.D.o();
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oj0, "24")){
          this.V8();
          t$a uoa = new t$a(this.getActivity());
          String str = (TextUtils.x(this.F.r))? a1.p(R.string.arg_RES_7f1023dc): this.F.r;
          uoa.X0(str);
          str = (TextUtils.x(this.F.s))? a1.p(R.string.arg_RES_7f102331): this.F.s;
          uoa.T0(str);
          str = (TextUtils.x(this.F.t))? a1.p(R.string.arg_RES_7f10232f): this.F.t;
          uoa.R0(str);
          uoa.u0(new w0(this));
          uoa.t0(new v0(this));
          this.J = f.e(uoa).Y(new o1(this));
       }
       return;
    }
    public void Z8(boolean p0,boolean p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oj0, "17")) {
          return;
       }
       oj0 = this.G;
       Object obj = oj0.m.get(oj0.d);
       if (obj == null) {
          return;
       }
       Iterator iterator = obj.mFleetSettingItems.iterator();
       boolean b = true;
       j0 oj01 = 1;
       GifshowActivity gifshowActiv = 1;
       while (iterator.hasNext()) {
          if (TextUtils.x(iterator.next().mEditingItemValue)) {
             gifshowActiv = null;
          }else {
             oj01 = null;
          }
       }
       int i = 0x7f11066a;
       if (oj01 && !TextUtils.x(this.F.i)) {
          i.d(i, this.F.i);
          return;
       }else {
          int i1 = 0x7f10234c;
          if (this.G.b.mEnableOneClick != null) {
             if (!this.R8() && p1) {
                i.a(i, R.string.arg_RES_7f10234b);
                return;
             }else if(!gifshowActiv){
                i.a(i, i1);
                return;
             }
          }else if(gifshowActiv == null){
             i.a(i, i1);
             return;
          }
          k e = this.G.e;
          if (e != null && (!TextUtils.x(e.mAccountId) && this.x.isSelected())) {
             f$a uoa = new f$a(this.G.e.mAccountId, this.getActivity().Q2());
             uoa.q(b);
             FollowHelper.c(uoa.b(), null);
          }
          j0 tG = this.G;
          this.F.p.a(this.G.a.mFleetSettingList.indexOf(obj), obj, tG.b, tG, p1, p0);
          return;
       }
    }
    public final void a9(){
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "15")) {
          return;
       }
       if (this.x.isSelected()) {
          j0 tF = this.F;
          if (tF.v != null) {
             tF.v = false;
             if (!PatchProxy.applyVoid(objArray, this, oj0, "19")) {
                t$a uoa = new t$a(this.getActivity());
                uoa.X0(a1.r(R.string.arg_RES_7f1023d7, this.G.e.mAccountName));
                uoa.S0(R.string.arg_RES_7f1023c9);
                uoa.Q0(R.string.arg_RES_7f102327);
                uoa.u0(b.b);
                uoa.t0(new n1(this));
                this.L = f.e(uoa).Y(new q1(this));
             }
          }else {
             this.h9(false);
          }
       }else {
          this.h9(true);
       }
       return;
    }
    public final void b9(LiveGzoneAccompanyFleetSetting p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "20")) {
          return;
       }
       c$b uob = new c$b(this.getActivity());
       uob.M(new j0$h(this));
       n on = new n(uob, new x0(this, p0));
       on.Z();
       this.K = on;
       j0 tG = this.G;
       n0.b(this.F.w, "FLEET_PLAN_MODIFY_NAME_BUTTON", tG.b, tG.a.mFleetSettingList.indexOf(p0), p0.mFleetTitle);
       return;
    }
    public final void c9(LiveGzoneAccompanyFleetSetting p0,String p1){
       j0 oj0 = j0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oj0, "21")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, oj0, "22")) {
          p0.mEditingTitle = p1;
          this.G.i.onNext(p0.mFleetId);
       }
       if (p0.mIsEmptyFleet == null) {
          this.X7(a.b().k(this.G.b.mGameId, p0.mFleetId, p0.mEditingTitle).map(new e()).subscribe(new f1(p0), Functions.e));
       }
       return;
    }
    public final void d9(ViewGroup p0,View$OnKeyListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0.class, "27")) {
          return;
       }
       p0.setOnKeyListener(p1);
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup) {
             this.d9(childAt, p1);
          }else {
             childAt.setOnKeyListener(p1);
          }
          i = i + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.p = c.b(p0.getResources(), 0x7f0707af);
       this.q = p0.findViewById(0x7f0a1de9);
       this.C = p0.findViewById(0x7f0a1da8);
       this.A = p0.findViewById(0x7f0a1dde);
       this.z = p0.findViewById(0x7f0a1ddf);
       this.r = p0.findViewById(0x7f0a1de8);
       this.s = p0.findViewById(0x7f0a1de6);
       this.w = p0.findViewById(0x7f0a1de1);
       this.x = p0.findViewById(0x7f0a1de0);
       this.B = p0.findViewById(0x7f0a1de3);
       this.t = p0.findViewById(0x7f0a1dda);
       this.u = p0.findViewById(0x7f0a1de2);
       this.v = p0.findViewById(0x7f0a1de4);
       RecyclerView recyclerView = p0.findViewById(R.id.live_gzone_anchor_fleet_edit_recycler_view);
       this.y = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
       this.y.setNestedScrollingEnabled(false);
       this.y.addItemDecoration(new b(1, n.c(this.getContext(), 16.00f), n.c(this.getContext(), 16.00f), n.c(this.getContext(), 24.00f)));
       int[] ointArray = new int[]{a1.a(0x7f0613f1),a1.a(0x7f0613ef),a1.a(0x7f0613f0)};
       p0.findViewById(R.id.live_gzone_accompany_fleet_bottom_mask_view).setBackground(new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray));
       this.s.setOnClickListener(new k1(this));
       this.t.setOnClickListener(new j0$a(this));
       this.u.setOnClickListener(new j0$b(this));
       this.v.setOnClickListener(new j1(this));
       this.B.setOnClickListener(new i1(this));
       this.w.setOnClickListener(new u0(this));
       this.x.setOnClickListener(new e1(this));
       this.x.setSelected(false);
       this.A.setOnClickListener(new g1(this));
       p0.findViewById(R.id.live_gzone_anchor_accompany_fleet_rule_image_view).setOnClickListener(new h1(this));
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, j0.class, "8")) {
          return;
       }
       int i = 0;
       if (this.F.q != null) {
          j0 tG = this.G;
          LiveGzoneAccompanyFleetSetting liveGzoneAcc = tG.m.get(tG.d);
          if (this.G.b.mEnableOneClick != null && this.F.q.a(liveGzoneAcc)) {
             this.u.setVisibility(i);
             this.u.setText(R.string.arg_RES_7f1023be);
             this.v.setVisibility(i);
             this.v.setText(R.string.arg_RES_7f10233b);
             if (this.F.q.c(liveGzoneAcc)) {
                this.u.setSelected(true);
             }else {
                this.u.setSelected(i);
             }
             if (this.R8()) {
                this.v.setAlpha(0x3f800000);
             }else {
                this.v.setAlpha(0x3f000000);
             }
             this.t.setVisibility(8);
          }else {
             String str = this.F.q.b(liveGzoneAcc);
             this.t.setVisibility(i);
             this.v.setVisibility(8);
             this.u.setVisibility(8);
             if (!TextUtils.n(this.t.getText(), str)) {
                this.t.setText(str);
             }
          }
       }else {
          this.t.setVisibility(i);
       }
       return;
    }
    public final void h9(boolean p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj0, "16")) {
          return;
       }
       if (p0) {
          this.x.setImageResource(R.drawable.arg_RES_7f0811f9);
          this.x.setSelected(true);
       }else {
          this.x.setSelected(false);
          this.x.setImageResource(R.drawable.arg_RES_7f0811fa);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.D = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_POPUP");
       this.F = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_PARAMS");
       this.E = this.s8(m$a.class);
       return;
    }
}
