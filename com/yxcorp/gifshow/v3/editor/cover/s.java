package com.yxcorp.gifshow.v3.editor.cover.s;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.cover.s$b;
import java.util.ArrayList;
import qpc.l;
import qe6.c;
import java.lang.reflect.Type;
import java.util.List;
import oa0.a;
import com.yxcorp.gifshow.v3.editor.cover.s$c;
import com.yxcorp.gifshow.v3.editor.cover.s$d;
import com.yxcorp.gifshow.v3.editor.cover.s$f;
import com.yxcorp.gifshow.v3.editor.cover.s$g;
import com.yxcorp.gifshow.v3.editor.cover.s$h;
import com.yxcorp.gifshow.v3.editor.cover.s$i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.decoration.widget.f$a;
import xf6.g;
import xf6.l;
import com.kwai.framework.abtest.f;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.cover.p;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import di0.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Iterator;
import d0c.d;
import yuc.f;
import ppc.r;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import faa.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import ypc.a;
import com.yxcorp.gifshow.v3.editor.cover.r;
import com.yxcorp.gifshow.v3.editor.cover.m;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.cover.n;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import java.util.Map;
import uv8.i2;
import t36.f;
import com.yxcorp.gifshow.v3.editor.text.element.c;
import com.kuaishou.edit.draft.FeatureId;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.InternalFeatureId;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import orc.f;
import htc.c;
import ra9.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView;
import im8.f;
import hba.a;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.sdk.switchconfig.a;
import ooc.c;
import android.text.TextUtils;
import axc.j;
import com.yxcorp.gifshow.bubble.b;
import android.view.View;
import ppc.t;
import com.yxcorp.gifshow.bubble.b$b;
import ppc.u;
import io.reactivex.g;
import com.yxcorp.gifshow.bubble.a;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.SmartAlbum;
import h69.j;
import com.kuaishou.edit.draft.Workspace$Source;
import android.app.Activity;
import android.content.Intent;
import com.yxcorp.gifshow.v3.f;
import huc.d;
import com.yxcorp.gifshow.v3.editor.cover.q;
import ekd.q$b;
import com.yxcorp.gifshow.v3.editor.text.i0;
import com.kwai.framework.model.user.QCurrentUser;
import android.util.Pair;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import qpc.g;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import huc.u;
import java.lang.Iterable;
import nuc.a;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
import java.util.Objects;
import e17.i;
import uuc.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import ppc.b0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import huc.b;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.cover.s$e;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ppc.s;
import ppc.n;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import ppc.q;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import ekd.m1;
import ppc.a0;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.yxcorp.gifshow.v3.editor.cover.s$a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import rwc.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class s extends PresenterV2 implements CoverTextLibraryFragment$b, g	// class@000eda
{
    public b A;
    public EditDecorationContainerView$b B;
    public Set C;
    public CoverEditorFragment D;
    public PictureSelectView$e E;
    public EditDecorationContainerView F;
    public TextElementViewModel G;
    public DynamicTextViewModel H;
    public FontViewModel I;
    public RecyclerView J;
    public LinearLayout K;
    public View L;
    public boolean M;
    public PublishSubject N;
    public PublishSubject O;
    public KwaiLoadingView P;
    public View Q;
    public CoverTextLibraryFragment R;
    public RecyclerView S;
    public List T;
    public List U;
    public boolean U0;
    public final l V;
    public final y V0;
    public List W;
    public final i2 W0;
    public List X;
    public final PictureSelectView$d X0;
    public final List Y;
    public final EditCoverSeekBar$c Y0;
    public PostBubbleManager Z;
    public final q0$f Z0;
    public final RecyclerView$q a1;
    public int p;
    public String q;
    public a r;
    public f s;
    public f t;
    public f u;
    public c v;
    public EditorDelegate w;
    public f x;
    public Boolean y;
    public PublishSubject z;

    public void s(){
       super();
       this.y = Boolean.TRUE;
       this.B = new s$b(this);
       this.M = false;
       this.T = new ArrayList();
       this.U = new ArrayList();
       this.V = new l();
       this.W = new ArrayList();
       this.X = new ArrayList();
       this.Y = a.o(c.d1);
       this.U0 = true;
       this.V0 = new s$c(this);
       this.W0 = new s$d(this);
       this.X0 = new s$f(this);
       this.Y0 = new s$g(this);
       this.Z0 = new s$h(this);
       this.a1 = new s$i(this);
    }
    public void E8(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.C.add(this.V0);
       s tF = this.F;
       f$a uoa = new f$a();
       boolean b = true;
       uoa.b(b);
       String str = (g.o1() && l.c("KEY_COVER_SAFE_AREA", false))? 1: null;
       boolean b1 = (str || f.a("enableCoverSafeArea"))? true: false;
       uoa.a(b1);
       uoa.c(a1.p(R.string.arg_RES_7f103e73));
       uoa.d(b);
       tF.X(uoa, p.a);
       this.G = k1.c(this.w, this.y.booleanValue());
       if (this.w.q().getActivity() == null) {
          PostUtils.D("CoverTextPresenter", "CoverTextPresenter onBind : getActivity is null", new NullPointerException());
          return;
       }else {
          this.H = ViewModelProviders.of(this.w.q().getActivity()).get(DynamicTextViewModel.class);
          FontViewModel uFontViewMod = ViewModelProviders.of(this.w.q()).get(FontViewModel.class);
          this.I = uFontViewMod;
          ListHolder value = uFontViewMod.w0().getValue();
          if (value != null) {
             Iterator iterator = value.c().iterator();
             while (iterator.hasNext()) {
                f.a.a(iterator.next());
             }
          }
          if (this.U0 != null) {
             this.W8();
             this.V8();
             this.S8();
             this.U0 = false;
             this.H.w0();
             if (this.T.isEmpty()) {
                this.H.t0().observe(this.D, new r(this));
             }else {
                this.a9();
             }
             objArray = new Object[false];
             a.D().w("CoverTextPresenter", "onBind FirstBind", objArray);
          }
          if (q.f(this.T)) {
             this.G.j1("shadow_01");
          }else {
             this.G.j1(this.T.get(false).b());
          }
          this.X7(this.N.subscribe(new r(this), m.b));
          this.K.setOnClickListener(new n(this));
          f.o0(this.W0, this.w.u(), i2.class);
          objArray = new Object[false];
          a.D().w("CoverTextPresenter", "onBind", objArray);
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.U7(new c());
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "15")) {
          return;
       }
       this.R8();
       s tA = this.A;
       if (tA != null && !tA.isDisposed()) {
          this.A.dispose();
       }
       f.t0(this.W0, this.w.u(), i2.class);
       this.A = objArray;
       objArray = new Object[0];
       a.D().w("CoverTextPresenter", "onUnbind", objArray);
       return;
    }
    public final String P8(FeatureId p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "39");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 == null || (p0.getInternal() == InternalFeatureId.UNKNOWN && TextUtils.x(p0.getExternal()))){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return f.a(p0);
       }else {
          return c.H();
       }
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, s.class, "7")) {
          return;
       }
       if (this.Z.i() == EditBubbleItem.COVER_GUIDE) {
          this.Z.c();
          s tS = this.S;
          if (tS != null) {
             tS.removeOnItemTouchListener(this.a1);
          }
          tS = this.s;
          if (tS != null) {
             tS.set(null);
          }
          tS = this.t;
          if (tS != null) {
             tS.set(null);
          }
          tS = this.A;
          if (tS != null && !tS.isDisposed()) {
             this.A.dispose();
             this.A = null;
          }
       }
    label_0043 :
       return;
    }
    public final void S8(){
       s os = s.class;
       if (PatchProxy.applyVoid(null, this, os, "5")) {
          return;
       }
       if (this.r.f0() == null || (this.r.f0().v() != null || this.T.isEmpty())) {
          return;
       }
       String str = a.t().c("coverBubbleImageUrl", "");
       boolean b = c.a();
       if (!TextUtils.isEmpty(str) && (b && this.M == null)) {
          j oj = new j(str, this.y.booleanValue());
          b uob = new b(EditBubbleItem.COVER_GUIDE);
          uob.b(this.J);
          uob.k(new t(oj));
          t ot = PatchProxy.applyTwoRefs(str, oj, this, os, "6");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(new u(this, str, oj));
          }
          uob.h(ot);
          this.Z.n(uob);
       }
    label_0082 :
       return;
    }
    public final void V8(){
       String str;
       ArrayList uArrayList2;
       s r;
       Iterator iterator;
       TextElementViewModel f;
       e c;
       List list2;
       Integer obj;
       List list = this;
       TextElementViewModel textElementV = TextElementViewModel.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, list, os, "10")) {
          return;
       }
       Cover uCover = list.r.v();
       ArrayList uArrayList = new ArrayList();
       Workspace$Type aLBUM_MOVIE = Workspace$Type.ALBUM_MOVIE;
       if (list.v.a1() == aLBUM_MOVIE || list.v.b1() == aLBUM_MOVIE) {
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(uCover, list, os, "11");
          if (uArrayList1 != patchProxyRe) {
          }else {
             uArrayList1 = new ArrayList();
             String str4 = (uCover == null || !uCover.getTextsCount())? list.P8(list.v.v().getSmartAlbum().getCoverTextFeatureId()): list.P8(uCover.getTexts(0).getFeatureId());
             if (!c.K(str4)) {
                str4 = c.H();
             }
             uArrayList1.add(str4);
          }
          uArrayList.addAll(uArrayList1);
       }
       if (j.j(list.v)) {
          uArrayList.add("20221116_year");
          uArrayList.add("20211206_annual_album_watch");
       }
       int i = 1;
       os = (list.v.T0() == Workspace$Source.REEDIT)? 1: null;
       boolean b = (this.getActivity() != null && f.C(this.getActivity().getIntent()))? true: false;
       if (os && (!list.r.f0().E() && list.r.f0().v() != null)) {
          str = d.f(list.r.f0().v().getFeatureId());
          if (c.K(str)) {
             q.c(uArrayList, q.a);
          }
          uArrayList.add(str);
       }else {
          str = "";
       }
       List list1 = i0.a();
       list1.removeAll(uArrayList);
       Pair pair = i0.f(QCurrentUser.me().isLogined(), i, list1);
       Pair pair1 = i0.e(QCurrentUser.me().isLogined(), i);
       if (PostExperimentUtils.s()) {
          list.T = g.e(list1, b);
          g og = g.class;
          if (PatchProxy.isSupport(og)) {
             uArrayList2 = PatchProxy.applyTwoRefs(list1, Boolean.valueOf(b), objArray, og, "5");
             if (uArrayList2 != patchProxyRe) {
             label_01f1 :
                list.U = uArrayList2;
                r = list.R;
                if (r != null && (r.isVisible() && (q.f(list.R.E) && !q.f(list.U)))) {
                   list.R.Qh(list.U);
                }
             label_0216 :
                list.K.setVisibility(0);
             }
          }
          a.p(list1, "disableTextIdList");
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          list2 = i0.d(qCurrentUser.isLogined(), list1);
          List list3 = g.h.d(i);
          Object[] objArray5 = new Object[0];
          a.D().w("CoverTextLibraryUtils", "getUnsortedCoverTextParamList: textIdList size = "+list2.size(), objArray5);
          list2 = a.r(list2, objArray, b, i);
          a.o(list2, "result");
          ArrayList uArrayList3 = new ArrayList();
          iterator = list2.iterator();
          String str3 = "it";
          while (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = obj;
             a.o(obj1, str3);
             str3 = (obj1.l() == null || (obj1.l().j() || list3.contains(obj1.b())))? 1: null;
             if (str3) {
                uArrayList3.add(obj);
             }
          }
          iterator = uArrayList3.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             a.o(uoa1, str3);
             if (list3.contains(uoa1.b())) {
                obj = g.g.get(Integer.valueOf(uoa1.o()));
                int i1 = (obj != null)? obj.intValue(): 0;
                uoa1.d = i1;
             }
          }
          uArrayList2 = uArrayList3;
          goto label_01f1 ;
       }else {
          list2 = g.b(pair.first, b);
          list.T = list2;
          list2.addAll(a.q(pair1.first, objArray));
       }
       list.W = pair.second;
       list.X = pair1.second;
       r = list.G;
       s t = list.T;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoidOneRefs(t, r, textElementV, "14")) {
          a.p(t, "textConfigParamList");
          if (r.u == null) {
             r.u = new ArrayList();
          }
          r.u.clear();
          r.u.addAll(t);
       }
       if (!TextUtils.isEmpty(str) && (!pair.first.contains(str) && !pair1.first.contains(str))) {
          i.a(R.style.arg_RES_7f110668, 0x7f104220);
          iterator = list.T.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa.isAvailable()) {
                   r = list.G;
                   String str1 = uoa.b();
                   Objects.requireNonNull(r);
                   if (!PatchProxy.applyVoidOneRefs(str1, r, textElementV, "63")) {
                      String str2 = "textID";
                      a.p(str1, str2);
                      f = r.F;
                      Objects.requireNonNull(f);
                      if (!PatchProxy.applyVoidOneRefs(str1, f, e.class, "29")) {
                         a.p(str1, str2);
                         Object[] objArray4 = new Object[0];
                         a.D().w("TextElementRepo", "replaceNotFoundTextToNew textID:"+str1, objArray4);
                         c = f.c;
                         if (c == null) {
                            a.S("mTextDraft");
                         }
                         GeneratedMessageLite$Builder uBuilder = c.k();
                         a.o(uBuilder, "mTextDraft.ensureFirstBuilder\(\)");
                         uBuilder.h(d.e(str1));
                      }
                   }
                }
             }
             Object[] objArray1 = new Object[0];
             a.D().w("CoverTextPresenter", "initEnableTextBubbleConfig: replaceCoverText", objArray1);
             break ;
          }
       }
       Object[] objArray2 = new Object[0];
       a.D().s("CoverTextPresenter", "mTextConfigParamList size : "+list.T.size(), objArray2);
       b0 uob0 = new b0(list.D, ViewModelProviders.of(list.D.getActivity()).get(DynamicTextViewModel.class), list.V, list.T, 1, b);
       r = list.V;
       r.j = textElementV;
       r.i = list.T;
       list.J.setAdapter(r);
       textElementV.a();
       Object[] objArray3 = new Object[0];
       a.D().w("CoverTextPresenter", "initEnableTextBubbleConfig disableTextIdList:"+list1+",initTextId="+str, objArray3);
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, s.class, "8")) {
          return;
       }
       int i = 0;
       if (this.J.getItemDecorationCount() > 0) {
          this.J.removeItemDecorationAt(i);
       }
       if (PostExperimentUtils.s()) {
          this.J.addItemDecoration(new e(i, a1.d(R.dimen.arg_RES_7f0702d6), a1.d(R.dimen.arg_RES_7f07033f), a1.d(R.dimen.arg_RES_7f0702ab)));
          this.J.setPadding(i, i, i, i);
       }else {
          this.J.addItemDecoration(new e(i, a1.d(R.dimen.arg_RES_7f070f5d), i));
       }
       this.J.addOnScrollListener(new s$e(this));
       this.J.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), i, i));
       this.V.h = new s(this);
       this.Q.setOnClickListener(new n(this));
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, s.class, "21")) {
          return;
       }
       s tR = this.R;
       if (tR != null) {
          tR.Qh(this.U);
       }
       return;
    }
    public final void Y8(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "22")) {
          return;
       }
       this.M = p0;
       this.G.t = p0;
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, s.class, "19")) {
          return;
       }
       this.Q.setVisibility(0);
       this.P.setVisibility(8);
       this.J.setVisibility(8);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, s.class, "20")) {
          return;
       }
       this.Q.setVisibility(8);
       this.P.setVisibility(8);
       this.J.setVisibility(0);
       return;
    }
    public final void b9(TextConfigParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "9")) {
          return;
       }
       c.a(new q(this, p0));
       TextConfigParam textConfigPa = p0.e(p0.j(), this.v.v().getSmartAlbum().getCoverTextSubtitle());
       EditTextBaseElement topElement = this.F.getTopElement();
       if (topElement == null) {
          this.G.r0(textConfigPa, TimeRange.getDefaultInstance(), new ArrayList(), this.x.get().booleanValue());
       }else {
          this.G.i1(topElement.getEditTextBaseElementData(), textConfigPa, new ArrayList(), 0, this.x.get().booleanValue());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.J = m1.f(p0, 0x7f0a3e18);
       this.S = m1.f(p0, 0x7f0a347f);
       this.K = m1.f(p0, 0x7f0a09ff);
       this.L = m1.f(p0, 0x7f0a0a00);
       this.Q = m1.f(p0, 0x7f0a0a04);
       this.P = m1.f(p0, 0x7f0a0a05);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, s.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(s.class, new a0());
       }else {
          obj.put(s.class, null);
       }
       return obj;
    }
    public void h1(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "17")) {
          return;
       }
       if (this.H != null && this.getActivity() != null) {
          if (this.T.isEmpty()) {
             s tH = this.H;
             Activity activity = this.getActivity();
             Object obj = PatchProxy.applyOneRefs(activity, objArray, g.class, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                Objects.requireNonNull(DynamicTextRepo.c);
                b = (DynamicTextRepo.b && (!d.k().size() || (activity != null && f.C(activity.getIntent()))))? 1: null;
             }
             boolean b1 = b;
             tH.q0(b1, new ArrayList(), f.C(this.getActivity().getIntent()), false, new s$a(this));
          }else {
             this.X8();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.q = this.r8("SUB_TYPE");
       this.r = this.r8("COVER");
       this.s = this.w8("VideoCoverSeekChangeListener");
       this.t = this.w8("PhotoCoverSeekChangeListener");
       this.u = this.x8("CoverModeChangeListener");
       this.v = this.r8("WORKSPACE");
       this.w = this.r8("EDITOR_DELEGATE");
       this.x = this.x8("IS_LANDSCAPE");
       this.C = this.r8("EDITOR_VIEW_LISTENERS");
       this.D = this.r8("FRAGMENT");
       this.E = this.t8("STOP_SCROLL_LISTENER");
       this.F = this.r8("DECORATION_CONTAINER_VIEW");
       this.z = this.t8("VIDEO_IMPORT_COVER_CLICK_PUBLISHER");
       this.N = this.r8("HIDE_COVER_TEXT_LIBRARY_EVENT");
       this.O = this.t8("HIDE_PHOTO_COVER_MODE_SWITCH");
       this.Z = PostBubbleManager.d(this.D);
       return;
    }
    public void y7(a p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "16")) {
          return;
       }
       if (p0.p() != null) {
          this.b9(p0.p());
          s tR = this.R;
          if (tR != null) {
             Objects.requireNonNull(tR);
             Object[] objArray = null;
             CoverTextLibraryFragment$a uoa = PatchProxy.apply(objArray, tR, CoverTextLibraryFragment.class, "11");
             if (uoa != PatchProxyResult.class) {
             }else if(tR.L != null && !q.f(tR.F)){
                Iterator iterator = tR.F.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      CoverTextLibraryFragment$a uoa2 = iterator.next();
                      if ((uoa2.a).equals(tR.L.getValue())) {
                         uoa = uoa2;
                      }
                   }
                }
             }
             uoa = objArray;
             if (!PatchProxy.applyVoidTwoRefs(uoa, p0, objArray, g.class, "10") && uoa != null) {
                List list = uoa.a();
                if (list == null || (!list.isEmpty() && list.contains(p0))) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action = 404;
                   uElementPack.action2 = "MORE_COVER_CLICK";
                   ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                   tagPackage.identity = p0.b();
                   a uoa1 = p0.l();
                   if (uoa1 != null) {
                      str = uoa1.n();
                      if (str != null) {
                      label_00a7 :
                         tagPackage.name = str;
                         tagPackage.index = (long)(list.indexOf(p0) + 1);
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.tagPackage = tagPackage;
                         u1.u(1, uElementPack, uContentPack);
                      }
                   }
                   str = "";
                   goto label_00a7 ;
                }
             }
          }
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("CoverTextPresenter", "ILibraryItemClickListener onClick: textTemplateData = "+p0, objArray1);
       }
       return;
    }
}
