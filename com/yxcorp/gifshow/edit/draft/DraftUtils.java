package com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import com.kuaishou.edit.draft.Workspace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Music;
import wba.u;
import com.kuaishou.edit.draft.Song;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.gifshow.edit.draft.DraftUtils$a;
import com.kuaishou.edit.draft.Music$Type;
import java.lang.Enum;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam;
import com.kuaishou.edit.draft.ImportMusicParam;
import java.lang.Number;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.Timestamp;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import haa.f;
import q87.c;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.edit.draft.Privacy$Type;
import com.kuaishou.edit.draft.Privacy$b;
import com.kuaishou.edit.draft.Privacy;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FriendVisiableInfo$b;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish$b;
import fba.a;
import java.lang.Boolean;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Sticker;
import vaa.a;
import laa.e;
import iba.a;
import iba.f;
import com.kuaishou.edit.draft.Theme;
import haa.a;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.Kuaishan$TemplateType;
import eba.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$From;
import qr4.i;
import qr4.m$k0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Sticker$Type;
import qr4.m$p;
import g26.d;
import com.kuaishou.edit.draft.Kuaishan$TemplateLinkType;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.kuaishou.edit.draft.EditConfig;
import java.lang.StringBuilder;
import wba.p0;
import com.kuaishou.edit.draft.Workspace$b;
import k2b.u1;
import com.kuaishou.edit.draft.SessionContext;
import com.kuaishou.edit.draft.SessionContext$b;
import qaa.a;
import com.kuaishou.edit.draft.Cover;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import android.graphics.Bitmap;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import maa.a;
import com.kuaishou.edit.draft.Asset$Type;
import com.kuaishou.edit.draft.Asset$b;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.kuaishou.edit.draft.FeatureId$b;
import mba.m0;
import java.util.Arrays;
import com.kuaishou.edit.draft.Shoot;
import com.kuaishou.edit.draft.Shoot$RecordMode;
import wba.s;
import java.util.Objects;
import com.kuaishou.edit.draft.CommonScene;
import java.lang.Integer;
import lnc.i1;
import com.kuaishou.edit.draft.AssetTransition;
import java.lang.Double;
import com.kuaishou.edit.draft.AssetTransition$b;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import java.lang.Float;
import android.graphics.RectF;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$Type;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.VoteStickerParam$b;
import com.kuaishou.edit.draft.VoteStickerParam;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Attributes$b;
import a26.a;
import java.lang.System;
import com.google.protobuf.Timestamp$Builder;
import java.util.Date;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import kotlin.Pair;
import com.kuaishou.edit.draft.Asset;
import laa.m0;
import w46.b;
import brd.t;
import java.util.ArrayList;
import haa.c;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.kuaishou.edit.draft.KuaishanAsset;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.media.buffer.a;
import java.lang.Math;
import z30.y0;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.kuaishou.edit.draft.KaraokeMixing;
import com.kuaishou.edit.draft.VoiceChange;
import com.kuaishou.edit.draft.KaraokeClip;
import java.util.Collection;
import ekd.q;
import yaa.c;
import java.util.Set;
import java.util.Map;
import com.yxcorp.gifshow.edit.draft.model.workspace.d;
import ekd.q$a;

public final class DraftUtils	// class@001ae1
{
    public static final SimpleDateFormat a;
    public static String b;

