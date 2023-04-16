package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.System;
import java.util.ArrayList;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.String;
import kotlin.jvm.internal.a;
import dca.s;
import com.kwai.robust.PatchProxyResult;
import bca.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelAttachAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import h69.b;
import lnc.g7;
import tvc.e;
import cca.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutLastSelectedSubItemIdUpdateAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDisposableListAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDestroyAction;
import java.util.HashMap;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.kuaishou.edit.draft.Workspace$Type;
import dca.a;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import ooc.h1;
import dca.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public final class VideoTemplateFragment extends BaseEditorFragment	// class@001b91
{
    public s G;
    public i H;
    public a I;
    public long J;
    public boolean K;
    public final ArrayList L;
    public final VideoTemplateFragment$a M;
    public a N;
    public HashMap O;

    public void VideoTemplateFragment(){
       super();
       this.J = System.currentTimeMillis();
       this.L = new ArrayList();
       this.M = new VideoTemplateFragment$a(this);
    }
    public static final i yh(VideoTemplateFragment p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("helperContract");
       }
       return p0;
    }
    public static final s zh(VideoTemplateFragment p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("viewModel");
       }
       return p0;
    }
    public final void Ah(boolean p0){
       this.K = p0;
    }
    public void fh(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment.class, "8")) {
          return;
       }
       this.J = System.currentTimeMillis();
       this.qh().add(this.M);
       VideoTemplateFragment tN = this.N;
       if (tN != null) {
          this.qh().add(tN);
       }
       Iterator iterator = this.L.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       tN = this.G;
       if (tN == null) {
          a.S("viewModel");
       }
       tN.t0(new VideoTemplatePanelAttachAction());
       FragmentActivity activity = this.getActivity();
       boolean b = false;
       if (activity != null) {
          Intent intent = activity.getIntent();
          if (intent != null) {
             b1 = TextUtils.n("album_draft", j0.f(intent, "SOURCE"));
          label_006c :
             VideoTemplateFragment tI = this.I;
             if (tI == null) {
                a.S("dataProvider");
             }
             Objects.requireNonNull(tI);
             if (PatchProxy.isSupport(uoa)) {
                a obj = PatchProxy.applyOneRefs(Boolean.valueOf(b1), tI, uoa, "10");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else if(j.h(tI.j.T0())){
                   b1 = tI.a.mT();
                   tI.b = b1;
                   String str = 1;
                   if (!b1) {
                      if (g7.a(tI.j)) {
                         obj = tI.d;
                         if (obj != null) {
                            b uob = obj.o0();
                            if (uob == null || uob.f() != str) {
                            label_00c4 :
                               b1 = false;
                            }
                         }else {
                            goto label_00c4 ;
                         }
                      }else {
                         goto label_00c4 ;
                      }
                   }
                   b1 = true;
                }
             }else {
                goto label_0091 ;
             }
             if (!b1) {
                tN = this.I;
                if (tN == null) {
                   a.S("dataProvider");
                }
                if (tN.c == null) {
                label_010d :
                   tN = this.I;
                   if (tN == null) {
                      a.S("dataProvider");
                   }
                   Objects.requireNonNull(tN);
                   Object obj1 = PatchProxy.apply(null, tN, uoa, "11");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(!j.h(tN.j.T0())){
                      b = tN.a.mT();
                   }
                   if (b) {
                      VideoTemplateFragment tG = this.G;
                      if (tG == null) {
                         a.S("viewModel");
                      }
                      tG.t0(new VideoTemplateDisposableListAction());
                   }
                   return;
                }
             }
             tN = this.I;
             if (tN == null) {
                a.S("dataProvider");
             }
             tN.m(b);
             tN = this.G;
             if (tN == null) {
                a.S("viewModel");
             }
             tN.t0(new AICutLastSelectedSubItemIdUpdateAction("default"));
             tN = this.G;
             if (tN == null) {
                a.S("viewModel");
             }
             tN.t0(new VideoTemplateDisposableListAction());
             tN = this.G;
             if (tN == null) {
                a.S("viewModel");
             }
             tN.t0(new VideoTemplateLoadListAction());
             goto label_010d ;
          }
       }
       b1 = false;
       goto label_006c ;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VideoTemplateFragment.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String str;
       BaseEditorFragment obj = PatchProxy.apply(null, this, VideoTemplateFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       a.o(obj, "mEditorDelegate");
       c uoc = obj.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       if (j.h(uoc.T0())) {
          str = a1.p(R.string.arg_RES_7f100b14);
          a.o(str, "CommonUtil.string\(R.stri¡­edit_ai_cut_style_annual\)");
          return str;
       }else {
          str = a1.p(R.string.arg_RES_7f101bea);
          a.o(str, "CommonUtil.string\(R.stri¡­.kuaishan_title_template\)");
          return str;
       }
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment.class, "9")) {
          return;
       }
       Iterator iterator = this.L.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoTemplateFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d1667, p1, false);
       this.q = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       VideoTemplateFragment tG = this.G;
       if (tG == null) {
          a.S("viewModel");
       }
       tG.t0(new VideoTemplateDestroyAction());
       this.gh();
       if (!PatchProxy.applyVoid(null, this, VideoTemplateFragment.class, "14")) {
          tG = this.O;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       VideoTemplateFragment tG;
       ViewModel viewModel;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplateFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       String str = "viewModel";
       if (!PatchProxy.applyVoid(null, this, VideoTemplateFragment.class, "6")) {
          BaseEditorFragment tt = this.t;
          String str1 = "mEditorDelegate";
          a.o(tt, str1);
          viewModel = ViewModelProviders.of(tt.q()).get(s.class);
          a.o(viewModel, "ViewModelProviders.of\(mE¡­ateViewModel::class.java\)");
          this.G = viewModel;
          tG = this.I;
          if (tG == null) {
             a.S("dataProvider");
          }
          VideoTemplateFragment tG1 = this.G;
          if (tG1 == null) {
             a.S(str);
          }
          tG.k(tG1);
          tt = this.t;
          a.o(tt, str1);
          c uoc = tt.N();
          String str2 = "mEditorDelegate.workspaceDraft";
          a.o(uoc, str2);
          BaseEditorFragment tt1 = this.t;
          a.o(tt1, str1);
          c uoc1 = tt1.N();
          a.o(uoc1, str2);
          String str3 = "helperContract";
          String str4 = "mViewRoot";
          if (!j.c(uoc.a1(), uoc1.T0())) {
             tt = this.t;
             a.o(tt, str1);
             if (!g7.a(tt.N())) {
             label_00a9 :
                tG = this.L;
                VideoTemplateFragment tG2 = this.G;
                if (tG2 == null) {
                   a.S(str);
                }
                VideoTemplateFragment tH1 = this.H;
                if (tH1 == null) {
                   a.S(str3);
                }
                tt1 = this.q;
                a.o(tt1, str4);
                tG.add(new VideoTemplateViewBinder(this, tG2, tH1, tt1));
                BaseEditorFragment tq1 = this.q;
                a.o(tq1, str4);
                this.L.add(new h1(this, tq1));
                tq1 = this.t;
                a.o(tq1, str1);
                BaseFragment uBaseFragmen = tq1.q();
                a.o(uBaseFragmen, "mEditorDelegate.previewFragment");
                BaseEditorFragment tq2 = this.q;
                a.o(tq2, str4);
                BaseEditorFragment tt2 = this.t;
                a.o(tt2, str1);
                c uoc2 = tt2.N();
                a.o(uoc2, str2);
                BaseEditorFragment tt3 = this.t;
                a.o(tt3, str1);
                j oj = new j(uBaseFragmen, this, tq2, (j.h(uoc2.T0()) ^ 0x01), DraftUtils.S(tt3.N()));
                this.L.add(tt1);
             }
          }
          VideoTemplateFragment tH = this.H;
          if (tH == null) {
             a.S(str3);
          }
          BaseEditorFragment tq = this.q;
          a.o(tq, str4);
          a uoa = new a(tH, tq, this);
          this.N = uoa;
          a.m(uoa);
          this.L.add(uoa);
          goto label_00a9 ;
       }
       this.fh();
       if (this.N == null) {
          tG = this.G;
          if (tG == null) {
             a.S(str);
          }
          tG.t0(new VideoTemplateLoadListAction());
       }
       return;
    }
}
