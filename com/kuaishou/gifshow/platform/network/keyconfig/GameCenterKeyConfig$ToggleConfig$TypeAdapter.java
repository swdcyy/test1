package com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class GameCenterKeyConfig$ToggleConfig$TypeAdapter extends TypeAdapter	// class@000863
{
    public final Gson a;
    public static final a b;

    static {
       GameCenterKeyConfig$ToggleConfig$TypeAdapter.b = a.get(GameCenterKeyConfig$ToggleConfig.class);
    }
    public void GameCenterKeyConfig$ToggleConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GameCenterKeyConfig$ToggleConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new GameCenterKeyConfig$ToggleConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x82ef4616:
                      if (str.equals("autoDownloadNetChange")) {
                         i = 0;
                      }
                      break;
                    case 0x86121cc:
                      if (str.equals("backgroundInstallControlMi")) {
                         i = 1;
                      }
                      break;
                    case 0x194984f2:
                      if (str.equals("downloadConcurrencyControl")) {
                         i = 2;
                      }
                      break;
                    case 0x29c3b4ca:
                      if (str.equals("downloadUseDns")) {
                         i = 3;
                      }
                      break;
                    case 0x5093546d:
                      if (str.equals("autoDownloadColdBoot")) {
                         i = 4;
                      }
                      break;
                    case 0x749c596c:
                      if (str.equals("backgroundInstallControlEmui")) {
                         i = 5;
                      }
                      break;
                    case 0x74a0efd0:
                      if (str.equals("backgroundInstallControlOppo")) {
                         i = 6;
                      }
                      break;
                    case 0x74a404dc:
                      if (str.equals("backgroundInstallControlVivo")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAutoDownloadNetChange = KnownTypeAdapters$g.a(p0, obj.mAutoDownloadNetChange);
                      break;
                    case 1:
                      obj.mBgInstallCtrlMiui = KnownTypeAdapters$g.a(p0, obj.mBgInstallCtrlMiui);
                      break;
                    case 2:
                      obj.mDownloadConcurrencyControl = KnownTypeAdapters$g.a(p0, obj.mDownloadConcurrencyControl);
                      break;
                    case 3:
                      obj.mDownloadUseDns = KnownTypeAdapters$g.a(p0, obj.mDownloadUseDns);
                      break;
                    case 4:
                      obj.mAutoDownloadColdBoot = KnownTypeAdapters$g.a(p0, obj.mAutoDownloadColdBoot);
                      break;
                    case 5:
                      obj.mBgInstallCtrlEmui = KnownTypeAdapters$g.a(p0, obj.mBgInstallCtrlEmui);
                      break;
                    case 6:
                      obj.mBgInstallCtrlOppo = KnownTypeAdapters$g.a(p0, obj.mBgInstallCtrlOppo);
                      break;
                    case 7:
                      obj.mBgInstallCtrlVivo = KnownTypeAdapters$g.a(p0, obj.mBgInstallCtrlVivo);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameCenterKeyConfig$ToggleConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("autoDownloadColdBoot");
          p0.P(p1.mAutoDownloadColdBoot);
          p0.r("autoDownloadNetChange");
          p0.P(p1.mAutoDownloadNetChange);
          p0.r("downloadConcurrencyControl");
          p0.P(p1.mDownloadConcurrencyControl);
          p0.r("downloadUseDns");
          p0.P(p1.mDownloadUseDns);
          p0.r("backgroundInstallControlVivo");
          p0.P(p1.mBgInstallCtrlVivo);
          p0.r("backgroundInstallControlMi");
          p0.P(p1.mBgInstallCtrlMiui);
          p0.r("backgroundInstallControlOppo");
          p0.P(p1.mBgInstallCtrlOppo);
          p0.r("backgroundInstallControlEmui");
          p0.P(p1.mBgInstallCtrlEmui);
          p0.j();
       }
       return;
    }
}
