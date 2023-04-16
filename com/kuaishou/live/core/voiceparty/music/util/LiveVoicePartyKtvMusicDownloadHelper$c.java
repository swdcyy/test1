package com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$c;
import java.lang.Runnable;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import z12.e;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import xt2.h;
import ojd.f;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import com.kuaishou.live.core.voiceparty.music.util.FileRenameException;
import com.kuaishou.live.core.voiceparty.music.util.AccompanimentDownloadException;
import java.lang.Throwable;
import j80.g;
import xt2.g;
import java.lang.RuntimeException;
import com.kuaishou.live.core.voiceparty.music.util.LyricDownloadException;
import xt2.i;
import com.kuaishou.live.core.voiceparty.music.util.MelodyDownloadException;
import xt2.j;
import com.kuaishou.live.core.voiceparty.music.util.MusicDownloadException;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import rfc.a;
import brd.t;
import njd.a;
import xt2.l;
import java.lang.IllegalArgumentException;

public class LiveVoicePartyKtvMusicDownloadHelper$c implements Runnable	// class@0017ed
{
    public final Music b;
    public final LiveVoicePartyKtvMusicDownloadHelper$d c;
    public int d;
    public int e;
    public int f;

    public void LiveVoicePartyKtvMusicDownloadHelper$c(Music p0,LiveVoicePartyKtvMusicDownloadHelper$d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper$c.class, "3")) {
          return;
       }
       if (p1 != null && (p1.exists() && p1.length() > 0)) {
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyKtvMusicDownloadHelper", "accompaniment"+this.b.mName+"is exists", stringArray);
          return;
       }else {
          try{
             String[] stringArray1 = e0.b(this.b.mAccompanimentUrls, null);
             if (stringArray1 == null || !stringArray1.length) {
                return;
             }
             LiveVoicePartyKtvMusicDownloadHelper.b(stringArray1, p0, new h(this));
             if (p0.renameTo(p1)) {
                return;
             }
             throw new FileRenameException();
          }catch(java.lang.Exception e6){
             throw new AccompanimentDownloadException(e6);
          }
       }
    }
    public final void b(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper$c.class, "2")) {
          return;
       }
       if (p1 != null && (p1.exists() && p1.length() > 0)) {
          p0.mLyrics = g.d(p1);
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyKtvMusicDownloadHelper", "lrc"+this.b.mName+"is exists", stringArray);
          return;
       }else {
          try{
             LiveVoicePartyKtvMusicDownloadHelper$c tb = this.b;
             String[] stringArray1 = e0.b(tb.mLrcUrls, tb.mLrcUrl);
             if (stringArray1 == null || !stringArray1.length) {
                throw new RuntimeException("lrc urls is empty");
             }
             LiveVoicePartyKtvMusicDownloadHelper.b(stringArray1, p0, new g(this));
             if (!p0.renameTo(p1)) {
                throw new FileRenameException();
             }
             p0.mLyrics = g.d(p1);
             return;
          }catch(java.lang.Exception e6){
             throw new LyricDownloadException(e6);
          }
       }
    }
    public final void c(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper$c.class, "4")) {
          return;
       }
       if (p1 != null && (p1.exists() && p1.length() > 0)) {
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyKtvMusicDownloadHelper", "melody"+this.b.mName+"is exists", stringArray);
          return;
       }else {
          try{
             String[] stringArray1 = e0.b(this.b.mMelodyUrls, null);
             if (stringArray1 == null || !stringArray1.length) {
                return;
             }
             LiveVoicePartyKtvMusicDownloadHelper.b(stringArray1, p0, new i(this));
             if (p0.renameTo(p1)) {
                return;
             }
             throw new FileRenameException();
          }catch(java.lang.Exception e6){
             throw new MelodyDownloadException(e6);
          }
       }
    }
    public final void d(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper$c.class, "5")) {
          return;
       }
       if (p1.exists() && p1.length() > 0) {
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyKtvMusicDownloadHelper", "music"+this.b.mName+"is exists", stringArray);
          return;
       }else {
          try{
             LiveVoicePartyKtvMusicDownloadHelper$c tb = this.b;
             String[] stringArray1 = e0.b(tb.mUrls, tb.mUrl);
             if (stringArray1 == null || !stringArray1.length) {
                throw new RuntimeException("music urls is empty");
             }
             LiveVoicePartyKtvMusicDownloadHelper.b(stringArray1, p0, new j(this));
             if (p0.renameTo(p1)) {
                return;
             }
             throw new FileRenameException();
          }catch(java.lang.Exception e6){
             throw new MusicDownloadException(e6);
          }
       }
    }
    public void run(){
       Music music;
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicDownloadHelper$c.class, "1")) {
          return;
       }
       this.c.s1(this.b, 0, -1);
       if (TextUtils.isEmpty(this.b.mUrl)) {
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyKtvMusicDownloadHelper", "on download task and current music "+this.b.mName+" url is empty", stringArray);
          music = b.a(0x4a533fa).c(this.b.mId).blockingFirst().a();
          LiveVoicePartyKtvMusicDownloadHelper$c tb = this.b;
          tb.mUrl = music.mUrl;
          tb.mUrls = music.mUrls;
       }
       File uFile = l.g(this.b);
       if (uFile == null) {
          this.c.P0(this.b, new IllegalArgumentException("File is null :"+this.b.mId));
          return;
       }else {
          File uFile1 = new File(uFile.getParentFile(), uFile.getName()+".tmp");
          this.b(uFile1, l.e(this.b));
          this.a(uFile1, l.b(this.b));
          this.c(uFile1, l.f(this.b));
          this.d(uFile1, uFile);
          this.c.A1(this.b);
          return;
       }
    }
}
