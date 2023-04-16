package com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveVoicePartyTheaterCommonConfig$TypeAdapter extends TypeAdapter	// class@001312
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       LiveVoicePartyTheaterCommonConfig$TypeAdapter.e = a.get(LiveVoicePartyTheaterCommonConfig.class);
    }
    public void LiveVoicePartyTheaterCommonConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig.class));
       TypeAdapter typeAdapter = p0.j(a.get(LiveVoicePartyTheaterCommonConfig$TheaterTab.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyTheaterCommonConfig$TypeAdapter.class, "2");
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
             obj = new LiveVoicePartyTheaterCommonConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb0dbada0:
                      if (str.equals("playAlignTolerantMillis")) {
                         i = 0;
                      }
                      break;
                    case 0xdc9f8cc3:
                      if (str.equals("theaterPlaySptsConfig")) {
                         i = 1;
                      }
                      break;
                    case 0xe907fc26:
                      if (str.equals("enableVoicePartyMovieChannelV2")) {
                         i = 2;
                      }
                      break;
                    case 0x38d7a03a:
                      if (str.equals("playAlignAdjustDurationMillis")) {
                         i = 3;
                      }
                      break;
                    case 0x3be32f2f:
                      if (str.equals("theaterTabs")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPlayAlignTolerantMillis = KnownTypeAdapters$n.a(p0, obj.mPlayAlignTolerantMillis);
                      break;
                    case 1:
                      obj.mTheaterPlaySptsConfig = this.b.read(p0);
                      break;
                    case 2:
                      obj.mEnableVoicePartyMovieChannelV2 = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyMovieChannelV2);
                      break;
                    case 3:
                      obj.mPlayAlignAdjustDuration = KnownTypeAdapters$n.a(p0, obj.mPlayAlignAdjustDuration);
                      break;
                    case 4:
                      obj.mTheaterTabs = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyTheaterCommonConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("playAlignTolerantMillis");
          p0.K(p1.mPlayAlignTolerantMillis);
          p0.r("playAlignAdjustDurationMillis");
          p0.K(p1.mPlayAlignAdjustDuration);
          if (p1.mTheaterPlaySptsConfig != null) {
             p0.r("theaterPlaySptsConfig");
             this.b.write(p0, p1.mTheaterPlaySptsConfig);
          }
          p0.r("enableVoicePartyMovieChannelV2");
          p0.P(p1.mEnableVoicePartyMovieChannelV2);
          if (p1.mTheaterTabs != null) {
             p0.r("theaterTabs");
             this.d.write(p0, p1.mTheaterTabs);
          }
          p0.j();
       }
       return;
    }
}
