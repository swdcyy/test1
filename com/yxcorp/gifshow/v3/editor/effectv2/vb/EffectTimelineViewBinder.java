package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import pqc.a;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.model.f;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lqc.d;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qqc.d;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$c;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import mqc.n;
import java.lang.Enum;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import kqc.c;
import kqc.g;
import java.util.List;
import kqc.d;
import kqc.b;
import kqc.a;
import kqc.e;
import java.util.Iterator;
import java.lang.Iterable;
import hqc.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kqc.f;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import ooc.f1;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import java.util.Objects;

public class EffectTimelineViewBinder extends a implements a	// class@000f5f
{
    public boolean c;
    public final boolean d;
    public final d e;
    public final VideoSDKPlayerView f;
    public final TimelineCoreView g;
    public final EditorTimeLineView h;
    public final View i;
    public final View j;
    public final EffectTimelineViewBinder$c k;
    public final i l;
    public final f m;
    public final Fragment n;

    public void EffectTimelineViewBinder(i p0,f p1,Fragment p2,View p3){
       a.p(p0, "editorHelperContract");
       a.p(p1, "timelineSavedData");
       a.p(p2, "fragment");
       a.p(p3, "rootView");
       super(p3);
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.d = d.a();
       EditorDelegate uEditorDeleg = p0.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       ViewModel viewModel = ViewModelProviders.of(uEditorDeleg.q()).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­ectViewModel::class.java\)");
       this.e = viewModel;
       VideoSDKPlayerView videoSDKPlay = p0.j();
       a.m(videoSDKPlay);
       this.f = videoSDKPlay;
       View view = p3.findViewById(R.id.range_core_view);
       a.o(view, "rootView.findViewById\(R.id.range_core_view\)");
       this.g = view;
       View view1 = view.findViewById(R.id.editor_timeline);
       a.o(view1, "mTimelineView.findViewById\(R.id.editor_timeline\)");
       this.h = view1;
       View view2 = view.findViewById(R.id.btn_play_layout);
       a.o(view2, "mTimelineView.findViewById\(R.id.btn_play_layout\)");
       this.i = view2;
       view2 = view.findViewById(R.id.center_handler);
       a.o(view2, "mTimelineView.findViewById\(R.id.center_handler\)");
       this.j = view2;
       this.k = new EffectTimelineViewBinder$c(this);
       view.a();
       view1.setTimelineListener(new EffectTimelineViewBinder$a(this));
       view.getPlayStatusView().setOnClickListener(new EffectTimelineViewBinder$b(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, EffectTimelineViewBinder.class, "1")) {
          return;
       }
       f i = this.m.i;
       a.o(i, "timelineSavedData.mTimelineConfig");
       this.h.e(d.a.c(i, this.f, this.j));
       this.g.b(false);
       this.f.setPreviewEventListener("EditorTimeLinePresenter", this.k);
       this.A().postDelayed(new EffectTimelineViewBinder$d(this), (long)100);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, EffectTimelineViewBinder.class, "2")) {
          return;
       }
       this.f.setPreviewEventListener("EditorTimeLinePresenter", null);
       this.c = false;
       return;
    }
    public final int D(ITimelineView$IRangeView$a p0){
       Iterable iterable;
       a uoa;
       Action$Type obj = PatchProxy.applyOneRefs(p0, this, EffectTimelineViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.d();
       a.o(obj, "rangeViewData.extData");
       obj = obj.e();
       if (obj == null) {
       label_003c :
          iterable = null;
       }else {
          int i1 = n.b[obj.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      if (i1 != 5) {
                         goto label_003c ;
                      }else {
                         iterable = this.e.o0().j().d();
                      }
                   }else {
                      iterable = this.e.o0().f().b();
                   }
                }else {
                   iterable = this.e.o0().e().b();
                }
             }else {
                iterable = this.e.o0().d().b();
             }
          }else {
             iterable = this.e.o0().h().b();
          }
       }
       int i = 0;
       if (iterable != null) {
          Iterator iterator = iterable.iterator();
          while (true) {
             if (iterator.hasNext()) {
                uoa = iterator.next();
                double d = 0x3f1a36e2eb1c432d;
                double d1 = p0.h() - d;
                double d2 = p0.h() + d;
                double d3 = uoa.h();
                if (d3 - d1 < 0 || d3 - d2 > 0) {
                   d1 = p0.g() - d;
                   d2 = p0.g() + d;
                   d = uoa.g();
                   if (d - d1 < 0 || d - d2 > 0) {
                   }
                }
                break ;
             }
          }
          Object[] objArray = new Object[i];
          a.D().w("EditorTimeLinePresenter", "findRangeIndexFromRangeData: index = "+iterable.indexOf(uoa), objArray);
          return iterable.indexOf(uoa);
       }
       return i;
    }
    public final d E(){
       return this.e;
    }
    public final EditorTimeLineView F(){
       return this.h;
    }
    public final VideoSDKPlayerView G(){
       return this.f;
    }
    public void n(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectTimelineViewBinder.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       double d = p0.i().b();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("EditorTimeLinePresenter", "onStateChange playerTime: "+p0.i().b()+" updateTo: "+p0.i().g(), objArray);
       UpdateTo bOTH = UpdateTo.BOTH;
       if (p0.i().g() == bOTH || (p0.i().g() == UpdateTo.PLAYER && p0.m())) {
          this.f.seekTo(d);
       }
       if (p0.i().g() == bOTH || p0.i().g() == UpdateTo.TIMELINE) {
          f1.a(this.h, p0.i().b(), i);
       }
       boolean b = p0.i().h();
       if (b != p1.i().h()) {
          this.g.b(b);
       }
       if (p0.i().g() == bOTH || p0.i().g() == UpdateTo.PLAYER) {
          if (b && !this.f.isPlaying()) {
             this.f.play();
          }else if(!b && this.f.isPlaying()){
             this.f.pause();
          }
       }
       EffectGroupType uEffectGroup = p0.c();
       if (uEffectGroup.getType() != p1.c().getType() || this.c == null) {
          int i1 = n.a[uEffectGroup.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      if (i1 == 5) {
                         this.h.v(p0.j().d()).E();
                      }
                   }else if(this.d != null){
                      this.h.v(p0.e().b()).E();
                   }else {
                      d.a.h(Action$Type.VISUAL_EFFECT, p0.e().b(), this.f.getVideoLength(), this.h);
                   }
                }else if(this.d != null){
                   this.h.v(p0.f().b()).E();
                }else {
                   Objects.requireNonNull(p0.f());
                   d.a.h(Action$Type.FACE_MAGIC_EFFECT, p0.f().b(), this.f.getVideoLength(), this.h);
                }
             }else {
                this.h.v(p0.d().b()).E();
             }
          }else {
             this.h.v(p0.h().b()).E();
          }
       }
       this.c = true;
       return;
    }
}
