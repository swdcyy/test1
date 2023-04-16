package com.yxcorp.gifshow.v3.editor.segment.timeline.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import xl8.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ftc.d;
import com.yxcorp.gifshow.v3.editor.segment.timeline.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import ftc.e;
import com.yxcorp.gifshow.v3.editor.segment.timeline.j;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import ftc.h;
import com.kuaishou.edit.TimeLineGenerator;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.segment.b0$c;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.System;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.io.File;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Preview;
import com.kuaishou.edit.draft.OriginalVoice;
import wba.n0;
import faa.a;
import w46.b;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.robust.PatchProxyResult;
import voc.o;
import h69.j;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParam;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import p16.c;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Math;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$g;
import com.yxcorp.gifshow.v3.editor.segment.timeline.m;
import com.yxcorp.gifshow.v3.editor.segment.timeline.l;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k$b;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;
import ftc.f;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$i;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentVideoTrimmer;
import java.lang.Double;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import ftc.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import ftc.c;
import android.view.View$OnClickListener;
import ftc.b;
import maa.a;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment;

public class k extends PresenterV2	// class@0011f1
{
    public h A;
    public boolean B;
    public double C;
    public double D;
    public VideoSDKPlayerView E;
    public int F;
    public EditorSdk2V2$VideoEditorProject G;
    public String H;
    public VideoSDKPlayerView$e I;
    public TextView p;
    public TextView q;
    public TextView r;
    public SegmentVideoTrimmer s;
    public a t;
    public i u;
    public SingleSegmentInfo v;
    public b0$c w;
    public b x;
    public SegmentTimelineFragment y;
    public boolean z;

