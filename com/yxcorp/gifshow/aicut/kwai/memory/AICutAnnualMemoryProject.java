package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.util.ArrayList;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import i79.b;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import o69.n2;
import brd.t;
import o69.c;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h69.g;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import q87.c;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Source;
import pr3.d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import tkd.b;
import tkd.d;
import h69.h;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$i;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$j;
import i79.c;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$a;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$k;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$l;
import java.lang.Integer;
import java.lang.System;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$b;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$c;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$d;
import brd.w;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$e;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$f;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$g;
import erd.a;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$h;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$ChangeTemplateInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.model.KSMemoryClipType;
import java.lang.Float;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.kve.SmartEditResult;
import java.util.Map;
import o69.o2;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import com.yxcorp.gifshow.kuaishan.model.TemplateMusic;
import l69.t;
import com.kuaishou.android.model.music.Music;
import o69.u0;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$p;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import v69.d;
import v69.b;
import java.util.Collections;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$q;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle$KWaiAiCutMusic;
import ssd.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt___StringsKt;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2;
import msd.l;
import trd.y;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle$OpenEndInfo;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle$StartEndInfo;
import com.kwai.sdk.switchconfig.a;
import nsd.u;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.kve.MediaAsset;
import com.kwai.kve.MediaAnalyzeResult;
import java.lang.Long;
import usd.q;
import com.kwai.video.clipkit.mv.ClipMvUtils$CropResourceInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import qrd.l1;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import l69.n;
import l69.o;
import java.util.Objects;
import nsd.s0;
import o69.g1;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$m;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$n;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$r;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$s;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$t;

public final class AICutAnnualMemoryProject extends VideoTemplateProject	// class@001965
{
    public final ArrayList Y;
    public final ArrayList Z;
    public boolean a0;
    public final HashMap b0;
    public final HashMap c0;
    public final HashMap d0;
    public int e0;
    public final ArrayList f0;
    public final MemorySceneType g0;

