package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import androidx.fragment.app.Fragment;
import amd.c;
import smd.d;
import rmd.g;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$a;
import java.lang.Boolean;
import faa.a;
import q87.c;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryCloseAction;
import xvc.b;
import xld.a;
import java.util.Map;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.List;
import yld.j;
import java.util.Objects;
import voc.o;
import yld.d;
import msd.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$c;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$d;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qtc.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import nmd.i0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$f;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$g;
import erd.g;
import crd.b;
import w46.b;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.e;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import x59.e;
import java.util.Set;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import x59.e$d;

public final class StickerTimelineFragment extends DecorationTimelineFragment	// class@000aa1
{
    public View A;
    public KwaiLoadingView B;
    public final HashSet C;
    public b D;
    public final c E;
    public e F;
    public PublishSubject G;
    public d$a H;
    public StickerTimelineFragment$a I;
    public final a J;
    public final e$d K;
    public HashMap L;
    public final String w;
    public a x;
    public boolean y;
    public RecyclerView z;

    public void StickerTimelineFragment(){
       super();
       this.w = "StickerTimelineFragment";
       this.C = new HashSet();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.E = publishSubje;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<StickerDetailInfo>\(\)");
       this.J = uoa;
       this.K = new StickerTimelineFragment$b(this);
    }
    public String Me(){
       return this.w;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, StickerTimelineFragment.class, "16")) {
          return;
       }
       StickerTimelineFragment tL = this.L;
       if (tL != null) {
          tL.clear();
       }
       return;
    }
    public int hh(){
       return 0x7f0d156c;
    }
    public int ih(){
       Object obj = PatchProxy.apply(null, this, StickerTimelineFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703a2);
    }
    public c lh(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerTimelineFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return g.a(p0);
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment.class, "3")) {
          return;
       }
       a.p(p0, "context");
       super.onAttach(p0);
       StickerTimelineFragment tI = this.I;
       if (tI != null) {
          tI.a(false);
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, StickerTimelineFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.w, "onBackPressed: ", objArray);
       if (this.kh().o0().B()) {
          this.kh().t0(new StickerLibraryCloseAction());
          return true;
       }else if(this.isAdded()){
          this.mh();
          if (this.kh().o0().t()) {
             Object[] objArray1 = new Object[i];
             a.D().w(this.w, "isOriginPhotoMovie: ", objArray1);
             this.kh().t0(new PhotoMovieDecorationTimelineDetachAction(i, true, this.kh().o0().l()));
          }else {
             this.kh().t0(new DecorationTimelineDetachAction(i, i, true));
          }
          i = true;
       }
       return i;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, StickerTimelineFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = super.onCreateView(p0, p1, p2);
       if (!this.fh().z() instanceof VideoSDKPlayerView) {
          return view;
       }
       obj = this.fh().z();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
       View view1 = obj;
       o oo = this.fh().x();
       a.o(oo, "editorDelegate.editorContext");
       j oj = new j(this.u1(), this.kh(), this, view1, oo, true);
       this.jh().add(p2);
       d uod = new d(this.kh(), this, this.u1(), this.gh(), true);
       this.jh().add(p2);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StickerTimelineFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       this.C.clear();
       this.D = null;
       this.G = null;
       this.H = null;
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.eh();
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, StickerTimelineFragment.class, "5")) {
          return;
       }
       super.onDetach();
       StickerTimelineFragment tI = this.I;
       if (tI != null) {
          tI.a(true);
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(StickerTimelineFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StickerTimelineFragment.class, "4")) {
          return;
       }
       super.onHiddenChanged(p0);
       StickerTimelineFragment tI = this.I;
       if (tI != null) {
          tI.a(p0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerTimelineFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.z = m1.f(p0, 0x7f0a0a70);
       this.A = m1.f(p0, 0x7f0a3b66);
       this.B = m1.f(p0, 0x7f0a2db1);
       StickerTimelineFragment tA = this.A;
       if (tA != null) {
          tA.setOnClickListener(new StickerTimelineFragment$c(this));
       }
       this.sh();
       this.C.add(new StickerTimelineFragment$d(this));
       if (!PatchProxy.applyVoid(null, this, StickerTimelineFragment.class, "7")) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w(this.w, "loadStickers: ", objArray);
          if (this.x == null) {
             this.x = ViewModelProviders.of(this.fh().q()).get(a.class);
          }
          tA = this.x;
          a.m(tA);
          if (tA.s0().getValue() != null) {
             tA = this.x;
             a.m(tA);
             Integer value = tA.s0().getValue();
             LoadingStyle loadingStyle = 2;
             if (value != null && value.intValue() == loadingStyle) {
                Object[] objArray1 = new Object[i];
                a.D().w(this.w, "mRequestState is SUCCESS ", objArray1);
                this.rh();
             }
          }
          tA = this.B;
          if (tA != null) {
             tA.setLoadingStyle(LoadingStyle.GRAY_DARK);
          }
          tA = this.B;
          if (tA != null) {
             tA.setVisibility(i);
          }
          tA = this.x;
          a.m(tA);
          tA.s0().observe(this.fh().q(), new i0(this));
       }
       return;
    }
    public final KwaiLoadingView qh(){
       return this.B;
    }
    public final void rh(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StickerTimelineFragment.class, "8")) {
          return;
       }
       StickerTimelineFragment tx = this.x;
       a.m(tx);
       Workspace$Type obj = PatchProxy.apply(objArray, this, StickerTimelineFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.fh().getType();
          a.o(obj, "editorDelegate.type");
          b = h1.d(obj);
       }
       c uoc = this.fh().N();
       a.o(uoc, "editorDelegate.workspaceDraft");
       c uoc1 = this.fh().N();
       a.o(uoc1, "editorDelegate.workspaceDraft");
       this.th(tx.q0(b, h1.k(uoc.v()), h1.j(uoc1.v()), true));
       return;
    }
    public final void sh(){
       if (PatchProxy.applyVoid(null, this, StickerTimelineFragment.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.w, "registerStickerClickSubject: ", objArray);
       this.D = this.E.debounce(50, TimeUnit.MILLISECONDS).flatMap(StickerTimelineFragment$e.b).observeOn(d.a).subscribe(new StickerTimelineFragment$f(this), new StickerTimelineFragment$g(this));
       return;
    }
    public final void th(List p0){
       c uoc1;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.w, "showStickers: ", objArray);
       StickerTimelineFragment tz = this.z;
       if (tz == null) {
          Object[] objArray1 = new Object[i];
          a.D().t(this.w, "mRecyclerView = null ", objArray1);
          return;
       }else if(this.y == null){
          a.m(tz);
          tz.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), i, i));
          tz = this.z;
          a.m(tz);
          if (tz.getItemDecorationCount()) {
             tz = this.z;
             a.m(tz);
             tz.removeItemDecorationAt(i);
          }
          tz = this.z;
          a.m(tz);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          tz.addItemDecoration(new e(i, n.c(uoc.a(), (float)20), i));
          tz = this.z;
          a.m(tz);
          ViewParent parent = tz.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          ViewGroup$LayoutParams layoutParams = parent.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          layoutParams.topMargin = n.c(uoc1.a(), 0);
          this.y = true;
       }
       if (this.F == null) {
          uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          e uoe = new e(p0, n.c(uoc1.a(), (float)50));
          this.F = uoe;
          a.m(uoe);
          uoe.Y0(this.C);
       }
       tz = this.z;
       a.m(tz);
       if (a.g(tz.getAdapter(), this.F) ^ true) {
          tz = this.z;
          a.m(tz);
          tz.setAdapter(this.F);
       }
       tz = this.F;
       a.m(tz);
       tz.a1(p0);
       StickerTimelineFragment tF = this.F;
       a.m(tF);
       tF.Z0(this.K);
       tF = this.F;
       a.m(tF);
       tF.k0();
       return;
    }
}
