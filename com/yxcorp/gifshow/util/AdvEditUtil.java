package com.yxcorp.gifshow.util.AdvEditUtil;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.util.e;
import java.lang.Runnable;
import t45.c;
import java.io.File;
import java.lang.String;
import boc.b;
import com.yxcorp.gifshow.util.resource.n;
import mca.a;
import tkd.b;
import tkd.d;
import z0c.o;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.AssetManager;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;
import java.util.Set;
import java.util.HashSet;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.media.util.c;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import th0.n;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.util.AdvEditUtil$a;
import android.animation.Animator$AnimatorListener;
import c26.c;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import u80.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import u80.j;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.lang.Boolean;

public class AdvEditUtil	// class@001ecc
{
    public static boolean a;

    public static void a(){
       AdvEditUtil.b(Category.THEME);
       c.a(e.b);
       AdvEditUtil.b(Category.EFFECT);
       AdvEditUtil.b(Category.STICKER);
       AdvEditUtil.b(Category.MAGIC_FINGER);
       AdvEditUtil.b(Category.TEXT);
    }
    public static void b(Category p0){
       File uFile = new File(p0.getResourceDir());
       if (!uFile.exists() || !uFile.isDirectory()) {
          n.l(p0);
       }
       return;
    }
    public static void c(){
       a.u();
       d.a(-860154223).M40(FilterVideoPlugin$FilterEntranceType.EDIT);
       EditorSdk2Utils.saveAssetsToSdCard(a.a().a().getAssets(), AdvEditUtil.d());
    }
    public static String d(){
       return d.a(-860154223).V4();
    }
    public static File e(){
       File uFile = d.a(-273232199).a20().a4();
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return uFile;
    }
    public static float f(Paint p0){
       return (p0.getFontMetrics().descent - p0.getFontMetrics().ascent);
    }
    public static Set g(){
       HashSet hashSet = new HashSet();
       hashSet.add("repeat");
       hashSet.add("slow_motion");
       hashSet.add("reverse");
       return hashSet;
    }
    public static double h(int p0,VideoSDKPlayerView p1){
       int i1;
       String str = "AdvEditUtil";
       double d = 0;
       int i = 0;
       if (p1 == null || p1.getVideoProject() == null) {
          Object[] objArray = new Object[i];
          a.D().A(str, "seekToSelectedSegment player not exist", objArray);
          return d;
       }else {
          EditorSdk2V2$VideoEditorProject videoProject = p1.getVideoProject();
          if (p0 > videoProject.trackAssetsSize()) {
             i1.c(new ArrayIndexOutOfBoundsException("selectedIndex:"+p0+",trackAssetLength:"+videoProject.trackAssetsSize()));
             return d;
          }else {
             i1 = 0;
             while (i1 < p0) {
                EditorSdk2V2$TrackAsset trackAsset = videoProject.trackAssets(i1);
                d = d + EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
                Minecraft$TransitionParam transitionPa = trackAsset.transitionParam();
                if (transitionPa != null && EditorSdk2Utils.transitionTypeHasOverlayDuration(transitionPa.type())) {
                   int i2 = p0 - 1;
                   if (i1 != i2) {
                      d = d - transitionPa.duration();
                      Object[] objArray1 = new Object[i];
                      a.D().s(str, "getTrackAssetRangeTimeFromStart transitionDuration:"+transitionPa.duration()+",seekTime:"+d+",i:"+i1, objArray1);
                   }
                }
                i1 = i1 + 1;
             }
             return d;
          }
       }
    }
    public static int i(String p0){
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AdvEditUtil", "getVideoDuration start", objArray);
       int i1 = (PostExperimentUtils.A0())? c.n(p0): c.m(p0);
       Object[] objArray1 = new Object[i];
       a.D().w("AdvEditUtil", "getVideoDuration end result:"+i1, objArray1);
       return i1;
    }
    public static void j(int p0,VideoSDKPlayerView p1){
       if (p1 == null) {
          return;
       }
       if (p0 >= 0 && p0 < p1.getVideoProject().trackAssetsSize()) {
          double d = AdvEditUtil.h(p0, p1);
          Object[] objArray = new Object[0];
          a.D().s("AdvEditUtil", "seekToSelectedTrackAsset: selectedIndex="+p0+" seekTime="+d, objArray);
          p1.seekTo(d);
       }
       return;
    }
    public static void k(View p0,Runnable p1,long p2,boolean p3){
       if (p0 == null) {
          return;
       }
       int i = 0;
       float f = (p3)? 0: 0x3f800000;
       p0.setAlpha(f);
       p0.setVisibility(0);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       float[] uofloatArray = new float[2];
       int i1 = (p3)? 0: 0x3f800000;
       uofloatArray[0] = i1;
       if (p3) {
          i = 0x3f800000;
       }
       uofloatArray[1] = i;
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, "alpha", uofloatArray)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setInterpolator(new n());
       uAnimatorSet.setDuration(p2);
       uAnimatorSet.addListener(new AdvEditUtil$a(p1));
       uAnimatorSet.start();
       return;
    }
    public static void l(VideoSDKPlayerView p0,c p1){
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AdvEditUtil", "updatePlayerView\(\) called", objArray);
       if (p1 == null) {
          p0.setVideoProject(null);
          p0.setLyricAEProjectModel(null);
          p0.setAETemplateExternalParams(null, null);
          p0.setIsNormalAETemplate(i);
          p0.setIKuaiShanProject(null);
          return;
       }else if(p1 instanceof b$a){
          p0.updateTemplateExceptionInfo(p1.getTemplateId(), p1.getTemplateType());
          d uod = d.a(-215111236).yK(p1.g, p1.h, p1.g());
          d editingKuaiS = p0.getEditingKuaiShanProject();
          if (editingKuaiS != null) {
             boolean b = (uod != null && (editingKuaiS.getTemplateId()).equals(uod.getTemplateId()))? true: false;
             if (!b) {
             label_0063 :
                p0.setIKuaiShanProject(uod);
                if (uod != null) {
                   p1.o = uod.H();
                   p1.p = uod.g();
                }
             }
          }else {
             goto label_0063 ;
          }
          p0.setLyricAEProjectModel(p1.b());
          if (p1.d() != null) {
             i = true;
          }
          p0.setIsNormalAETemplate(i);
          p0.setAETemplateExternalParams(p1.d(), p1.a());
          if (p1.l.booleanValue()) {
             p0.setVideoProject(p1.getProject(), true);
          }else {
             p0.setVideoProject(p1.getProject());
          }
       }
       return;
    }
}
