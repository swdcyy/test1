package h69.j;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c16.c;
import g26.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kotlin.jvm.internal.a;
import vaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.FeatureId;
import fba.a;
import com.kuaishou.edit.draft.AICutTheme;
import java.util.List;
import java.util.ArrayList;
import maa.a;
import haa.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$PositionType;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import brd.t;
import java.lang.Integer;
import trd.u;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import java.util.Collection;
import com.yxcorp.gifshow.encode.k1;
import t45.d;
import brd.z;
import h69.j$a;
import erd.o;
import h69.j$b;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Long;
import gq.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AICutTheme$b;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import com.yxcorp.utility.TextUtils;
import qr4.k$b;
import qr4.k$g;
import qr4.k$c;
import qr4.e$h;
import wba.n0;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.StringBuilder;
import w46.b;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Double;
import java.lang.System;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.AuditFrame;
import ekd.q;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.kuaishou.edit.draft.RecommendStyle$b;
import com.kuaishou.edit.draft.RecommendStyle;

public final class j	// class@00255d
{
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static final j d;

    static {
       j.d = new j();
    }
    public void j(){
       super();
    }
    public static final boolean c(Workspace$Type p0,Workspace$Source p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.n(p0, p1) && (c.d() && d.b()))? true: false;
       return b;
    }
    public static final String d(c p0,boolean p1){
       String obj;
       a uoa;
       Kuaishan kuaishan;
       FeatureId featureId;
       String external;
       a uoa1;
       AICutTheme uAICutTheme;
       FeatureId featureId1;
       String external1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, oj, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "draft");
       obj = "";
       if (p1) {
          uoa = p0.F0();
          if (uoa != null) {
             kuaishan = uoa.t();
             if (kuaishan != null) {
                featureId = kuaishan.getFeatureId();
                if (featureId != null) {
                   external = featureId.getExternal();
                   if (external != null) {
                   label_0073 :
                      obj = external;
                   }
                }
             }
          }
          uoa1 = p0.n0();
          if (uoa1 != null) {
             uAICutTheme = uoa1.t();
             if (uAICutTheme != null) {
                featureId1 = uAICutTheme.getFeatureId();
                if (featureId1 != null) {
                   external1 = featureId1.getExternal();
                   if (external1 != null) {
                   label_008f :
                      obj = external1;
                   }
                }
             }
          }
       }else {
          uoa = p0.F0();
          if (uoa != null) {
             kuaishan = uoa.v();
             if (kuaishan != null) {
                featureId = kuaishan.getFeatureId();
                if (featureId != null) {
                   external = featureId.getExternal();
                   if (external != null) {
                      goto label_0073 ;
                   }
                }
             }
          }
          uoa1 = p0.n0();
          if (uoa1 != null) {
             uAICutTheme = uoa1.v();
             if (uAICutTheme != null) {
                featureId1 = uAICutTheme.getFeatureId();
                if (featureId1 != null) {
                   external1 = featureId1.getExternal();
                   if (external1 != null) {
                      goto label_008f ;
                   }
                }
             }
          }
       }
    label_0090 :
       return obj;
    }
    public static final float e(boolean p0){
       float f = (p0)? 6.00f: 3.00f;
       return f;
    }
    public static final List f(c p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "draft");
       obj = new ArrayList();
       List list = a.c(p0).z();
       a.o(list, "DraftGetUtils.getAssetDraft\(draft\).messages");
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Asset uAsset = iterator.next();
          a.o(uAsset, "asset");
          if (uAsset.getSubAssetCount() > 0) {
             if (uAsset.getPositionType() == Asset$PositionType.OPENING || uAsset.getPositionType() == Asset$PositionType.ENDING) {
                continue ;
             }else {
                List subAssetList = uAsset.getSubAssetList();
                a.o(subAssetList, "asset.subAssetList");
                Iterator iterator1 = subAssetList.iterator();
                while (iterator1.hasNext()) {
                   Asset uAsset1 = iterator1.next();
                   a.o(uAsset1, "subAsset");
                   j.d.p(uAsset1, p0, obj);
                }
             }
          }else {
             j.d.p(uAsset, p0, obj);
          }
       }
       return obj;
    }
    public static final boolean g(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "draft");
       boolean b = (DraftUtils.K(p0) && (p0.b1() == Workspace$Type.VIDEO || p0.b1() == Workspace$Type.LONG_VIDEO))? true: false;
       return b;
    }
    public static final boolean h(Workspace$Source p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DraftUtils.L(p0);
    }
    public static final boolean i(Workspace p0){
       Workspace$Source source = null;
       Object obj = PatchProxy.applyOneRefs(p0, source, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          source = p0.getSource();
       }
       return j.h(source);
    }
    public static final boolean j(c p0){
       Workspace$Source source = null;
       Object obj = PatchProxy.applyOneRefs(p0, source, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          source = p0.T0();
       }
       return j.h(source);
    }
    public static final boolean k(c p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          VideoContext videoContext = p0.d1();
          if (videoContext != null) {
             i oi = videoContext.F();
             if (oi != null) {
                oi = oi.b;
                if (oi != null && oi.I0 == 11) {
                   b = true;
                label_002f :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_002f ;
    }
    public static final boolean l(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       boolean b = (c.d() && (p0.a1() == Workspace$Type.VIDEO || p0.a1() == Workspace$Type.LONG_VIDEO))? true: false;
       return b;
    }
    public static final boolean m(){
       Object obj = PatchProxy.apply(null, null, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.d();
    }
    public static final boolean n(Workspace$Type p0,Workspace$Source p1){
       boolean b = (p0 == Workspace$Type.VIDEO || (p0 == Workspace$Type.LONG_VIDEO && p1 != Workspace$Source.VIDEO_SOLITAIRE))? true: false;
       return b;
    }
    public static final boolean o(Workspace$Type p0,Workspace$Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       a.p(p1, "typeFrom");
       boolean b = (p0 == Workspace$Type.AI_CUT && (p1 != Workspace$Type.VIDEO && p1 != Workspace$Type.LONG_VIDEO))? true: false;
       return b;
    }
    public static final t q(List p0,int p1){
       ArrayList obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oj, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "medias");
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          QMedia qMedia = iterator.next();
          QMedia mExportFileP = qMedia.mExportFilePath;
          if (mExportFileP != null && mExportFileP.length()) {
             i = 0;
          }
          qMedia = (i)? qMedia.path: qMedia.mExportFilePath;
          obj.add(qMedia);
       }
       t ot = k1.a(obj, p1, 0, 0).observeOn(d.a).takeLast(i).map(new j$a(p0)).onErrorReturn(new j$b(p0));
       a.o(ot, "RxFetchAuditFramesApi\n  бн         medias\n        }");
       return ot;
    }
    public static final void r(c p0,KwaiAICutStyle p1,long p2,boolean p3,boolean p4){
       j oj = j.class;
       int i = 0;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oj, "2")) {
             return;
          }
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.n0();
       if (uoa != null) {
          if (p1 == null) {
             Object[] objArray1 = new Object[i];
             a.D().w("AICutBaseUtils", "saveAICutStyleToDraft: aiCutStyle is null", objArray1);
             return;
          }else if(p4){
             uoa.c0();
          }
          AICutTheme$b uob = uoa.k();
          String str = (TextUtils.x(p1.mLocalDir))? "": uoa.Q(p1.mLocalDir);
          uob.copyOnWrite();
          uob.instance.setDirectory(str);
          uob.copyOnWrite();
          uob.instance.setName(p1.mName);
          uob.b(DraftUtils.d0(p1.mStyleId));
          uob.copyOnWrite();
          uob.instance.setDpiValue(p1.mDpi);
          uob.copyOnWrite();
          uob.instance.setChecksum(p1.mCheckSum);
          uob.copyOnWrite();
          uob.instance.setColor(p1.mColor);
          uob.copyOnWrite();
          uob.instance.setSeed(p2);
          if (p4) {
             uoa.g(p3);
          }
       }
       return;
    }
    public static void u(j p0,c p1,List p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.t(p1, p2, p3);
       return;
    }
    public final void a(VideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "26")) {
          return;
       }
       a.p(p0, "videoContext");
       p0.F().b.T = null;
       p0.y1("");
       p0.S1("");
       return;
    }
    public final void b(VideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "27")) {
          return;
       }
       a.p(p0, "videoContext");
       p0.J0(null).f1(false).N0(null).O0(false).L0(null).M0(false).K0("");
       p0.F().d.n = null;
       p0.F().d.O = null;
       p0.F().d.p = null;
       p0.M = "";
       return;
    }
    public final void p(Asset p0,c p1,ArrayList p2){
       Integer integer;
       File uFile;
       int i3;
       double videoTrackDu;
       String str = "5";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, str)) {
          return;
       }
       String identifier = p0.getIdentifier();
       Object[] obj = null;
       String str1 = PatchProxy.applyOneRefs(identifier, obj, n0.class, "19");
       int i = 0;
       if (str1 != PatchProxyResult.class) {
       }else if(TextUtils.x(identifier)){
          int i4 = identifier.lastIndexOf(95);
          if (i4 > 0) {
             str1 = identifier.substring(i, i4);
          }
       }
       str1 = obj;
       identifier = "";
       if (str1 == null) {
          str1 = identifier;
       }
       a.o(str1, "TrackAssetDraftUtil.getA\x20\x02Path\(it.identifier\) ?: \"\"\x00");
       if (!TextUtils.x(str1) && b.S(new File(str1))) {
          identifier = str1;
       }else if(!TextUtils.x(p0.getFile())){
          uFile = new File(DraftFileManager.E().H(p1), p0.getFile());
          if (b.S(uFile)) {
             identifier = uFile.getAbsolutePath();
             a.o(identifier, "draftFile.absolutePath");
          }
       }else {
          i3 = p1;
       }
       if (TextUtils.x(identifier)) {
          str = p0.getAlbumId();
          if (b.S(new File(str))) {
             identifier = p0.getAlbumId();
             a.o(identifier, "it.albumId");
          }
       }
       String str2 = identifier;
       if (TextUtils.x(str2)) {
          obj = new Object[i];
          a.D().t("AICutBaseUtils", "parseToMedia no file: "+p0.getAlbumId()+' ', obj);
          return;
       }else {
          int i1 = str.a().matcher(str2).matches() ^ 0x01;
          int i2 = 1000;
          if (!i1) {
             integer = Integer.valueOf(-1);
          }else if(!p0.getDuration()){
             videoTrackDu = EditorSdk2Utils.getVideoTrackDuration(str2);
          }else {
             videoTrackDu = p0.getDuration();
          }
          integer = Double.valueOf((videoTrackDu * (double)i2));
          QMedia qMedia = new QMedia(System.currentTimeMillis(), str2, integer.longValue(), -1, i1);
          TimeRange selectedRang = p0.getSelectedRange();
          a.o(selectedRang, "it.selectedRange");
          double d = (double)i2;
          i.mClipStart = (long)(selectedRang.getStart() * d);
          TimeRange selectedRang1 = p0.getSelectedRange();
          a.o(selectedRang1, "it.selectedRange");
          i.mClipDuration = (long)(selectedRang1.getDuration() * d);
          i.mAlbum = p0.getAlbumId();
          i.mWidth = (int)p0.getOriginPicWidth();
          i.mHeight = (int)p0.getOriginPicHeight();
          List assetAuditFr = p0.getAssetAuditFrameList();
          a.o(assetAuditFr, "it.assetAuditFrameList");
          ArrayList uArrayList = new ArrayList(u.Y(assetAuditFr, 10));
          Iterator iterator = assetAuditFr.iterator();
          while (iterator.hasNext()) {
             AuditFrame uAuditFrame = iterator.next();
             a.o(uAuditFrame, "frame");
             uFile = DraftFileManager.E().B(uAuditFrame.getFile(), a.c(p1));
             str = (uFile != null)? uFile.getAbsolutePath(): obj;
             uArrayList.add(str);
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             Object obj1 = iterator1.next();
             i3 = TextUtils.x(obj1) ^ 0x01;
             if (i3) {
                uArrayList1.add(obj1);
             }
          }
          i.mVideoFrameList = uArrayList1;
          p2.add(i);
          return;
       }
    }
    public final void s(c p0,String p1,boolean p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "3")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "veResult");
       a uoa = p0.n0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.aiCutStyleDraft ?: return");
          if (p2) {
             uoa.c0();
          }
          GeneratedMessageLite$Builder uBuilder = uoa.k();
          a.o(uBuilder, "aiCutStyleDraft.ensureFirstBuilder\(\)");
          if (uBuilder.instance.getVisionEngineResultCount() > 0) {
             uBuilder.copyOnWrite();
             uBuilder.instance.setVisionEngineResult(0, p1);
          }else {
             uBuilder.copyOnWrite();
             uBuilder.instance.addVisionEngineResult(p1);
          }
          if (p2) {
             uoa.g(0);
          }
       }
       return;
    }
    public final void t(c p0,List p1,boolean p2){
       RecommendStyle$b uob;
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "30")) {
          return;
       }
       a.p(p0, "draft");
       a uoa = a.D();
       StringBuilder str = "saveRecommendStyles\(\) size= ";
       Integer integer = (p1 != null)? Integer.valueOf(p1.size()): null;
       Object[] objArray = new Object[0];
       uoa.w("AICutBaseUtils", str+integer, objArray);
       if (q.f(p1)) {
          return;
       }else {
          a uoa1 = a.a(p0);
          boolean b = uoa1.D();
          if (!b) {
             uoa1.c0();
          }
          GeneratedMessageLite$Builder uBuilder = uoa1.k();
          a.o(uBuilder, "aiCutDraft.ensureFirstBuilder\(\)");
          if (p2) {
             uBuilder.copyOnWrite();
             uBuilder.instance.clearNewRecommendStyle();
          }else {
             uBuilder.copyOnWrite();
             uBuilder.instance.clearRecommendStyle();
          }
          if (p1 != null) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                VideoTemplate videoTemplat = iterator.next();
                if (p2) {
                   uob = RecommendStyle.newBuilder();
                   uob.a(videoTemplat.getId());
                   uob.b(videoTemplat.getType());
                   uBuilder.copyOnWrite();
                   uBuilder.instance.addNewRecommendStyle(uob);
                }else {
                   uob = RecommendStyle.newBuilder();
                   uob.a(videoTemplat.getId());
                   uob.b(videoTemplat.getType());
                   uBuilder.copyOnWrite();
                   uBuilder.instance.addRecommendStyle(uob);
                }
             }
          }
          if (!b) {
             uoa1.g(0);
          }
          return;
       }
    }
}
