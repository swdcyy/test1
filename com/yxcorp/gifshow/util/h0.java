package com.yxcorp.gifshow.util.h0;
import android.content.Intent;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.android.model.music.Music;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import ekd.j;
import java.lang.String;
import java.io.File;
import qkd.b;
import lnc.w6;
import org.json.JSONObject;
import e16.b;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import gq.a;
import q87.c;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;

public final class h0	// class@001f7e
{

    public static void a(Intent p0,EditorSdk2V2$VideoEditorProject p1,Music p2){
       Object[] objArray;
       String str;
       double d1;
       double d2;
       Intent intent = p0;
       Music music = p2;
       if (intent && (p1 == null || !music)) {
          objArray = new Object[0];
          a.D().w("PostBusinessUtils", "buildMusic no music", objArray);
          return;
       }else {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = p1.audioAssets().toNormalArray();
          double d = 0;
          if (!j.h(uAudioAssetA)) {
             object oobject = uAudioAssetA[0];
             if (oobject != null) {
                str = oobject.assetPath();
                d1 = oobject.assetFadeinDuration();
                d2 = oobject.assetFadeoutDuration();
             label_003a :
                if (b.S(new File(str))) {
                   int i = (int)((float)music.mDuration * 1000.00f);
                   SerializableHook.putExtra(SerializableHook.putExtra(intent.putExtra("MUSIC_INFO_MUSIC", b.c(p2)).putExtra("INTENT_EXTRA_BGM_AUDIO_DURATION", i).putExtra("INTENT_EXTRA_BGM_AUDIO_IS_WHOLE_FILE", true).putExtra("RECORD_MUSIC_META", b.a(p2, w6.f(p2), (long)i, true).toString()), "music_source", MusicSource.CLOUD_MUSIC), "music", music).putExtra("INTENT_EXTRA_BGM_AUDIO_FILE", str).putExtra("INTENT_EXTRA_MUSIC_FADE_OUT", d2).putExtra("INTENT_EXTRA_MUSIC_FADE_IN", d1);
                }else {
                   objArray = new Object[0];
                   a.D().A("PostBusinessUtils", "buildMusic musicFile invalid", objArray);
                }
                w6.b(p2);
                Object[] objArray1 = new Object[0];
                a.D().w("PostBusinessUtils", "buildMusic musicFile:"+str+",musicFadeIn:"+d1+",musicFadeOut:"+d2+"music:"+music, objArray1);
                return;
             }
          }
          str = "";
          d2 = d;
          d1 = d2;
          goto label_003a ;
       }
    }
    public static int b(List p0){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (integer.intValue() != -124) {
             i = i | integer.intValue();
          }else {
             i = integer.intValue();
             break ;
          }
       }
       return i;
    }
    public static JSONObject c(String p0){
       JSONObject jSONObject = (TextUtils.x(p0))? new JSONObject(): new JSONObject(p0);
       return jSONObject;
    }
    public static int d(VideoContext p0,EditorSdk2V2$VideoEditorProject p1){
       boolean b = EditorSdk2UtilsV2.isProjectSingleImage(p1);
       if (p0 != null) {
          b = (b && p0.j() == 1)? true: false;
       }
    label_0013 :
       int i = (b)? 8: 4;
       return i;
    }
    public static String e(List p0){
       if (q.f(p0)) {
          return "";
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          if (iterator.next().isVideo()) {
             i = i + 1;
          }else {
             i1 = i1 + 1;
          }
       }
       return "video_cnt="+i+"&"+"picture_cnt="+i1;
    }
}
