package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import vrc.d;
import esc.k;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$d;
import nsd.u;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import qrc.r;
import lsc.f0;
import msc.q;
import jn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$editorShowLogger$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$e;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$h;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$f;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$i;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$c;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import faa.a;
import q87.c;
import jn9.e;
import isc.c;
import k2b.s$b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import lsc.b0;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$j;
import java.util.Iterator;
import java.lang.Integer;
import mn9.a;
import src.o;
import src.a;
import erd.o;
import src.b;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import k2b.b2;
import java.util.Objects;
import lsc.g0;
import ooc.g1;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.v3.framework.KSStore;
import nn9.d;
import java.lang.Iterable;
import trd.u;
import nn9.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicLibraryShowAction;
import xvc.b;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.content.Intent;
import java.lang.StringBuilder;
import w46.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import urc.g;
import src.n;
import trc.t0;
import urc.b;
import urc.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicStatus;
import com.kuaishou.edit.draft.Workspace$Type;
import isc.d;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.editor.music_v2.model.MusicListItemType;
import com.yxcorp.gifshow.v3.editor.music_v2.model.MusicListItemType$a;
import java.util.NoSuchElementException;
import com.kuaishou.android.model.music.MusicType;
import src.f;
import com.yxcorp.gifshow.v3.editor.music_v2.action.RequestMusicDetailAction;

public final class RecommendMusicViewBinderV2 extends a implements d, k	// class@001117
{
    public final r c;
    public final q d;
    public final b e;
    public final PostListComponentView f;
    public final RecyclerView g;
    public final KwaiEmptyStateView h;
    public final KwaiLoadingView i;
    public final List j;
    public final p k;
    public final RecommendMusicViewBinderV2$g l;
    public final RecommendMusicViewBinderV2$e m;
    public final RecommendMusicViewBinderV2$h n;
    public final PostListComponentView$a o;
    public final RecyclerView$r p;
    public final RxFragment q;
    public static final RecommendMusicViewBinderV2$d r;

