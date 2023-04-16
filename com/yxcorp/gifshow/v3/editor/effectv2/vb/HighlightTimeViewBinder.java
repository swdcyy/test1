package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder;
import mqc.a;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k2b.s$b;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider;
import qqc.d;
import com.yxcorp.gifshow.v3.editor.i;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$mLifecycleObserver$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$c;
import android.view.View$OnClickListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import jn9.b;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import jn9.d;
import com.kwai.robust.PatchProxyResult;
import mn9.b;
import java.util.List;
import nsd.u;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a;
import jn9.e;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import mqc.o;
import pn9.c;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.util.ArrayList;
import tvc.e;
import kqc.c;
import kqc.g;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import hqc.c;
import mn9.a;
import java.util.Objects;
import hqc.d;
import dqc.a;
import hqc.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import kotlin.Pair;
import kqc.f;
import uxb.e;
import uxb.l;
import uxb.e$a;
import uxb.e$b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTimeChangeAction;
import hqc.e;
import xvc.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.widget.FrameLayout;
import lqc.d;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import mqc.q;
import java.lang.Runnable;
import mqc.r;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;

public final class HighlightTimeViewBinder extends a	// class@000f6c
{
    public final EditReduxViewModel A;
    public final HighlightTimeDataProvider t;
    public View u;
    public final LinearLayout v;
    public final LinearLayout w;
    public final LifecycleObserver x;
    public final f y;
    public final VideoSDKPlayerView z;