    public void k(){
       super();
       this.z = false;
       this.B = false;
       this.C = 0;
       this.D = 0;
       this.F = 4;
       this.I = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.R8();
       this.S8();
       this.V8();
       this.x.d(Boolean.TRUE);
       this.X7(this.y.m().subscribe(new d(this), i.b));
       this.X7(this.v.observable().subscribe(new e(this), j.b));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       this.E.setPreviewEventListener("SegmentTimelinePresenter", null);
       this.E.setEnableFling(true);
       k tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoid(null, tA, h.class, "2")) {
             h j = tA.j;
             if (j != null) {
                j.i();
                tA.j = null;
             }
          }
       }
       this.G = null;
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "8")) {
          return;
       }
       this.E.setPreviewEventListener("SegmentTimelinePresenter", objArray);
       this.u.f().q().getChildFragmentManager().popBackStack();
       this.w.a();
       if (!PatchProxy.applyVoid(objArray, objArray, g1.class, "26")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 404;
          uElementPack.name = "cancel_segment_clip";
          uElementPack.type = 1;
          u1.u(1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.C = this.v.getClipStart();
       this.D = this.v.getClipEnd();
       return;
    }
    public final void S8(){
       Workspace workspace;
       int b1;
       VideoSDKPlayerView videoSDKPlay = this;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, videoSDKPlay, ok, "5")) {
          return;
       }
       if (videoSDKPlay.u.f().N() == null || videoSDKPlay.u.f().N().v() == null) {
          objArray = new Object[0];
          a.D().t("SegmentTimelinePresenter", "initVideoProject workspace is null, please check", objArray);
          return;
       }else {
          long l = System.currentTimeMillis();
          workspace = videoSDKPlay.u.f().N().v();
          VideoSDKPlayerView videoSDKPlay1 = f.q(videoSDKPlay.u);
          videoSDKPlay.E = videoSDKPlay1;
          EditorSdk2V2$VideoEditorProject videoProject = videoSDKPlay1.getVideoProject();
          EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject();
          int i = 1;
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[i];
          videoEditorP.setTrackAssets(trackAssetAr);
          Object[] objArray1 = (videoSDKPlay.v.getAssetPath() == null)? objArray: new File(videoSDKPlay.v.getAssetPath());
          EditorSdk2V2$TrackAsset trackAsset = n0.c(videoSDKPlay.v.getAsset(), objArray1, null, workspace.getSource(), workspace.getType(), workspace.getPreview(), null);
          if (trackAsset == null) {
             objArray = new Object[0];
             a.D().t("SegmentTimelinePresenter", "initVideoProject trackAsset is null, please check", objArray);
             return;
          }else {
             videoEditorP.trackAssetsSetItem(0, trackAsset.clone());
             boolean b = EditorSdk2UtilsV2.isProjectSingleImage(videoEditorP);
             videoSDKPlay.z = b;
             if (b) {
                Object obj = PatchProxy.apply(objArray, videoSDKPlay, ok, "14");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(videoSDKPlay.u.f().N().a1() == Workspace$Type.AI_CUT){
                   i = null;
                }
                b1 = i;
                b1 = (b1 && (videoSDKPlay.u.f().x().g() && !j.j(videoSDKPlay.u.f().N())))? 8: 4;
                videoSDKPlay.F = b1;
                videoEditorP.trackAssets(0).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, (double)videoSDKPlay.F));
             }else {
                videoEditorP.trackAssets(0).setClippedRange(objArray);
             }
             videoEditorP.setProjectOutputWidth(videoProject.projectOutputWidth());
             videoEditorP.setProjectOutputHeight(videoProject.projectOutputHeight());
             videoEditorP.setMarginColor(videoProject.marginColor());
             videoEditorP.setPaddingColor(videoProject.paddingColor());
             videoEditorP.setColorFilter(videoProject.colorFilter());
             videoEditorP.setBeautyFilter(videoProject.beautyFilter());
             videoEditorP.setEnhanceFilter(videoProject.enhanceFilter());
             videoEditorP.setBlurPaddingArea(videoProject.blurPaddingArea());
             videoEditorP.setEnhanceColorFilter(videoProject.enhanceColorFilter());
             videoSDKPlay.G = videoEditorP;
             videoSDKPlay.E.setVideoProject(videoEditorP);
             videoSDKPlay.E.sendChangeToPlayer();
             videoSDKPlay.E.setPreviewEventListener("SegmentTimelinePresenter", videoSDKPlay.I);
             videoSDKPlay.E.seekTo(videoSDKPlay.C);
             videoSDKPlay.E.play();
             Object[] objArray2 = new Object[0];
             a.D().w("SegmentTimelinePresenter", "initVideoProject cost:"+(System.currentTimeMillis() - l), objArray2);
             return;
          }
       }
    }
    public final void V8(){
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "6")) {
          return;
       }
       if (!TextUtils.isEmpty(this.H)) {
          this.r.setText(this.H);
       }
       EditorSdk2V2$VideoEditorProject videoProject = this.E.getVideoProject();
       int i = 1;
       if (!PatchProxy.applyVoidOneRefs(videoProject, this, ok, "7")) {
          this.A = new h(videoProject, this.F, this.s);
          this.s.setMaxDuration(this.v.getRemainClipTime());
          this.s.setDimCoverIsAlwaysShown(i);
          this.s.setShortestClipTimeSecond(0x3f800000);
          this.s.setStandardDuration((int)Math.min((long)h.m, this.A.getDuration()));
          this.s.setFrameAdapter(this.A);
          m om = new m(this.A, this.E, this.v.getRemainClipTime(), this.A.getDuration(), new l(this));
          this.s.setOnVideoRangeChangeListener(v2);
          this.s.setOnProgressIndicatorChangeListener(new f(this));
          k ts = this.s;
          k tC = this.C;
          k tD = this.D;
          Objects.requireNonNull(ts);
          if (!PatchProxy.isSupport(SegmentVideoTrimmer.class) || !PatchProxy.applyVoidTwoRefs(Double.valueOf(tC), Double.valueOf(tD), ts, SegmentVideoTrimmer.class, "1")) {
             g og = new g(ts, tD, tC);
             ts.g.getViewTreeObserver().addOnGlobalLayoutListener(v2);
          }
          Object[] objArray2 = new Object[false];
          a.D().s("SegmentTimelinePresenter", "clipStart: "+this.C, objArray2);
          this.E.seekTo(this.C);
          this.E.play();
       }
       this.W8((this.D - this.C));
       double d = (double)this.v.getRemainClipTime();
       if (PatchProxy.isSupport(ok) && (!PatchProxy.applyVoidOneRefs(Double.valueOf(d), this, ok, "13") && this.getActivity() != null)) {
          double d1 = (this.z != null)? (double)this.F: Math.min(d, this.E.getVideoLength());
          Object[] objArray = new Object[i];
          Object[] objArray1 = new Object[i];
          objArray1[0] = Double.valueOf(d1);
          objArray[0] = String.format("%.1f", objArray1);
          this.q.setText(this.getActivity().getString(R.string.arg_RES_7f100c63, objArray));
       }
       this.E.setEnableFling(false);
       return;
    }
    public void W8(double p0){
       Object[] objArray1;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ok, "12")) {
          return;
       }
       if (this.getActivity() != null) {
          Object[] objArray = new Object[]{String.format("%.1f", objArray1)};
          objArray1 = new Object[]{Double.valueOf(p0)};
          this.p.setText(this.getActivity().getString(R.string.arg_RES_7f104db1, objArray));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a4418);
       this.q = m1.f(p0, 0x7f0a419f);
       this.r = m1.f(p0, 0x7f0a42cc);
       this.p = m1.f(p0, 0x7f0a426a);
       m1.a(p0, new c(this), R.id.right_btn);
       m1.a(p0, new b(this), R.id.left_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.t = this.r8("ASSET");
       this.u = this.r8("EDITOR_HELPER_CONTRACT");
       this.v = this.r8("single_segment_info");
       this.w = this.r8("SINGLE_SEGMENT_LISTENER");
       this.x = this.r8("segment_timeline_animation_end");
       this.y = this.r8("FRAGMENT");
       this.H = this.t8("TITLE");
       return;
    }
}
