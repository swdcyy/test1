package com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt$LOCAL_MUSIC_TYPE_NAME$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import yaa.c;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.OriginalVoice;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Type;
import csc.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import e17.i;
import lba.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.OriginalVoice$b;
import com.kuaishou.edit.draft.VoiceChange;
import com.kuaishou.edit.draft.VoiceChange$b;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import java.lang.Float;
import tkd.b;
import tkd.d;
import h69.b;
import com.kuaishou.edit.draft.Music$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import brd.a0;
import qkd.b;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt$a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import kqb.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import lnc.w6;
import com.kuaishou.edit.draft.Kuaishan$TemplateType;
import iba.a;
import com.kuaishou.edit.draft.Theme;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicInvalidException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lnc.i1;
import src.b;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import urc.b;
import trc.t0;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import java.lang.Double;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Math;
import org.json.JSONObject;
import e16.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import wba.u;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.net.Uri;
import ekd.w0;
import xkd.b;
import ekd.a0;
import wkd.b;
import j80.c;
import com.kuaishou.edit.draft.Music$Source;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kuaishou.edit.draft.TimeRange$b;
import com.yxcorp.gifshow.music.utils.g;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OnlineMusicParam$b;
import com.kuaishou.edit.draft.OperationMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam$b;
import com.kuaishou.edit.draft.ImportMusicParam;
import com.kuaishou.edit.draft.ImportMusicParam$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.edit.draft.RapInfo;
import com.kuaishou.edit.draft.RapInfo$b;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt$b;
import laa.f;
import com.kuaishou.edit.draft.Theme$b;
import src.n;
import lsc.w;
import lsc.b0;
import fg6.a;
import com.kuaishou.android.model.music.Music$MusicBeatsInfo;
import com.google.gson.Gson;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Iterable;
import zsd.s;
import android.util.Pair;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kotlin.collections.CollectionsKt__CollectionsKt;
import usd.k;
import usd.q;
import usd.i;

public final class MusicDraftUtilsKt	// class@001122
{
    public static final p a;

