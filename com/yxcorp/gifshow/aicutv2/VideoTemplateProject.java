package com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import h69.g;
import q87.c;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameVisibleTime;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.kve.SmartEditResult;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.kve.MediaAsset;
import com.kwai.kve.MediaAnalyzeResult;
import java.lang.StringBuilder;
import java.lang.Long;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.util.PostUtils;
import usd.q;
import tkd.b;
import tkd.d;
import u80.j;
import com.kuaishou.gifshow.kuaishan.KSSource;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$a;
import erd.o;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$b;
import k69.e$a;
import k69.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import o69.o2;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import nsd.u;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$j;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$c;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$d;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$e;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$f;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$h;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$i;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$ChangeTemplateInfo;
import trd.u;
import java.lang.Float;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import qrd.l1;
import java.lang.Integer;
import com.kwai.kve.ErrorInfo;
import xoc.c;
import com.kwai.kve.AlbumType;
import u80.d;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import o69.n2;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$k;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$l;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$m;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$n;
import java.lang.Double;
import java.lang.CharSequence;
import v69.d;
import v69.b;
import l69.n;
import l69.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.utility.TextUtils;
import i69.d;
import j69.a;
import j69.c;
import t69.a;
import io.reactivex.g;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$p;
import o69.d2;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$q;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$e0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$f0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$g0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$h0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$i0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$j0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$k0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$l0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$m0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$u;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$v;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$w;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$x;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$y;
import erd.a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$z;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$a0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$b0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$c0;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$d0;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$r;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$s;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$t;
import crd.b;
import crd.a;

public class VideoTemplateProject extends c	// class@0019a1
{
    public VideoTemplateResponse Q;
    public VideoTemplate R;
    public d S;
    public String T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;

