package com.kuaishou.live.core.show.music.audiencelyrics.LiveAudienceLyricsLogger;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.music.audiencelyrics.LiveAudienceLyricsLogger$ClickPosition;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;

public class LiveAudienceLyricsLogger	// class@000d28
{

    public void LiveAudienceLyricsLogger(){
       super();
    }
    public static ClientContentWrapper$LiveMusicPackage a(String p0,String p1,boolean p2){
       ClientContentWrapper$LiveMusicPackage obj;
       if (PatchProxy.isSupport(LiveAudienceLyricsLogger.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, LiveAudienceLyricsLogger.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContentWrapper$LiveMusicPackage();
       obj.musicId = p0;
       obj.musicName = p1;
       int i = (p2)? 1: 2;
       obj.lyricsState = i;
       return obj;
    }
    public static void b(boolean p0,ClientContentWrapper$LiveMusicPackage p1,ClientContent$LiveStreamPackage p2,LiveAudienceLyricsLogger$ClickPosition p3){
       if (PatchProxy.isSupport(LiveAudienceLyricsLogger.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, null, LiveAudienceLyricsLogger.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveMusicPackage = p1;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7819;
       int i = (p0)? 1: 2;
       uElementPack.status = i;
       if (p3 != null) {
          i3 oi3 = i3.f();
          oi3.d("position", p3.mName);
          uElementPack.params = oi3.toString();
       }
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void c(String p0,boolean p1,int p2,ClientContentWrapper$LiveMusicPackage p3,ClientContent$LiveStreamPackage p4){
       LiveAudienceLyricsLogger liveAudience = LiveAudienceLyricsLogger.class;
       int i = 2;
       if (PatchProxy.isSupport(liveAudience)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, liveAudience, "3")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p4;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       int i1 = 0x7819;
       uElementPack.action = i1;
       if (p1) {
          i = 1;
       }
       uElementPack.status = i;
       h$b uob = h$b.d(p2, i1);
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveMusicPackage = p3;
       uob.h(uContentPack);
       uob.i(uContentWrap);
       uob.q(new ClientEvent$ResultPackage());
       uob.r(u1.g(p0));
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
