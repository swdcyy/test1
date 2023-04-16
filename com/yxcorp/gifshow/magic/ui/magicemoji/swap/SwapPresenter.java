package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.video.westeros.models.EffectDescription;
import uyb.m;
import q4b.d;
import java.util.ArrayList;
import eoc.f$a;
import i5b.h;
import i5b.c;
import z69.t;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d$a;
import i5b.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i5b.c0;
import msd.a;
import s5b.b;
import q87.c;
import i5b.l0;
import lq.f;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i5b.a0;
import i5b.i0;
import j4b.m;
import i5b.k0;
import eoc.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import i5b.n;
import i5b.z;
import i5b.o;
import i5b.h0;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$d;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SelectMediaMode;
import java.lang.Enum;
import java.util.Objects;
import i5b.e;
import i5b.c$a;
import com.kwai.video.westeros.models.ServerProcessingInfo;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.yxcorp.gifshow.magic.data.swap.models.SwapQMedia;
import h4b.a;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import u07.t$a;
import q5b.f;
import i5b.e0;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import android.view.View;
import com.yxcorp.utility.n;
import android.util.Pair;
import java.lang.Boolean;
import mrd.a;
import android.widget.TextView;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.models.QMedia;
import g9c.a;
import i5b.j;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import i5b.d0;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$c;
import lnc.b9;
import x79.e;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption$a;
import uxb.o;
import w69.h0;
import w69.j;
import t45.d;
import brd.z;
import i5b.j0;
import i5b.g0;
import erd.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.g;
import i5b.b0;
import io.reactivex.subjects.PublishSubject;
import i5b.m;
import java.io.File;
import i5b.y;
import java.lang.StringBuilder;
import lnc.a1;

public class SwapPresenter extends a	// class@001c2d
{
    public List A;
    public List B;
    public List C;
    public b D;
    public b E;
    public final f$a F;
    public LinearLayoutManager G;
    public int H;
    public int I;
    public int J;
    public int K;
    public h0 L;
    public final h M;
    public final c N;
    public MagicEmoji$MagicFace O;
    public t P;
    public d$a Q;
    public final d R;
    public final i S;
    public final DefaultLifecycleObserver T;
    public a r;
    public PublishSubject s;
    public PublishSubject t;
    public a u;
    public View v;
    public View w;
    public TextView x;
    public View y;
    public FadeEdgeShaderRecyclerView z;
    public static final int U;

