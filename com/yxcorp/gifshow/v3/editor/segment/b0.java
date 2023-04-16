package com.yxcorp.gifshow.v3.editor.segment.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.segment.b0$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etc.y;
import com.yxcorp.gifshow.v3.editor.segment.y;
import erd.g;
import crd.b;
import etc.z;
import com.yxcorp.gifshow.v3.editor.segment.z;
import java.util.concurrent.TimeUnit;
import etc.a0;
import com.yxcorp.gifshow.v3.editor.segment.a0;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.segment.c0;
import gtc.a;
import tyc.m3;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$e;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import etc.g0;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.v3.editor.segment.l;
import etc.x;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.segment.l$a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import etc.c0;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import wyb.a;
import uxb.l;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import mrd.a;
import java.lang.Integer;
import im8.f;
import etc.b0;
import java.lang.Runnable;
import ekd.k1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import tyc.w1;
import android.util.Pair;
import gq.a;
import w46.b;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset;
import fba.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import wba.d0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import g9c.a;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.segment.b0$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.widget.TextView;
import com.kuaishou.edit.draft.TimeRange;
import ftc.h;
import java.lang.Double;
import java.lang.CharSequence;
import com.kuaishou.edit.draft.Asset$Type;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment;
import xl8.b;

public class b0 extends PresenterV2	// class@0011c8
{
    public b A;
    public f B;
    public float C;
    public m D;
    public w1 E;
    public VideoSDKPlayerView F;
    public int G;
    public boolean H;
    public l I;
    public boolean J;
    public Pair K;
    public Pair L;
    public c M;
    public VideoSDKPlayerView$d N;
    public RecyclerView p;
    public TextView q;
    public TextView r;
    public i s;
    public VideoSegmentsModel t;
    public SegmentEditorFragment u;
    public a v;
    public a w;
    public c x;
    public PublishSubject y;
    public f z;
    public static final int O;
    public static final int P;

