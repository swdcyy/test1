package com.yxcorp.gifshow.encode.m0;
import io.reactivex.g;
import java.util.List;
import java.io.File;
import com.kuaishou.edit.draft.Workspace;
import java.lang.Object;
import brd.v;
import gq.a;
import java.lang.String;
import q87.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Type;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import qkd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.encode.EncodeException;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;
import brd.g;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.System;
import com.yxcorp.gifshow.media.util.c;
import ekd.k1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import pca.q1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;

public final class m0 implements g	// class@000d30
{
    public final List b;
    public final File c;
    public final Workspace d;
    public final File e;

    public void m0(List p0,File p1,Workspace p2,File p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       Music music;
       Music music2;
       TimeRange timeRange;
       int i1;
       Object obj1;
       double d2;
       Object[] objArray3;
       String absolutePath;
       boolean b;
       double start;
       int i2;
       m0 om0 = this;
       g og = p0;
       m0 c = om0.c;
       m0 d = om0.d;
       m0 e = om0.e;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EncodingUtils", "clipAndExportMusicFile mix music and record start", objArray);
       Iterator iterator = om0.b.iterator();
       EditorSdk2V2$AudioAsset[] obj = null;
       music = obj;
       Music music1 = music;
       while (iterator.hasNext()) {
          music2 = iterator.next();
          if (music2.getType() != Music$Type.RECORD) {
             music = music2;
          }else {
             music1 = music2;
          }
       }
       File uFile = DraftUtils.v(c, d);
       if (!b.S(uFile)) {
          uFile = DraftUtils.A(c, d);
          Object[] objArray1 = new Object[i];
          a.D().w("EncodingUtils", "clipAndExportMusicFile: music should clip", objArray1);
          music2 = 1;
       }else {
          music2 = 0;
       }
       File uFile1 = PatchProxy.applyTwoRefs(c, d, obj, DraftUtils.class, "20");
       if (uFile1 != PatchProxyResult.class) {
       }else if(!d.getMusicsCount()){
          Iterator iterator1 = d.getMusicsList().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                Music music3 = iterator1.next();
                if (music3.getType() == Music$Type.RECORD && !TextUtils.x(music3.getFile())) {
                   uFile1 = new File(c, music3.getFile());
                   break ;
                }
             }
          }
       }
       uFile1 = obj;
       if (!b.S(uFile) && !b.S(uFile1)) {
          EncodeException uEncodeExcep = new EncodeException(4, "EncodingUtils clipAndExportMusicFile \n musicFile: "+uFile+" isValid? "+b.S(uFile)+"\n recordFile "+uFile1+" isValid? "+b.S(uFile1));
          if (!PatchProxy.applyVoidOneRefs(uEncodeExcep, obj, s0.class, "13")) {
             ExceptionHandler.handleCaughtException(uEncodeExcep);
             Object[] objArray2 = new Object[i];
             a.D().u("EncodingUtils", uEncodeExcep, objArray2);
          }
          og.onError(uEncodeExcep);
       }else {
          String str = "";
          double d1 = 0x408f400000000000;
          if (b.S(uFile)) {
             if (music2) {
                timeRange = DraftUtils.z(music);
                i1 = (timeRange != null)? (int)(timeRange.getDuration() * d1): 0;
                obj1 = uFile1;
                d2 = (double)c.i(uFile.getAbsolutePath());
                objArray3 = new Object[0];
                a.D().w("EncodingUtils", "clipAndExportMusicFile cost:"+k1.t(System.currentTimeMillis()), objArray3);
             }else {
                obj1 = uFile1;
                i1 = c.i(uFile.getAbsolutePath());
                d2 = (double)i1;
             }
             absolutePath = uFile.getAbsolutePath();
          }else {
             obj1 = uFile1;
             absolutePath = str;
             i1 = 0;
             d2 = 0;
          }
          if (b.S(obj1)) {
             b = (i1 > c.i(obj1.getAbsolutePath()))? true: false;
             if (b) {
                str = obj1.getAbsolutePath();
             }else if(TextUtils.x(absolutePath)){
                absolutePath = obj1.getAbsolutePath();
             }else {
                str = absolutePath;
                absolutePath = obj1.getAbsolutePath();
             }
          }else {
             b = true;
          }
          i = 0;
          objArray3 = new Object[i];
          a.D().w("EncodingUtils", "clipAndExportMusicFile: baseIsMusic = "+b+",baseFilePath = "+absolutePath+",audioAssetPath = "+str, objArray3);
          EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(absolutePath);
          if (b && music != null) {
             videoEditorP.trackAssets(i).setVolume((double)music.getVolume());
          }else if(!b && music1 != null){
             videoEditorP.trackAssets(i).setVolume((double)music1.getVolume());
          }
          if (b && music2) {
             timeRange = DraftUtils.z(music);
             if (timeRange != null) {
                start = timeRange.getStart();
                double duration = timeRange.getDuration();
                d2 = (d2 / d1) - start;
                if (duration > 0) {
                   d2 = Math.min(duration, d2);
                }
                videoEditorP.trackAssets(0).setClippedRange(EditorSdk2UtilsV2.createTimeRange(start, d2));
             }
             i = 0;
             Object[] objArray4 = new Object[i];
             a.D().w("EncodingUtils", "clipAndExportMusicFile: clip music in track timeRange="+timeRange, objArray4);
          }else {
             i = 0;
          }
          if (!TextUtils.x(str)) {
             obj = new EditorSdk2V2$AudioAsset[]{EditorSdk2UtilsV2.openAudioAsset(str)};
             if (b) {
                if (music1 != null) {
                   obj[i].setVolume((double)music1.getVolume());
                }
             }else if(music2){
                TimeRange timeRange1 = DraftUtils.z(music);
                if (timeRange1 != null) {
                   obj[i].setClippedRange(EditorSdk2UtilsV2.createTimeRange(timeRange1.getStart(), timeRange1.getDuration()));
                }
                i2 = 0;
                Object[] objArray7 = new Object[i2];
                a.D().w("EncodingUtils", "clipAndExportMusicFile: clip music in audioAsset timeRange="+timeRange1, objArray7);
             }else {
                i2 = 0;
             }
             if (music != null) {
                obj[i2].setVolume((double)music.getVolume());
             }
             videoEditorP.setAudioAssets(obj);
          }
          Object[] objArray5 = new Object[0];
          a.D().w("EncodingUtils", "clipAndExportMusicFile: videoProject="+videoEditorP, objArray5);
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          uExportOptio.setDiscardVideoTrackInMediaFile(true);
          long l = 0;
          long l1 = a.t().b("pic_music_encode_completeness_check", l);
          boolean b1 = (l1 - l > 0)? true: false;
          uExportOptio.setEnableCheckMp4Completeness(b1);
          uExportOptio.setMp4CompletenessFailedRerunTimes((int)l1);
          uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
          String str1 = e.getAbsolutePath()+".mp4";
          ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), videoEditorP, str1, uExportOptio);
          uExportTaskN.setExportEventListener(new q1(str1, e, og));
          og.setCancellable(new l1(uExportTaskN));
          Object[] objArray6 = new Object[0];
          a.D().w("EncodingUtils", "clipAndExportMusicFile mix music and record run exportTask", objArray6);
          uExportTaskN.run();
       }
       return;
    }
}
