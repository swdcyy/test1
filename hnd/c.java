package hnd.c;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import wmd.i;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tvc.a;
import tvc.e;
import xvc.b;
import zmd.a;
import xld.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import wnd.h;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleInitAction;
import hnd.c$a;
import java.lang.Runnable;
import ekd.k1;
import wmd.g;
import crd.a;
import hnd.c$b;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import hnd.c$c;
import erd.g;
import crd.b;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontDelayChangeActionV3;
import bod.a;
import hnd.c$d;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRetryAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAttachAction;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import mod.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import android.os.SystemClock;
import wmd.c;
import java.lang.Double;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import kotlin.Pair;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import lba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.OriginalVoice;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import yaa.c;
import prc.b;
import uba.d;
import com.kuaishou.edit.draft.KuaishanAsset;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xmd.a;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.TimeRange;
import xmd.j;
import com.kuaishou.edit.draft.Asset;
import java.lang.Math;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.ImportMusicParam;
import com.kuaishou.edit.draft.Song;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam;
import qkd.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.repo.SubtitleRepoUtils;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.Arrays;
import brd.w;
import wmd.d;
import erd.o;
import wmd.e;
import wmd.o;
import erd.r;
import wmd.y;
import hnd.c$e;
import hnd.c$f;
import hnd.c$g;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleCancelAction;
import vmd.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachActionV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleReleaseAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationHandlerAdjustAction;
import wyc.c$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import wyc.c;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationScaleProcessAction;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessAction;

public final class c extends DecorationMiddleware	// class@000f98
{
    public b e;
    public long f;
    public long g;
    public boolean h;
    public final TextTemplateRepo i;
    public final i j;
    public final TextFontRepoV3 k;
    public final TextTemplateRepoV3 l;
    public final PreviewPlayer m;

