package hnd.f;
import amd.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import wmd.i;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import xvc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zmd.a;
import java.util.Objects;
import zmd.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xld.a;
import java.util.List;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import nsd.u;
import hnd.c;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import xvc.b;
import tvc.e;
import hnd.d;
import xvc.g;
import hnd.a;
import wnd.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import maa.a;
import lba.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import xod.f;
import jba.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import java.lang.Double;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Integer;
import jod.a;
import com.yxcorp.gifshow.widget.adv.Action$a;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.widget.adv.Action;
import wnd.i;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.OriginalVoice;
import xmd.j;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.TimeRange;
import amd.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;

public final class f extends c	// class@000f9b
{
    public final i l;
    public final TextFontRepoV3 m;
    public final TextTemplateRepoV3 n;

    public void f(TextTemplateRepo p0,i p1,TextFontRepoV3 p2,TextTemplateRepoV3 p3,boolean p4,f p5,VideoSDKPlayerView p6){
       int i = this;
       Object obj = p1;
       Object obj1 = p2;
       Object obj2 = p3;
       a.p(p0, "templateRepo");
       a.p(obj, "subtitleRepo");
       a.p(obj1, "fontRepo");
       a.p(obj2, "designTemplateRepoV3");
       a.p(p5, "editRepo");
       a$a h = a.H;
       Objects.requireNonNull(h);
       Object[] objArray = null;
       c obj3 = PatchProxy.apply(objArray, h, a$a.class, "1");
       a uoa = (obj3 != PatchProxyResult.class)? obj3: new a(null, false, 0, null, null, null, null, null, false, 0, false, null, false, 8191, null);
       PreviewPlayer previewPlaye = (p6 != null)? p6.getPlayer(): objArray;
       obj3 = new c(p0, p1, p2, p3, previewPlaye);
       super(p4, p5, p6, uoa, v12);
       i.l = obj;
       i.m = obj1;
       i.n = obj2;
       return;
    }
    public e v0(b p0,e p1){
       a uoa = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
          uoa = d.a.b(p0, p1);
       }
       return uoa;
    }
    public e w0(g p0,e p1){
       a a;
       String this;
       a uoa3;
       String str4;
       a uoa4;
       Iterator obj4;
       ArrayList uArrayList;
       a obj5;
       int i2;
       a uoa6;
       ImmutableArray immutableArr;
       ImmutableArray immutableArr1;
       Iterator iterator;
       double d1;
       String str6;
       double d3;
       double d6;
       ArrayList uArrayList3;
       Object obj6;
       a obj = p0;
       Object obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, f.class, "2");
       if (obj2 != patchProxyRe) {
       }else {
          String str = "draftState";
          a.p(obj, str);
          obj2 = "oldState";
          a.p(obj1, obj2);
          a = a.a;
          Objects.requireNonNull(a);
          h oh = h.class;
          String obj3 = PatchProxy.applyTwoRefs(obj, obj1, a, a.class, "1");
          if (obj3 != patchProxyRe) {
             obj1 = obj3;
          }else {
             a.p(obj, str);
             a.p(obj1, obj2);
             c uoc = p0.i();
             if (uoc != null) {
                a uoa = uoc.W0();
                if (uoa != null) {
                   a.o(uoa, "workspaceDraft.textDraft ?: return oldState");
                   a uoa1 = uoc.o0();
                   if (uoa1 != null) {
                      a.o(uoa1, "workspaceDraft.assetDraft?: return oldState");
                      a uoa2 = uoc.g1();
                      if (uoa2 != null) {
                         a.o(uoa2, "workspaceDraft.voiceDraft?: return oldState");
                         c uoc1 = p0.i();
                         String str1 = null;
                         Workspace$Type type = (uoc1 != null)? uoc1.a1(): str1;
                         int i = (type == Workspace$Type.PHOTO_MOVIE)? 1: 0;
                         int i1 = i ^ 0x01;
                         String str2 = "workspaceType";
                         obj3 = "textDraft";
                         String str3 = "workspaceDraft.type";
                         if (PostExperimentUtils.G(i1)) {
                            f a1 = f.a;
                            type = uoc.a1();
                            a.o(type, str3);
                            Objects.requireNonNull(a1);
                            Workspace$Type type1 = type;
                            this = obj3;
                            uoa3 = uoa1;
                            str4 = str2;
                            Workspace$Type type2 = type1;
                            uoa4 = uoa2;
                            Workspace$Type type3 = type1;
                            obj4 = PatchProxy.applyThreeRefs(uoa, p0, type2, a1, f.class, "4");
                            if (obj4 != patchProxyRe) {
                            label_0113 :
                               uArrayList = obj4;
                            label_0146 :
                               obj4 = uArrayList.iterator();
                               while (true) {
                                  if (obj4.hasNext()) {
                                     obj5 = obj4.next();
                                     i2 = (obj5.l0() == obj1.o())? 1: 0;
                                     if (!i2) {
                                        continue ;
                                     }
                                  }else {
                                     obj5 = null;
                                  }
                                  a uoa5 = (obj5 != null)? 1: null;
                                  i2 = (uoa5)? obj1.o(): -1;
                                  if (PostExperimentUtils.G(i1)) {
                                     uoa5 = obj1.C();
                                  }else if(uoa5 != null){
                                     uoa5 = obj1.C();
                                  }else {
                                     a uoa8 = new a(false, false, false, 0, null, false, null, null, 255, null);
                                  }
                                  obj5 = uoa5;
                                  i = obj1.z();
                                  if (PatchProxy.isSupport(oh)) {
                                     uoa6 = PatchProxy.applyTwoRefs(uArrayList, Integer.valueOf(i), null, oh, "10");
                                     if (uoa6 != patchProxyRe) {
                                        this = null;
                                     label_0257 :
                                        ArrayList uArrayList1 = new ArrayList();
                                        if (p0.h() != null) {
                                           immutableArr = p0.h();
                                           a.m(immutableArr);
                                           immutableArr.size();
                                        }
                                        immutableArr = p0.h();
                                        if (p0.c() != null) {
                                           immutableArr1 = p0.c();
                                           a.m(immutableArr1);
                                           immutableArr1.size();
                                        }
                                        immutableArr1 = p0.c();
                                        String str5 = "it";
                                        if (immutableArr != null && immutableArr.size() > 0) {
                                           iterator = immutableArr.iterator();
                                           while (iterator.hasNext()) {
                                              EditorSdk2V2$AudioAsset uAudioAsset = iterator.next();
                                              double d = uAudioAsset.volume();
                                              OriginalVoice originalVoic = uoa4.v();
                                              if (originalVoic != null) {
                                                 a.o(originalVoic, str5);
                                                 if (originalVoic.getMuteTrackAssets() || originalVoic.getEditMuteTrackAsset()) {
                                                    d1 = 0;
                                                 label_02c5 :
                                                    str6 = uAudioAsset.assetPath();
                                                    a.o(str6, "it.assetPath\(\)");
                                                    double d2 = (uAudioAsset.displayRange() != null)? uAudioAsset.displayRange().start(): 0;
                                                    d3 = (uAudioAsset.displayRange() != null)? uAudioAsset.displayRange().duration(): 0;
                                                    j oj = new j(str6, d2, d3, d1);
                                                    uArrayList1.add(originalVoic);
                                                 }else {
                                                    d = (double)originalVoic.getVolume();
                                                 }
                                              }
                                              d1 = d;
                                              goto label_02c5 ;
                                           }
                                        }else if(immutableArr1 != null && immutableArr1.size() > 0){
                                           iterator = immutableArr1.iterator();
                                           while (iterator.hasNext()) {
                                              EditorSdk2V2$TrackAsset trackAsset = iterator.next();
                                              str6 = trackAsset.assetAudioPath();
                                              str = "it.assetAudioPath\(\)";
                                              a.o(str6, str);
                                              OriginalVoice originalVoic1 = (str6.length() > 0)? 1: null;
                                              if (originalVoic1) {
                                                 double d5 = trackAsset.volume();
                                                 originalVoic1 = uoa4.v();
                                                 if (originalVoic1 != null) {
                                                    a.o(originalVoic1, str5);
                                                    d6 = (originalVoic1.getMuteTrackAssets() || originalVoic1.getEditMuteTrackAsset())? 0: (double)originalVoic1.getVolume();
                                                 }else {
                                                    d6 = d5;
                                                 }
                                                 this = trackAsset.assetAudioPath();
                                                 a.o(this, str);
                                                 d3 = (trackAsset.clippedRange() != null)? trackAsset.clippedRange().start(): 0;
                                                 d1 = (trackAsset.clippedRange() != null)? trackAsset.clippedRange().duration(): 0;
                                                 j oj1 = new j(this, d3, d1, d6);
                                                 uArrayList1.add(originalVoic1);
                                                 this = null;
                                              }else {
                                                 str = 1;
                                                 continue ;
                                              }
                                           }
                                        }
                                        List list = uoa3.z();
                                        a.o(list, "assetDraft.messages");
                                        iterator = list.iterator();
                                        double d4 = 0;
                                        while (iterator.hasNext()) {
                                           Asset uAsset = iterator.next();
                                           a.o(uAsset, str5);
                                           TimeRange selectedRang = uAsset.getSelectedRange();
                                           a.o(selectedRang, "it.selectedRange");
                                           d4 = d4 + selectedRang.getDuration();
                                        }
                                        obj = uoc.o0();
                                        a.m(obj);
                                        a.o(obj, "workspaceDraft.assetDraft!!");
                                        List list1 = obj.z();
                                        List list2 = list1;
                                        a.o(list1, "workspaceDraft.assetDraft!!.messages");
                                        obj1 = a.x(obj1, a.a.a(obj, obj1, i2, uoa6), false, 0, uArrayList, obj5, null, null, list2, false, d4, false, uArrayList1, false, 5478, null);
                                     }
                                  }
                                  a.p(uArrayList, "textList");
                                  ArrayList uArrayList2 = new ArrayList();
                                  iterator = uArrayList.iterator();
                                  while (iterator.hasNext()) {
                                     NewTextBaseElementData newTextBaseE = iterator.next();
                                     Action$a uoa7 = new Action$a(Action$Type.TEXT, newTextBaseE.l0());
                                     uoa7.c(newTextBaseE.m0());
                                     uoa7.d(newTextBaseE.j0());
                                     i oi = new i(newTextBaseE, uoa7.a(), uoa7.a());
                                     boolean b = true;
                                     oi.A(b);
                                     oi.z(b);
                                     boolean b1 = (i == newTextBaseE.l0())? true: false;
                                     oi.B(b1);
                                     ITimelineView$IRangeView$a$a u = (newTextBaseE.J0())? f.u: f.s;
                                     oi.D(u);
                                     Object[] objArray = new Object[0];
                                     a.D().s("TextDraftUtil", "mapper start: "+newTextBaseE.m0()+" duration:"+newTextBaseE.j0(), objArray);
                                     uArrayList2.add(oi);
                                  }
                                  uoa6 = new a(uArrayList2);
                                  goto label_0257 ;
                               }
                            }else {
                               a.p(uoa, this);
                               a.p(obj, str);
                               a.p(type3, str4);
                               uArrayList3 = new ArrayList();
                               obj4 = a1.e(uoa, p0, null, true, type3).iterator();
                               while (obj4.hasNext()) {
                                  obj6 = obj4.next();
                                  if (obj6.J0()) {
                                     uArrayList3.add(obj6);
                                  }
                               }
                            }
                         }else {
                            this = obj3;
                            uoa3 = uoa1;
                            uoa4 = uoa2;
                            str4 = str2;
                            double d7 = p0.f();
                            Workspace$Type type4 = uoc.a1();
                            a.o(type4, str3);
                            if (PatchProxy.isSupport(oh)) {
                               obj4 = PatchProxy.applyThreeRefs(uoa, Double.valueOf(d7), type4, null, h.class, "3");
                               if (obj4 != patchProxyRe) {
                                  goto label_0113 ;
                               }
                            }
                            a.p(uoa, this);
                            a.p(type4, str4);
                            uArrayList3 = new ArrayList();
                            obj4 = h.f(uoa, d7, null, true, type4).iterator();
                            while (obj4.hasNext()) {
                               obj6 = obj4.next();
                               if (obj6.J0()) {
                                  uArrayList3.add(obj6);
                               }
                            }
                         }
                         uArrayList = uArrayList3;
                         goto label_0146 ;
                      }
                   }
                }
             }
          }
          obj2 = obj1;
       }
       return obj2;
    }
    public EditorItemFunc y0(){
       return EditorItemFunc.SUBTITLE_V2;
    }
}
