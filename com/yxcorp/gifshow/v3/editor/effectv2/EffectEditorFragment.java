package com.yxcorp.gifshow.v3.editor.effectv2.EffectEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import cqc.a;
import com.yxcorp.gifshow.v3.editor.effectv2.EffectEditorFragment$a;
import qqc.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.Set;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.v;
import lnc.a1;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import lqc.d;
import i2b.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.widget.Button;
import ooc.h1;
import java.util.List;
import uxb.e;
import uxb.l;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import nqc.a;
import nqc.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import k2b.s$b;
import nqc.l;
import nqc.n;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder;
import nqc.g;
import mqc.d;
import mqc.f;
import mqc.i;
import mqc.l;
import mqc.e;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import java.util.HashMap;
import mqc.a;
import java.util.Collection;

public final class EffectEditorFragment extends BaseEditorFragment	// class@000f23
{
    public d G;
    public i H;
    public final List I;
    public final a J;
    public e K;
    public final Observer L;
    public HashMap M;

    public void EffectEditorFragment(){
       super();
       this.I = new ArrayList();
       this.J = new a();
       this.L = new EffectEditorFragment$a(this);
    }
    public static final d yh(EffectEditorFragment p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("effectViewModel");
       }
       return p0;
    }
    public final void Ah(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectEditorFragment.class, "9")) {
          return;
       }
       a.p(p0, "editorHelperContract");
       this.H = p0;
       return;
    }
    public final void Bh(){
       if (PatchProxy.applyVoid(null, this, EffectEditorFragment.class, "8")) {
          return;
       }
       EffectEditorFragment tG = this.G;
       if (tG == null) {
          a.S("effectViewModel");
       }
       tG.r0().removeObserver(this.L);
       return;
    }
    public String E7(){
       return "Effect";
    }
    public void fh(){
       EffectEditorFragment tG;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EffectEditorFragment.class, "3")) {
          return;
       }
       String str = "effectViewModel";
       if (!PatchProxy.applyVoid(objArray, this, EffectEditorFragment.class, "7")) {
          tG = this.G;
          if (tG == null) {
             a.S(str);
          }
          tG.r0().observe(this, this.L);
       }
       tG = this.G;
       if (tG == null) {
          a.S(str);
       }
       Objects.requireNonNull(tG);
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       Set set = this.qh();
       EffectEditorFragment tK = this.K;
       if (tK == null) {
          a.S("mPanelViewBinder");
       }
       set.add(tK);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectEditorFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(EffectEditorFragment.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String str;
       EffectEditorFragment obj = PatchProxy.apply(null, this, EffectEditorFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H;
       if (obj == null) {
          a.S("editorHelperContract");
       }
       EditorDelegate uEditorDeleg = obj.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       if (v.h(uEditorDeleg.N())) {
          str = a1.p(R.string.arg_RES_7f100d09);
          a.o(str, "CommonUtil.string\(R.string.effects\)");
       }else {
          str = "";
       }
       return str;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, EffectEditorFragment.class, "4")) {
          return;
       }
       this.Bh();
       EffectEditorFragment tG = this.G;
       if (tG == null) {
          a.S("effectViewModel");
       }
       Objects.requireNonNull(tG);
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       Set set = this.qh();
       EffectEditorFragment tK = this.K;
       if (tK == null) {
          a.S("mPanelViewBinder");
       }
       set.remove(tK);
       return;
    }
    public int lh(){
       return 4;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectEditorFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       ViewModel viewModel = ViewModelProviders.of(uEditorDeleg.q()).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­ectViewModel::class.java\)");
       this.G = viewModel;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       EffectEditorFragment i1;
       EffectEditorFragment h1;
       f uof;
       EditorDelegate uEditorDeleg1;
       String str7;
       String str8;
       EffectEditorFragment view11;
       EditorDelegate view11;
       View this;
       EffectEditorFragment i2;
       VideoSDKPlayerView videoSDKPlay3;
       BaseFragment uBaseFragmen2;
       EffectEditorFragment j;
       s$b uob;
       i oi;
       l ol;
       EditorDelegate uEditorDeleg2;
       EffectEditorFragment this1;
       BaseEditorFragment uBaseEditorF = this;
       String obj = p0;
       e obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EffectEditorFragment.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "inflater");
       boolean b = d.a();
       int i = (b)? 0x7f0d04b8: 0x7f0d04b7;
       uBaseEditorF.q = a.g(obj, i, p1, false);
       if (PostExperimentUtils.p()) {
          Button uButton = uBaseEditorF.q.findViewById(R.id.top_tab_1);
          if (uButton != null) {
             uButton.setText(R.string.arg_RES_7f104a51);
          }
       }
       View view = this.mh();
       a.o(view, "rootView");
       uBaseEditorF.I.add(new h1(uBaseEditorF, view));
       EffectEditorFragment h = uBaseEditorF.H;
       if (h == null) {
          a.S("editorHelperContract");
       }
       EditorDelegate uEditorDeleg = h.f();
       String str = "editorHelperContract.editorDelegate";
       a.o(uEditorDeleg, str);
       boolean b1 = v.h(uEditorDeleg.N());
       String str1 = "editorHelperContract.get¡­owLoggerType.TIME_EFFECT\)";
       String str2 = "editorHelperContract.get¡­LoggerType.FILTER_EFFECT\)";
       String str3 = "editorHelperContract.timelineSavedData!!";
       String str4 = "editorHelperContract\n   ¡­rDelegate.previewFragment";
       obj = "editorHelperContract\n          .editorDelegate";
       String str5 = "editorHelperContract.edi¡­rDelegate.previewFragment";
       String str6 = "editorHelperContract.videoSDKPlayerView!!";
       if (b) {
          obj1 = l.b();
          h = uBaseEditorF.H;
          if (h == null) {
             a.S("editorHelperContract");
          }
          EditReduxViewModel BaseFragment view1 = obj1.VZ(h);
          i1 = uBaseEditorF.I;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uof = h1.i();
          a.m(uof);
          a.o(uof, str3);
          f uof1 = uof;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          VideoSDKPlayerView videoSDKPlay = h1.j();
          a.m(videoSDKPlay);
          a.o(videoSDKPlay, str6);
          VideoSDKPlayerView videoSDKPlay1 = videoSDKPlay;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str);
          BaseFragment uBaseFragmen = uEditorDeleg1.q();
          a.o(uBaseFragmen, str5);
          View view2 = this.mh();
          a.o(view2, "rootView");
          BaseFragment uBaseFragmen1 = uBaseFragmen;
          str7 = str3;
          str8 = str1;
          EditReduxViewModel uEditReduxVi = view1;
          view1 = uBaseFragmen1;
          String str9 = str4;
          str4 = str6;
          String str10 = str2;
          str2 = str5;
          String str11 = obj;
          HighlightTimeViewBinder highlightTim = new HighlightTimeViewBinder(uof1, videoSDKPlay1, view1, this, view2, uEditReduxVi);
          i1.add(h);
          if (b1) {
             h1 = uBaseEditorF.I;
             i1 = uBaseEditorF.H;
             if (i1 == null) {
                a.S("editorHelperContract");
             }
             VideoSDKPlayerView videoSDKPlay2 = i1.j();
             a.m(videoSDKPlay2);
             a.o(videoSDKPlay2, str4);
             view11 = uBaseEditorF.H;
             if (view11 == null) {
                a.S("editorHelperContract");
             }
             view11 = view11.f();
             a.o(view11, str);
             view1 = view11.q();
             a.o(view1, str2);
             this = this.mh();
             a.o(this, "rootView");
             h1.add(new a(videoSDKPlay2, view1, uBaseEditorF, this));
          }
          i2 = uBaseEditorF.I;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h1.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str);
          uBaseFragmen2 = uEditorDeleg1.q();
          a.o(uBaseFragmen2, str2);
          this = this.mh();
          a.o(this, "rootView");
          j = uBaseEditorF.J;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uob = h1.a(EditorDelegate$ShowLoggerType.FILTER_EFFECT);
          a.o(uob, str10);
          oi = new i(videoSDKPlay3, uBaseFragmen2, this, this, j, uob);
          i2.add(str1);
          i2 = uBaseEditorF.I;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h1.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str);
          uBaseFragmen2 = uEditorDeleg1.q();
          a.o(uBaseFragmen2, str2);
          this = this.mh();
          a.o(this, "rootView");
          ol = new l(videoSDKPlay3, uBaseFragmen2, this, this, uBaseEditorF.J, null);
          i2.add(str1);
          i2 = uBaseEditorF.I;
          h = uBaseEditorF.H;
          if (h == null) {
             a.S("editorHelperContract");
          }
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str11);
          uBaseFragmen2 = uEditorDeleg1.q();
          a.o(uBaseFragmen2, str9);
          this = this.mh();
          a.o(this, "rootView");
          j = uBaseEditorF.J;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uob = h1.a(EditorDelegate$ShowLoggerType.TIME_EFFECT);
          a.o(uob, str8);
          n on = new n(h, uBaseFragmen2, this, this, j, uob);
          i2.add(str1);
          h1 = uBaseEditorF.I;
          i1 = uBaseEditorF.H;
          if (i1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg2 = i1.f();
          a.o(uEditorDeleg2, str);
          uBaseFragmen2 = uEditorDeleg2.q();
          a.o(uBaseFragmen2, "editorHelperContract.edi¡­         .previewFragment");
          view = this.mh();
          a.o(view, "rootView");
          this1 = uBaseEditorF.H;
          if (this1 == null) {
             a.S("editorHelperContract");
          }
          EditReduxViewModel uEditReduxVi1 = uEditReduxVi;
          h1.add(new HighlightTextPanelViewBinder(uBaseFragmen2, view, this1, uEditReduxVi1));
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h1.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str);
          uBaseFragmen2 = uEditorDeleg1.q();
          a.o(uBaseFragmen2, str2);
          this = this.mh();
          a.o(this, "rootView");
          g og = new g(videoSDKPlay3, uBaseFragmen2, this, this, uEditReduxVi1);
          uBaseEditorF.K = uob;
       }else {
          String view3 = str1;
          String str12 = str2;
          str7 = str3;
          str2 = str5;
          str3 = obj;
          obj = str4;
          str4 = str6;
          if (b1) {
             h = uBaseEditorF.I;
             this1 = uBaseEditorF.H;
             if (this1 == null) {
                a.S("editorHelperContract");
             }
             VideoSDKPlayerView videoSDKPlay4 = this1.j();
             a.m(videoSDKPlay4);
             a.o(videoSDKPlay4, str4);
             j = uBaseEditorF.H;
             if (j == null) {
                a.S("editorHelperContract");
             }
             EditorDelegate uEditorDeleg3 = j.f();
             a.o(uEditorDeleg3, str);
             BaseFragment uBaseFragmen3 = uEditorDeleg3.q();
             a.o(uBaseFragmen3, str2);
             View view4 = this.mh();
             a.o(view4, "rootView");
             h.add(new d(videoSDKPlay4, uBaseFragmen3, uBaseEditorF, view4));
          }
          i2 = uBaseEditorF.I;
          h = uBaseEditorF.H;
          if (h == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          i1 = uBaseEditorF.H;
          if (i1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg2 = i1.f();
          a.o(uEditorDeleg2, str);
          uBaseFragmen2 = uEditorDeleg2.q();
          a.o(uBaseFragmen2, str2);
          this = this.mh();
          a.o(this, "rootView");
          j = uBaseEditorF.J;
          str8 = view3;
          view11 = uBaseEditorF.H;
          if (view11 == null) {
             a.S("editorHelperContract");
          }
          uob = view11.a(EditorDelegate$ShowLoggerType.FILTER_EFFECT);
          a.o(uob, str12);
          String str13 = str8;
          String str14 = obj;
          uof = new f(videoSDKPlay3, uBaseFragmen2, this, this, j, uob);
          i2.add(str1);
          i2 = uBaseEditorF.I;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h1.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str);
          uBaseFragmen2 = uEditorDeleg1.q();
          a.o(uBaseFragmen2, str2);
          this = this.mh();
          a.o(this, "rootView");
          oi = new i(videoSDKPlay3, uBaseFragmen2, this, this, uBaseEditorF.J, null);
          i2.add(str1);
          EffectEditorFragment i3 = uBaseEditorF.I;
          h = uBaseEditorF.H;
          if (h == null) {
             a.S("editorHelperContract");
          }
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg1 = h1.f();
          a.o(uEditorDeleg1, str3);
          uBaseFragmen2 = uEditorDeleg1.q();
          str1 = str14;
          a.o(uBaseFragmen2, str1);
          this = this.mh();
          a.o(this, "rootView");
          j = uBaseEditorF.J;
          h1 = uBaseEditorF.H;
          if (h1 == null) {
             a.S("editorHelperContract");
          }
          uob = h1.a(EditorDelegate$ShowLoggerType.TIME_EFFECT);
          a.o(uob, str13);
          ol = new l(h, uBaseFragmen2, this, this, j, uob);
          i3.add(i2);
          h = uBaseEditorF.H;
          if (h == null) {
             a.S("editorHelperContract");
          }
          videoSDKPlay3 = h.j();
          a.m(videoSDKPlay3);
          a.o(videoSDKPlay3, str4);
          i1 = uBaseEditorF.H;
          if (i1 == null) {
             a.S("editorHelperContract");
          }
          uEditorDeleg2 = i1.f();
          a.o(uEditorDeleg2, str3);
          uBaseFragmen2 = uEditorDeleg2.q();
          a.o(uBaseFragmen2, str1);
          view = this.mh();
          a.o(view, "rootView");
          uBaseEditorF.K = new e(videoSDKPlay3, uBaseFragmen2, uBaseEditorF, view);
       }
       h1 = uBaseEditorF.I;
       h = uBaseEditorF.K;
       if (h == null) {
          a.S("mPanelViewBinder");
       }
       h1.add(h);
       h1 = uBaseEditorF.I;
       i1 = uBaseEditorF.H;
       if (i1 == null) {
          a.S("editorHelperContract");
       }
       view11 = uBaseEditorF.H;
       if (view11 == null) {
          a.S("editorHelperContract");
       }
       f view111 = view11.i();
       a.m(view111);
       a.o(view111, str7);
       this = this.mh();
       a.o(this, "rootView");
       h1.add(new EffectTimelineViewBinder(i1, view111, uBaseEditorF, this));
       this.fh();
       return uBaseEditorF.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, EffectEditorFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.gh();
       this.Bh();
       if (!PatchProxy.applyVoid(null, this, EffectEditorFragment.class, "12")) {
          EffectEditorFragment tM = this.M;
          if (tM != null) {
             tM.clear();
          }
       }
       return;
    }
    public boolean sh(){
       return true;
    }
    public final List zh(){
       ArrayList obj = PatchProxy.apply(null, this, EffectEditorFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof a) {
             obj.addAll(uoa.W());
          }
       }
       return obj;
    }
}