    static {
       DraftUtils.a = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
       DraftUtils.b = "unknown";
    }
    public void DraftUtils(){
       super();
    }
    public static File A(File p0,Workspace p1){
       Music obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p1.getMusicsCount()) {
          return null;
       }
       Iterator iterator = p1.getMusicsList().iterator();
       obj = null;
       while (iterator.hasNext()) {
          Music music = iterator.next();
          if (!u.j(music)) {
             obj = music;
          }
       }
       if (obj == null) {
          return null;
       }
       Song song = DraftUtils.B(obj);
       if (song != null && (!TextUtils.x(song.getFile()) && !URLUtil.isNetworkUrl(song.getFile()))) {
          return new File(p0, song.getFile());
       }
       return null;
    }
    public static Song B(Music p0){
       Song song = null;
       Object obj = PatchProxy.applyOneRefs(p0, song, DraftUtils.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return song;
       }
       int i = DraftUtils$a.a[p0.getType().ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return song;
             }else if(p0.getOnlineParam().hasSong()){
                song = p0.getOnlineParam().getSong();
             }
             return song;
          }else if(p0.getOperationParam().hasSong()){
             song = p0.getOperationParam().getSong();
          }
          return song;
       }else if(p0.getImportParam().hasSong()){
          song = p0.getImportParam().getSong();
       }
       return song;
    }
    public static long C(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return DraftUtils.l0(p0.getAttributes().getCreatedAt());
    }
    public static void D(c p0){
       Object[] obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, DraftUtils.class, "79")) {
          return;
       }
       String str = "DraftUtils";
       int i = 0;
       if (p0 == null) {
          obj = new Object[i];
          f.D().w(str, "handlePublishDraftForFriendsVisibility: workSpaceDraft is null", obj);
          return;
       }else {
          Object[] objArray = new Object[i];
          f.D().w(str, "handlePublishDraftForFriendsVisibility", objArray);
          PhotoVisibility fRIENDS = PhotoVisibility.FRIENDS;
          VideoContext videoContext = p0.d1();
          Privacy$b uob = Privacy.newBuilder();
          uob.a(Privacy$Type.FRIENDS);
          Privacy privacy = uob.build();
          FriendVisiableInfo$b uob1 = FriendVisiableInfo.newBuilder();
          uob1.a(FriendVisiableInfo$Type.DEFAULT);
          FriendVisiableInfo uFriendVisia = uob1.build();
          b uob2 = p0.Q0();
          if (uob2.v() == null) {
             Object[] objArray1 = new Object[i];
             f.D().w(str, "handlePublishDraftForFriendsVisibility: updatePrivacy ", objArray1);
             uob2.c0();
             Publish$b uob3 = uob2.k();
             uob3.i(privacy);
             uob3.f(uFriendVisia);
             uob2.g(i);
          }
          videoContext.B1(fRIENDS, obj, i);
          return;
       }
    }
    public static boolean E(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.v() != null && (!TextUtils.x(p0.v().getFeatureId().getExternal()) && !TextUtils.n(p0.v().getFeatureId().getExternal(), "-1"))) {
          b = true;
       }
    label_0049 :
       return b;
    }
    public static boolean F(GeneratedMessageLite p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof Sticker) {
          return b;
       }
       if (p0.hasVoteStickerParam() || p0.hasRelayStickerParam()) {
          b = true;
       }
       return b;
    }
    public static boolean G(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.u() != null)? true: false;
       return b;
    }
    public static boolean H(a p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, DraftUtils.class, "77");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          obj = PatchProxy.apply(obj, p0, a.class, "4");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(p0.u() != null && (p0.u().h() != null && p0.u().h().hasFeatureId())){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0054 :
             return b;
          }
       }
       b = false;
       goto label_0054 ;
    }
    public static boolean I(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       a uoa = a.m(p0);
       if (uoa.v() != null && uoa.v().getTemplateType() == Kuaishan$TemplateType.SHIMMER) {
          b = true;
       }
       return b;
    }
    public static boolean J(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       Iterator iterator = a.q(p0).z().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().hasVoteStickerParam()) {
             break ;
          }
       }
       return true;
    }
    public static boolean K(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.a1() == Workspace$Type.AI_CUT || (p0.a1() == Workspace$Type.ALBUM_MOVIE && p0.T0() == Workspace$Source.AI_CUT_STYLE)) {
          b = true;
       }
       return b;
    }
    public static boolean L(Workspace$Source p0){
       boolean b = (p0 == Workspace$Source.ANNUAL_ALBUM_2022 || p0 == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL)? true: false;
       return b;
    }
    public static boolean M(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.B0() == Workspace$From.MEDIA_SENCE_COMMON)? true: false;
       return b;
    }
    public static boolean N(c p0){
       m$k0 l1;
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          i b1 = p0.d1().a.b;
          b1 = (b1 == null)? 0: b1.l1;
          if (b1 != null) {
             b = true;
          }
       }
       return b;
    }
    public static boolean O(QPhoto p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && DraftUtils.N(p1))? true: false;
       return b;
    }
    public static boolean P(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022 || p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
          b = true;
       }
       return b;
    }
    public static boolean Q(Sticker$Type p0){
       boolean b = (p0 != Sticker$Type.VOTE_STICKER && (p0 == Sticker$Type.VOTE_STICKER_THREE || p0 == Sticker$Type.RELAY_STICKER))? true: false;
       return b;
    }
    public static boolean R(c p0){
       Object[] objArray;
       String obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "DraftUtils";
       if (p0 == null) {
          objArray = new Object[0];
          f.D().A(obj, "isMultiToOneServerEffectTemplate\(\) no workspacedraft", objArray);
          return 0;
       }else {
          m$p op = p0.d1().u();
          if (op != null) {
             return d.c(String.valueOf(op.c));
          }
          objArray = new Object[0];
          f.D().w(obj, "isMultiToOneServerEffectTemplate\(\) no kuaishanVideo", objArray);
          return 0;
       }
    }
    public static boolean S(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.a1() == Workspace$Type.AI_CUT && p0.T0() == Workspace$Source.MUSIC_TEMPLATE))? true: false;
       return b;
    }
    public static boolean T(c p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftUtils uDraftUtils = DraftUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uDraftUtils, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || p0.a1() != Workspace$Type.PHOTO_MOVIE) {
          return b;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, null, uDraftUtils, "15");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a uoa = a.a(p0);
          if (a.m(p0).v() == null && !DraftUtils.E(uoa)) {
             b = 1;
          }
          b1 = b;
       }
       return b1;
    }
    public static boolean U(c p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.a1() != Workspace$Type.PHOTO_MOVIE) {
          obj = new Object[i];
          f.D().w("DraftUtils", "isPhotoMovieUseStyle\(\) not photomovie, skip", obj);
          return i;
       }else {
          a uoa = p0.n0();
          if (uoa == null) {
             obj = new Object[i];
             f.D().w("DraftUtils", "isPhotoMovieUseStyle\(\) no styleDraft, skip", obj);
             return i;
          }else {
             AICutTheme uAICutTheme = uoa.v();
             if (uAICutTheme == null) {
                obj = new Object[i];
                f.D().w("DraftUtils", "isPhotoMovieUseStyle\(\) no aicutTheme, skip", obj);
                return i;
             }else if(uAICutTheme.hasFeatureId() && (!TextUtils.x(uAICutTheme.getFeatureId().getExternal()) && !TextUtils.n(uAICutTheme.getFeatureId().getExternal(), "-1"))){
                i = true;
             }
          label_0076 :
             return i;
          }
       }
    }
    public static boolean V(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Workspace$Type type = p0.a1();
       boolean b = (type != Workspace$Type.ATLAS && (type == Workspace$Type.LONG_PICTURE || type == Workspace$Type.SINGLE_PICTURE))? true: false;
       return b;
    }
    public static boolean W(QPhoto p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !DraftUtils.N(p1))? true: false;
       return b;
    }
    public static boolean X(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (DraftUtils.R(p0)) {
          return true;
       }
       if (DraftUtils.f0(p0)) {
          return true;
       }
       a uoa = p0.F0();
       if (uoa != null && (uoa.v() != null && uoa.v().getLinkType() == Kuaishan$TemplateLinkType.V2)) {
          b = true;
       }
    label_0042 :
       return b;
    }
    public static boolean Y(c p0){
       Workspace$Source obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.T0();
       Workspace$From uFrom = p0.B0();
       Phase phase = p0.M0();
       boolean b = true;
       boolean b1 = (p0.v() != null && (p0.v().hasEditConfig() && p0.v().getEditConfig().getDisableRecover()))? true: false;
       Object[] objArray = new Object[0];
       f.D().w("DraftUtils", "isSkipRecover disableRecover:"+b1, objArray);
       if (b1 || (obj == Workspace$Source.REEDIT || (obj == Workspace$Source.INTOWN || (obj == Workspace$Source.SHOP || (obj == Workspace$Source.JUXING || (obj == Workspace$Source.OPEN_PLATFORM_MAGIC_MODE || (p0.a(obj) || (uFrom == Workspace$From.PROFILE_BACKGROUND || (obj == Workspace$Source.IM_MESSAGE && ((p0.p0()).equals("IM_MESSAGE_HAS_PUBLISHED") || (uFrom == Workspace$From.IM_SEND_MESSAGE && (obj == Workspace$Source.CAPTURE || (uFrom == Workspace$From.IM_SEND_MESSAGE_WHATS_UP && (obj != Workspace$Source.CAPTURE && (uFrom != Workspace$From.IM_TAKE_IN_SAME || (obj != Workspace$Source.CAPTURE || phase != Phase.CREATE)))))))))))))))) {
          b = false;
       }
    label_00b1 :
       return b;
    }
    public static boolean Z(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.a1() == Workspace$Type.ALBUM_MOVIE && p0.T0() == Workspace$Source.AI_CUT_STYLE)? true: false;
       return b;
    }
    public static void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DraftUtils.class, "50")) {
          return;
       }
       DraftUtils.b(p0, "");
       return;
    }
    public static boolean a0(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Workspace$Type type = p0.a1();
       boolean b = (type != Workspace$Type.VIDEO && (type != Workspace$Type.KTV_MV && (type != Workspace$Type.LONG_VIDEO && (type != Workspace$Type.PHOTO_MOVIE && (type != Workspace$Type.KUAISHAN && (type == Workspace$Type.ALBUM_MOVIE || type == Workspace$Type.AI_CUT))))))? true: false;
       return b;
    }
    public static void b(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DraftUtils.class, "51")) {
          return;
       }
       Workspace$b uob = p0.k();
       String taskId = uob.getTaskId();
       if (TextUtils.x(p1)) {
          p1 = u1.f();
       }
       uob.r(p1);
       SessionContext$b uob1 = uob.getSessionContext().toBuilder();
       uob1.copyOnWrite();
       uob1.instance.addHistoryTaskId(taskId);
       uob.copyOnWrite();
       uob.instance.setSessionContext(uob1);
       Object[] objArray = new Object[0];
       f.D().w("historyTaskId", "addNewTaskId "+p1+",oldTaskId:"+taskId, objArray);
       return;
    }
    public static boolean b0(c p0){
       Object[] objArray1;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("DraftUtils", "needGenerateCover", objArray);
       if (p0.T0() == Workspace$Source.REEDIT) {
          obj = new Object[i];
          f.D().w("DraftUtils", "needGenerateCover is reedit", obj);
          return i;
       }else {
          boolean b = true;
          if (DraftUtils.y(p0) - DraftUtils.s(p0) > 0) {
             objArray1 = new Object[i];
             f.D().w("DraftUtils", "needGenerateCover cover change", objArray1);
             return b;
          }else {
             a uoa = p0.s0();
             if (uoa == null) {
                objArray1 = new Object[i];
                f.D().w("DraftUtils", "needGenerateCover cover null one", objArray1);
                return b;
             }else {
                Cover uCover = uoa.v();
                if (uCover == null) {
                   objArray1 = new Object[i];
                   f.D().w("DraftUtils", "needGenerateCover cover null two", objArray1);
                   return b;
                }else {
                   String outputFile = uCover.getOutputFile();
                   Object[] objArray2 = new Object[i];
                   f.D().w("DraftUtils", "needGenerateCover coverFile:"+outputFile, objArray2);
                   if (TextUtils.x(outputFile)) {
                      return b;
                   }
                   Bitmap uBitmap = DraftFileManager.E().z(outputFile, uoa);
                   Object[] objArray3 = new Object[i];
                   f.D().w("DraftUtils", "needGenerateCover effectiveBitmap:"+uBitmap, objArray3);
                   if (uBitmap != null) {
                      return i;
                   }
                   File uFile = DraftFileManager.E().B(outputFile, uoa);
                   if (uFile == null || !uFile.exists()) {
                      PostUtils.D("DraftUtils", "cover file not exist:"+uFile, new IllegalStateException("cover file not exist:"+uFile));
                      return b;
                   }else if(!uFile.length()){
                      PostUtils.D("DraftUtils", "cover file is empty:"+uFile, new IllegalStateException("cover file is empty:"+uFile));
                      return b;
                   }else {
                      obj = new Object[i];
                      f.D().w("DraftUtils", "needGenerateCover false", obj);
                      return i;
                   }
                }
             }
          }
       }
    }
    public static void c(a p0,Asset$Type p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DraftUtils.class, "58")) {
          return;
       }
       Asset$b uob = p0.b();
       uob.w(p1);
       uob.k(w0.c(new File(p2)).toString());
       uob.d(p2);
       return;
    }
    public static FeatureId c0(InternalFeatureId p0){
       FeatureId$b obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeatureId.newBuilder();
       obj.b(p0);
       return obj.build();
    }
    public static boolean d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p0.u() != null && (p0.v().getType() == Workspace$Type.KUAISHAN && (p0.b1() == Workspace$Type.VIDEO || p0.b1() == Workspace$Type.LONG_VIDEO)))) {
          b = true;
       }
    label_003d :
       return b;
    }
    public static FeatureId d0(String p0){
       FeatureId$b obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeatureId.newBuilder();
       obj.a(p0);
       return obj.build();
    }
    public static boolean e(c p0){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftUtils uDraftUtils = DraftUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uDraftUtils, "66");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!DraftUtils.d(p0)) {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, uDraftUtils, "67");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p0.u() != null && (p0.a1() == Workspace$Type.KUAISHAN && (p0.b1() == Workspace$Type.AI_CUT || p0.b1() == Workspace$Type.ALBUM_MOVIE))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
             Object obj2 = PatchProxy.applyOneRefs(p0, null, uDraftUtils, "69");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(p0.u() == null || (DraftUtils.l(p0) && (p0.a1() == Workspace$Type.PHOTO_MOVIE && p0.F0() != null))){
                b2 = true;
             }else {
                b2 = false;
             }
             if (!b2) {
             label_0083 :
                return b;
             }
          }
       }
    label_0082 :
       b = true;
       goto label_0083 ;
    }
    public static boolean e0(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       m0 om0 = p0.u();
       if (om0 == null) {
          return true;
       }
       Iterator iterator = om0.o().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (iterator.next().G()) {
             break ;
          }
       }
       return false;
    }
    public static boolean f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       Workspace workspace = p0.v();
       if (workspace != null) {
          Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.LONG_VIDEO,Workspace$Type.VIDEO};
          if (Arrays.asList(typeArray).contains(workspace.getType()) && (workspace.getSource() == Workspace$Source.CAPTURE && (workspace.getShoot().getRecordMode() != Shoot$RecordMode.UNKNOWN && (!workspace.getShoot().getIsSnapShot() && !workspace.getAssetsList().isEmpty())))) {
             s a = s.a;
             Objects.requireNonNull(a);
             Object obj1 = PatchProxy.applyOneRefs(p0, a, s.class, "1");
             boolean b1 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.d(p0, 1);
             if (!b1) {
                b = true;
             }
          }
       }
    label_007f :
       return b;
    }
    public static boolean f0(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!DraftUtils.M(p0)) {
          return b;
       }
       Workspace workspace = p0.v();
       if (workspace != null && workspace.getCommonScene().getRequireAlbum()) {
          b = true;
       }
       return b;
    }
    public static void g(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DraftUtils.class, "74")) {
          return;
       }
       boolean b = p0.D();
       if (!b) {
          p0.c0();
       }
       p0.d();
       if (!b) {
          p0.g(true);
       }
       return;
    }
    public static boolean g0(int p0,c p1){
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uDraftUtils, "73");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == null) {
          i1.a("DraftUtils", "baseDraft == null");
          Object[] objArray = new Object[0];
          f.D().A("DraftUtils", "baseDraft == null", objArray);
          return 0;
       }else if(p0){
          if (p0 != 1) {
             if (p0 == 2 && p1.D()) {
                p1.j();
                return 1;
             }
          }else if(p1.D()){
             p1.f();
             return 1;
          }
       }else if(!p1.D()){
          p1.c0();
          return 1;
       }
       return 0;
    }
    public static AssetTransition h(int p0,double p1){
       AssetTransition$b obj;
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Double.valueOf(p1), null, uDraftUtils, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          Object[] objArray = new Object[0];
          f.D().w("DraftUtils", "createAssetTransition: type="+p0+" duration="+p1, objArray);
          p1 = 0;
       }
       obj = AssetTransition.newBuilder();
       obj.b(p0);
       obj.a(p1);
       return obj.build();
    }
    public static void h0(VoteInfo p0,Bitmap p1,float p2,c p3,Sticker$Type p4){
       float f1;
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uDraftUtils, "56")) {
             return;
          }
       }
       if (p0 != null && p1 != null) {
          a uoa = a.q(p3);
          uoa.c0();
          RectF position = p0.getPosition();
          RectF rectF = 0x3f000000;
          if (position != null) {
             float f = 2.00f;
             rectF = position.left + (position.width() / f);
             f1 = (position.height() / f) + position.top;
          }else {
             f1 = 0x3f000000;
          }
          Sticker$b uob = uoa.b();
          FeatureId$b uob1 = FeatureId.newBuilder();
          uob1.b(InternalFeatureId.STICKER_VOTE_0);
          uob.f(uob1.build());
          uob.j(p4);
          StickerResult$b uob2 = StickerResult.newBuilder();
          uob2.u(StickerResult$Type.VIDEO);
          uob2.m(uoa.O(p1, ".png", DraftFileManager.l));
          TimeRange$b uob3 = TimeRange.newBuilder();
          uob3.b((double)((float)p0.mStartTime / 1000.00f));
          uob3.a((double)((float)(p0.mEndTime - p0.mStartTime) / 1000.00f));
          uob2.o(uob3.build());
          uob2.f(rectF);
          uob2.g(f1);
          uob2.t(p2);
          uob2.v(0x3f800000);
          uob.i(uob2.build());
          VoteStickerParam$b uob4 = VoteStickerParam.newBuilder();
          uob4.a(p0.mOptions);
          uob4.d(p0.mQuestion);
          uob.o(uob4.build());
          uoa.g(0);
       }
       return;
    }
    public static Attributes i(){
       Attributes$b obj = PatchProxy.apply(null, null, DraftUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Attributes.newBuilder();
       obj.copyOnWrite();
       obj.instance.setCreatedAt(DraftUtils.j0());
       obj.a(DraftUtils.j0());
       obj.copyOnWrite();
       obj.instance.setAppVersion(DraftUtils.b);
       return obj.build();
    }
    public static boolean i0(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       int i = (p0 != null && (p0.v() != null && p0.v().getIsAssetEditedByUser()))? 1: 0;
       if (!DraftUtils.S(p0) || i) {
          b = false;
       }
       return b;
    }
    public static c j(a p0){
       Workspace$Type sINGLE_PICTU;
       a obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.b;
       if (obj == Workspace$Type.KTV_SONG) {
          sINGLE_PICTU = Workspace$Type.SINGLE_PICTURE;
       }else if(obj != Workspace$Type.SINGLE_PICTURE && (obj != Workspace$Type.ATLAS && (obj != Workspace$Type.LONG_PICTURE && (obj != Workspace$Type.KTV_MV && obj != Workspace$Type.ALBUM_MOVIE)))){
          sINGLE_PICTU = Workspace$Type.VIDEO;
       }
    label_002f :
       return DraftFileManager.E().f(sINGLE_PICTU, Workspace$Source.REEDIT, p0.e(), null);
    }
    public static Timestamp j0(){
       Object obj = PatchProxy.apply(null, null, DraftUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = System.currentTimeMillis();
       return Timestamp.newBuilder().setSeconds((l / 1000)).setNanos((int)((l % 1000) * 0xf4240)).build();
    }
    public static TimeRange k(double p0,double p1){
       TimeRange$b obj;
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), null, uDraftUtils, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = TimeRange.newBuilder();
       obj.b(p0);
       obj.a((p1 - p0));
       return obj.build();
    }
    public static String k0(Timestamp p0){
       SimpleDateFormat obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DraftUtils.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return obj.format(new Date(DraftUtils.l0(p0)));
    }
    public static boolean l(c p0){
       Workspace$Type obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.a1();
       Workspace$Type type = p0.b1();
       if (obj != Workspace$Type.PHOTO_MOVIE) {
          Workspace$Type vIDEO = Workspace$Type.VIDEO;
          if (obj != vIDEO) {
             Workspace$Type lONG_VIDEO = Workspace$Type.LONG_VIDEO;
             if (obj == lONG_VIDEO || (type != vIDEO && type != lONG_VIDEO)) {
                return false;
             }
          }
       }
       return true;
    }
    public static long l0(Timestamp p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((p0.getSeconds() * 1000) + ((long)p0.getNanos() / 0xf4240));
    }
    public static boolean m(FeatureId p0,FeatureId p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getInternal() == InternalFeatureId.UNKNOWN || (p0.getInternal() == p1.getInternal() || (!TextUtils.x(p0.getExternal()) && (p0.getExternal()).equals(p1.getExternal()))))? true: false;
       return b;
    }
    public static Attributes m0(Attributes p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Attributes$b uob = p0.toBuilder();
       uob.a(DraftUtils.j0());
       return uob.build();
    }
    public static Pair n(c p0,KuaishanAsset$b p1){
       Asset uAsset;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 == null || p1 == null) {
          Object[] objArray = new Object[i];
          f.D().A("DraftUtils", "findAssetFromKuaishanAsset: workspaceDraft or ksAsset is null", objArray);
          return new Pair(Integer.valueOf(-1), null);
       }else {
          a uoa = a.c(p0);
          while (true) {
             if (i >= uoa.z().size()) {
                return new Pair(Integer.valueOf(-1), null);
             }
             uAsset = uoa.y(i);
             File uFile = DraftFileManager.E().H(p0);
             String albumId = (new File(uAsset.getAlbumId()).exists())? uAsset.getAlbumId(): new File(uFile, uAsset.getFile()).getAbsolutePath();
             if (TextUtils.n(albumId, p1.getAssetId())) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return new Pair(Integer.valueOf(i), uAsset);
       }
    }
    public static boolean n0(Workspace$Source p0){
       boolean b = (p0 == Workspace$Source.IMPORT_MIXED || p0 == Workspace$Source.VIDEO_SOLITAIRE)? true: false;
       return b;
    }
    public static boolean o(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.d1().F().b != null && p0.d1().F().b.G != null)? true: false;
       return b;
    }
    public static boolean o0(c p0,boolean p1){
       Workspace obj;
       Object[] objArray;
       Object[] objArray1;
       Asset uAsset1;
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uDraftUtils, "43");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.v();
       if (obj == null) {
          objArray = new Object[0];
          f.D().A("DraftUtils", "validateAssetFiles, workspace is null.", objArray);
          return 0;
       }else {
          boolean b = true;
          if (p1 && DraftFileManager.E().H(p0).exists()) {
             objArray1 = new Object[0];
             f.D().A("DraftUtils", "validateAssetFiles, has origin, ignore "+obj.getIdentifier(), objArray1);
             return b;
          }else if(obj.getType() == Workspace$Type.KUAISHAN){
             objArray1 = new Object[0];
             f.D().A("DraftUtils", "validateAssetFiles, ignore kuaishan "+obj.getIdentifier(), objArray1);
             return b;
          }else {
             Object[] objArray2 = new Object[0];
             f.D().s("DraftUtils", "validateAssetFiles, directory "+p0.f0(), objArray2);
             List assetsList = obj.getAssetsList();
             if (assetsList.isEmpty()) {
                objArray = new Object[0];
                f.D().A("DraftUtils", "validateAssetFiles, asset list is empty.", objArray);
                return 0;
             }else {
                Iterator iterator = assetsList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Asset uAsset = iterator.next();
                      if (uAsset.getSubAssetCount() > 0) {
                         Iterator iterator1 = uAsset.getSubAssetList().iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               uAsset1 = iterator1.next();
                               File uFile = DraftFileManager.E().B(uAsset1.getFile(), p0);
                               if (uFile == null || !uFile.exists()) {
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                         objArray = new Object[0];
                         f.D().s("DraftUtils", "validateAssetFiles, OK", objArray);
                         return b;
                      }else {
                         File uFile1 = DraftFileManager.E().B(uAsset.getFile(), p0);
                         if (uFile1 == null || !uFile1.exists()) {
                            objArray1 = new Object[0];
                            f.D().t("DraftUtils", "validateAssetFiles, asset file does not exist: "+uAsset.getFile(), objArray1);
                            return 0;
                         }
                      }
                   }else {
                      goto label_0150 ;
                   }
                }
                objArray1 = new Object[0];
                f.D().t("DraftUtils", "validateAssetFiles, subAsset file does not exist: "+uAsset1.getFile(), objArray1);
                return 0;
             }
          }
       }
    }
    public static t p(c p0){
       a obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.o0();
       ArrayList uArrayList = new ArrayList();
       if (obj == null) {
          return t.just(uArrayList);
       }
       List list = obj.z();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Asset uAsset = iterator.next();
          if (uAsset.getDuration() > 0) {
             uArrayList.add(Double.valueOf(uAsset.getDuration()));
          }
       }
       if (!uArrayList.isEmpty()) {
          return t.just(uArrayList);
       }
       return t.fromCallable(new c(list, obj, p0, uArrayList)).subscribeOn(d.c).observeOn(d.a);
    }
    public static File q(c p0,File p1,Workspace p2){
       File uFile;
       Kuaishan obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, DraftUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2.getCoversCount() > 0) {
          if (!TextUtils.x(p2.getCovers(0).getOutputFile())) {
             return new File(p1, p2.getCovers(0).getOutputFile());
          }else if(!TextUtils.x(p2.getCovers(0).getOriginalFrameFile())){
             return new File(p1, p2.getCovers(0).getOriginalFrameFile());
          }
       }
       if (p2.hasKuaishan()) {
          obj = p2.getKuaishan();
          if (!TextUtils.x(obj.getProfileImageLocalPath())) {
             uFile = new File(p1, obj.getProfileImageLocalPath());
             if (uFile.exists()) {
                return uFile;
             }
          }
          if (obj.getAssetsCount() > 0) {
             String previewImage = obj.getAssets(0).getResult().getPreviewImageFile();
             if (!TextUtils.x(previewImage)) {
                return new File(p1, previewImage);
             }
          }
       }
    label_0094 :
       Object[] objArray = new Object[0];
       f.D().w("DraftUtils", "getCoverFile", objArray);
       uFile = null;
       if (p2.getAssetsCount() > 0) {
          Asset assets = p2.getAssets(0);
          if (assets == null) {
             ExceptionHandler.handleCaughtException(new RuntimeException("firstAsset is null"));
             return uFile;
          }else if(TextUtils.x(assets.getFile())){
             Object[] objArray1 = new Object[]{"firstAsset.getFile is empty"};
             f.D().w("DraftUtils", "getCoverFile", objArray1);
             return uFile;
          }else {
             File uFile1 = new File(p1, assets.getFile());
             if (p0 != null) {
                uFile1 = DraftFileManager.E().B(assets.getFile(), a.c(p0));
             }
             if ((assets.getFile()).endsWith(".bfr")) {
                try{
                   a uoa = new a(uFile1.getAbsolutePath());
                   uoa.close();
                   return new File(uoa.d(0));
                }catch(java.io.IOException e6){
                   f.D().z(v3, "error", e6);
                }
                Object[] objArray2 = new Object[v1];
                f.D().w(v3, "getCoverFile assetFile:"+uFile1, objArray2);
                return uFile1;
             }else {
                goto label_0119 ;
             }
          }
       }else {
          return uFile;
       }
    }
    public static File r(File p0,Workspace p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftUtils.q(null, p0, p1);
    }
    public static long s(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       a uoa = p0.s0();
       if (uoa != null) {
          Iterator iterator = uoa.z().iterator();
          while (iterator.hasNext()) {
             l = Math.max(l, DraftUtils.l0(iterator.next().getAttributes().getModifiedAt()));
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftUtils", "getCoverLastModifiedMills result:"+l, objArray);
       return l;
    }
    public static File t(StickerResult p0,c p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DraftFileManager.E().B(p0.getOutputImageFile(), p1);
       if (obj == null) {
          obj = DraftFileManager.E().B(p0.getPreviewImageFile(), p1);
       }
       return obj;
    }
    public static long u(y0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max(Math.max(Math.max(Math.max(Math.max(0, DraftUtils.l0(p0.getAsset().getAttributes().getModifiedAt())), DraftUtils.l0(p0.getGeneral().getAttributes().getModifiedAt())), DraftUtils.l0(p0.getMixing().getAttributes().getModifiedAt())), DraftUtils.l0(p0.getVoiceChange().getAttributes().getModifiedAt())), DraftUtils.l0(p0.getClip().getAttributes().getModifiedAt()));
    }
    public static File v(File p0,Workspace p1){
       Music obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p1.getMusicsCount()) {
          return null;
       }
       Iterator iterator = p1.getMusicsList().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (!u.j(obj) && !TextUtils.x(obj.getFile())) {
             break ;
          }
       }
       return new File(p0, obj.getFile());
    }
    public static List w(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.getMusicsCount()) {
          return null;
       }
       if (q.f(p0.getMusicsList())) {
          return null;
       }
       return p0.getMusicsList();
    }
    public static Music x(c p0,boolean p1){
       Music obj;
       DraftUtils uDraftUtils = DraftUtils.class;
       if (PatchProxy.isSupport(uDraftUtils)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uDraftUtils, "57");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(p0.z())) {
          return null;
       }else {
          Iterator iterator = p0.z().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             obj = iterator.next();
             if (obj.getType() == Music$Type.MEDIA_SCENE_IMPORT) {
                continue ;
             }else if(p1 && obj.getType() == Music$Type.RECORD){
                break ;
             }else if(!p1 && obj.getType() != Music$Type.RECORD){
                return obj;
             }
          }
          return obj;
       }
    }
    public static long y(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = null;
       List obj1 = PatchProxy.applyOneRefs(p0, obj, DraftUtils.class, "31");
       if (obj1 != patchProxyRe) {
          return obj1.longValue();
       }
       m0 om0 = p0.u();
       if (om0 == null) {
          return 0;
       }
       obj1 = PatchProxy.apply(obj, om0, m0.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = q.g(om0.M.entrySet(), d.a);
       }
       Iterator iterator = obj1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().F()) {
                break ;
             }
          }else {
             obj = new Object[0];
             f.D().w("DraftUtils", "getOutputLastModifiedMills OutputContentModifiedAt:"+om0.f().getOutputContentModifiedAt(), obj);
             return DraftUtils.l0(om0.f().getOutputContentModifiedAt());
          }
       }
       return System.currentTimeMillis();
    }
    public static TimeRange z(Music p0){
       TimeRange timeRange = null;
       Object obj = PatchProxy.applyOneRefs(p0, timeRange, DraftUtils.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return timeRange;
       }
       int i = DraftUtils$a.a[p0.getType().ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                return timeRange;
             }else if(p0.getOnlineParam().hasSong()){
                timeRange = p0.getOnlineParam().getSelectedRange();
             }
             return timeRange;
          }else if(p0.getOperationParam().hasSong()){
             timeRange = p0.getOperationParam().getSelectedRange();
          }
          return timeRange;
       }else if(p0.getImportParam().hasSong()){
          timeRange = p0.getImportParam().getSelectedRange();
       }
       return timeRange;
    }
}