    static {
       MusicDraftUtilsKt.a = s.c(MusicDraftUtilsKt$LOCAL_MUSIC_TYPE_NAME$2.INSTANCE);
    }
    public static final boolean a(c p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Workspace obj1 = PatchProxy.applyOneRefs(p0, obj, MusicDraftUtilsKt.class, "19");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       boolean b = true;
       if (MusicDraftUtilsKt.w(p0)) {
          obj1 = p0.v();
          p0 = p0.J0();
          List list = (p0 != null)? p0.z(): obj;
          Object obj2 = PatchProxy.applyTwoRefs(obj1, list, obj, DraftUtils.class, "41");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(obj1 == null || (obj1.getSource() != Workspace$Source.REEDIT && (obj1.getType() != Workspace$Type.VIDEO && (obj1.getType() != Workspace$Type.LONG_VIDEO && (obj1.getType() != Workspace$Type.ALBUM_MOVIE && (obj1.getType() != Workspace$Type.KUAISHAN && (obj1.getType() == Workspace$Type.PHOTO_MOVIE || obj1.getType() == Workspace$Type.AI_CUT))))))){
             if (obj1.hasOriginalVoice() && (obj1.getOriginalVoice().getMuteTrackAssets() && obj1.getOriginalVoice().getAudioAssetsCount() <= 0)) {
                Object obj3 = PatchProxy.applyOneRefs(list, obj, DraftUtils.class, "42");
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else if(list == null || list.isEmpty()){
                   int i = 0;
                   while (true) {
                      if (i < list.size()) {
                         if (list.get(i).getType() == Music$Type.RECORD) {
                            b1 = true;
                            break ;
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                }
                b1 = false;
                if (!b1) {
                label_00d4 :
                   b1 = false;
                }
             }
          label_00d2 :
             b1 = true;
          }else {
             goto label_00d4 ;
          }
          if (b1) {
          label_00d9 :
             return b;
          }
       }
       b = false;
       goto label_00d9 ;
    }
    public static final void b(c p0,b p1){
       GeneratedMessageLite$Builder uBuilder1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MusicDraftUtilsKt.class, "33")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "info");
       Object[] objArray = new Object[0];
       a.D().w("MusicUtils", "changeVoice\(\) called with: info = ["+p1.a()+']', objArray);
       boolean b = MusicDraftUtilsKt.w(p0);
       if (!MusicDraftUtilsKt.a(p0) && p1.a()) {
          int i = (b)? 0x7f100b37: 0x7f100b3d;
          i.a(R.style.arg_RES_7f11066a, i);
          return;
       }else {
          a uoa = p0.g1();
          if (uoa != null) {
             uoa.c0();
             GeneratedMessageLite$Builder uBuilder = uoa.k();
             a.o(uBuilder, "voiceDraft.ensureFirstBuilder\(\)");
             if (uBuilder.instance.hasVoiceChange()) {
                uBuilder1 = uBuilder.instance.getVoiceChange().toBuilder();
                a.o(uBuilder1, "builder.voiceChange.toBuilder\(\)");
                uBuilder1.a(DraftUtils.m0(uBuilder1.getAttributes()));
                a.o(uBuilder1, "voiceChange.setAttribute¡­\(voiceChange.attributes\)\)");
             }else {
                uBuilder1 = VoiceChange.newBuilder();
                uBuilder1.a(DraftUtils.i());
                a.o(uBuilder1, "VoiceChange.newBuilder\(\)¡­Utils.createAttributes\(\)\)");
             }
             uBuilder1.c(p1.a());
             a.o(uBuilder1, "voiceChange.setSdkType\(info.mSdkId\)");
             uBuilder1.copyOnWrite();
             uBuilder1.instance.setFeatureId(DraftUtils.c0(p1.e));
             uBuilder.copyOnWrite();
             uBuilder.instance.setVoiceChange(uBuilder1);
             uoa.f();
          }
          return;
       }
    }
    public static final void c(c p0,int p1,boolean p2,boolean p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       if (PatchProxy.isSupport(musicDraftUt) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, MusicDraftUtilsKt.class, "21")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       float f = MusicDraftUtilsKt.j(p0, p1);
       a uoa = p0.g1();
       if (uoa != null) {
          uoa.c0();
          boolean b = MusicDraftUtilsKt.p(p0);
          OriginalVoice$b uob = uoa.k();
          uob.b((b ^ 0x01));
          a.o(uob, "it.ensureFirstBuilder\(\).¡­kAsset\(!isUseOriginSound\)");
          float f1 = (b)? f: 0;
          uob.d(f1);
          uoa.f();
       }
       ArrayList uArrayList = null;
       if (p3) {
          AICutProjectManager uAICutProjec = AICutProjectManager.class;
          if (!PatchProxy.isSupport(uAICutProjec) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uArrayList, uAICutProjec, "3")) {
             d.a(-873393519).t0((double)f);
          }
       }
       String str = "musicDraft";
       String str1 = "it";
       if (p2) {
          c uoc = p0.J0();
          if (uoc != null) {
             a.o(uoc, str1);
             Music$b uob1 = PatchProxy.applyOneRefs(uoc, uArrayList, musicDraftUt, "24");
             if (uob1 != patchProxyRe) {
             }else {
                a.p(uoc, str);
                uob1 = MusicDraftUtilsKt.h(uoc, true);
             }
             if (uob1 != null) {
                uob1.p(f);
             }
          }
       }
       p0 = p0.J0();
       if (p0 != null) {
          a.o(p0, str1);
          List obj = PatchProxy.applyOneRefs(p0, uArrayList, musicDraftUt, "23");
          if (obj != patchProxyRe) {
          }else {
             a.p(p0, str);
             if (p0.D() && !p0.E()) {
                obj = p0.z();
                a.o(obj, "musicDraft.messages");
                uArrayList = new ArrayList();
                int i = 0;
                int i1 = obj.size();
                while (i < i1) {
                   Music music = obj.get(i);
                   a.o(music, "music");
                   if (music.getType() == Music$Type.MEDIA_SCENE_IMPORT) {
                      uArrayList.add(p0.n(i));
                   }
                   i++;
                }
             }
             obj = uArrayList;
          }
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                iterator.next().p(f);
             }
          }
       }
       return;
    }
    public static void d(c p0,int p1,boolean p2,boolean p3,int p4,Object p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       MusicDraftUtilsKt.c(p0, p1, p2, p3);
       return;
    }
    public static final a0 e(Music p0,File p1){
       a0 uoa0;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicDraftUtilsKt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "music");
       if (b.S(p1)) {
          uoa0 = a0.y(new MusicDraftUtilsKt$a(p0, p1)).T(d.c);
          a.o(uoa0, "Single.fromCallable {\n  ¡­eOn\(KwaiSchedulers.ASYNC\)");
       }else {
          uoa0 = a0.B(p0);
          a.o(uoa0, "Single.just\(music\)");
       }
       return uoa0;
    }
    public static final Music$b f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "musicDraft");
       return MusicDraftUtilsKt.h(p0, false);
    }
    public static final String g(){
       Object obj = PatchProxy.apply(null, null, MusicDraftUtilsKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicDraftUtilsKt.a.getValue();
    }
    public static final Music$b h(c p0,boolean p1){
       List obj;
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       if (PatchProxy.isSupport(musicDraftUt)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, musicDraftUt, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.D() && !p0.E()) {
          obj = p0.z();
          a.o(obj, "musicDraft.messages");
          int i = 0;
          int i1 = obj.size();
          while (i < i1) {
             Music music = obj.get(i);
             a.o(music, "music");
             if (music.getType() != Music$Type.MEDIA_SCENE_IMPORT) {
                Music$Type rECORD = Music$Type.RECORD;
                if (music.getType() != rECORD || (p1 || (music.getType() != rECORD && !p1))) {
                   return p0.n(i);
                }
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static final File i(Music p0){
       File obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "music");
       obj = b0.h(p0);
       if (!b.S(obj) && !TextUtils.x(p0.mPath)) {
          obj = new File(p0.mPath);
       }
       return obj;
    }
    public static final float j(c p0,int p1){
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       if (PatchProxy.isSupport(musicDraftUt)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, musicDraftUt, "20");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       a.p(p0, "workspaceDraft");
       Workspace$Type type = p0.a1();
       a.o(type, "workspaceDraft.type");
       float f = (MusicDraftUtilsKt.k(type))? 2.00f: 0x3f800000;
       return (((float)p1 * f) / (float)200);
    }
    public static final boolean k(Workspace$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceType");
       boolean b = (p0 != Workspace$Type.VIDEO && (p0 != Workspace$Type.LONG_VIDEO && (p0 != Workspace$Type.KUAISHAN && (p0 != Workspace$Type.ALBUM_MOVIE && (p0 == Workspace$Type.AI_CUT || p0 == Workspace$Type.PHOTO_MOVIE)))))? true: false;
       return b;
    }
    public static final boolean l(c p0){
       int sparkOriginV;
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.F0();
       boolean b = false;
       if (uoa != null) {
          Kuaishan kuaishan = uoa.v();
          if (kuaishan != null) {
             sparkOriginV = kuaishan.getSparkOriginVoiceAssetsCount();
          label_002e :
             if (sparkOriginV > 0) {
                b = true;
             }
             return b;
          }
       }
       sparkOriginV = 0;
       goto label_002e ;
    }
    public static final boolean m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       if (MusicDraftUtilsKt.o(p0)) {
          return MusicDraftUtilsKt.l(p0);
       }
       return true;
    }
    public static final boolean n(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       boolean b = (w6.e(p0.J0()) != null)? true: false;
       return b;
    }
    public static final boolean o(c p0){
       boolean b;
       Kuaishan$TemplateType templateType = null;
       Object obj = PatchProxy.applyOneRefs(p0, templateType, MusicDraftUtilsKt.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       if (p0.a1() == Workspace$Type.KUAISHAN || p0.a1() == Workspace$Type.PHOTO_MOVIE) {
          a uoa = p0.F0();
          if (uoa != null) {
             Kuaishan kuaishan = uoa.v();
             if (kuaishan != null) {
                templateType = kuaishan.getTemplateType();
             }
          }
          if (templateType == Kuaishan$TemplateType.SHIMMER) {
             b = true;
          label_0042 :
             return b;
          }
       }
       b = false;
       goto label_0042 ;
    }
    public static final boolean p(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       boolean b = true;
       if (p0.T0() != Workspace$Source.REEDIT) {
          a uoa = p0.g1();
          if (uoa != null) {
             OriginalVoice originalVoic = uoa.v();
             if (originalVoic == null || originalVoic.getEditMuteTrackAsset()) {
             }
          }else {
          }
       }
    label_0039 :
       return b;
    }
    public static final boolean q(c p0){
       a obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       obj = p0.X0();
       int i = 0;
       if (obj != null) {
          Theme theme = obj.v();
          if (theme != null) {
             a.o(theme, "theme");
             if (theme.getUsingMusics() && (theme.getMusicsCount() > 0 && (theme.getMusics(i) != null && p0.a1() == Workspace$Type.PHOTO_MOVIE))) {
                i = true;
             }
          }
       }
       return i;
    }
    public static final Pair r(c p0){
       boolean b;
       float volume;
       boolean b1;
       a obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       obj = p0.X0();
       int i = 1;
       float f = 0;
       if (obj != null) {
          Theme theme = obj.v();
          if (theme != null) {
             b = MusicDraftUtilsKt.q(p0);
             if (b) {
                Music musics = theme.getMusics(0);
                a.o(musics, "theme.getMusics\(0\)");
                volume = musics.getVolume();
                b1 = true;
             label_0040 :
                p0 = p0.J0();
                if (!b) {
                   Music music = w6.c(p0);
                   if (music == null) {
                      i = 0;
                   }
                   volume = (music != null)? music.getVolume(): null;
                   b1 = i;
                }
                if (b1) {
                   f = volume;
                }
                return new Pair(Boolean.valueOf(b1), Integer.valueOf((int)((float)200 * f)));
             }else {
                volume = null;
             label_003f :
                b1 = false;
                goto label_0040 ;
             }
          }
       }
       volume = null;
       b = false;
       goto label_003f ;
    }
    public static final void s(Music p0,String p1){
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, musicDraftUt, "10")) {
          return;
       }
       StringBuilder str = "error this music invalid "+p1+",musicKeyParam:";
       p1 = PatchProxy.applyOneRefs(p0, null, musicDraftUt, "11");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = "id:"+p0.mId+"name:"+p0.mName+"duration:"+p0.mDuration+",mClipStartMills:"+p0.mClipStartMills+",mChorus:"+p0.mChorus+",mType:"+p0.mType+",mNewType:"+p0.mNewType+",mPhotoId:"+p0.mPhotoId+",mPath:"+p0.mPath;
       }
       MusicInvalidException musicInvalid = new MusicInvalidException(str+p1);
       ExceptionHandler.handleCaughtException(musicInvalid);
       i1.c(musicInvalid);
       return;
    }
    public static final void t(b p0,c p1,int p2,int p3,boolean p4,boolean p5,MusicClipInfo p6,double p7,b p8,t0 p9,boolean p10,SelectSource p11){
       Music$Type type;
       Music$Type type1;
       c uoc1;
       long l4;
       MusicClipInfo musicClipInf;
       GeneratedMessageLite$Builder uBuilder;
       String str5;
       Music music2;
       long l5;
       String str6;
       MusicClipInfo musicClipInf1;
       File uFile1;
       object oobject = p0;
       object oobject1 = p1;
       int i = p3;
       boolean b = p4;
       boolean b1 = p5;
       object oobject2 = p8;
       object oobject3 = p9;
       object oobject4 = p11;
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       Music obj = null;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(musicDraftUt)) {
          Object[] objArray = new Object[12];
          objArray[i2] = oobject;
          objArray[i1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Double.valueOf(p7);
          objArray[8] = oobject2;
          objArray[9] = oobject3;
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = oobject4;
          if (PatchProxy.applyVoid(objArray, obj, musicDraftUt, "3")) {
             return;
          }
       }
       a.p(oobject, "musicItem");
       a.p(oobject1, "workspaceDraft");
       a.p(oobject4, "selectSource");
       Music music = p0.b();
       boolean b2 = MusicDraftUtilsKt.r(p1).getFirst().booleanValue();
       float f = (float)p2 / (float)200;
       c uoc = p1.J0();
       if (uoc != null) {
          a.o(uoc, "workspaceDraft.musicDraft ?: return");
          if (p6 != null) {
             Music music1 = w6.c(uoc);
             if (music1 != null) {
                type = music1.getType();
                if (type != null) {
                label_00ab :
                   type1 = type;
                }
             }
             type = Music$Type.UNKNOWN;
             goto label_00ab ;
          }else if(music.mType == MusicType.LOCAL){
             type1 = Music$Type.IMPORT;
          }else if(oobject4 != SelectSource.RECOMMEND_LIST && (oobject4 == SelectSource.COLLECT_LIST || oobject4 == SelectSource.HISTORY_LIST)){
             type1 = Music$Type.OPERATION;
          }else {
             type1 = Music$Type.ONLINE;
          }
          File uFile = MusicDraftUtilsKt.i(music);
          if (!b.S(uFile)) {
             MusicDraftUtilsKt.s(music, "saveMusicToDraft music file invalid");
             return;
          }else {
             Music$Type type2 = type1;
             long l = f.N((double)music.mDuration);
             String str = ",musicFileDuration:";
             String str1 = null;
             if (l - str1 <= 0) {
                if (b) {
                   MusicDraftUtilsKt.s(music, "music duration invalid isRequestMusic:"+b+",isCollectionManagerMusic:"+b1+str+l);
                }
                a.m(uFile);
                l = (long)c.i(uFile.getAbsolutePath());
                music.mDuration = (int)f.I(l);
             }
             Music mClipStartMi = music.mClipStartMills;
             if (mClipStartMi - str1 <= 0) {
                mClipStartMi = w6.f(music);
             }
             long l1 = l - mClipStartMi;
             str1 = str;
             long l2 = (i == -1)? Math.min((long)0x222e0, l1): Math.min((long)i, l1);
             long l3 = l1;
             Music mCopyrightTi = music.mCopyrightTimeLimitInSecond;
             if (mCopyrightTi != null) {
                uoc1 = uoc;
                l4 = l;
                l2 = Math.min(((long)mCopyrightTi * (long)1000), l2);
             }else {
                l4 = l;
                uoc1 = uoc;
             }
             l = l2;
             String str2 = str1;
             c uoc2 = uoc1;
             String str3 = b.a(music, mClipStartMi, l, false).toString();
             a.o(str3, "MusicVideoContexts.getMu¡­ration, false\).toString\(\)");
             if (p6 != null) {
                musicClipInf = p6;
             }else {
                MusicClipInfo musicClipInf2 = new MusicClipInfo(MusicSource.RECOMMEND_MUSIC, "online_music", str3, true, music.mLoudness);
                musicClipInf = l2;
             }
             if (!b) {
                if (music.mType == MusicType.LOCAL) {
                   musicClipInf.mMusicSource = MusicSource.LOCAL;
                   musicClipInf.mMusicTypeName = MusicDraftUtilsKt.g();
                }else {
                   musicClipInf.mMusicSource = MusicSource.CLOUD_MUSIC;
                   musicClipInf.mMusicTypeName = "online_music";
                }
             }
             if (b1) {
                musicClipInf.mMusicSource = MusicSource.RECOMMEND_MUSIC;
             }
             a.m(uFile);
             musicClipInf.c(uFile.getPath());
             musicClipInf.a("", mClipStartMi, l);
             musicClipInf.a = music.mMusicBeatsString;
             String str4 = "MusicUtils";
             if (p6 == null) {
                u.k(false, uoc2);
                uBuilder = uoc2.b();
                a.o(uBuilder, "musicDraft.append\(\)");
                Music$Type type3 = type2;
                str5 = PatchProxy.applyTwoRefs(music, type3, null, musicDraftUt, "12");
                if (str5 != PatchProxyResult.class) {
                }else {
                   Application uApplication = a.b();
                   if (type3 == Music$Type.IMPORT) {
                      if (!TextUtils.x(music.mAvatarUrl)) {
                         a.o(uApplication, "context");
                         str5 = b.a(uApplication.getContentResolver(), w0.f(music.mAvatarUrl));
                         if (str5 == null || !b.S(new File(str5))) {
                         label_0231 :
                            str5 = "";
                         }
                      }else if(!TextUtils.x(music.mCoverPath) && new File(music.mCoverPath).isFile()){
                         str5 = music.mCoverPath;
                      }else {
                         goto label_0231 ;
                      }
                      a.o(str5, "if \(!TextUtils.isEmpty\(n¡­  } else {\n      \"\"\n    }");
                   }else {
                      str = "/tmpOperationMusicCover";
                      int i3 = -1504323719;
                      if (!TextUtils.x(music.mName)) {
                         str5 = (TextUtils.x(music.getId()))? a0.c(music.mName): music.getId();
                         music2 = mClipStartMi;
                         type2 = type3;
                         uFile1 = new File(b.a(i3).o().toString()+str+str5+".png");
                      }else {
                         music2 = mClipStartMi;
                         type2 = type3;
                         uFile1 = new File(b.a(i3).o().toString()+str);
                      }
                      str5 = uFile1.getAbsolutePath();
                      a.o(str5, "coverFile.absolutePath");
                   label_02be :
                      str5 = (new File(str5).exists())? uoc2.Q(str5): null;
                      l5 = l;
                      obj = music2;
                      str6 = str3;
                      u.m(music, uBuilder, uoc2, type2, null, str5, 0, null, musicClipInf, null, (p0.c ^ 0x01));
                   }
                }
                music2 = mClipStartMi;
                type2 = type3;
                goto label_02be ;
             }else {
                l5 = l;
                obj = mClipStartMi;
                str6 = str3;
                Music$b uob3 = MusicDraftUtilsKt.f(uoc2);
                if (uob3 != null) {
                   if (!PatchProxy.applyVoidThreeRefs(type2, uob3, musicClipInf, null, u.class, "2")) {
                      type = type2;
                      a.p(type, "musicType");
                      a.p(uob3, "musicBuilder");
                      a.p(musicClipInf, "clipInfo");
                      TimeRange$b uob4 = TimeRange.newBuilder();
                      a.o(uob4, "timeRangeBuilder");
                      uob4.b(g.e(musicClipInf.mClipStartMills));
                      uob4.a(g.e(musicClipInf.mClipResultDuration));
                      if (type == Music$Type.ONLINE) {
                         OnlineMusicParam$b uob5 = uob3.getOnlineParam().toBuilder();
                         uob5.a(uob4);
                         uob3.l(uob5);
                      }else if(type == Music$Type.OPERATION){
                         OperationMusicParam$b uob6 = uob3.getOperationParam().toBuilder();
                         uob6.a(uob4);
                         uob3.m(uob6);
                      }else {
                         ImportMusicParam$b uob7 = uob3.getImportParam().toBuilder();
                         uob7.a(uob4);
                         uob3.j(uob7);
                      }
                   }
                   uBuilder = uob3;
                }else {
                   i1.a(str4, "saveMusic music clip save but music item not exist fallback to save all music info!");
                   MusicDraftUtilsKt.t(p0, p1, p2, p3, p4, p5, null, p7, p8, p9, p10, p11);
                }
             }
             str5 = (TextUtils.x(musicClipInf.mClippedResultPath))? "": uoc2.Q(musicClipInf.mClippedResultPath);
             uBuilder.i(str5);
             uBuilder.c((musicClipInf.mAllowLoopPlay ^ 1));
             uBuilder.k(musicClipInf.mLoudness);
             uBuilder.copyOnWrite();
             uBuilder.instance.setIsFavorited(music.isFavorited());
             float f1 = (!b2 && !f)? 0x3f800000: f;
             uBuilder.p(f1);
             uBuilder.b(music.mCopyrightTimeLimitInSecond);
             uBuilder.f(MusicClipInfo.c);
             uBuilder.g(MusicClipInfo.d);
             b uob = p0;
             if (uob.b != null) {
                uBuilder.n(Music$Source.CAPTURE);
             }
             GeneratedMessageLite$Builder obj1 = p9;
             long l6 = l3;
             if (!PatchProxy.applyVoidTwoRefs(obj1, uBuilder, null, musicDraftUt, "4") && obj1 != null) {
                String str7 = p9.f();
                if (str7 == null) {
                   str7 = "";
                }
                List list = p9.a();
                if (list != null) {
                   CDNUrl uCDNUrl = CollectionsKt___CollectionsKt.p2(list);
                   if (uCDNUrl != null) {
                      str5 = uCDNUrl.getUrl();
                      if (str5 != null) {
                      label_0406 :
                         RapInfo$b uob2 = uBuilder.instance.getRapInfo().toBuilder();
                         uob2.copyOnWrite();
                         uob2.instance.setLyricStyle(p9.c());
                         uob2.copyOnWrite();
                         uob2.instance.setSubMusicStyle(p9.g());
                         uob2.copyOnWrite();
                         uob2.instance.setMusicStyleId(p9.e());
                         uob2.copyOnWrite();
                         uob2.instance.setCoverUrl(str5);
                         uob2.copyOnWrite();
                         uob2.instance.setName(str7);
                         uob2.build();
                         uBuilder.copyOnWrite();
                         uBuilder.instance.setRapInfo(uob2);
                      }
                   }
                }
                str5 = "";
                goto label_0406 ;
             }
             c uoc3 = p1;
             MusicDraftUtilsKt.v(music, uBuilder, uoc3);
             Workspace$Type pHOTO_MOVIE = Workspace$Type.PHOTO_MOVIE;
             if (p1.a1() == pHOTO_MOVIE) {
                a uoa = p1.X0();
                a.o(uoa, "workspaceDraft.themeDraft");
                b = uoa.D();
                if (!b) {
                   p1.X0().c0();
                }
                obj1 = p1.X0().l(MusicDraftUtilsKt$b.a);
                a.o(obj1, "workspaceDraft.themeDraf¡­usingFilters = true\n    }");
                obj1.c(false);
                if (!b) {
                   p1.X0().g((p10 ^ 0x01));
                }
             }
             if (!uob instanceof n) {
                w6.b(music);
             }
             Object[] objArray1 = new Object[0];
             a.D().w(str4, "playSelectMusic startMills:"+obj+",clipStartMills:"+music.mClipStartMills+",finalDuration:"+l5+",musicFileRemindDuration:"+l6+str2+l4+",videoOrPhotoTimeLength:"+i+",meta:"+str6+",clipInfo:"+musicClipInf, objArray1);
             if (!f.E(p1.a1()) && (p1.a1() != pHOTO_MOVIE && (p1.T0() != Workspace$Source.REEDIT && p1.T0() != Workspace$Source.MEDIA_SCENE))) {
                b uob1 = p8;
                if (uob1) {
                   w.c(uoc3, p7, uob1);
                }
             }
          label_052c :
             return;
          }
       }
       return;
    }
    public static void u(b p0,c p1,int p2,int p3,boolean p4,boolean p5,MusicClipInfo p6,double p7,b p8,t0 p9,boolean p10,SelectSource p11,int p12,Object p13){
       int i = p12;
       MusicClipInfo musicClipInf = (i & 0x40)? null: p6;
       b uob = (i & 0x0100)? null: p8;
       t0 ot0 = (i & 0x0200)? null: p9;
       boolean b = (i & 0x0400)? false: p10;
       MusicDraftUtilsKt.t(p0, p1, p2, p3, p4, p5, musicClipInf, p7, uob, ot0, b, p11);
       return;
    }
    public static final void v(Music p0,Music$b p1,c p2){
       Music$MusicBeatsInfo musicBeatsIn1;
       Pair pair;
       double d1;
       String str3;
       Object[] obj4;
       double d2;
       int i1;
       Double obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, MusicDraftUtilsKt.class, "5")) {
          return;
       }
       a.p(obj, "music");
       a.p(obj1, "musicBuilder");
       a.p(obj2, "workspaceDraft");
       p1.copyOnWrite();
       obj1.instance.clearTransPoints();
       if (!b0.g(obj2, obj) && !DraftUtils.i0(p2)) {
          return;
       }
       Music mMusicBeatsS = obj.mMusicBeatsString;
       a uoa = null;
       StringBuilder str = 1;
       Gson gson = (mMusicBeatsS == null || !mMusicBeatsS.length())? 1: null;
       Music$MusicBeatsInfo musicBeatsIn = (!gson)? a.a.h(obj.mMusicBeatsString, Music$MusicBeatsInfo.class): PostUtils.l(p0);
       String str1 = "";
       if (musicBeatsIn != null) {
          Music$MusicBeatsInfo mBeats = musicBeatsIn.mBeats;
          if (mBeats != null) {
             musicBeatsIn1 = mBeats;
          label_006c :
             a.o(musicBeatsIn1, "beatsInfo?.mBeats ?: \"\"");
             if (musicBeatsIn != null) {
                musicBeatsIn = musicBeatsIn.mDownbeats;
                if (musicBeatsIn != null) {
                label_0079 :
                   a.o(musicBeatsIn, "beatsInfo?.mDownbeats ?: \"\"");
                   str1 = ",";
                   String[] stringArray = new String[]{str1};
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = StringsKt__StringsKt.H4(musicBeatsIn1, stringArray, false, 0, 6, null).iterator();
                   while (iterator.hasNext()) {
                      obj = s.H0(iterator.next());
                      if (obj != null) {
                         uArrayList.add(obj);
                      }
                   }
                   String[] stringArray1 = new String[]{str1};
                   ArrayList uArrayList1 = new ArrayList();
                   Iterator iterator1 = StringsKt__StringsKt.H4(musicBeatsIn, stringArray1, false, 0, 6, null).iterator();
                   while (iterator1.hasNext()) {
                      Double uDouble = s.H0(iterator1.next());
                      if (uDouble != null) {
                         uArrayList1.add(uDouble);
                      }
                   }
                   c uoc = p2.J0();
                   a.m(uoc);
                   TimeRange timeRange = u.i(uoc);
                   a.m(timeRange);
                   Pair first = PostExperimentUtils.d0().first;
                   Pair second = PostExperimentUtils.d0().second;
                   double d = timeRange.getStart() + timeRange.getDuration();
                   Pair obj3 = PatchProxy.applyTwoRefs(uArrayList, uArrayList1, null, MusicDraftUtilsKt.class, "6");
                   String str2 = "maxDur";
                   if (obj3 != PatchProxyResult.class) {
                      uArrayList1 = obj3;
                   }else {
                      Pair pair1 = 2;
                      if (uArrayList.size() >= pair1 && uArrayList1.size() >= pair1) {
                         obj3 = PostExperimentUtils.d0();
                         pair1 = obj3.first;
                         obj3 = obj3.second;
                         double d3 = uArrayList.get(str).doubleValue() - uArrayList.get(uoa).doubleValue();
                         int i = (int)(((uArrayList1.get(str).doubleValue() - uArrayList1.get(uoa).doubleValue()) / d3) + 0x3fe0000000000000);
                         a.o(obj3, str2);
                         pair = second;
                         if (d3 - (double)obj3.floatValue() < 0) {
                            i1 = 1;
                            d2 = (double)i1 * d3;
                            a.o(pair1, "minDur");
                            str3 = str2;
                            d1 = d;
                            while (d2 - (double)pair1.floatValue() < 0) {
                               i1 = i1 + 1;
                               str2 = str3;
                               d = d1;
                            }
                            d2 = (double)i1 * d3;
                            while (d2 - (double)obj3.floatValue() > 0) {
                               i1 = i1 - 1;
                            }
                            int i2 = i % i1;
                            while (i2 && i1 > 1) {
                               i1 = i1 - 1;
                            }
                            if ((d3 * (double)i1) - (double)pair1.floatValue() < 0) {
                               do {
                                  i1 = i1 + 1;
                                  i2 = i % i1;
                               } while (i2 && i1 < i);
                            }
                         }else {
                            d1 = d;
                            str3 = str2;
                            i1 = 1;
                         }
                         Iterator obj5 = uArrayList.iterator();
                         int i3 = 0;
                         int i4 = 0;
                         while (obj5.hasNext()) {
                            obj1 = obj5.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            if (!obj1.doubleValue() - uArrayList1.get(0).doubleValue()) {
                               i3 = i4;
                               break ;
                            }
                            i3 = i4;
                            i4 = i5;
                         }
                         if (i3 > i) {
                            i3 = 0;
                         }
                         uArrayList1 = CollectionsKt___CollectionsKt.W4(uArrayList, q.S0(q.n1(i3, uArrayList.size()), i1));
                      label_0209 :
                         Object[] objArray = new Object[0];
                         a.D().s("MusicUtils", "generatedTransPoints: "+uArrayList1, objArray);
                         ArrayList uArrayList2 = new ArrayList();
                         Iterator iterator2 = uArrayList1.iterator();
                         while (iterator2.hasNext()) {
                            obj4 = iterator2.next();
                            d2 = obj4.doubleValue();
                            a.o(first, "minDur");
                            d = timeRange.getStart() + (double)first.floatValue();
                            obj5 = (d2 - d >= 0 && d2 - d1 <= 0)? 1: null;
                            if (obj5) {
                               uArrayList2.add(obj4);
                            }
                         }
                         List list = CollectionsKt___CollectionsKt.J5(uArrayList2);
                         if ((list.isEmpty() ^ 1) && CollectionsKt___CollectionsKt.Y2(list).doubleValue() - d1) {
                            second = pair;
                            a.o(second, str3);
                            if ((d1 - CollectionsKt___CollectionsKt.Y2(list).doubleValue()) - (double)second.floatValue() < 0) {
                               list.add(Double.valueOf(d1));
                            }
                         }
                         obj4 = new Object[0];
                         a.D().s("MusicUtils", "filteredTransPoints: "+list, obj4);
                         p1.copyOnWrite();
                         p1.instance.addAllTransPoints(list);
                         return;
                      }
                   }
                   pair = second;
                   d1 = d;
                   str3 = str2;
                   goto label_0209 ;
                }
             }
             String str4 = str1;
             goto label_0079 ;
          }
       }
       musicBeatsIn1 = str1;
       goto label_006c ;
    }
    public static final boolean w(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicDraftUtilsKt.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       if (MusicDraftUtilsKt.o(p0)) {
          return MusicDraftUtilsKt.l(p0);
       }
       boolean b = (p0.a1() != Workspace$Type.LONG_PICTURE && (p0.a1() != Workspace$Type.SINGLE_PICTURE && p0.a1() != Workspace$Type.ATLAS))? true: false;
       return b;
    }
    public static final Pair x(c p0){
       boolean b3;
       Integer integer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       Music music = null;
       a obj = PatchProxy.applyOneRefs(p0, music, musicDraftUt, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       obj = p0.g1();
       OriginalVoice originalVoic = (obj != null)? obj.v(): music;
       boolean b = MusicDraftUtilsKt.p(p0);
       boolean b1 = DraftUtils.T(p0);
       float f = 0;
       boolean b2 = false;
       if (originalVoic != null) {
          List audioAssetsL = originalVoic.getAudioAssetsList();
          a.o(audioAssetsL, "originalVoice.audioAssetsList");
          int i1 = originalVoic.getMuteTrackAssets() ^ 1;
          if (audioAssetsL.isEmpty() && (!i1 || (b && !b1))) {
             float volume = originalVoic.getVolume();
             b = 1;
          label_0054 :
             c uoc = p0.J0();
             String obj1 = PatchProxy.applyOneRefs(uoc, music, musicDraftUt, "29");
             if (obj1 != patchProxyRe) {
                b3 = obj1.booleanValue();
             }else if(w6.e(uoc) != null){
                b3 = true;
             }else {
                b3 = false;
             }
             if (b3) {
                music = w6.e(uoc);
             }
             Workspace$Type type = p0.a1();
             obj1 = "workspaceDraft.type";
             a.o(type, obj1);
             if (!MusicDraftUtilsKt.k(type)) {
                integer = (music != null)? 1: null;
                if (music != null) {
                   f = music.getVolume();
                }
             }else if(music != null || b){
                integer = 1;
             }else {
                integer = null;
             }
             if (music != null) {
                f = music.getVolume();
             }else {
                f = originalVoic;
             }
             Workspace$Type type1 = p0.a1();
             a.o(type1, obj1);
             int i = (MusicDraftUtilsKt.k(type1))? 2: 1;
             i = (int)(((float)200 * f) / (float)i);
             if (integer && MusicDraftUtilsKt.m(p0)) {
                b2 = true;
             }
             return new Pair(Boolean.valueOf(b2), Integer.valueOf(i));
          }
       }
       originalVoic = 0;
       b = 0;
       goto label_0054 ;
    }
}
