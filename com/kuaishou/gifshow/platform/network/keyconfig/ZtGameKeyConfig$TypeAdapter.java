package com.kuaishou.gifshow.platform.network.keyconfig.ZtGameKeyConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ZtGameKeyConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import na0.l;
import com.vimeo.stag.KnownTypeAdapters$f;
import java.util.Map;
import na0.k;
import com.google.gson.stream.b;
import na0.i;
import na0.j;

public final class ZtGameKeyConfig$TypeAdapter extends TypeAdapter	// class@00088b
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       ZtGameKeyConfig$TypeAdapter.c = a.get(ZtGameKeyConfig.class);
    }
    public void ZtGameKeyConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ZtGameKeyConfig$TypeAdapter.class, "2");
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
             obj = new ZtGameKeyConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8624024e:
                      if (str.equals("luaGameIds")) {
                         i = 0;
                      }
                      break;
                    case 0x885cd324:
                      if (str.equals("supportVipCommandGames")) {
                         i = 1;
                      }
                      break;
                    case 0x8d050c03:
                      if (str.equals("gameOfficialAccounts")) {
                         i = 2;
                      }
                      break;
                    case 0x9ddad893:
                      if (str.equals("messageCenterURL")) {
                         i = 3;
                      }
                      break;
                    case 0xba20d313:
                      if (str.equals("battleHistoryURL")) {
                         i = 4;
                      }
                      break;
                    case 0xbcdfa45a:
                      if (str.equals("openPerformanceReport")) {
                         i = 5;
                      }
                      break;
                    case 0xd434b54c:
                      if (str.equals("gameListAppId")) {
                         i = 6;
                      }
                      break;
                    case 0xf2142c10:
                      if (str.equals("defaultSpeakerStatus")) {
                         i = 7;
                      }
                      break;
                    case 0xf45e5a24:
                      if (str.equals("mainStackLaunchGameIds")) {
                         i = 8;
                      }
                      break;
                    case 0xf5dea359:
                      if (str.equals("searchGamePlaceholder")) {
                         i = 9;
                      }
                      break;
                    case 0x238e657e:
                      if (str.equals("defaultLinkMicStatus")) {
                         i = 10;
                      }
                      break;
                    case 0x590bb4aa:
                      if (str.equals("openExternalShare")) {
                         i = 11;
                      }
                      break;
                    case 0x5a62e05f:
                      if (str.equals("perfReportFrequency")) {
                         i = 12;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLuaGameIds = this.b.read(p0);
                      break;
                    case 1:
                      obj.supportVipCommandGames = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new k(this)).a(p0);
                      break;
                    case 2:
                      obj.mSoGameOfficeAccounts = this.b.read(p0);
                      break;
                    case 3:
                      obj.messageCenterURL = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.battleHistoryURL = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.openPerformanceReport = KnownTypeAdapters$g.a(p0, obj.openPerformanceReport);
                      break;
                    case 6:
                      obj.gameListAppId = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mDefaultSpeakerStatus = KnownTypeAdapters$g.a(p0, obj.mDefaultSpeakerStatus);
                      break;
                    case 8:
                      obj.mainStackLaunchGameIds = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new l(this)).a(p0);
                      break;
                    case 9:
                      obj.searchGamePlaceholder = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mDefalutLinkMicStatus = KnownTypeAdapters$g.a(p0, obj.mDefalutLinkMicStatus);
                      break;
                    case 11:
                      obj.openExternalShare = KnownTypeAdapters$g.a(p0, obj.openExternalShare);
                      break;
                    case 12:
                      obj.perfReportFrequency = KnownTypeAdapters$k.a(p0, obj.perfReportFrequency);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ZtGameKeyConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("defaultLinkMicStatus");
          p0.P(p1.mDefalutLinkMicStatus);
          p0.r("defaultSpeakerStatus");
          p0.P(p1.mDefaultSpeakerStatus);
          if (p1.battleHistoryURL != null) {
             p0.r("battleHistoryURL");
             TypeAdapters.A.write(p0, p1.battleHistoryURL);
          }
          if (p1.messageCenterURL != null) {
             p0.r("messageCenterURL");
             TypeAdapters.A.write(p0, p1.messageCenterURL);
          }
          if (p1.gameListAppId != null) {
             p0.r("gameListAppId");
             TypeAdapters.A.write(p0, p1.gameListAppId);
          }
          if (p1.searchGamePlaceholder != null) {
             p0.r("searchGamePlaceholder");
             TypeAdapters.A.write(p0, p1.searchGamePlaceholder);
          }
          p0.r("openPerformanceReport");
          p0.P(p1.openPerformanceReport);
          if (p1.mSoGameOfficeAccounts != null) {
             p0.r("gameOfficialAccounts");
             this.b.write(p0, p1.mSoGameOfficeAccounts);
          }
          if (p1.supportVipCommandGames != null) {
             p0.r("supportVipCommandGames");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new i(this)).b(p0, p1.supportVipCommandGames);
          }
          if (p1.mLuaGameIds != null) {
             p0.r("luaGameIds");
             this.b.write(p0, p1.mLuaGameIds);
          }
          p0.r("openExternalShare");
          p0.P(p1.openExternalShare);
          if (p1.mainStackLaunchGameIds != null) {
             p0.r("mainStackLaunchGameIds");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new j(this)).b(p0, p1.mainStackLaunchGameIds);
          }
          p0.r("perfReportFrequency");
          p0.K((long)p1.perfReportFrequency);
          p0.j();
       }
       return;
    }
}