    public void HighlightTimeViewBinder(f p0,VideoSDKPlayerView p1,Fragment p2,Fragment p3,View p4,EditReduxViewModel p5){
       a.p(p0, "timelineSavedData");
       a.p(p1, "playerView");
       a.p(p2, "previewFragment");
       a.p(p3, "fragment");
       a.p(p4, "rootView");
       a.p(p5, "clipViewModel");
       super(p2, p3, p4, null);
       this.y = p0;
       this.z = p1;
       this.A = p5;
       this.t = new HighlightTimeDataProvider(this.L().z0());
       View view = p4.findViewById(R.id.click_open_text_panel);
       a.o(view, "rootView.findViewById\(R.id.click_open_text_panel\)");
       this.v = view;
       view = p4.findViewById(R.id.click_delete_high_effect);
       a.o(view, "rootView.findViewById\(R.¡­click_delete_high_effect\)");
       this.w = view;
       this.x = new HighlightTimeViewBinder$mLifecycleObserver$1(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, HighlightTimeViewBinder.class, "3")) {
          return;
       }
       super.B();
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "onAttach", objArray);
       this.w.setOnClickListener(new HighlightTimeViewBinder$c(this));
       this.M().getLifecycle().addObserver(this.x);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, HighlightTimeViewBinder.class, "22")) {
          return;
       }
       super.C();
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "onDetach", objArray);
       this.Q().e();
       this.M().getLifecycle().removeObserver(this.x);
       return;
    }
    public EffectGroupType H(){
       return EffectGroupType.HIGHLIGHT_TIME_EFFECT;
    }
    public d I(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = new d(this.t, -1, null, false, null, null, false, 124, null);
       return obj;
    }
    public PostListComponentView$b J(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HighlightTimeViewBinder$a(this);
    }
    public e K(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HighlightTimeViewBinder highlightTim = HighlightTimeViewBinder.class;
       Object obj = PatchProxy.apply(null, this, highlightTim, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       HighlightTimeViewBinder$b uob = new HighlightTimeViewBinder$b();
       HighlightTimeViewBinder$a uoa = PatchProxy.apply(null, this, highlightTim, "9");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new HighlightTimeViewBinder$a(this);
       }
       Object obj1 = uoa;
       Object obj2 = PatchProxy.apply(null, this, highlightTim, "8");
       o oo = (obj2 != patchProxyRe)? obj2: new o(this);
       e uoe = new e(uob, obj1, oo, this, null, null, 48, null);
       return obj;
    }
    public View V(){
       return null;
    }
    public List W(){
       ArrayList obj = PatchProxy.apply(null, this, HighlightTimeViewBinder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       Iterator iterator = this.L().o0().j().d().iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          Iterator iterator1 = this.Q().m().iterator();
          while (iterator1.hasNext()) {
             a uoa = iterator1.next();
             Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
             if (uoa.a == obj1.G() && !obj.contains(uoa)) {
                obj.add(uoa);
             }
          }
          i = i1;
       }
       return obj;
    }
    public void Y(){
       if (PatchProxy.applyVoid(null, this, HighlightTimeViewBinder.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "initComponentView", objArray);
       View view = this.T().findViewById(R.id.highlight_time_recyclerview);
       a.o(view, "rootView.findViewById\(R.¡­hlight_time_recyclerview\)");
       this.g0(view);
       view = this.T().findViewById(R.id.highlight_time_container);
       a.o(view, "rootView.findViewById\(R.¡­highlight_time_container\)");
       this.d0(view);
       view = this.T().findViewById(R.id.progress_bar);
       a.o(view, "rootView.findViewById\(R.id.progress_bar\)");
       this.f0(view);
       view = this.T().findViewById(R.id.refresh_layout);
       a.o(view, "rootView.findViewById\(R.id.refresh_layout\)");
       this.h0(view);
       view = this.T().findViewById(R.id.range_core_view);
       a.o(view, "rootView.findViewById\(R.id.range_core_view\)");
       this.i0(view);
       view = this.S().findViewById(R.id.editor_timeline);
       a.o(view, "mTimelineView.findViewById\(R.id.editor_timeline\)");
       this.e0(view);
       view = this.S().findViewById(R.id.center_handler);
       a.o(view, "mTimelineView.findViewById\(R.id.center_handler\)");
       this.u = view;
       return;
    }
    public void b0(){
       JSONObject jSONObject;
       if (PatchProxy.applyVoid(null, this, HighlightTimeViewBinder.class, "11")) {
          return;
       }
       Iterator iterator = this.N().getShowedItemPositionList().iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "HIGHLIGHT_MOMENT_MATERIAL";
          if (i < 0 || i >= this.Q().m().size()) {
             continue ;
          }else {
             Object obj = this.Q().m().get(i);
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
             try{
                jSONObject = new JSONObject();
                jSONObject.put("material_name", obj.k());
             }catch(org.json.JSONException e1){
                Object[] objArray = new Object[0];
                a.D().u("EditorV3Logger", e1, objArray);
             }
          }
          uElementPack.params = jSONObject.toString();
          u1.u0(6, uElementPack, new ClientContent$ContentPackage());
       }
       this.N().b();
       return;
    }
    public final void k0(Pair p0){
       d a;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeViewBinder.class, "12")) {
          return;
       }
       double d = this.L().o0().i().b();
       e$a uoa = e$b.a(l.b(), this.A, d, false, 4, null);
       double d1 = d - uoa.b();
       StringBuilder str = "deleteHighlightEffect currentTime:"+d;
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", str+", trackInfo:"+uoa+", highlightTimeStartTime:"+d1, objArray);
       d uod = this.L();
       a = e.a;
       Object obj = p0.getSecond();
       c first = p0.getFirst();
       if (first != null) {
          str1 = first.H();
          if (str1 != null) {
          label_007f :
             HighlightTimeChangeAction highlightTim = new HighlightTimeChangeAction(a, obj, d1, -1, str1);
             uod.t0(objArray);
             return;
          }
       }
       str1 = "";
       goto label_007f ;
    }
    public final void l0(ProgressFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeViewBinder.class, "21")) {
          return;
       }
       if (p0 != null) {
          p0.dismiss();
       }
       return;
    }
    public final Pair m0(){
       d obj = PatchProxy.apply(null, this, HighlightTimeViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "findSelectHighlight", objArray);
       obj = e.a;
       Iterator iterator = this.Q().m().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
          if (uoa.a == this.L().o0().j().e()) {
             a uoa1 = uoa;
          }
       }
       return new Pair(this.L().o0().j().f(), obj);
    }
    public void n(c p0,c p1){
       d a;
       HighlightTimeViewBinder highlightTim = HighlightTimeViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, highlightTim, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       int i = 8;
       if (p0.c() == EffectGroupType.HIGHLIGHT_TIME_EFFECT) {
          if (p0.c() != p1.c()) {
             this.a0();
          }
          this.N().setVisibility(0);
          if (p0.j().c == null && (p0.j().e() != p1.j().e() || p0.c() != p1.c())) {
             this.o0(p0);
             p0.j().c = false;
          }
          if (p0.j().f != null) {
             EditorTimeLineView uEditorTimeL = this.P();
             a = d.a;
             f i1 = this.y.i;
             a.o(i1, "timelineSavedData.mTimelineConfig");
             HighlightTimeViewBinder tz = this.z;
             HighlightTimeViewBinder tu = this.u;
             if (tu == null) {
                a.S("mCenterIndicator");
             }
             uEditorTimeL.e(a.c(i1, tz, tu));
             this.P().k(p0.j().d()).E();
             p0.j().f = false;
          }
       }else {
          this.N().setVisibility(i);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, highlightTim, "18")) {
          int i2 = p0.j().e();
          if (i2 == e.a.a) {
             this.N().post(new q(this, p1, p0));
             this.v.setVisibility(i);
             this.w.setVisibility(i);
          }else {
             this.v.setVisibility(0);
             this.w.setVisibility(0);
             if (i2 == p1.j().e() && (p0.c() != p1.c() || p0.m() != p1.m())) {
                Iterator iterator = this.Q().m().iterator();
                int i3 = 0;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   i = i3 + 1;
                   if (i3 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
                   if (obj.a == i2) {
                      r or = new r(i3, i2, this, p1, p0);
                      this.N().post(v11);
                   }
                   i3 = i;
                }
             }
          }
       }
       if (p0.j().d != null) {
          b.w(this.Q(), false, false, null, 7, null);
          p0.d = false;
       }
       return;
    }
    public final void n0(ProgressFragment p0,int p1){
       HighlightTimeViewBinder highlightTim = HighlightTimeViewBinder.class;
       if (PatchProxy.isSupport(highlightTim) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, highlightTim, "20")) {
          return;
       }
       p0.Nh(p1);
       return;
    }
    public final void o0(c p0){
       HighlightTimeViewBinder highlightTim = HighlightTimeViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, highlightTim, "15")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, highlightTim, "13")) {
          Iterator iterator = this.Q().m().iterator();
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect";
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             Objects.requireNonNull(uoa, str);
             if (uoa.a == p0.j().e() && p0.i().e() != null) {
                ITimelineView$IRangeView$a iRangeView$a = p0.i().e();
                a.m(iRangeView$a);
                iRangeView$a.D(uoa.m());
                ITimelineView$IRangeView$a iRangeView$a1 = p0.i().e();
                a.m(iRangeView$a1);
                iRangeView$a1.z(true);
                iRangeView$a1 = p0.i().e();
                a.m(iRangeView$a1);
                iRangeView$a1.y(true);
                iRangeView$a1 = p0.i().e();
                a.m(iRangeView$a1);
                iRangeView$a1.B(false);
             }
          }
          iterator = p0.j().d().iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             Iterator iterator1 = this.Q().m().iterator();
             while (iterator1.hasNext()) {
                a uoa1 = iterator1.next();
                Objects.requireNonNull(uoa1, str);
                if (uoc.G() == uoa1.a) {
                   uoc.D(uoa1.m());
                }
             }
          }
       }
       if (p0.i().e() != null) {
          this.P().h(p0.i().e());
       }else {
          this.P().k(p0.j().d()).E();
       }
       return;
    }
}
