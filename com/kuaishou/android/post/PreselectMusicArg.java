package com.kuaishou.android.post.PreselectMusicArg;
import com.kuaishou.android.post.SerialArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.CharSequence;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import com.kuaishou.android.post.PostPageArg;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;

public final class PreselectMusicArg extends SerialArg	// class@000ea6
{

    public void PreselectMusicArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2);
    }
    public final void readFromMap(Map p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PreselectMusicArg.class, "2")) {
          return;
       }
       MusicType[] musicTypeArr = 1;
       int i = 0;
       String str = (p0 == null || p0.isEmpty())? 1: null;
       if (str) {
          return;
       }else {
          str = p0.get("preSelectMusicId");
          try{
             i1 = 0;
             String str1 = p0.get("preSelectMusicType");
             if (str1 != null) {
                Integer integer = Integer.valueOf(Integer.parseInt(str1));
             }
          }catch(java.lang.NumberFormatException e10){
             PostUtils.D("PreselectMusicArg", "PreselectMusicArg: readScheme\(\)", e10);
          }
          if (str != null && str.length()) {
             musicTypeArr = null;
          }
          if (!musicTypeArr && i1 != null) {
             Music music = new Music();
             music.mId = str;
             musicTypeArr = MusicType.values();
             int len = musicTypeArr.length;
             int i2 = 0;
             while (i2 < len) {
                object oobject = musicTypeArr[i2];
                if (oobject.mValue == i1.intValue()) {
                   music.mType = oobject;
                }
                i2 = i2 + 1;
             }
             this.setValue(music);
             Object[] objArray = new Object[i];
             p3.D().w("PreselectMusicArg", "PreselectMusicArg readFromMap value: "+this.getValue(), objArray);
          }
          return;
       }
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreselectMusicArg.class, "3")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void readScheme(Intent p0){
       Object[] objArray;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PreselectMusicArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       int i = 0;
       if (this.getValue() != null) {
          objArray = new Object[i];
          p3.D().A("PreselectMusicArg", "PreselectMusicArg readScheme value has been set "+this.getValue(), objArray);
          return;
       }else {
          String str = x0.a(p0.getData(), "preSelectMusicId");
          try{
             i1 = 0;
             String str1 = x0.a(p0.getData(), "preSelectMusicType");
             if (str1 != null) {
                Integer integer = Integer.valueOf(Integer.parseInt(str1));
             }
          }catch(java.lang.NumberFormatException e10){
             PostUtils.D("PreselectMusicArg", "PreselectMusicArg: readScheme\(\)", e10);
          }
          Music music = (str == null || !str.length())? 1: null;
          if (!music && i1 != null) {
             music = new Music();
             music.mId = str;
             MusicType[] musicTypeArr = MusicType.values();
             int len = musicTypeArr.length;
             int i2 = 0;
             while (i2 < len) {
                object oobject = musicTypeArr[i2];
                if (oobject.mValue == i1.intValue()) {
                   music.mType = oobject;
                }
                i2 = i2 + 1;
             }
             objArray = new Object[i];
             p3.D().w("PreselectMusicArg", "PreselectMusicArg readScheme value: "+music, objArray);
          }
          return;
       }
    }
}
