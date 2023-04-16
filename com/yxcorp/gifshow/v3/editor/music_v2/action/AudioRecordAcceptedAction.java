package com.yxcorp.gifshow.v3.editor.music_v2.action.AudioRecordAcceptedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import osc.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yaa.c;
import wba.u;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import csc.b;
import com.google.common.collect.ImmutableMap;
import csc.b$a;
import java.lang.Integer;
import faa.a;
import q87.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import java.lang.Float;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Music$b;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.RecordMusicParam;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Music$Source;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.StringBuilder;
import osc.b$a;
import lba.a;
import com.kuaishou.edit.draft.OriginalVoice$b;
import java.lang.Long;
import com.kwai.feature.post.api.music.data.MusicSource;
import lnc.a1;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Math;
import kotlin.Pair;
import java.lang.Number;

public final class AudioRecordAcceptedAction extends EditSdkAction	// class@00105f
{
    public final String TAG;
    public final b audioDataManager;
    public final String filename;
    public final boolean isUseOriginSound;
    public final int lastPositiveVoiceProgress;
    public final long recordedDuration;

    public void AudioRecordAcceptedAction(b p0,String p1,long p2,boolean p3,int p4){
       a.p(p0, "audioDataManager");
       super();
       this.audioDataManager = p0;
       this.filename = p1;
       this.recordedDuration = p2;
       this.isUseOriginSound = p3;
       this.lastPositiveVoiceProgress = p4;
       this.TAG = "AudioRecordAcceptedAction";
    }
    public final void clearRecord(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioRecordAcceptedAction.class, "3")) {
          return;
       }
       c uoc = p0.J0();
       if (uoc != null) {
          a.o(uoc, "workspaceDraft.musicDraft ?: return");
          u.k(true, uoc);
          Workspace$Type type = p0.a1();
          a.o(type, "workspaceDraft.type");
          float f = (MusicDraftUtilsKt.k(type))? MusicDraftUtilsKt.j(p0, this.lastPositiveVoiceProgress): 0;
          this.saveVoiceVolume(p0, f);
          int i = 0;
          if (!MusicDraftUtilsKt.a(p0)) {
             Object obj = b.g.a().get(Integer.valueOf(i));
             a.m(obj);
             a.o(obj, "ChangeVoiceEffect.CHANGE¡­aft.AUDIO_CHANGER_NONE]!!");
             MusicDraftUtilsKt.b(p0, obj);
          }
          AudioRecordAcceptedAction taudioDataMa = this.audioDataManager;
          taudioDataMa.a = null;
          taudioDataMa.b = null;
          taudioDataMa.c = null;
          taudioDataMa.d = null;
          taudioDataMa.e = 0;
          taudioDataMa.g = null;
          taudioDataMa.h = 0;
          taudioDataMa.f = i;
          Object[] objArray = new Object[i];
          a.D().w(this.TAG, "clearRecord", objArray);
       }
       return;
    }
    public final b getAudioDataManager(){
       return this.audioDataManager;
    }
    public final String getFilename(){
       return this.filename;
    }
    public final long getRecordedDuration(){
       return this.recordedDuration;
    }
    public final boolean isUseOriginSound(){
       return this.isUseOriginSound;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudioRecordAcceptedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       AudioRecordAcceptedAction uAudioRecord = (!TextUtils.x(this.filename) && this.recordedDuration > 0)? 1: null;
       if (uAudioRecord) {
          uAudioRecord = this.filename;
          a.m(uAudioRecord);
          this.updateRecord(p0, uAudioRecord, this.recordedDuration);
       }else {
          this.clearRecord(p0);
       }
       return;
    }
    public final void saveRecord(c p0,MusicClipInfo p1,float p2){
       if (PatchProxy.isSupport(AudioRecordAcceptedAction.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, AudioRecordAcceptedAction.class, "4")) {
          return;
       }
       p0 = p0.J0();
       if (p0 != null) {
          a.o(p0, "workspaceDraft.musicDraft ?: return");
          GeneratedMessageLite$Builder uBuilder = p0.b();
          a.o(uBuilder, "musicDraft.append\(\)");
          boolean b = true;
          u.k(b, p0);
          uBuilder.o(Music$Type.RECORD);
          uBuilder.copyOnWrite();
          uBuilder.instance.setRecordParam(RecordMusicParam.getDefaultInstance());
          uBuilder.h(DraftUtils.c0(InternalFeatureId.MUSIC_RECORD));
          String str = (TextUtils.x(p1.mClippedResultPath))? "": p0.Q(p1.mClippedResultPath);
          uBuilder.i(str);
          uBuilder.c((p1.mAllowLoopPlay ^ b));
          uBuilder.n(Music$Source.EDIT);
          uBuilder.p(p2);
          TimeRange$b uob = TimeRange.newBuilder();
          uob.b(0);
          uBuilder.d(uob.build());
          Object[] objArray = new Object[0];
          a.D().w(this.TAG, "saveRecord musicClipInfo:"+p1, objArray);
       }
       return;
    }
    public final void saveVoiceVolume(c p0,float p1){
       AudioRecordAcceptedAction uAudioRecord = AudioRecordAcceptedAction.class;
       if (PatchProxy.isSupport(uAudioRecord) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uAudioRecord, "5")) {
          return;
       }
       if (this.audioDataManager.d() != null) {
          this.audioDataManager.d().b = (int)((float)100 * p1);
       }
       a uoa = p0.g1();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.voiceDraft ?: return");
          uoa.c0();
          OriginalVoice$b uob = uoa.k();
          uob.b((this.isUseOriginSound ^ 0x01));
          a.o(uob, "voiceDraft.ensureFirstBu¡­kAsset\(!isUseOriginSound\)");
          if (this.isUseOriginSound == null) {
             p1 = 0;
          }
          uob.d(p1);
          uoa.f();
       }
       return;
    }
    public final void updateRecord(c p0,String p1,long p2){
       AudioRecordAcceptedAction uAudioRecord = this;
       c uoc = p0;
       String str = p1;
       long l = p2;
       if (PatchProxy.isSupport(AudioRecordAcceptedAction.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, AudioRecordAcceptedAction.class, "2")) {
          return;
       }
       Workspace$Type aTLAS = Workspace$Type.ATLAS;
       boolean b = (p0.a1() != aTLAS && (p0.a1() == Workspace$Type.LONG_PICTURE || p0.a1() == Workspace$Type.SINGLE_PICTURE))? true: false;
       MusicClipInfo musicClipInf = new MusicClipInfo(MusicSource.RECORD, a1.p(0x7f103759), str, b);
       long l1 = (p0.a1() != Workspace$Type.SINGLE_PICTURE && (p0.a1() == aTLAS || p0.a1() == Workspace$Type.LONG_PICTURE))? Math.min((long)c.i(p1), l): l;
       musicClipInf.c(str);
       musicClipInf.a(p1, 0, l1);
       Object[] String str1 = ",recordedDuration:";
       Object[] objArray = new Object[0];
       a.D().w(uAudioRecord.TAG, "updateRecord clipDuration:"+l1+",fileName:"+str+str1+l+",getWorkspaceType:"+p0.a1()+",musicClipInfo:"+musicClipInf, objArray);
       float f = MusicDraftUtilsKt.j(uoc, MusicDraftUtilsKt.x(p0).getSecond().intValue());
       if (!f) {
          f = 0x3f800000;
       }
       uAudioRecord.saveVoiceVolume(uoc, f);
       uAudioRecord.saveRecord(uoc, musicClipInf, f);
       str1 = new Object[0];
       a.D().w(uAudioRecord.TAG, "openRecordAudio filename:"+str+",allowLoopPlay:"+b+str1+l, str1);
       return;
    }
}