    public void c(TextTemplateRepo p0,i p1,TextFontRepoV3 p2,TextTemplateRepoV3 p3,PreviewPlayer p4){
       a.p(p0, "templateRepo");
       a.p(p1, "subtitleRepo");
       a.p(p2, "fontRepo");
       a.p(p3, "designTemplateRepoV3");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.g = 10;
    }
    public e b(a p0,e p1){
       return this.h(p0, p1);
    }
    public a d(b p0,a p1){
       return this.h(p0, p1);
    }
    public a h(b p0,a p1){
       ArrayList uArrayList;
       double d;
       t ot;
       a uoa;
       c e;
       boolean b;
       ArrayList uArrayList2;
       String str3;
       double d2;
       z c;
       Iterator iterator;
       List list;
       String str4;
       Iterator iterator1;
       Iterator iterator2;
       String audioAssetPa;
       String str6;
       TimeRange clippedRange;
       String str7;
       TimeRange selectedRang;
       int i4;
       int i6;
       String file;
       c uoc4;
       ImportMusicParam importParam;
       Song song;
       OnlineMusicParam onlineParam;
       Object obj4;
       Minecraft$PropertyKeyFrame[] propertyKeyF;
       c$a uoa8;
       long l = this;
       g obj = p0;
       Object[] obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, l, uoc, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj, "action");
       a.p(obj1, "oldState");
       String str = "";
       String str1 = "4";
       int i = 1;
       if (!obj instanceof EditDraftAction || (l.h == null || (!PostExperimentUtils.G((p1.u() ^ i)) && !PatchProxy.applyVoidOneRefs(obj1, l, uoc, str1)))) {
          Iterator iterator3 = p1.i().iterator();
          while (iterator3.hasNext()) {
             NewTextBaseElementData newTextBaseE1 = iterator3.next();
             Objects.requireNonNull(newTextBaseE1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData");
             NewTextBaseElementData newTextBaseE2 = newTextBaseE1;
             if (l.i.h(newTextBaseE1.G0().j())) {
                DraftTextStyleInfo uDraftTextSt1 = h.o();
                newTextBaseE1.O0(DraftTextStyleInfo.a(newTextBaseE1.G0(), uDraftTextSt1.j(), 0, 0, 0, uDraftTextSt1.f(), uDraftTextSt1.e(), 0, 0, null, null, null, 1998, null));
             }
             file = newTextBaseE1.G0().j();
             newTextBaseE2.W0(l.i.c(file));
             String str9 = l.i.d(file);
             if (str9 == null) {
                str9 = str;
             }
             newTextBaseE2.Y0(str9);
             newTextBaseE2.Z0(l.i.g(file));
             newTextBaseE2.b1(newTextBaseE2);
             newTextBaseE1.K0(l.i.e(file));
          }
       }
    label_00cc :
       super.d(p0, p1);
       if (obj instanceof SubtitleInitAction) {
          if (PostExperimentUtils.G((p1.u() ^ i))) {
             k1.r(new c$a(l), l.g);
          }else {
             l.j.e().f();
             this.c().c(t.create(new c$b(l)).subscribeOn(d.c).observeOn(d.a).subscribe(new c$c(l)));
          }
       }else {
          long l1 = 0;
          if (obj instanceof TextDesignFontDelayChangeActionV3) {
             k1.r(new c$d(l, obj, l.k.c(obj.getLastFontFileName())), l1);
          }else {
             obj2 = "3";
             Object[] objArray = null;
             if (obj instanceof SubtitleClearAction || obj instanceof SubtitleClearActionV3) {
                obj = l.j.e();
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoid(objArray, obj, g.class, obj2)) {
                   obj.b = new ArrayList();
                   obj.a = objArray;
                   obj.d = objArray;
                }
                return obj1;
             }else {
                int i1 = 0;
                if (obj instanceof SubtitleRetryAction || obj instanceof SubtitleAttachAction) {
                   if (!l.j.e().e() && (!l.j.e().d() && (!(p1.i().isEmpty() ^ i) && (p1.A() == SubtitleStatus.NO_RESULT || p1.A() == SubtitleStatus.NO_RESULT_MUTE)))) {
                      l.j.e().f();
                      if (p1.A() == SubtitleStatus.NO_RESULT || p1.A() == SubtitleStatus.NO_RESULT_MUTE) {
                         uArrayList = obj;
                         ArrayList uArrayList1 = new ArrayList();
                         return a.x(p1, null, false, 0, uArrayList, null, 0, null, null, false, 0, false, null, 0, 8183, null);
                      }else {
                         NewTextBaseElementData newTextBaseE = h.l(p1.i(), p1.i().get(i1).l0());
                         DraftTextStyleInfo uDraftTextSt = (newTextBaseE != null && newTextBaseE instanceof NewTextElementV3Data)? newTextBaseE.G0(): objArray;
                         return a.x(p1, null, false, 0, null, null, uDraftTextSt, null, null, false, 0, false, null, false, 8159, null);
                      }
                   }else if(!p0.C(a.b())){
                      return a.x(p1, null, false, 0, null, null, null, SubtitleStatus.NO_NETWORK, null, false, 0, false, null, false, 8127, null);
                   }else {
                      l.f = SystemClock.elapsedRealtime();
                      uoc = l.j;
                      d = p1.n();
                      a f = p1.F;
                      Objects.requireNonNull(uoc);
                      c uoc1 = c.class;
                      i oi = i.class;
                      if (PatchProxy.isSupport(oi)) {
                         ot = PatchProxy.applyTwoRefs(Double.valueOf(d), f, uoc, oi, "2");
                         if (ot != patchProxyRe) {
                         }else {
                         label_0269 :
                            String str2 = "SubtitleRepo";
                            a.f.a().b(PostCommonBiz.EDIT, str2, "uploadAudioAndRecognize");
                            uoc.g = SystemClock.elapsedRealtime();
                            uoc.d.b = d;
                            if (!uoc.f.d() && (!uoc.f.e() && (uoc.f.a().isEmpty() ^ 1))) {
                               ot = t.just(new Pair(SubtitleStatus.SUCCESS, uoc.f.a()));
                               a.o(ot, "Observable.just\(\n       ¡­eList\(\)\n        \)\n      \)");
                            }else {
                               i d1 = uoc.d;
                               Objects.requireNonNull(d1);
                               ArrayList uArrayList3 = PatchProxy.applyOneRefs(f, d1, uoc1, obj2);
                               if (uArrayList3 != patchProxyRe) {
                                  str3 = str1;
                                  d2 = d;
                               }else {
                                  uArrayList3 = new ArrayList();
                                  a uoa2 = d1.a.o0();
                                  a uoa3 = d1.a.o0();
                                  if (uoa3 != null) {
                                     list = uoa3.z();
                                     str4 = str;
                                  }else {
                                     str4 = str;
                                     list = null;
                                  }
                                  uoa = d1.a.g1();
                                  OriginalVoice originalVoic = (uoa != null)? uoa.v(): null;
                                  a uoa4 = d1.a.F0();
                                  Kuaishan kuaishan = (uoa4 != null)? uoa4.v(): null;
                                  String str5 = "asset";
                                  if (kuaishan != null) {
                                     Kuaishan kuaishan1 = kuaishan;
                                     kuaishan = (b.a(d1.a.J0()) ^ 0x01)? kuaishan1: null;
                                     if (kuaishan != null) {
                                        List list1 = d.a(kuaishan.getAssetsList());
                                        a.o(list1, "getFlatKuaiShanAsset\(k.assetsList\)");
                                        iterator1 = list1.iterator();
                                        while (iterator1.hasNext()) {
                                           KuaishanAsset kuaishanAsse = iterator1.next();
                                           a.o(kuaishanAsse, str5);
                                           if (!TextUtils.x(kuaishanAsse.getAudioAssetPath())) {
                                              iterator2 = iterator1;
                                              uoa4 = new a();
                                              d2 = d;
                                              audioAssetPa = kuaishanAsse.getAudioAssetPath();
                                              a.o(audioAssetPa, "asset.audioAssetPath");
                                              uoa4.h(audioAssetPa);
                                              StickerResult result = kuaishanAsse.getResult();
                                              str6 = "asset.result";
                                              a.o(result, str6);
                                              clippedRange = result.getClippedRange();
                                              str3 = str1;
                                              a.o(clippedRange, "asset.result.clippedRange");
                                              str7 = str2;
                                              uoa4.j(clippedRange.getStart());
                                              StickerResult result1 = kuaishanAsse.getResult();
                                              a.o(result1, str6);
                                              TimeRange clippedRange1 = result1.getClippedRange();
                                              a.o(clippedRange1, "asset.result.clippedRange");
                                              uoa4.g(clippedRange1.getDuration());
                                              uoa4.i(5);
                                              str1 = uoa4.c();
                                              int i3 = TextUtils.x(str1) ^ 1;
                                              if (!i3) {
                                                 str1 = null;
                                              }
                                              if (str1 != null) {
                                                 uArrayList3.add(uoa4);
                                              }
                                           }else {
                                              iterator2 = iterator1;
                                              str3 = str1;
                                              str7 = str2;
                                              d2 = d;
                                           }
                                           iterator1 = iterator2;
                                           d = d2;
                                           str1 = str3;
                                           str2 = str7;
                                        }
                                     }
                                  }
                                  str3 = str1;
                                  str7 = str2;
                                  d2 = d;
                                  double d5 = 0;
                                  if (f != null) {
                                     iterator1 = f.iterator();
                                     while (iterator1.hasNext()) {
                                        j oj = iterator1.next();
                                        if (!TextUtils.x(oj.b()) && oj.d - d5) {
                                           a uoa5 = new a();
                                           uoa5.h(oj.b());
                                           uoa5.j(oj.b);
                                           c b2 = (!oj.a() - d5)? d1.b: oj.a();
                                           uoa5.g(b2);
                                           uoa5.i(5);
                                           uArrayList3.add(uoa5);
                                        }
                                     }
                                  }
                                  if (uArrayList3.isEmpty() && list != null) {
                                     iterator1 = list.iterator();
                                     while (iterator1.hasNext()) {
                                        Asset uAsset = iterator1.next();
                                        a uoa6 = new a();
                                        if (originalVoic != null) {
                                           if (!originalVoic.getMuteTrackAssets() && !originalVoic.getEditMuteTrackAsset()) {
                                              d = (double)originalVoic.getVolume() - d5;
                                              if (Math.abs(d) - 0x3f747ae147ae147b < 0) {
                                                 continue ;
                                              }
                                           }
                                        }
                                        a.o(uAsset, str5);
                                        File uFile = DraftFileManager.E().B(uAsset.getFile(), uoa2);
                                        if (uFile != null) {
                                           audioAssetPa = uFile.getAbsolutePath();
                                           if (audioAssetPa != null) {
                                           label_046d :
                                              uoa6.h(audioAssetPa);
                                              clippedRange = uAsset.getSelectedRange();
                                              str6 = "asset.selectedRange";
                                              a.o(clippedRange, str6);
                                              uoa6.j(clippedRange.getStart());
                                              selectedRang = uAsset.getSelectedRange();
                                              a.o(selectedRang, str6);
                                              uoa6.g(selectedRang.getDuration());
                                              i4 = 1;
                                              uoa6.i(i4);
                                              String str8 = uoa6.c();
                                              int i5 = TextUtils.x(str8) ^ i4;
                                              if (!i5) {
                                                 str8 = null;
                                              }
                                              if (str8 != null) {
                                                 uArrayList3.add(uoa6);
                                              }
                                              d5 = 0;
                                           }
                                        }
                                        audioAssetPa = str4;
                                        goto label_046d ;
                                     }
                                  }
                                  c uoc3 = d1.a.J0();
                                  e = d1.a.J0();
                                  List list2 = (e != null)? e.z(): null;
                                  if (list2 != null) {
                                     iterator = list2.iterator();
                                     while (iterator.hasNext()) {
                                        Music music = iterator.next();
                                        str1 = "music";
                                        a.o(music, str1);
                                        Music$Type rECORD = Music$Type.RECORD;
                                        if (music.getType() != rECORD && (music.getType() != Music$Type.IMPORT && (music.getType() != Music$Type.MAGIC_EMOJI || (double)music.getVolume() <= 0))) {
                                           continue ;
                                        }else {
                                           a uoa7 = new a();
                                           File uFile1 = DraftFileManager.E().B(music.getFile(), uoc3);
                                           Pair pair = PatchProxy.applyOneRefs(music, d1, uoc1, "6");
                                           if (pair != patchProxyRe) {
                                           }else {
                                              a.p(music, str1);
                                              if (music.getType() == Music$Type.IMPORT) {
                                                 str2 = "music.importParam";
                                                 if (music.getImportParam().hasSelectedRange()) {
                                                    importParam = music.getImportParam();
                                                    a.o(importParam, str2);
                                                    selectedRang = importParam.getSelectedRange();
                                                 }else {
                                                    selectedRang = null;
                                                 }
                                                 if (music.getImportParam().hasSong()) {
                                                    ImportMusicParam importParam1 = music.getImportParam();
                                                    a.o(importParam1, str2);
                                                    song = importParam1.getSong();
                                                 label_05c0 :
                                                    pair = new Pair(selectedRang, song);
                                                 }
                                              }else if(music.getType() == Music$Type.ONLINE){
                                                 str2 = "music.onlineParam";
                                                 if (music.getOnlineParam().hasSelectedRange()) {
                                                    onlineParam = music.getOnlineParam();
                                                    a.o(onlineParam, str2);
                                                    selectedRang = onlineParam.getSelectedRange();
                                                 }else {
                                                    selectedRang = null;
                                                 }
                                                 if (music.getOnlineParam().hasSong()) {
                                                    OnlineMusicParam onlineParam1 = music.getOnlineParam();
                                                    a.o(onlineParam1, str2);
                                                    song = onlineParam1.getSong();
                                                    goto label_05c0 ;
                                                 }
                                              }else if(music.getType() == Music$Type.OPERATION){
                                                 str2 = "music.operationParam";
                                                 if (music.getOperationParam().hasSelectedRange()) {
                                                    OperationMusicParam operationPar = music.getOperationParam();
                                                    a.o(operationPar, str2);
                                                    selectedRang = operationPar.getSelectedRange();
                                                 }else {
                                                    selectedRang = null;
                                                 }
                                                 if (music.getOperationParam().hasSong()) {
                                                    OperationMusicParam operationPar1 = music.getOperationParam();
                                                    a.o(operationPar1, str2);
                                                    song = operationPar1.getSong();
                                                    goto label_05c0 ;
                                                 }
                                              }else {
                                                 selectedRang = null;
                                              }
                                              song = null;
                                              goto label_05c0 ;
                                           }
                                           if (b.S(uFile1)) {
                                              if (uFile1 != null) {
                                                 str1 = uFile1.getAbsolutePath();
                                                 if (str1 != null) {
                                                 label_05d7 :
                                                    uoa7.h(str1);
                                                    uoa7.j(music.getDelay());
                                                    uoa7.g(d1.b);
                                                    i6 = (music.getType() == rECORD)? 2: 3;
                                                    uoa7.i(i6);
                                                 }
                                              }
                                              str1 = str4;
                                              goto label_05d7 ;
                                           }else if(pair.getSecond() != null){
                                              DraftFileManager uDraftFileMa = DraftFileManager.E();
                                              Song second = pair.getSecond();
                                              file = (second != null)? second.getFile(): null;
                                              File uFile2 = uDraftFileMa.B(file, uoc3);
                                              if (uFile2 != null) {
                                                 str1 = uFile2.getAbsolutePath();
                                                 if (str1 != null) {
                                                 label_061d :
                                                    uoa7.h(str1);
                                                    selectedRang = pair.getFirst();
                                                    double start = (selectedRang != null)? selectedRang.getStart(): 0;
                                                    uoa7.j(start);
                                                    selectedRang = pair.getFirst();
                                                    if (selectedRang != null) {
                                                       start = selectedRang.getDuration();
                                                       uoc4 = null;
                                                    }else {
                                                       uoc4 = null;
                                                       start = 0;
                                                    }
                                                    if (start - uoc4 > 0) {
                                                       uoa7.g(Math.min(start, d1.b));
                                                    }else {
                                                       uoa7.g(d1.b);
                                                    }
                                                    i6 = (music.getType() == rECORD)? 2: 3;
                                                    uoa7.i(i6);
                                                 }
                                              }
                                              str1 = str4;
                                              goto label_061d ;
                                           }
                                           str = uoa7.c();
                                           i4 = TextUtils.x(str) ^ 1;
                                           if (!i4) {
                                              str = null;
                                           }
                                           if (str != null) {
                                              uArrayList3.add(uoa7);
                                           }
                                        }
                                     }
                                  }
                                  Object[] objArray1 = new Object[0];
                                  a.D().w(str7, "subtitleList: "+uArrayList3, objArray1);
                               }
                               i d3 = uoc.d;
                               Objects.requireNonNull(d3);
                               uArrayList2 = PatchProxy.applyOneRefs(uArrayList3, d3, uoc1, str3);
                               if (uArrayList2 != patchProxyRe) {
                               }else {
                                  a.p(uArrayList3, "needRecognizedList");
                                  uArrayList2 = new ArrayList();
                                  iterator = uArrayList3.iterator();
                                  while (iterator.hasNext()) {
                                     uoa = iterator.next();
                                     if (uoa.e() != 1) {
                                        if (uoa.e() != 5) {
                                        }
                                     }else {
                                        obj1 = 5;
                                     }
                                     uArrayList2.add(uoa);
                                  }
                               }
                               SubtitleRepoUtils b1 = SubtitleRepoUtils.b;
                               uoa = b1.a(2, uArrayList3);
                               if (uoa == null) {
                                  uoa = new a();
                               }
                               a uoa1 = b1.a(3, uArrayList3);
                               if (uoa1 == null) {
                                  uoa1 = new a();
                               }
                               ArrayList uArrayList4 = new ArrayList();
                               i d4 = uoc.d;
                               Objects.requireNonNull(d4);
                               t ot1 = PatchProxy.applyThreeRefs(uArrayList2, uoa, uoa1, d4, c.class, "1");
                               if (ot1 != patchProxyRe) {
                               }else {
                                  a.p(uArrayList2, "originList");
                                  a.p(uoa, "record");
                                  a.p(uoa1, "local");
                                  Ref$IntRef intRef = new Ref$IntRef();
                                  intRef.element = 0;
                                  a[] uoaArray = new a[0];
                                  obj1 = uArrayList2.toArray(uoaArray);
                                  Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Array<T>");
                                  ot1 = t.concat(t.fromArray(Arrays.copyOf(obj1, obj1.length)), t.just(uoa), t.just(uoa1)).flatMap(new d(d4)).map(new e(d4, intRef, uArrayList2, new ArrayList()));
                                  a.o(ot1, "Observable.concat\(\n     ¡­lt\(it, resultList\)\)\n    }");
                               }
                               c = d.c;
                               y oy = new y(uoc, uArrayList2, uArrayList4, d2);
                               ot = ot1.filter(o.b).observeOn(c).flatMap(d4).subscribeOn(c);
                               a.o(ot, "subtitleAudioUploadHelpe¡­eOn\(KwaiSchedulers.ASYNC\)");
                            }
                         }
                      }else {
                         goto label_0269 ;
                      }
                      c uoc2 = this;
                      uoa = p1;
                      uoc2.e = ot.observeOn(d.a).subscribe(new c$e(uoc2, p0, uoa), new c$f(uoc2));
                      e = uoc2.e;
                      a.m(e);
                      this.c().c(e);
                      if (p1.i().isEmpty() && (!uoc2.j.e().a().isEmpty() || (!uoc2.j.e().e() && (uoc2.j.e().e() || uoc2.j.e().d())))) {
                         b = ((p1.i().isEmpty() ^ 1) && p1.i().get(0).m0() - uoa.D > 0)? true: false;
                         k1.r(new c$g(uoc2, uoa, b), 0);
                         int i2 = (uoc2.j.e().e() || uoc2.j.e().d())? 1: 0;
                         uArrayList = b;
                         uArrayList2 = new ArrayList();
                         return a.x(p1, null, false, 0, uArrayList, null, null, SubtitleStatus.IDLE, null, false, 0, false, null, i2, 4023, null);
                      }else {
                         return uoa;
                      }
                   }
                }else {
                   Object obj3 = obj;
                   if (obj3 instanceof SubtitleCancelAction) {
                      e = l.e;
                      if (e != null) {
                         e.dispose();
                         this.c().a(e);
                      }
                      c.a.g(9, l.f);
                      return p1;
                   }else if(obj3 instanceof SubtitleDetachAction || obj3 instanceof SubtitleDetachActionV3){
                      e = l.e;
                      if (e != null) {
                         e.dispose();
                         this.c().a(e);
                      }
                      return p1;
                   }else if(obj3 instanceof SubtitleReleaseAction){
                      this.f();
                   }else if(obj3 instanceof DecorationHandlerAdjustAction){
                      if (l.m != null && PostExperimentUtils.G((p1.u() ^ 1))) {
                         c.a(l.m, new c$a(null, String.valueOf(obj3.getRangeView().e()), obj3.getStickerResult()));
                      }
                   }else if(obj3 instanceof DecorationScaleProcessAction){
                      if (l.m != null) {
                         obj4 = obj3;
                         if (obj4.getDiffChangeToSdk()) {
                            propertyKeyF = new Minecraft$PropertyKeyFrame[0];
                            uoa8 = new c$a(obj4.getFrames().toArray(propertyKeyF), String.valueOf(obj4.getLayerIndex()), null, 4, null);
                            c.a(l.m, l1);
                         }
                      }
                   }else if(obj3 instanceof DecorationMoveProcessAction && l.m != null){
                      obj4 = obj3;
                      if (obj4.getDiffChangeToSdk()) {
                         propertyKeyF = new Minecraft$PropertyKeyFrame[0];
                         uoa8 = new c$a(obj4.getFrames().toArray(propertyKeyF), String.valueOf(obj4.getLayerIndex()), null, 4, null);
                         c.a(l.m, l1);
                      }
                   }
                }
             }
          }
       }
       return p1;
    }
}
