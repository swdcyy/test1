package com.yxcorp.gifshow.v3.editor.cover.CoverEditor;
import com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo;
import java.lang.Boolean;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import upc.o;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import upc.p;
import upc.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import h69.j;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import l26.e;
import l26.f;
import java.util.ArrayList;
import kotlin.Pair;
import qrd.r0;
import di0.b;
import java.util.List;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import elb.y;
import elb.z;
import brd.t;
import upc.e;
import erd.o;
import upc.f;
import upc.g;
import erd.g;
import crd.b;
import crd.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import pb9.q;
import t36.f;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import qaa.a;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import nwc.c;
import voc.o;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import tpc.a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor$a;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.FragmentActivity;
import ooc.j0;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.v3.editor.k;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import ppc.e0;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import tpc.n;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import ppc.d1;
import voc.q;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.view.View;
import android.widget.RelativeLayout;
import com.kwai.robust.PatchProxyResult;
import ppc.m;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;

public class CoverEditor extends j	// class@000e24
{
    public q t;
    public RecommendCoverRepo u;
    public EditDecorationContainerView v;
    public final LifecycleObserver w;

    public void CoverEditor(EditDecorationContainerView p0){
       super();
       this.w = new CoverEditor$1(this);
       this.v = p0;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, CoverEditor.class, "10")) {
          return;
       }
       super.A();
       CoverEditor tu = this.u;
       if (tu != null) {
          Objects.requireNonNull(tu);
          RecommendCoverRepo recommendCov = RecommendCoverRepo.class;
          if (!PatchProxy.isSupport(recommendCov) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tu, recommendCov, "20")) {
             Object[] objArray = new Object[0];
             a.D().w("RecommendCoverRepo", "resume: ", objArray);
             tu.A(0, 0);
          }
       }
       return;
    }
    public void B(EditorDelegate p0,String p1){
       String str;
       int i1;
       boolean b;
       o c;
       Object[] objArray1;
       b uob;
       String[] stringArray;
       d c1;
       ArrayList uArrayList;
       int i3;
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverEditor.class, "2")) {
          return;
       }
       super.B(p0, p1);
       if (!f.A(p0.getType())) {
          o oo1 = ViewModelProviders.of(p0.q(), new p(new d(this.d.N()))).get(oo);
          Objects.requireNonNull(oo1);
          Object[] objArray = null;
          str = "1";
          if (!PatchProxy.applyVoid(objArray, oo1, oo, str)) {
             c = oo1.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(objArray, c, d.class, str)) {
                String str2 = "PluginManager.get\(ServerMemoryPlugin::class.java\)";
                int i2 = -1077260241;
                String str3 = "RecommendCoverTextRepo";
                String str4 = "defult";
                i1 = 2;
                if (j.j(c.e)) {
                   objArray1 = new Object[0];
                   a.D().w(str3, "load default cover text from AnnualAlbum", objArray1);
                   uob = d.a(i2);
                   a.o(uob, str2);
                   stringArray = uob.k10();
                   if (stringArray == null) {
                      stringArray = d.f;
                   }
                   c1 = c.c;
                   uArrayList = new ArrayList(stringArray.length);
                   i2 = stringArray.length;
                   for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                      uArrayList.add(r0.a(stringArray[i3], str4));
                   }
                   b.t(c1, uArrayList, objArray, i1, objArray);
                }else if(j.k(c.e)){
                   uob = d.a(i2);
                   a.o(uob, str2);
                   stringArray = uob.qC();
                   if (stringArray != null) {
                      c1 = c.c;
                      uArrayList = new ArrayList(stringArray.length);
                      i2 = stringArray.length;
                      for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                         uArrayList.add(r0.a(stringArray[i3], str4));
                      }
                      b.t(c1, uArrayList, objArray, i1, objArray);
                   }
                }
                List list = List.class;
                str2 = a.a.getString("default_cover_text_list", "[]");
                Object[] objArray2 = (str2 == null || str2 == "")? objArray: b.a(str2, list);
                if (!q.f(objArray2)) {
                   objArray1 = new Object[0];
                   a.D().w(str3, "load default cover text from cache info, size = "+objArray2.size(), objArray1);
                   c1 = c.c;
                   a.o(objArray2, "cacheTextList");
                   uArrayList = new ArrayList(u.Y(objArray2, 10));
                   Iterator iterator = objArray2.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(new Pair(iterator.next(), str4));
                   }
                   b.t(c1, uArrayList, objArray, i1, objArray);
                }else {
                   c.d.c(y.b.a().a().map(e.b).subscribe(new f(c), g.b));
                }
             }
          }
          if (p0.q() != null) {
             p0.q().getLifecycle().addObserver(this.w);
          }
          String str1 = j0.f(this.d.getContext().getIntent(), "editSessionId");
          if (!TextUtils.x(str1)) {
             if (!PatchProxy.applyVoidOneRefs(str1, oo1, oo, "5")) {
                a.p(str1, "sessionId");
                oo1.c.c(str1, 0);
             }
          }else {
             f.p0(p0.u(), q.class).d(oo1.a);
          }
       }
       if (!f.E(p0.getType())) {
          Workspace workspace = p0.N().v();
          int i = (workspace != null && Workspace$Type.KUAISHAN == workspace.getType())? 1: 0;
          if (workspace != null && (Workspace$Type.KTV_MV != workspace.getType() && (!i && (!j.i(workspace) && workspace.getType() != Workspace$Type.ALBUM_MOVIE)))) {
             a uoa = p0.N().s0();
             c uoc = p0.N();
             i1 = i ^ 0x01;
             b = (workspace.getType() == Workspace$Type.PHOTO_MOVIE)? true: false;
             RecommendCoverRepo recommendCov = new RecommendCoverRepo(p0, uoa, uoc, i1, b);
             this.u = str;
             f.o0(str, p0.u(), VideoFrameChangeListener.class);
             f.o0(this.u, p0.u(), c.class);
          }
       }
    label_0224 :
       return;
    }
    public void C(o p0){
    }
    public void D(boolean p0){
       String str;
       CoverEditor uCoverEditor = CoverEditor.class;
       if (PatchProxy.isSupport(uCoverEditor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCoverEditor, "5")) {
          return;
       }
       this.t(p0);
       CoverEditor tu = this.u;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(null, tu, RecommendCoverRepo.class, "19") && (tu.k.getValue() == STATE.FINISHED && tu.l != null)) {
             a value = tu.i.getValue();
             if (value != null) {
                str = String.valueOf(value.b());
                if (str != null) {
                label_0052 :
                   tu.v(str);
                }
             }
             str = "";
             goto label_0052 ;
          }
       }
       BaseEditor tf = this.f;
       if (tf instanceof CoverEditor$a) {
          tf.R6();
       }
       this.c(R.dimen.arg_RES_7f07038c, false);
       return;
    }
    public void G(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CoverEditor.class, "6")) {
          return;
       }
       CoverEditor tu = this.u;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, RecommendCoverRepo.class, "14")) {
             RecommendCoverRepo g = tu.g;
             if (g != null) {
                g.dispose();
             }
             tu.k.postValue(STATE.FINISHED);
             Activity context = tu.m.getContext();
             Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             ViewModel viewModel = ViewModelProviders.of(context).get(j0.class);
             a.o(viewModel, "ViewModelProviders.of\(ed¡­ityViewModel::class.java\)");
             viewModel.o0().c(tu);
          }
          f.t0(this.u, this.i().u(), VideoFrameChangeListener.class);
          f.t0(this.u, this.i().u(), c.class);
       }
       if (!f.A(this.i().getType())) {
          o oo1 = ViewModelProviders.of(this.i().q(), new p(new d(this.d.N()))).get(oo);
          Objects.requireNonNull(oo1);
          if (!PatchProxy.applyVoid(objArray, oo1, oo, "4")) {
             oo = oo1.c;
             Objects.requireNonNull(oo);
             if (!PatchProxy.applyVoid(objArray, oo, d.class, "3")) {
                oo.d.dispose();
                oo.d.d();
             }
             oo1.c.d(true);
          }
       }
       if (this.d.q() != null) {
          this.d.q().getLifecycle().removeObserver(this.w);
       }
       return;
    }
    public void H(){
       BaseEditorFragment uBaseEditorF;
       VideoCoverEditorV3Fragment videoCoverEd;
       CoverEditor uCoverEditor = CoverEditor.class;
       if (PatchProxy.applyVoid(null, this, uCoverEditor, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "coverEditor";
       a.D().w(str, "onStart", objArray);
       boolean b = f.E(this.d.getType());
       String str1 = f.m(this.d.getType());
       String str2 = "postCoverMonitor";
       if (!PatchProxy.isSupport(uCoverEditor) || (!PatchProxy.applyVoidTwoRefs(str1, Boolean.valueOf(b), this, uCoverEditor, "3") && !TextUtils.x(str1))) {
          d.d(str2).n();
          d.d(str2).g("clickToLoadData");
          d.d(str2).l(str1);
          if (!b) {
             d.d(str2).a("isPreload", String.valueOf(k.f().b));
          }
       }
       if (b) {
          str = "photoCoverEditor";
       }
       boolean b1 = true;
       if (this.f == null) {
          if (b) {
             uBaseEditorF = this.f(this.i().q().getChildFragmentManager(), str, PhotosCoverEditorV3Fragment.class);
             this.f = uBaseEditorF;
             if (uBaseEditorF == null) {
                uBaseEditorF = new PhotosCoverEditorV3Fragment();
             }
             this.f = uBaseEditorF;
             this.t = new e0();
             uBaseEditorF.J.j = this.v;
          }else if(this.u != null){
             ViewModelProviders.of(this.i().q(), new n(this.u)).get(RecommendCoverViewModel.class);
          }
          uBaseEditorF = this.f(this.i().q().getChildFragmentManager(), str, VideoCoverEditorV3Fragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             videoCoverEd = new VideoCoverEditorV3Fragment();
          }
          this.f = videoCoverEd;
          videoCoverEd.K.g = this.v;
          this.t = new d1();
          this.f.uh(this.d, this.i);
          uCoverEditor = this.t;
          uCoverEditor.a = this.d;
          uCoverEditor.b = this.i;
          i = 1;
       }
       d uod = d.d(str2);
       String str3 = (i)? "cold": "warm";
       uod.a("openMode", str3);
       e uoe = this.i().q().getChildFragmentManager().beginTransaction();
       if (this.d.p()) {
          uoe.y(R.anim.arg_RES_7f0100d4, 0x7f0100d4);
       }else {
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       }
       if (b && PostExperimentUtils.p1()) {
          this.i().J().findViewById(R.id.picture_recycler_view).setVisibility(8);
       }
       this.c(R.dimen.arg_RES_7f07038c, b1);
       this.a(str, uoe);
       this.t.a(this.f, i, this.d.getType());
       return;
    }
    public String T(){
       BaseEditor obj = PatchProxy.apply(null, this, CoverEditor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj instanceof m) {
          return obj.k8();
       }
       return null;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, CoverEditor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 9, this.i);
    }
    public int q(){
       return 0x7f07038c;
    }
    public boolean s(){
       BaseEditor obj = PatchProxy.apply(null, this, CoverEditor.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj instanceof CoverEditor$a && obj.onBackPressed()) {
          return true;
       }
       return super.s();
    }
    public boolean y(){
       Object obj = PatchProxy.apply(null, this, CoverEditor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (f.E(this.d.getType()) ^ 0x01);
    }
}
