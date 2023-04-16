package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qqc.d;
import mqc.a;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerStateAction;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import jn9.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import mn9.a;
import java.util.Objects;
import hqc.d;
import dqc.a;
import tvc.e;
import kqc.c;
import kqc.g;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a$a;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import mqc.p;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import kqc.f;
import uxb.e;
import uxb.l;
import uxb.e$a;
import uxb.e$b;
import kotlin.Pair;
import hqc.e;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTimeChangeAction;
import hqc.c;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.Math;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import pn9.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a$b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import nsd.r0;
import java.util.Locale;
import lnc.a1;
import java.util.Arrays;
import java.lang.CharSequence;
import o56.a;
import android.app.Application;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a$c;

public final class HighlightTimeViewBinder$a implements PostListComponentView$b	// class@000f68
{
    public ProgressFragment a;
    public final HighlightTimeViewBinder b;

    public void HighlightTimeViewBinder$a(HighlightTimeViewBinder p0){
       this.b = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighlightTimeViewBinder$a.class, "4")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       this.b.L().t0(new EffectPlayerStateAction(false, this.b.z.getVideoLength()));
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighlightTimeViewBinder$a.class, "1")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "onDataListStatusChanged newLoadingStatus:"+p0, objArray);
       this.b.N().c();
       if (p0 == LoadingStatus.DATA_LOADING_FINISH) {
          Iterator iterator = this.b.Q().m().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
             if (obj.a == this.b.L().o0().j().e()) {
                this.b.N().post(new HighlightTimeViewBinder$a$a(i, this));
             }
             i = i1;
          }
          HighlightTimeViewBinder$a tb = this.b;
          tb.o0(tb.L().o0());
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, HighlightTimeViewBinder.class, "16")) {
             if (tb.Q().m().isEmpty() || (a.g(tb.Q().m().get(0).getId(), i.g().getSelectedEffectId().get()) ^ 0x01)) {
                Object[] objArray1 = new Object[0];
                a.D().w("HighlightTimeViewBinder", "showBubbleIfNeeded end", objArray1);
             }else {
                tb.R().getViewTreeObserver().addOnGlobalLayoutListener(new p(tb));
             }
          }
       }
       return;
    }
    public void c(a p0,View p1,String p2){
       d a;
       int i2;
       String str;
       HighlightTimeViewBinder$a uoa = this;
       c obj = p0;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighlightTimeViewBinder$a.class, "3")) {
          return;
       }
       a.p(obj, "item");
       a.p(p2, "tag");
       if (!uoa.b.L().o0().m()) {
          return;
       }
       HighlightTimeViewBinder$a b = uoa.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(obj, b, HighlightTimeViewBinder.class, "17")) {
          double d = b.L().o0().i().b();
          double d1 = (b.X())? b.L().o0().i().b(): b.z.getVideoLength();
          e$a uoa1 = e$b.a(l.b(), b.A, d, false, 4, null);
          int i = uoa1.a();
          double d2 = uoa1.b();
          int i1 = 0;
          Object[] objArray = new Object[i1];
          a.D().w("HighlightTimeViewBinder", "realItemSelected currentTime:"+d+", totalDuration:"+d1+", "+"trackInfo:"+uoa1+", highlightTimeInsertTrackIndex:highlightTimeInsertTrackIndex, splitTimeInTrack:"+d2+", "+"highlightTimeStartTime:"+d, objArray);
          a = e.a;
          if (a.g(b.m0().getSecond(), a)) {
             if (uoa1.d != null) {
                l.b().N6(b.A, d);
                i = i + 1;
                Object[] objArray1 = new Object[i1];
                a.D().w("HighlightTimeViewBinder", "realItemSelected: trackInfo.splitEnable, highlightTimeStartTime ="+d+", highlightTimeInsertTrackIndex ="+i, objArray1);
             }else if(d2 - (uoa1.c() - d2) <= 0){
                d2 = d - d2;
             }else {
                i = i + 1;
                d2 = d + (uoa1.c() - d2);
             }
             Object[] objArray4 = new Object[0];
             a.D().w("HighlightTimeViewBinder", "realItemSelected: trackInfo.splitDisable, highlightTimeStartTime ="+d+", highlightTimeInsertTrackIndex ="+i, objArray4);
             i2 = i;
             d = d2;
          label_0155 :
             Pair pair = b.m0();
             d uod = b.L();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeAdvEffect");
             Object obj1 = obj;
             Object obj2 = pair.getSecond();
             obj = pair.getFirst();
             if (obj != null) {
                str = obj.H();
                if (str != null) {
                label_0181 :
                   HighlightTimeChangeAction highlightTim = new HighlightTimeChangeAction(obj1, obj2, d, i2, str);
                   uod.t0(d2);
                   Object[] objArray2 = new Object[0];
                   a.D().w("HighlightTimeViewBinder", "realItemSelected: highlightTimeAdvEffect = "+pair.getSecond()+", highlightTimeStartTime ="+d, objArray2);
                   b.L().t0(new EditSdkAction());
                   if (a.g(b.m0().getSecond(), a)) {
                      d = Math.min(d1, (d + 0x3fa999999999999a));
                      Object[] objArray3 = new Object[0];
                      a.D().w("HighlightTimeViewBinder", "realItemSelected seekToTime:"+d, objArray3);
                      b.L().t0(new UpdatePlayerTimeAction(d, UpdateTo.BOTH));
                   }
                }
             }
             str = "";
             goto label_0181 ;
          }
          i2 = i;
          goto label_0155 ;
       }
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighlightTimeViewBinder$a.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.c(this, p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "onDataListStatusChanged onItemUnSelected", objArray);
       if (this.b.L().o0().j().e() == p0.a) {
          HighlightTimeViewBinder$a tb = this.b;
          tb.k0(tb.m0());
       }
       return;
    }
    public void e(b p0,b p1,String p2){
       HighlightTimeViewBinder$a ta;
       Object[] this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighlightTimeViewBinder$a.class, "5")) {
          return;
       }
       a.p(p0, "oldItemState");
       a.p(p1, "newItemState");
       a.p(p2, "tag");
       d.a(this, p0, p1, p2);
       int i = 100;
       if (p1.i()) {
          ta = this.a;
          if (ta == null) {
             ta = this.b;
             FragmentActivity uFragmentAct = ta.M().requireActivity();
             Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             HighlightTimeViewBinder$a$b uoa$b = new HighlightTimeViewBinder$a$b(this);
             Objects.requireNonNull(ta);
             ProgressFragment progressFrag = PatchProxy.applyTwoRefs(uFragmentAct, uoa$b, ta, HighlightTimeViewBinder.class, "19");
             if (progressFrag != PatchProxyResult.class) {
             }else {
                progressFrag = new ProgressFragment();
                progressFrag.Eh(0, i);
                progressFrag.setCancelable(0);
                this = new Object[]{a1.p(0x7f103667)};
                i = String.format(Locale.US, "%s ", Arrays.copyOf(this, 1));
                a.o(i, "java.lang.String.format\(locale, format, *args\)");
                progressFrag.Jh(i);
                progressFrag.wh(a.B.getString(R.string.cancel));
                progressFrag.xh(uoa$b);
                progressFrag.show(uFragmentAct.getSupportFragmentManager(), "HighlightTimeViewBinder");
             }
             this.a = progressFrag;
          }else {
             a.m(ta);
             this.b.n0(ta, p1.f());
          }
       }else {
          ta = this.a;
          if (ta != null) {
             a.m(ta);
             this.b.n0(ta, i);
             this.b.T().post(new HighlightTimeViewBinder$a$c(this));
          }
       }
       return;
    }
}
