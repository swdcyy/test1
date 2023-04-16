package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$f;
import mm1.b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import aq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import java.lang.Number;
import yb6.d;
import or5.d;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ic3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public final class LiveLiteGiftPresenter$f implements b	// class@001db1
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$f(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public d A0(){
       LiveLiteGiftPresenter obj = PatchProxy.apply(null, this, LiveLiteGiftPresenter$f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.H;
       if (obj == null) {
          a.S("bizManager");
       }
       return obj;
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, LiveLiteGiftPresenter$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveLiteGiftPresenter.e9(this.a).a();
       a.o(obj, "logPackageProvider.liveStreamPackage");
       return obj;
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGiftPresenter$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return d.a();
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGiftPresenter$f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveLiteGiftPresenter.c9(this.a).C0().mPatternType;
    }
    public int d(){
       return 2;
    }
    public String m(){
       Object[] objArray = null;
       LiveLiteGiftPresenter obj = PatchProxy.apply(objArray, this, LiveLiteGiftPresenter$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.O;
       if (obj != null) {
          objArray = obj.M9();
       }
       return objArray;
    }
    public boolean v(){
       return true;
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGiftPresenter$f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGiftPresenter.e9(this.a).b4();
    }
}
