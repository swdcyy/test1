package com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig;
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
import com.vimeo.stag.KnownTypeAdapters$m;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveChatFollowTipConfig$TypeAdapter extends TypeAdapter	// class@000a19
{
    public final Gson a;
    public static final a b;

    static {
       LiveChatFollowTipConfig$TypeAdapter.b = a.get(LiveChatFollowTipConfig.class);
    }
    public void LiveChatFollowTipConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveChatFollowTipConfig$TypeAdapter.class, "2");
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
             obj = new LiveChatFollowTipConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("audienceChatBubbleTipContent")) {
                   if (!str1.equals("audienceChatBubbleTipDelayTimeGaps")) {
                      p0.Q();
                   }else {
                      obj.mAudienceChatBubbleTipDelayTimeGaps = KnownTypeAdapters$m.a(p0);
                   }
                }else {
                   obj.mAudienceChatBubbleTipContent = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveChatFollowTipConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAudienceChatBubbleTipDelayTimeGaps != null) {
             p0.r("audienceChatBubbleTipDelayTimeGaps");
             KnownTypeAdapters$m.b(p0, p1.mAudienceChatBubbleTipDelayTimeGaps);
          }
          if (p1.mAudienceChatBubbleTipContent != null) {
             p0.r("audienceChatBubbleTipContent");
             TypeAdapters.A.write(p0, p1.mAudienceChatBubbleTipContent);
          }
          p0.j();
       }
       return;
    }
}
