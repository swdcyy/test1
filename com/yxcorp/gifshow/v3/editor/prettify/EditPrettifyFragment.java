package com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment;
import o0c.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$a;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$b;
import rsc.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import voc.y;
import gka.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import ssc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import p0c.d;
import p0c.h;
import android.view.View;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import u26.a;
import oa0.a;
import android.content.SharedPreferences;
import java.util.Objects;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.prettify.g;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import com.yxcorp.gifshow.prettify.body.ui.BodySlimmingFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.body.ui.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.Arrays;
import oe6.b;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import kwc.x;
import rsc.b;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d;
import com.yxcorp.gifshow.v3.f;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.prettify.filter.m;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c;
import tsc.e;
import h80.c;
import h80.k;
import yyb.a;
import rsc.a;
import p0c.a;
import l0c.f0;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import uv8.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeaturesElementStayLengthPackage;
import ooc.g1;
import com.yxcorp.gifshow.v3.editor.i;

public class EditPrettifyFragment extends BaseEditorFragment implements a	// class@001143
{
    public PresenterV2 G;
    public EditPrettifyFragment$c H;
    public String I;
    public List J;
    public PresenterV2 K;
    public PostRadioGroupWithIndicator L;
    public y M;
    public final a N;

    public void EditPrettifyFragment(){
       super();
       this.H = new EditPrettifyFragment$c();
       this.J = new ArrayList();
       this.M = new EditPrettifyFragment$a(this);
       this.N = new EditPrettifyFragment$b(this);
    }
    public void Ah(e p0){
       this.H.n = p0;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyFragment.class, "16")) {
          return;
       }
       if (!this.t.E()) {
          return;
       }
       if (q.f(this.qh())) {
          return;
       }
       Iterator iterator = this.qh().iterator();
       while (iterator.hasNext()) {
          iterator.next().yd();
       }
       iterator = this.ih().iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          BaseFragment uBaseFragmen = this.t.q();
          if (uBaseFragmen instanceof BaseEditorFragment) {
             BaseEditor$a uoa = uBaseFragmen.B.o();
             if (uoa != null) {
                uoa.c = "blank";
                uoa.d = 1;
             }
          }
          og.a(1);
       }
       return;
    }
    public void fh(){
       EditPrettifyFragment tL;
       String str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "12")) {
          return;
       }
       int i = 3;
       Object[] objArray1 = new Object[i];
       objArray1[0] = this.H;
       objArray1[1] = this.hh();
       objArray1[2] = new a();
       this.G.i(objArray1);
       EditPrettifyFragment$c c = this.H.c;
       if (c != null && c.isAdded()) {
          this.H.k.g().d(1);
          if (this.L == null) {
             View view = this.H.c.getView();
             if (view != null) {
                this.L = view.findViewById(0x7f0a3cb7);
             }
          }
          String str = "lookup_tab";
          if (j.g(this.kh().N()) || DraftUtils.e(this.kh().N())) {
             tL = this.L;
             if (tL != null) {
                tL.setTouchActionListener(this.N);
             }
             a.j1(str);
             str1 = str;
          }else {
             tL = this.L;
             if (tL != null) {
                tL.setTouchActionListener(objArray);
             }
             str1 = a.a.getString("last_prettify_show_sub_tab", "");
          }
          Objects.requireNonNull(str1);
          int i1 = -1;
          switch (str1.hashCode()){
              case 0x4924935f:
                if (str1.equals("makeup_tab")) {
                   i1 = 0;
                }
                break;
              case 0x4d834b50:
                if (str1.equals(str)) {
                   i1 = 1;
                }
                break;
              case 0x65818778:
                if (str1.equals("body_tab")) {
                   i1 = 2;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                i = 1;
                break;
              case 1:
                break;
              case 2:
                i = 2;
                break;
              default:
                i = 0;
          }
          if (!this.J.isEmpty() && !this.J.contains(Integer.valueOf(i))) {
             i = this.J.get(0).intValue();
          }
          this.H.c.ih(i);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditPrettifyFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(EditPrettifyFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyFragment.class, "13")) {
          return;
       }
       EditPrettifyFragment tG = this.G;
       if (tG != null) {
          tG.unbind();
       }
       this.H.i = false;
       return;
    }
    public void ka(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyFragment.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("prettifyEdit", "onFragmentContainerSizeChanged not implemented", objArray);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPrettifyFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null && this.getArguments().getIntegerArrayList("EDIT_PRETTIFY_TABS") != null) {
          this.J = this.getArguments().getIntegerArrayList("EDIT_PRETTIFY_TABS");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditPrettifyFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0374, p1, false);
       this.q = view;
       p1.b = this;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyFragment.class, "15")) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.u(this.H.c);
       uoe.m();
       super.onDestroyView();
       this.G.destroy();
       this.H.j.c(0);
       return;
    }
    public void onHiddenChanged(boolean p0){
       PrettifyBaseFragment p;
       int len;
       int i;
       object oobject;
       String str = "14";
       if (PatchProxy.isSupport(EditPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditPrettifyFragment.class, str)) {
          return;
       }
       super.onHiddenChanged(p0);
       if (this.J.contains(Integer.valueOf(3))) {
          EditPrettifyFragment tK = this.K;
          if (tK != null) {
             tK.G = (p0)? BaseEditor$EditorShowMode.SHOW_BACKGROUND: BaseEditor$EditorShowMode.SHOW_FOREGROUND;
          }
       }
       EditPrettifyFragment$c c = this.H.c;
       if (c instanceof PrettifyBaseFragment) {
          c.ch((p0 ^ 0x01));
       }
       Iterator iterator = this.getChildFragmentManager().getFragments().iterator();
       while (iterator.hasNext()) {
          iterator.next().onHiddenChanged(p0);
       }
       if (!p0) {
          EditPrettifyFragment$c c1 = this.H.c;
          if (c1 != null && (c1.isAdded() && (j.a && j.l(this.t.N())))) {
             c1 = this.H.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoid(null, c1, PrettifyBaseFragment.class, "13")) {
                p = c1.p;
                len = p.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject1 = p[i1];
                   if (oobject1 instanceof BeautifyFilterFragment) {
                      Objects.requireNonNull(oobject1);
                      if (!PatchProxy.applyVoid(null, oobject1, BeautifyFilterFragment.class, "12")) {
                         oobject1.r.onNext(Boolean.TRUE);
                      }
                   }
                   i1 = i1 + 1;
                }
             }
             c1 = this.H.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoid(null, c1, PrettifyBaseFragment.class, str)) {
                p = c1.p;
                len = p.length;
                i = 0;
                while (i < len) {
                   oobject = p[i];
                   if (oobject instanceof MakeupFragment) {
                      Objects.requireNonNull(oobject);
                      if (!PatchProxy.applyVoid(null, oobject, MakeupFragment.class, "8")) {
                         oobject.s.onNext(Boolean.TRUE);
                      }
                   }
                   i = i + 1;
                }
             }
             c1 = this.H.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoid(null, c1, PrettifyBaseFragment.class, "15")) {
                p = c1.p;
                len = p.length;
                i = 0;
                while (i < len) {
                   oobject = p[i];
                   if (oobject instanceof BodySlimmingFragment) {
                      Objects.requireNonNull(oobject);
                      if (!PatchProxy.applyVoid(null, oobject, BodySlimmingFragment.class, "12")) {
                         BodySlimmingFragment n = oobject.n;
                         RecyclerView$Adapter adapter = (n != null)? n.getAdapter(): null;
                         if (!adapter instanceof a) {
                            adapter = null;
                         }
                         if (adapter != null) {
                            adapter.N0(false, true);
                         }
                      }
                   }
                   i = i + 1;
                }
             }
             j.a = false;
          }
       }
    label_0141 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       EditPrettifyFragment$c k;
       EditPrettifyFragment$c j;
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditPrettifyFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       EditPrettifyFragment uEditPrettif = 3;
       f0 uof0 = 2;
       String str = null;
       if (!PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "5") && q.f(this.J)) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(str),Integer.valueOf(1),Integer.valueOf(uof0),Integer.valueOf(uEditPrettif)};
          this.J.addAll(Arrays.asList(integerArray));
       }
       if (!PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "10")) {
          this.H.k.g().c().clear();
          if (!PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "11")) {
             String str1 = "prettifyEdit";
             if (!b.o()) {
                objArray1 = new Object[str];
                a.D().w(str1, "disable by Build VERSION", objArray1);
                this.yh(1);
             }
             Workspace workspace = this.t.N().v();
             boolean b1 = PostExperimentUtils.d1();
             Workspace$Type type = (workspace != null && j.o(workspace.getType(), workspace.getTypeFrom()))? 1: null;
             if (workspace == null || (workspace.getType() != Workspace$Type.PHOTO_MOVIE && (workspace.getType() != Workspace$Type.LONG_PICTURE && (workspace.getType() != Workspace$Type.ATLAS && (b1 || (workspace.getType() != Workspace$Type.SINGLE_PICTURE && (!type && (workspace.getType() != Workspace$Type.ALBUM_MOVIE && (b1 || (workspace.getType() == Workspace$Type.KTV_SONG || !a.v())))))))))) {
                objArray1 = new Object[str];
                a.D().w(str1, "Body disable by photo movie", objArray1);
                this.yh(uof0);
             }
          }
          Iterator iterator = this.J.iterator();
          while (iterator.hasNext()) {
             this.H.k.g().c().add(Integer.valueOf(iterator.next().intValue()));
          }
          this.H.k.j(1);
          this.H.k.g().g(R.layout.arg_RES_7f0d0500);
          iterator.f = true;
          if (this.J.contains(Integer.valueOf(uEditPrettif))) {
             this.H.k.g().e(uEditPrettif);
             this.H.k.g().d(str);
          }
          this.H.k.g().f(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "6")) {
          if (this.G == null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.G = presenterV2;
             presenterV2.U7(new x());
             this.G.U7(new b());
             if (this.J.contains(Integer.valueOf(str))) {
                this.G.U7(new d(f.E(this.kh().getType())));
             }
             if (this.J.contains(Integer.valueOf(uEditPrettif))) {
                i oi = new i();
                this.K = oi;
                this.G.U7(oi);
                oi = PatchProxy.apply(objArray, this, EditPrettifyFragment.class, "7");
                if (oi != patchProxyRe) {
                   b = oi.booleanValue();
                }else if(this.t.N().a1() == Workspace$Type.SINGLE_PICTURE && this.t.N().T0() != Workspace$Source.REEDIT){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   this.G.U7(new m());
                }
             }
             if (this.J.contains(Integer.valueOf(1))) {
                this.G.U7(new c(f.E(this.kh().getType())));
             }
             if (this.J.contains(Integer.valueOf(uof0))) {
                this.G.U7(new e(f.E(this.kh().getType())));
             }
          }
          this.G.f(this.q);
          this.fh();
          if (!PatchProxy.applyVoid(objArray, this, EditPrettifyFragment.class, "9") && k.a() != null) {
             a uoa = k.a().n(new a());
             if ((this.ph()).equals("prettify_aggregation") && !q.f(uoa.c)) {
                this.H.k.g().i(uoa.c);
             }
             uoa = uoa.a;
             if (uoa == null || !uoa.booleanValue()) {
                uoa = PatchProxy.apply(objArray, this, EditPrettifyFragment.class, "8");
                b = (uoa != patchProxyRe)? uoa.booleanValue(): a.a();
                if (!b) {
                label_02bd :
                   if (str != null) {
                      this.H.k.a().L(1);
                      b.r = true;
                   }
                }
             }
             str = 1;
             goto label_02bd ;
          }
       }
    label_02d4 :
       this.qh().add(this.M);
       EditPrettifyFragment tH = this.H;
       k = tH.k;
       PrettifyBaseFragment prettifyBase = PatchProxy.applyOneRefs(k, objArray, f0.class, "1");
       if (prettifyBase != patchProxyRe) {
       }else {
          a.p(k, "prettifyOption");
          prettifyBase = new PrettifyBaseFragment();
          prettifyBase.hh(k);
       }
       tH.c = prettifyBase;
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.H.j.i(activity);
          j = this.H.j;
          activity = activity.findViewById(R.id.preview);
          try{
             j.j(activity);
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.w(R.id.prettify_fragment_container, this.H.c, String.valueOf(this.hashCode()));
             uoe.m();
          }catch(java.lang.IllegalArgumentException e11){
             PostUtils.x("prettify_exception", Log.f(e11));
          }
       }
    }
    public void q0(int p0){
       if (PatchProxy.isSupport(EditPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditPrettifyFragment.class, "18")) {
          return;
       }
       String str = "lookup_tab";
       String str1 = "body_tab";
       String str2 = "makeup_tab";
       if (p0 != 1) {
          if (p0 != 2) {
             this.I = (p0 != 3)? "beauty_tab": str;
          }else {
             this.I = str1;
             w1.c(this.getActivity());
          }
       }else {
          this.I = str2;
          w1.h(this.getActivity(), null, 404);
       }
       if (!(this.I).equals(str1) && !(this.I).equals(str2)) {
          if ((this.I).equals(str)) {
             EditPrettifyFragment tK = this.K;
             if (tK == null || tK.G == BaseEditor$EditorShowMode.SHOW_BACKGROUND) {
             label_0081 :
                return;
             }
          }
          EditPrettifyFragment tI = this.I;
          g1.y("247404", this.getActivity(), 18, "", tI, tI, null, null);
          goto label_0081 ;
       }else {
          goto label_0081 ;
       }
    }
    public void r6(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPrettifyFragment.class, "17")) {
          return;
       }
       this.H.l.onNext(p0);
       return;
    }
    public final void yh(int p0){
       if (PatchProxy.isSupport(EditPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditPrettifyFragment.class, "20")) {
          return;
       }
       int i = -1;
       int i1 = 0;
       while (i1 < this.J.size()) {
          if (this.J.get(i1).intValue() == p0) {
             i = i1;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       if (i >= 0) {
          this.J.remove(i);
       }
       return;
    }
    public void zh(i p0){
       this.H.f = p0;
    }
}
