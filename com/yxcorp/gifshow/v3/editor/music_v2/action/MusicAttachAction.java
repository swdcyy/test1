package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import osc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Music;
import lnc.w6;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import java.lang.Number;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import faa.a;
import w46.b;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import com.kwai.feature.post.api.music.data.MusicSource;
import lnc.a1;
import com.kuaishou.edit.draft.Music$Source;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo$MusicScenes;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.previewer.utils.MusicDraftUtilKt;
import java.lang.System;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Float;
import q87.c;
import osc.b$a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import osc.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;

public final class MusicAttachAction extends EditSdkAction	// class@001076
{
    public final b audioDataManager;

    public void MusicAttachAction(b p0){
       a.p(p0, "audioDataManager");
       super();
       this.audioDataManager = p0;
    }
    public final b getAudioDataManager(){
       return this.audioDataManager;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       p1 = p0.J0();
       if (p1 != null && p1.D() == true) {
          return;
       }
       p1 = p0.J0();
       if (p1 != null) {
          p1.c0();
       }
       this.restoreRecordAudio(p0);
       return;
    }
    public final void restoreRecordAudio(c p0){
       MusicAttachAction musicAttachA;
       Object obj = this;
       double[] obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MusicAttachAction.class, "2")) {
          return;
       }
       c uoc = p0.J0();
       if (uoc != null) {
          a.o(uoc, "workspaceDraft.musicDraft ?: return");
          Music music = w6.e(uoc);
          int i = MusicDraftUtilsKt.x(p0).getSecond().intValue();
          int i1 = 1;
          if (music != null) {
             File uFile = DraftFileManager.E().B(music.getFile(), uoc);
             if (uFile == null) {
                Object[] objArray1 = new Object[0];
                a.D().t("MusicAttachAction", "restore record error!", objArray1);
                return;
             }else {
                MusicClipInfo musicClipInf = new MusicClipInfo(MusicSource.RECORD, a1.p(0x7f103759), uFile.getAbsolutePath(), (music.getDisableLoop() ^ i1));
                MusicClipInfo$MusicScenes rECORDPAGE = (music.getSource() == Music$Source.CAPTURE)? MusicClipInfo$MusicScenes.RECORDPAGE: MusicClipInfo$MusicScenes.EDITPAGE;
                musicClipInf.mMusicScenes = rECORDPAGE;
                String str = MusicDraftUtilKt.a()+"_record_"+System.currentTimeMillis();
                MusicAttachAction audioDataMan = obj.audioDataManager;
                float f = MusicDraftUtilsKt.j(obj1, i);
                Objects.requireNonNull(audioDataMan);
                if (PatchProxy.isSupport(b.class)) {
                   musicAttachA = audioDataMan;
                   if (!PatchProxy.applyVoidFourRefs(musicClipInf, Boolean.TRUE, str, Float.valueOf(f), audioDataMan, b.class, "1")) {
                   label_00b8 :
                      if (musicAttachA.a == null) {
                         Object[] objArray3 = new Object[0];
                         a.D().s("AudioDataManager", "start update audio data from workspace", objArray3);
                         b$a uoa = new b$a();
                         musicAttachA.a = uoa;
                         int i2 = 1;
                         uoa.a = i2;
                         uoa.b = (int)(f * 100.00f);
                         obj1 = new double[i2];
                         uoa.c = obj1;
                         obj1[0] = 0;
                         obj1 = new double[i2];
                         uoa.d = obj1;
                         MusicClipInfo mMusicMeta = musicClipInf.mMusicMeta;
                         musicAttachA.d = mMusicMeta;
                         musicAttachA.g = mMusicMeta;
                         musicAttachA.b = Lists.b();
                         Integer[] integerArray = new Integer[i2];
                         integerArray[0] = Integer.valueOf(0);
                         musicAttachA.c = Lists.e(integerArray);
                         musicAttachA.f = i2;
                         if (musicAttachA.i.get() != null) {
                            a uoa1 = new a(musicAttachA, musicAttachA.i.get(), musicClipInf, true, str);
                            Void[] voidArray = new Void[0];
                            integerArray.c(voidArray);
                         }
                      }
                   }
                }else {
                   musicAttachA = audioDataMan;
                   goto label_00b8 ;
                }
                Object[] objArray2 = new Object[0];
                a.D().w("MusicAttachAction", "restoreRecordAudio musicFile:,recordClipInfo:"+musicClipInf, objArray2);
             }
          }
          Object[] objArray = new Object[0];
          a.D().w("MusicAttachAction", "restoreRecordAudio recordDraft:"+music+",isFirstBind:"+true, objArray);
       }
       return;
    }
}