    public void SwapPresenter(EffectDescription p0,m p1,d p2){
       super();
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.C = new ArrayList();
       this.F = new f$a();
       this.J = -1;
       h oh = new h();
       this.M = oh;
       c uoc = new c();
       this.N = uoc;
       this.P = new t(new Handler(Looper.getMainLooper()));
       this.Q = new SwapPresenter$a(this);
       d uod = new d(this.Q);
       this.R = uod;
       this.S = new i(oh, uoc, uod);
       this.T = new SwapPresenter$2(this);
       this.j9(p0);
       oh.f = p1;
       oh.i = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "5")) {
          return;
       }
       this.M.j(new c0(this));
       Object[] objArray = new Object[0];
       b.D().w("SwapPresenter", "onBind", objArray);
       this.S8();
       this.X7(this.r.subscribe(new l0(this), f.b));
       this.X7(this.s.subscribe(new a0(this), f.b));
       this.X7(this.t.subscribe(new i0(this)));
       this.X7(f.a(m.class, new k0(this)));
       this.M.b().getLifecycle().addObserver(this.T);
       this.F.a(f.a(n.class, new z(this)));
       this.F.a(f.a(o.class, new h0(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SwapPresenter.class, "6")) {
          return;
       }
       this.Y8(false);
       this.M.j(objArray);
       this.S.dispose();
       this.F.b();
       this.P.c();
       this.M.b().getLifecycle().removeObserver(this.T);
       this.A.clear();
       this.B.clear();
       this.C.clear();
       return;
    }
    public final int R8(){
       Object obj = PatchProxy.apply(null, this, SwapPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.M.a() == null) {
          return 2;
       }
       int i = SwapPresenter$d.a[this.N.h().ordinal()];
       int i1 = 1;
       if (i == i1 || i == 2) {
          return i1;
       }
       if (i != 3 && i != 4) {
          return 2;
       }
       return 0;
    }
    public final void S8(){
       Object[] objArray = null;
       String str = "9";
       if (PatchProxy.applyVoid(objArray, this, SwapPresenter.class, str)) {
          return;
       }
       SwapPresenter tS = this.S;
       EffectDescription uEffectDescr = this.M.a();
       Objects.requireNonNull(tS);
       if (!PatchProxy.applyVoidOneRefs(uEffectDescr, tS, i.class, str)) {
          i c = tS.c;
          if (c != null) {
             c.dispose();
          }
          if (uEffectDescr != null && c.k.a(uEffectDescr).f()) {
             ServerProcessingInfo serverProces = uEffectDescr.getServerProcessingInfo();
             a.o(serverProces, "effectDescription.serverProcessingInfo");
             String serviceType = serverProces.getServiceType();
             i oi = (serviceType == null || !serviceType.length())? 1: null;
             if (oi) {
                oi = tS.b;
             }else {
                oi = tS.a;
             }
          }
          tS.c = objArray;
       }
       if (this.N.f()) {
          this.Y8(true);
          this.A.clear();
          if (!q.f(this.N.b()) && !this.N.j()) {
             Iterator iterator = this.N.b().iterator();
             while (iterator.hasNext()) {
                this.A.add(a.a(iterator.next(), true));
             }
          }
          if (!q.f(this.A)) {
             tS = this.A;
             if (tS.get((tS.size() - true)) instanceof SwapQMedia) {
                tS = this.A;
                tS.get((tS.size() - true)).mNeedShowDivider = true;
             }
          }
          if (!PermissionUtils.a(this.getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
             this.C.clear();
             this.C.addAll(this.A);
             this.C.add(new SwapQMedia(2));
             this.e9();
             this.k9(this.C, false);
             return;
          }else {
             this.h9(false, 70);
          }
       }else {
          this.Y8(false);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "12")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(R.string.arg_RES_7f10314d);
       int i = (f.a())? 0x7f10314c: 0x7f10314b;
       uoa.y0(i);
       uoa.S0(R.string.arg_RES_7f10314a);
       uoa.Q0(R.string.arg_RES_7f103149);
       uoa.u0(new e0(this));
       uoa.z(false);
       j.d(uoa);
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "21")) {
          return;
       }
       n.Y(this.y, 8, false);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "23")) {
          return;
       }
       if (this.x != null) {
          this.u.onNext(new Pair("SWAP_COMPLETE_SHOW_EVENT", Boolean.FALSE));
          this.x.setVisibility(8);
          this.x.setClickable(false);
       }
       return;
    }
    public final void Y8(boolean p0){
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(swapPresente) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, swapPresente, "18")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.Z8();
       boolean b = false;
       n.Y(this.v, 8, b);
       this.W8();
       this.X8();
       this.M.m(-1);
       this.M.l(b);
       this.M.c().clear();
       this.H = b;
       this.I = b;
       this.J = -1;
       this.R.v1(-1);
       this.R.u1().clear();
       this.z.scrollToPosition(b);
       this.R.k0();
       this.M.n(null);
       if (!p0) {
          this.u.onNext(new Pair("SWAP_IMAGE_SHOW_EVENT", Boolean.FALSE));
       }
       return;
    }
    public final void Z8(){
       int i3;
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "32")) {
          return;
       }
       if (q.f(this.R.Q0()) || (this.R.Q0().size() >= this.H && this.I > null)) {
          ArrayList uArrayList = new ArrayList();
          for (SwapPresenter tH = this.H; tH <= this.I && tH < this.R.Q0().size(); tH = tH + 1) {
             uArrayList.add(this.R.N0(tH));
          }
          j a = j.a;
          BaseFragment uBaseFragmen = this.M.b();
          SwapPresenter tH1 = this.H;
          String str = this.M.h();
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, uArrayList, Integer.valueOf(tH1), str, a, j.class, "2")) {
             a.p(uBaseFragmen, "page");
             a.p(uArrayList, "logItems");
             a.p(str, "magicId");
             if (!q.f(uArrayList)) {
                ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
                ArrayList uArrayList1 = new ArrayList();
                int i = uArrayList.size();
                int i1 = 0;
                int i2 = 0;
                while (i2 < i) {
                   i3 = i2 + 1;
                   int i4 = i3 + tH1;
                   ClientContent$MoreInfoPackageV2 moreInfoPack = a.a(i4, uArrayList.get(i2));
                   if (moreInfoPack != null) {
                      uArrayList1.add(moreInfoPack);
                   }
                   i2 = i3;
                }
                if (!q.f(uArrayList1)) {
                   ClientContent$MoreInfoPackageV2[] moreInfoPack1 = new ClientContent$MoreInfoPackageV2[uArrayList1.size()];
                   i = uArrayList1.size();
                   for (; i1 < i; i1 = i1 + 1) {
                      moreInfoPack1[i1] = uArrayList1.get(i1);
                   }
                   uBatchMoreIn.moreInfoPackage = moreInfoPack1;
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.batchMoreInfoPackage = uBatchMoreIn;
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "PRODUCE_MAGIC_FACE_ALBUM";
                   i3 oi3 = i3.f();
                   oi3.d("magic_face_id", str);
                   a.o(oi3, "JsonStringBuilder.newIns¡­\"magic_face_id\", magicId\)");
                   uElementPack.params = oi3.e();
                   u1.C0("", uBaseFragmen, 3, uElementPack, uContentPack);
                }
             }
          }
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "16")) {
          return;
       }
       SwapPresenter tz = this.z;
       if (tz == null) {
          return;
       }
       tz.y(this.M.e());
       return;
    }
    public void b9(boolean p0){
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(swapPresente) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, swapPresente, "31")) {
          return;
       }
       swapPresente = this.G;
       if (swapPresente == null) {
          this.H = 0;
          return;
       }else {
          int i = swapPresente.h();
          if (i < this.H || p0) {
             this.H = i;
          }
          return;
       }
    }
    public void c9(boolean p0){
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(swapPresente) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, swapPresente, "30")) {
          return;
       }
       swapPresente = this.G;
       if (swapPresente == null) {
          this.I = 0;
          return;
       }else {
          int i = swapPresente.E();
          if (this.I < i || p0) {
             this.I = i;
          }
          return;
       }
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "20")) {
          return;
       }
       String str = a.t().c("magicMediaSelectRiskTip", "");
       if (this.y == null && this.getActivity() != null) {
          ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a2a30, 0x7f0a2a2f);
          viewStubInfl.d(this.m8());
          View view = viewStubInfl.b(R.id.magic_media_select_risk_tip_btn);
          this.y = view;
          view.setOnClickListener(new d0(this, str));
       }
       if (!TextUtils.x(str)) {
          n.Y(this.y, 0, 0);
       }else {
          this.W8();
       }
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "19")) {
          return;
       }
       int i = 0;
       if (this.v == null) {
          if (this.m8() == null) {
             return;
          }else {
             int i1 = 0x7f0a0629;
             ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0628, i1);
             viewStubInfl.d(this.m8());
             View view = viewStubInfl.b(i1);
             this.v = view;
             FadeEdgeShaderRecyclerView uFadeEdgeSha = view.findViewById(R.id.camera_magic_picture_list);
             this.z = uFadeEdgeSha;
             LinearLayoutManager linearLayout = new LinearLayoutManager(uFadeEdgeSha.getContext(), i, i);
             this.G = linearLayout;
             this.z.setLayoutManager(linearLayout);
             this.z.setAdapter(this.R);
             this.w = this.v.findViewById(0x7f0a0627);
             this.z.addOnScrollListener(new SwapPresenter$b(this));
          }
       }
       n.Y(this.v, i, i);
       this.d9();
       this.w.setOnClickListener(new SwapPresenter$c(this));
       this.u.onNext(new Pair("SWAP_IMAGE_SHOW_EVENT", Boolean.TRUE));
       return;
    }
    public void h9(boolean p0,int p1){
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(swapPresente) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, swapPresente, "17")) {
          return;
       }
       if (this.M.a() != null && this.N.f()) {
          b9.a(this.D);
          this.C.clear();
          this.B.clear();
          this.C.addAll(this.A);
          if (this.L == null) {
             e uoe = e.f();
             Objects.requireNonNull(uoe);
             AlbumLimitOption uAlbumLimitO = PatchProxy.apply(null, uoe, e.class, "19");
             if (uAlbumLimitO != PatchProxyResult.class) {
             }else {
                uAlbumLimitO = AlbumLimitOption.H.a().d();
                uAlbumLimitO.z(o.d());
                uAlbumLimitO.y(o.c());
             }
             uAlbumLimitO.w("post_magicface_album");
             this.L = j.a(uAlbumLimitO);
          }
          this.e9();
          this.K = p1;
          b uob = this.L.a(this.R8(), p1).observeOn(d.c).doOnNext(new j0(this)).observeOn(d.a).doOnComplete(new g0(this, this.M.a(), p0)).subscribe(g.b, new b0(this, p0));
          this.D = uob;
          this.F.a(uob);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter.class, "1")) {
          return;
       }
       SwapPresenter tM = this.M;
       BaseFragment uBaseFragmen = this.r8("FRAGMENT");
       Objects.requireNonNull(tM);
       if (!PatchProxy.applyVoidOneRefs(uBaseFragmen, tM, h.class, "2")) {
          a.p(uBaseFragmen, "<set-?>");
          tM.d = uBaseFragmen;
       }
       this.r = this.r8("EFFECT_DESCRIPTION_UPDATEED_EVENT");
       this.s = this.r8("EFFECT_HINT_UPDATEED_EVENT");
       this.t = this.r8("ON_HIDDEN_CAHNGED_EVENT");
       this.u = this.r8("EXTRA_BUTTONS_SHOW_EVENT");
       return;
    }
    public final void j9(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapPresenter.class, "8")) {
          return;
       }
       this.M.g = p0;
       this.N.k(p0);
       if (this.N.f()) {
          SwapPresenter tR = this.R;
          boolean b = this.N.j();
          boolean b1 = (this.N.h() == SelectMediaMode.SINGLE_VIDEO || this.N.h() == SelectMediaMode.MULTI_VIDEOS)? true: false;
          Objects.requireNonNull(tR);
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), tR, uod, "4")) {
             tR.y = b;
             tR.z = b1;
             tR.k0();
          }
       }
       return;
    }
    public void k9(List p0,boolean p1){
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(swapPresente) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, swapPresente, "24")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().w("SwapPresenter", "updateSwapAdapter", objArray);
       n.Y(this.v, i, i);
       this.R.W0(p0);
       if (!this.N.j()) {
          if (!PatchProxy.isSupport(swapPresente) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, swapPresente, "25")) {
             if (p0.get(i) instanceof SwapQMedia && (p0.get(i).mIsLocalMedia != null && (this.M.e() < 0 && !this.M.d()))) {
                j.a.b(this.M.b(), 0, p0.get(i), false, this.M.h());
                this.R.v1(i);
                this.M.m(i);
                this.M.n(p0.get(i));
             }else if(p1){
                int i1 = this.R.r1(this.M.g());
                this.R.v1(i1);
                if (this.M.d()) {
                   this.M.l(i);
                   this.M.m(i1);
                   this.a9();
                }
             }
          }
       }else {
          this.R.u1().setMaxSize(this.N.c());
          SwapMediaArrayList swapMediaArr = this.R.u1();
          p1 = (this.N.h() == SelectMediaMode.MULTI_VIDEOS || this.N.h() == SelectMediaMode.MULTI_MIX)? true: false;
          swapMediaArr.setAutoFill(p1);
          ArrayList notEmptyList = this.R.u1().getNotEmptyList();
          if (!q.f(notEmptyList)) {
             m a = m.a;
             Objects.requireNonNull(a);
             QMedia obj = PatchProxy.applyOneRefs(notEmptyList, a, m.class, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else {
                a.p(notEmptyList, "selectMedias");
                Iterator iterator = notEmptyList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      QMedia path = (obj != null)? obj.path: null;
                      if (path != null && new File(obj.path).exists()) {
                         continue ;
                      }
                   }else {
                      i = true;
                   }
                }
             }
             if (!i) {
                this.R.u1().clear();
                this.R.k0();
             }
          }
          this.l9();
       }
       this.R.k0();
       return;
    }
    public void l9(){
       SwapPresenter swapPresente = SwapPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, swapPresente, "4")) {
          return;
       }
       if (this.R.u1().sizeOfNotEmpty() < this.N.d()) {
          this.X8();
       }else if(PatchProxy.applyVoid(objArray, this, swapPresente, "22")){
          if (this.x == null) {
             int i = 0x7f0a2a3d;
             ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a2a3e, i);
             viewStubInfl.d(this.m8());
             TextView textView = viewStubInfl.b(i);
             this.x = textView;
             textView.setOnClickListener(new y(this));
          }
          this.u.onNext(new Pair("SWAP_COMPLETE_SHOW_EVENT", Boolean.TRUE));
          this.x.setVisibility(0);
          this.x.setClickable(true);
          this.x.setText(a1.p(R.string.arg_RES_7f100f6b)+"\("+this.R.u1().sizeOfNotEmpty()+"\)");
       }
       return;
    }
}
