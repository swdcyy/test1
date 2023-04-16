package com.kuaishou.live.core.show.music.audiencelyrics.b;
import lf3.g;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCAuthorMusicOpened;
import java.util.Objects;
import java.lang.String;
import z12.e;
import com.kuaishou.livestream.message.nano.AuthorMusicInfo;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qc2.s;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.kuaishou.live.core.show.music.audiencelyrics.LiveAudienceLyricsLogger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;
import java.lang.Integer;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import qc2.h;
import msd.a;
import qc2.i;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView$c;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.StringBuilder;
import java.io.File;
import qkd.b;
import brd.t;
import com.kuaishou.live.core.show.music.audiencelyrics.a;
import erd.o;
import t45.d;
import brd.z;
import qc2.o;
import qc2.m;
import erd.g;
import crd.b;
import lf3.f;

public final class b implements g	// class@000d2d
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       AuthorMusicInfo musicId;
       b tb = this.b;
       Objects.requireNonNull(tb);
       String v = d.V;
       int i = 1;
       String[] stringArray = new String[i];
       String str = (p0 == null)? "null": p0.toString();
       int i1 = 0;
       stringArray[i1] = str;
       e.c(v, "receiveOpenMsg", stringArray);
       tb.H = p0;
       if (p0 != null) {
          SCAuthorMusicOpened musicInfo = p0.musicInfo;
          if (musicInfo != null) {
             AuthorMusicInfo lrcUrl = musicInfo.lrcUrl;
             if (lrcUrl != null && lrcUrl.length > 0) {
                b = true;
             label_002f :
                tb.I = b;
                v = "";
                if (p0 != null) {
                   SCAuthorMusicOpened musicInfo1 = p0.musicInfo;
                   if (musicInfo1 != null) {
                      musicId = musicInfo1.musicId;
                   label_003d :
                      tb.J = musicId;
                      if (p0 != null) {
                         musicInfo1 = p0.musicInfo;
                         if (musicInfo1 != null) {
                            lrcUrl = musicInfo1.musicName;
                         }
                      }
                      tb.K = lrcUrl;
                      tb.L = (long)p0.sequence;
                      if (tb.p.getParent() != null) {
                         tb.p.setLayoutResource(R.layout.arg_RES_7f0d0cd2);
                         tb.p.inflate();
                         tb.doBindView(tb.m8());
                         tb.N.a = i1;
                         tb.W8();
                      }
                      if (tb.U != null) {
                         BaseFragment uBaseFragmen = tb.q.Z2.b();
                         ClientContent$LiveStreamPackage liveStreamPa = tb.q.Z2.a();
                         ClientContentWrapper$LiveMusicPackage liveMusicPac = LiveAudienceLyricsLogger.a(tb.J, tb.K, tb.I);
                         if (!PatchProxy.applyVoidThreeRefs(uBaseFragmen, liveStreamPa, liveMusicPac, null, LiveAudienceLyricsLogger.class, "2")) {
                            ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                            uContentPack.liveStreamPackage = liveStreamPa;
                            ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                            uContentWrap.liveMusicPackage = liveMusicPac;
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "LIVE_BGM_PENDANT";
                            u1.D0("", uBaseFragmen, 9, uElementPack, uContentPack, uContentWrap);
                         }
                         tb.U = i1;
                      }
                      musicInfo = p0.musicInfo;
                      SCAuthorMusicOpened source = p0.source;
                      d uod = d.class;
                      if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(musicInfo, Integer.valueOf(source), tb, uod, "14")) {
                         tb.t.setClickable(i1);
                         Object[] objArray = null;
                         if (!PatchProxy.applyVoid(objArray, tb, uod, "18") && !PatchProxy.applyVoid(objArray, tb, uod, "19")) {
                            tb.t.setSlideRectFSupplier(new h(tb));
                         }
                         tb.t.setLyricsPendantListener(new i(tb));
                         int i2 = 8;
                         if (musicInfo != null && source == i) {
                            d n = tb.N;
                            if (tb.M == null) {
                               i2 = 0;
                            }
                            n.a = i2;
                            tb.W8();
                            if (!PatchProxy.applyVoid(objArray, tb, uod, "15")) {
                               tb.P8();
                            }
                            tb.t.setDiskCover(musicInfo.imageUrl);
                            if (tb.I == null) {
                               tb.t.a(tb.K);
                               tb.t.g((tb.Z8() ^ i), i);
                               LiveAudienceLyricsLogger.c(tb.L+tb.J, tb.t.d(), i, LiveAudienceLyricsLogger.a(tb.J, tb.K, tb.I), tb.q.Z2.a());
                            }else {
                               AuthorMusicInfo musicId1 = musicInfo.musicId;
                               if (!PatchProxy.applyVoidTwoRefs(musicId1, musicInfo, tb, uod, "24")) {
                                  File uFile = d.S8(musicId1);
                                  if (b.S(uFile)) {
                                     tb.R8(uFile.getAbsolutePath());
                                  }else if(PatchProxy.applyVoidOneRefs(musicInfo, tb, uod, "25")){
                                     musicId1 = musicInfo.lrcUrl;
                                     if (musicId1 == null || !musicId1.length) {
                                        tb.t.g(i1, i1);
                                        LiveAudienceLyricsLogger.c(tb.L+tb.J, tb.t.d(), i, LiveAudienceLyricsLogger.a(tb.J, tb.K, tb.I), tb.q.Z2.a());
                                     }else {
                                        t.just(musicId1).map(a.b).observeOn(d.c).map(new o(musicInfo)).observeOn(d.a).subscribe(new m(tb));
                                     }
                                  }
                               }
                            }
                         }else {
                            source.a = i2;
                            tb.W8();
                            LiveAudienceLyricsLogger.c(tb.L+tb.J, tb.t.d(), i, LiveAudienceLyricsLogger.a(tb.J, tb.K, tb.I), tb.q.Z2.a());
                         }
                      }
                   label_0234 :
                      return;
                   }
                }
                musicId = v;
                goto label_003d ;
             }
          }
       }
       b = false;
       goto label_002f ;
    }
    public boolean V(){
       return f.a(this);
    }
}