    public void VideoTemplateProject(List p0){
       a.p(p0, "medias");
       super(p0);
    }
    public t A0(EditorSdk2MvCreationResult p0,VideoTemplate p1,boolean p2,MemorySceneType p3){
       KSTemplateDetailInfo obj;
       t ot;
       Long longx1;
       Object key;
       StringBuilder value;
       long this;
       QMedia duration;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoTemplateProject videoTemplat = VideoTemplateProject.class;
       if (PatchProxy.isSupport(videoTemplat)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, VideoTemplateProject.class, "18");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p1, "template");
       int i = 0;
       Object[] objArray = new Object[i];
       g.D().w("VideoTemplateProject", "applyKSTemplate: ", objArray);
       if (p0 == null) {
          ot = t.error(new IllegalArgumentException("VideoTemplateProject.applyKSTemplate: creationResult is null"));
          a.o(ot, "Observable.error\(Illegal¡­creationResult is null\"\)\)");
          return ot;
       }else {
          obj = p1.getKsTemplateInfo().toKSTemplateDetailInfo();
          a.o(obj, "template.ksTemplateInfo.toKSTemplateDetailInfo\(\)");
          KSBaseInfo mFrameVisibl = obj.mFrameVisibleTimeList;
          int b = true;
          String str = (mFrameVisibl == null || mFrameVisibl.isEmpty())? 1: null;
          if (str) {
             ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, videoTemplat, "22");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                List replaceableM = p0.getReplaceableMvAssets();
                a.o(replaceableM, "creationResult.replaceableMvAssets");
                Iterator iterator3 = replaceableM.iterator();
                while (iterator3.hasNext()) {
                   EditorSdk2MvAsset uEditorSdk2M = iterator3.next();
                   KSFeedTemplateDetailInfo$FrameVisibleTime uFrameVisibl = new KSFeedTemplateDetailInfo$FrameVisibleTime();
                   a.o(uEditorSdk2M, "mvAsset");
                   uFrameVisibl.mId = uEditorSdk2M.getRefId();
                   List visibleTimeR = uEditorSdk2M.getVisibleTimeRanges();
                   a.o(visibleTimeR, "mvAsset.visibleTimeRanges");
                   int i1 = visibleTimeR.isEmpty() ^ b;
                   if (i1) {
                      uFrameVisibl.mStart = (float)uEditorSdk2M.getVisibleTimeRanges().get(i).start();
                      uFrameVisibl.mDuration = (float)uEditorSdk2M.getVisibleTimeRanges().get(i).duration();
                   }
                   uArrayList.add(uFrameVisibl);
                }
             }
             obj.mFrameVisibleTimeList = uArrayList;
             p1.getKsTemplateInfo().mFrameVisibleTimeList = uArrayList;
          }
          SmartEditResult smartEditRes = this.G0(p1);
          float f = 1000.00f;
          if (smartEditRes != null) {
             Map mediaAnalyze = smartEditRes.getMediaAnalyzeResults();
             if (mediaAnalyze != null) {
                Iterator iterator = mediaAnalyze.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Iterator iterator1 = this.M().iterator();
                   while (true) {
                      String str1 = "mapEntry.key";
                      Long longx = null;
                      if (iterator1.hasNext()) {
                         longx1 = iterator1.next();
                         key = uEntry.getKey();
                         a.o(key, str1);
                         if (!a.g(key.getFileName(), longx1.path)) {
                            continue ;
                         }
                      }else {
                         longx1 = longx;
                      }
                      str = "mapEntry.value";
                      if (longx1 != null) {
                         value = uEntry.getValue();
                         a.o(value, str);
                         float value1 = value.getClipStartTime() * f;
                         longx1.mClipStart = (long)value1;
                      }
                      if (longx1) {
                         value = uEntry.getValue();
                         a.o(value, str);
                         float f1 = value.getClipDuration() * f;
                         longx1.setClipDuration((long)f1);
                      }
                      g og = g.D();
                      Long key1 = uEntry.getKey();
                      a.o(key1, str1);
                      value = "applyKSTemplate: set media clip path = "+key1.getFileName()+"start=";
                      key1 = (longx1)? Long.valueOf(longx1.mClipStart): longx;
                      value = value+key1+" , duration = ";
                      if (longx1) {
                         longx = Long.valueOf(longx1.getClipDuration());
                      }
                      Object[] objArray1 = new Object[i];
                      og.w("VideoTemplateProject", value+longx, objArray1);
                   }
                }
             }
          }
          KSBaseInfo mFrameVisibl1 = obj.mFrameVisibleTimeList;
          Iterator iterator2 = this.M().iterator();
          while (iterator2.hasNext()) {
             long l = iterator2.next();
             b = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (i >= mFrameVisibl1.size()) {
                PostUtils.D("VideoTemplateProject", "applyKSTemplate visibleTimes not enough", new IllegalArgumentException("visibleTimes.size="+mFrameVisibl1.size()+",mMedias"+".size="+this.M().size()));
             }else {
                i = mFrameVisibl1.get(i);
                a.o(i, "visibleTimes[index]");
                float f2 = i.getRealFrameDuration() * f;
                l.setClipDuration((long)f2);
                this = 0;
                if (l.duration - this > 0) {
                   long l1 = l.mClipStart + l.getClipDuration();
                   duration = l.duration;
                   if (l1 - duration > 0) {
                      long l2 = duration - l.getClipDuration();
                      l.mClipStart = q.o(l2, this);
                      l.mClipDuration = q.v(l.mClipDuration, l.duration);
                   }
                }
                if (l.mClipStart - this < 0) {
                   l.mClipStart = this;
                   l.mClipDuration = q.v(l.mClipDuration, l.duration);
                }
             }
             i = b;
          }
          ot = d.a(-215111236).wp(p0, obj, this.M(), KSSource.AI_CUT).observeOn(d.a).map(new VideoTemplateProject$a(this, obj));
          a.o(ot, "PluginManager.get\(KuaiSh¡­      ksProject\n        }");
          return ot;
       }
    }
    public t B0(VideoTemplate p0,KwaiAICutStyle p1){
       t ot;
       Ref$ObjectRef obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoTemplateProject.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "template");
       a.p(p1, "style");
       String id = p1.getId();
       this.z(new VideoTemplateProject$b(id));
       obj = new Ref$ObjectRef();
       o2 oo2 = this.Y().get(id);
       obj.element = oo2;
       int i = 0;
       String str = "styleId";
       if (oo2 == null) {
          Object[] objArray = new Object[i];
          g.D().w("VideoTemplateProject", "startChangeStyle: first apply create StyleStatus "+p1, objArray);
          obj.element = new o2(null, 1, null);
          a.o(id, str);
          this.Y().put(id, obj.element);
       }
       a.o(id, str);
       this.p0(id);
       AICutMusicInfo uAICutMusicI = (this.V != null)? this.K(): obj.element.b();
       if (uAICutMusicI == null) {
          uAICutMusicI = this.H(p1);
          a.o(uAICutMusicI, "getAiCutMusicInfo\(style\)");
       }
       if (a.g(id, "-3")) {
          ot = t.just(uAICutMusicI).observeOn(d.c).doOnNext(VideoTemplateProject$j.b);
       }else {
          Object[] objArray1 = new Object[i];
          g.D().w("VideoTemplateProject", "startChangeStyle : music id="+uAICutMusicI.getMId(), objArray1);
          ot = t.just(uAICutMusicI);
       }
       t ot1 = ot.flatMap(new VideoTemplateProject$c(this, p1)).onErrorReturn(VideoTemplateProject$d.b).flatMap(new VideoTemplateProject$e(p1)).observeOn(d.a).doOnNext(new VideoTemplateProject$f(this, obj, id)).doOnError(new VideoTemplateProject$g(this, id)).flatMap(new VideoTemplateProject$h(this)).flatMap(new VideoTemplateProject$i(this));
       a.o(ot1, "musicInfo\n        .flatM¡­\(\)\)\n          }\n        }");
       return ot1;
    }
    public t C0(VideoTemplate p0,boolean p1,MemorySceneType p2){
       if (PatchProxy.isSupport(VideoTemplateProject.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, VideoTemplateProject.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "template");
       KSTemplateDetailInfo kSTemplateDe = p0.getKsTemplateInfo().toKSTemplateDetailInfo();
       a.o(kSTemplateDe, "template.ksTemplateInfo.toKSTemplateDetailInfo\(\)");
       t ot = d.a(-215111236).eZ("VideoTemplateProject", kSTemplateDe, false);
       a.o(ot, "kuaiShanPostPlugin.downl¡­e\(TAG, ksTemplate, false\)");
       return ot;
    }
    public String D0(VideoTemplate p0){
       VideoTemplateProject$ChangeTemplateInfo obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "template");
       String id = p0.getId();
       String str = 1;
       boolean b = (p0.getType() == str)? true: false;
       obj = new VideoTemplateProject$ChangeTemplateInfo(id, b);
       if (p0.getType() == str) {
          KSBaseInfo mFrameVisibl = p0.getKsTemplateInfo().mFrameVisibleTimeList;
          a.o(mFrameVisibl, "template.ksTemplateInfo.mFrameVisibleTimeList");
          ArrayList uArrayList = new ArrayList(u.Y(mFrameVisibl, 10));
          Iterator iterator = mFrameVisibl.iterator();
          while (iterator.hasNext()) {
             KSFeedTemplateDetailInfo$FrameVisibleTime uFrameVisibl = iterator.next();
             a.o(uFrameVisibl, "it");
             uArrayList.add(Float.valueOf(uFrameVisibl.getRealFrameDuration()));
          }
          obj.setClipDurations(uArrayList);
       }
       return a.a.q(obj);
    }
    public final int E0(){
       return this.X;
    }
    public final boolean F0(){
       return this.W;
    }
    public SmartEditResult G0(VideoTemplate p0){
       Integer integer;
       o2 obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "template");
       obj = this.Y().get(p0.getId());
       SmartEditResult smartEditRes = null;
       SmartEditResult smartEditRes1 = (obj != null)? obj.a(): smartEditRes;
       int i = 0;
       if (smartEditRes1 != null) {
          Object[] objArray = new Object[i];
          g.D().w("VideoTemplateProject", "getClipResult\(\) return mStyleStatusMap result", objArray);
          o2 oo2 = this.Y().get(p0.getId());
          if (oo2 != null) {
             smartEditRes = oo2.a();
          }
          return smartEditRes;
       }else if(this.b0() == null){
          return smartEditRes;
       }else {
          String str = this.D0(p0);
          EditorSmartClipTask uEditorSmart = this.b0();
          SmartEditResult smartEditRes2 = (uEditorSmart != null)? uEditorSmart.changedTemplateResult(str): smartEditRes;
          if (this.Y().get(p0.getId()) == null) {
             o2 oo21 = new o2(smartEditRes, 1, smartEditRes);
             oo21.d(smartEditRes2);
             this.Y().put(p0.getId(), oo21);
          }else {
             Object obj1 = this.Y().get(p0.getId());
             a.m(obj1);
             obj1.d(smartEditRes2);
          }
          g og = g.D();
          char c = ' ';
          StringBuilder str1 = "getClipResult\(\) "+p0.getName()+"  info: "+str+c+", mediaAnalyzeResults=";
          if (smartEditRes2 != null) {
             Map mediaAnalyze = smartEditRes2.getMediaAnalyzeResults();
             if (mediaAnalyze != null) {
                integer = Integer.valueOf(mediaAnalyze.size());
             label_00d9 :
                str1 = str1+integer+c+", resultErrorInfo= ";
                if (smartEditRes2 != null) {
                   ErrorInfo errorInfo = smartEditRes2.getErrorInfo();
                   if (errorInfo != null) {
                      smartEditRes = errorInfo.getErrorMessage();
                   }
                }
                Object[] objArray1 = new Object[i];
                og.w("VideoTemplateProject", str1+smartEditRes, objArray1);
                return smartEditRes2;
             }
          }
          integer = smartEditRes;
          goto label_00d9 ;
       }
    }
    public final VideoTemplate H0(){
       Object obj = PatchProxy.apply(null, this, VideoTemplateProject.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a.a(this.J());
    }
    public AICutStyle I(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       VideoTemplate videoTemplat = this.L0(p0);
       KwaiAICutStyle aiCutStyle = (videoTemplat != null)? videoTemplat.getAiCutStyle(): null;
       return aiCutStyle;
    }
    public final d I0(){
       return this.S;
    }
    public final VideoTemplate J0(){
       return this.R;
    }
    public final String K0(){
       return this.T;
    }
    public final VideoTemplate L0(String p0){
       Object obj1;
       VideoTemplateProject obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       if (a.g(p0, "-1") || a.g(p0, "-3")) {
          return this.H0();
       }
       obj = this.Q;
       if (obj != null) {
          ArrayList templateGrou = obj.getTemplateGroups();
          if (templateGrou != null) {
             Iterator iterator = templateGrou.iterator();
             while (iterator.hasNext()) {
                ArrayList templates = iterator.next().getTemplates();
                if (templates != null) {
                   Iterator iterator1 = templates.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj1 = iterator1.next();
                         if (!a.g(p0, obj1.getId())) {
                            continue ;
                         }
                      }else {
                         obj1 = null;
                      }
                   }
                }else {
                   obj1 = null;
                }
                if (obj1 != null) {
                   return obj1;
                }else {
                   continue ;
                }
             }
          }
       }
       return null;
    }
    public final VideoTemplateResponse M0(){
       return this.Q;
    }
    public final boolean N0(){
       return this.V;
    }
    public t O0(KwaiAICutStyle p0,n2 p1){
       z a;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoTemplateProject.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "style");
       a.p(p1, "startStatusData");
       a = d.a;
       t ot = t.fromCallable(new VideoTemplateProject$k(p0)).subscribeOn(d.c).observeOn(a).flatMap(new VideoTemplateProject$l(this, p0)).observeOn(a).doOnNext(new VideoTemplateProject$m(this, p1)).takeLast(1).observeOn(a).doOnNext(new VideoTemplateProject$n(this, p1));
       a.o(ot, "Observable.fromCallable ¡­it\)\n          }\n        }");
       return ot;
    }
    public t P0(String p0,List p1,List p2,String p3,boolean p4,boolean p5){
       Object[] objArray;
       List obj;
       double d;
       int i3;
       int i4;
       String str5;
       String str = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       boolean b = p4;
       VideoTemplateProject videoTemplat = VideoTemplateProject.class;
       int i = 6;
       int i1 = 3;
       int i2 = 0;
       if (PatchProxy.isSupport(videoTemplat)) {
          objArray = new Object[i];
          objArray[i2] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[i1] = oobject2;
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          obj = PatchProxy.apply(objArray, str, videoTemplat, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(oobject, "recommendFlashIds");
       a.p(oobject1, "recommendAiCutIds");
       a.p(oobject2, "currentSelectedTemplateId");
       obj = this.M();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       objArray = 0;
       QMedia qMedia = null;
       while (iterator.hasNext()) {
          QMedia qMedia1 = iterator.next();
          if (qMedia1.type == null) {
             d = 0xbff0000000000000;
             objArray = 1;
          }else {
             double d1 = (double)qMedia1.duration * 0x3ff0000000000000;
             d = d1 / (double)1000;
             qMedia = 1;
          }
          uArrayList.add(Double.valueOf(d));
          String str1 = 3;
       }
       if (objArray && qMedia != null) {
          i3 = 3;
       }else if(qMedia != null){
          i3 = 2;
       }else {
          i3 = 1;
       }
       String str2 = (p0 != null)? p0: "";
       str.T = str2;
       Object[] objArray1 = new Object[i2];
       g.D().w("VideoTemplateProject", "observableGetTemplates sceneResult= "+str.T, objArray1);
       String str3 = "-1";
       if (p2.isEmpty()) {
          oobject1 = new ArrayList();
          str2 = (this.S().length() > 0)? 1: null;
          if (str2 && ((a.g(this.S(), str3) ^ 1) && !this.R())) {
             oobject1.add(Long.valueOf(Long.parseLong(this.S())));
          }
       }
    label_00fa :
       if (p1.isEmpty()) {
          oobject = new ArrayList();
          if (this.S().length() > 0) {
             i2 = 1;
          }
          if (i2 && ((a.g(this.S(), str3) ^ 1) && this.R() == 1)) {
             oobject.add(Long.valueOf(Long.parseLong(this.S())));
          }
       }
    label_0132 :
       if (b) {
          i4 = 3;
       }else if(p5){
          i4 = 6;
       }else if(this.J() == AlbumType.AICUT){
          i4 = 1;
       }else {
          i4 = 2;
       }
       b uob = d.b.a();
       int i5 = this.M().size();
       VideoTemplateProject t = str.T;
       String str4 = this.U();
       o oo = n.f.d();
       if (oo != null) {
          str3 = oo.f();
          if (str3 != null) {
             str5 = str3;
          label_0170 :
             t ot = b.b(uob, i5, i3, uArrayList, oobject, oobject1, t, str4, str5, i4, 0, 0, 1536, null).observeOn(d.a).map(new VideoTemplateProject$o(str, b, oobject2));
             a.o(ot, "VideoTemplateApiServiceM¡­ingInitTemplate\n        }");
             return ot;
          }
       }
       str5 = "";
       goto label_0170 ;
    }
    public final void Q0(d p0){
       this.S = p0;
    }
    public final void R0(VideoTemplate p0){
       this.R = p0;
    }
    public final void S0(VideoTemplateResponse p0){
       this.Q = p0;
    }
    public boolean f(AICutStyle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "style");
       return false;
    }
    public void j(boolean p0){
       this.V = p0;
    }
    public AICutStyle k0(){
       KwaiAICutStyle aiCutStyle;
       Object[] objArray = null;
       VideoTemplateProject obj = PatchProxy.apply(objArray, this, VideoTemplateProject.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj != null) {
          ArrayList templateGrou = obj.getTemplateGroups();
          if (templateGrou != null && (templateGrou.isEmpty() ^ 1)) {
             templateGrou = templateGrou.get(0).getTemplates();
             if (templateGrou != null && (templateGrou.isEmpty() ^ 1) == 1) {
                Iterator iterator = templateGrou.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   Object obj2 = (!obj1.getType())? 1: null;
                   if (obj2) {
                      objArray = obj1;
                      break ;
                   }
                }
                if (objArray != null) {
                   aiCutStyle = objArray.getAiCutStyle();
                   if (aiCutStyle != null) {
                   label_0067 :
                      return aiCutStyle;
                   }
                }
                aiCutStyle = AICutStyle.newEmptyStyle();
                a.o(aiCutStyle, "AICutStyle.newEmptyStyle\(\)");
                goto label_0067 ;
             }
          }
       }
       AICutStyle uAICutStyle = AICutStyle.newEmptyStyle();
       a.o(uAICutStyle, "AICutStyle.newEmptyStyle\(\)");
       return uAICutStyle;
    }
    public void l(EditorSdk2V2$VideoEditorProject p0,double p1,double p2,String p3,String p4){
       Object[] objArray;
       String str1;
       StringBuilder mId;
       VideoTemplateProject videoTemplat = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       VideoTemplateProject videoTemplat1 = VideoTemplateProject.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(videoTemplat1)) {
          objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[1] = Double.valueOf(p1);
          objArray[i2] = Double.valueOf(p2);
          objArray[i1] = oobject1;
          objArray[i] = oobject2;
          if (PatchProxy.applyVoid(objArray, this, videoTemplat1, "2")) {
             return;
          }
       }
       String str = "videoProject";
       a.p(p0, str);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray1 = new Object[i3];
          objArray1[0] = oobject;
          objArray1[1] = Double.valueOf(p1);
          objArray1[i2] = Double.valueOf(p2);
          objArray1[i1] = oobject1;
          objArray1[i] = oobject2;
          if (PatchProxy.applyVoid(objArray1, this, uoc, "49")) {
          label_0127 :
             if (videoTemplat.V != null) {
                this.o0(d.d.a().c().F2());
             }
             return;
          }
       }
       a.p(p0, str);
       videoTemplat.x = p1;
       videoTemplat.y = p2;
       videoTemplat.m = oobject;
       objArray = new Object[0];
       g.D().w("AICutProject", "initIfNeed: style="+oobject1+", music id="+oobject2, objArray);
       if (TextUtils.x(p3)) {
          Object[] objArray2 = new Object[0];
          g.D().w("AICutProject", "init styleId is empty --> Ô­Æ¬", objArray2);
          str1 = "-2";
       }else {
          str1 = String.valueOf(p3);
       }
       o2 oo2 = videoTemplat.A.get(str1);
       AICutMusicInfo uAICutMusicI = null;
       if (oo2 == null) {
          oo2 = new o2(uAICutMusicI, 1, uAICutMusicI);
          videoTemplat.A.put(str1, oo2);
       }
       if (oobject2 != null) {
          uoc = videoTemplat.w;
          mId = (uoc != null)? uoc.getMId(): uAICutMusicI;
          if ((a.g(mId, oobject2) ^ 1) && oo2.b() == null) {
             Object[] objArray3 = new Object[0];
             g.D().w("AICutProject", "initIfNeed: init current music from draft", objArray3);
             oo2.e(d.d.a().c().F2());
          }
       }
    label_00ee :
       this.v0(str1);
       g og = g.D();
       mId = "initIfNeed: styleId="+videoTemplat.q+",statusMusicId=";
       AICutMusicInfo uAICutMusicI1 = oo2.b();
       if (uAICutMusicI1 != null) {
          uAICutMusicI = uAICutMusicI1.getMId();
       }
       Object[] objArray4 = new Object[0];
       og.w("AICutProject", mId+uAICutMusicI+"  musicId="+oobject2, objArray4);
       goto label_0127 ;
    }
    public void m(boolean p0){
       VideoTemplateProject videoTemplat = VideoTemplateProject.class;
       if (PatchProxy.isSupport(videoTemplat) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoTemplat, "4")) {
          return;
       }
       this.R = this.H0();
       super.m(p0);
       return;
    }
    public t n(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoTemplateProject videoTemplat = VideoTemplateProject.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, videoTemplat, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "template");
       int i = 0;
       if (!p0 instanceof VideoTemplate) {
          p0 = t.just(Integer.valueOf(i));
          a.o(p0, "Observable.just\(0\)");
          return p0;
       }else {
          Object[] objArray = new Object[i];
          g.D().w("VideoTemplateProject", "changeStyle: "+p0.getId()+' '+p0.getName(), objArray);
          if (!p0.getType()) {
             p0 = this.B0(p0, p0.getAiCutStyle());
          }else {
             Object obj1 = PatchProxy.applyOneRefs(p0, this, videoTemplat, "17");
             if (obj1 != patchProxyRe) {
                p0 = obj1;
             }else {
                a.p(p0, "template");
                p0 = t.create(new a(this, p0));
                a.o(p0, "Observable.create { emit¡­e.dispose\(\)\n      }\n    }");
             }
          }
          return p0;
       }
    }
    public void r(boolean p0){
       this.U = p0;
    }
    public AICutMusicInfo s(String p0){
       AICutMusicInfo uAICutMusicI;
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "styleId");
       if (this.V != null) {
          uAICutMusicI = this.K();
       }else {
          o2 oo2 = this.Y().get(p0);
          uAICutMusicI = (oo2 != null)? oo2.b(): null;
       }
       return uAICutMusicI;
    }
    public t start(){
       Object[] objArray1;
       z a;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, VideoTemplateProject.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "VideoTemplateProject";
       a.f.a().g(PostCommonBiz.KUAISHAN, str, "start: mMedias.size = "+this.M().size());
       int i = 0;
       if (this.i != null) {
          objArray1 = new Object[i];
          g.D().A(str, "start: start twice!", objArray1);
          return objArray;
       }else {
          this.u0(true);
          this.z(VideoTemplateProject$p.a);
          n2 on2 = new n2(this.M(), this.O);
          d2 uod2 = on2.a();
          uod2.j(i);
          uod2.k((AbiUtil.b() ^ true));
          uod2.i(true);
          if (!on2.f()) {
             objArray1 = new Object[i];
             g.D().w(str, "start: don\'t need trans code", objArray1);
             this.z(VideoTemplateProject$q.a);
          }
          z c = d.c;
          a = d.a;
          obj = t.fromCallable(VideoTemplateProject$e0.b).subscribeOn(c).flatMap(new VideoTemplateProject$f0(this, on2)).flatMap(new VideoTemplateProject$g0(this, on2)).flatMap(new VideoTemplateProject$h0(this)).flatMap(new VideoTemplateProject$i0(this, on2)).flatMap(new VideoTemplateProject$j0(this)).flatMap(new VideoTemplateProject$k0(this, on2)).flatMap(VideoTemplateProject$l0.b).flatMap(new VideoTemplateProject$m0(this)).flatMap(new VideoTemplateProject$u(this, on2)).flatMap(new VideoTemplateProject$v(this)).flatMap(new VideoTemplateProject$w(this, on2)).flatMap(new VideoTemplateProject$x(this)).observeOn(a).doOnDispose(new VideoTemplateProject$y(this, on2)).observeOn(a).flatMap(new VideoTemplateProject$z(this)).flatMap(new VideoTemplateProject$a0(this)).observeOn(c);
          obj = obj.flatMap(new VideoTemplateProject$b0(this)).observeOn(a).flatMap(VideoTemplateProject$c0.b).observeOn(a).doFinally(new VideoTemplateProject$d0(this));
          if (this.Z() > 0) {
             obj = obj.timeout((long)this.Z(), TimeUnit.SECONDS);
          }
          this.j.c(obj.doOnDispose(new VideoTemplateProject$r(this)).subscribe(new VideoTemplateProject$s(this, on2), new VideoTemplateProject$t(this, on2)));
          return obj;
       }
    }
}
