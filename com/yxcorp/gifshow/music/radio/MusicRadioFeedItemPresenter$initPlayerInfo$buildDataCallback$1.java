package com.yxcorp.gifshow.music.radio.MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1 extends Lambda implements l	// class@00206a
{
    public static final MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1 INSTANCE;

    static {
       MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1.INSTANCE = new MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1();
    }
    public void MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRadioFeedItemPresenter$initPlayerInfo$buildDataCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "buildData");
       p0.setStartPosition(0).setBizFt("MUSIC_RADIO");
       return;
    }
}
