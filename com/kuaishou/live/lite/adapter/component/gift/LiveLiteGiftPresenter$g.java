package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$g;
import ok.x;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import wd3.a;

public final class LiveLiteGiftPresenter$g implements x	// class@001db2
{
    public final LiveLiteGiftPresenter b;

    public void LiveLiteGiftPresenter$g(LiveLiteGiftPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, LiveLiteGiftPresenter$g.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          LiveLiteGiftPresenter e = this.b.E;
          if (e == null) {
             a.S("voicePartyService");
          }
          uBoolean = Boolean.valueOf(e.wd());
       }
       return uBoolean;
    }
}
