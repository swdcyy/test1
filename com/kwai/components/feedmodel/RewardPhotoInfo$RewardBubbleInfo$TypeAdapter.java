package com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class RewardPhotoInfo$RewardBubbleInfo$TypeAdapter extends TypeAdapter	// class@000c37
{
    public final Gson a;
    public static final a b;

    static {
       RewardPhotoInfo$RewardBubbleInfo$TypeAdapter.b = a.get(RewardPhotoInfo$RewardBubbleInfo.class);
    }
    public void RewardPhotoInfo$RewardBubbleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RewardPhotoInfo$RewardBubbleInfo$TypeAdapter.class, "2");
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
             obj = new RewardPhotoInfo$RewardBubbleInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("text")) {
                   if (!str1.equals("enableBubble")) {
                      p0.Q();
                   }else {
                      obj.mEnableBubble = KnownTypeAdapters$g.a(p0, obj.mEnableBubble);
                   }
                }else {
                   obj.mBubbleDes = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RewardPhotoInfo$RewardBubbleInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mBubbleDes != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mBubbleDes);
          }
          p0.r("enableBubble");
          p0.P(p1.mEnableBubble);
          p0.j();
       }
       return;
    }
}
