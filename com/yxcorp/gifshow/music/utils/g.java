package com.yxcorp.gifshow.music.utils.g;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.music.MusicType;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import pm6.m;
import brd.t;
import wkd.b;
import kqb.e;
import cjd.e;
import erd.o;
import kqb.o;
import erd.g;
import t45.d;
import brd.z;
import kqb.p;

public final class g	// class@002094
{

    public void g(){
       super();
    }
    public static long a(Music p0){
       Music obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = p0.mChorus;
       if (obj > null) {
          Music mType = p0.mType;
          if (mType != MusicType.BGM && (mType != MusicType.ELECTRICAL && (mType != MusicType.ORIGINAL && (mType == MusicType.COVER || mType == MusicType.TME)))) {
             return (long)obj;
          }
       }
       obj = p0.mType;
       long l = 0;
       if (obj == MusicType.LIP) {
          return l;
       }else if(obj == MusicType.SOUNDTRACK){
          obj = p0.mKtvBeginTime;
          if (obj > null) {
             return (long)obj;
          }
       }
       Lyrics lyrics = new g0().b(p0.mLyrics);
       if (lyrics != null && !q.f(lyrics.mLines)) {
          Lyrics lyrics1 = null;
          int i = 0;
          while (true) {
             if (i < lyrics.mLines.size()) {
                Lyrics$Line mText = lyrics.mLines.get(i).mText;
                if (!mText.length()) {
                   i = i + 1;
                }else if(mText.contains(p0.mName+"-") || mText.contains(p0.mName+" -")){
                   lyrics1 = 1;
                }
                if (lyrics1) {
                   int i1 = i + 1;
                   if (i1 < lyrics.mLines.size()) {
                      i = i1;
                      break ;
                   }
                }
                break ;
             }
          }
          return (long)lyrics.mLines.get(i).mStart;
       }
       return l;
    }
    public static boolean b(Music p0){
       Music obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0.mMusicianUid)) {
          return b;
       }
       obj = p0.mUserProfile;
       if (obj != null) {
          return TextUtils.n(obj.mId, p0.mMusicianUid);
       }
       obj = p0.mArtistId;
       if (obj != null) {
          return TextUtils.n(obj, p0.mMusicianUid);
       }
       if (p0.mType == MusicType.ELECTRICAL) {
          b = true;
       }
       return b;
    }
    public static boolean c(Music p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, g.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p2) {
          return b;
       }else {
          int i = p0.mSnippetDuration * 1000;
          if (i < m.b(2)) {
             return b;
          }else if(i && (p1 > 0 && p1 < i)){
             b = true;
          }
       label_003c :
          return b;
       }
    }
    public static t d(Music p0){
       t obj = PatchProxy.applyOneRefs(p0, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0.mType == MusicType.BGM)? b.a(0x2e5dfb95).c(p0.mId).map(new e()).doOnNext(new o(p0)): t.just(p0);
       return obj.observeOn(d.c).doOnNext(new p(p0)).observeOn(d.a);
    }
    public static double e(long p0){
       return ((double)p0 / 0x408f400000000000);
    }
    public static long f(double p0){
       return (long)(p0 * 0x408f400000000000);
    }
}
