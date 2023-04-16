package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicSelectedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import src.b;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import urc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import iba.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import vaa.a;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import java.lang.Boolean;
import java.lang.Number;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yaa.c;
import src.d;
import src.n;
import trc.t0;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import com.kuaishou.android.model.music.Music;
import com.kwai.robust.PatchProxyResult;
import lsc.b0;
import qr4.j$a;
import com.yxcorp.utility.TextUtils;
import lsc.a0;
import java.lang.Enum;
import qr4.e$h;
import com.yxcorp.gifshow.log.EditFunnel;
import java.util.Objects;

public class MusicSelectedAction extends EditSdkAction	// class@00107f
{
    public final int lastMusicProgress;
    public final b lyricInfo;
    public final b musicItem;
    public final boolean muteOriginVoice;
    public final int requestDuration;
    public final double sdkPlayerDuration;
    public final SelectSource selectSource;

    public void MusicSelectedAction(b p0,int p1,int p2,SelectSource p3,double p4,b p5,boolean p6){
       a.p(p0, "musicItem");
       a.p(p3, "selectSource");
       super();
       this.musicItem = p0;
       this.lastMusicProgress = p1;
       this.requestDuration = p2;
       this.selectSource = p3;
       this.sdkPlayerDuration = p4;
       this.lyricInfo = p5;
       this.muteOriginVoice = p6;
    }
    public void MusicSelectedAction(b p0,int p1,int p2,SelectSource p3,double p4,b p5,boolean p6,int p7,u p8){
       b uob = (p7 & 0x20)? null: p5;
       boolean b = (p7 & 0x40)? true: p6;
       super(p0, p1, p2, p3, p4, uob, b);
       return;
    }
    public final b getLyricInfo(){
       return this.lyricInfo;
    }
    public final b getMusicItem(){
       return this.musicItem;
    }
    public final boolean getMuteOriginVoice(){
       return this.muteOriginVoice;
    }
    public final SelectSource getSelectSource(){
       return this.selectSource;
    }
    public final void muteThemeVolume(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicSelectedAction.class, "2")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       boolean b = DraftUtils.G(p0.F0());
       Pair pair = MusicDraftUtilsKt.r(p0);
       if (DraftUtils.H(p0.X0()) || (b && (pair.getFirst().booleanValue() && pair.getSecond().intValue() > 0))) {
          MusicDraftUtilsKt.d(p0, 0, MusicDraftUtilsKt.n(p0), false, 8, null);
       }
    label_004d :
       return;
    }
    public void performAction(c p0,c p1){
       i d;
       int i;
       Object obj = this;
       Object obj1 = p0;
       MusicSelectedAction obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, MusicSelectedAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       c uoc = p0.J0();
       if (uoc != null) {
          a.o(uoc, "workspaceDraft.musicDraft ?: return");
          obj2 = obj.musicItem;
          boolean b = obj2 instanceof d;
          MusicSelectedAction musicSelecte = null;
          t0 ot0 = (obj2 instanceof n)? obj2.c(): musicSelecte;
          if (uoc.D()) {
             MusicDraftUtilsKt.u(obj.musicItem, p0, obj.lastMusicProgress, obj.requestDuration, false, b, null, obj.sdkPlayerDuration, obj.lyricInfo, ot0, 0, obj.selectSource, 1088, 0);
             if (p0.T0() == Workspace$Source.REEDIT) {
                MusicDraftUtilsKt.d(p0, 0, false, false, 8, null);
             }
             MusicSelectedAction musicSelecte1 = null;
          }else {
             uoc.c0();
             MusicDraftUtilsKt.u(obj.musicItem, p0, obj.lastMusicProgress, obj.requestDuration, false, b, null, obj.sdkPlayerDuration, obj.lyricInfo, null, true, obj.selectSource, 576, 0);
             uoc.g(false);
          }
          if (obj.muteOriginVoice != null) {
             this.muteThemeVolume(p0);
          }
          if (obj.selectSource == SelectSource.AUTO_MUSIC) {
             VideoContext videoContext = p0.d1();
             a.o(videoContext, "workspaceDraft.videoContext");
             d = videoContext.F().d;
             Music music = obj.musicItem.b();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             b0 uob0 = b0.class;
             j$a uoa = PatchProxy.applyOneRefs(music, null, uob0, "13");
             if (uoa != patchProxyRe) {
             }else {
                a.p(music, "music");
                uoa = new j$a();
                uoa.a = TextUtils.k(music.mId);
                uoa.b = TextUtils.k(music.mName);
                uoa.c = TextUtils.k(music.mUrl);
                uoa.d = TextUtils.k(music.getArtist());
                Music mType = music.mType;
                a.o(mType, "music.mType");
                Object obj3 = PatchProxy.applyOneRefs(mType, null, uob0, "14");
                if (obj3 != patchProxyRe) {
                   i = obj3.intValue();
                }else {
                   switch (a0.a[mType.ordinal()]){
                       case 1:
                         i = 1;
                         break;
                       case 2:
                         i = 2;
                         break;
                       case 3:
                         i = 3;
                         break;
                       case 4:
                         i = 4;
                         break;
                       case 5:
                         i = 5;
                         break;
                       case 6:
                         i = 6;
                         break;
                       case 7:
                         i = 7;
                         break;
                       case 8:
                         i = 8;
                         break;
                       case 9:
                         i = 9;
                         break;
                       case 10:
                         i = 11;
                         break;
                       default:
                         i = 0;
                   }
                }
                uoa.e = i;
                uoa.g = music.mUsedStart;
                uoa.h = music.mUsedDuration;
                uoa.j = TextUtils.k(music.mExpTag);
                uoa.k = music.index;
                uoa.l = TextUtils.k(music.mLlsid);
                uoa.n = TextUtils.k(music.mUssid);
             }
             d.J = uoa;
          }
          obj.musicItem.b();
          Objects.requireNonNull(EditFunnel.a);
       }
       return;
    }
}
