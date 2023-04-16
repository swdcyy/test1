package dpb.k;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import fpb.d;
import kob.k;
import q87.c;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.music.cloudmusic.search.a;
import com.yxcorp.gifshow.music.network.model.response.MusicPhotoCardsData;
import vpb.a;
import java.lang.Long;
import fpb.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import com.google.gson.JsonObject;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.SystemClock;
import jqb.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicPlayStatPackageV2;
import com.kuaishou.android.model.music.MusicType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public final class k implements CloudMusicHelper$a	// class@0024e3
{
    public final SearchMusicFragment a;

    public void k(SearchMusicFragment p0){
       this.a = p0;
    }
    public final void a(int p0){
       CloudMusicHelper$MusicState musicState1;
       CloudMusicHelper$MusicState musicState2;
       String this;
       String str2;
       Music music;
       h$b uob;
       String str8;
       String str9;
       String str10;
       String str11;
       Music music4;
       long l1;
       d uod1;
       d a2;
       SearchMusicFragment v0;
       String str12;
       Object[] objArray2;
       a uoa;
       String photoId;
       a uoa1;
       a uoa2;
       String str13;
       int i = p0;
       k a = this.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(SearchMusicFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), a, SearchMusicFragment.class, "5")) {
          CloudMusicHelper$MusicState musicState = a.G.j(i);
          CloudMusicHelper$MusicState pAUSE = CloudMusicHelper$MusicState.PAUSE;
          int i1 = 0;
          SearchMusicFragment searchMusicF = (musicState != pAUSE && (musicState == CloudMusicHelper$MusicState.STOP || musicState == CloudMusicHelper$MusicState.NONE))? 1: null;
          String str = "";
          String str1 = "music_search_fragment";
          if (searchMusicF) {
             d uod = d.class;
             if (PatchProxy.isSupport(SearchMusicFragment.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), a, SearchMusicFragment.class, "6") && (a.Y0 != null && a.b1 != null))) {
                Object[] objArray1 = new Object[i1];
                k.D().w(str1, "on music stopped", objArray1);
                long l = a.G.m(i);
                Music music3 = a.G.f();
                QPhoto qPhoto1 = a.G.h();
                String str3 = "params";
                String str4 = "pause_type";
                String str5 = "music_play_duration";
                String str6 = "SEARCH_MUSIC_DURATION";
                String str7 = "ussid";
                this = "page";
                str2 = str1;
                if (qPhoto1 != null) {
                   a a1 = a.Y0.A;
                   if (a1 != null) {
                      MusicPhotoCardsData musicPhotoCa = a1.b();
                      if (PatchProxy.isSupport(SearchMusicFragment.class)) {
                         musicState1 = musicState;
                         str8 = str5;
                         musicState2 = pAUSE;
                         str9 = str4;
                         str10 = str;
                         str11 = str3;
                         music4 = music3;
                         l1 = l;
                         uod1 = uod;
                         if (PatchProxy.applyVoidFourRefs(Long.valueOf(l), qPhoto1, music3, musicPhotoCa, a, SearchMusicFragment.class, "9")) {
                         label_0127 :
                            this = str10;
                         }
                      }else {
                         str11 = str3;
                         l1 = l;
                         uod1 = uod;
                         musicState1 = musicState;
                         musicState2 = pAUSE;
                         str10 = str;
                         str8 = str5;
                         str9 = str4;
                         music4 = music3;
                      }
                      if (musicPhotoCa == null) {
                         musicPhotoCa = new MusicPhotoCardsData();
                      }
                      a2 = d.a;
                      searchMusicF = a.a1;
                      v0 = a.V0;
                      str12 = v0.c();
                      Objects.requireNonNull(a2);
                      if (PatchProxy.isSupport(uod1)) {
                         objArray2 = new Object[]{Boolean.valueOf(searchMusicF),v0,musicPhotoCa,qPhoto1,music4,Long.valueOf(l1),str12};
                         if (PatchProxy.applyVoid(objArray2, a2, uod1, "9")) {
                            goto label_0127 ;
                         }
                      }
                      a.p(v0, this);
                      a.p(musicPhotoCa, "photoCardsData");
                      a.p(str12, str7);
                      ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                      uElementPack1.action2 = str6;
                      uoa = a.k();
                      photoId = qPhoto1.getPhotoId();
                      if (photoId == null) {
                         photoId = str10;
                      }
                      photoId = "type";
                      uoa = uoa.e("id", photoId).e(photoId, "PHOTO").a("rank", musicPhotoCa.mPhotoRank).a("pos", 1);
                      uoa1 = a2.e(str12).e(photoId, musicPhotoCa.mTemplateType);
                      if (music4 != null) {
                         str12 = music4.getId();
                         if (str12 != null) {
                         label_017c :
                            uoa1 = uoa1.e("music_id", str12).b("music_total_duration", qPhoto1.getVideoMetaDuration()).b(str8, l1);
                            str4 = (searchMusicF != null)? "CLICK": "OTHER";
                            uElementPack1.params = uoa.d(str11, uoa1.e(str9, str4).j()).i();
                            uob = h$b.e(0, str6);
                            uob.k(uElementPack1);
                            photoId = str10;
                            u1.p0(photoId, v0, uob);
                         label_02b9 :
                            this = photoId;
                         }
                      }
                      str12 = str10;
                      goto label_017c ;
                   }else {
                      musicState1 = musicState;
                      musicState2 = pAUSE;
                      this = str;
                   }
                }else {
                   str1 = str3;
                   musicState1 = musicState;
                   musicState2 = pAUSE;
                   str8 = str5;
                   str9 = str4;
                   music4 = music3;
                   long l2 = l;
                   photoId = str;
                   if (music4 != null && !TextUtils.x(music4.mId)) {
                      uoa1 = a.Y0.s1(music4.mId);
                      if (uoa1 != null && uoa1.h != null) {
                         uoa1.d(false);
                         a f = uoa1.f;
                         if (PatchProxy.isSupport(SearchMusicFragment.class)) {
                            uoa2 = f;
                            l1 = l2;
                            str13 = photoId;
                            if (PatchProxy.applyVoidThreeRefs(Long.valueOf(l2), music4, Integer.valueOf(f), a, SearchMusicFragment.class, "8")) {
                            label_0255 :
                               this = str13;
                            }
                         }else {
                            uoa2 = f;
                            l1 = l2;
                            str13 = photoId;
                         }
                         a2 = d.a;
                         searchMusicF = a.Z0;
                         v0 = a.V0;
                         str12 = v0.c();
                         Objects.requireNonNull(a2);
                         if (PatchProxy.isSupport(uod)) {
                            objArray2 = new Object[]{Boolean.valueOf(searchMusicF),v0,music4,Integer.valueOf(uoa2),str12,Long.valueOf(l1)};
                            if (PatchProxy.applyVoid(objArray2, a2, uod, "16")) {
                               goto label_0255 ;
                            }
                         }
                         a.p(v0, this);
                         a.p(str12, str7);
                         super();
                         this.action2 = str6;
                         Music mMusicDocId = music4.mMusicDocId;
                         if (mMusicDocId == null) {
                            mMusicDocId = str13;
                         }
                         uoa = a2.a(mMusicDocId, music4.mMusicSearchRank, uoa2);
                         photoId = music4.getId();
                         if (photoId == null) {
                            photoId = str13;
                         }
                         uoa1 = a2.b(photoId, str12).b("music_total_duration", ((long)music4.mDuration * 1000)).b(str8, l1);
                         str4 = (searchMusicF != null)? "CLICK": "OTHER";
                         this.params = uoa.d(str1, uoa1.e(str9, str4).j()).i();
                         i = 0;
                         uob = h$b.e(i, str6);
                         uob.k(this);
                         this = str13;
                         u1.p0(this, v0, uob);
                      label_02bb :
                         a.a1 = i;
                         a.Z0 = i;
                      label_02c8 :
                         CloudMusicHelper$MusicState musicState3 = musicState1;
                         if (musicState3 == musicState2) {
                            a.b1 = i;
                            a.U0 = a.U0 + (SystemClock.elapsedRealtime() - a.Z);
                            a.Z = 0;
                         }else if(musicState3 == CloudMusicHelper$MusicState.PLAYING){
                            if (!PatchProxy.applyVoid(null, a, SearchMusicFragment.class, "7") && (a.Y0 != null && a.b1 == null)) {
                               Object[] objArray = new Object[0];
                               k.D().w(str2, "on music played", objArray);
                               music = a.G.f();
                               QPhoto qPhoto = a.G.h();
                               if (music != null && (!TextUtils.x(music.mId) && qPhoto == null)) {
                                  a music1 = a.Y0.s1(music.mId);
                                  if (music1 != null) {
                                     music1.d(true);
                                  label_0330 :
                                     a.b1 = i;
                                     a.Z = SystemClock.elapsedRealtime();
                                  }
                               }
                            }
                         label_032f :
                            i = true;
                            goto label_0330 ;
                         }else {
                            a.b1 = false;
                            if (a.Z > 0) {
                               a.U0 = a.U0 + (SystemClock.elapsedRealtime() - a.Z);
                            }
                            if (a.U0 > 0) {
                               Music music2 = a.G.f();
                               SearchMusicFragment u0 = a.U0;
                               if (!PatchProxy.isSupport(k.class) || (!PatchProxy.applyVoidThreeRefs(a, music2, Long.valueOf(u0), null, k.class, "26") && music2 != null)) {
                                  ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                  uElementPack.action2 = "PLAY_MUSIC_ENDED";
                                  ClientContent$MusicPlayStatPackageV2 musicPlaySta = new ClientContent$MusicPlayStatPackageV2();
                                  musicPlaySta.musicPlayMode = 2;
                                  musicPlaySta.musicId = music2.mId;
                                  musicPlaySta.musicName = music2.mName;
                                  musicPlaySta.musicType = String.valueOf(music2.mType.mValue);
                                  musicPlaySta.playedDuration = u0;
                                  ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                                  uContentPack.musicPlayStatPackage = musicPlaySta;
                                  uob = h$b.d(10, 0);
                                  uob.h(uContentPack);
                                  uob.k(uElementPack);
                                  u1.p0(this, a, uob);
                               }
                            }
                            a.Z = 0;
                            a.U0 = 0;
                         }
                      }else {
                         goto label_02b9 ;
                      }
                   }else {
                      goto label_02b9 ;
                   }
                }
                i = false;
                goto label_02bb ;
             }
          }
          musicState1 = musicState;
          musicState2 = pAUSE;
          this = str;
          str2 = str1;
          i = false;
          goto label_02c8 ;
       }
       return;
    }
}