    static {
       b0.O = a1.e(8.00f);
       b0.P = a1.e(17.00f);
    }
    public void b0(){
       super();
       this.C = 0;
       this.G = 0;
       this.H = false;
       this.J = false;
       this.K = null;
       this.L = null;
       this.M = PublishSubject.g();
       this.N = new b0$a(this);
    }
    public void E8(){
       boolean i;
       c0 obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "3")) {
          return;
       }
       this.J = false;
       this.X7(this.t.observable().subscribe(new y(this), y.b));
       this.X7(this.y.subscribe(new z(this), z.b));
       this.X7(this.M.throttleFirst(25, TimeUnit.MILLISECONDS).subscribe(new a0(this), a0.b));
       if (!PatchProxy.applyVoid(objArray, this, uob0, "10")) {
          this.F = f.q(this.s);
          if (!this.p.getItemDecorationCount()) {
             this.p.addItemDecoration(new b(false, b0.P, b0.P, b0.O));
          }
          obj = new c0(this, new a(), 12);
          this.E = obj;
          this.D = new m(obj);
          l obj1 = PatchProxy.apply(objArray, this, uob0, "11");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): g0.b(this.P8());
          if (b) {
             this.D.f(this.p);
          }
          this.p.setLayoutManager(new CenterLayoutManager(this.getContext(), false, false, b0.O));
          obj1 = new l(new x(this), this.F.getVideoProject());
          this.I = obj1;
          obj1.W0(this.t.getSegmentInfoList());
          this.p.setAdapter(this.I);
          this.F.setEnableFling(false);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob0, "7")) {
          this.F.setEnablePlayerStatusChanged(true);
          this.F.setPreviewEventListener("SegmentListPresenter", new c0(this));
          this.F.addSimpleGestureListener("SegmentListPresenter", this.N);
          obj = PatchProxy.apply(objArray, this, uob0, "18");
          if (obj != patchProxyRe) {
             i = obj.booleanValue();
          }else if(f.p(this.s) == this.F.getVideoProject()){
             i = true;
          }else {
             i = false;
          }
          if (!i) {
             l.g().K0(this.s.f(), l.g().x5(EditorSdk2UtilsV2.getComputedDuration(this.s.k())));
             this.H = true;
             this.R8(this.v.i().intValue(), false);
          }
          if (this.B.get().booleanValue() && !PatchProxy.applyVoid(objArray, this, uob0, "8")) {
             k1.r(new b0(this), 300);
          }
          objArray = new Object[false];
          a.D().s("SegmentListPresenter", "initPlayer: mSegmentSelectedIndex="+this.v.i(), objArray);
       }
       i = Math.max(this.v.i().intValue(), false);
       if (i < this.t.getSegmentInfoList().size()) {
          this.S8(i, true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "15")) {
          return;
       }
       this.F.setPreviewEventListener("SegmentListPresenter", null);
       this.F.addSimpleGestureListener("SegmentListPresenter", null);
       this.D.f(null);
       this.F.updatePlayerStatusView(true);
       this.F.setEnablePlayerStatusChanged(false);
       this.F.setEnableFling(true);
       b0 tE = this.E;
       if (tE != null) {
          tE.o = null;
       }
       this.K = null;
       this.L = null;
       return;
    }
    public final c P8(){
       Object obj = PatchProxy.apply(null, this, b0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.f().N();
    }
    public void R8(int p0,int p1){
       Object[] objArray1;
       Object[] objArray2;
       Pair pair = this;
       int i = p0;
       int i1 = p1;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), pair, uob0, "17")) {
          return;
       }
       uob0 = pair.K;
       int i2 = 0;
       if (uob0 == null) {
          pair.K = new Pair(Integer.valueOf(p0), Integer.valueOf(p1));
          pair.G = i1;
          uob0 = pair.x;
          b0 f = pair.F;
          String str = (i1 != 1)? 1: null;
          Object[] objArray = new Object[i2];
          a.D().w("AdvEditUtil", "seekToSelectedAsset: invoked with selectedIndex="+i, objArray);
          if (f == null) {
             objArray1 = new Object[i2];
             a.D().t("AdvEditUtil", "seekToSelectedAsset: videoSDKPlayerView is null", objArray1);
          }else if(uob0 == null || uob0.o0() == null){
             objArray1 = new Object[i2];
             a.D().t("AdvEditUtil", "seekToSelectedAsset: draft is null", objArray1);
          }else {
             a uoa = uob0.o0();
             if (i < 0 || i >= uoa.z().size()) {
                objArray1 = new Object[i2];
                a.D().t("AdvEditUtil", "seekToSelectedAsset: invalid selectedIndex", objArray1);
             }else {
                EditorSdk2$TimeRange timeRange = d0.e(uoa.z().get(i), f.getVideoProject(), DraftUtils.E(uob0.n0()));
                if (timeRange == null) {
                   objArray1 = new Object[i2];
                   a.D().t("AdvEditUtil", "seekToSelectedAsset: no matched displayRange", objArray1);
                }else {
                   double d = timeRange.start() + (timeRange.duration() * 0x3fe0000000000000);
                   objArray = new Object[i2];
                   a.D().s("AdvEditUtil", "seekToSelectedAsset: selectedIndex="+i+" seekTime="+d+" isChangePlayer="+str, objArray);
                   f.seekTo(d);
                }
             }
          }
          objArray2 = new Object[i2];
          a.D().w("SegmentListPresenter", "seekToSelectedPosition not stacked up seek event. selectedIndex:"+i, objArray2);
       }else if(uob0.first.intValue() != i){
          pair.L = new Pair(Integer.valueOf(p0), Integer.valueOf(p1));
          objArray2 = new Object[i2];
          a.D().w("SegmentListPresenter", "seekToSelectedPosition is stacked up seek event. selectedIndex:"+i, objArray2);
       }else {
          objArray2 = new Object[i2];
          a.D().w("SegmentListPresenter", "seekToSelectedPosition not stacked up seek event but select same item. selectedIndex:"+i, objArray2);
       }
       pair.G = i1;
       if (i1 == 1 || !i1) {
          i2 = 1;
       }
       pair.S8(i, (i2 ^ 0x01));
       return;
    }
    public void S8(int p0,boolean p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uob0, "4")) {
          return;
       }
       this.K = null;
       this.v.onNext(Integer.valueOf(p0));
       this.V8(p0);
       if (p1) {
          this.W8();
       }
       return;
    }
    public void V8(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "5")) {
          return;
       }
       if (!this.p.getWidth() || !this.p.getChildCount()) {
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new b0$b(this, p0));
          return;
       }else {
          uob0 = this.G;
          int i = 0;
          StringBuilder str = 1;
          if (uob0 != null) {
             if (uob0 == str || uob0 == 2) {
                this.p.getLayoutManager().H(str);
                this.p.smoothScrollToPosition(p0);
             }
          }else {
             this.p.getLayoutManager().H(i);
             this.p.smoothScrollToPosition(p0);
          }
          uob0 = this.I;
          Objects.requireNonNull(uob0);
          l ol = l.class;
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob0, ol, "4")) {
             if (p0 >= uob0.Q0().size()) {
                Object[] objArray1 = new Object[i];
                a.D().t("SegmentAdapter", "setSelect: too big selectedIndex="+p0, objArray1);
             }else {
                ol = uob0.x;
                if (ol >= null && (ol < uob0.Q0().size() && uob0.x != p0)) {
                   uob0.Q0().get(uob0.x).setSelected(i);
                   uob0.m0(uob0.x, Boolean.TRUE);
                }
             label_00bd :
                uob0.x = p0;
                uob0.Q0().get(p0).setSelected(str);
                uob0.m0(p0, Boolean.TRUE);
             }
          }
          Object[] objArray = new Object[i];
          a.D().w("SegmentListPresenter", "selectItemToCenter selectedIndex:"+p0, objArray);
          return;
       }
    }
    public final void W8(){
       double d;
       Object[] objArray1;
       int i4;
       float f = this;
       if (PatchProxy.applyVoid(null, f, b0.class, "6")) {
          return;
       }
       int i = 4;
       if (PostExperimentUtils.U()) {
          f.q.setText(R.string.arg_RES_7f100b81);
          f.r.setVisibility(i);
       }
       int segmentInfoL = f.t.getSegmentInfoListSize();
       b0 w = f.w;
       b0 uob0 = null;
       String str = "AdvEditUtil";
       if (w == null || w.z().isEmpty()) {
          Object[] objArray = new Object[0];
          a.D().A(str, "getAssetRangeTimeFromStart invalid assetDraft", objArray);
       }else {
          List list = w.z();
          if (segmentInfoL < 0 || segmentInfoL > list.size()) {
             objArray1 = new Object[0];
             a.D().A(str, "getAssetRangeTimeFromStart invalid selectedIndex = "+segmentInfoL, objArray1);
          }else {
             d = uob0;
             for (int i1 = 0; i1 < segmentInfoL; i1 = i1 + 1) {
                d = d + list.get(i1).getSelectedRange().getDuration();
             }
             f.C = (float)((double)(((float)h.m * 0x3f800000) / 1000.00f) - d);
             f.t.setVideoDuration(d);
             objArray1 = new Object[0];
             a.D().s("SegmentListPresenter", "updateVideoDuration: videoTotalDuration: "+d, objArray1);
             String str1 = "%.1f";
             i1 = 1;
             if (!PostExperimentUtils.U()) {
                Object[] objArray2 = new Object[i1];
                objArray2[0] = Double.valueOf(d);
                f.q.setText(a1.r(R.string.arg_RES_7f100188, String.format(str1, objArray2)));
             }
             b0 w1 = f.w;
             if (w1 != null) {
                int i2 = w1.z().size();
                b0 uob01 = uob0;
                int i3 = 0;
                while (i3 < i2) {
                   Asset uAsset = w1.z().get(i3);
                   if (uAsset.getType() == Asset$Type.VIDEO) {
                      i4 = i2;
                      Object[] objArray4 = new Object[0];
                      a.D().s(str, "getTotalClipOffDuration: i="+i3+" duration="+uAsset.getDuration(), objArray4);
                      uob0 = uob0 + uAsset.getDuration();
                      uob01 = uob01 + uAsset.getSelectedRange().getDuration();
                   }else {
                      i4 = i2;
                   }
                   i3 = i3 + 1;
                   i2 = i4;
                   double d1 = Double.MIN_VALUE;
                }
                uob0 = uob0 - uob01;
             }
             if (uob0 - 0x3fb99999a0000000 < 0 || g0.a(f.x)) {
                f.r.setVisibility(4);
             }else {
                f.r.setVisibility(0);
                Object[] objArray3 = new Object[]{Double.valueOf(uob0)};
                f.r.setText(a1.r(R.string.arg_RES_7f100b19, String.format(str1, objArray3)));
             }
             l.g().K0(f.s.f(), l.g().x5(EditorSdk2UtilsV2.getComputedDuration(f.s.k())));
             return;
          }
       }
       d = uob0;
       goto label_0086 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a380e);
       this.q = m1.f(p0, 0x7f0a416c);
       this.r = m1.f(p0, 0x7f0a0775);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.s = this.r8("EDITOR_HELPER_CONTRACT");
       this.t = this.r8("segment_video_model");
       this.u = this.r8("FRAGMENT");
       this.v = this.r8("segment_selected_model");
       this.w = this.r8("ASSET");
       this.x = this.r8("WORKSPACE");
       this.y = this.r8("SEGMENT_DELETED_PUBLISHER");
       this.z = this.x8("SEGMENT_IS_CHANGED");
       this.A = this.r8("segment_timeline_animation_end");
       this.B = this.x8("segment_from_edit_page");
       return;
    }
}
