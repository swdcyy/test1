package com.yxcorp.gifshow.v3.editor.text.subtitle.k;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.TimeRange;
import dvc.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.Number;
import com.kuaishou.edit.draft.Song;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.android.model.music.Music;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.model.music.MusicType;
import w46.b;
import java.util.List;
import brd.t;
import java.lang.Boolean;
import android.util.Pair;
import java.lang.Integer;
import dvc.h;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;

public class k	// class@00149e
{
    public String a;
    public c b;
    public EditorSdk2V2$VideoEditorProject c;
    public VideoContext d;

    public void k(c p0,EditorSdk2V2$VideoEditorProject p1,VideoContext p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final y a(Music p0,TimeRange p1,double p2){
       y obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, k.class, "11");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new y();
       obj.musicId = p0.getFeatureId().getExternal();
       Object[] obj1 = PatchProxy.applyOneRefs(p0, this, ok, "12");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          Song song = DraftUtils.B(p0);
          int i1 = 0;
          int typeValue = (song != null)? song.getTypeValue(): 0;
          String str = "SubtitleAudioAssetUploadHelper";
          if (!typeValue) {
             k td = this.d;
             if (td != null) {
                Music music = td.B();
                if (music != null) {
                   Object[] objArray = new Object[i1];
                   a.D().w(str, "musicJson in videoContext: "+music, objArray);
                   Music mId = music.mId;
                   String external = p0.getFeatureId().getExternal();
                   if (mId != null && mId.equals(external)) {
                      i = music.mType.getValue();
                   label_00ae :
                      if (!i) {
                         obj1 = new Object[i1];
                         a.D().t(str, "music type is 0", obj1);
                      }
                   }else {
                      Object[] objArray1 = new Object[i1];
                      a.D().t(str, "musicId is different:"+mId+"-"+external, objArray1);
                   }
                }
             }
          }
          i = typeValue;
          goto label_00ae ;
       }
       obj.musicType = i;
       obj.musicStartTime = (int)(p1.getStart() * 0x408f400000000000);
       obj.musicEndTime = (int)((p1.getStart() + p1.getDuration()) * 0x408f400000000000);
       obj.startTimeInVideo = (int)(p2 * 0x408f400000000000);
       return obj;
    }
    public final t b(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, k.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2) {
          Object[] objArray = new Object[0];
          a.D().s("SubtitleAudioAssetUploadHelper", "all mute", objArray);
          return t.just(new Pair(Integer.valueOf(16), new Pair(null, null)));
       }else {
          return t.create(new h(this, p1, p0)).subscribeOn(d.a);
       }
    }
    public final double c(double p0,EditorSdk2$TimeRange[] p1,EditorSdk2$TimeRange[] p2){
       object oobject;
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), p1, p2, this, k.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < p1.length) {
             oobject = p1[i1];
             if (p0 - oobject.start() >= 0) {
                double d = oobject.start() + oobject.duration();
                if (p0 - d <= 0) {
                   break ;
                }
             }
             i1 = i1 + 1;
          }else {
             Object[] objArray = new Object[i];
             a.D().t("SubtitleAudioAssetUploadHelper", "speed time is beyond max", objArray);
             return p0;
          }
       }
       return (p2[i1].start() + (((p0 - oobject.start()) / oobject.duration()) * p2[i1].duration()));
    }
}
