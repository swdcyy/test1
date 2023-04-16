package com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveVoicePartyKtvCommonConfig$TypeAdapter extends TypeAdapter	// class@00130b
{
    public final Gson a;
    public static final a b;

    static {
       LiveVoicePartyKtvCommonConfig$TypeAdapter.b = a.get(LiveVoicePartyKtvCommonConfig.class);
    }
    public void LiveVoicePartyKtvCommonConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyKtvCommonConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveVoicePartyKtvCommonConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("authorNotice")) {
                   if (!str1.equals("audienceNotice")) {
                      p0.Q();
                   }else {
                      obj.mAudienceEmptyNoticeText = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mAnchorEmptyNoticeText = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvCommonConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAudienceEmptyNoticeText != null) {
             p0.r("audienceNotice");
             TypeAdapters.A.write(p0, p1.mAudienceEmptyNoticeText);
          }
          if (p1.mAnchorEmptyNoticeText != null) {
             p0.r("authorNotice");
             TypeAdapters.A.write(p0, p1.mAnchorEmptyNoticeText);
          }
          p0.j();
       }
       return;
    }
}
