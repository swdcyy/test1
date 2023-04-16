package com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import qm9.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import q2b.h$b;
import kotlin.jvm.internal.a;
import java.lang.Long;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MusicRadioLogger	// class@00206c
{
    public static final MusicRadioLogger a;

    static {
       MusicRadioLogger.a = new MusicRadioLogger();
    }
    public void MusicRadioLogger(){
       super();
    }
    public static final Music a(QPhoto p0){
       MusicRadioFeed musicRadioFe = null;
       Object obj = PatchProxy.applyOneRefs(p0, musicRadioFe, MusicRadioLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       BaseFeed entity = (p0 != null)? p0.getEntity(): musicRadioFe;
       if (!entity instanceof MusicRadioFeed) {
          entity = musicRadioFe;
       }
       if (entity != null) {
          musicRadioFe = entity.mRaveView;
       }
       return musicRadioFe;
    }
    public static final void c(boolean p0,Music p1){
       MusicRadioLogger musicRadioLo = MusicRadioLogger.class;
       if (PatchProxy.isSupport(musicRadioLo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, musicRadioLo, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "COLLECTION_BUTTON";
       JsonObject jsonObject = new JsonObject();
       String str = (p0)? "TO_COLLECTION": "CANCEL_COLLECTION";
       jsonObject.c0("collection_type", str);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = i.b(p1);
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.contentPackage = uContentPack;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static final void d(boolean p0,Music p1){
       MusicRadioLogger musicRadioLo = MusicRadioLogger.class;
       if (PatchProxy.isSupport(musicRadioLo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, musicRadioLo, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "COLLECTION_ADD_RESULT";
       uElementPack.action2 = str;
       JsonObject jsonObject = new JsonObject();
       String str1 = (p0)? "TO_COLLECTION": "CANCEL_COLLECTION";
       jsonObject.c0("collection_type", str1);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = i.b(p1);
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.contentPackage = uContentPack;
       h$b uob = h$b.e(7, str);
       a.o(uob, "taskEventBuilder");
       uob.h(uContentPack);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
    public static final void e(Music p0,String p1,long p2){
       if (PatchProxy.isSupport(MusicRadioLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, MusicRadioLogger.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_BTN_LIST";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("btn_name", p1);
       if (p2) {
          jsonObject.a0("time_set", Long.valueOf(p2));
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = i.b(p0);
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.contentPackage = uContentPack;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(Music p0,String p1,long p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = 0;
       }
       MusicRadioLogger.e(p0, p1, p2);
       return;
    }
    public final String b(QPhoto p0){
       String obj = PatchProxy.applyOneRefs(p0, this, MusicRadioLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       MusicRadioFeed musicRadioFe = null;
       p0 = (p0 != null)? p0.mEntity: musicRadioFe;
       if (p0 instanceof MusicRadioFeed) {
          musicRadioFe = p0;
       }
       if (musicRadioFe != null) {
          MusicRadioFeed mRaveView = musicRadioFe.mRaveView;
          if (mRaveView != null) {
             obj = obj+"music_id="+mRaveView.getId()+"&music_name="+mRaveView.getDisplayName()+"&author_id="+mRaveView.getArtistId()+"&author_name="+mRaveView.getArtist();
             if (mRaveView.isSleepMusic()) {
                obj = obj+"&music_type=SLEEP_MUSIC";
             }
          }
       }
       return obj;
    }
}