    static {
       RecommendMusicViewBinderV2.r = new RecommendMusicViewBinderV2$d(null);
    }
    public void RecommendMusicViewBinderV2(RxFragment p0,View p1){
       Object obj = p0;
       LinearLayoutManager obj1 = p1;
       a.p(obj, "fragment");
       a.p(obj1, "rootView");
       super(obj1);
       this.q = obj;
       this.c = f0.l(p0);
       this.d = f0.i(p0);
       b uob = f0.k(p0);
       this.e = uob;
       View view = obj1.findViewById(R.id.edit_music_recommend_list_view);
       a.o(view, "rootView.findViewById\(R.¡­usic_recommend_list_view\)");
       this.f = view;
       View view1 = obj1.findViewById(R.id.edit_music_recommend_recycler_view);
       a.o(view1, "rootView.findViewById\(R.¡­_recommend_recycler_view\)");
       this.g = view1;
       View view2 = obj1.findViewById(R.id.edit_music_error_view);
       a.o(view2, "rootView.findViewById\(R.id.edit_music_error_view\)");
       this.h = view2;
       View view3 = obj1.findViewById(R.id.loading_icon);
       a.o(view3, "rootView.findViewById\(R.id.loading_icon\)");
       this.i = view3;
       this.j = new ArrayList();
       this.k = s.c(new RecommendMusicViewBinderV2$editorShowLogger$2(this));
       RecommendMusicViewBinderV2$g og = new RecommendMusicViewBinderV2$g(this, obj1, obj1);
       this.l = og;
       this.m = new RecommendMusicViewBinderV2$e(this);
       RecommendMusicViewBinderV2$h oh = new RecommendMusicViewBinderV2$h(this);
       this.n = oh;
       RecommendMusicViewBinderV2$f uof = new RecommendMusicViewBinderV2$f(this);
       this.o = uof;
       this.p = new RecommendMusicViewBinderV2$i(this);
       p0.m().compose(c.c(p0.m(), FragmentEvent.DESTROY)).subscribe(new RecommendMusicViewBinderV2$a(this), RecommendMusicViewBinderV2$b.b);
       view2.q(3);
       f0.p(view2, f0.j());
       view2.p(new RecommendMusicViewBinderV2$c(this));
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecommendMusicViewBinderV2.class, "9")) {
       }else if(view1.getLayoutManager() == null){
          obj1 = new LinearLayoutManager(p0.getContext());
          obj1.setOrientation(1);
          view1.setLayoutManager(obj1);
       }
       int i = 0;
       if (!view1.getItemDecorationCount()) {
          view1.addItemDecoration(new b(1, i, i, i));
       }
       view1.setItemAnimator(objArray);
       Object[] objArray1 = new Object[i];
       a.D().w("RecommendMusicViewBinder", "initRecommendRecycleView", objArray1);
       e uoe = new e(new c(obj, this.F()), oh, uof, og, null, SelectScrollOption.LAZY, 16, null);
       view.a(obj1, obj, uob);
       if (uob.o().isEmpty() ^ 1) {
          uob.e();
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, RecommendMusicViewBinderV2.class, "4")) {
          return;
       }
       this.g.addOnScrollListener(this.p);
       f0.b(this.q).qh().add(this.m);
       s$b uob = this.F();
       if (uob != null) {
          uob.b(this.g);
       }
       this.f.c();
       b0.f(this.e, this.g);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecommendMusicViewBinderV2.class, "5")) {
          return;
       }
       this.g.removeOnScrollListener(this.p);
       this.e.c();
       f0.b(this.q).qh().remove(this.m);
       s$b uob = this.F();
       if (uob != null) {
          uob.c(this.g);
       }
       RecommendMusicViewBinderV2 tq = this.q;
       RecommendMusicViewBinderV2 tf = this.f;
       RecommendMusicViewBinderV2 tj = this.j;
       RecommendMusicViewBinderV2$j oj = new RecommendMusicViewBinderV2$j(this);
       if (!PatchProxy.applyVoidFourRefs(tq, tf, tj, oj, null, b0.class, "1")) {
          a.p(tq, "fragment");
          a.p(tf, "recommendListView");
          a.p(tj, "loggedRecommendMusicList");
          a.p(oj, "absolutePositionToRelativePosition");
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          List list = f0.k(tq).m();
          Iterator iterator = new ArrayList(tf.getShowedItemPositionList()).iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             if (integer.intValue() < 0 || integer.intValue() >= list.size()) {
                continue ;
             }else {
                a.o(integer, "absolutePosition");
                a uoa = list.get(integer.intValue());
                if (!uoa instanceof o && !uoa instanceof a) {
                   continue ;
                }else {
                   integer = oj.apply(integer);
                   Music music = uoa.b();
                   if (!tj.contains(music.getId())) {
                      ClientContent$MusicDetailPackage musicDetailP = b2.a(music);
                      int i = integer.intValue() + 1;
                      musicDetailP.index = i;
                      a.o(musicDetailP, "musicDetailPackage");
                      uArrayList.add(musicDetailP);
                      String id = music.getId();
                      a.o(id, "music.id");
                      tj.add(id);
                      uArrayList1.add(music);
                   }
                }
             }
          }
          if (uArrayList.isEmpty() ^ 0x01) {
             ClientContent$MusicDetailPackage[] musicDetailP1 = new ClientContent$MusicDetailPackage[0];
             Object[] objArray1 = uArrayList.toArray(musicDetailP1);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
             g0.m("RECO_MUSIC_SHOW", objArray1);
             g1.o(uArrayList1, 11);
          }
          tf.b();
       }
       i oi = this.d.o0().s().i();
       SelectSource selectSource = (oi != null)? oi.h(): objArray;
       i oi1 = this.d.o0().s().i();
       if (oi1 != null) {
          objArray = oi1.g();
       }
       if (selectSource != null && (selectSource != SelectSource.COLLECT_LIST && (selectSource != SelectSource.LOCAL_LIST && selectSource != SelectSource.HISTORY_LIST))) {
          Context context = this.q.getContext();
          Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          g0.l(context, objArray, 404, "collapse_music_dialog_finish");
          g1.n(objArray, 11, 2);
       }
    label_0167 :
       return;
    }
    public final int D(int p0){
       ArrayList obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecommendMusicViewBinderV2 recommendMus = RecommendMusicViewBinderV2.class;
       if (PatchProxy.isSupport(recommendMus)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, recommendMus, "12");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       recommendMus = this.e;
       Objects.requireNonNull(recommendMus);
       ArrayList uArrayList = PatchProxy.apply(null, recommendMus, b.class, "11");
       if (uArrayList != patchProxyRe) {
       }else {
          List list = recommendMus.c.b().e();
          obj = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().g());
          }
          uArrayList = new ArrayList(obj);
       }
       return (p0 - uArrayList.size());
    }
    public final void E(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecommendMusicViewBinderV2.class, "2")) {
          return;
       }
       if (this.d.o0().s().c() != SwitchTab.RECOMMEND) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("RecommendMusicViewBinder", "checkMusicLibraryVisible", objArray1);
       RecyclerView$LayoutManager layoutManage = this.g.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          objArray = layoutManage;
       }
       if (objArray != null) {
          if (objArray.i0() > 0) {
             if (!this.d.o0().A()) {
                this.d.t0(new MusicLibraryShowAction(true));
             }
          }else if(this.d.o0().A()){
             this.d.t0(new MusicLibraryShowAction(i));
          }
       }
       return;
    }
    public final s$b F(){
       Object obj = PatchProxy.apply(null, this, RecommendMusicViewBinderV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final RxFragment G(){
       return this.q;
    }
    public final boolean H(){
       Object obj = PatchProxy.apply(null, this, RecommendMusicViewBinderV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e.i("NEW_LIBRARY_ITEM_ID") != null)? true: false;
       return b;
    }
    public final void I(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendMusicViewBinderV2.class, "7")) {
          return;
       }
       if (this.H()) {
          this.e.t(p0, 1);
       }else {
          this.e.t(p0, 0);
       }
       return;
    }
    public final boolean J(){
       Object obj = PatchProxy.apply(null, this, RecommendMusicViewBinderV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (this.e.i("EMPTY_ITEM_ID") != null)? 1: 0;
       if (this.e.m().isEmpty() || (this.e.m().size() == 1 && obj)) {
          b = true;
       }
       return b;
    }
    public final void K(boolean p0){
       Object[] objArray1;
       RecommendMusicViewBinderV2 recommendMus = RecommendMusicViewBinderV2.class;
       if (PatchProxy.isSupport(recommendMus) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recommendMus, "10")) {
          return;
       }
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, recommendMus, "11");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = this.q.getActivity();
          int i = 0;
          String str = "RecommendMusicViewBinder";
          if (obj == null || obj.isFinishing()) {
             objArray1 = new Object[i];
             a.D().t(str, "getSessionId getActivity is null", objArray1);
          }else {
             Intent intent = obj.getIntent();
             if (intent != null) {
                objArray = intent.getStringExtra("editSessionId");
                objArray1 = new Object[i];
                a.D().s(str, "getSessionId getIntent EDIT_SESSION_ID: "+objArray, objArray1);
             }
          }
       }
       boolean b = TextUtils.x(objArray);
       Context context = this.q.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       if (!PatchProxy.isSupport(g0.class) || !PatchProxy.applyVoidThreeRefs(context, Boolean.valueOf(p0), Boolean.valueOf(b), null, g0.class, "41")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("is_checked", Boolean.valueOf(p0));
          jsonObject.H("is_default", Boolean.valueOf(b));
          g0.j(context, 0, "EDIT_AI_RAP", 0, "", jsonObject, null);
       }
       return;
    }
    public void Mb(e p0,e p1){
       String id;
       a uoa1;
       a a;
       boolean b;
       object oobject;
       f uof;
       Object obj = this;
       a obj1 = p0;
       Music obj2 = p1;
       RecommendMusicViewBinderV2 recommendMus = RecommendMusicViewBinderV2.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, recommendMus, "6")) {
          return;
       }
       a.p(obj1, "newState");
       a.p(obj2, "lastState");
       g e = p0.s().h().e;
       String str = "RAP_ITEM_ID";
       a uoa = obj.e.i(str);
       AutoMusicStatus uAutoMusicSt = null;
       if (!uoa instanceof n) {
          uoa = uAutoMusicSt;
       }
       t0 ot0 = (uoa != null)? uoa.c(): uAutoMusicSt;
       Integer integer = (e != null)? Integer.valueOf(e.e()): uAutoMusicSt;
       Integer integer1 = (ot0 != null)? Integer.valueOf(ot0.e()): uAutoMusicSt;
       int i = 1;
       if (!(a.g(integer, integer1) ^ i)) {
          b uob = (e != null)? e.b(): uAutoMusicSt;
          b uob1 = (ot0 != null)? ot0.b(): uAutoMusicSt;
          if (!(a.g(uob, uob1) ^ i)) {
          label_007e :
             i oi = p0.s().i();
             int i1 = 0;
             if (oi == null) {
                if (obj.e.q() >= 0) {
                   obj.e.d();
                }
                if (p0.p() && (p1.p() && (!p0.q() || (!p1.q() && !PatchProxy.applyVoidOneRefs(obj1, obj, recommendMus, "8"))))) {
                   if (obj1.B != null) {
                      obj2 = p0.m();
                      if (obj2 != null) {
                         id = obj2.getId();
                         a.o(id, "bubbleMusic.id");
                         b uob2 = obj.e.h(id);
                         if (uob2 == null || uob2.c()) {
                            obj.e.s(new o(obj2), i1);
                         }
                         if (obj1.C != null) {
                            String id1 = obj2.getId();
                            a.o(id1, "bubbleMusic.id");
                            b.H(obj.e, id1, false, null, 6, null);
                         }
                      }
                   }else {
                      uoa1 = p0.s().b();
                      if (uoa1 != null) {
                         uAutoMusicSt = uoa1.b();
                      }
                      AutoMusicStatus lOADING = AutoMusicStatus.LOADING;
                      if (uAutoMusicSt == lOADING) {
                         obj1 = p0.s().b();
                         a = obj1.a;
                         String id2 = a.getId();
                         a.o(id2, "autoMusic.id");
                         b uob3 = obj.e.h(id2);
                         if (uob3 == null || uob3.c()) {
                            obj.e.s(new o(a), i1);
                         }
                         id2 = a.getId();
                         a.o(id2, "autoMusic.id");
                         uob3 = obj.e.h(id2);
                         a.m(uob3);
                         if (!uob3.i() && obj1.b() == lOADING) {
                            String id3 = a.getId();
                            a.o(id3, "autoMusic.id");
                            b.H(obj.e, id3, false, SelectScrollOption.SMOOTH, 2, null);
                         }
                      }else if(obj.c.l != null && ((obj.e.o().isEmpty() ^ i) && (p0.k() != Workspace$Type.AI_CUT && (p0.k() != Workspace$Type.KUAISHAN && (p0.n() || p0.o()))))){
                         obj.f.post(new d(obj, obj.e.o().get(i1)));
                      }
                   }
                }
             label_01aa :
                return;
             }else {
                SelectSource selectSource = oi.h();
                if (selectSource != SelectSource.COLLECT_LIST && (selectSource == SelectSource.LOCAL_LIST || selectSource == SelectSource.HISTORY_LIST)) {
                   if (obj.e.q() >= 0) {
                      obj.e.d();
                   }
                   return;
                }else if(p1.s().c() != p0.s().c() && p0.s().c() == SwitchTab.RECOMMEND){
                   b0.f(obj.e, obj.g);
                }
                if (oi.j()) {
                   obj1 = obj.e.i(str);
                   if (obj1 == null) {
                      b0.d(obj.e, e);
                   }else {
                      obj.e.J(obj1);
                   }
                   obj.e.G(str, i, SelectScrollOption.SMOOTH);
                   return;
                }else {
                   Music music = oi.g();
                   Music mId = music.mId;
                   a.o(mId, "selectedMusic.mId");
                   uoa1 = obj.e.i(mId);
                   if (uoa1 != null) {
                      if (selectSource != SelectSource.AI_CUT && (selectSource == SelectSource.MUSIC_LIBRARY || selectSource == SelectSource.DRAFT_RESTORED)) {
                         obj.I(uoa1);
                      }
                      obj.e.D(uoa1, i, SelectScrollOption.REFRESH);
                      int i2 = uoa1.h();
                      b = oi.d();
                      boolean b1 = oi.b();
                      MusicListItemType$a companion = MusicListItemType.Companion;
                      Objects.requireNonNull(companion);
                      MusicListItemType$a uoa2 = MusicListItemType$a.class;
                      if (PatchProxy.isSupport(uoa2)) {
                         oobject = PatchProxy.applyOneRefs(Integer.valueOf(i2), companion, uoa2, "1");
                         if (oobject != PatchProxyResult.class) {
                         label_026e :
                            obj.e.J(new a(music, b, b1, oobject));
                         }
                      }
                      MusicListItemType[] musicListIte = MusicListItemType.values();
                      int len = musicListIte.length;
                      int i3 = 0;
                      while (true) {
                         if (i3 >= len) {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                         }
                         object oobject1 = musicListIte[i3];
                         int i4 = (oobject1.getValue() == i2)? 1: 0;
                         if (i4) {
                            oobject = oobject1;
                            goto label_026e ;
                         }else {
                            i3 = i3 + 1;
                         }
                      }
                   }else if(music.mType == MusicType.LOCAL){
                      uof = new f(music);
                   }else {
                      a uoa3 = new a(music, oi.d(), oi.b(), null, 8, null);
                   }
                   obj.I(uof);
                   obj.e.C(obj.e.f(uof), i, SelectScrollOption.REFRESH);
                   if (selectSource != SelectSource.MUSIC_LIBRARY) {
                      obj.d.t0(new RequestMusicDetailAction(music));
                   }
                   return;
                }
             }
          }
       }
       obj.e.J(new n(e));
       goto label_007e ;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RecommendMusicViewBinderV2.class, "14")) {
          return;
       }
       this.g.scrollToPosition(0);
       return;
    }
}
