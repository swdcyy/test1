package com.kuaishou.post.story.publish.c;
import erd.g;
import com.kuaishou.post.story.publish.g;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import ekd.j0;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import im8.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.publish.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.a0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.yxcorp.utility.n;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import java.io.File;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import zv9.a;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.edit.model.StoryWatermarkStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.System;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import wba.b;
import java.util.ArrayList;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail;
import android.graphics.Rect;
import java.lang.Math;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location;
import b36.b;
import java.util.Collection;
import oq4.j;
import java.util.concurrent.Callable;
import com.kuaishou.post.story.publish.h;
import uld.g;
import erd.o;
import java.lang.IllegalArgumentException;
import t45.d;
import brd.z;
import com.kuaishou.post.story.publish.e;
import oq4.c;
import lq.f;
import crd.b;
import com.yxcorp.gifshow.activity.BasePostActivity;
import lq.i;
import f6c.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;

public final class c implements g	// class@000b81
{
    public final g b;
    public final List c;
    public final VideoContext d;
    public final int e;
    public final AttrAnimProgressFragment f;

    public void c(g p0,List p1,VideoContext p2,int p3,AttrAnimProgressFragment p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       Object[] objArray;
       g og;
       c uoc1;
       a0 uoa0;
       c uoc2;
       c uoc3;
       c uoc4;
       boolean b3;
       g a;
       boolean b4;
       a w;
       c uoc5;
       boolean b5;
       i oi1;
       i oi2;
       PatchProxyResult patchProxyRe2;
       g og2;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub;
       int i1;
       float f6;
       double d2;
       float f8;
       float f9;
       Object[] objArray2;
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       c d = uoc.d;
       c e = uoc.e;
       c f = uoc.f;
       int b1 = false;
       int b2 = (b.getActivity() != null && b.getActivity().getIntent() != null)? j0.a(b.getActivity().getIntent(), "disableUploadCompletedToast", b1): 0;
       g p = b.p;
       g x = b.x;
       g q = b.q;
       e k = b.A.t.k;
       FragmentActivity activity = b.r.getActivity();
       int i = b.t.get().intValue();
       e l = b.A.t.l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[]{p,x,q,c,k,activity,Integer.valueOf(i),l};
          og = x;
          uoc1 = f;
          uoa0 = PatchProxy.apply(objArray, null, oi, "3");
          if (uoa0 != patchProxyRe) {
             uoc2 = b;
             uoc3 = d;
             uoc4 = e;
             b3 = b2;
          }else {
          label_00a5 :
             EditorSdk2V2$VideoEditorProject videoProject = p.getVideoProject();
             g og1 = (l != null && i == 1)? 1: null;
             String str = "StoryPublishUtil";
             PatchProxyResult patchProxyRe1 = patchProxyRe;
             if (k != null && !i) {
                if (PatchProxy.applyVoidThreeRefs(k, videoProject, activity, null, i.class, "4")) {
                   uoc2 = b;
                   uoc5 = c;
                   uoc3 = d;
                   uoc4 = e;
                   b5 = og1;
                   oi1 = oi;
                   b3 = b2;
                }else {
                   b3 = b2;
                   int i2 = 0;
                   Object[] objArray1 = new Object[i2];
                   a.D().w(str, "fillMoodPublishProject moodTemplateData:"+k, objArray1);
                   videoProject.trackAssets(i2).setAssetPath(k.q());
                   if (activity != null) {
                      b2 = n.k(activity);
                      int i3 = n.j(activity);
                      b0 uob0 = BitmapUtil.E(k.q());
                      b0 a1 = uob0.a;
                      b0 b6 = uob0.b;
                      videoProject.setProjectOutputWidth(b2);
                      videoProject.setProjectOutputHeight(i3);
                      uoc3 = d;
                      uoc4 = e;
                      uoc2 = b;
                      uoc5 = c;
                      b5 = og1;
                      oi1 = oi;
                      float f7 = 2.00f;
                      if ((((double)i3 * 0x3ff0000000000000) / (double)b2) - (((double)b6 * 0x3ff0000000000000) / (double)a1) > 0) {
                         videoProject.trackAssets(0).setPositioningMethod(1);
                         if (!k.c()) {
                            f8 = (float)i3;
                            f9 = f8 - ((float)b6 * (((float)b2 * 0x3f800000) / (float)a1));
                            int i4 = 0;
                            try{
                               videoProject.trackAssets(i4).setAssetTransform(EditorSdk2Utils.createIdentityTransform());
                               videoProject.trackAssets(i4).assetTransform().setPositionY((videoProject.trackAssets(i4).assetTransform().positionY() + (double)(((f9 / f7) / f8) * 100.00f)));
                            }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                               i1.c(e0);
                            }
                         }
                      }else {
                         videoProject.trackAssets(0).setPositioningMethod(2);
                         if (!k.c()) {
                            f8 = (float)i3;
                            f9 = (((float)b6 * (((float)b2 * 0x3f800000) / (float)a1)) - f8) / f7;
                            int i5 = 0;
                            try{
                               videoProject.trackAssets(i5).setAssetTransform(EditorSdk2Utils.createIdentityTransform());
                               videoProject.trackAssets(i5).assetTransform().setPositionY((videoProject.trackAssets(i5).assetTransform().positionY() + (double)((f9 / f8) * 100.00f)));
                            }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                               i1.c(e0);
                            }
                         }
                      }
                   }else {
                      uoc2 = b;
                      uoc5 = c;
                      uoc3 = d;
                      uoc4 = e;
                      b5 = og1;
                      oi1 = oi;
                   }
                }
                d = 0x3f800000;
             label_027a :
                oi2 = oi1;
             }else {
                uoc2 = b;
                uoc5 = c;
                uoc3 = d;
                uoc4 = e;
                b5 = og1;
                oi1 = oi;
                b3 = b2;
                if (b5 != null) {
                   oi2 = oi1;
                   if (!PatchProxy.applyVoidTwoRefs(videoProject, l, null, oi2, "5")) {
                      Object[] objArray3 = new Object[0];
                      a.D().w(str, "fillMoodPublishProject aiVideoBackgroundData:"+l, objArray3);
                      if (l.i()) {
                         b0 uob01 = BitmapUtil.E(l.d().getAbsolutePath());
                         videoProject.setProjectOutputWidth(uob01.a);
                         videoProject.setProjectOutputHeight(uob01.b);
                      }
                   }
                }else {
                   goto label_027a ;
                }
             }
             if (videoProject == null || !videoProject.trackAssetsSize()) {
                c = uoc5;
                objArray = new Object[0];
                a.D().A(str, "Invalid player project.", objArray);
                uoa0 = a0.s(new IllegalArgumentException("Missing track asset."));
             }else if(PatchProxy.isSupport(oi2)){
                patchProxyRe2 = patchProxyRe1;
                og1 = q;
                og2 = og;
                uAnimatedSub = PatchProxy.applyThreeRefs(q, p, Boolean.valueOf(b5), null, i.class, "10");
                if (uAnimatedSub != patchProxyRe2) {
                   patchProxyRe1 = patchProxyRe2;
                   x = og1;
                   og = og2;
                }else if(og1 != null){
                   List decorationDr1 = og1.getDecorationDrawerList();
                   double d1 = a.d(og1, p);
                   EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[decorationDr1.size()];
                   i1 = 0;
                   while (i1 < decorationDr1.size()) {
                      DecorationDrawer uDecorationD1 = decorationDr1.get(i1);
                      if (uDecorationD1 instanceof StoryWatermarkStickerDrawer) {
                         f6 = 100.00f;
                      }else if(uDecorationD1.isGenerateFileNeedScaleToVideo() || (uDecorationD1 instanceof StoryTextDrawer && b5 != null)){
                         d2 = uDecorationD1.getNormalizedScale() * d1;
                      }else {
                         d2 = uDecorationD1.getNormalizedScale();
                      }
                      f6 = (float)d2;
                      h0 oh0 = new h0((float)uDecorationD1.getNormalizedX(), (float)uDecorationD1.getNormalizedY(), f6, (float)uDecorationD1.getNormalizedRotate(), StickerTextValueType.AnimatedSubAsset, 0x3f800000, 0x3f800000, String.valueOf(System.currentTimeMillis()));
                      uAnimatedSub1[i1] = b.g(q, null, uDecorationD1.getDecorationFilePath(), -1, 0, p.getVideoLength(), b.i("", Integer.valueOf(-1)), false, false, false);
                      i1 = i1 + 1;
                      og1 = og1;
                      og2 = og2;
                      patchProxyRe2 = patchProxyRe2;
                      e = 0x3f800000;
                   }
                   patchProxyRe1 = patchProxyRe2;
                   x = og1;
                   og = og2;
                   uAnimatedSub = uAnimatedSub1;
                }else {
                   patchProxyRe1 = patchProxyRe2;
                   x = og1;
                   og = og2;
                   uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[0];
                }
             }else {
                og1 = q;
                og2 = og;
                patchProxyRe2 = patchProxyRe1;
                double d3 = 0x3f800000;
                goto label_02b5 ;
             }
             if (uoc5 != null) {
                List decorationDr = x.getDecorationDrawerList();
                ArrayList uArrayList = PatchProxy.applyTwoRefs(decorationDr, uAnimatedSub, null, oi2, "11");
                if (uArrayList != patchProxyRe1) {
                }else {
                   uArrayList = new ArrayList();
                   for (b1 = 0; b1 < decorationDr.size(); b1 = b1 + 1) {
                      TextBubbleDetail textBubbleDe = new TextBubbleDetail();
                      DecorationDrawer uDecorationD = decorationDr.get(b1);
                      b2 = decorationDr.size() - 1;
                      b2 = b2 - b1;
                      textBubbleDe.mBubbleName = uDecorationD.getDecorationName();
                      textBubbleDe.mText = uDecorationD.getUploadText();
                      textBubbleDe.mFrames = new ArrayList();
                      Rect contentRect = uDecorationD.getContentRect();
                      Rect containerViw = uDecorationD.getContainerViwShowingRect();
                      float f1 = (float)contentRect.left / (float)containerViw.width();
                      f1 = Math.min(Math.max(0, f1), 0x3f800000);
                      float f2 = (float)contentRect.right / (float)containerViw.width();
                      f2 = Math.min(Math.max(0, f2), 0x3f800000);
                      float f3 = (float)contentRect.top / (float)containerViw.height();
                      f3 = Math.min(Math.max(0, f3), 0x3f800000);
                      float f4 = (float)contentRect.bottom / (float)containerViw.height();
                      float f5 = Math.min(Math.max(0, f4), 0x3f800000);
                      textBubbleDe.mTopLeft = new TextBubbleDetail$Location(f1, f3);
                      textBubbleDe.mTopRight = new TextBubbleDetail$Location(f2, f3);
                      textBubbleDe.mBottomLeft = new TextBubbleDetail$Location(f1, f5);
                      textBubbleDe.mBottomRight = new TextBubbleDetail$Location(f2, f5);
                      uArrayList.add(new b(uAnimatedSub[b2].assetId(), textBubbleDe));
                   }
                }
                c = uoc5;
                c.addAll(uArrayList);
             }else {
                c = uoc5;
             }
             uoa0 = a0.y(new j(videoProject, uAnimatedSub)).u(new h(og));
          }
       }else {
          uoc1 = f;
          og = x;
          goto label_00a5 ;
       }
       b = uoc2;
       uoa0.G(d.a).u(new e(b, uoc3, c, uoc4)).R(new c(b3), f.b);
       uoc1.dismiss();
       if (!PatchProxy.applyVoid(null, b, g.class, "7")) {
          BasePostActivity activity1 = b.getActivity();
          if (activity1 != null) {
             activity1.finishAffinity();
             a = b.A;
             objArray = (a == null)? null: a.w;
             if (i.h()) {
                b4 = i.m().B();
                a.l();
             }else {
                b4 = true;
             }
             if (b4) {
                a.a.f(activity1, objArray);
             }
             activity1.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
          }
       }
       return;
    }
}