    public void AICutAnnualMemoryProject(ArrayList p0,MemorySceneType p1){
       a.p(p0, "templateMedias");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.addAll(iterator.next().e());
       }
       super(uArrayList);
       this.f0 = p0;
       this.g0 = p1;
       this.Y = new ArrayList(p0);
       this.Z = new ArrayList();
       this.b0 = new HashMap();
       this.c0 = new HashMap();
       this.d0 = new HashMap();
       this.e0 = 1;
       return;
    }
    public static final t T0(AICutAnnualMemoryProject p0,n2 p1){
       return super.i0(p1);
    }
    public t B0(VideoTemplate p0,KwaiAICutStyle p1){
       String id;
       c uoc;
       Object[] objArray4;
       d uod;
       t ot3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AICutAnnualMemoryProject uAICutAnnual = AICutAnnualMemoryProject.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, uAICutAnnual, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "template");
       a.p(p1, "style");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AICutAnnualMemoryProject";
       g.D().w(str, "changeStyle: id="+p1.mStyleId+" name="+p1.mName, objArray);
       Integer[] integerArray = -1595266550;
       int i1 = 100;
       if (PatchProxy.isSupport(uAICutAnnual)) {
          obj = PatchProxy.applyOneRefs(Boolean.TRUE, this, uAICutAnnual, "16");
          if (obj != patchProxyRe) {
          }else {
          label_005a :
             String str1 = "Observable.just\(PercentR¡­t = FULL_PERCENT\n      }\)";
             if (this.Z0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
                objArray4 = new Object[i];
                g.D().w(str, "getExtraMedias: is local", objArray4);
                uod = new d();
                uod.c = CollectionsKt__CollectionsKt.E();
                uod.d(i1);
                ot3 = t.just(uod);
                a.o(ot3, str1);
             }else if(this.Z.isEmpty() ^ 0x01){
                objArray4 = new Object[i];
                g.D().w(str, "getExtraMedias: already get", objArray4);
                uod = new d();
                uod.c = this.Z;
                uod.d(i1);
                ot3 = t.just(uod);
                a.o(ot3, str1);
             }else {
                Object[] objArray5 = new Object[i];
                g.D().w(str, "getExtraMedias: download", objArray5);
                obj = d.a(integerArray).a5();
             }
             obj = ot3;
          }
       }else {
          goto label_005a ;
       }
       obj = obj.map(new AICutAnnualMemoryProject$i(this)).onErrorReturn(AICutAnnualMemoryProject$j.b);
       id = p0.getId();
       MemorySceneType eDIT = MemorySceneType.EDIT;
       t ot = PatchProxy.applyTwoRefs(id, eDIT, this, uAICutAnnual, "17");
       if (ot != patchProxyRe) {
       }else {
          Object[] objArray1 = new Object[i];
          g.D().w(str, "getVideoStartEnd\(\) called with: styleId = "+id, objArray1);
          if (this.Z0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
             Object[] objArray2 = new Object[i];
             g.D().w(str, "getVideoStartEnd: is local", objArray2);
             uoc = new c();
             uoc.a(i1);
             ot = t.just(uoc);
             a.o(ot, "Observable.just\(MemorySt¡­s = FULL_PERCENT\n      }\)");
          }else {
             AICutAnnualMemoryProject$a uoa = this.b0.get(id);
             if (uoa != null) {
                uoc = uoa.b();
                if (uoc != null) {
                   Object[] objArray3 = new Object[i];
                   g.D().w(str, "getVideoStartEnd:  return from templateStatusMap", objArray3);
                   ot = t.just(uoc);
                   a.o(ot, "Observable.just\(it\)");
                }
             }
             ot = d.a(integerArray).Mt(id, eDIT);
          }
       }
       t ot1 = ot.map(new AICutAnnualMemoryProject$k(this, p0)).onErrorReturn(AICutAnnualMemoryProject$l.b);
       int i2 = 3;
       integerArray = new Integer[i2];
       for (i1 = 0; i1 < i2; i1 = i1 + 1) {
          integerArray[i1] = Integer.valueOf(i);
       }
       long l = System.currentTimeMillis();
       t ot2 = t.merge(super.B0(p0, p1).map(new AICutAnnualMemoryProject$b(integerArray)), obj.map(new AICutAnnualMemoryProject$c(integerArray)), ot1.map(new AICutAnnualMemoryProject$d(integerArray))).map(new AICutAnnualMemoryProject$e(integerArray)).observeOn(d.c).map(new AICutAnnualMemoryProject$f(this, p0, p1)).observeOn(d.a).doOnComplete(new AICutAnnualMemoryProject$g(l)).doOnError(new AICutAnnualMemoryProject$h(l));
       a.o(ot2, "Observable.merge\(\n      \x20\x02.message ?: \"\"\)\n        }\x00");
       return ot2;
    }
    public String D0(VideoTemplate p0){
       ArrayList uArrayList;
       VideoTemplateProject$ChangeTemplateInfo obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "template");
       String id = p0.getId();
       int i = 1;
       int i1 = 0;
       boolean b = (p0.getType() == i)? true: false;
       obj = new VideoTemplateProject$ChangeTemplateInfo(id, b);
       if (p0.getType() == i) {
          AICutAnnualMemoryProject$a uoa = this.b0.get(p0.getId());
          if (uoa != null) {
             List list = uoa.a();
             if (list != null) {
                uArrayList = new ArrayList();
                Iterator iterator = this.f0.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   int i2 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   Iterator iterator1 = obj1.e().iterator();
                   while (iterator1.hasNext()) {
                      QMedia qMedia = iterator1.next();
                      if (obj1.d() == KSMemoryClipType.ENDING) {
                         uArrayList.add(Float.valueOf((float)8.00f));
                      }else {
                         int i3 = i % list.size();
                         uArrayList.add(Float.valueOf((float)list.get(i3).doubleValue()));
                      }
                   }
                   i = i2;
                }
                Object[] objArray = new Object[i1];
                g.D().w("AICutAnnualMemoryProject", "generateChangeTemplateDurationInfo: targetClipDurationList"+' '+uArrayList.size(), objArray);
             label_00ca :
                obj.setClipDurations(uArrayList);
             }
          }
          uArrayList = null;
          goto label_00ca ;
       }
       return a.a.q(obj);
    }
    public SmartEditResult G0(VideoTemplate p0){
       o2 obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "template");
       if (this.Z0() == Workspace$Source.ANNUAL_ALBUM_2022) {
          return null;
       }
       obj = this.Y().get(p0.getId());
       SmartEditResult smartEditRes = (obj != null)? obj.a(): null;
       if (smartEditRes != null) {
          return null;
       }else {
          return super.G0(p0);
       }
    }
    public AICutMusicInfo H(AICutStyle p0){
       TemplateMusic obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "st");
       obj = this.U0(p0);
       if (obj == null) {
          return u0.a();
       }
       TemplateMusic mMusic = obj.mMusic;
       a.o(mMusic, "it.mMusic");
       AICutMusicInfo uAICutMusicI = t.a.a(mMusic);
       String id = p0.getId();
       a.o(id, "st.id");
       this.a1(id, uAICutMusicI, obj.mClipPoint);
       return uAICutMusicI;
    }
    public t O0(KwaiAICutStyle p0,n2 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AICutAnnualMemoryProject.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "style");
       a.p(p1, "startStatusData");
       t ot = super.O0(p0, p1).observeOn(d.c).flatMap(new AICutAnnualMemoryProject$p(this, p0));
       a.o(ot, "super.observableDownload¡­t\(downloadTask\)\n        }");
       return ot;
    }
    public t P0(String p0,List p1,List p2,String p3,boolean p4,boolean p5){
       t ot;
       if (PatchProxy.isSupport(AICutAnnualMemoryProject.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          p0 = PatchProxy.apply(objArray, this, AICutAnnualMemoryProject.class, "7");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       a.p(p1, "recommendFlashIds");
       a.p(p2, "recommendAiCutIds");
       a.p(p3, "currentSelectedTemplateId");
       Object[] objArray1 = new Object[0];
       g.D().w("AICutAnnualMemoryProject", "observableGetTemplates mPreSelectThemeId="+this.S(), objArray1);
       if (this.M0() == null) {
          objArray1 = Collections.singletonList(this.S());
          a.o(objArray1, "Collections.singletonList\(mPreSelectThemeId\)");
          ot = d.b.a().a(this.Z0(), objArray1, 0);
       }else {
          ot = t.just(this.M0());
       }
       ot = ot.map(new AICutAnnualMemoryProject$q(this));
       a.o(ot, "observable\n        .map ¡­ingInitTemplate\n        }");
       return ot;
    }
    public final TemplateMusic U0(KwaiAICutStyle p0){
       KwaiAICutStyle$KWaiAiCutMusic mFastTemplat;
       AICutAnnualMemoryProject obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e0;
       TemplateMusic templateMusi = null;
       if (obj != null) {
          if (obj != 1) {
             p0 = p0.mTemplateMusic;
             if (p0 != null) {
                mFastTemplat = p0.mFastTemplateMusic;
                if (mFastTemplat != null) {
                   templateMusi = CollectionsKt___CollectionsKt.v4(mFastTemplat, e.b);
                }
             }
          }else {
             p0 = p0.mTemplateMusic;
             if (p0 != null) {
                mFastTemplat = p0.mMidTemplateMusic;
                if (mFastTemplat != null) {
                   templateMusi = CollectionsKt___CollectionsKt.v4(mFastTemplat, e.b);
                }
             }
          }
       }else {
          p0 = p0.mTemplateMusic;
          if (p0 != null) {
             mFastTemplat = p0.mSlowTemplateMusic;
             if (mFastTemplat != null) {
                templateMusi = CollectionsKt___CollectionsKt.v4(mFastTemplat, e.b);
             }
          }
       }
       return templateMusi;
    }
    public final MemorySceneType V0(){
       return this.g0;
    }
    public final ArrayList W0(){
       return this.f0;
    }
    public final void X0(){
       int i;
       if (PatchProxy.applyVoid(null, this, AICutAnnualMemoryProject.class, "3")) {
          return;
       }
       if (this.M().size() < 10) {
          i = 0;
       }else if(this.M().size() >= 18){
          i = 2;
       }else {
          i = 1;
       }
       this.e0 = i;
       return;
    }
    public final void Y0(VideoTemplate p0,KwaiAICutStyle p1){
       Iterator iterator;
       Object[] obj1;
       String str;
       Object[] objArray2;
       List list1;
       StringBuilder obj2;
       Iterator key;
       AICutAnnualMemoryProject uAICutAnnual1;
       double d;
       long l;
       int i3;
       ClipMvUtils$CropResourceInfo path;
       QMedia obj4;
       h obj5;
       int i4;
       b obj6;
       double d1;
       Iterator iterator8;
       int i6;
       List list3;
       QMedia duration;
       int i7;
       KwaiAICutStyle mStartEndInf;
       KwaiAICutStyle$OpenEndInfo mFastStartEn;
       ArrayList uArrayList5;
       int i8;
       b uob2;
       b uob4;
       boolean b = this;
       AICutAnnualMemoryProject$a obj = p1;
       AICutAnnualMemoryProject uAICutAnnual = AICutAnnualMemoryProject.class;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, b, uAICutAnnual, "13")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(b.f0);
       char c = ' ';
       int i = 1;
       int i1 = 0;
       if (this.Z0() == Workspace$Source.ANNUAL_ALBUM_2022) {
          if (b.a0 == null && (b.Z.isEmpty() ^ i)) {
             Object[] objArray = new Object[i1];
             g.D().w("AICutAnnualMemoryProject", "applyKSTemplate: replace extraKsMedias start", objArray);
             iterator = b.f0.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob.d() != KSMemoryClipType.COMMON) {
                   continue ;
                }else {
                   QMedia qMedia = CollectionsKt___CollectionsKt.m2(uob.e());
                   Iterator iterator1 = b.Z.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj1 = iterator1.next();
                         QMedia mAlbum = CollectionsKt___CollectionsKt.m2(obj1.e()).mAlbum;
                         a.o(mAlbum, "newKsMedia.mMedias.first\(\).mAlbum");
                         i = 11;
                         QMedia mAlbum1 = qMedia.mAlbum;
                         a.o(mAlbum1, "oldMedia.mAlbum");
                         if (a.g(StringsKt___StringsKt.D8(mAlbum, i), StringsKt___StringsKt.D8(mAlbum1, i))) {
                         label_00a3 :
                            if (obj1 != null) {
                               List list = obj1.e();
                               if (!PatchProxy.applyVoidOneRefs(list, uob, b.class, "2")) {
                                  a.p(list, "<set-?>");
                                  uob.a = list;
                               }
                               Object[] objArray1 = new Object[0];
                               g.D().w("AICutAnnualMemoryProject", "applyKSTemplate: replace a ksMedia ="+c+CollectionsKt___CollectionsKt.m2(obj1.e()).path, objArray1);
                            }else {
                               i = 0;
                            }
                            str = null;
                         }else {
                            str = null;
                         }
                      }else {
                         obj1 = null;
                         goto label_00a3 ;
                      }
                   }
                }
             }
             b.b1(null);
             b.a0 = true;
             uArrayList.clear();
             uArrayList.addAll(b.f0);
             objArray = new Object[0];
             g.D().w("AICutAnnualMemoryProject", "applyKSTemplate: replace extraKsMedias end", objArray);
          }
          y.K0(uArrayList, AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2.INSTANCE);
          AICutAnnualMemoryProject$a uoa = b.b0.get(p0.getId());
          if (uoa != null) {
             c uoc = uoa.b();
             if (uoc != null) {
                c e = uoc.e;
                if (e != null) {
                   e.f(null);
                   uArrayList.add(0, e);
                   objArray2 = new Object[0];
                   g.D().w("AICutAnnualMemoryProject", "applyKSTemplate: replace start", objArray2);
                }
                uoc = uoc.f;
                list1 = null;
                if (uoc != null) {
                   uoc.f(list1);
                   uArrayList.add(uoc);
                   objArray2 = new Object[0];
                   g.D().w("AICutAnnualMemoryProject", "applyKSTemplate: replace end", objArray2);
                }
             }else {
             label_0150 :
                obj5 = null;
             }
          }else {
             goto label_0150 ;
          }
          KSMemoryClipType kSMemoryClip = 1;
       }else {
          obj5 = 0;
          AICutAnnualMemoryProject e0 = b.e0;
          if (e0 != null) {
             if (e0 != 1) {
                mStartEndInf = obj.mStartEndInfo;
                if (mStartEndInf != null) {
                   mFastStartEn = mStartEndInf.mFastStartEndInfo;
                }else {
                label_0171 :
                   mFastStartEn = obj5;
                }
             }else {
                mStartEndInf = obj.mStartEndInfo;
                if (mStartEndInf != null) {
                   mFastStartEn = mStartEndInf.mMidStartEndInfo;
                }else {
                   goto label_0171 ;
                }
             }
          }else {
             mStartEndInf = obj.mStartEndInfo;
             if (mStartEndInf != null) {
                mFastStartEn = mStartEndInf.mSlowStartEndInfo;
             }else {
                goto label_0171 ;
             }
          }
          KwaiAICutStyle$StartEndInfo mOpeningClip = (mFastStartEn != null)? mFastStartEn.mOpeningClipCount: 0;
          KwaiAICutStyle$StartEndInfo mEndingClipC = (mFastStartEn != null)? mFastStartEn.mEndingClipCount: 0;
          i = a.t().a("openingEndingMinCount", 3);
          obj1 = new Object[0];
          g.D().w("AICutAnnualMemoryProject", "initStartEndAssetAndMusicClip: local "+mOpeningClip+','+mEndingClipC+','+i, obj1);
          ArrayList uArrayList2 = new ArrayList();
          ArrayList uArrayList3 = new ArrayList();
          key = b.Y.iterator();
          while (key.hasNext()) {
             Object obj7 = key.next();
             List list4 = (obj7.e().size() == 1)? 1: null;
             if (list4) {
                uArrayList3.add(obj7);
             }
             obj5 = 0;
          }
          ArrayList uArrayList4 = new ArrayList(uArrayList3);
          i7 = uArrayList3.size();
          if (1 <= mOpeningClip && i7 >= mOpeningClip) {
             uArrayList5 = new ArrayList();
             i8 = 0;
             while (i8 < mOpeningClip) {
                obj6 = CollectionsKt___CollectionsKt.Y2(uArrayList4);
                uArrayList4.remove(obj6);
                uArrayList5.addAll(obj6.e());
                i8 = i8 + 1;
                obj6 = 32;
             }
             uob4 = new b(uArrayList5, null, KSMemoryClipType.OPENING, 0, 8, null);
             uArrayList2.add(c);
          }else if(mOpeningClip > 0 && i7 >= i){
             uArrayList5 = new ArrayList();
             i4 = 0;
             while (i4 < mOpeningClip) {
                i8 = i4 % uArrayList3.size();
                uArrayList5.addAll(0, uArrayList3.get(i8).e());
                i4 = i4 + 1;
                int i9 = p0;
             }
             uob2 = new b(uArrayList5, null, KSMemoryClipType.OPENING, 0, 8, null);
             uArrayList2.add(v4);
          }
          uArrayList2.addAll(b.Y);
          uArrayList4.clear();
          uArrayList4.addAll(uArrayList3);
          if (1 <= mEndingClipC && i7 >= mEndingClipC) {
             uArrayList5 = new ArrayList();
             for (i4 = 0; i4 < mEndingClipC; i4 = i4 + 1) {
                b uob3 = CollectionsKt___CollectionsKt.m2(uArrayList4);
                uArrayList4.remove(uob3);
                uArrayList5.addAll(uob3.e());
             }
             uob4 = new b(uArrayList5, null, KSMemoryClipType.ENDING, 0, 8, null);
             uArrayList2.add(mEndingClipC);
          }else if(mEndingClipC > 0 && i7 >= i){
             uArrayList5 = new ArrayList();
             for (i4 = 0; i4 < mEndingClipC; i4 = i4 + 1) {
                int i10 = i4 % uArrayList3.size();
                uArrayList5.addAll(uArrayList3.get(i10).e());
             }
             uob2 = new b(uArrayList5, null, KSMemoryClipType.ENDING, 0, 8, null);
             uArrayList2.add(mEndingClipC);
          }
          uArrayList.clear();
          uArrayList.addAll(uArrayList2);
       }
       AICutStyle mLocalDir = obj.mLocalDir;
       String str1 = "style.mLocalDir";
       a.o(mLocalDir, str1);
       d.a(-1595266550).KW(uArrayList, mLocalDir);
       AICutStyle mLocalDir1 = obj.mLocalDir;
       a.o(mLocalDir1, str1);
       d.a(-1595266550).O8(uArrayList, mLocalDir1);
       SmartEditResult smartEditRes = this.G0(p0);
       if (smartEditRes != null) {
          Map mediaAnalyze = smartEditRes.getMediaAnalyzeResults();
          if (mediaAnalyze != null) {
             iterator = mediaAnalyze.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Iterator iterator2 = this.M().iterator();
                while (true) {
                   String str2 = "mapEntry.key";
                   if (iterator2.hasNext()) {
                      obj2 = iterator2.next();
                      key = uEntry.getKey();
                      a.o(key, str2);
                      if (!a.g(key.getFileName(), obj2.path)) {
                         continue ;
                      }
                   }else {
                      obj2 = 0;
                   }
                   float f = 1000.00f;
                   str = "mapEntry.value";
                   if (obj2 != null) {
                      key = uEntry.getValue();
                      a.o(key, str);
                      float f1 = key.getClipStartTime() * f;
                      obj2.mClipStart = (long)f1;
                   }
                   if (obj2) {
                      key = uEntry.getValue();
                      a.o(key, str);
                      float f2 = key.getClipDuration() * f;
                      obj2.setClipDuration((long)f2);
                   }
                   g og = g.D();
                   Long key1 = uEntry.getKey();
                   a.o(key1, str2);
                   str = "initStartEndAssetAndMusicClip: set media clip path ="+' '+key1.getFileName()+" , start=";
                   key1 = (obj2)? Long.valueOf(obj2.mClipStart): null;
                   str = str+key1+" ,"+" duration = ";
                   key1 = (obj2)? Long.valueOf(obj2.getClipDuration()): null;
                   objArray2 = new Object[0];
                   og.w("AICutAnnualMemoryProject", str+key1, objArray2);
                }
             }
          }
       }
       obj = b.b0.get(p1.getId());
       list1 = (obj != null)? obj.a(): null;
       str = 1000;
       if (!PatchProxy.applyVoidTwoRefs(list1, uArrayList, b, uAICutAnnual, "15")) {
          Iterator iterator6 = uArrayList.iterator();
          i3 = 0;
          while (iterator6.hasNext()) {
             obj6 = iterator6.next();
             int i5 = i3 + 1;
             if (i3 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj6.d() == KSMemoryClipType.ENDING) {
                d1 = 8.00f;
             }else if(list1 == null || list1.isEmpty()){
                i7 = 1;
             }else {
                i7 = 0;
             }
             if (i7) {
                d1 = 3.00f;
             }else {
                i7 = i3 % list1.size();
                d1 = list1.get(i7).doubleValue();
             }
             Iterator iterator7 = obj6.e().iterator();
             while (iterator7.hasNext()) {
                long l1 = iterator7.next();
                if (obj6.d() != KSMemoryClipType.COMMON) {
                   iterator8 = iterator6;
                   uAICutAnnual1 = uAICutAnnual;
                   i6 = i3;
                   list3 = list1;
                }else {
                   double d2 = (double)str;
                   double d3 = d1 * d2;
                   l1.mClipDuration = (long)d3;
                   if (!l1.isImage()) {
                      duration = l1.duration;
                      iterator8 = iterator6;
                      uAICutAnnual1 = uAICutAnnual;
                      if (duration - null > 0) {
                         QMedia mClipDuratio = l1.mClipDuration;
                         if (mClipDuratio - duration > 0) {
                            i6 = i3;
                            list3 = list1;
                            l1.mClipStart = 0;
                            l1.mClipDuration = duration;
                            double d4 = (double)duration * 0x3ff0000000000000;
                            d4 = d4 / d2;
                            d1 = q.s(d1, d4);
                         }else {
                            i6 = i3;
                            list3 = list1;
                            long l2 = l1.mClipStart + mClipDuratio;
                            if (l2 - duration > 0) {
                               l = duration - mClipDuratio;
                               l1.mClipStart = l;
                            }
                         }
                      }
                   }else {
                      iterator8 = iterator6;
                      uAICutAnnual1 = uAICutAnnual;
                   }
                   i6 = i3;
                   list3 = list1;
                   l1.mClipDuration = q.v(l1.mClipDuration, 4000);
                }
                uAICutAnnual = uAICutAnnual1;
                iterator6 = iterator8;
                list1 = list3;
                i3 = i6;
                l = 1000;
             }
             obj6.d = d1;
             Object[] objArray5 = new Object[0];
             g.D().w("AICutAnnualMemoryProject", "fillClipDurationByMusic: index="+i3+",clipDuration="+d1, objArray5);
             i3 = i5;
             uAICutAnnual = uAICutAnnual;
             iterator6 = iterator6;
             l = 1000;
          }
       }
       uAICutAnnual1 = uAICutAnnual;
       b.b1(uArrayList);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, b, uAICutAnnual1, "12") && this.Z0() != Workspace$Source.ANNUAL_ALBUM_2022) {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator3 = uArrayList.iterator();
          while (iterator3.hasNext()) {
             b uob1 = iterator3.next();
             if (uob1.d() == KSMemoryClipType.OPENING || uob1.d() == KSMemoryClipType.ENDING) {
                Iterator iterator4 = uob1.e().iterator();
                while (iterator4.hasNext()) {
                   QMedia qMedia1 = iterator4.next();
                   ClipMvUtils$CropResourceInfo uCropResourc = new ClipMvUtils$CropResourceInfo();
                   uCropResourc.path = qMedia1.path;
                   uCropResourc.centerX = (double)qMedia1.mExportPositionX;
                   uCropResourc.centerY = (double)qMedia1.mExportPositionY;
                   uCropResourc.height = qMedia1.getHeight();
                   uCropResourc.width = qMedia1.getWidth();
                   if (!TextUtils.x(qMedia1.mExportFilePath)) {
                      uCropResourc.path = qMedia1.mExportFilePath;
                      uCropResourc.width = qMedia1.mExportWidth;
                      uCropResourc.height = qMedia1.mExportHeight;
                   }
                   EditorSdk2$Rational rational = new EditorSdk2$Rational();
                   rational.setNum((long)9);
                   rational.setDen((long)16);
                   uCropResourc.ratio = rational;
                   if (qMedia1.isVideo()) {
                      Integer integer = b.d0.get(qMedia1.path);
                      if (integer == null) {
                         integer = Integer.valueOf(0);
                      }
                      d = (double)integer.intValue() * 0x3ff0000000000000;
                      d = d / (double)1000;
                      uCropResourc.framePos = d;
                   }else {
                      l = 1000;
                   }
                   uArrayList1.add(uCropResourc);
                }
             }else {
                continue ;
             }
          }
          if (uArrayList1.isEmpty()) {
             Object[] objArray3 = new Object[0];
             g.D().w("AICutAnnualMemoryProject", "fetchFrameForOpeningEnding: no need", objArray3);
          }else {
             File uFile = PostUtils.p(".video_cache");
             a.o(uFile, "PostUtils.getSubCacheDir\(DIR_CACHE_VIDEO_CACHE\)");
             List croppedResou = ClipMvUtils.getCroppedResource(uArrayList1, uFile.getAbsolutePath());
             if (croppedResou != null) {
                iterator3 = croppedResou.iterator();
                int i2 = 0;
                while (iterator3.hasNext()) {
                   Object obj3 = iterator3.next();
                   i3 = i2 + 1;
                   if (i2 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (i2 >= uArrayList1.size()) {
                      Object[] objArray4 = new Object[0];
                      g.D().A("AICutAnnualMemoryProject", "fetchFrameForOpeningEnding:  index >= inputResources.size "+"index="+i2+", inputResources.size="+uArrayList1.size(), objArray4);
                      break ;
                   }else {
                      path = uArrayList1.get(i2).path;
                      Iterator iterator5 = this.M().iterator();
                      while (true) {
                         if (iterator5.hasNext()) {
                            obj4 = iterator5.next();
                            obj2 = obj4;
                            obj2 = (a.g(obj2.path, path) || a.g(obj2.mExportFilePath, path))? 1: null;
                            if (obj2) {
                               obj5 = obj4;
                            }else {
                               continue ;
                            }
                         }else {
                            obj5 = null;
                         }
                         if (obj5 != null) {
                            objArray2 = new Object[0];
                            g.D().w("AICutAnnualMemoryProject", "fetchFrameForOpeningEnding: inputPath="+path, objArray2);
                            obj4 = obj5.mVideoFrameList;
                            if (obj4 == null) {
                               List list2 = CollectionsKt__CollectionsKt.E();
                            }
                            uArrayList = new ArrayList(obj4);
                            if (uArrayList.size() >= 2) {
                               i4 = 0;
                               uArrayList.remove(i4);
                            }else {
                               i4 = 0;
                            }
                            if (new File(obj3.path).exists()) {
                               uArrayList.add(i4, obj3.path);
                               objArray2 = new Object[i4];
                               g.D().w("AICutAnnualMemoryProject", "fetchFrameForOpeningEnding: outPutPath="+obj3.path, objArray2);
                            }else {
                               objArray2 = new Object[i4];
                               g.D().A("AICutAnnualMemoryProject", "fetchFrameForOpeningEnding: no  "+obj3.path, objArray2);
                            }
                            obj5.mVideoFrameList = uArrayList;
                         }else {
                            i4 = false;
                         }
                         i2 = i3;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final Workspace$Source Z0(){
       o obj = PatchProxy.apply(null, this, AICutAnnualMemoryProject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.f.d();
       a.m(obj);
       return obj.e();
    }
    public final void a1(String p0,AICutMusicInfo p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AICutAnnualMemoryProject.class, "22")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.D().w("AICutAnnualMemoryProject", "updateStatus\(\) called with: id = "+p0+", musicInfo = "+p1+','+" clipPoint = "+p2, objArray);
       o2 oo2 = this.Y().get(p0);
       if (oo2 == null) {
          oo2 = new o2(null, 1, null);
       }
       oo2.e(p1);
       this.Y().put(p0, oo2);
       AICutAnnualMemoryProject$a uoa = this.b0.get(p0);
       if (uoa == null) {
          uoa = new AICutAnnualMemoryProject$a(null, null, 3, null);
       }
       a.o(uoa, "templateStatusMap[id] ?: TemplateStatus\(\)");
       uoa.a = p2;
       this.b0.put(p0, uoa);
       return;
    }
    public final void b1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject.class, "14")) {
          return;
       }
       g og = g.D();
       StringBuilder str = "updateTemplateMedias\(\) called with: tmpList = ";
       Integer integer = (p0 != null)? Integer.valueOf(p0.size()): null;
       Object[] objArray = new Object[0];
       og.w("AICutAnnualMemoryProject", str+integer, objArray);
       if (p0 != null) {
          this.f0.clear();
          this.f0.addAll(p0);
       }
       p0 = this.M();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yxcorp.gifshow.models.QMedia>");
       s0.g(p0).clear();
       Iterator iterator = this.f0.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob.d() != KSMemoryClipType.OPENING && uob.d() != KSMemoryClipType.ENDING) {
             List list = this.M();
             Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yxcorp.gifshow.models.QMedia>");
             s0.g(list).addAll(uob.e());
          }
       }
       return;
    }
    public t e0(String p0,String p1,n2 p2){
       t ot;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AICutAnnualMemoryProject.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "styleId");
       a.p(p1, "musicId");
       a.p(p2, "startStatusData");
       if (this.Z0() == Workspace$Source.ANNUAL_ALBUM_2022) {
          g1 og1 = new g1("");
          EditorSmartClipResult uEditorSmart = new EditorSmartClipResult();
          uEditorSmart.setProject(new EditorSdk2V2$VideoEditorProject());
          og1.g(uEditorSmart);
          ot = t.just(og1).map(new AICutAnnualMemoryProject$m(this, p2));
          a.o(ot, "Observable.just\(AICutSdk¡­ess\) }\n        it\n      }");
          return ot;
       }else {
          ot = super.e0(p0, p1, p2).observeOn(d.c).doOnNext(new AICutAnnualMemoryProject$n(this)).doOnError(new AICutAnnualMemoryProject$o(this));
          a.o(ot, "super.observableAnalyze\(¡­\(\)\n          \)\)\n        }");
          return ot;
       }
    }
    public t h0(String p0,String p1,n2 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AICutAnnualMemoryProject.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "styleId");
       a.p(p1, "musicId");
       a.p(p2, "startStatusData");
       t ot = super.h0(p0, p1, p2).observeOn(d.c).doOnNext(new AICutAnnualMemoryProject$r(this));
       a.o(ot, "super.observableSDKAnaly¡­  }\n          }\n        }");
       return ot;
    }
    public t i0(n2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "startStatusData");
       t ot = t.fromCallable(new AICutAnnualMemoryProject$s(this, p0)).subscribeOn(d.a).flatMap(new AICutAnnualMemoryProject$t(this, p0));
       a.o(ot, "Observable.fromCallable ¡­de\(startStatusData\)\n    }");
       return ot;
    }
    public boolean isAnnualAlbum(){
       return true;
    }
}
